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
      a[] a = Class448.trash();
      if (a.isPre()) {
         if (this.Field2313.getBooleanValue()) {
            this.Field2315 = mc.thePlayer.rotationPitch;
            this.Field2316 = mc.thePlayer.rotationYaw;
         }

         double a = Double.NEGATIVE_INFINITY;
         this.Field2319 = null;
         Iterator var5 = mc.theWorld.playerEntities.Method1383();
         Object a;
         EntityPlayer a;
         if (var5.Method932()) {
            a = var5.Method933();
            a = (EntityPlayer)a;
            if (!a.equals(mc.thePlayer) && !Class305.Method698(a.getName()) && a.ticksExisted >= 40 && !a.isInvisible() && mc.thePlayer.canEntityBeSeen(a) && !Class305.Method704(a) && this.Method817(a, this.Field2308.getFloatValue())) {
               if (this.Field2319 == null) {
                  this.Field2319 = a;
                  a = this.Method1667(a);
               }

               if (this.Method1667(a) <= a) {
                  ;
               }

               this.Field2319 = a;
               this.Method1667(a);
            }
         }

         var5 = this.Field2321.keySet().Method1383();
         if (var5.Method932()) {
            EntityPlayer a = (EntityPlayer)var5.Method933();
            if (!mc.theWorld.playerEntities.contains(a)) {
               this.Field2321.remove(a);
            }
         }

         var5 = mc.theWorld.playerEntities.Method1383();
         if (var5.Method932()) {
            a = var5.Method933();
            a = (EntityPlayer)a;
            this.Field2321.putIfAbsent(a, new ArrayList());
            List a = (List)this.Field2321.Method2665(a);
            a.Method2530(new Vec3(a.posX, a.posY, a.posZ));
            if (a.Method1799() > this.Field2320) {
               int a = 0;
               Iterator var10 = (new ArrayList(a)).Method1383();
               if (var10.Method932()) {
                  Vec3 a = (Vec3)var10.Method933();
                  if (a < a.Method1799() - this.Field2320) {
                     a.remove(a.get(a));
                  }

                  ++a;
               }
            }
         }

         if (this.Field2319 != null) {
            if (this.Field2312.getBooleanValue() && this.Field2317 >= 30) {
               this.Field2317 = 0;
            }

            ++this.Field2318;
            Entity a = this.Method1668(this.Field2319);
            float a = 0.0F;
            if (this.Field2306.isCurrentMode("Head")) {
               a = -0.2F;
            }

            if (this.Field2306.isCurrentMode("Neck")) {
               a = 0.1F;
            }

            if (this.Field2306.isCurrentMode("Chest")) {
               a = 0.4F;
            }

            if (this.Field2306.isCurrentMode("Jimmies")) {
               a = 0.85F;
            }

            if (this.Field2306.isCurrentMode("Legs")) {
               a = 1.0F;
            }

            if (this.Field2306.isCurrentMode("Feet")) {
               a = 1.5F;
            }

            label110: {
               float[] a = this.Method1670(mc.thePlayer, a.posX, a.posY + (double)this.Field2319.getEyeHeight() - (double)a, a.posZ);
               if (this.Field2312.getBooleanValue()) {
                  mc.thePlayer.rotationYaw = a[0];
                  mc.thePlayer.rotationPitch = a[1] + this.Field2310.getFloatValue() * (float)this.Field2317;
                  if (this.Field2317 >= 10) {
                     mc.thePlayer.rotationYaw = a[0] - this.Field2309.getFloatValue() * (float)this.Field2317;
                  }

                  if (this.Field2317 < 20) {
                     break label110;
                  }

                  mc.thePlayer.rotationYaw = a[0] + this.Field2309.getFloatValue() * (float)this.Field2317;
               }

               mc.thePlayer.rotationYaw = a[0];
               mc.thePlayer.rotationPitch = a[1];
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
      double a = (double)(-mc.thePlayer.getDistanceToEntity(a));
      if (a.lastTickPosX == a.posX && a.lastTickPosY == a.posY && a.lastTickPosZ == a.posZ) {
         a += 200.0;
      }

      a -= (double)(a.getDistanceToEntity(mc.thePlayer) / 5.0F);
      return a;
   }

   private Entity Method1668(EntityPlayer a) {
      int a = (int)Math.ceil((double)mc.getNetHandler().getPlayerInfo(mc.thePlayer.getUniqueID()).getResponseTime() / 50.0);
      return this.Method1669(a, a);
   }

   public Entity Method1669(EntityPlayer a, int a) {
      if (this.Field2321.containsKey(a)) {
         List a = (List)this.Field2321.Method2665(a);
         if (a.Method1799() > 1) {
            Vec3 a = (Vec3)a.get(0);
            List a = new ArrayList();
            Vec3 a = a;

            Vec3 a;
            for(Iterator var7 = a.Method1383(); var7.Method932(); a = a) {
               a = (Vec3)var7.Method933();
               a.Method2530(new Vec3(a.xCoord - a.xCoord, a.yCoord - a.yCoord, a.zCoord - a.zCoord));
            }

            double a = 0.0;
            double a = 0.0;
            double a = 0.0;

            Vec3 a;
            for(Iterator var13 = a.Method1383(); var13.Method932(); a += a.zCoord) {
               a = (Vec3)var13.Method933();
               a += a.xCoord;
               a += a.yCoord;
            }

            a /= (double)a.Method1799();
            a /= (double)a.Method1799();
            a /= (double)a.Method1799();
            EntityPlayer a = new EntityOtherPlayerMP(mc.theWorld, a.getGameProfile());
            a.noClip = false;
            a.setPosition(a.posX, a.posY, a.posZ);

            for(int a = 0; a < a; ++a) {
               a.moveEntity(a, a, a);
            }

            return a;
         }
      }

      return a;
   }

   private final float[] Method1670(Entity a, double a, double a, double a) {
      double a = a - a.posX;
      double a = a - a.posY - (double)a.getEyeHeight() - 0.1;
      double a = a - a.posZ;
      double a;
      if (a < 0.0 && a < 0.0) {
         a = 90.0 + Math.toDegrees(Math.atan(a / a));
      } else if (a < 0.0 && a > 0.0) {
         a = -90.0 + Math.toDegrees(Math.atan(a / a));
      } else {
         a = Math.toDegrees(-Math.atan(a / a));
      }

      double a = Math.sqrt(a * a + a * a);
      double a = -Math.toDegrees(Math.atan(a / a));
      a = (double)Method1671((float)a);
      a = (double)Method1671((float)a);
      return new float[]{(float)a, (float)a};
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
      double a = (((double)mc.thePlayer.rotationYaw - this.Method818(a)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
      return a > 0.0 && a < (double)a || (double)(-a) < a && a < 0.0;
   }

   public double[] Method818(EntityLivingBase a) {
      double a = a.posX - mc.thePlayer.posX;
      double a = a.posY - mc.thePlayer.posY;
      double a = a.posZ - mc.thePlayer.posZ;
      a /= (double)mc.thePlayer.getDistanceToEntity(a);
      double a = -(Math.atan2(a, a) * 57.29577951308232);
      double a = -(Math.asin(a) * 57.29577951308232);
      return new double[]{a, a};
   }
}
