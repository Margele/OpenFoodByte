/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.StrictMath
 *  java.math.BigDecimal
 *  java.math.MathContext
 *  java.util.Random
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.MathHelper
 */
package trash.foodbyte.utils;

import awsl.Class391;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import trash.foodbyte.utils.RenderUtils;

public class MathUtils {
    private static Minecraft mc = Minecraft.getMinecraft();
    private static Random random = new Random();
    public static final float Field1706 = MathUtils.round(Math.PI);
    public static final float Field1707 = MathUtils.round(Math.PI * 2);
    public static final float Field1708 = MathUtils.round(1.5707963267948966);

    public static Random getRandom() {
        return random;
    }

    public static int getRandomInt(int min, int max) {
        if (max < min) {
            return min;
        }
        return min + random.nextInt(max - min + 1);
    }

    public static double getRandomDouble(double min, double max) {
        double a;
        double a2 = max - min;
        double a3 = random.nextDouble() * a2;
        if (a3 > max) {
            a3 = max;
        }
        if ((a = a3 + min) > max) {
            a = max;
        }
        return a;
    }

    public static float Method546(float a, float a2, float a3) {
        return a3 / (a / a2);
    }

    public static float Method547(float a, float a2, float a3, float a4, float a5) {
        return (a - a2) / (a3 - a2) * (a5 - a4) + a4;
    }

    public static double Method548(double a, double a2, double a3, double a4, double a5) {
        return (a - a2) / (a3 - a2) * (a5 - a4) + a4;
    }

    public static boolean isHovering(float mouseX, float mouseY, float left, float top, float right, float bottom) {
        return mouseX > left && mouseX < right && mouseY > top && mouseY < bottom;
    }

    public static boolean Method550(float a, float a2, Class391 a3) {
        return a > a3.Method1295() && a < a3.Method1295() + a3.Method1297() && a2 > a3.Method1296() && a2 < a3.Method1296() + a3.Method1298();
    }

    public static int getRandomInt2(int min, int max) {
        return (int)(Math.random() * (double)(min - max)) + max;
    }

    public static double getRandomDouble3(double min, double max) {
        return Math.random() * (min - max) + max;
    }

    public static double getRandomDouble4(double min, double max) {
        if (min > max) {
            return min;
        }
        return new Random().nextDouble() * (max - min) + min;
    }

    public static float getRandomFloat(float min, float max) {
        if (min > max) {
            return min;
        }
        return new Random().nextFloat() * (max - min) + min;
    }

    public static long getRandomLong(long min, long max) {
        if (min > max) {
            return min;
        }
        return new Random().nextLong() * (max - min) + min;
    }

    public static int getRandomInt3(int min, int max) {
        if (min > max) {
            return min;
        }
        return new Random().nextInt(max) + min;
    }

    public static byte getRandomByte(byte min, byte max) {
        if (min > max) {
            return min;
        }
        return (byte)(new Random().nextInt((int)max) + min);
    }

    public static double whatsThis(double a, int a2) {
        return a;
    }

    public static double round(double origin, double scale) {
        double a = 1.0 / scale;
        return (double)Math.round((double)(origin * a)) / a;
    }

    public static boolean isInfinite(Double num) {
        if (num != Math.floor((double)num)) {
            return false;
        }
        return !Double.isInfinite((double)num);
    }

    public static float round(double num) {
        return (float)((double)Math.round((double)(num * 1.0E8)) / 1.0E8);
    }

    public static int getJumpEffect() {
        if (MathUtils.mc.thePlayer.isPotionActive(Potion.jump)) {
            return MathUtils.mc.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier() + 1;
        }
        return 0;
    }

    public static int getSpeedEffect() {
        if (MathUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            return MathUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1;
        }
        return 0;
    }

