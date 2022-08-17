package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AntiKB extends Module {
   public boolean flag;
   public ModeValue mode = new ModeValue("AntiKB", "Legit Mode", "Packet", new String[]{"PlayerTick", "Tick", "Hurt", "AB", "Move", "Packet"}, "自测");
   public FloatValue horizontal = new FloatValue("AntiKB", "Horizontal", 100.0, 0.0, 100.0, 1.0, "XZ轴击退");
   public FloatValue vertical;
   public FloatValue chance;
   public FloatValue explodeXZ;
   public FloatValue explodeY;
   public BooleanValue waterCheck;
   public BooleanValue fireCheck;
   public BooleanValue poisonCheck;
   public BooleanValue guiCheck;
   public BooleanValue fight;

   public AntiKB() {
      super("AntiKB", "Anti KB", Category.COMBAT);
      b.trash();
      this.vertical = new FloatValue("AntiKB", "Vertical", 90.0, 0.0, 100.0, 1.0, "Y轴击退");
      this.chance = new FloatValue("AntiKB", "Chance", 100.0, 0.0, 100.0, 1.0, "触发几率");
      this.explodeXZ = new FloatValue("AntiKB", "Explode XZ", 0.0, 0.0, 100.0, 1.0, "增加爆炸XZ轴击退");
      this.explodeY = new FloatValue("AntiKB", "Explode Y", 0.0, 0.0, 100.0, 1.0, "增加爆炸Y轴击退");
      this.waterCheck = new BooleanValue("AntiKB", "WaterCheck", true, "水检测");
      this.fireCheck = new BooleanValue("AntiKB", "FireCheck", true, "火焰检测");
      this.poisonCheck = new BooleanValue("AntiKB", "PoisonCheck", true, "中毒药水检测");
      this.guiCheck = new BooleanValue("AntiKB", "GuiCheck", true, "界面检测");
      this.fight = new BooleanValue("AntiKB", "Fight", false, "只有打架时才有效");
      if (a.trash() == null) {
         b.trash(new a[5]);
      }

   }

   public String getDescription() {
      return "反击退";
   }

   public float getVertical() {
      float var1 = (double)this.vertical.getFloatValue() == 100.0 && (double)this.vertical.getFloatValue() == 0.0 ? 0.0F : this.randomFloat() / 1000.0F;
      return this.vertical.getFloatValue() + var1;
   }

   public float getHorizontal() {
      float var1 = (double)this.horizontal.getFloatValue() == 100.0 && (double)this.horizontal.getFloatValue() == 0.0 ? 0.0F : this.randomFloat() / 1000.0F;
      return this.horizontal.getFloatValue() + var1;
   }

   public float randomFloat() {
      return (float)ThreadLocalRandom.current().nextInt(100);
   }

   public float getChance() {
      return this.chance.getFloatValue();
   }

   public boolean isUnderVoid() {
      return mc.thePlayer.posY < 0.0;
   }

   @EventTarget
   public void onUpdate(EventUpdate e) {
      this.setDisplayTag(this.mode.getMode());
   }

   @EventTarget
   public void onEntityTick(EventEntityTick event) {
      if (event.getEntity().equals(mc.thePlayer) && this.mode.isCurrentMode("PlayerTick")) {
         this.processVelocity();
      }

   }

   @EventTarget
   public void onTickUpdate(EventTickUpdate e) {
      if (this.mode.isCurrentMode("Tick")) {
         this.processVelocity();
      }

   }

   @EventTarget
   public void onRender(EventRender3D e) {
      if (this.mode.isCurrentMode("AB")) {
         this.processVelocity();
      }

   }

   @EventTarget
   public void onUpdate2(EventUpdate e) {
      if (this.mode.isCurrentMode("Hurt")) {
         this.processVelocity();
      }

   }

   @EventTarget
   public void onMove(EventMove e) {
      if (e.isLocalPlayer() && this.mode.isCurrentMode("Move")) {
         this.processVelocity();
      }

   }

   @EventTarget
   public void onPacket(EventPacket e) {
      a[] var2 = b.trash();
      if (!e.isSend()) {
         if (!((Velocity)ModuleManager.getModule2(Velocity.class)).getState()) {
            if (this.mode.isCurrentMode("Packet")) {
               if (e.getPacket() instanceof S12PacketEntityVelocity) {
                  S12PacketEntityVelocity var3 = (S12PacketEntityVelocity)e.getPacket();
                  if (var3.getEntityID() == mc.thePlayer.getEntityId()) {
                     double var4 = (double)var3.getMotionX() / 8000.0;
                     double var6 = (double)var3.getMotionY() / 8000.0;
                     double var8 = (double)var3.getMotionZ() / 8000.0;
                     ChatUtils.debug("§6S12 KB " + EnumChatFormatting.GRAY + ": §fX §e" + var4 + " §fY §e" + var6 + " §fZ §e" + var8);
                     int var10;
                     int var11;
                     int var12;
                     if (this.flag && !mc.thePlayer.isSwingInProgress) {
                        var10 = (int)((double)var3.getMotionX() * (1.0 + (double)this.explodeXZ.getFloatValue() / 100.0));
                        var11 = (int)((double)var3.getMotionY() * (1.0 + (double)this.explodeY.getFloatValue() / 100.0));
                        var12 = (int)((double)var3.getMotionZ() * (1.0 + (double)this.explodeXZ.getFloatValue() / 100.0));
                        ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionX.getObfuscatedName(), var10, false);
                        ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionY.getObfuscatedName(), var11, false);
                        ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionZ.getObfuscatedName(), var12, false);
                     }

                     var10 = (new Random()).nextInt(100);
                     if ((double)var10 > 100.0 - (double)this.chance.getFloatValue() && this.canNoKB()) {
                        var11 = (int)((float)var3.getMotionX() * (this.getHorizontal() / 100.0F));
                        var12 = (int)((float)var3.getMotionY() * (this.getVertical() / 100.0F));
                        int var13 = (int)((float)var3.getMotionZ() * (this.getHorizontal() / 100.0F));
                        ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionX.getObfuscatedName(), var11, false);
                        ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionY.getObfuscatedName(), var12, false);
                        ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionZ.getObfuscatedName(), var13, false);
                     }
                  }

                  this.flag = false;
               }

               if (e.getPacket() instanceof S27PacketExplosion) {
                  S27PacketExplosion var14 = (S27PacketExplosion)e.getPacket();
                  ChatUtils.debug("§aS27 KB " + EnumChatFormatting.GRAY + ": §fX §e" + var14.func_149149_c() + " §fY §e" + var14.func_149144_d() + " §fZ §e" + var14.func_149147_e());
                  int var15 = (new Random()).nextInt(100);
                  float var5;
                  float var7;
                  float var16;
                  if ((double)var15 > 100.0 - (double)this.chance.getFloatValue() && this.canNoKB()) {
                     var5 = var14.func_149149_c() * (this.getHorizontal() / 100.0F);
                     var16 = var14.func_149144_d() * (this.getVertical() / 100.0F);
                     var7 = var14.func_149147_e() * (this.getHorizontal() / 100.0F);
                     ReflectionsHelper.setFinalField(var14, ObfuscatedField.S27MotionX.getObfuscatedName(), var5, false);
                     ReflectionsHelper.setFinalField(var14, ObfuscatedField.S27MotionY.getObfuscatedName(), var16, false);
                     ReflectionsHelper.setFinalField(var14, ObfuscatedField.S27MotionZ.getObfuscatedName(), var7, false);
                  }

                  var5 = var14.func_149149_c() * (1.0F + this.explodeXZ.getFloatValue() / 100.0F);
                  var16 = var14.func_149144_d() * (1.0F + this.explodeY.getFloatValue() / 100.0F);
                  var7 = var14.func_149147_e() * (1.0F + this.explodeXZ.getFloatValue() / 100.0F);
                  ReflectionsHelper.setFinalField(var14, ObfuscatedField.S27MotionX.getObfuscatedName(), var5, false);
                  ReflectionsHelper.setFinalField(var14, ObfuscatedField.S27MotionY.getObfuscatedName(), var16, false);
                  ReflectionsHelper.setFinalField(var14, ObfuscatedField.S27MotionZ.getObfuscatedName(), var7, false);
                  if (var14.func_149149_c() != 0.0F && var14.func_149144_d() != 0.0F && var14.func_149147_e() != 0.0F) {
                     this.flag = true;
                  }
               }
            }

         }
      }
   }

   public void setVelocity(double x, double y, double z) {
      Random var8 = new Random();
      b.trash();
      int var9 = var8.nextInt(100);
      if ((double)var9 > 100.0 - (double)this.chance.getFloatValue() && this.canNoKB()) {
         double var10 = x * ((double)this.getHorizontal() / 100.0);
         double var12 = y * ((double)this.getVertical() / 100.0);
         double var14 = z * ((double)this.getHorizontal() / 100.0);
         mc.thePlayer.setVelocity(var10, var12, var14);
      }

      mc.thePlayer.setVelocity(x, y, z);
   }

   public boolean canNoKB() {
      if (ModuleManager.getModule(Velocity.class).getState()) {
         return false;
      } else if (!this.waterCheck.getBooleanValue() || !mc.thePlayer.isInWater() && !PlayerUtils.iJustWannaReturnAFalse()) {
         if (this.guiCheck.getBooleanValue() && mc.currentScreen != null) {
            return false;
         } else if (this.fireCheck.getBooleanValue() && mc.thePlayer.canRenderOnFire() && !mc.thePlayer.isPotionActive(Potion.fireResistance)) {
            return false;
         } else if (this.poisonCheck.getBooleanValue() && mc.thePlayer.isPotionActive(Potion.poison)) {
            return false;
         } else if (this.fight.getBooleanValue() && !mc.thePlayer.isSwingInProgress) {
            return false;
         } else {
            return mc.thePlayer != null && mc.theWorld != null && !this.isUnderVoid();
         }
      } else {
         return false;
      }
   }

   public void processVelocity() {
      Random var1 = new Random();
      int var2 = var1.nextInt(100);
      if (mc.thePlayer.hurtTime == mc.thePlayer.maxHurtTime && mc.thePlayer.maxHurtTime > 0 && (double)var2 > 100.0 - (double)this.chance.getFloatValue() && this.canNoKB()) {
         EntityPlayerSP var10000 = mc.thePlayer;
         var10000.motionX *= (double)this.getHorizontal() / 100.0;
         if (this.getVertical() != 100.0F) {
            var10000 = mc.thePlayer;
            var10000.motionY *= (double)this.getVertical() / 100.0;
         }

         var10000 = mc.thePlayer;
         var10000.motionZ *= (double)this.getHorizontal() / 100.0;
      }

   }
}
