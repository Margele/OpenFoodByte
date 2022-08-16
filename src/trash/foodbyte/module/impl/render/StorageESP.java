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

import awsl.Class492;
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
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;
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
    public void Method802(EventRender3D a2) {
        TileEntity a3;
        Iterator iterator;
        String a4 = Class492.Method2239();
        if (ServerUtils.isSinglePlayer(Servers.SG) && ServerUtils.isStartingGame()) {
            return;
        }
        if (ServerUtils.isPlayingSkyblock() || ServerUtils.isPlayingMurderMystery()) {
            return;
        }
        if (this.Field2185.isCurrentMode("OutLine")) {
            iterator = StorageESP.mc.theWorld.loadedTileEntityList.Method1383();
            while (iterator.Method932()) {
                a3 = (TileEntity)iterator.Method933();
                Color a5 = null;
                if (a3 instanceof TileEntityChest && this.Field2186.getValue()) {
                    if (((TileEntityChest)a3).getChestType() == 1) {
                        a5 = new Color(255, 0, 0);
                    } else if (((TileEntityChest)a3).getChestType() == 0) {
                        a5 = new Color(255, 161, 27);
                    }
                }
                if (a3 instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                    a5 = new Color(225, 0, 255);
                }
            }
        }
        if (this.Field2185.isCurrentMode("Box") && (iterator = StorageESP.mc.theWorld.loadedTileEntityList.Method1383()).Method932()) {
            double a6;
            double a7;
            a3 = (TileEntity)iterator.Method933();
            Color a8 = new Color(0);
            if (a3 instanceof TileEntityChest && this.Field2186.getValue()) {
                if (((TileEntityChest)a3).getChestType() == 1) {
                    a8 = new Color(255, 0, 0, 155);
                }
                if (((TileEntityChest)a3).getChestType() == 0) {
                    a8 = new Color(255, 161, 27, 155);
                }
                a7 = (double)a3.getPos().getX() - ReflectionUtils.getRenderPosX();
                double a9 = (double)a3.getPos().getY() - ReflectionUtils.getRenderPosY();
                a6 = (double)a3.getPos().getZ() - ReflectionUtils.getRenderPosZ();
                RenderUtils.Method1134(a7, a9, a6, a8.getRGB(), a8.getRGB(), 1.0f);
            }
            if (a3 instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                a8 = new Color(225, 0, 255, 155);
                a7 = (double)a3.getPos().getX() - ReflectionUtils.getRenderPosX();
                double a10 = (double)a3.getPos().getY() - ReflectionUtils.getRenderPosY();
                a6 = (double)a3.getPos().getZ() - ReflectionUtils.getRenderPosZ();
                RenderUtils.Method1134(a7, a10, a6, a8.getRGB(), a8.getRGB(), 1.0f);
            }
        }
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableBlend();
    }

    public static void Method1178(BlockPos a2) {
        double a3 = (double)a2.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
        double a4 = (double)a2.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
        double a5 = (double)a2.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4d((double)255.0, (double)170.0, (double)0.0, (double)1.0);
        StorageESP.Method2099(new AxisAlignedBB(a3, a4, a5, a3 + 1.0, a4 + 1.0, a5 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method2096(BlockPos a2) {
        double a3 = (double)a2.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
        double a4 = (double)a2.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
        double a5 = (double)a2.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4d((double)170.0, (double)0.0, (double)170.0, (double)1.0);
        StorageESP.Method2099(new AxisAlignedBB(a3, a4, a5, a3 + 1.0, a4 + 1.0, a5 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method2097(AxisAlignedBB a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9, float a10, float a11, boolean a12, boolean a13) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GlStateManager.disableLighting();
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)a6);
        StorageESP.Method2098(new AxisAlignedBB(a2.minX, a2.minY, a2.minZ, a2.maxX, a2.maxY, a2.maxZ));
        GL11.glLineWidth((float)a11);
        GL11.glColor4f((float)a7, (float)a8, (float)a9, (float)a10);
        StorageESP.Method1629(new AxisAlignedBB(a2.minX, a2.minY, a2.minZ, a2.maxX, a2.maxY, a2.maxZ));
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

    public static void Method1629(AxisAlignedBB a2) {
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

    public static void Method2098(AxisAlignedBB a2) {
        Tessellator a3 = Tessellator.getInstance();
        WorldRenderer a4 = a3.getWorldRenderer();
        a4.begin(7, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a3.draw();
        a4.begin(7, DefaultVertexFormats.POSITION);
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        String string = Class492.Method2239();
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a3.draw();
        a4.begin(7, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(7, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(7, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(7, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        String a5 = string;
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a3.draw();
        if (a.trash() == null) {
            Class492.Method2238("H8VUSc");
        }
    }

    public static void Method2099(AxisAlignedBB a2) {
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
}