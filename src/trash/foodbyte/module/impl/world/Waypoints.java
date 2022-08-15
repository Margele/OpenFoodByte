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
import awsl.Class91;
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
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;
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
    protected void Method2248(Class260 a, double a2, double a3, double a4, double a5, Entity a6) {
        void a7;
        float a8 = (float)(a.Method2837() - (double)((float)a3) + 0.5);
        float a9 = (float)(a.Method2838() - (double)((float)a4) + 1.0);
        float f = (float)(a.Method2839() - (double)((float)a5) + 0.5);
        double a10 = Math.sqrt((double)(a8 * a8 + a9 * a9 + a7 * a7));
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        Class91[] a11 = Class448.Method2461();
        FontRenderer a12 = Waypoints.mc.fontRendererObj;
    }

    public void Method810(EventRender2D a) {
        if (!mc.isSingleplayer() && mc.getCurrentServerData() != null) {
            GlobalModule.INSTANCE.Method2009().Method2265().forEach(arg_0 -> this.Method2249(a, arg_0));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Method1734(Vec3 a) {
        if (!(a.xCoord > -1.0)) return false;
        if (!(a.zCoord < 1.0)) return false;
        double d = a.xCoord;
        int n = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d / (double)n >= 0.0)) return false;
        double d2 = a.xCoord;
        int n2 = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d2 / (double)n2 <= (double)Display.getWidth())) return false;
        double d3 = a.yCoord;
        int n3 = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d3 / (double)n3 >= 0.0)) return false;
        double d4 = a.yCoord;
        int n4 = Waypoints.mc.gameSettings.guiScale == 0 ? 1 : Waypoints.mc.gameSettings.guiScale;
        if (!(d4 / (double)n4 <= (double)Display.getHeight())) return false;
        return true;
    }

    private void Method2249(EventRender2D a, Class260 a2) {
        Class91[] a3 = Class448.Method2461();
        if (Waypoints.mc.getCurrentServerData().serverIP.equals((Object)a2.Method2836()) && Waypoints.mc.thePlayer.dimension == a2.Method2840() || !this.Method1734(new Vec3(a2.Method2837(), a2.Method2838(), a2.Method2839()))) {
            double a4 = a2.Method2837();
            double a5 = a2.Method2838();
            double a6 = a2.Method2839();
            AxisAlignedBB a7 = new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.94, 0.875, 0.94).offset(a4 - ReflectionUtils.Method2591(), a5 - ReflectionUtils.Method2592(), a6 - ReflectionUtils.Method2593());
            List a8 = Arrays.asList((Object[])new Vector3d[]{new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5, a6 + a7.maxZ - a7.minZ - 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5, a6 + a7.maxZ - a7.minZ - 0.5), new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5 + a7.maxY - a7.minY, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5 + a7.maxY - a7.minY, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5 + a7.maxY - a7.minY, a6 + a7.maxZ - a7.minZ - 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5 + a7.maxY - a7.minY, a6 + a7.maxZ - a7.minZ - 0.5)});
            ReflectionUtils.Method2608(a.Field2923, 0);
            Vector4d a9 = null;
            Iterator iterator = a8.Method1383();
            if (iterator.Method932()) {
                Vector3d a10 = (Vector3d)iterator.Method933();
                a10 = RenderUtils.Method1136(a10.x - Waypoints.mc.getRenderManager().viewerPosX, a10.y - Waypoints.mc.getRenderManager().viewerPosY, a10.z - Waypoints.mc.getRenderManager().viewerPosZ);
                if (a10.z >= 0.0 && a10.z < 1.0) {
                    a9 = new Vector4d(a10.x, a10.y, a10.z, 0.0);
                    a9.x = Math.min((double)a10.x, (double)a9.x);
                    a9.y = Math.min((double)a10.y, (double)a9.y);
                    a9.z = Math.max((double)a10.x, (double)a9.z);
                    a9.w = Math.max((double)a10.y, (double)a9.w);
                }
            }
            Waypoints.mc.entityRenderer.setupOverlayRendering();
            GL11.glPushMatrix();
            float a11 = (float)a9.x;
            float a12 = (float)a9.z;
            float a13 = (float)a9.y;
            String a14 = "[" + Math.round((double)Waypoints.mc.thePlayer.getDistance(a2.Method2837(), a2.Method2838(), a2.Method2839())) + "m]" + a2.Method2835();
            RenderUtils.Method1103(a11 + (a12 - a11) / 2.0f - (float)(Waypoints.mc.fontRendererObj.getStringWidth(a14) / 2) - 2.0f, a13 - (float)Waypoints.mc.fontRendererObj.FONT_HEIGHT + 4.0f, Waypoints.mc.fontRendererObj.getStringWidth(a14) + 2, Waypoints.mc.fontRendererObj.FONT_HEIGHT, new Color(0, 0, 0, 120).getRGB());
            Waypoints.mc.fontRendererObj.drawStringWithShadow(a14, a11 + (a12 - a11) / 2.0f - (float)(Waypoints.mc.fontRendererObj.getStringWidth(a14) / 2), a13 - (float)(Waypoints.mc.fontRendererObj.FONT_HEIGHT / 2), -1);
            GL11.glPopMatrix();
        }
    }

    private void Method2250(EventRender3D a, Class260 a2) {
        if (Waypoints.mc.getCurrentServerData().serverIP.equals((Object)a2.Method2836()) && Waypoints.mc.thePlayer.dimension == a2.Method2840()) {
            Entity a3 = Minecraft.getMinecraft().getRenderViewEntity();
            double a4 = a3.lastTickPosX + (a3.posX - a3.lastTickPosX) * (double)a.Field2922;
            double a5 = a3.lastTickPosY + (a3.posY - a3.lastTickPosY) * (double)a.Field2922;
            double a6 = a3.lastTickPosZ + (a3.posZ - a3.lastTickPosZ) * (double)a.Field2922;
            this.Method2248(a2, 12.0, a4, a5, a6, a3);
            RenderHelper.disableStandardItemLighting();
            GlStateManager.enableDepth();
            GlStateManager.depthMask((boolean)true);
        }
    }
}