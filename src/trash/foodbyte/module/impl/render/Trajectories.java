/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemEgg
 *  net.minecraft.item.ItemEnderPearl
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemSnowball
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Trajectories
extends Module {
    public static float Field2192 = 1.0f;
    private EntityLivingBase Field2193;
    private MovingObjectPosition Field2194 = null;
    private MovingObjectPosition Field2195 = null;

    public Trajectories() {
        super("Trajectories", Category.RENDER);
        this.setDescription("\u629b\u7269\u7ebf(\u4f7f\u7528\u5f13\u7bad\u96ea\u7403\u672b\u5f71\u73cd\u73e0\u6709\u4e00\u6761\u7ebf)");
    }

    @EventTarget(value=0)
    public void Method802(EventRender3D a2) {
        float a3;
        float a4;
        double a5;
        float f = 0.0f;
        float f2 = 0.99f;
        String a6 = Class492.Method2239();
        float a7 = 1.5f;
        if (Trajectories.mc.thePlayer.getHeldItem() == null) {
            return;
        }
        if (!(Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemBow && Trajectories.mc.thePlayer.isUsingItem() || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemFishingRod || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemSnowball || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemEnderPearl || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemEgg || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemPotion && ItemPotion.isSplash((int)Trajectories.mc.thePlayer.getHeldItem().getItemDamage()))) {
            return;
        }
        EntityPlayerSP a8 = Trajectories.mc.thePlayer;
        Item a9 = Trajectories.mc.thePlayer.getCurrentEquippedItem().getItem();
        boolean a10 = a9 instanceof ItemBow;
        double a11 = 1.0;
        if (a9 instanceof ItemBow) {
            a5 = 0.05;
            float a12 = (float)(72000 - a8.getItemInUseCount()) / 20.0f;
            if ((a12 = (a12 * a12 + a12 * 2.0f) / 3.0f) > 1.0f) {
                a12 = 1.0f;
            }
            a7 = a12 *= 3.0f;
        }
        if (a9 instanceof ItemFishingRod) {
            a4 = 0.92f;
            a5 = 0.04;
        }
        if (ItemPotion.isSplash((int)Trajectories.mc.thePlayer.getCurrentEquippedItem().getMetadata())) {
            a5 = 0.05;
            a3 = -20.0f;
            a7 = 0.5f;
        }
        a5 = 0.03;
        double a13 = a8.lastTickPosX + (a8.posX - a8.lastTickPosX) * (double)a2.Method3523() - Math.cos((double)Math.toRadians((double)a8.rotationYaw)) * (double)0.16f;
        double a14 = a8.lastTickPosY + (a8.posY - a8.lastTickPosY) * (double)a2.Method3523() + (double)a8.getEyeHeight() - 0.1;
        double a15 = a8.lastTickPosZ + (a8.posZ - a8.lastTickPosZ) * (double)a2.Method3523() - Math.sin((double)Math.toRadians((double)a8.rotationYaw)) * (double)0.16f;
        double a16 = (double)(-MathHelper.sin((float)(Trajectories.mc.thePlayer.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(Trajectories.mc.thePlayer.rotationPitch / 180.0f * (float)Math.PI))) * a11;
        double a17 = (double)(-MathHelper.sin((float)((Trajectories.mc.thePlayer.rotationPitch + a3) / 180.0f * (float)Math.PI))) * a11;
        double a18 = (double)(MathHelper.cos((float)(Trajectories.mc.thePlayer.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(Trajectories.mc.thePlayer.rotationPitch / 180.0f * (float)Math.PI))) * a11;
        float a19 = MathHelper.sqrt_double((double)(a16 * a16 + a17 * a17 + a18 * a18));
        a16 /= (double)a19;
        a17 /= (double)a19;
        a18 /= (double)a19;
        a16 *= (double)a7;
        a17 *= (double)a7;
        a18 *= (double)a7;
        GL11.glPushMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glColor4f((float)0.0f, (float)0.6451613f, (float)1.0f, (float)Field2192);
        GL11.glDisable((int)3553);
        GL11.glDepthMask((boolean)false);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)3);
        boolean a20 = false;
        EntityLivingBase a21 = null;
        if (a14 > 0.0) {
            BlockPos a22;
            Entity a23;
            Iterator iterator;
            Vec3 a24 = new Vec3(a8.posX, a8.posY + (double)a8.getEyeHeight(), a8.posZ);
            Vec3 a25 = new Vec3(a13, a14, a15);
            Vec3 a26 = new Vec3(a13 + a16, a14 + a17, a15 + a18);
            this.Field2194 = Trajectories.mc.theWorld.rayTraceBlocks(a24, a25);
            this.Field2194 = Trajectories.mc.theWorld.rayTraceBlocks(a25, a26, false, true, false);
            if (this.Field2194 != null) {
                a20 = true;
            }
            if ((iterator = Trajectories.mc.theWorld.getLoadedEntityList().Method1383()).Method932()) {
                a23 = (Entity)iterator.Method933();
                if (a23 instanceof EntityLivingBase && !(a23 instanceof EntityPlayerSP)) {
                    this.Field2193 = (EntityLivingBase)a23;
                    AxisAlignedBB a27 = this.Field2193.getEntityBoundingBox().expand(0.3, 0.3, 0.3);
                    this.Field2195 = a27.calculateIntercept(a24, a25);
                    if (this.Field2195 != null) {
                        a20 = true;
                        this.Field2194 = this.Field2195;
                        a21 = this.Field2193;
                    }
                }
            }
            if ((a23 = Trajectories.mc.theWorld.getBlockState(a22 = new BlockPos(a13 += a16, a14 += a17, a15 += a18)).getBlock()).getMaterial() == Material.water) {
                a16 *= 0.72;
                a17 *= 0.72;
                a18 *= 0.72;
            }
            a16 *= (double)a4;
            a17 *= (double)a4;
            a18 *= (double)a4;
            a17 -= a5;
            GL11.glVertex3d((double)(a13 - ReflectionUtils.getRenderPosX()), (double)(a14 - ReflectionUtils.getRenderPosY()), (double)(a15 - ReflectionUtils.getRenderPosZ()));
        }
        GL11.glEnd();
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.2f, (float)0.5f);
        GL11.glColor4f((float)0.0f, (float)0.6451613f, (float)1.0f, (float)0.5f);
        GL11.glTranslated((double)(a13 - ReflectionUtils.getRenderPosX() - 0.5), (double)(a14 - ReflectionUtils.getRenderPosY() - 0.5), (double)(a15 - ReflectionUtils.getRenderPosZ() - 0.5));
        if (this.Field2194 != null && this.Field2194.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            int a28 = this.Field2194.sideHit.getIndex();
            if (a28 == 2) {
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
            }
            if (a28 == 3) {
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
            }
            if (a28 == 4) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
            }
            if (a28 == 5) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
            }
            Trajectories.Method1629(new AxisAlignedBB(0.0, 0.5, 0.0, 1.0, 0.5, 1.0));
            Trajectories.Method2098(new AxisAlignedBB(0.0, 0.5, 0.0, 1.0, 0.5, 1.0));
        }
        GL11.glPopMatrix();
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3553);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
        double a29 = ReflectionUtils.getRenderPartialTicks();
        double a30 = a21.lastTickPosX + (a21.posX - a21.lastTickPosX) * a29 - ReflectionUtils.getRenderPosX();
        double a31 = a21.lastTickPosY + (a21.posY - a21.lastTickPosY) * a29 - ReflectionUtils.getRenderPosY();
        double a32 = a21.lastTickPosZ + (a21.posZ - a21.lastTickPosZ) * a29 - ReflectionUtils.getRenderPosZ();
        Color a33 = new Color(255, 0, 0);
        RenderUtils.Method1121(a30, a31, a32, (double)a21.width / 1.5, (double)a21.height + 0.2, (float)a33.getRed() / 255.0f, (float)a33.getGreen() / 255.0f, (float)a33.getBlue() / 255.0f, 1.0f);
    }

    public ArrayList Method241() {
        ArrayList a2 = new ArrayList();
        Iterator iterator = Trajectories.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            Object a3 = iterator.Method933();
            if (a3 == Trajectories.mc.thePlayer || !(a3 instanceof EntityLivingBase)) continue;
            a2.Method2530(a3);
        }
        return a2;
    }

    public Entity Method2108(boolean a2, Vec3 a3, Vec3 a4) {
        Iterator iterator = this.Method241().Method1383();
        while (iterator.Method932()) {
            Object a5 = iterator.Method933();
            EntityLivingBase a6 = (EntityLivingBase)a5;
            if (a6 == Trajectories.mc.thePlayer) continue;
            float a7 = 0.2f;
            AxisAlignedBB a8 = a6.getEntityBoundingBox().expand((double)a7, (double)a7, (double)a7);
            MovingObjectPosition a9 = a8.calculateIntercept(a3, a4);
            return a6;
        }
        return null;
    }

    public static void Method1629(AxisAlignedBB a2) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)a2.minX, (double)a2.minY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.minY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.minY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.minY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.maxY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.maxY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.maxY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.maxY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.minY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.maxY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.maxY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.minY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.minY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.maxY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.maxY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.minY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.minY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.minY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.maxX, (double)a2.maxY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.maxY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.minY, (double)a2.minZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.minY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.maxY, (double)a2.maxZ);
        GL11.glVertex3d((double)a2.minX, (double)a2.maxY, (double)a2.minZ);
        GL11.glEnd();
    }

    public static void Method2098(AxisAlignedBB a2) {
        Tessellator a3 = Tessellator.getInstance();
        WorldRenderer a4 = a3.getWorldRenderer();
        a4.begin(3, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(3, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(1, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a3.draw();
    }

    public void Method2109(float a2, float a3, float a4, float a5, int a6) {
        Trajectories.Method2111(a2, a3, a4, a3 + 0.5f, a6);
        Trajectories.Method2111(a2, a3 + 0.5f, a2 + 0.5f, a5, a6);
        Trajectories.Method2111(a4 - 0.5f, a3 + 0.5f, a4, a5 - 0.5f, a6);
        Trajectories.Method2111(a2 + 0.5f, a5 - 0.5f, a4, a5, a6);
    }

    public static void Method2110(double a2, double a3, double a4, double a5, float a6, float a7, float a8, float a9) {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a6, (float)a7, (float)a8, (float)a9);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glEnd();
        GlStateManager.disableTexture2D();
        GlStateManager.disableBlend();
        GL11.glPopMatrix();
    }

    public static void Method2111(double a2, double a3, double a4, double a5, int a6) {
        float a7 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a6 & 0xFF) / 255.0f;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a8, (float)a9, (float)a10, (float)a7);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glEnd();
        GlStateManager.disableTexture2D();
        GlStateManager.disableBlend();
        GL11.glPopMatrix();
    }

    public static void Method2112(double a2, double a3, double a4, double a5, int a6, int a7) {
        float a8 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a9 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a10 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a11 = (float)(a6 & 0xFF) / 255.0f;
        float a12 = (float)(a7 >> 24 & 0xFF) / 255.0f;
        float a13 = (float)(a7 >> 16 & 0xFF) / 255.0f;
        float a14 = (float)(a7 >> 8 & 0xFF) / 255.0f;
        float a15 = (float)(a7 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        GL11.glColor4f((float)a9, (float)a10, (float)a11, (float)a8);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glColor4f((float)a13, (float)a14, (float)a15, (float)a12);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
    }

    public void Method2113(Entity a2, AxisAlignedBB a3, float a4, float a5, float a6, float a7, float a8) {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)a4);
        GL11.glColor4f((float)a5, (float)a6, (float)a7, (float)a8);
        Trajectories.Method2099(a3);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
    }

    public static void Method2099(AxisAlignedBB a2) {
    }
}