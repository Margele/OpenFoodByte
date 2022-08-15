/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLadder
 *  net.minecraft.block.BlockVine
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 */
package awsl;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class334 {
    public static float[] Method1163(EntityLivingBase a) {
        double a2 = a.posX;
        double a3 = a.posZ;
        double a4 = a.posY + (double)(a.getEyeHeight() / 2.0f);
        return Class334.Method1166(a2, a3, a4);
    }

    public static float[] Method1164(Entity a) {
        return null;
    }

    public static float[] Method1165(Entity a) {
        double a2 = a.posX - a.lastTickPosX;
        double a3 = a.posZ - a.lastTickPosZ;
        double a4 = Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a);
        a4 -= a4 % 0.8;
        double a5 = 1.0;
        double a6 = 1.0;
        boolean a7 = a.isSprinting();
        a5 = a4 / 0.8 * a2 * 1.25;
        a6 = a4 / 0.8 * a3 * 1.25;
        double a8 = a.posX + a5 - Minecraft.getMinecraft().thePlayer.posX;
        double a9 = a.posZ + a6 - Minecraft.getMinecraft().thePlayer.posZ;
        double a10 = Minecraft.getMinecraft().thePlayer.posY + (double)Minecraft.getMinecraft().thePlayer.getEyeHeight() - (a.posY + (double)a.getEyeHeight());
        double a11 = Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a);
        float a12 = (float)Math.toDegrees((double)Math.atan2((double)a9, (double)a8)) - 90.0f;
        float a13 = (float)Math.toDegrees((double)Math.atan2((double)a10, (double)a11));
        return new float[]{a12, a13};
    }

    public static float[] Method1166(double a, double a2, double a3) {
        double a4 = a - Minecraft.getMinecraft().thePlayer.posX;
        double a5 = a2 - Minecraft.getMinecraft().thePlayer.posZ;
        double a6 = a3 - Minecraft.getMinecraft().thePlayer.posY - 0.6;
        double a7 = MathHelper.sqrt_double((double)(a4 * a4 + a5 * a5));
        float a8 = (float)(Math.atan2((double)a5, (double)a4) * 180.0 / Math.PI) - 90.0f;
        float a9 = (float)(-(Math.atan2((double)a6, (double)a7) * 180.0 / Math.PI));
        return new float[]{a8, a9};
    }

    public static float Method1167(float a, float a2, float a3) {
        float a4 = 0.006f;
        float a5 = a3 * a3 * a3 * a3 - a4 * (a4 * (a * a) + 2.0f * a2 * (a3 * a3));
        return (float)Math.toDegrees((double)Math.atan((double)(((double)(a3 * a3) - Math.sqrt((double)a5)) / (double)(a4 * a))));
    }

    /*
     * WARNING - void declaration
     */
    public static float Method1168(double a, double a2) {
        double a3;
        void a4;
        double d = a - Minecraft.getMinecraft().thePlayer.posX;
        int[] a5 = RenderUtils.Method1148();
        double a6 = a2 - Minecraft.getMinecraft().thePlayer.posZ;
        if (a6 < 0.0 && a4 < 0.0) {
            a3 = 90.0 + Math.toDegrees((double)Math.atan((double)(a6 / a4)));
        }
        if (a6 < 0.0 && a4 > 0.0) {
            a3 = -90.0 + Math.toDegrees((double)Math.atan((double)(a6 / a4)));
        }
        a3 = Math.toDegrees((double)(-Math.atan((double)(a4 / a6))));
        return MathHelper.wrapAngleTo180_float((float)(-(Minecraft.getMinecraft().thePlayer.rotationYaw - (float)a3)));
    }

    public static float Method1169(Entity a, double a2) {
        double a3 = a.posX - Minecraft.getMinecraft().thePlayer.posX;
        double a4 = a.posZ - Minecraft.getMinecraft().thePlayer.posZ;
        double a5 = a2 - 2.2 + (double)a.getEyeHeight() - Minecraft.getMinecraft().thePlayer.posY;
        double a6 = MathHelper.sqrt_double((double)(a3 * a3 + a4 * a4));
        double a7 = -Math.toDegrees((double)Math.atan((double)(a5 / a6)));
        return -MathHelper.wrapAngleTo180_float((float)(Minecraft.getMinecraft().thePlayer.rotationPitch - (float)a7)) - 2.5f;
    }

    public static float Method1170(float a) {
        if ((a %= 360.0f) >= 180.0f) {
            a -= 360.0f;
        }
        if (a < -180.0f) {
            a += 360.0f;
        }
        return a;
    }

    public static float Method1171(float a, float a2) {
        float a3 = Math.abs((float)(a - a2)) % 360.0f;
        if (a3 > 180.0f) {
            a3 = 360.0f - a3;
        }
        return a3;
    }

    public static Vec3 Method1172() {
        EntityPlayerSP a = Minecraft.getMinecraft().thePlayer;
        float a2 = (float)Math.PI / 180;
        float a3 = (float)Math.PI;
        float a4 = MathHelper.cos((float)(-a.rotationYaw * a2 - a3));
        float a5 = MathHelper.sin((float)(-a.rotationYaw * a2 - a3));
        float a6 = -MathHelper.cos((float)(-a.rotationPitch * a2));
        float a7 = MathHelper.sin((float)(-a.rotationPitch * a2));
        return new Vec3((double)(a5 * a6), (double)a7, (double)(a4 * a6));
    }

    public static float[] Method1173(double a, double a2, double a3) {
        EntityPlayerSP a4 = Minecraft.getMinecraft().thePlayer;
        double a5 = a - a4.posX;
        double a6 = a2 - (a4.posY + (double)a4.getEyeHeight());
        double a7 = a3 - a4.posZ;
        double a8 = MathHelper.sqrt_double((double)(a5 * a5 + a7 * a7));
        float a9 = (float)(Math.atan2((double)a7, (double)a5) * 180.0 / Math.PI) - 90.0f;
        float a10 = (float)(-(Math.atan2((double)a6, (double)a8) * 180.0 / Math.PI));
        return new float[]{a9, a10};
    }

    public static float[] Method1174(EntityLivingBase a) {
        if (Class334.Method1175()) {
            return Class334.Method1173(a.posX + MathUtils.Method552(0.03, -0.03), a.posY + (double)a.getEyeHeight() - 0.4 + MathUtils.Method552(0.07, -0.07), a.posZ + MathUtils.Method552(0.03, -0.03));
        }
        return Class334.Method1173(a.posX, a.posY + (double)a.getEyeHeight() - 0.4, a.posZ);
    }

    public static final boolean Method1175() {
        return Minecraft.getMinecraft().thePlayer.moveForward != 0.0f || Minecraft.getMinecraft().thePlayer.moveStrafing != 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean Method1176(BlockPos a, BlockPos a2) {
        void a3;
        int a4 = a.getX();
        int n = a.getY();
        int[] a5 = RenderUtils.Method1148();
        int a6 = a.getZ();
        int a7 = a2.getX();
        int a8 = a2.getY();
        int a9 = a2.getZ();
        double a10 = a7 - a4;
        double a11 = a8 - a3;
        double a12 = a9 - a6;
        double a13 = a4;
        double a14 = (double)a3;
        double a15 = a6;
        double a16 = 0.1;
        int a17 = 0;
        int a18 = (int)Math.max((double)Math.abs((double)a10), (double)Math.max((double)Math.abs((double)a11), (double)Math.abs((double)a12))) * 4;
        if (a17 < a18 - 1) {
            BlockPos a19;
            Block a20;
            if (!((a13 += a10 / (double)a18) == (double)a7 && (a14 += a11 / (double)a18) == (double)a8 && (a15 += a12 / (double)a18) == (double)a9 || (a20 = Minecraft.getMinecraft().theWorld.getBlockState(a19 = new BlockPos(a13, a14, a15)).getBlock()).getMaterial() == Material.air || a20.getMaterial() == Material.water || a20 instanceof BlockVine || a20 instanceof BlockLadder)) {
                return true;
            }
            ++a17;
        }
        return false;
    }

    public static float[] Method1177(EntityLivingBase a) {
        return null;
    }
}