    public static boolean isOnGround(double a) {
        return !MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, MathUtils.mc.thePlayer.getEntityBoundingBox().offset(0.0, -a, 0.0)).isEmpty();
    }

    public static void setSpeed(double speed) {
        double a;
        double a2;
        double d = MathUtils.mc.thePlayer.movementInput.moveForward;
        double d2 = MathUtils.mc.thePlayer.movementInput.moveStrafe;
        int[] a3 = RenderUtils.trash();
        float a4 = MathUtils.mc.thePlayer.rotationYaw;
        if (a2 == 0.0 && a == 0.0) {
            MathUtils.mc.thePlayer.motionX = 0.0;
            MathUtils.mc.thePlayer.motionZ = 0.0;
        }
        if (a2 != 0.0) {
            if (a > 0.0) {
                a4 += (float)(a2 > 0.0 ? -45 : 45);
            }
            if (a < 0.0) {
                a4 += (float)(a2 > 0.0 ? 45 : -45);
            }
            a = 0.0;
            if (a2 > 0.0) {
                a2 = 1.0;
            }
            if (a2 < 0.0) {
                a2 = -1.0;
            }
        }
        MathUtils.mc.thePlayer.motionX = a2 * speed * Math.cos((double)Math.toRadians((double)(a4 + 90.0f))) + a * speed * Math.sin((double)Math.toRadians((double)(a4 + 90.0f)));
        MathUtils.mc.thePlayer.motionZ = a2 * speed * Math.sin((double)Math.toRadians((double)(a4 + 90.0f))) - a * speed * Math.cos((double)Math.toRadians((double)(a4 + 90.0f)));
    }

    public static double getDefaultSpeed3() {
        double a = 0.2873;
        if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public static boolean isInBound(double expand) {
        AxisAlignedBB a = new AxisAlignedBB(MathUtils.mc.thePlayer.posX - 0.3, MathUtils.mc.thePlayer.posY + 2.0, MathUtils.mc.thePlayer.posZ + 0.3, MathUtils.mc.thePlayer.posX + 0.3, MathUtils.mc.thePlayer.posY + 3.0, MathUtils.mc.thePlayer.posZ - 0.3);
        if (!MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a.offset(0.3 + expand, 0.0, 0.0)).isEmpty()) {
            return true;
        }
        if (!MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a.offset(-0.3 - expand, 0.0, 0.0)).isEmpty()) {
            return true;
        }
        if (!MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a.offset(0.0, 0.0, 0.3 + expand)).isEmpty()) {
            return true;
        }
        return !MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a.offset(0.0, 0.0, -0.3 - expand)).isEmpty();
    }

    public static float[] getRotationToBlock(BlockPos block, EnumFacing facing) {
        double a = (double)block.getX() + 0.5 - MathUtils.mc.thePlayer.posX + (double)facing.getFrontOffsetX() / 2.0;
        double a2 = (double)block.getZ() + 0.5 - MathUtils.mc.thePlayer.posZ + (double)facing.getFrontOffsetZ() / 2.0;
        double a3 = (double)block.getY() + 0.5;
        double a4 = MathUtils.mc.thePlayer.posY + (double)MathUtils.mc.thePlayer.getEyeHeight() - a3;
        double a5 = MathHelper.sqrt_double((double)(a * a + a2 * a2));
        float a6 = (float)(Math.atan2((double)a2, (double)a) * 180.0 / Math.PI) - 90.0f;
        float a7 = (float)(Math.atan2((double)a4, (double)a5) * 180.0 / Math.PI);
        if (a6 < 0.0f) {
            a6 += 360.0f;
        }
        return new float[]{a6, a7};
    }

    public static float[] parseRotations(float[] rotation) {
        rotation[0] = rotation[0] % 360.0f;
        rotation[1] = rotation[1] % 360.0f;
        while (rotation[0] <= -180.0f) {
            rotation[0] = rotation[0] + 360.0f;
        }
        while (rotation[1] <= -180.0f) {
            rotation[1] = rotation[1] + 360.0f;
        }
        while (rotation[0] > 180.0f) {
            rotation[0] = rotation[0] - 360.0f;
        }
        while (rotation[1] > 180.0f) {
            rotation[1] = rotation[1] - 360.0f;
        }
        return rotation;
    }

    public static double getDefaultSpeed() {
        double a = 0.2873;
        if (MathUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = MathUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public static double getDefaultSpeed2() {
        double a = 0.272;
        if (MathUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = MathUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)a2;
        }
        return a;
    }

    public static double getRandomDouble2(double min, double max) {
        double a;
        Random a2 = new Random();
        double a3 = max - min;
        double a4 = a2.nextDouble() * a3;
        if (a4 > max) {
            a4 = max;
        }
        if ((a = a4 + min) > max) {
            a = max;
        }
        return a;
    }

    public static double trash(double a, int a2) {
        throw new IllegalArgumentException();
    }

    public static float clamp(float a, float a2, float a3) {
        if (a > a2) {
            a = a2;
        }
        if (a < a3) {
            a = a3;
        }
        return a;
    }

    public static float getMin(float a, float a2, float a3) {
        if (a < a2) {
            return a2;
        }
        return Math.min((float)a, (float)a3);
    }

    public static double floor(double a, double a2) {
        double a3 = a2 / 2.0;
        double a4 = StrictMath.floor((double)(a / a2)) * a2;
        if (a >= a4 + a3) {
            return new BigDecimal(StrictMath.ceil((double)(a / a2)) * a2, MathContext.DECIMAL64).stripTrailingZeros().doubleValue();
        }
        return new BigDecimal(a4, MathContext.DECIMAL64).stripTrailingZeros().doubleValue();
    }

    public static int getRandomDouble(int min, int max) {
        double a = MathUtils.getRandomDouble2(min, max);
        a = 20.0 / a;
        a = Math.round((double)Math.max((double)a, (double)1.0));
        int a2 = (int)a * 50;
        return a2;
    }

    public static Double getMid(double a, double a2, double a3) {
        return a + (a2 - a) * a3;
    }

    public static float getMidFloat(float a, float a2, double a3) {
        return MathUtils.getMid(a, a2, (float)a3).floatValue();
    }

    public static int getMidInt(int a, int a2, double a3) {
        return MathUtils.getMid(a, a2, (float)a3).intValue();
    }

    private static IllegalArgumentException trash(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}