package trash.foodbyte.utils;

import java.security.SecureRandom;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockHopper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KeepSprint;
import trash.foodbyte.module.impl.movement.Sprint;
import trash.foodbyte.reflections.Wrapper;

public class MoveUtils {
   protected static final Minecraft mc;
   private static String[] trash;

   public static void selfDamage() {
      double var0 = 0.06239999830722809;
      EntityPlayerSP var2 = mc.thePlayer;
      double var3 = var2.posX;
      double var5 = var2.posY;
      double var7 = var2.posZ;

      for(int var9 = 0; (double)var9 < (double)getJumpHeight() / 0.06239999830722809 + 1.0; ++var9) {
         Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(var3, var5 + 0.06239999830722809, var7, false));
         Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(var3, var5 + 1.0E-4, var7, false));
      }

      Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(var3, var5, var7, true));
   }

   public static double getRandomDouble() {
      SecureRandom var0 = new SecureRandom();
      double var1 = var0.nextDouble() * (1.0 / (double)System.currentTimeMillis());

      for(int var3 = 0; var3 < MathUtils.getRandomInt3(MathUtils.getRandomInt3(4, 6), MathUtils.getRandomInt3(8, 20)); ++var3) {
         var1 *= 1.0 / (double)System.currentTimeMillis();
      }

      return var1;
   }

   public static float getRandomFloat() {
      SecureRandom var0 = new SecureRandom();
      float var1 = var0.nextFloat() * (1.0F / (float)System.currentTimeMillis());

      for(int var2 = 0; var2 < MathUtils.getRandomInt3(MathUtils.getRandomInt3(4, 6), MathUtils.getRandomInt3(8, 20)); ++var2) {
         var1 *= 1.0F / (float)System.currentTimeMillis();
      }

      return var1;
   }

   public static boolean shouldStopSprint() {
      return (mc.thePlayer.movementInput.moveForward >= 0.8F || ((Sprint)ModuleManager.getModule2(Sprint.class)).omni.getBooleanValue() && isMoving()) && !mc.thePlayer.isCollidedHorizontally && (mc.thePlayer.getFoodStats().getFoodLevel() > 6 || mc.thePlayer.capabilities.allowFlying) && !mc.thePlayer.isSneaking() && (!mc.thePlayer.isUsingItem() || ((KeepSprint)ModuleManager.getModule2(KeepSprint.class)).getState()) && !mc.thePlayer.isPotionActive(Potion.moveSlowdown.id);
   }

   public static boolean isMoving() {
      return mc.thePlayer.movementInput.moveForward != 0.0F || mc.thePlayer.movementInput.moveStrafe != 0.0F;
   }

   public static boolean isTouchingWall() {
      return mc.thePlayer.onGround && mc.thePlayer.isCollidedVertically;
   }

   public static boolean shouldStep() {
      return isMoving() && isTouchingWall();
   }

   public static boolean isReallyOnGround(double distance) {
      return !mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(0.0, -distance, 0.0)).isEmpty();
   }

   public static void sendPositionPacketWithXZOffset(double xzOffset, boolean onGround) {
      Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX + xzOffset, mc.thePlayer.posY, mc.thePlayer.posZ + xzOffset, onGround));
   }

   public static void sendPositionPacketWithYOffset(double yOffset, boolean onGround) {
      Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + yOffset, mc.thePlayer.posZ, onGround));
   }

   public static float getMovingYaw() {
      return getWarppedYaw(mc.thePlayer.rotationYaw);
   }

   public static float getWarppedYaw(float yaw) {
      float var1 = mc.thePlayer.moveForward;
      float var2 = mc.thePlayer.moveStrafing;
      boolean var3 = var1 > 0.0F;
      boolean var4 = var1 < 0.0F;
      boolean var5 = var2 > 0.0F;
      boolean var6 = var2 < 0.0F;
      float var7 = 0.0F;
      var7 += 180.0F;
      var7 += (float)-45;
      var7 += yaw;
      return MathHelper.wrapAngleTo180_float(var7);
   }

   public static double getDefaultSpeed() {
      return getDefaultSpeed(true);
   }

   public static double[] getWrappedSpeed(double offset) {
      return warp(mc.thePlayer.rotationYaw * MathUtils.round(0.017453292519943295), offset);
   }

   public static double[] warp(float x, double z) {
      return new double[]{(double)(-MathHelper.sin(x)) * z, (double)MathHelper.cos(x) * z};
   }

   public static double getDefaultSpeed(boolean meaningless) {
      if (!shouldStopSprint()) {
         ;
      }

      double var1 = 0.2873;
      if (mc.thePlayer != null && mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var3 = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         var1 *= 1.0 + 0.2 * (double)(var3 + 1);
      }

      return var1;
   }

   public static double getMoveSpeed() {
      double var0 = (double)Minecraft.getMinecraft().thePlayer.capabilities.getWalkSpeed() * 2.925;
      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSlowdown)) {
         var0 /= 1.0 + 0.15 * (double)(Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1);
      }

      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
         var0 *= 1.0 + 0.2 * (double)(Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1);
      }

      return var0;
   }

   public static void setHypottedSpeed() {
      setSpeed(hypot());
   }

   public static double hypot() {
      return Math.hypot(mc.thePlayer.motionX, mc.thePlayer.motionZ);
   }

   public static void setSpeed(double speed) {
      if (isMoving()) {
         double var2 = getMovingDirection();
         mc.thePlayer.motionX = (double)(-MathHelper.sin((float)var2)) * speed;
         mc.thePlayer.motionZ = (double)MathHelper.cos((float)var2) * speed;
      }
   }

   public static double getMovingDirection() {
      float var0 = mc.thePlayer.rotationYaw;
      if (mc.thePlayer.moveForward < 0.0F) {
         var0 += 180.0F;
      }

      float var1 = 1.0F;
      if (mc.thePlayer.moveForward < 0.0F) {
         var1 = -0.5F;
      } else if (mc.thePlayer.moveForward > 0.0F) {
         var1 = 0.5F;
      }

      if (mc.thePlayer.moveStrafing > 0.0F) {
         var0 -= 90.0F * var1;
      }

      if (mc.thePlayer.moveStrafing < 0.0F) {
         var0 += 90.0F * var1;
      }

      return Math.toRadians((double)var0);
   }

   public static float getMovingAngle() {
      float var0 = Minecraft.getMinecraft().thePlayer.rotationYaw;
      float var1 = Minecraft.getMinecraft().thePlayer.moveForward;
      float var2 = Minecraft.getMinecraft().thePlayer.moveStrafing;
      var0 += (float)(var1 < 0.0F ? 180 : 0);
      int var3 = var1 < 0.0F ? -45 : (var1 == 0.0F ? 90 : 45);
      if (var2 < 0.0F) {
         var0 += (float)var3;
      }

      if (var2 > 0.0F) {
         var0 -= (float)var3;
      }

      return var0 * 0.017453292F;
   }

   public static double getJumpEffect(double a) {
      if (mc.thePlayer.isPotionActive(Potion.jump)) {
         int var2 = mc.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier();
         return a + (double)((float)(var2 + 1) * 0.1F);
      } else {
         return a;
      }
   }

   public static float getJumpHeight() {
      PotionEffect var0 = mc.thePlayer.getActivePotionEffect(Potion.jump);
      int var1 = var0.getAmplifier() + 1;
      return (float)(mc.thePlayer.getMaxFallHeight() + var1);
   }

   public static void Method2486(double a, float a, float a, float a) {
      if (a != 0.0F || a != 0.0F) {
         boolean var5 = a < 0.0F;
         float var6 = 90.0F * (a > 0.0F ? 0.5F : -0.5F);
         a += 180.0F;
         if (a > 0.0F) {
            a -= var6;
         } else if (a < 0.0F) {
            a += var6;
         }

         double var7 = StrictMath.cos(StrictMath.toRadians((double)(a + 90.0F)));
         double var9 = StrictMath.cos(StrictMath.toRadians((double)a));
         mc.thePlayer.motionX = var7 * a;
         mc.thePlayer.motionZ = var9 * a;
      }
   }

   public static void setSpeed2(double speed) {
      float var2 = mc.thePlayer.rotationYaw;
      double var3 = (double)mc.thePlayer.moveForward;
      double var5 = (double)mc.thePlayer.moveStrafing;
      if (var3 == 0.0 && var5 == 0.0) {
         mc.thePlayer.motionX = 0.0;
         mc.thePlayer.motionZ = 0.0;
      } else {
         if (var3 != 0.0) {
            if (var5 > 0.0) {
               var2 += (float)(var3 > 0.0 ? -45 : 45);
            } else if (var5 < 0.0) {
               var2 += (float)(var3 > 0.0 ? 45 : -45);
            }

            var5 = 0.0;
            if (var3 > 0.0) {
               var3 = 1.0;
            } else if (var3 < 0.0) {
               var3 = -1.0;
            }
         }

         mc.thePlayer.motionX = var3 * speed * Math.cos(Math.toRadians((double)(var2 + 90.0F))) + var5 * speed * Math.sin(Math.toRadians((double)(var2 + 90.0F)));
         mc.thePlayer.motionZ = var3 * speed * Math.sin(Math.toRadians((double)(var2 + 90.0F))) - var5 * speed * Math.cos(Math.toRadians((double)(var2 + 90.0F)));
      }

   }

   public static double[] Method2488(double a) {
      double var2 = (double)mc.thePlayer.movementInput.moveForward;
      double var4 = (double)mc.thePlayer.movementInput.moveStrafe;
      float var6 = mc.thePlayer.rotationYaw;
      if (var2 == 0.0 && var4 == 0.0) {
         return new double[]{0.0, 0.0};
      } else {
         boolean var7 = var2 < 0.0;
         float var8 = 90.0F * (var2 > 0.0 ? 0.5F : -0.5F);
         var6 += 180.0F;
         if (var4 > 0.0) {
            var6 -= var8;
         } else if (var4 < 0.0) {
            var6 += var8;
         }

         double var9 = Math.cos(StrictMath.toRadians((double)(var6 + 90.0F)));
         double var11 = Math.cos(StrictMath.toRadians((double)var6));
         return new double[]{var9 * a, var11 * a};
      }
   }

   public static boolean Method2489() {
      trash();
      int var1 = MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().minX);
      if (var1 < MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().maxX) + 1) {
         int var2 = MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().minY);
         if (var2 < MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().maxY) + 1) {
            int var3 = MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().minZ);
            if (var3 < MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().maxZ) + 1) {
               Block var4 = mc.theWorld.getBlockState(new BlockPos(var1, var2, var3)).getBlock();
               if (!(var4 instanceof BlockAir)) {
                  AxisAlignedBB var5 = var4.getCollisionBoundingBox(mc.theWorld, new BlockPos(var1, var2, var3), mc.theWorld.getBlockState(new BlockPos(var1, var2, var3)));
                  if (var4 instanceof BlockHopper) {
                     var5 = new AxisAlignedBB((double)var1, (double)var2, (double)var3, (double)(var1 + 1), (double)(var2 + 1), (double)(var3 + 1));
                  }

                  if (mc.thePlayer.getEntityBoundingBox().intersectsWith(var5)) {
                     return true;
                  }
               }

               ++var3;
            }

            ++var2;
         }

         ++var1;
      }

      return false;
   }

   static {
      String[] var10000 = new String[2];
      mc = Minecraft.getMinecraft();
      trash(var10000);
   }

   public static void trash(String[] trash) {
      trash = trash;
   }

   public static String[] trash() {
      return trash;
   }
}
