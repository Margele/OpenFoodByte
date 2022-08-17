package trash.foodbyte.module.impl.world;

import awsl.Class305;
import awsl.Class448;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
import net.minecraft.util.Vec3;
import obfuscate.a;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class CopsCrims extends Module {
   public ModeValue Field2306 = new ModeValue("CopsCrims", "Aim Mode", "Head", new String[]{"Head", "Neck", "Chest", "Jimmies", "Legs", "Feet"}, "瞄准部位{头、颈、胸、JJ、腿、脚}");
   public FloatValue Field2307 = new FloatValue("CopsCrims", "Delay", 7.0, 0.0, 35.0, 1.0, "延迟");
   public FloatValue Field2308 = new FloatValue("CopsCrims", "Fov", 360.0, 1.0, 360.0, 1.0, "瞄准视角");
   public FloatValue Field2309 = new FloatValue("CopsCrims", "HRecoil", 0.1, 0.1, 2.0, 0.1, "控制后坐力水平瞄准左右移动");
   public FloatValue Field2310 = new FloatValue("CopsCrims", "VRecoil", 0.5, 0.1, 2.0, 0.1, "控制后坐力水平瞄准上下移动");
   public BooleanValue Field2311 = new BooleanValue("CopsCrims", "No Spread", true, "不扩散");
   public BooleanValue Field2312 = new BooleanValue("CopsCrims", "Rcs", false, "后坐力控制系统");
   public BooleanValue Field2313 = new BooleanValue("CopsCrims", "Silent", true, "");
   public BooleanValue Field2314 = new BooleanValue("CopsCrims", "Auto Shoot", true, "自动射击");
   private float Field2315;
   private float Field2316;
   public int Field2317;
   public int Field2318;
   private EntityPlayer Field2319;
   public int Field2320 = 10;
   private Map Field2321 = new HashMap();

   public CopsCrims() {
      super("CopsCrims", "Cops Crims", Category.WORLD);
   }

   public String getDescription() {
      return "警察与劫匪小游戏自瞄";
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.isRecieve() && this.Field2312.getBooleanValue() && a.getPacket() instanceof C08PacketPlayerBlockPlacement) {
         ++this.Field2317;
      }

   }

   @EventTarget
   private void Method712(EventMotion a) {
      a[] var2 = Class448.trash();
      if (a.isPre()) {
         if (this.Field2313.getBooleanValue()) {
            this.Field2315 = mc.thePlayer.rotationPitch;
            this.Field2316 = mc.thePlayer.rotationYaw;
         }

         double var3 = Double.NEGATIVE_INFINITY;
         this.Field2319 = null;
         Iterator var5 = mc.theWorld.playerEntities.Method1383();
         Object var6;
         EntityPlayer var7;
         if (var5.Method932()) {
            var6 = var5.Method933();
            var7 = (EntityPlayer)var6;
            if (!var7.equals(mc.thePlayer) && !Class305.Method698(var7.getName()) && var7.ticksExisted >= 40 && !var7.isInvisible() && mc.thePlayer.canEntityBeSeen(var7) && !Class305.Method704(var7) && this.Method817(var7, this.Field2308.getFloatValue())) {
               if (this.Field2319 == null) {
                  this.Field2319 = var7;
                  var3 = this.Method1667(var7);
               }

               if (this.Method1667(var7) <= var3) {
                  ;
               }

               this.Field2319 = var7;
               this.Method1667(var7);
            }
         }

         var5 = this.Field2321.keySet().Method1383();
         if (var5.Method932()) {
            EntityPlayer var13 = (EntityPlayer)var5.Method933();
            if (!mc.theWorld.playerEntities.contains(var13)) {
               this.Field2321.remove(var13);
            }
         }

         var5 = mc.theWorld.playerEntities.Method1383();
         if (var5.Method932()) {
            var6 = var5.Method933();
            var7 = (EntityPlayer)var6;
            this.Field2321.putIfAbsent(var7, new ArrayList());
            List var8 = (List)this.Field2321.Method2665(var7);
            var8.Method2530(new Vec3(var7.posX, var7.posY, var7.posZ));
            if (var8.Method1799() > this.Field2320) {
               int var9 = 0;
               Iterator var10 = (new ArrayList(var8)).Method1383();
               if (var10.Method932()) {
                  Vec3 var11 = (Vec3)var10.Method933();
                  if (var9 < var8.Method1799() - this.Field2320) {
                     var8.remove(var8.get(var9));
                  }

                  ++var9;
               }
            }
         }

         if (this.Field2319 != null) {
            if (this.Field2312.getBooleanValue() && this.Field2317 >= 30) {
               this.Field2317 = 0;
            }

            ++this.Field2318;
            Entity var12 = this.Method1668(this.Field2319);
            float var14 = 0.0F;
            if (this.Field2306.isCurrentMode("Head")) {
               var14 = -0.2F;
            }

            if (this.Field2306.isCurrentMode("Neck")) {
               var14 = 0.1F;
            }

            if (this.Field2306.isCurrentMode("Chest")) {
               var14 = 0.4F;
            }

            if (this.Field2306.isCurrentMode("Jimmies")) {
               var14 = 0.85F;
            }

            if (this.Field2306.isCurrentMode("Legs")) {
               var14 = 1.0F;
            }

            if (this.Field2306.isCurrentMode("Feet")) {
               var14 = 1.5F;
            }

            label110: {
               float[] var15 = this.Method1670(mc.thePlayer, var12.posX, var12.posY + (double)this.Field2319.getEyeHeight() - (double)var14, var12.posZ);
               if (this.Field2312.getBooleanValue()) {
                  mc.thePlayer.rotationYaw = var15[0];
                  mc.thePlayer.rotationPitch = var15[1] + this.Field2310.getFloatValue() * (float)this.Field2317;
                  if (this.Field2317 >= 10) {
                     mc.thePlayer.rotationYaw = var15[0] - this.Field2309.getFloatValue() * (float)this.Field2317;
                  }

                  if (this.Field2317 < 20) {
                     break label110;
                  }

                  mc.thePlayer.rotationYaw = var15[0] + this.Field2309.getFloatValue() * (float)this.Field2317;
               }

               mc.thePlayer.rotationYaw = var15[0];
               mc.thePlayer.rotationPitch = var15[1];
            }

            if ((float)this.Field2318 >= this.Field2307.getFloatValue()) {
               if (this.Field2311.getBooleanValue()) {
                  Wrapper.INSTANCE.sendPacket(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SNEAKING));
               }

               if (this.Field2314.getBooleanValue() && mc.thePlayer.inventory.getCurrentItem() != null) {
                  mc.playerController.sendUseItem(mc.thePlayer, mc.theWorld, mc.thePlayer.inventory.getCurrentItem());
               }

               if (this.Field2311.getBooleanValue()) {
                  Wrapper.INSTANCE.sendPacket(new C0BPacketEntityAction(mc.thePlayer, Action.START_SNEAKING));
               }

               this.Field2318 = 0;
            }
         } else {
            --this.Field2317;
            if (this.Field2317 <= 0) {
               this.Field2317 = 0;
            }
         }
      }

      mc.thePlayer.rotationPitch = this.Field2315;
      mc.thePlayer.rotationYaw = this.Field2316;
   }

   public double Method1667(EntityPlayer a) {
      double var2 = (double)(-mc.thePlayer.getDistanceToEntity(a));
      if (a.lastTickPosX == a.posX && a.lastTickPosY == a.posY && a.lastTickPosZ == a.posZ) {
         var2 += 200.0;
      }

      var2 -= (double)(a.getDistanceToEntity(mc.thePlayer) / 5.0F);
      return var2;
   }

   private Entity Method1668(EntityPlayer a) {
      int var2 = (int)Math.ceil((double)mc.getNetHandler().getPlayerInfo(mc.thePlayer.getUniqueID()).getResponseTime() / 50.0);
      return this.Method1669(a, var2);
   }

   public Entity Method1669(EntityPlayer a, int a) {
      if (this.Field2321.containsKey(a)) {
         List var3 = (List)this.Field2321.Method2665(a);
         if (var3.Method1799() > 1) {
            Vec3 var4 = (Vec3)var3.get(0);
            ArrayList var5 = new ArrayList();
            Vec3 var6 = var4;

            Vec3 var8;
            for(Iterator var7 = var3.Method1383(); var7.Method932(); var6 = var8) {
               var8 = (Vec3)var7.Method933();
               var5.Method2530(new Vec3(var8.xCoord - var6.xCoord, var8.yCoord - var6.yCoord, var8.zCoord - var6.zCoord));
            }

            double var15 = 0.0;
            double var9 = 0.0;
            double var11 = 0.0;

            Vec3 var14;
            for(Iterator var13 = var5.Method1383(); var13.Method932(); var11 += var14.zCoord) {
               var14 = (Vec3)var13.Method933();
               var15 += var14.xCoord;
               var9 += var14.yCoord;
            }

            var15 /= (double)var5.Method1799();
            var9 /= (double)var5.Method1799();
            var11 /= (double)var5.Method1799();
            EntityOtherPlayerMP var16 = new EntityOtherPlayerMP(mc.theWorld, a.getGameProfile());
            var16.noClip = false;
            var16.setPosition(a.posX, a.posY, a.posZ);

            for(int var17 = 0; var17 < a; ++var17) {
               var16.moveEntity(var15, var9, var11);
            }

            return var16;
         }
      }

      return a;
   }

   private final float[] Method1670(Entity a, double a, double a, double a) {
      double var8 = a - a.posX;
      double var10 = a - a.posY - (double)a.getEyeHeight() - 0.1;
      double var12 = a - a.posZ;
      double var14;
      if (var12 < 0.0 && var8 < 0.0) {
         var14 = 90.0 + Math.toDegrees(Math.atan(var12 / var8));
      } else if (var12 < 0.0 && var8 > 0.0) {
         var14 = -90.0 + Math.toDegrees(Math.atan(var12 / var8));
      } else {
         var14 = Math.toDegrees(-Math.atan(var8 / var12));
      }

      double var16 = Math.sqrt(var8 * var8 + var12 * var12);
      double var18 = -Math.toDegrees(Math.atan(var10 / var16));
      var14 = (double)Method1671((float)var14);
      var18 = (double)Method1671((float)var18);
      return new float[]{(float)var14, (float)var18};
   }

   private static float Method1671(float a) {
      for(a %= 360.0F; a >= 180.0F; a -= 360.0F) {
      }

      while(a < -180.0F) {
         a += 360.0F;
      }

      return a;
   }

   public boolean Method817(EntityLivingBase a, float a) {
      a = (float)((double)a * 0.5);
      double var3 = (((double)mc.thePlayer.rotationYaw - this.Method818(a)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
      return var3 > 0.0 && var3 < (double)a || (double)(-a) < var3 && var3 < 0.0;
   }

   public double[] Method818(EntityLivingBase a) {
      double var2 = a.posX - mc.thePlayer.posX;
      double var4 = a.posY - mc.thePlayer.posY;
      double var6 = a.posZ - mc.thePlayer.posZ;
      var4 /= (double)mc.thePlayer.getDistanceToEntity(a);
      double var8 = -(Math.atan2(var2, var6) * 57.29577951308232);
      double var10 = -(Math.asin(var4) * 57.29577951308232);
      return new double[]{var8, var10};
   }
}
