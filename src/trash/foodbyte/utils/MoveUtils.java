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
package trash.foodbyte.utils;

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
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;

public class MoveUtils {
    protected static final Minecraft mc = Minecraft.getMinecraft();
    private static String[] trash;

    public static void selfDamage() {
        double a = 0.0624f;
        EntityPlayerSP a2 = MoveUtils.mc.thePlayer;
        double a3 = a2.posX;
        double a4 = a2.posY;
        double a5 = a2.posZ;
        int a6 = 0;
        while ((double)a6 < (double)MoveUtils.getJumpHeight() / (double)0.0624f + 1.0) {
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3, a4 + (double)0.0624f, a5, false));
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3, a4 + 1.0E-4, a5, false));
            ++a6;
        }
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(a3, a4, a5, true));
    }

    public static double getRandomDouble() {
        SecureRandom a = new SecureRandom();
        double a2 = a.nextDouble() * (1.0 / (double)System.currentTimeMillis());
        for (int a3 = 0; a3 < MathUtils.getRandomInt3(MathUtils.getRandomInt3(4, 6), MathUtils.getRandomInt3(8, 20)); ++a3) {
            a2 *= 1.0 / (double)System.currentTimeMillis();
        }
        return a2;
    }

    public static float getRandomFloat() {
        SecureRandom a = new SecureRandom();
        float a2 = a.nextFloat() * (1.0f / (float)System.currentTimeMillis());
        for (int a3 = 0; a3 < MathUtils.getRandomInt3(MathUtils.getRandomInt3(4, 6), MathUtils.getRandomInt3(8, 20)); ++a3) {
            a2 *= 1.0f / (float)System.currentTimeMillis();
        }
        return a2;
    }

    public static boolean shouldStopSprint() {
        return !(!(MoveUtils.mc.thePlayer.movementInput.moveForward >= 0.8f) && (((Sprint)ModuleManager.getModule2(Sprint.class)).omni.getBooleanValue() == false || !MoveUtils.isMoving()) || MoveUtils.mc.thePlayer.isCollidedHorizontally || MoveUtils.mc.thePlayer.getFoodStats().getFoodLevel() <= 6 && !MoveUtils.mc.thePlayer.capabilities.allowFlying || MoveUtils.mc.thePlayer.isSneaking() || MoveUtils.mc.thePlayer.isUsingItem() && !((KeepSprint)ModuleManager.getModule2(KeepSprint.class)).getState() || MoveUtils.mc.thePlayer.isPotionActive(Potion.moveSlowdown.id));
    }

    public static boolean isMoving() {
        return MoveUtils.mc.thePlayer.movementInput.moveForward != 0.0f || MoveUtils.mc.thePlayer.movementInput.moveStrafe != 0.0f;
    }

    public static boolean isTouchingWall() {
        return MoveUtils.mc.thePlayer.onGround && MoveUtils.mc.thePlayer.isCollidedVertically;
    }

    public static boolean shouldStep() {
        return MoveUtils.isMoving() && MoveUtils.isTouchingWall();
    }

    public static boolean isReallyOnGround(double distance) {
        return !MoveUtils.mc.theWorld.getCollidingBoundingBoxes((Entity)MoveUtils.mc.thePlayer, MoveUtils.mc.thePlayer.getEntityBoundingBox().offset(0.0, -distance, 0.0)).isEmpty();
    }

    public static void sendPositionPacketWithXZOffset(double xzOffset, boolean onGround) {
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(MoveUtils.mc.thePlayer.posX + xzOffset, MoveUtils.mc.thePlayer.posY, MoveUtils.mc.thePlayer.posZ + xzOffset, onGround));
    }

    public static void sendPositionPacketWithYOffset(double yOffset, boolean onGround) {
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(MoveUtils.mc.thePlayer.posX, MoveUtils.mc.thePlayer.posY + yOffset, MoveUtils.mc.thePlayer.posZ, onGround));
    }

    public static float getMovingYaw() {
        return MoveUtils.getWarppedYaw(MoveUtils.mc.thePlayer.rotationYaw);
    }

    public static float getWarppedYaw(float yaw) {
        float a = MoveUtils.mc.thePlayer.moveForward;
        float a2 = MoveUtils.mc.thePlayer.moveStrafing;
        boolean a3 = a > 0.0f;
        boolean a4 = a < 0.0f;
        boolean a5 = a2 > 0.0f;
        boolean a6 = a2 < 0.0f;
        float a7 = 0.0f;
        a7 += 180.0f;
        a7 += (float)-45;
        return MathHelper.wrapAngleTo180_float((float)(a7 += yaw));
    }

    public static double getDefaultSpeed() {
        return MoveUtils.getDefaultSpeed(true);
    }

    public static double[] getWrappedSpeed(double offset) {
        return MoveUtils.warp(MoveUtils.mc.thePlayer.rotationYaw * MathUtils.round(Math.PI / 180), offset);
    }

    public static double[] warp(float x, double z) {
        return new double[]{(double)(-MathHelper.sin((float)x)) * z, (double)MathHelper.cos((float)x) * z};
    }

    public static double getDefaultSpeed(boolean meaningless) {
        if (!MoveUtils.shouldStopSprint()) {
        }
        double a = 0.2873;
        if (MoveUtils.mc.thePlayer != null && MoveUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = MoveUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
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
        MoveUtils.setSpeed(MoveUtils.hypot());
    }

    public static double hypot() {
        return Math.hypot((double)MoveUtils.mc.thePlayer.motionX, (double)MoveUtils.mc.thePlayer.motionZ);
    }

    public static void setSpeed(double speed) {
        if (!MoveUtils.isMoving()) {
            return;
        }
        double a = MoveUtils.getMovingDirection();
        MoveUtils.mc.thePlayer.motionX = (double)(-MathHelper.sin((float)((float)a))) * speed;
        MoveUtils.mc.thePlayer.motionZ = (double)MathHelper.cos((float)((float)a)) * speed;
    }

    public static double getMovingDirection() {
        float a = MoveUtils.mc.thePlayer.rotationYaw;
        if (MoveUtils.mc.thePlayer.moveForward < 0.0f) {
            a += 180.0f;
        }
        float a2 = 1.0f;
        if (MoveUtils.mc.thePlayer.moveForward < 0.0f) {
            a2 = -0.5f;
        } else if (MoveUtils.mc.thePlayer.moveForward > 0.0f) {
            a2 = 0.5f;
        }
        if (MoveUtils.mc.thePlayer.moveStrafing > 0.0f) {
            a -= 90.0f * a2;
        }
        if (MoveUtils.mc.thePlayer.moveStrafing < 0.0f) {
            a += 90.0f * a2;
        }
        return Math.toRadians((double)a);
    }

    public static float getMovingAngle() {
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

    public static double getJumpEffect(double a) {
        if (MoveUtils.mc.thePlayer.isPotionActive(Potion.jump)) {
            int a2 = MoveUtils.mc.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier();
            return a + (double)((float)(a2 + 1) * 0.1f);
        }
        return a;
    }

    public static float getJumpHeight() {
        PotionEffect a = MoveUtils.mc.thePlayer.getActivePotionEffect(Potion.jump);
        int a2 = a.getAmplifier() + 1;
        return MoveUtils.mc.thePlayer.getMaxFallHeight() + a2;
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
        MoveUtils.mc.thePlayer.motionX = a7 * a;
        MoveUtils.mc.thePlayer.motionZ = a8 * a;
    }

    public static void setSpeed2(double speed) {
        float a = MoveUtils.mc.thePlayer.rotationYaw;
        double a2 = MoveUtils.mc.thePlayer.moveForward;
        double a3 = MoveUtils.mc.thePlayer.moveStrafing;
        if (a2 == 0.0 && a3 == 0.0) {
            MoveUtils.mc.thePlayer.motionX = 0.0;
            MoveUtils.mc.thePlayer.motionZ = 0.0;
        } else {
            if (a2 != 0.0) {
                if (a3 > 0.0) {
                    a += (float)(a2 > 0.0 ? -45 : 45);
                } else if (a3 < 0.0) {
                    a += (float)(a2 > 0.0 ? 45 : -45);
                }
                a3 = 0.0;
                if (a2 > 0.0) {
                    a2 = 1.0;
                } else if (a2 < 0.0) {
                    a2 = -1.0;
                }
            }
            MoveUtils.mc.thePlayer.motionX = a2 * speed * Math.cos((double)Math.toRadians((double)(a + 90.0f))) + a3 * speed * Math.sin((double)Math.toRadians((double)(a + 90.0f)));
            MoveUtils.mc.thePlayer.motionZ = a2 * speed * Math.sin((double)Math.toRadians((double)(a + 90.0f))) - a3 * speed * Math.cos((double)Math.toRadians((double)(a + 90.0f)));
        }
    }

    public static double[] Method2488(double a) {
        boolean a2;
        double a3 = MoveUtils.mc.thePlayer.movementInput.moveForward;
        double a4 = MoveUtils.mc.thePlayer.movementInput.moveStrafe;
        float a5 = MoveUtils.mc.thePlayer.rotationYaw;
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
        int a = MathHelper.floor_double((double)MoveUtils.mc.thePlayer.getEntityBoundingBox().minX);
        String[] a2 = MoveUtils.trash();
        if (a < MathHelper.floor_double((double)MoveUtils.mc.thePlayer.getEntityBoundingBox().maxX) + 1) {
            int a3 = MathHelper.floor_double((double)MoveUtils.mc.thePlayer.getEntityBoundingBox().minY);
            if (a3 < MathHelper.floor_double((double)MoveUtils.mc.thePlayer.getEntityBoundingBox().maxY) + 1) {
                int a4 = MathHelper.floor_double((double)MoveUtils.mc.thePlayer.getEntityBoundingBox().minZ);
                if (a4 < MathHelper.floor_double((double)MoveUtils.mc.thePlayer.getEntityBoundingBox().maxZ) + 1) {
                    Block a5 = MoveUtils.mc.theWorld.getBlockState(new BlockPos(a, a3, a4)).getBlock();
                    if (!(a5 instanceof BlockAir)) {
                        AxisAlignedBB a6 = a5.getCollisionBoundingBox((World)MoveUtils.mc.theWorld, new BlockPos(a, a3, a4), MoveUtils.mc.theWorld.getBlockState(new BlockPos(a, a3, a4)));
                        if (a5 instanceof BlockHopper) {
                            a6 = new AxisAlignedBB((double)a, (double)a3, (double)a4, (double)(a + 1), (double)(a3 + 1), (double)(a4 + 1));
                        }
                        if (MoveUtils.mc.thePlayer.getEntityBoundingBox().intersectsWith(a6)) {
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
        MoveUtils.trash(new String[2]);
    }

    public static void trash(String[] stringArray) {
        trash = stringArray;
    }

    public static String[] trash() {
        return trash;
    }
}