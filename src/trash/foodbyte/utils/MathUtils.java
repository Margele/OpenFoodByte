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

    public static boolean Method549(float a, float a2, float a3, float a4, float a5, float a6) {
        return a > a3 && a < a5 && a2 > a4 && a2 < a6;
    }

    public static boolean Method550(float a, float a2, Class391 a3) {
        return a > a3.Method1295() && a < a3.Method1295() + a3.Method1297() && a2 > a3.Method1296() && a2 < a3.Method1296() + a3.Method1298();
    }

    public static int Method551(int a, int a2) {
        return (int)(Math.random() * (double)(a - a2)) + a2;
    }

    public static double Method552(double a, double a2) {
        return Math.random() * (a - a2) + a2;
    }

    public static double Method553(double a, double a2) {
        if (a > a2) {
            return a;
        }
        return new Random().nextDouble() * (a2 - a) + a;
    }

    public static float Method554(float a, float a2) {
        if (a > a2) {
            return a;
        }
        return new Random().nextFloat() * (a2 - a) + a;
    }

    public static long Method555(long a, long a2) {
        if (a > a2) {
            return a;
        }
        return new Random().nextLong() * (a2 - a) + a;
    }

    public static int Method556(int a, int a2) {
        if (a > a2) {
            return a;
        }
        return new Random().nextInt(a2) + a;
    }

    public static byte Method557(byte a, byte a2) {
        if (a > a2) {
            return a;
        }
        return (byte)(new Random().nextInt((int)a2) + a);
    }

    public static double Method558(double a, int a2) {
        return a;
    }

    public static double Method559(double a, double a2) {
        double a3 = 1.0 / a2;
        return (double)Math.round((double)(a * a3)) / a3;
    }

    public static boolean Method560(Double a) {
        if (a != Math.floor((double)a)) {
            return false;
        }
        return !Double.isInfinite((double)a);
    }

    public static float round(double a) {
        return (float)((double)Math.round((double)(a * 1.0E8)) / 1.0E8);
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
        int[] a3 = RenderUtils.Method1148();
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

    public static double Method566() {
        double a = 0.2873;
        if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public static boolean Method567(double a) {
        AxisAlignedBB a2 = new AxisAlignedBB(MathUtils.mc.thePlayer.posX - 0.3, MathUtils.mc.thePlayer.posY + 2.0, MathUtils.mc.thePlayer.posZ + 0.3, MathUtils.mc.thePlayer.posX + 0.3, MathUtils.mc.thePlayer.posY + 3.0, MathUtils.mc.thePlayer.posZ - 0.3);
        if (!MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a2.offset(0.3 + a, 0.0, 0.0)).isEmpty()) {
            return true;
        }
        if (!MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a2.offset(-0.3 - a, 0.0, 0.0)).isEmpty()) {
            return true;
        }
        if (!MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a2.offset(0.0, 0.0, 0.3 + a)).isEmpty()) {
            return true;
        }
        return !MathUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MathUtils.mc.thePlayer, a2.offset(0.0, 0.0, -0.3 - a)).isEmpty();
    }

    public static float[] Method568(BlockPos a, EnumFacing a2) {
        double a3 = (double)a.getX() + 0.5 - MathUtils.mc.thePlayer.posX + (double)a2.getFrontOffsetX() / 2.0;
        double a4 = (double)a.getZ() + 0.5 - MathUtils.mc.thePlayer.posZ + (double)a2.getFrontOffsetZ() / 2.0;
        double a5 = (double)a.getY() + 0.5;
        double a6 = MathUtils.mc.thePlayer.posY + (double)MathUtils.mc.thePlayer.getEyeHeight() - a5;
        double a7 = MathHelper.sqrt_double((double)(a3 * a3 + a4 * a4));
        float a8 = (float)(Math.atan2((double)a4, (double)a3) * 180.0 / Math.PI) - 90.0f;
        float a9 = (float)(Math.atan2((double)a6, (double)a7) * 180.0 / Math.PI);
        if (a8 < 0.0f) {
            a8 += 360.0f;
        }
        return new float[]{a8, a9};
    }

    public static float[] Method569(float[] a) {
        a[0] = a[0] % 360.0f;
        a[1] = a[1] % 360.0f;
        while (a[0] <= -180.0f) {
            a[0] = a[0] + 360.0f;
        }
        while (a[1] <= -180.0f) {
            a[1] = a[1] + 360.0f;
        }
        while (a[0] > 180.0f) {
            a[0] = a[0] - 360.0f;
        }
        while (a[1] > 180.0f) {
            a[1] = a[1] - 360.0f;
        }
        return a;
    }

    public static double Method570() {
        double a = 0.2873;
        if (MathUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = MathUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public static double Method571() {
        double a = 0.272;
        if (MathUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = MathUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)a2;
        }
        return a;
    }

    public static double Method572(double a, double a2) {
        double a3;
        Random a4 = new Random();
        double a5 = a2 - a;
        double a6 = a4.nextDouble() * a5;
        if (a6 > a2) {
            a6 = a2;
        }
        if ((a3 = a6 + a) > a2) {
            a3 = a2;
        }
        return a3;
    }

    public static double Method573(double a, int a2) {
        throw new IllegalArgumentException();
    }

    public static float Method574(float a, float a2, float a3) {
        if (a > a2) {
            a = a2;
        }
        if (a < a3) {
            a = a3;
        }
        return a;
    }

    public static float Method575(float a, float a2, float a3) {
        if (a < a2) {
            return a2;
        }
        return Math.min((float)a, (float)a3);
    }

    public static double Method576(double a, double a2) {
        double a3 = a2 / 2.0;
        double a4 = StrictMath.floor((double)(a / a2)) * a2;
        if (a >= a4 + a3) {
            return new BigDecimal(StrictMath.ceil((double)(a / a2)) * a2, MathContext.DECIMAL64).stripTrailingZeros().doubleValue();
        }
        return new BigDecimal(a4, MathContext.DECIMAL64).stripTrailingZeros().doubleValue();
    }

    public static int Method577(int a, int a2) {
        double a3 = MathUtils.Method572(a, a2);
        a3 = 20.0 / a3;
        a3 = Math.round((double)Math.max((double)a3, (double)1.0));
        int a4 = (int)a3 * 50;
        return a4;
    }

    public static Double Method578(double a, double a2, double a3) {
        return a + (a2 - a) * a3;
    }

    public static float Method579(float a, float a2, double a3) {
        return MathUtils.Method578(a, a2, (float)a3).floatValue();
    }

    public static int Method580(int a, int a2, double a3) {
        return MathUtils.Method578(a, a2, (float)a3).intValue();
    }

    private static IllegalArgumentException Method581(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}