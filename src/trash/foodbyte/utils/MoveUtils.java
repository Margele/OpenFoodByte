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
      double a = 0.06239999830722809;
      EntityPlayerSP a = mc.thePlayer;
      double a = a.posX;
      double a = a.posY;
      double a = a.posZ;

      for(int a = 0; (double)a < (double)getJumpHeight() / 0.06239999830722809 + 1.0; ++a) {
         Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a, a + 0.06239999830722809, a, false));
         Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a, a + 1.0E-4, a, false));
      }

      Wrapper.INSTANCE.sendPacketNoEvent(new C03PacketPlayer.C04PacketPlayerPosition(a, a, a, true));
   }

   public static double getRandomDouble() {
      SecureRandom a = new SecureRandom();
      double a = a.nextDouble() * (1.0 / (double)System.currentTimeMillis());

      for(int a = 0; a < MathUtils.getRandomInt3(MathUtils.getRandomInt3(4, 6), MathUtils.getRandomInt3(8, 20)); ++a) {
         a *= 1.0 / (double)System.currentTimeMillis();
      }

      return a;
   }

   public static float getRandomFloat() {
      SecureRandom a = new SecureRandom();
      float a = a.nextFloat() * (1.0F / (float)System.currentTimeMillis());

      for(int a = 0; a < MathUtils.getRandomInt3(MathUtils.getRandomInt3(4, 6), MathUtils.getRandomInt3(8, 20)); ++a) {
         a *= 1.0F / (float)System.currentTimeMillis();
      }

      return a;
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
      float a = mc.thePlayer.moveForward;
      float a = mc.thePlayer.moveStrafing;
      boolean a = a > 0.0F;
      boolean a = a < 0.0F;
      boolean a = a > 0.0F;
      boolean a = a < 0.0F;
      float a = 0.0F;
      a += 180.0F;
      a += (float)-45;
      a += yaw;
      return MathHelper.wrapAngleTo180_float(a);
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

      double a = 0.2873;
      if (mc.thePlayer != null && mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         a *= 1.0 + 0.2 * (double)(a + 1);
      }

      return a;
   }

   public static double getMoveSpeed() {
      double a = (double)Minecraft.getMinecraft().thePlayer.capabilities.getWalkSpeed() * 2.925;
      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSlowdown)) {
         a /= 1.0 + 0.15 * (double)(Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1);
      }

      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
         a *= 1.0 + 0.2 * (double)(Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1);
      }

      return a;
   }

   public static void setHypottedSpeed() {
      setSpeed(hypot());
   }

   public static double hypot() {
      return Math.hypot(mc.thePlayer.motionX, mc.thePlayer.motionZ);
   }

   public static void setSpeed(double speed) {
      if (isMoving()) {
         double a = getMovingDirection();
         mc.thePlayer.motionX = (double)(-MathHelper.sin((float)a)) * speed;
         mc.thePlayer.motionZ = (double)MathHelper.cos((float)a) * speed;
      }
   }

   public static double getMovingDirection() {
      float a = mc.thePlayer.rotationYaw;
      if (mc.thePlayer.moveForward < 0.0F) {
         a += 180.0F;
      }

      float a = 1.0F;
      if (mc.thePlayer.moveForward < 0.0F) {
         a = -0.5F;
      } else if (mc.thePlayer.moveForward > 0.0F) {
         a = 0.5F;
      }

      if (mc.thePlayer.moveStrafing > 0.0F) {
         a -= 90.0F * a;
      }

      if (mc.thePlayer.moveStrafing < 0.0F) {
         a += 90.0F * a;
      }

      return Math.toRadians((double)a);
   }

   public static float getMovingAngle() {
      float a = Minecraft.getMinecraft().thePlayer.rotationYaw;
      float a = Minecraft.getMinecraft().thePlayer.moveForward;
      float a = Minecraft.getMinecraft().thePlayer.moveStrafing;
      a += (float)(a < 0.0F ? 180 : 0);
      int a = a < 0.0F ? -45 : (a == 0.0F ? 90 : 45);
      if (a < 0.0F) {
         a += (float)a;
      }

      if (a > 0.0F) {
         a -= (float)a;
      }

      return a * 0.017453292F;
   }

   public static double getJumpEffect(double a) {
      if (mc.thePlayer.isPotionActive(Potion.jump)) {
         int a = mc.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier();
         return a + (double)((float)(a + 1) * 0.1F);
      } else {
         return a;
      }
   }

   public static float getJumpHeight() {
      PotionEffect a = mc.thePlayer.getActivePotionEffect(Potion.jump);
      int a = a.getAmplifier() + 1;
      return (float)(mc.thePlayer.getMaxFallHeight() + a);
   }

   public static void Method2486(double a, float a, float a, float a) {
      if (a != 0.0F || a != 0.0F) {
         boolean a = a < 0.0F;
         float a = 90.0F * (a > 0.0F ? 0.5F : -0.5F);
         a += 180.0F;
         if (a > 0.0F) {
            a -= a;
         } else if (a < 0.0F) {
            a += a;
         }

         double a = StrictMath.cos(StrictMath.toRadians((double)(a + 90.0F)));
         double a = StrictMath.cos(StrictMath.toRadians((double)a));
         mc.thePlayer.motionX = a * a;
         mc.thePlayer.motionZ = a * a;
      }
   }

   public static void setSpeed2(double speed) {
      float a = mc.thePlayer.rotationYaw;
      double a = (double)mc.thePlayer.moveForward;
      double a = (double)mc.thePlayer.moveStrafing;
      if (a == 0.0 && a == 0.0) {
         mc.thePlayer.motionX = 0.0;
         mc.thePlayer.motionZ = 0.0;
      } else {
         if (a != 0.0) {
            if (a > 0.0) {
               a += (float)(a > 0.0 ? -45 : 45);
            } else if (a < 0.0) {
               a += (float)(a > 0.0 ? 45 : -45);
            }

            a = 0.0;
            if (a > 0.0) {
               a = 1.0;
            } else if (a < 0.0) {
               a = -1.0;
            }
         }

         mc.thePlayer.motionX = a * speed * Math.cos(Math.toRadians((double)(a + 90.0F))) + a * speed * Math.sin(Math.toRadians((double)(a + 90.0F)));
         mc.thePlayer.motionZ = a * speed * Math.sin(Math.toRadians((double)(a + 90.0F))) - a * speed * Math.cos(Math.toRadians((double)(a + 90.0F)));
      }

   }

   public static double[] Method2488(double a) {
      double a = (double)mc.thePlayer.movementInput.moveForward;
      double a = (double)mc.thePlayer.movementInput.moveStrafe;
      float a = mc.thePlayer.rotationYaw;
      if (a == 0.0 && a == 0.0) {
         return new double[]{0.0, 0.0};
      } else {
         boolean a = a < 0.0;
         float a = 90.0F * (a > 0.0 ? 0.5F : -0.5F);
         a += 180.0F;
         if (a > 0.0) {
            a -= a;
         } else if (a < 0.0) {
            a += a;
         }

         double a = Math.cos(StrictMath.toRadians((double)(a + 90.0F)));
         double a = Math.cos(StrictMath.toRadians((double)a));
         return new double[]{a * a, a * a};
      }
   }

   public static boolean Method2489() {
      trash();
      int a = MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().minX);
      if (a < MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().maxX) + 1) {
         int a = MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().minY);
         if (a < MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().maxY) + 1) {
            int a = MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().minZ);
            if (a < MathHelper.floor_double(mc.thePlayer.getEntityBoundingBox().maxZ) + 1) {
               Block a = mc.theWorld.getBlockState(new BlockPos(a, a, a)).getBlock();
               if (!(a instanceof BlockAir)) {
                  AxisAlignedBB a = a.getCollisionBoundingBox(mc.theWorld, new BlockPos(a, a, a), mc.theWorld.getBlockState(new BlockPos(a, a, a)));
                  if (a instanceof BlockHopper) {
                     a = new AxisAlignedBB((double)a, (double)a, (double)a, (double)(a + 1), (double)(a + 1), (double)(a + 1));
                  }

                  if (mc.thePlayer.getEntityBoundingBox().intersectsWith(a)) {
                     return true;
                  }
               }

               ++a;
            }

            ++a;
         }

         ++a;
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
