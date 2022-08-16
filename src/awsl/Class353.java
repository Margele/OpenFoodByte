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
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.render.Radar;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class353
extends Class379 {
    public static HashMap Field1696 = new HashMap();

    public Class353() {
        this(5.0f, 25.0f, 100.0f, 100.0f, 12.0f, 1.0f, 0.5f, true, 100.0f, 100.0f, 1920.0f, 1080.0f);
    }

    public Class353(float a2, float a3, float a4, float a5, float a6, float a7, float a8, boolean a9, float a10, float a11, float a12, float a13) {
        super("Radar", a2, a3, a4, a5, "Radar", "X", a6, a7, a8, a9, a10, a11, a12, a13);
        Field1696.put((Object)"PVP", (Object)new double[]{Double.parseDouble((String)"0"), Double.parseDouble((String)"80"), Double.parseDouble((String)"0")});
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method63() {
        void a2;
        GlStateManager.disableDepth();
        super.Method63();
        float a3 = this.Field1806;
        float a4 = this.Field1807 + this.Field1812;
        float a5 = (float)this.Field1808.thePlayer.posX;
        float a6 = (float)this.Field1808.thePlayer.posZ;
        float f = 0.0f;
        int n = Class776.Method1731();
        float a7 = 2.0f;
        RenderUtils.Method1104(a3 + (this.Field1814 / 2.0f - 0.5f), a4 + a2, a3 + this.Field1814 / 2.0f + 0.5f, a4 + this.Field1815 - a2, new Color(255, 255, 255, 80).getRGB());
        RenderUtils.Method1104(a3 + a2, a4 + (this.Field1815 / 2.0f - 0.5f), a3 + this.Field1814 - a2, a4 + this.Field1815 / 2.0f + 0.5f, new Color(255, 255, 255, 80).getRGB());
        Iterator iterator = this.Field1808.theWorld.getLoadedEntityList().Method1383();
        int a8 = n;
        if (iterator.Method932()) {
            EntityPlayer a9;
            Object a10 = iterator.Method933();
            if (a10 instanceof EntityPlayer && (a9 = (EntityPlayer)a10).isEntityAlive() && a9 != this.Field1808.thePlayer && !a9.isInvisible() && !a9.isInvisibleToPlayer((EntityPlayer)this.Field1808.thePlayer) && !AntiBot.botList.contains((Object)a9)) {
                float a11 = ReflectionUtils.getRenderPartialTicks();
                float a12 = (float)((a9.lastTickPosX + (a9.posX - a9.lastTickPosX) * (double)a11 - (double)a5) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue().floatValue());
                float a13 = (float)((a9.lastTickPosZ + (a9.posZ - a9.lastTickPosZ) * (double)a11 - (double)a6) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue().floatValue());
                int a14 = RenderUtils.Method1114(1000);
                if (Class305.Method697((Entity)a9)) {
                    a14 = Class681.Method3(0, 195, 255);
                    a.trash(new String[5]);
                }
                if (Class305.Method704((Entity)a9)) {
                    a14 = Class681.Method2696(0, 255, 0, 255);
                }
                if (this.Field1808.thePlayer.canEntityBeSeen((Entity)a9)) {
                    a14 = Class681.Method2696(255, 0, 0, 255);
                }
                if (!this.Field1808.thePlayer.canEntityBeSeen((Entity)a9)) {
                    a14 = Class681.Method2696(255, 255, 0, 255);
                }
                float a15 = (float)Math.cos((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
                float a16 = (float)Math.sin((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
                float a17 = -(a13 * a15 - a12 * a16);
                float a18 = -(a12 * a15 + a13 * a16);
                if (a17 > this.Field1815 / 2.0f - a7) {
                    a17 = this.Field1815 / 2.0f - a7;
                }
                if (a17 < -(this.Field1815 / 2.0f) + a7) {
                    a17 = -(this.Field1815 / 2.0f) + a7;
                }
                if (a18 > this.Field1814 / 2.0f - a7) {
                    a18 = this.Field1814 / 2.0f - a7;
                }
                if (a18 < -(this.Field1814 / 2.0f - a7)) {
                    a18 = -(this.Field1814 / 2.0f - a7);
                }
                RenderUtils.Method1108((double)(a3 + this.Field1814 / 2.0f + a18) - 1.5, (double)(a4 + this.Field1815 / 2.0f + a17) - 1.5, (double)(a3 + this.Field1814 / 2.0f + a18) + 1.5, (double)(a4 + this.Field1815 / 2.0f + a17) + 1.5, 0.5, a14, Class681.Method1612(16));
            }
        }
        if (((Radar)ModuleManager.getModule2(Radar.class)).Field2221.getBooleanValue().booleanValue() && Field1696.Method1799() > 0) {
            float a19 = a3;
            float a20 = a4;
            Field1696.keySet().forEach(arg_0 -> this.Method66(a5, a6, a7, a3, a4, a19, a20, arg_0));
        }
    }

    @Override
    public void Method64(int a2, int a3) {
        if (this.Field1811) {
            this.Field1806 = (float)a2 - this.Field1809;
            this.Field1807 = (float)a3 - this.Field1810;
        }
        if (this.Field1822) {
            this.Field1814 += (float)a2 - this.Field1809;
            if (this.Field1814 < this.Field1818) {
                this.Field1814 = this.Field1818;
            } else if (this.Field1814 > this.Field1820) {
                this.Field1814 = this.Field1820;
            } else {
                this.Field1809 = a2;
            }
            this.Field1815 += (float)a3 - this.Field1810;
            if (this.Field1815 < this.Field1819) {
                this.Field1815 = this.Field1819;
            } else if (this.Field1815 > this.Field1821) {
                this.Field1815 = this.Field1821;
            } else {
                this.Field1810 = a3;
            }
            if (!Display.isActive()) {
                this.Field1822 = false;
            }
        }
    }

    private static void Method65(String a2, int a3, int a4) {
        String[] a5;
        String a6 = a2;
        for (String a7 : a5 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"}) {
            a2 = a2.replaceAll("\u00a7" + a7, "");
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableDepth();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        Minecraft.getMinecraft().fontRendererObj.drawString(a2, (a3 *= 2) + 1, a4 * 2, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a2, a3 - 1, a4 * 2, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a2, a3, a4 * 2 + 1, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a2, a3, a4 * 2 - 1, 0);
        Minecraft.getMinecraft().fontRendererObj.drawString(a6, a3, a4 * 2, Class681.Method2696(0, 153, 255, 255));
        GlStateManager.enableDepth();
        GlStateManager.popMatrix();
    }

    private void Method66(float a2, float a3, float a4, float a5, float a6, float a7, float a8, String a9) {
        int a10;
        Class338 a11;
        double[] a12 = (double[])Field1696.Method2665((Object)a9);
        Class338 a13 = a11 = new Class338(a12[0], a12[1], a12[2]);
        int a14 = (int)Math.floor((double)(this.Field1808.thePlayer.getPositionVector().xCoord / 16.0));
        if (!this.Field1808.theWorld.getChunkFromChunkCoords(a14, a10 = (int)Math.floor((double)(this.Field1808.thePlayer.getPositionVector().zCoord / 16.0))).isLoaded() && a11.Method223(this.Field1808.thePlayer.getPositionVector()) > (double)this.Field1808.gameSettings.renderDistanceChunks) {
            a13 = a13.Method225(this.Field1808.gameSettings.renderDistanceChunks);
        }
        float a15 = ReflectionUtils.getRenderPartialTicks();
        float a16 = (float)((a13.Method220() - (double)a2) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue().floatValue());
        float a17 = (float)((a13.Method222() - (double)a3) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue().floatValue());
        int a18 = RenderUtils.Method1114(980);
        float a19 = (float)Math.cos((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
        float a20 = (float)Math.sin((double)((double)this.Field1808.thePlayer.rotationYaw * (Math.PI / 180)));
        float a21 = -(a17 * a19 - a16 * a20);
        float a22 = -(a16 * a19 + a17 * a20);
        if (a21 > this.Field1815 / 2.0f - a4) {
            a21 = this.Field1815 / 2.0f - a4;
        } else if (a21 < -(this.Field1815 / 2.0f) + a4) {
            a21 = -(this.Field1815 / 2.0f) + a4;
        }
        if (a22 > this.Field1814 / 2.0f - a4) {
            a22 = this.Field1814 / 2.0f - a4;
        } else if (a22 < -(this.Field1814 / 2.0f - a4)) {
            a22 = -(this.Field1814 / 2.0f - a4);
        }
        RenderUtils.Method1108((double)(a5 + this.Field1814 / 2.0f + a22) - 1.5, (double)(a6 + this.Field1815 / 2.0f + a21) - 1.5, (double)(a5 + this.Field1814 / 2.0f + a22) + 1.5, (double)(a6 + this.Field1815 / 2.0f + a21) + 1.5, 0.5, Class681.Method2696(0, 153, 255, 200), Class681.Method1612(12));
        Class353.Method65(a9, (int)(a7 + this.Field1814 / 2.0f + a22 - (float)(this.Field1808.fontRendererObj.getStringWidth(a9) / 5)), (int)(a8 + this.Field1815 / 2.0f + a21 + 2.0f));
    }
}