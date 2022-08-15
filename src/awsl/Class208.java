/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.StrictMath
 *  java.lang.String
 *  java.lang.System
 *  java.security.SecureRandom
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockHopper
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package awsl;

import java.security.SecureRandom;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockHopper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KeepSprint;
import trash.foodbyte.module.impl.movement.Sprint;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.Wrapper;

public class Class208 {
    protected static final Minecraft Field1184 = Minecraft.getMinecraft();
    private static String[] Field1185;

    public static void Method2462() {
        double a = 0.0624f;
        EntityPlayerSP a2 = Class208.Field1184.thePlayer;
        double a3 = a2.posX;
        double a4 = a2.posY;
        double a5 = a2.posZ;
        int a6 = 0;
        while ((double)a6 < (double)Class208.Method2485() / (double)0.0624f + 1.0) {
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3, a4 + (double)0.0624f, a5, false));
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3, a4 + 1.0E-4, a5, false));
            ++a6;
        }
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3, a4, a5, true));
    }

    public static double Method2463() {
        SecureRandom a = new SecureRandom();
        double a2 = a.nextDouble() * (1.0 / (double)System.currentTimeMillis());
        for (int a3 = 0; a3 < MathUtils.Method556(MathUtils.Method556(4, 6), MathUtils.Method556(8, 20)); ++a3) {
            a2 *= 1.0 / (double)System.currentTimeMillis();
        }
        return a2;
    }

    public static float Method2464() {
        SecureRandom a = new SecureRandom();
        float a2 = a.nextFloat() * (1.0f / (float)System.currentTimeMillis());
        for (int a3 = 0; a3 < MathUtils.Method556(MathUtils.Method556(4, 6), MathUtils.Method556(8, 20)); ++a3) {
            a2 *= 1.0f / (float)System.currentTimeMillis();
        }
        return a2;
    }

    public static boolean Method2465() {
        return !(!(Class208.Field1184.thePlayer.movementInput.moveForward >= 0.8f) && (((Sprint)ModuleManager.getModule2(Sprint.class)).Field2428.Method2509() == false || !Class208.Method2466()) || Class208.Field1184.thePlayer.isCollidedHorizontally || Class208.Field1184.thePlayer.getFoodStats().getFoodLevel() <= 6 && !Class208.Field1184.thePlayer.capabilities.allowFlying || Class208.Field1184.thePlayer.isSneaking() || Class208.Field1184.thePlayer.isUsingItem() && !((KeepSprint)ModuleManager.getModule2(KeepSprint.class)).getState() || Class208.Field1184.thePlayer.isPotionActive(Potion.moveSlowdown.id));
    }

    public static boolean Method2466() {
        return Class208.Field1184.thePlayer.movementInput.moveForward != 0.0f || Class208.Field1184.thePlayer.movementInput.moveStrafe != 0.0f;
    }

    public static boolean Method2467() {
        return Class208.Field1184.thePlayer.onGround && Class208.Field1184.thePlayer.isCollidedVertically;
    }

    public static boolean Method2468() {
        return Class208.Method2466() && Class208.Method2467();
    }

    public static boolean Method2469(double a) {
        return !Class208.Field1184.theWorld.getCollidingBoundingBoxes((Entity)Class208.Field1184.thePlayer, Class208.Field1184.thePlayer.getEntityBoundingBox().offset(0.0, -a, 0.0)).isEmpty();
    }

    public static void Method2470(double a, boolean a2) {
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(Class208.Field1184.thePlayer.posX + a, Class208.Field1184.thePlayer.posY, Class208.Field1184.thePlayer.posZ + a, a2));
    }

    public static void Method2471(double a, boolean a2) {
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(Class208.Field1184.thePlayer.posX, Class208.Field1184.thePlayer.posY + a, Class208.Field1184.thePlayer.posZ, a2));
    }

    public static float Method2472() {
        return Class208.Method2473(Class208.Field1184.thePlayer.rotationYaw);
    }

    public static float Method2473(float a) {
        float a2 = Class208.Field1184.thePlayer.moveForward;
        float a3 = Class208.Field1184.thePlayer.moveStrafing;
        boolean a4 = a2 > 0.0f;
        boolean a5 = a2 < 0.0f;
        boolean a6 = a3 > 0.0f;
        boolean a7 = a3 < 0.0f;
        float a8 = 0.0f;
        a8 += 180.0f;
        a8 += (float)-45;
        return MathHelper.wrapAngleTo180_float((float)(a8 += a));
    }

    public static double Method2474() {
        return Class208.Method2477(true);
    }

    public static double[] Method2475(double a) {
        return Class208.Method2476(Class208.Field1184.thePlayer.rotationYaw * MathUtils.round(Math.PI / 180), a);
    }

    public static double[] Method2476(float a, double a2) {
        return new double[]{(double)(-MathHelper.sin((float)a)) * a2, (double)MathHelper.cos((float)a) * a2};
    }

    public static double Method2477(boolean a) {
        if (!Class208.Method2465()) {
        }
        double a2 = 0.2873;
        if (Class208.Field1184.thePlayer != null && Class208.Field1184.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a3 = Class208.Field1184.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a2 *= 1.0 + 0.2 * (double)(a3 + 1);
        }
        return a2;
    }

    public static double Method2478() {
        double a = (double)Minecraft.getMinecraft().thePlayer.capabilities.getWalkSpeed() * 2.925;
        if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSlowdown)) {
            a /= 1.0 + 0.15 * (double)(Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1);
        }
        if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
            a *= 1.0 + 0.2 * (double)(Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1);
        }
        return a;
    }

    public static void Method2479() {
        Class208.Method2481(Class208.Method2480());
    }

    public static double Method2480() {
        return Math.hypot((double)Class208.Field1184.thePlayer.motionX, (double)Class208.Field1184.thePlayer.motionZ);
    }

    public static void Method2481(double a) {
        if (!Class208.Method2466()) {
            return;
        }
        double a2 = Class208.Method2482();
        Class208.Field1184.thePlayer.motionX = (double)(-MathHelper.sin((float)((float)a2))) * a;
        Class208.Field1184.thePlayer.motionZ = (double)MathHelper.cos((float)((float)a2)) * a;
    }

    public static double Method2482() {
        float a = Class208.Field1184.thePlayer.rotationYaw;
        if (Class208.Field1184.thePlayer.moveForward < 0.0f) {
            a += 180.0f;
        }
        float a2 = 1.0f;
        if (Class208.Field1184.thePlayer.moveForward < 0.0f) {
            a2 = -0.5f;
        } else if (Class208.Field1184.thePlayer.moveForward > 0.0f) {
            a2 = 0.5f;
        }
        if (Class208.Field1184.thePlayer.moveStrafing > 0.0f) {
            a -= 90.0f * a2;
        }
        if (Class208.Field1184.thePlayer.moveStrafing < 0.0f) {
            a += 90.0f * a2;
        }
        return Math.toRadians((double)a);
    }

    public static float Method2483() {
        int a;
        float a2 = Minecraft.getMinecraft().thePlayer.rotationYaw;
        float a3 = Minecraft.getMinecraft().thePlayer.moveForward;
        float a4 = Minecraft.getMinecraft().thePlayer.moveStrafing;
        a2 += (float)(a3 < 0.0f ? 180 : 0);
        int n = a3 < 0.0f ? -45 : (a = a3 == 0.0f ? 90 : 45);
        if (a4 < 0.0f) {
            a2 += (float)a;
        }
        if (a4 > 0.0f) {
            a2 -= (float)a;
        }
        return a2 * ((float)Math.PI / 180);
    }

    public static double Method2484(double a) {
        if (Class208.Field1184.thePlayer.isPotionActive(Potion.jump)) {
            int a2 = Class208.Field1184.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier();
            return a + (double)((float)(a2 + 1) * 0.1f);
        }
        return a;
    }

    public static float Method2485() {
        PotionEffect a = Class208.Field1184.thePlayer.getActivePotionEffect(Potion.jump);
        int a2 = a.getAmplifier() + 1;
        return Class208.Field1184.thePlayer.getMaxFallHeight() + a2;
    }

    public static void Method2486(double a, float a2, float a3, float a4) {
        boolean a5;
        if (a2 == 0.0f && a3 == 0.0f) {
            return;
        }
        boolean bl = a5 = a2 < 0.0f;
        float a6 = 90.0f * (a2 > 0.0f ? 0.5f : -0.5f);
        a4 += 180.0f;
        if (a3 > 0.0f) {
            a4 -= a6;
        } else if (a3 < 0.0f) {
            a4 += a6;
        }
        double a7 = StrictMath.cos((double)StrictMath.toRadians((double)(a4 + 90.0f)));
        double a8 = StrictMath.cos((double)StrictMath.toRadians((double)a4));
        Class208.Field1184.thePlayer.motionX = a7 * a;
        Class208.Field1184.thePlayer.motionZ = a8 * a;
    }

    public static void Method2487(double a) {
        float a2 = Class208.Field1184.thePlayer.rotationYaw;
        double a3 = Class208.Field1184.thePlayer.moveForward;
        double a4 = Class208.Field1184.thePlayer.moveStrafing;
        if (a3 == 0.0 && a4 == 0.0) {
            Class208.Field1184.thePlayer.motionX = 0.0;
            Class208.Field1184.thePlayer.motionZ = 0.0;
        } else {
            if (a3 != 0.0) {
                if (a4 > 0.0) {
                    a2 += (float)(a3 > 0.0 ? -45 : 45);
                } else if (a4 < 0.0) {
                    a2 += (float)(a3 > 0.0 ? 45 : -45);
                }
                a4 = 0.0;
                if (a3 > 0.0) {
                    a3 = 1.0;
                } else if (a3 < 0.0) {
                    a3 = -1.0;
                }
            }
            Class208.Field1184.thePlayer.motionX = a3 * a * Math.cos((double)Math.toRadians((double)(a2 + 90.0f))) + a4 * a * Math.sin((double)Math.toRadians((double)(a2 + 90.0f)));
            Class208.Field1184.thePlayer.motionZ = a3 * a * Math.sin((double)Math.toRadians((double)(a2 + 90.0f))) - a4 * a * Math.cos((double)Math.toRadians((double)(a2 + 90.0f)));
        }
    }

    public static double[] Method2488(double a) {
        boolean a2;
        double a3 = Class208.Field1184.thePlayer.movementInput.moveForward;
        double a4 = Class208.Field1184.thePlayer.movementInput.moveStrafe;
        float a5 = Class208.Field1184.thePlayer.rotationYaw;
        if (a3 == 0.0 && a4 == 0.0) {
            return new double[]{0.0, 0.0};
        }
        boolean bl = a2 = a3 < 0.0;
        float a6 = 90.0f * (a3 > 0.0 ? 0.5f : -0.5f);
        a5 += 180.0f;
        if (a4 > 0.0) {
            a5 -= a6;
        } else if (a4 < 0.0) {
            a5 += a6;
        }
        double a7 = Math.cos((double)StrictMath.toRadians((double)(a5 + 90.0f)));
        double a8 = Math.cos((double)StrictMath.toRadians((double)a5));
        return new double[]{a7 * a, a8 * a};
    }

    public static boolean Method2489() {
        int a = MathHelper.floor_double((double)Class208.Field1184.thePlayer.getEntityBoundingBox().minX);
        String[] a2 = Class208.Method2491();
        if (a < MathHelper.floor_double((double)Class208.Field1184.thePlayer.getEntityBoundingBox().maxX) + 1) {
            int a3 = MathHelper.floor_double((double)Class208.Field1184.thePlayer.getEntityBoundingBox().minY);
            if (a3 < MathHelper.floor_double((double)Class208.Field1184.thePlayer.getEntityBoundingBox().maxY) + 1) {
                int a4 = MathHelper.floor_double((double)Class208.Field1184.thePlayer.getEntityBoundingBox().minZ);
                if (a4 < MathHelper.floor_double((double)Class208.Field1184.thePlayer.getEntityBoundingBox().maxZ) + 1) {
                    Block a5 = Class208.Field1184.theWorld.getBlockState(new BlockPos(a, a3, a4)).getBlock();
                    if (!(a5 instanceof BlockAir)) {
                        AxisAlignedBB a6 = a5.getCollisionBoundingBox((World)Class208.Field1184.theWorld, new BlockPos(a, a3, a4), Class208.Field1184.theWorld.getBlockState(new BlockPos(a, a3, a4)));
                        if (a5 instanceof BlockHopper) {
                            a6 = new AxisAlignedBB((double)a, (double)a3, (double)a4, (double)(a + 1), (double)(a3 + 1), (double)(a4 + 1));
                        }
                        if (Class208.Field1184.thePlayer.getEntityBoundingBox().intersectsWith(a6)) {
                            return true;
                        }
                    }
                    ++a4;
                }
                ++a3;
            }
            ++a;
        }
        return false;
    }

    static {
        Class208.Method2490(new String[2]);
    }

    public static void Method2490(String[] stringArray) {
        Field1185 = stringArray;
    }

    public static String[] Method2491() {
        return Field1185;
    }
}