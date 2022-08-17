package trash.foodbyte.utils;

import awsl.Class391;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;

public class MathUtils {
   private static Minecraft mc = Minecraft.getMinecraft();
   private static Random random = new Random();
   public static final float Field1706 = round(Math.PI);
   public static final float Field1707 = round(6.283185307179586);
   public static final float Field1708 = round(1.5707963267948966);

   public static Random getRandom() {
      return random;
   }

   public static int getRandomInt(int min, int max) {
      return max < min ? min : min + random.nextInt(max - min + 1);
   }

   public static double getRandomDouble(double min, double max) {
      double a = max - min;
      double a = random.nextDouble() * a;
      if (a > max) {
         a = max;
      }

      double a = a + min;
      if (a > max) {
         a = max;
      }

      return a;
   }

   public static float Method546(float a, float a, float a) {
      return a / (a / a);
   }

   public static float Method547(float a, float a, float a, float a, float a) {
      return (a - a) / (a - a) * (a - a) + a;
   }

   public static double Method548(double a, double a, double a, double a, double a) {
      return (a - a) / (a - a) * (a - a) + a;
   }

   public static boolean isHovering(float mouseX, float mouseY, float left, float top, float right, float bottom) {
      return mouseX > left && mouseX < right && mouseY > top && mouseY < bottom;
   }

   public static boolean Method550(float a, float a, Class391 a) {
      return a > a.Method1295() && a < a.Method1295() + a.Method1297() && a > a.Method1296() && a < a.Method1296() + a.Method1298();
   }

   public static int getRandomInt2(int min, int max) {
      return (int)(Math.random() * (double)(min - max)) + max;
   }

   public static double getRandomDouble3(double min, double max) {
      return Math.random() * (min - max) + max;
   }

   public static double getRandomDouble4(double min, double max) {
      return min > max ? min : (new Random()).nextDouble() * (max - min) + min;
   }

   public static float getRandomFloat(float min, float max) {
      return min > max ? min : (new Random()).nextFloat() * (max - min) + min;
   }

   public static long getRandomLong(long min, long max) {
      return min > max ? min : (new Random()).nextLong() * (max - min) + min;
   }

   public static int getRandomInt3(int min, int max) {
      return min > max ? min : (new Random()).nextInt(max) + min;
   }

   public static byte getRandomByte(byte min, byte max) {
      return min > max ? min : (byte)((new Random()).nextInt(max) + min);
   }

   public static double whatsThis(double a, int a2) {
      return a;
   }

   public static double round(double origin, double scale) {
      double a = 1.0 / scale;
      return (double)Math.round(origin * a) / a;
   }

   public static boolean isInfinite(Double num) {
      if (num != Math.floor(num)) {
         return false;
      } else {
         return !Double.isInfinite(num);
      }
   }

   public static float round(double num) {
      return (float)((double)Math.round(num * 1.0E8) / 1.0E8);
   }

   public static int getJumpEffect() {
      return mc.thePlayer.isPotionActive(Potion.jump) ? mc.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier() + 1 : 0;
   }

   public static int getSpeedEffect() {
      return mc.thePlayer.isPotionActive(Potion.moveSpeed) ? mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 : 0;
   }

