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

    public static void Method264(EntityLivingBase a2) {
        String a3;
        float a4;
        float a5;
        String a6;
        String a7;
        float a8;
        boolean a9 = false;
        int[] a10 = RenderUtils.trash();
        int a11 = RenderUtils.Method1076() / 2 - 20;
        int a12 = RenderUtils.Method1077() / 2 + 20;
        if (a2 instanceof EntityPlayer) {
            a9 = true;
            a11 = RenderUtils.Method1076() / 2 + 10;
        }
        boolean a13 = (a8 = Class565.Field2641.Method1225(a7 = a2.getName())) > 65.0f;
        Field1644.Method1211(KillAura.target != null ? Class661.FORWARDS : Class661.BACKWARDS);
        RenderUtils.Method1145((float)(a11 + 0) + (36.0f + a8) / 2.0f, a12 + 14, (float)Field1644.Method1213());
        GlStateManager.pushMatrix();
        RenderUtils.Method1074(a11 - 1 + 0, a12 - 1, (float)a11 + (36.0f + a8), (float)(a12 + 1) + 28.0f, Class681.Method1614(0, 150));
        Class565.Field2641.Method1217(a7, a11 + 31, a12 + 2, -1);
        Class565.Field2641.Method1222(a7, a11 + 63, a12 + 2, -1);
        BigDecimal a14 = new BigDecimal((double)a2.getHealth());
        a14 = a14.setScale(1, RoundingMode.HALF_UP);
        double a15 = a14.doubleValue();
        BigDecimal a16 = new BigDecimal((double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity((Entity)a2));
        a16 = a16.setScale(1, RoundingMode.HALF_UP);
        double a17 = a16.doubleValue();
        float a18 = a2.getAbsorptionAmount();
        float a19 = a2.getHealth();
        boolean a20 = a2.getAbsorptionAmount() > 0.0f;
        float a21 = a2.getTotalArmorValue();
        float a22 = (float)a2.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue();
        float[] a23 = new float[]{0.0f, 0.5f, 1.0f};
        Color[] a24 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
        float a25 = a19 / a22;
        float a26 = a21 / 20.0f;
        double a27 = a8 - 9.0f;
        double a28 = a27 * (double)a26;
        double a29 = a27 * (double)a25;
        if ((double)a19 > 20.0) {
            a6 = "\u00a79";
        }
        if ((double)a19 >= 10.0) {
            a6 = "\u00a7a";
        }
        if ((double)a19 >= 3.0) {
            a6 = "\u00a7e";
        }
        a6 = "\u00a74";
        if (a2 != Field1639) {
            Field1639 = a2;
            Field1638 = (float)a29;
            Field1642 = 0.0f;
            Field1645.clear();
        }
        if (Field1638 <= 0.0f) {
            Field1638 = (float)a29;
        }
        if (a2.hurtTime <= 6) {
            Field1638 = Class342.Method280(Field1638, (float)a29, (float)Math.max((double)10.0, (double)(Math.abs((double)((double)Field1638 - a29)) * 30.0 * 0.4)));
        }
        if (!Field1641.containsKey((Object)a2)) {
            Field1641.put((Object)a2, (Object)Float.valueOf((float)a2.getHealth()));
        }
        if ((a5 = ((Float)Field1641.get((Object)a2)).floatValue()) != (a4 = a2.getHealth())) {
            if (a5 - a4 < 0.0f) {
                Field1640 = "\u00a7a+ " + Class340.Method265((a5 - a4) * -1.0f, 1);
            }
            Field1640 = "\u00a7c- " + Class340.Method265(a5 - a4, 1);
            Field1641.remove((Object)a2);
            Field1641.put((Object)a2, (Object)Float.valueOf((float)a2.getHealth()));
            Field1642 = 50.0f;
        }
        if (Field1642 > 0.0f) {
            Field1642 = (float)RenderUtils.Method1073(Field1642, 0.0, 0.1);
            Class565.Field2637.Method1224(Field1640, a11 + 12 + 0, (float)(a12 - 17) + Field1642 / 10.0f, -1);
        }
        if (a19 % 1.0f != 0.0f) {
            a3 = new BigDecimal((double)(a19 + a18)).setScale(1, 4).floatValue() + "";
        }
        a3 = new BigDecimal((double)(a19 + a18)).setScale(0, 4).toString();
        Color a30 = new Color(219, 190, 1);
        Class565.Field2639.Method1217("t", a11 + 30, a12 + 12, Class681.Method3(219, 190, 1));
        RenderUtils.Method1108((double)a11 + 39.5, (double)a12 + 15.0, (double)a11 + 40.5 + a27, (double)a12 + 18.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
        RenderUtils.Method1105(a11 + 40, (double)a12 + 15.5, (float)(a11 + 40) + Field1638, (double)a12 + 17.5, a30.darker().getRGB());
        RenderUtils.Method1105(a11 + 40, (double)a12 + 15.5, (double)(a11 + 40) + a29, (double)a12 + 17.5, a30.getRGB());
        RenderUtils.Method1108((double)a11 + 39.5, (double)a12 + 22.0, (double)a11 + 12.5 + a27, (double)a12 + 25.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
        Class565.Field2639.Method1217("u", a11 + 30, a12 + 19, Class681.Method3(153, 153, 153));
        RenderUtils.Method1105(a11 + 40, (double)a12 + 22.5, (double)a11 + (40.0 + a28 / 2.0), (double)a12 + 24.5, Class681.Method3(0, 180, 255));
        Class565.Field2639.Method1222("t", (float)a11 + (a8 + 12.0f), (float)(a12 + 19) - 0.5f, Class681.Method3(0, 153, 255));
        Class565.Field2636.Method1223(a3, (float)a11 + (a8 + 24.0f), a12 + 19, -1, 0.5f);
        if (a2 instanceof EntityPlayer) {
            int a31;
            Class284 a32;
            Iterator iterator;
            Field1643.Method4(a2.hurtTime > 5);
            GL11.glPushMatrix();
            if (Field1644.Method1213() > 0.5) {
                iterator = Field1645.Method1383();
                if (iterator.Method932()) {
                    a32 = (Class284)iterator.Method933();
                    if (a32.Field1541 > 4.0) {
                        a32.Method3103();
                    }
                }
            }
            Field1645.clear();
            if (Field1646.Method3077(16L)) {
                iterator = Field1645.Method1383();
                if (iterator.Method932()) {
                    a32 = (Class284)iterator.Method933();
                    a32.Method3104();
                    if (a32.Field1541 < 1.0) {
                        Field1645.remove((Object)a32);
                    }
                }
                Field1646.Method3079();
            }
            if (a2.hurtTime >= 9 && (a31 = 0) <= 2) {
                a32 = new Class284();
                a32.Method3105(a11 + 13, a12 + 13, (Math.random() - 0.5) * 2.0 * 0.8, (Math.random() - 0.5) * 2.0 * 0.8, Math.random() * 3.0, new Color(255, 0, 0));
                Field1645.Method2530((Object)a32);
                ++a31;
            }
            GL11.glTranslatef((float)(a11 + 1), (float)(a12 + 1), (float)0.0f);
            float a210 = (float)a2.hurtTime / 10.0f;
            float a33 = a210 == 0.0f ? 1.0f : (a210 < 0.5f ? 1.0f - 0.2f * a210 * 2.0f : 0.8f + 0.2f * (a210 - 0.5f) * 2.0f);
            int a34 = 26;
            float a35 = (float)(1.0 - 0.1 * Field1643.Method6());
            GL11.glScalef((float)a35, (float)a35, (float)a35);
            GL11.glTranslatef((float)((float)a34 * 0.5f * (1.0f - a35) / a35), (float)((float)a34 * 0.5f * (1.0f - a35) / a35), (float)0.0f);
            Class211.Method2575(false);
            RenderUtils.Method1087(13.0f, 13.0f, 15.0f, Color.white.getRGB());
            Class211.Method2574(true);
            GL11.glColor4f((float)1.0f, (float)(1.0f - a210), (float)(1.0f - a210), (float)1.0f);
            Class340.Method266(a11 + 1, a12 + 1, 8.0f, 8.0f, 8, 8, 26, 26, 64.0f, 64.0f, (AbstractClientPlayer)a2);
            Class211.Method2573();
            GL11.glPopMatrix();
        }
        GlStateManager.popMatrix();
        RenderUtils.Method1146();
    }

    public static double Method265(double a2, int a3) {
        throw new IllegalArgumentException();
    }

    private static void Method266(double a2, double a3, float a4, float a5, int a6, int a7, int a8, int a9, float a10, float a11, AbstractClientPlayer a12) {
        block3: {
            ScaledResolution a13 = new ScaledResolution(Field1637);
            ResourceLocation a14 = a12.getLocationSkin();
            GL11.glEnable((int)3042);
            Field1637.getTextureManager().bindTexture(a14);
            Gui.drawScaledCustomSizeModalRect((int)0, (int)0, (float)a4, (float)a5, (int)a6, (int)a7, (int)a8, (int)a9, (float)a10, (float)a11);
            if (!a12.isWearing(EnumPlayerModelParts.HAT)) break block3;
            Gui.drawScaledCustomSizeModalRect((int)0, (int)0, (float)(a4 + 32.0f), (float)a5, (int)a6, (int)a7, (int)a8, (int)a9, (float)a10, (float)a11);
        }
        try {
            GL11.glDisable((int)3042);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected static void Method267(float a2, float a3, float a4, float a5, int a6, int a7) {
        float a8 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a9 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a10 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a11 = (float)(a6 & 0xFF) / 255.0f;
        float a12 = (float)(a7 >> 24 & 0xFF) / 255.0f;
        float a13 = (float)(a7 >> 16 & 0xFF) / 255.0f;
        float a14 = (float)(a7 >> 8 & 0xFF) / 255.0f;
        float a15 = (float)(a7 & 0xFF) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        Tessellator a16 = Tessellator.getInstance();
        WorldRenderer a17 = a16.getWorldRenderer();
        a17.begin(7, DefaultVertexFormats.POSITION_COLOR);
        a17.pos((double)a2, (double)a3, 0.0).color(a9, a10, a11, a8).endVertex();
        a17.pos((double)a2, (double)a5, 0.0).color(a9, a10, a11, a8).endVertex();
        a17.pos((double)a4, (double)a5, 0.0).color(a13, a14, a15, a12).endVertex();
        a17.pos((double)a4, (double)a3, 0.0).color(a13, a14, a15, a12).endVertex();
        a16.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    protected static void Method268(float a2, float a3, float a4, float a5, int a6, int a7) {
        float a8 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a9 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a10 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a11 = (float)(a6 & 0xFF) / 255.0f;
        float a12 = (float)(a7 >> 24 & 0xFF) / 255.0f;
        float a13 = (float)(a7 >> 16 & 0xFF) / 255.0f;
        float a14 = (float)(a7 >> 8 & 0xFF) / 255.0f;
        float a15 = (float)(a7 & 0xFF) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        Tessellator a16 = Tessellator.getInstance();
        WorldRenderer a17 = a16.getWorldRenderer();
        a17.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        a17.pos((double)a2, (double)a5, 0.0).tex(0.0, 1.0).color(a9, a10, a11, a8).endVertex();
        a17.pos((double)a4, (double)a5, 0.0).tex(1.0, 1.0).color(a9, a10, a11, a8).endVertex();
        a17.pos((double)a4, (double)a3, 0.0).tex(1.0, 0.0).color(a13, a14, a15, a12).endVertex();
        a17.pos((double)a2, (double)a3, 0.0).tex(0.0, 0.0).color(a13, a14, a15, a12).endVertex();
        a16.draw();
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