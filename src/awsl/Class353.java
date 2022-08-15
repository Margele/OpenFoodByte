/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class305;
import awsl.Class338;
import awsl.Class379;
import awsl.Class681;
import awsl.Class776;
import awsl.Class91;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.render.Radar;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class353
extends Class379 {
    public static HashMap Field1696 = new HashMap();

    public Class353() {
        this(5.0f, 25.0f, 100.0f, 100.0f, 12.0f, 1.0f, 0.5f, true, 100.0f, 100.0f, 1920.0f, 1080.0f);
    }

    public Class353(float a, float a2, float a3, float a4, float a5, float a6, float a7, boolean a8, float a9, float a10, float a11, float a12) {
        super("Radar", a, a2, a3, a4, "Radar", "X", a5, a6, a7, a8, a9, a10, a11, a12);
        Field1696.put((Object)"PVP", (Object)new double[]{Double.parseDouble((String)"0"), Double.parseDouble((String)"80"), Double.parseDouble((String)"0")});
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method63() {
        void a;
        GlStateManager.disableDepth();
        super.Method63();
        float a2 = this.Field1806;
        float a3 = this.Field1807 + this.Field1812;
        float a4 = (float)this.Field1808.thePlayer.posX;
        float a5 = (float)this.Field1808.thePlayer.posZ;
        float f = 0.0f;
        int n = Class776.Method1731();
        float a6 = 2.0f;
        RenderUtils.Method1104(a2 + (this.Field1814 / 2.0f - 0.5f), a3 + a, a2 + this.Field1814 / 2.0f + 0.5f, a3 + this.Field1815 - a, new Color(255, 255, 255, 80).getRGB());
        RenderUtils.Method1104(a2 + a, a3 + (this.Field1815 / 2.0f - 0.5f), a2 + this.Field1814 - a, a3 + this.Field1815 / 2.0f + 0.5f, new Color(255, 255, 255, 80).getRGB());
        Iterator iterator = this.Field1808.theWorld.getLoadedEntityList().Method1383();
        int a7 = n;
        if (iterator.Method932()) {
            EntityPlayer a8;
            Object a9 = iterator.Method933();
            if (a9 instanceof EntityPlayer && (a8 = (EntityPlayer)a9).isEntityAlive() && a8 != this.Field1808.thePlayer && !a8.isInvisible() && !a8.isInvisibleToPlayer((EntityPlayer)this.Field1808.thePlayer) && !AntiBot.Field2577.contains((Object)a8)) {
                float a10 = ReflectionUtils.Method2587();
                float a11 = (float)((a8.lastTickPosX + (a8.posX - a8.lastTickPosX) * (double)a10 - (double)a4) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.Method2744().floatValue());
                float a12 = (float)((a8.lastTickPosZ + (a8.posZ - a8.lastTickPosZ) * (double)a10 - (double)a5) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.Method2744().floatValue());
                int a13 = RenderUtils.Method1114(1000);
                if (Class305.Method697((Entity)a8)) {
                    a13 = Class681.Method3(0, 195, 255);
                    Class91.Method3647(new String[5]);
                }
                if (Class305.Method704((Entity)a8)) {
                    a13 = Class681.Method2696(0, 255, 0, 255);
                }
                if (this.Field1808.thePlayer.canEntityBeSeen((Entity)a8)) {
                    a13 = Class681.Method2696(255, 0, 0, 255);
                }
                if (!this.Field1808.thePlayer.canEntityBeSeen((Entity)a8)) {
                    a13 = Class681.Method2696(255, 255, 0, 255);
                }
                float a14 = (float)Math.cos((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
                float a15 = (float)Math.sin((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
                float a16 = -(a12 * a14 - a11 * a15);
                float a17 = -(a11 * a14 + a12 * a15);
                if (a16 > this.Field1815 / 2.0f - a6) {
                    a16 = this.Field1815 / 2.0f - a6;
                }
                if (a16 < -(this.Field1815 / 2.0f) + a6) {
                    a16 = -(this.Field1815 / 2.0f) + a6;
                }
                if (a17 > this.Field1814 / 2.0f - a6) {
                    a17 = this.Field1814 / 2.0f - a6;
                }
                if (a17 < -(this.Field1814 / 2.0f - a6)) {
                    a17 = -(this.Field1814 / 2.0f - a6);
                }
                RenderUtils.Method1108((double)(a2 + this.Field1814 / 2.0f + a17) - 1.5, (double)(a3 + this.Field1815 / 2.0f + a16) - 1.5, (double)(a2 + this.Field1814 / 2.0f + a17) + 1.5, (double)(a3 + this.Field1815 / 2.0f + a16) + 1.5, 0.5, a13, Class681.Method1612(16));
            }
        }
        if (((Radar)ModuleManager.getModule2(Radar.class)).Field2221.Method2509().booleanValue() && Field1696.Method1799() > 0) {
            float a18 = a2;
            float a19 = a3;
            Field1696.keySet().forEach(arg_0 -> this.Method66(a4, a5, a6, a2, a3, a18, a19, arg_0));
        }
    }

    @Override
    public void Method64(int a, int a2) {
        if (this.Field1811) {
            this.Field1806 = (float)a - this.Field1809;
            this.Field1807 = (float)a2 - this.Field1810;
        }
        if (this.Field1822) {
            this.Field1814 += (float)a - this.Field1809;
            if (this.Field1814 < this.Field1818) {
                this.Field1814 = this.Field1818;
            } else if (this.Field1814 > this.Field1820) {
                this.Field1814 = this.Field1820;
            } else {
                this.Field1809 = a;
            }
            this.Field1815 += (float)a2 - this.Field1810;
            if (this.Field1815 < this.Field1819) {
                this.Field1815 = this.Field1819;
            } else if (this.Field1815 > this.Field1821) {
                this.Field1815 = this.Field1821;
            } else {
                this.Field1810 = a2;
            }
            if (!Display.isActive()) {
                this.Field1822 = false;
            }
        }
    }

    private static void Method65(String a, int a2, int a3) {
        String[] a4;
        String a5 = a;
        for (String a6 : a4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"}) {
            a = a.replaceAll("\u00a7" + a6, "");
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableDepth();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, (a2 *= 2) + 1, a3 * 2, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, a2 - 1, a3 * 2, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, a2, a3 * 2 + 1, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a, a2, a3 * 2 - 1, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a5, a2, a3 * 2, Class681.Method2696(0, 153, 255, 255));
        GlStateManager.enableDepth();
        GlStateManager.popMatrix();
    }

    private void Method66(float a, float a2, float a3, float a4, float a5, float a6, float a7, String a8) {
        int a9;
        Class338 a10;
        double[] a11 = (double[])Field1696.Method2665((Object)a8);
        Class338 a12 = a10 = new Class338(a11[0], a11[1], a11[2]);
        int a13 = (int)Math.floor((double)(this.Field1808.thePlayer.getPositionVector().xCoord / 16.0));
        if (!this.Field1808.theWorld.getChunkFromChunkCoords(a13, a9 = (int)Math.floor((double)(this.Field1808.thePlayer.getPositionVector().zCoord / 16.0))).isLoaded() && a10.Method223(this.Field1808.thePlayer.getPositionVector()) > (double)this.Field1808.gameSettings.renderDistanceChunks) {
            a12 = a12.Method225(this.Field1808.gameSettings.renderDistanceChunks);
        }
        float a14 = ReflectionUtils.Method2587();
        float a15 = (float)((a12.Method220() - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.Method2744().floatValue());
        float a16 = (float)((a12.Method222() - (double)a2) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.Method2744().floatValue());
        int a17 = RenderUtils.Method1114(980);
        float a18 = (float)Math.cos((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
        float a19 = (float)Math.sin((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
        float a20 = -(a16 * a18 - a15 * a19);
        float a21 = -(a15 * a18 + a16 * a19);
        if (a20 > this.Field1815 / 2.0f - a3) {
            a20 = this.Field1815 / 2.0f - a3;
        } else if (a20 < -(this.Field1815 / 2.0f) + a3) {
            a20 = -(this.Field1815 / 2.0f) + a3;
        }
        if (a21 > this.Field1814 / 2.0f - a3) {
            a21 = this.Field1814 / 2.0f - a3;
        } else if (a21 < -(this.Field1814 / 2.0f - a3)) {
            a21 = -(this.Field1814 / 2.0f - a3);
        }
        RenderUtils.Method1108((double)(a4 + this.Field1814 / 2.0f + a21) - 1.5, (double)(a5 + this.Field1815 / 2.0f + a20) - 1.5, (double)(a4 + this.Field1814 / 2.0f + a21) + 1.5, (double)(a5 + this.Field1815 / 2.0f + a20) + 1.5, 0.5, Class681.Method2696(0, 153, 255, 200), Class681.Method1612(12));
        Class353.Method65(a8, (int)(a6 + this.Field1814 / 2.0f + a21 - (float)(this.Field1808.fontRendererObj.getStringWidth(a8) / 5)), (int)(a7 + this.Field1815 / 2.0f + a20 + 2.0f));
    }
}