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
import trash.foodbyte.utils.ReflectionUtils;
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
    public void Method802(EventRender3D a) {
        float a2;
        float a3;
        double a4;
        float f = 0.0f;
        float f2 = 0.99f;
        String a5 = Class492.Method2239();
        float a6 = 1.5f;
        if (Trajectories.mc.thePlayer.getHeldItem() == null) {
            return;
        }
        if (!(Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemBow && Trajectories.mc.thePlayer.isUsingItem() || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemFishingRod || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemSnowball || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemEnderPearl || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemEgg || Trajectories.mc.thePlayer.getHeldItem().getItem() instanceof ItemPotion && ItemPotion.isSplash((int)Trajectories.mc.thePlayer.getHeldItem().getItemDamage()))) {
            return;
        }
        EntityPlayerSP a7 = Trajectories.mc.thePlayer;
        Item a8 = Trajectories.mc.thePlayer.getCurrentEquippedItem().getItem();
        boolean a9 = a8 instanceof ItemBow;
        double a10 = 1.0;
        if (a8 instanceof ItemBow) {
            a4 = 0.05;
            float a11 = (float)(72000 - a7.getItemInUseCount()) / 20.0f;
            if ((a11 = (a11 * a11 + a11 * 2.0f) / 3.0f) > 1.0f) {
                a11 = 1.0f;
            }
            a6 = a11 *= 3.0f;
        }
        if (a8 instanceof ItemFishingRod) {
            a3 = 0.92f;
            a4 = 0.04;
        }
        if (ItemPotion.isSplash((int)Trajectories.mc.thePlayer.getCurrentEquippedItem().getMetadata())) {
            a4 = 0.05;
            a2 = -20.0f;
            a6 = 0.5f;
        }
        a4 = 0.03;
        double a12 = a7.lastTickPosX + (a7.posX - a7.lastTickPosX) * (double)a.Method3523() - Math.cos((double)Math.toRadians((double)a7.rotationYaw)) * (double)0.16f;
        double a13 = a7.lastTickPosY + (a7.posY - a7.lastTickPosY) * (double)a.Method3523() + (double)a7.getEyeHeight() - 0.1;
        double a14 = a7.lastTickPosZ + (a7.posZ - a7.lastTickPosZ) * (double)a.Method3523() - Math.sin((double)Math.toRadians((double)a7.rotationYaw)) * (double)0.16f;
        double a15 = (double)(-MathHelper.sin((float)(Trajectories.mc.thePlayer.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(Trajectories.mc.thePlayer.rotationPitch / 180.0f * (float)Math.PI))) * a10;
        double a16 = (double)(-MathHelper.sin((float)((Trajectories.mc.thePlayer.rotationPitch + a2) / 180.0f * (float)Math.PI))) * a10;
        double a17 = (double)(MathHelper.cos((float)(Trajectories.mc.thePlayer.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(Trajectories.mc.thePlayer.rotationPitch / 180.0f * (float)Math.PI))) * a10;
        float a18 = MathHelper.sqrt_double((double)(a15 * a15 + a16 * a16 + a17 * a17));
        a15 /= (double)a18;
        a16 /= (double)a18;
        a17 /= (double)a18;
        a15 *= (double)a6;
        a16 *= (double)a6;
        a17 *= (double)a6;
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
        boolean a19 = false;
        EntityLivingBase a20 = null;
        if (a13 > 0.0) {
            BlockPos a21;
            Entity a22;
            Iterator iterator;
            Vec3 a23 = new Vec3(a7.posX, a7.posY + (double)a7.getEyeHeight(), a7.posZ);
            Vec3 a24 = new Vec3(a12, a13, a14);
            Vec3 a25 = new Vec3(a12 + a15, a13 + a16, a14 + a17);
            this.Field2194 = Trajectories.mc.theWorld.rayTraceBlocks(a23, a24);
            this.Field2194 = Trajectories.mc.theWorld.rayTraceBlocks(a24, a25, false, true, false);
            if (this.Field2194 != null) {
                a19 = true;
            }
            if ((iterator = Trajectories.mc.theWorld.getLoadedEntityList().Method1383()).Method932()) {
                a22 = (Entity)iterator.Method933();
                if (a22 instanceof EntityLivingBase && !(a22 instanceof EntityPlayerSP)) {
                    this.Field2193 = (EntityLivingBase)a22;
                    AxisAlignedBB a26 = this.Field2193.getEntityBoundingBox().expand(0.3, 0.3, 0.3);
                    this.Field2195 = a26.calculateIntercept(a23, a24);
                    if (this.Field2195 != null) {
                        a19 = true;
                        this.Field2194 = this.Field2195;
                        a20 = this.Field2193;
                    }
                }
            }
            if ((a22 = Trajectories.mc.theWorld.getBlockState(a21 = new BlockPos(a12 += a15, a13 += a16, a14 += a17)).getBlock()).getMaterial() == Material.water) {
                a15 *= 0.72;
                a16 *= 0.72;
                a17 *= 0.72;
            }
            a15 *= (double)a3;
            a16 *= (double)a3;
            a17 *= (double)a3;
            a16 -= a4;
            GL11.glVertex3d((double)(a12 - ReflectionUtils.Method2591()), (double)(a13 - ReflectionUtils.Method2592()), (double)(a14 - ReflectionUtils.Method2593()));
        }
        GL11.glEnd();
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.2f, (float)0.5f);
        GL11.glColor4f((float)0.0f, (float)0.6451613f, (float)1.0f, (float)0.5f);
        GL11.glTranslated((double)(a12 - ReflectionUtils.Method2591() - 0.5), (double)(a13 - ReflectionUtils.Method2592() - 0.5), (double)(a14 - ReflectionUtils.Method2593() - 0.5));
        if (this.Field2194 != null && this.Field2194.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            int a27 = this.Field2194.sideHit.getIndex();
            if (a27 == 2) {
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
            }
            if (a27 == 3) {
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
            }
            if (a27 == 4) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                Trajectories.Method1629(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
                Trajectories.Method2098(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
            }
            if (a27 == 5) {
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
        double a28 = ReflectionUtils.Method2587();
        double a29 = a20.lastTickPosX + (a20.posX - a20.lastTickPosX) * a28 - ReflectionUtils.Method2591();
        double a30 = a20.lastTickPosY + (a20.posY - a20.lastTickPosY) * a28 - ReflectionUtils.Method2592();
        double a31 = a20.lastTickPosZ + (a20.posZ - a20.lastTickPosZ) * a28 - ReflectionUtils.Method2593();
        Color a32 = new Color(255, 0, 0);
        RenderUtils.Method1121(a29, a30, a31, (double)a20.width / 1.5, (double)a20.height + 0.2, (float)a32.getRed() / 255.0f, (float)a32.getGreen() / 255.0f, (float)a32.getBlue() / 255.0f, 1.0f);
    }

    public ArrayList Method241() {
        ArrayList a = new ArrayList();
        Iterator iterator = Trajectories.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            Object a2 = iterator.Method933();
            if (a2 == Trajectories.mc.thePlayer || !(a2 instanceof EntityLivingBase)) continue;
            a.Method2530(a2);
        }
        return a;
    }

    public Entity Method2108(boolean a, Vec3 a2, Vec3 a3) {
        Iterator iterator = this.Method241().Method1383();
        while (iterator.Method932()) {
            Object a4 = iterator.Method933();
            EntityLivingBase a5 = (EntityLivingBase)a4;
            if (a5 == Trajectories.mc.thePlayer) continue;
            float a6 = 0.2f;
            AxisAlignedBB a7 = a5.getEntityBoundingBox().expand((double)a6, (double)a6, (double)a6);
            MovingObjectPosition a8 = a7.calculateIntercept(a2, a3);
            return a5;
        }
        return null;
    }

    public static void Method1629(AxisAlignedBB a) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)a.minX, (double)a.minY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.minY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.minY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.minY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.maxY, (double)a.minZ);
        GL11.glVertex3d((double)a.minX, (double)a.maxY, (double)a.maxZ);
        GL11.glVertex3d((double)a.maxX, (double)a.maxY, (double)a.maxZ);
        GL11.glVertex3d((double)a.maxX, (double)a.maxY, (double)a.minZ);
        GL11.glVertex3d((double)a.minX, (double)a.minY, (double)a.minZ);
        GL11.glVertex3d((double)a.minX, (double)a.maxY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.maxY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.minY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.minY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.maxY, (double)a.minZ);
        GL11.glVertex3d((double)a.maxX, (double)a.maxY, (double)a.maxZ);
        GL11.glVertex3d((double)a.maxX, (double)a.minY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.minY, (double)a.maxZ);
        GL11.glVertex3d((double)a.maxX, (double)a.minY, (double)a.maxZ);
        GL11.glVertex3d((double)a.maxX, (double)a.maxY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.maxY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.minY, (double)a.minZ);
        GL11.glVertex3d((double)a.minX, (double)a.minY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.maxY, (double)a.maxZ);
        GL11.glVertex3d((double)a.minX, (double)a.maxY, (double)a.minZ);
        GL11.glEnd();
    }

    public static void Method2098(AxisAlignedBB a) {
        Tessellator a2 = Tessellator.getInstance();
        WorldRenderer a3 = a2.getWorldRenderer();
        a3.begin(3, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a2.draw();
        a3.begin(3, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a2.draw();
        a3.begin(1, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a2.draw();
    }

    public void Method2109(float a, float a2, float a3, float a4, int a5) {
        Trajectories.Method2111(a, a2, a3, a2 + 0.5f, a5);
        Trajectories.Method2111(a, a2 + 0.5f, a + 0.5f, a4, a5);
        Trajectories.Method2111(a3 - 0.5f, a2 + 0.5f, a3, a4 - 0.5f, a5);
        Trajectories.Method2111(a + 0.5f, a4 - 0.5f, a3, a4, a5);
    }

    public static void Method2110(double a, double a2, double a3, double a4, float a5, float a6, float a7, float a8) {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a5, (float)a6, (float)a7, (float)a8);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glEnd();
        GlStateManager.disableTexture2D();
        GlStateManager.disableBlend();
        GL11.glPopMatrix();
    }

    public static void Method2111(double a, double a2, double a3, double a4, int a5) {
        float a6 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a7 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a9 = (float)(a5 & 0xFF) / 255.0f;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a7, (float)a8, (float)a9, (float)a6);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glEnd();
        GlStateManager.disableTexture2D();
        GlStateManager.disableBlend();
        GL11.glPopMatrix();
    }

    public static void Method2112(double a, double a2, double a3, double a4, int a5, int a6) {
        float a7 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a5 & 0xFF) / 255.0f;
        float a11 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a12 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a13 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a14 = (float)(a6 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        GL11.glColor4f((float)a8, (float)a9, (float)a10, (float)a7);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glColor4f((float)a12, (float)a13, (float)a14, (float)a11);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
    }

    public void Method2113(Entity a, AxisAlignedBB a2, float a3, float a4, float a5, float a6, float a7) {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)a3);
        GL11.glColor4f((float)a4, (float)a5, (float)a6, (float)a7);
        Trajectories.Method2099(a2);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
    }

    public static void Method2099(AxisAlignedBB a) {
    }
}