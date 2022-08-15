/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.tileentity.TileEntityEnderChest
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class281;
import awsl.Class492;
import awsl.Class667;
import awsl.Class91;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class StorageESP
extends Module {
    public ModeValue Field2185 = new ModeValue("StorageESP", "ESP Mode", "OutLine", new String[]{"OutLine", "Box"});
    public BooleanValue Field2186 = new BooleanValue("StorageESP", "Chest", (Boolean)true, "\u666e\u901a\u7bb1\u5b50\u548c\u9677\u9631\u7bb1");
    public BooleanValue Field2187 = new BooleanValue("StorageESP", "EnderChest", (Boolean)true, "\u672b\u5f71\u7bb1");

    public StorageESP() {
        super("StorageESP", "Storage ESP", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u7bb1\u5b50\u900f\u89c6";
    }

    @EventTarget(value=0)
    public void Method802(EventRender3D a) {
        TileEntity a2;
        Iterator iterator;
        String a3 = Class492.Method2239();
        if (Class281.Method3049(Class667.SG) && Class281.Method3060()) {
            return;
        }
        if (Class281.Method3050() || Class281.Method3061()) {
            return;
        }
        if (this.Field2185.isCurrentMode("OutLine")) {
            iterator = StorageESP.mc.theWorld.loadedTileEntityList.Method1383();
            while (iterator.Method932()) {
                a2 = (TileEntity)iterator.Method933();
                Color a4 = null;
                if (a2 instanceof TileEntityChest && this.Field2186.getValue()) {
                    if (((TileEntityChest)a2).getChestType() == 1) {
                        a4 = new Color(255, 0, 0);
                    } else if (((TileEntityChest)a2).getChestType() == 0) {
                        a4 = new Color(255, 161, 27);
                    }
                }
                if (a2 instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                    a4 = new Color(225, 0, 255);
                }
            }
        }
        if (this.Field2185.isCurrentMode("Box") && (iterator = StorageESP.mc.theWorld.loadedTileEntityList.Method1383()).Method932()) {
            double a5;
            double a6;
            a2 = (TileEntity)iterator.Method933();
            Color a7 = new Color(0);
            if (a2 instanceof TileEntityChest && this.Field2186.getValue()) {
                if (((TileEntityChest)a2).getChestType() == 1) {
                    a7 = new Color(255, 0, 0, 155);
                }
                if (((TileEntityChest)a2).getChestType() == 0) {
                    a7 = new Color(255, 161, 27, 155);
                }
                a6 = (double)a2.getPos().getX() - ReflectionUtils.Method2591();
                double a8 = (double)a2.getPos().getY() - ReflectionUtils.Method2592();
                a5 = (double)a2.getPos().getZ() - ReflectionUtils.Method2593();
                RenderUtils.Method1134(a6, a8, a5, a7.getRGB(), a7.getRGB(), 1.0f);
            }
            if (a2 instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                a7 = new Color(225, 0, 255, 155);
                a6 = (double)a2.getPos().getX() - ReflectionUtils.Method2591();
                double a9 = (double)a2.getPos().getY() - ReflectionUtils.Method2592();
                a5 = (double)a2.getPos().getZ() - ReflectionUtils.Method2593();
                RenderUtils.Method1134(a6, a9, a5, a7.getRGB(), a7.getRGB(), 1.0f);
            }
        }
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableBlend();
    }

    public static void Method1178(BlockPos a) {
        double a2 = (double)a.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
        double a3 = (double)a.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
        double a4 = (double)a.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4d((double)255.0, (double)170.0, (double)0.0, (double)1.0);
        StorageESP.Method2099(new AxisAlignedBB(a2, a3, a4, a2 + 1.0, a3 + 1.0, a4 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method2096(BlockPos a) {
        double a2 = (double)a.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
        double a3 = (double)a.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
        double a4 = (double)a.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4d((double)170.0, (double)0.0, (double)170.0, (double)1.0);
        StorageESP.Method2099(new AxisAlignedBB(a2, a3, a4, a2 + 1.0, a3 + 1.0, a4 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method2097(AxisAlignedBB a, float a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9, float a10, boolean a11, boolean a12) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GlStateManager.disableLighting();
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)a2, (float)a3, (float)a4, (float)a5);
        StorageESP.Method2098(new AxisAlignedBB(a.minX, a.minY, a.minZ, a.maxX, a.maxY, a.maxZ));
        GL11.glLineWidth((float)a10);
        GL11.glColor4f((float)a6, (float)a7, (float)a8, (float)a9);
        StorageESP.Method1629(new AxisAlignedBB(a.minX, a.minY, a.minZ, a.maxX, a.maxY, a.maxZ));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GlStateManager.enableLighting();
        RenderHelper.disableStandardItemLighting();
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method1629(AxisAlignedBB a) {
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

    public static void Method2098(AxisAlignedBB a) {
        Tessellator a2 = Tessellator.getInstance();
        WorldRenderer a3 = a2.getWorldRenderer();
        a3.begin(7, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a2.draw();
        a3.begin(7, DefaultVertexFormats.POSITION);
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        String string = Class492.Method2239();
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a2.draw();
        a3.begin(7, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a2.draw();
        a3.begin(7, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a2.draw();
        a3.begin(7, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a2.draw();
        a3.begin(7, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        String a4 = string;
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a2.draw();
        if (Class91.Method3648() == null) {
            Class492.Method2238("H8VUSc");
        }
    }

    public static void Method2099(AxisAlignedBB a) {
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
}