   public static boolean isOnGround(double a) {
      return !mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(0.0, -a, 0.0)).isEmpty();
   }

   public static void setSpeed(double speed) {
      double a = (double)mc.thePlayer.movementInput.moveForward;
      RenderUtils.trash();
      double a = (double)mc.thePlayer.movementInput.moveStrafe;
      float a = mc.thePlayer.rotationYaw;
      if (a == 0.0 && a == 0.0) {
         mc.thePlayer.motionX = 0.0;
         mc.thePlayer.motionZ = 0.0;
      }

      if (a != 0.0) {
         if (a > 0.0) {
            a += (float)(a > 0.0 ? -45 : 45);
         }

         if (a < 0.0) {
            a += (float)(a > 0.0 ? 45 : -45);
         }

         a = 0.0;
         if (a > 0.0) {
            a = 1.0;
         }

         if (a < 0.0) {
            a = -1.0;
         }
      }

      mc.thePlayer.motionX = a * speed * Math.cos(Math.toRadians((double)(a + 90.0F))) + a * speed * Math.sin(Math.toRadians((double)(a + 90.0F)));
      mc.thePlayer.motionZ = a * speed * Math.sin(Math.toRadians((double)(a + 90.0F))) - a * speed * Math.cos(Math.toRadians((double)(a + 90.0F)));
   }

   public static double getDefaultSpeed3() {
      double a = 0.2873;
      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         a *= 1.0 + 0.2 * (double)(a + 1);
      }

      return a;
   }

   public static boolean isInBound(double expand) {
      AxisAlignedBB a = new AxisAlignedBB(mc.thePlayer.posX - 0.3, mc.thePlayer.posY + 2.0, mc.thePlayer.posZ + 0.3, mc.thePlayer.posX + 0.3, mc.thePlayer.posY + 3.0, mc.thePlayer.posZ - 0.3);
      if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, a.offset(0.3 + expand, 0.0, 0.0)).isEmpty()) {
         return true;
      } else if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, a.offset(-0.3 - expand, 0.0, 0.0)).isEmpty()) {
         return true;
      } else if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, a.offset(0.0, 0.0, 0.3 + expand)).isEmpty()) {
         return true;
      } else {
         return !mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, a.offset(0.0, 0.0, -0.3 - expand)).isEmpty();
      }
   }

   public static float[] getRotationToBlock(BlockPos block, EnumFacing facing) {
      double a = (double)block.getX() + 0.5 - mc.thePlayer.posX + (double)facing.getFrontOffsetX() / 2.0;
      double a = (double)block.getZ() + 0.5 - mc.thePlayer.posZ + (double)facing.getFrontOffsetZ() / 2.0;
      double a = (double)block.getY() + 0.5;
      double a = mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight() - a;
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI);
      if (a < 0.0F) {
         a += 360.0F;
      }

      return new float[]{a, a};
   }

   public static float[] parseRotations(float[] rotation) {
      rotation[0] %= 360.0F;

      for(rotation[1] %= 360.0F; rotation[0] <= -180.0F; rotation[0] += 360.0F) {
      }

      while(rotation[1] <= -180.0F) {
         rotation[1] += 360.0F;
      }

      while(rotation[0] > 180.0F) {
         rotation[0] -= 360.0F;
      }

      while(rotation[1] > 180.0F) {
         rotation[1] -= 360.0F;
      }

      return rotation;
   }

   public static double getDefaultSpeed() {
      double a = 0.2873;
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         a *= 1.0 + 0.2 * (double)(a + 1);
      }

      return a;
   }

   public static double getDefaultSpeed2() {
      double a = 0.272;
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         a *= 1.0 + 0.2 * (double)a;
      }

      return a;
   }

   public static double getRandomDouble2(double min, double max) {
      Random a = new Random();
      double a = max - min;
      double a = a.nextDouble() * a;
      if (a > max) {
         a = max;
      }

      double a = a + min;
      if (a > max) {
         a = max;
      }

      return a;
   }

   public static double trash(double a, int a1) {
      throw new IllegalArgumentException();
   }

   public static float clamp(float a, float a, float a) {
      if (a > a) {
         a = a;
      }

      if (a < a) {
         a = a;
      }

      return a;
   }

   public static float getMin(float a, float a, float a) {
      return a < a ? a : Math.min(a, a);
   }

   public static double floor(double a, double a) {
      double a = a / 2.0;
      double a = StrictMath.floor(a / a) * a;
      return a >= a + a ? (new BigDecimal(StrictMath.ceil(a / a) * a, MathContext.DECIMAL64)).stripTrailingZeros().doubleValue() : (new BigDecimal(a, MathContext.DECIMAL64)).stripTrailingZeros().doubleValue();
   }

   public static int getRandomDouble(int min, int max) {
      double a = getRandomDouble2((double)min, (double)max);
      a = 20.0 / a;
      a = (double)Math.round(Math.max(a, 1.0));
      int a = (int)a * 50;
      return a;
   }

   public static Double getMid(double a, double a, double a) {
      return a + (a - a) * a;
   }

   public static float getMidFloat(float a, float a, double a) {
      return getMid((double)a, (double)a, (double)((float)a)).floatValue();
   }

   public static int getMidInt(int a, int a, double a) {
      return getMid((double)a, (double)a, (double)((float)a)).intValue();
   }

   private static IllegalArgumentException trash(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
