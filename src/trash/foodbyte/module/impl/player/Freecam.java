package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.FloatValue;

public class Freecam extends Module {
   private EntityOtherPlayerMP Field2739;
   public FloatValue Field2740 = new FloatValue("Freecam", "Speed", 1.0, 1.0, 10.0, 1.0, "移动速度");
   private double Field2741;
   private double Field2742;
   private double Field2743;
   private int Field2744 = 0;

   public Freecam() {
      super("Freecam", Category.PLAYER);
   }

   public String getDescription() {
      return "灵魂出窍(2022已修复hypixel狗ban)";
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.isRecieve() && (a.getPacket() instanceof S07PacketRespawn || a.getPacket() instanceof S02PacketLoginSuccess)) {
         this.setState(false);
      }

      if (!a.isRecieve()) {
         if (!(a.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook) && !(a.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition) && !(a.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook)) {
            if (a.getPacket() instanceof C03PacketPlayer) {
               C03PacketPlayer var2 = (C03PacketPlayer)a.getPacket();
               ++this.Field2744;
               if (this.Field2744 > 20) {
                  a.setCancelled(true);
                  Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(this.Field2739.posX, this.Field2739.posY, this.Field2739.posZ, this.Field2739.onGround));
                  this.Field2744 = 0;
               }
            } else if (a.getPacket() instanceof C0BPacketEntityAction) {
               C0BPacketEntityAction var3 = (C0BPacketEntityAction)a.getPacket();
               if (var3.getAction() == Action.START_SPRINTING || var3.getAction() == Action.STOP_SPRINTING) {
                  a.setCancelled(true);
               }
            }
         } else {
            a.setCancelled(true);
            Wrapper.INSTANCE.sendPacket(new C03PacketPlayer(this.Field2739.onGround));
         }

      }
   }

   @EventTarget
   public void Method274(EventMove a) {
      int var2 = Class148.Method1444();
      if (a.isLocalPlayer()) {
         this.Field2739.setSneaking(mc.thePlayer.isSneaking());
         mc.thePlayer.noClip = true;
         mc.thePlayer.onGround = this.Field2739.onGround;
         float var3 = this.Field2740.getFloatValue();
         if (mc.thePlayer.movementInput.jump) {
            a.setY(mc.thePlayer.motionY = (double)var3);
         }

         if (mc.thePlayer.movementInput.sneak) {
            a.setY(mc.thePlayer.motionY = (double)(-var3));
         }

         a.setY(mc.thePlayer.motionY = 0.0);
         var3 = (float)Math.max((double)var3, Method275());
         double var4 = (double)mc.thePlayer.movementInput.moveForward;
         double var6 = (double)mc.thePlayer.movementInput.moveStrafe;
         float var8 = mc.thePlayer.rotationYaw;
         if (var4 == 0.0 && var6 == 0.0) {
            a.setX(0.0);
            a.setZ(0.0);
         }

         if (var4 != 0.0) {
            if (var6 > 0.0) {
               var6 = 1.0;
               var8 += (float)(var4 > 0.0 ? -45 : 45);
            }

            if (var6 < 0.0) {
               var8 += (float)(var4 > 0.0 ? 45 : -45);
            }

            var6 = 0.0;
            if (var4 > 0.0) {
               var4 = 1.0;
            }

            var4 = -1.0;
         }

         a.setX(var4 * (double)var3 * Math.cos(Math.toRadians((double)(var8 + 90.0F))) + var6 * (double)var3 * Math.sin(Math.toRadians((double)(var8 + 90.0F))));
         a.setZ(var4 * (double)var3 * Math.sin(Math.toRadians((double)(var8 + 90.0F))) - var6 * (double)var3 * Math.cos(Math.toRadians((double)(var8 + 90.0F))));
      }

   }

   public static double Method275() {
      double var0 = 0.2873;
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var2 = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         var0 *= 1.0 + 0.2 * (double)(var2 + 1);
      }

      return var0;
   }

   public float Method276() {
      float var1 = mc.thePlayer.rotationYaw;
      float var2 = mc.thePlayer.moveForward;
      float var3 = mc.thePlayer.moveStrafing;
      var1 += (float)(var2 < 0.0F ? 180 : 0);
      if (var3 < 0.0F) {
         var1 += var2 < 0.0F ? -45.0F : (var2 == 0.0F ? 90.0F : 45.0F);
      }

      if (var3 > 0.0F) {
         var1 -= var2 < 0.0F ? -45.0F : (var2 == 0.0F ? 90.0F : 45.0F);
      }

      return var1 * 0.017453292F;
   }

   public void Method277(double a) {
      mc.thePlayer.motionX = (double)(-MathHelper.sin(this.Method276())) * a;
      mc.thePlayer.motionZ = (double)MathHelper.cos(this.Method276()) * a;
   }

   public void onEnable() {
      if (!this.Method1026()) {
         this.Field2739 = null;
         this.setState(false);
      } else if (this.Method1026()) {
         Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SPRINTING));
         this.Field2744 = 0;
         this.Field2739 = new EntityOtherPlayerMP(mc.theWorld, mc.thePlayer.getGameProfile());
         this.Field2739.clonePlayer(mc.thePlayer, true);
         this.Field2739.setLocationAndAngles(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ, mc.thePlayer.rotationYaw, mc.thePlayer.rotationPitch);
         this.Field2739.rotationYawHead = mc.thePlayer.rotationYawHead;
         this.Field2739.setEntityId(-1337);
         this.Field2739.setSneaking(mc.thePlayer.isSneaking());
         this.Field2739.onGround = mc.thePlayer.onGround;
         mc.theWorld.addEntityToWorld(this.Field2739.getEntityId(), this.Field2739);
         this.Field2741 = mc.thePlayer.posX;
         this.Field2742 = mc.thePlayer.posY;
         this.Field2743 = mc.thePlayer.posZ;
      }
   }

   public void onDisable() {
      if (this.Method1026()) {
         if (this.Field2739 != null) {
            this.Method277(0.0);
            mc.thePlayer.setLocationAndAngles(this.Field2739.posX, this.Field2739.posY, this.Field2739.posZ, this.Field2739.rotationYaw, this.Field2739.rotationPitch);
            mc.thePlayer.rotationYawHead = this.Field2739.rotationYawHead;
            mc.theWorld.removeEntityFromWorld(this.Field2739.getEntityId());
            mc.thePlayer.setSneaking(this.Field2739.isSneaking());
            this.Field2739 = null;
            mc.thePlayer.setPosition(this.Field2741, this.Field2742, this.Field2743);
            mc.thePlayer.capabilities.isFlying = false;
            mc.thePlayer.noClip = false;
            mc.theWorld.removeEntityFromWorld(-1);
            mc.renderGlobal.loadRenderers();
         }
      }
   }
}
