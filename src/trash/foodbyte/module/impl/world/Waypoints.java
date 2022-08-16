/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.world;

import awsl.Class260;
import awsl.Class448;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Waypoints
extends Module {
    public BooleanValue Field2279 = new BooleanValue("Waypoints", "Distance", (Boolean)true, "\u663e\u793a\u6807\u8bb0\u7684\u8ddd\u79bb");

    public Waypoints() {
        super("Waypoints", Category.WORLD);
        this.setDescription("\u6807\u8bb0\u6307\u5b9a\u5750\u6807\u663e\u793a\u5728\u5c4f\u5e55\u4e0a \u6253\u5f00\u6307\u4ee4\u53f0\u4f7f\u7528-wp help\u67e5\u770b");
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        if (!mc.isSingleplayer() && mc.getCurrentServerData() != null) {
            GlobalModule.INSTANCE.Method2009().Method2265().forEach(arg_0 -> this.Method2250(a, arg_0));
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void Method2248(Class260 a2, double a3, double a4, double a5, double a6, Entity a7) {
        void a8;
        float a9 = (float)(a2.Method2837() - (double)((float)a4) + 0.5);
        float a10 = (float)(a2.Method2838() - (double)((float)a5) + 1.0);
        float f = (float)(a2.Method2839() - (double)((float)a6) + 0.5);
        double a11 = Math.sqrt((double)(a9 * a9 + a10 * a10 + a8 * a8));
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        a[] a12 = Class448.Method2461();
        FontRenderer a13 = Waypoints.mc.fontRendererObj;
    }

    public void Method810(EventRender2D a2) {
        if (!mc.isSingleplayer() && mc.getCurrentServerData() != null) {
            GlobalModule.INSTANCE.Method2009().Method2265().forEach(arg_0 -> this.Method2249(a2, arg_0));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Method1734(Vec3 a2) {
        if (!(a2.xCoord > -1.0)) return false;
        if (!(a2.zCoord < 1.0)) return false;
        double d = a2.xCoord;
        int n = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d / (double)n >= 0.0)) return false;
        double d2 = a2.xCoord;
        int n2 = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d2 / (double)n2 <= (double)Display.getWidth())) return false;
        double d3 = a2.yCoord;
        int n3 = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d3 / (double)n3 >= 0.0)) return false;
        double d4 = a2.yCoord;
        int n4 = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d4 / (double)n4 <= (double)Display.getHeight())) return false;
        return true;
    }

    private void Method2249(EventRender2D a2, Class260 a3) {
        a[] a4 = Class448.Method2461();
        if (Waypoints.mc.getCurrentServerData().serverIP.equals((Object)a3.Method2836()) && Waypoints.mc.thePlayer.dimension == a3.Method2840() || !this.Method1734(new Vec3(a3.Method2837(), a3.Method2838(), a3.Method2839()))) {
            double a5 = a3.Method2837();
            double a6 = a3.Method2838();
            double a7 = a3.Method2839();
            AxisAlignedBB a8 = new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.94, 0.875, 0.94).offset(a5 - ReflectionUtils.getRenderPosX(), a6 - ReflectionUtils.getRenderPosY(), a7 - ReflectionUtils.getRenderPosZ());
            List a9 = Arrays.asList((Object[])new Vector3d[]{new Vector3d(a5 + a8.minX - a8.maxX + 0.5, a6, a7 + a8.minZ - a8.maxZ + 0.5), new Vector3d(a5 + a8.maxX - a8.minX - 0.5, a6, a7 + a8.minZ - a8.maxZ + 0.5), new Vector3d(a5 + a8.minX - a8.maxX + 0.5, a6, a7 + a8.maxZ - a8.minZ - 0.5), new Vector3d(a5 + a8.maxX - a8.minX - 0.5, a6, a7 + a8.maxZ - a8.minZ - 0.5), new Vector3d(a5 + a8.minX - a8.maxX + 0.5, a6 + a8.maxY - a8.minY, a7 + a8.minZ - a8.maxZ + 0.5), new Vector3d(a5 + a8.maxX - a8.minX - 0.5, a6 + a8.maxY - a8.minY, a7 + a8.minZ - a8.maxZ + 0.5), new Vector3d(a5 + a8.minX - a8.maxX + 0.5, a6 + a8.maxY - a8.minY, a7 + a8.maxZ - a8.minZ - 0.5), new Vector3d(a5 + a8.maxX - a8.minX - 0.5, a6 + a8.maxY - a8.minY, a7 + a8.maxZ - a8.minZ - 0.5)});
            ReflectionUtils.setupCameraTransform(a2.Field2923, 0);
            Vector4d a10 = null;
            Iterator iterator = a9.Method1383();
            if (iterator.Method932()) {
                Vector3d a11 = (Vector3d)iterator.Method933();
                a11 = RenderUtils.Method1136(a11.x - Waypoints.mc.getRenderManager().viewerPosX, a11.y - Waypoints.mc.getRenderManager().viewerPosY, a11.z - Waypoints.mc.getRenderManager().viewerPosZ);
                if (a11.z >= 0.0 && a11.z < 1.0) {
                    a10 = new Vector4d(a11.x, a11.y, a11.z, 0.0);
                    a10.x = Math.min((double)a11.x, (double)a10.x);
                    a10.y = Math.min((double)a11.y, (double)a10.y);
                    a10.z = Math.max((double)a11.x, (double)a10.z);
                    a10.w = Math.max((double)a11.y, (double)a10.w);
                }
            }
            Waypoints.mc.entityRenderer.setupOverlayRendering();
            GL11.glPushMatrix();
            float a12 = (float)a10.x;
            float a13 = (float)a10.z;
            float a14 = (float)a10.y;
            String a15 = "[" + Math.round((double)Waypoints.mc.thePlayer.getDistance(a3.Method2837(), a3.Method2838(), a3.Method2839())) + "m]" + a3.Method2835();
            RenderUtils.Method1103(a12 + (a13 - a12) / 2.0f - (float)(Waypoints.mc.fontRendererObj.getStringWidth(a15) / 2) - 2.0f, a14 - (float)Waypoints.mc.fontRendererObj.FONT_HEIGHT + 4.0f, Waypoints.mc.fontRendererObj.getStringWidth(a15) + 2, Waypoints.mc.fontRendererObj.FONT_HEIGHT, new Color(0, 0, 0, 120).getRGB());
            Waypoints.mc.fontRendererObj.drawStringWithShadow(a15, a12 + (a13 - a12) / 2.0f - (float)(Waypoints.mc.fontRendererObj.getStringWidth(a15) / 2), a14 - (float)(Waypoints.mc.fontRendererObj.FONT_HEIGHT / 2), -1);
            GL11.glPopMatrix();
        }
    }

    private void Method2250(EventRender3D a2, Class260 a3) {
        if (Waypoints.mc.getCurrentServerData().serverIP.equals((Object)a3.Method2836()) && Waypoints.mc.thePlayer.dimension == a3.Method2840()) {
            Entity a4 = Minecraft.getMinecraft().getRenderViewEntity();
            double a5 = a4.lastTickPosX + (a4.posX - a4.lastTickPosX) * (double)a2.Field2922;
            double a6 = a4.lastTickPosY + (a4.posY - a4.lastTickPosY) * (double)a2.Field2922;
            double a7 = a4.lastTickPosZ + (a4.posZ - a4.lastTickPosZ) * (double)a2.Field2922;
            this.Method2248(a3, 12.0, a5, a6, a7, a4);
            RenderHelper.disableStandardItemLighting();
            GlStateManager.enableDepth();
            GlStateManager.depthMask((boolean)true);
        }
    }
}