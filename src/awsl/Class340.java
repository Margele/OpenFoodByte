/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.WeakHashMap
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EnumPlayerModelParts
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class211;
import awsl.Class280;
import awsl.Class284;
import awsl.Class314;
import awsl.Class321;
import awsl.Class342;
import awsl.Class349;
import awsl.Class565;
import awsl.Class661;
import awsl.Class681;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.RenderUtils;

public class Class340 {
    public static Minecraft Field1637 = Minecraft.getMinecraft();
    public static float Field1638;
    public static EntityLivingBase Field1639;
    private static String Field1640;
    private static final WeakHashMap Field1641;
    private static float Field1642;
    public static Class349 Field1643;
    public static Class321 Field1644;
    public static List Field1645;
    private static final Class280 Field1646;

    public static void Method264(EntityLivingBase a) {
        String a2;
        float a3;
        float a4;
        String a5;
        String a6;
        float a7;
        boolean a8 = false;
        int[] a9 = RenderUtils.Method1148();
        int a10 = RenderUtils.Method1076() / 2 - 20;
        int a11 = RenderUtils.Method1077() / 2 + 20;
        if (a instanceof EntityPlayer) {
            a8 = true;
            a10 = RenderUtils.Method1076() / 2 + 10;
        }
        boolean a12 = (a7 = Class565.Field2641.Method1225(a6 = a.getName())) > 65.0f;
        Field1644.Method1211(KillAura.Field2524 != null ? Class661.FORWARDS : Class661.BACKWARDS);
        RenderUtils.Method1145((float)(a10 + 0) + (36.0f + a7) / 2.0f, a11 + 14, (float)Field1644.Method1213());
        GlStateManager.pushMatrix();
        RenderUtils.Method1074(a10 - 1 + 0, a11 - 1, (float)a10 + (36.0f + a7), (float)(a11 + 1) + 28.0f, Class681.Method1614(0, 150));
        Class565.Field2641.Method1217(a6, a10 + 31, a11 + 2, -1);
        Class565.Field2641.Method1222(a6, a10 + 63, a11 + 2, -1);
        BigDecimal a13 = new BigDecimal((double)a.getHealth());
        a13 = a13.setScale(1, RoundingMode.HALF_UP);
        double a14 = a13.doubleValue();
        BigDecimal a15 = new BigDecimal((double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity((Entity)a));
        a15 = a15.setScale(1, RoundingMode.HALF_UP);
        double a16 = a15.doubleValue();
        float a17 = a.getAbsorptionAmount();
        float a18 = a.getHealth();
        boolean a19 = a.getAbsorptionAmount() > 0.0f;
        float a20 = a.getTotalArmorValue();
        float a21 = (float)a.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue();
        float[] a22 = new float[]{0.0f, 0.5f, 1.0f};
        Color[] a23 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
        float a24 = a18 / a21;
        float a25 = a20 / 20.0f;
        double a26 = a7 - 9.0f;
        double a27 = a26 * (double)a25;
        double a28 = a26 * (double)a24;
        if ((double)a18 > 20.0) {
            a5 = "\u00a79";
        }
        if ((double)a18 >= 10.0) {
            a5 = "\u00a7a";
        }
        if ((double)a18 >= 3.0) {
            a5 = "\u00a7e";
        }
        a5 = "\u00a74";
        if (a != Field1639) {
            Field1639 = a;
            Field1638 = (float)a28;
            Field1642 = 0.0f;
            Field1645.clear();
        }
        if (Field1638 <= 0.0f) {
            Field1638 = (float)a28;
        }
        if (a.hurtTime <= 6) {
            Field1638 = Class342.Method280(Field1638, (float)a28, (float)Math.max((double)10.0, (double)(Math.abs((double)((double)Field1638 - a28)) * 30.0 * 0.4)));
        }
        if (!Field1641.containsKey((Object)a)) {
            Field1641.put((Object)a, (Object)Float.valueOf((float)a.getHealth()));
        }
        if ((a4 = ((Float)Field1641.get((Object)a)).floatValue()) != (a3 = a.getHealth())) {
            if (a4 - a3 < 0.0f) {
                Field1640 = "\u00a7a+ " + Class340.Method265((a4 - a3) * -1.0f, 1);
            }
            Field1640 = "\u00a7c- " + Class340.Method265(a4 - a3, 1);
            Field1641.remove((Object)a);
            Field1641.put((Object)a, (Object)Float.valueOf((float)a.getHealth()));
            Field1642 = 50.0f;
        }
        if (Field1642 > 0.0f) {
            Field1642 = (float)RenderUtils.Method1073(Field1642, 0.0, 0.1);
            Class565.Field2637.Method1224(Field1640, a10 + 12 + 0, (float)(a11 - 17) + Field1642 / 10.0f, -1);
        }
        if (a18 % 1.0f != 0.0f) {
            a2 = new BigDecimal((double)(a18 + a17)).setScale(1, 4).floatValue() + "";
        }
        a2 = new BigDecimal((double)(a18 + a17)).setScale(0, 4).toString();
        Color a29 = new Color(219, 190, 1);
        Class565.Field2639.Method1217("t", a10 + 30, a11 + 12, Class681.Method3(219, 190, 1));
        RenderUtils.Method1108((double)a10 + 39.5, (double)a11 + 15.0, (double)a10 + 40.5 + a26, (double)a11 + 18.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
        RenderUtils.Method1105(a10 + 40, (double)a11 + 15.5, (float)(a10 + 40) + Field1638, (double)a11 + 17.5, a29.darker().getRGB());
        RenderUtils.Method1105(a10 + 40, (double)a11 + 15.5, (double)(a10 + 40) + a28, (double)a11 + 17.5, a29.getRGB());
        RenderUtils.Method1108((double)a10 + 39.5, (double)a11 + 22.0, (double)a10 + 12.5 + a26, (double)a11 + 25.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
        Class565.Field2639.Method1217("u", a10 + 30, a11 + 19, Class681.Method3(153, 153, 153));
        RenderUtils.Method1105(a10 + 40, (double)a11 + 22.5, (double)a10 + (40.0 + a27 / 2.0), (double)a11 + 24.5, Class681.Method3(0, 180, 255));
        Class565.Field2639.Method1222("t", (float)a10 + (a7 + 12.0f), (float)(a11 + 19) - 0.5f, Class681.Method3(0, 153, 255));
        Class565.Field2636.Method1223(a2, (float)a10 + (a7 + 24.0f), a11 + 19, -1, 0.5f);
        if (a instanceof EntityPlayer) {
            int a30;
            Class284 a31;
            Iterator iterator;
            Field1643.Method4(a.hurtTime > 5);
            GL11.glPushMatrix();
            if (Field1644.Method1213() > 0.5) {
                iterator = Field1645.Method1383();
                if (iterator.Method932()) {
                    a31 = (Class284)iterator.Method933();
                    if (a31.Field1541 > 4.0) {
                        a31.Method3103();
                    }
                }
            }
            Field1645.clear();
            if (Field1646.Method3077(16L)) {
                iterator = Field1645.Method1383();
                if (iterator.Method932()) {
                    a31 = (Class284)iterator.Method933();
                    a31.Method3104();
                    if (a31.Field1541 < 1.0) {
                        Field1645.remove((Object)a31);
                    }
                }
                Field1646.Method3079();
            }
            if (a.hurtTime >= 9 && (a30 = 0) <= 2) {
                a31 = new Class284();
                a31.Method3105(a10 + 13, a11 + 13, (Math.random() - 0.5) * 2.0 * 0.8, (Math.random() - 0.5) * 2.0 * 0.8, Math.random() * 3.0, new Color(255, 0, 0));
                Field1645.Method2530((Object)a31);
                ++a30;
            }
            GL11.glTranslatef((float)(a10 + 1), (float)(a11 + 1), (float)0.0f);
            float a210 = (float)a.hurtTime / 10.0f;
            float a32 = a210 == 0.0f ? 1.0f : (a210 < 0.5f ? 1.0f - 0.2f * a210 * 2.0f : 0.8f + 0.2f * (a210 - 0.5f) * 2.0f);
            int a33 = 26;
            float a34 = (float)(1.0 - 0.1 * Field1643.Method6());
            GL11.glScalef((float)a34, (float)a34, (float)a34);
            GL11.glTranslatef((float)((float)a33 * 0.5f * (1.0f - a34) / a34), (float)((float)a33 * 0.5f * (1.0f - a34) / a34), (float)0.0f);
            Class211.Method2575(false);
            RenderUtils.Method1087(13.0f, 13.0f, 15.0f, Color.white.getRGB());
            Class211.Method2574(true);
            GL11.glColor4f((float)1.0f, (float)(1.0f - a210), (float)(1.0f - a210), (float)1.0f);
            Class340.Method266(a10 + 1, a11 + 1, 8.0f, 8.0f, 8, 8, 26, 26, 64.0f, 64.0f, (AbstractClientPlayer)a);
            Class211.Method2573();
            GL11.glPopMatrix();
        }
        GlStateManager.popMatrix();
        RenderUtils.Method1146();
    }

    public static double Method265(double a, int a2) {
        throw new IllegalArgumentException();
    }

    private static void Method266(double a, double a2, float a3, float a4, int a5, int a6, int a7, int a8, float a9, float a10, AbstractClientPlayer a11) {
        block3: {
            ScaledResolution a12 = new ScaledResolution(Field1637);
            ResourceLocation a13 = a11.getLocationSkin();
            GL11.glEnable((int)3042);
            Field1637.getTextureManager().bindTexture(a13);
            Gui.drawScaledCustomSizeModalRect((int)0, (int)0, (float)a3, (float)a4, (int)a5, (int)a6, (int)a7, (int)a8, (float)a9, (float)a10);
            if (!a11.isWearing(EnumPlayerModelParts.HAT)) break block3;
            Gui.drawScaledCustomSizeModalRect((int)0, (int)0, (float)(a3 + 32.0f), (float)a4, (int)a5, (int)a6, (int)a7, (int)a8, (float)a9, (float)a10);
        }
        try {
            GL11.glDisable((int)3042);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected static void Method267(float a, float a2, float a3, float a4, int a5, int a6) {
        float a7 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a5 & 0xFF) / 255.0f;
        float a11 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a12 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a13 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a14 = (float)(a6 & 0xFF) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        Tessellator a15 = Tessellator.getInstance();
        WorldRenderer a16 = a15.getWorldRenderer();
        a16.begin(7, DefaultVertexFormats.POSITION_COLOR);
        a16.pos((double)a, (double)a2, 0.0).color(a8, a9, a10, a7).endVertex();
        a16.pos((double)a, (double)a4, 0.0).color(a8, a9, a10, a7).endVertex();
        a16.pos((double)a3, (double)a4, 0.0).color(a12, a13, a14, a11).endVertex();
        a16.pos((double)a3, (double)a2, 0.0).color(a12, a13, a14, a11).endVertex();
        a15.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    protected static void Method268(float a, float a2, float a3, float a4, int a5, int a6) {
        float a7 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a5 & 0xFF) / 255.0f;
        float a11 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a12 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a13 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a14 = (float)(a6 & 0xFF) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        Tessellator a15 = Tessellator.getInstance();
        WorldRenderer a16 = a15.getWorldRenderer();
        a16.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        a16.pos((double)a, (double)a4, 0.0).tex(0.0, 1.0).color(a8, a9, a10, a7).endVertex();
        a16.pos((double)a3, (double)a4, 0.0).tex(1.0, 1.0).color(a8, a9, a10, a7).endVertex();
        a16.pos((double)a3, (double)a2, 0.0).tex(1.0, 0.0).color(a12, a13, a14, a11).endVertex();
        a16.pos((double)a, (double)a2, 0.0).tex(0.0, 0.0).color(a12, a13, a14, a11).endVertex();
        a15.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    static {
        Field1639 = null;
        Field1640 = "";
        Field1641 = new WeakHashMap();
        Field1643 = new Class349(0.01);
        Field1644 = new Class314(150, 1.0, 3.0f);
        Field1645 = new ArrayList();
        Field1646 = new Class280();
    }

    private static Exception Method269(Exception exception) {
        return exception;
    }
}