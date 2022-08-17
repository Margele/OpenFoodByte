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
      double var4 = max - min;
      double var6 = random.nextDouble() * var4;
      if (var6 > max) {
         var6 = max;
      }

      double var8 = var6 + min;
      if (var8 > max) {
         var8 = max;
      }

      return var8;
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
      double var4 = 1.0 / scale;
      return (double)Math.round(origin * var4) / var4;
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
      double var3 = (double)mc.thePlayer.movementInput.moveForward;
      RenderUtils.trash();
      double var5 = (double)mc.thePlayer.movementInput.moveStrafe;
      float var7 = mc.thePlayer.rotationYaw;
      if (var3 == 0.0 && var5 == 0.0) {
         mc.thePlayer.motionX = 0.0;
         mc.thePlayer.motionZ = 0.0;
      }

      if (var3 != 0.0) {
         if (var5 > 0.0) {
            var7 += (float)(var3 > 0.0 ? -45 : 45);
         }

         if (var5 < 0.0) {
            var7 += (float)(var3 > 0.0 ? 45 : -45);
         }

         var5 = 0.0;
         if (var3 > 0.0) {
            var3 = 1.0;
         }

         if (var3 < 0.0) {
            var3 = -1.0;
         }
      }

      mc.thePlayer.motionX = var3 * speed * Math.cos(Math.toRadians((double)(var7 + 90.0F))) + var5 * speed * Math.sin(Math.toRadians((double)(var7 + 90.0F)));
      mc.thePlayer.motionZ = var3 * speed * Math.sin(Math.toRadians((double)(var7 + 90.0F))) - var5 * speed * Math.cos(Math.toRadians((double)(var7 + 90.0F)));
   }

   public static double getDefaultSpeed3() {
      double var0 = 0.2873;
      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var2 = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         var0 *= 1.0 + 0.2 * (double)(var2 + 1);
      }

      return var0;
   }

   public static boolean isInBound(double expand) {
      AxisAlignedBB var2 = new AxisAlignedBB(mc.thePlayer.posX - 0.3, mc.thePlayer.posY + 2.0, mc.thePlayer.posZ + 0.3, mc.thePlayer.posX + 0.3, mc.thePlayer.posY + 3.0, mc.thePlayer.posZ - 0.3);
      if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, var2.offset(0.3 + expand, 0.0, 0.0)).isEmpty()) {
         return true;
      } else if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, var2.offset(-0.3 - expand, 0.0, 0.0)).isEmpty()) {
         return true;
      } else if (!mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, var2.offset(0.0, 0.0, 0.3 + expand)).isEmpty()) {
         return true;
      } else {
         return !mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, var2.offset(0.0, 0.0, -0.3 - expand)).isEmpty();
      }
   }

   public static float[] getRotationToBlock(BlockPos block, EnumFacing facing) {
      double var2 = (double)block.getX() + 0.5 - mc.thePlayer.posX + (double)facing.getFrontOffsetX() / 2.0;
      double var4 = (double)block.getZ() + 0.5 - mc.thePlayer.posZ + (double)facing.getFrontOffsetZ() / 2.0;
      double var6 = (double)block.getY() + 0.5;
      double var8 = mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight() - var6;
      double var10 = (double)MathHelper.sqrt_double(var2 * var2 + var4 * var4);
      float var12 = (float)(Math.atan2(var4, var2) * 180.0 / Math.PI) - 90.0F;
      float var13 = (float)(Math.atan2(var8, var10) * 180.0 / Math.PI);
      if (var12 < 0.0F) {
         var12 += 360.0F;
      }

      return new float[]{var12, var13};
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
      double var0 = 0.2873;
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var2 = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         var0 *= 1.0 + 0.2 * (double)(var2 + 1);
      }

      return var0;
   }

   public static double getDefaultSpeed2() {
      double var0 = 0.272;
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var2 = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         var0 *= 1.0 + 0.2 * (double)var2;
      }

      return var0;
   }

   public static double getRandomDouble2(double min, double max) {
      Random var4 = new Random();
      double var5 = max - min;
      double var7 = var4.nextDouble() * var5;
      if (var7 > max) {
         var7 = max;
      }

      double var9 = var7 + min;
      if (var9 > max) {
         var9 = max;
      }

      return var9;
   }

   public static double trash(double a, int a) {
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
      double var4 = a / 2.0;
      double var6 = StrictMath.floor(a / a) * a;
      return a >= var6 + var4 ? (new BigDecimal(StrictMath.ceil(a / a) * a, MathContext.DECIMAL64)).stripTrailingZeros().doubleValue() : (new BigDecimal(var6, MathContext.DECIMAL64)).stripTrailingZeros().doubleValue();
   }

   public static int getRandomDouble(int min, int max) {
      double var2 = getRandomDouble2((double)min, (double)max);
      var2 = 20.0 / var2;
      var2 = (double)Math.round(Math.max(var2, 1.0));
      int var4 = (int)var2 * 50;
      return var4;
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
