/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.FloatBuffer
 *  java.nio.IntBuffer
 *  java.text.NumberFormat
 *  javax.vecmath.Vector3d
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.Vec3
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
package trash.foodbyte.utils;

import awsl.Class681;
import awsl.Class91;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.text.NumberFormat;
import javax.vecmath.Vector3d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.Wrapper;

public class RenderUtils {
    private static final Frustum Field1620;
    private static Minecraft Field1621;
    private static int[] Field1622;

    /*
     * Exception decompiling
     */
    public static double Method1073(double a, double a, double a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27 : DSTORE_0 - null : trying to set 0 previously set to 1
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1559)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:434)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at cuchaz.enigma.source.cfr.CfrSource.ensureDecompiled(CfrSource.java:81)
         *     at cuchaz.enigma.source.cfr.CfrSource.asString(CfrSource.java:50)
         *     at cuchaz.enigma.EnigmaProject$JarExport.decompileClass(EnigmaProject.java:298)
         *     at cuchaz.enigma.EnigmaProject$JarExport.lambda$decompileStream$1(EnigmaProject.java:274)
         *     at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
         *     at java.base/java.util.AbstractList$RandomAccessSpliterator.forEachRemaining(AbstractList.java:720)
         *     at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
         *     at java.base/java.util.stream.ForEachOps$ForEachTask.compute(ForEachOps.java:290)
         *     at java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:754)
         *     at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
         *     at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
         *     at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
         *     at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
         *     at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     */
    public static void Method1074(float a, float a2, float a3, float a4, int a5) {
        void var2_2;
        void var4_4;
        void var3_3;
        float f;
        void var1_1;
        RenderUtils.Method1104(a - 0.5f, (float)(var1_1 + 0.5f), f, (float)(var3_3 - 0.5f), (int)var4_4);
        RenderUtils.Method1104((float)var2_2, (float)(var1_1 + 0.5f), (float)(var2_2 + 0.5f), (float)(var3_3 - 0.5f), (int)var4_4);
        RenderUtils.Method1104(f + 0.5f, (float)(var1_1 - 0.5f), (float)(var2_2 - 0.5f), (float)var1_1, (int)var4_4);
        RenderUtils.Method1104(f + 0.5f, (float)var3_3, (float)(var2_2 - 0.5f), (float)(var3_3 + 0.5f), (int)var4_4);
        RenderUtils.Method1104(f, (float)var1_1, (float)var2_2, (float)var3_3, (int)var4_4);
    }

    public static void Method1075(float a, float a2, float a3, float a4, float a5, int a6) {
        RenderUtils.Method1104(a - a5, a2, a, a4, a6);
        RenderUtils.Method1104(a3, a2, a3 + a5, a4, a6);
        RenderUtils.Method1104(a, a2 + a5, a3, a2, a6);
        RenderUtils.Method1104(a, a4, a3, a4 + a5, a6);
    }

    public static int Method1076() {
        ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
        int a2 = a.getScaledWidth();
        return a2;
    }

    public static int Method1077() {
        ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
        int a2 = a.getScaledHeight();
        return a2;
    }

    public static int Method1078() {
        ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
        int a2 = a.getScaleFactor();
        return a2;
    }

    public static void Method1079(float a, float a2, float a3, float a4) {
        int a5 = RenderUtils.Method1078();
        GL11.glEnable((int)3089);
        GL11.glScissor((int)((int)(a * (float)a5)), (int)((int)((float)Display.getHeight() - a2 * (float)a5)), (int)((int)(a3 * (float)a5)), (int)((int)(a4 * (float)a5)));
    }

    public static void Method1080(float a, float a2, float a3, float a4) {
        ScaledResolution a5 = new ScaledResolution(Minecraft.getMinecraft());
        int a6 = a5.getScaleFactor();
        GL11.glEnable((int)3089);
        GL11.glScissor((int)((int)(a * (float)a6)), (int)((int)(((float)a5.getScaledHeight() - a4) * (float)a6)), (int)((int)((a3 - a) * (float)a6)), (int)((int)((a4 - a2) * (float)a6)));
    }

    public static void Method1081(int a, int a2, float a3, float a4, float a5) {
        int a6 = 1;
        while ((float)a6 < a5 && RenderUtils.Field1621.displayWidth / (a6 + 1) >= 320 && RenderUtils.Field1621.displayHeight / (a6 + 1) >= 240) {
            ++a6;
        }
        GL11.glScissor((int)(a * a6), (int)((int)((float)RenderUtils.Field1621.displayHeight - ((float)a2 + a4) * (float)a6)), (int)((int)(a3 * (float)a6)), (int)((int)(a4 * (float)a6)));
    }

    public static void Method1082() {
        GL11.glDisable((int)3089);
    }

    public static void Method1083(double a, double a2, double a3, double a4, double a5, double a6, int a7) {
        RenderUtils.Method1084(a, a2, a3, a4, a5, a6, a7, true);
    }

    public static void Method1084(double a, double a2, double a3, double a4, double a5, double a6, int a7, boolean a8) {
        RenderUtils.Method1088(a8);
        RenderUtils.Method1133(a7);
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)a, (double)a2, (double)a3);
        GL11.glVertex3d((double)a4, (double)a5, (double)a6);
        GL11.glEnd();
        RenderUtils.Method1089(a8);
    }

    public static void Method1085(double a, double a2, double a3, double a4, float a5, int a6) {
        RenderUtils.Method1090();
        RenderUtils.Method1133(a6);
        GL11.glLineWidth((float)a5);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glEnd();
        RenderUtils.Method1091();
    }

    public static void Method1086(float a, float a2, float a3, float a4, int a5) {
        RenderUtils.Method1090();
        RenderUtils.Method1133(a5);
        GL11.glLineWidth((float)a4);
        int a6 = (int)Math.min((float)Math.max((float)a3, (float)45.0f), (float)360.0f);
        GL11.glBegin((int)2);
        for (int a7 = 0; a7 < a6; ++a7) {
            double a8 = Math.PI * 2 * (double)a7 / (double)a6;
            GL11.glVertex2d((double)((double)a + Math.sin((double)a8) * (double)a3), (double)((double)a2 + Math.cos((double)a8) * (double)a3));
        }
        GL11.glEnd();
        RenderUtils.Method1091();
    }

    public static void Method1087(float a, float a2, float a3, int a4) {
        RenderUtils.Method1090();
        RenderUtils.Method1133(a4);
        int a5 = (int)Math.min((float)Math.max((float)a3, (float)45.0f), (float)360.0f);
        GL11.glBegin((int)9);
        for (int a6 = 0; a6 < a5; ++a6) {
            double a7 = Math.PI * 2 * (double)a6 / (double)a5;
            GL11.glVertex2d((double)((double)a + Math.sin((double)a7) * (double)a3), (double)((double)a2 + Math.cos((double)a7) * (double)a3));
        }
        GL11.glEnd();
        RenderUtils.Method1091();
        RenderUtils.Method1086(a, a2, a3, 1.5f, 0xFFFFFF);
    }

    public static void Method1088(boolean a) {
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)1.0f);
    }

    public static void Method1089(boolean a) {
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1090() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
    }

    public static void Method1091() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    public static void Method1092() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
    }

    public static void Method1093() {
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1094(ResourceLocation a, int a2, int a3, float a4, float a5, float a6) {
        ScaledResolution a7 = new ScaledResolution(Minecraft.getMinecraft());
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)a6);
        Minecraft.getMinecraft().getTextureManager().bindTexture(a);
        Gui.drawModalRectWithCustomSizedTexture((int)a2, (int)a3, (float)0.0f, (float)0.0f, (int)((int)a4), (int)((int)a5), (float)a4, (float)a5);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
    }

    public static int Method1095(int a, float a2) {
        Color a3 = new Color(a);
        float a4 = 0.003921569f * (float)a3.getRed();
        float a5 = 0.003921569f * (float)a3.getGreen();
        float a6 = 0.003921569f * (float)a3.getBlue();
        return new Color(a4, a5, a6, a2).getRGB();
    }

    public static boolean Method1096(float a, float a2, float a3, float a4, float a5, float a6) {
        return a > a3 && a < a5 && a2 > a4 && a2 < a6;
    }

    public static void Method1097(double a, double a2, double a3, int a4) {
        float a5 = (float)(a4 >> 16 & 0xFF) / 255.0f;
        float a6 = (float)(a4 >> 8 & 0xFF) / 255.0f;
        float a7 = (float)(a4 & 0xFF) / 255.0f;
        float a8 = (float)(a4 >> 24 & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        GL11.glColor4f((float)a5, (float)a6, (float)a7, (float)a8);
        RenderUtils.Method1098(new AxisAlignedBB(a, a2, a3, a + 1.0, a2 + 1.0, a3 + 1.0));
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method1098(AxisAlignedBB a) {
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

    public static void Method1099(float a, float a2, float a3, float a4, int a5, int a6) {
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        RenderUtils.Method1102(a *= 2.0f, (a2 *= 2.0f) + 1.0f, (a4 *= 2.0f) - 2.0f, a5);
        RenderUtils.Method1102((a3 *= 2.0f) - 1.0f, a2 + 1.0f, a4 - 2.0f, a5);
        RenderUtils.Method1101(a + 2.0f, a3 - 3.0f, a2, a5);
        RenderUtils.Method1101(a + 2.0f, a3 - 3.0f, a4 - 1.0f, a5);
        RenderUtils.Method1101(a + 1.0f, a + 1.0f, a2 + 1.0f, a5);
        RenderUtils.Method1101(a3 - 2.0f, a3 - 2.0f, a2 + 1.0f, a5);
        RenderUtils.Method1101(a3 - 2.0f, a3 - 2.0f, a4 - 2.0f, a5);
        RenderUtils.Method1101(a + 1.0f, a + 1.0f, a4 - 2.0f, a5);
        RenderUtils.Method1104(a + 1.0f, a2 + 1.0f, a3 - 1.0f, a4 - 1.0f, a6);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    public static void Method1100(float a, float a2, float a3, float a4, float a5, int a6, float a7, int a8) {
        double a9;
        int[] a10 = RenderUtils.Method1148();
        if (a6 == 0xFFFFFF) {
            a6 = Class681.WHITE.Field2962;
        }
        if (a8 == 0xFFFFFF) {
            a8 = Class681.WHITE.Field2962;
        }
        if (a5 < 0.0f) {
            a5 = 0.0f;
        }
        if (a5 > a3 / 2.0f) {
            a5 = a3 / 2.0f;
        }
        if (a5 > a4 / 2.0f) {
            a5 = a4 / 2.0f;
        }
        RenderUtils.Method1104(a + a5, a2 + a5, a3 - a5 * 2.0f, a4 - a5 * 2.0f, a6);
        RenderUtils.Method1104(a + a5, a2, a3 - a5 * 2.0f, a5, a6);
        RenderUtils.Method1104(a + a5, a2 + a4 - a5, a3 - a5 * 2.0f, a5, a6);
        RenderUtils.Method1104(a, a2 + a5, a5, a4 - a5 * 2.0f, a6);
        RenderUtils.Method1104(a + a3 - a5, a2 + a5, a5, a4 - a5 * 2.0f, a6);
        RenderUtils.Method1090();
        RenderUtils.Method1113(a6);
        GL11.glBegin((int)6);
        float a11 = a + a5;
        float a12 = a2 + a5;
        GL11.glVertex2d((double)a11, (double)a12);
        int a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        int a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)(a14 + 180) / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
            Class91.Method3647(new String[2]);
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a11 = a + a3 - a5;
        a12 = a2 + a5;
        GL11.glVertex2d((double)a11, (double)a12);
        a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)(a14 + 90) / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a11 = a + a5;
        a12 = a2 + a4 - a5;
        GL11.glVertex2d((double)a11, (double)a12);
        a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)(a14 + 270) / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a11 = a + a3 - a5;
        a12 = a2 + a4 - a5;
        GL11.glVertex2d((double)a11, (double)a12);
        a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)a14 / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
        }
        GL11.glEnd();
        RenderUtils.Method1113(a8);
        GL11.glLineWidth((float)a7);
        GL11.glBegin((int)3);
        a11 = a + a5;
        a12 = a2 + a5;
        a13 = a14 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a9 = Math.PI * 2 * (double)(a14 + 180) / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)(a + a5), (double)a2);
        GL11.glVertex2d((double)(a + a3 - a5), (double)a2);
        a11 = a + a3 - a5;
        a12 = a2 + a5;
        a14 = a13;
        a9 = Math.PI * 2 * (double)(a14 + 90) / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a5));
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a4 - a5));
        a11 = a + a3 - a5;
        a12 = a2 + a4 - a5;
        a14 = a13;
        a9 = Math.PI * 2 * (double)a14 / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)(a + a3 - a5), (double)(a2 + a4));
        GL11.glVertex2d((double)(a + a5), (double)(a2 + a4));
        a11 = a + a5;
        a12 = a2 + a4 - a5;
        a14 = a13;
        a9 = Math.PI * 2 * (double)(a14 + 270) / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)a, (double)(a2 + a4 - a5));
        GL11.glVertex2d((double)a, (double)(a2 + a5));
        GL11.glEnd();
        RenderUtils.Method1091();
    }

    public static void Method1101(float a, float a2, float a3, int a4) {
        if (a2 < a) {
            float a5 = a;
            a = a2;
            a2 = a5;
        }
        RenderUtils.Method1104(a, a3, a2 + 1.0f, a3 + 1.0f, a4);
    }

    public static void Method1102(float a, float a2, float a3, int a4) {
        if (a3 < a2) {
            float a5 = a2;
            a2 = a3;
            a3 = a5;
        }
        RenderUtils.Method1104(a, a2 + 1.0f, a + 1.0f, a3, a4);
    }

    public static void Method1103(float a, float a2, float a3, float a4, int a5) {
        RenderUtils.Method1090();
        RenderUtils.Method1133(a5);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)(a + a3), (double)a2);
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a4));
        GL11.glVertex2d((double)a, (double)(a2 + a4));
        GL11.glEnd();
        RenderUtils.Method1091();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1104(float a, float a2, float a3, float a4, int a5) {
        float a6;
        if (a < a3) {
            a6 = a;
            a = a3;
            a3 = a6;
        }
        if (a2 < a4) {
            a6 = a2;
            a2 = a4;
            a4 = a6;
        }
        a6 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a7 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a9 = (float)(a5 & 0xFF) / 255.0f;
        WorldRenderer a10 = Tessellator.getInstance().getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.color((float)a7, (float)a8, (float)a9, (float)a6);
        a10.begin(7, DefaultVertexFormats.POSITION);
        a10.pos((double)a, (double)a4, 0.0).endVertex();
        a10.pos((double)a3, (double)a4, 0.0).endVertex();
        a10.pos((double)a3, (double)a2, 0.0).endVertex();
        a10.pos((double)a, (double)a2, 0.0).endVertex();
        Tessellator.getInstance().draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1105(double a, double a2, double a3, double a4, int a5) {
        double a6;
        if (a < a3) {
            a6 = a;
            a = a3;
            a3 = a6;
        }
        if (a2 < a4) {
            a6 = a2;
            a2 = a4;
            a4 = a6;
        }
        float a7 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a5 & 0xFF) / 255.0f;
        Tessellator a11 = Tessellator.getInstance();
        WorldRenderer a12 = a11.getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.color((float)a8, (float)a9, (float)a10, (float)a7);
        a12.begin(7, DefaultVertexFormats.POSITION);
        a12.pos(a, a4, 0.0).endVertex();
        a12.pos(a3, a4, 0.0).endVertex();
        a12.pos(a3, a2, 0.0).endVertex();
        a12.pos(a, a2, 0.0).endVertex();
        a11.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1106(double a, double a2, double a3, double a4, int a5, int a6) {
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
        a16.pos(a3, a2, 0.0).color(a8, a9, a10, a7).endVertex();
        a16.pos(a, a2, 0.0).color(a8, a9, a10, a7).endVertex();
        a16.pos(a, a4, 0.0).color(a12, a13, a14, a11).endVertex();
        a16.pos(a3, a4, 0.0).color(a12, a13, a14, a11).endVertex();
        a15.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void Method1107(int a, float a2, int a3, float a4, float a5, int a6) {
        float a7;
        int a8 = 18;
        float a9 = 5.0f;
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
        RenderUtils.Method1113(a6);
        GL11.glBegin((int)5);
        GL11.glVertex2f((float)((float)a + a5), (float)a2);
        GL11.glVertex2f((float)((float)a + a5), (float)a4);
        GL11.glVertex2f((float)((float)a3 - a5), (float)a2);
        GL11.glVertex2f((float)((float)a3 - a5), (float)a4);
        GL11.glEnd();
        GL11.glBegin((int)5);
        GL11.glVertex2f((float)a, (float)(a2 + a5));
        GL11.glVertex2f((float)((float)a + a5), (float)(a2 + a5));
        GL11.glVertex2f((float)a, (float)(a4 - a5));
        GL11.glVertex2f((float)((float)a + a5), (float)(a4 - a5));
        GL11.glEnd();
        GL11.glBegin((int)5);
        GL11.glVertex2f((float)a3, (float)(a2 + a5));
        GL11.glVertex2f((float)((float)a3 - a5), (float)(a2 + a5));
        GL11.glVertex2f((float)a3, (float)(a4 - a5));
        GL11.glVertex2f((float)((float)a3 - a5), (float)(a4 - a5));
        GL11.glEnd();
        GL11.glBegin((int)6);
        float a10 = (float)a3 - a5;
        float a11 = a2 + a5;
        GL11.glVertex2f((float)a10, (float)a11);
        int a12 = 0;
        for (a12 = 0; a12 <= 18; ++a12) {
            float a13 = (float)a12 * 5.0f;
            GL11.glVertex2f((float)((float)((double)a10 + (double)a5 * Math.cos((double)Math.toRadians((double)a13)))), (float)((float)((double)a11 - (double)a5 * Math.sin((double)Math.toRadians((double)a13)))));
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a10 = (float)a + a5;
        a11 = a2 + a5;
        GL11.glVertex2f((float)a10, (float)a11);
        for (a12 = 0; a12 <= 18; ++a12) {
            a7 = (float)a12 * 5.0f;
            GL11.glVertex2f((float)((float)((double)a10 - (double)a5 * Math.cos((double)Math.toRadians((double)a7)))), (float)((float)((double)a11 - (double)a5 * Math.sin((double)Math.toRadians((double)a7)))));
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a10 = (float)a + a5;
        a11 = a4 - a5;
        GL11.glVertex2f((float)a10, (float)a11);
        for (a12 = 0; a12 <= 18; ++a12) {
            a7 = (float)a12 * 5.0f;
            GL11.glVertex2f((float)((float)((double)a10 - (double)a5 * Math.cos((double)Math.toRadians((double)a7)))), (float)((float)((double)a11 + (double)a5 * Math.sin((double)Math.toRadians((double)a7)))));
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a10 = (float)a3 - a5;
        a11 = a4 - a5;
        GL11.glVertex2f((float)a10, (float)a11);
        for (a12 = 0; a12 <= 18; ++a12) {
            a7 = (float)a12 * 5.0f;
            GL11.glVertex2f((float)((float)((double)a10 + (double)a5 * Math.cos((double)Math.toRadians((double)a7)))), (float)((float)((double)a11 + (double)a5 * Math.sin((double)Math.toRadians((double)a7)))));
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)3042);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void Method1108(double a, double a2, double a3, double a4, double a5, int a6, int a7) {
        RenderUtils.Method1109(a + a5, a2 + a5, a3 - a5, a4 - a5, a6);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderUtils.Method1109(a + a5, a2, a3 - a5, a2 + a5, a7);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderUtils.Method1109(a, a2, a + a5, a4, a7);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderUtils.Method1109(a3 - a5, a2, a3, a4, a7);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderUtils.Method1109(a + a5, a4 - a5, a3 - a5, a4, a7);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1109(double a, double a2, double a3, double a4, int a5) {
        double a6;
        if (a < a3) {
            a6 = a;
            a = a3;
            a3 = a6;
        }
        if (a2 < a4) {
            a6 = a2;
            a2 = a4;
            a4 = a6;
        }
        float a7 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a5 & 0xFF) / 255.0f;
        Tessellator a11 = Tessellator.getInstance();
        WorldRenderer a12 = a11.getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.color((float)a8, (float)a9, (float)a10, (float)a7);
        a12.begin(7, DefaultVertexFormats.POSITION);
        a12.pos(a, a4, 0.0).endVertex();
        a12.pos(a3, a4, 0.0).endVertex();
        a12.pos(a3, a2, 0.0).endVertex();
        a12.pos(a, a2, 0.0).endVertex();
        a11.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1110(float a, float a2, float a3, float a4, float a5, int a6) {
        RenderUtils.Method1104(a += (float)((double)(a5 / 2.0f) + 0.5), a2 += (float)((double)(a5 / 2.0f) + 0.5), a3 -= (float)((double)(a5 / 2.0f) + 0.5), a4 -= (float)((double)(a5 / 2.0f) + 0.5), a6);
        RenderUtils.Method1111(a3 - a5 / 2.0f, a2 + a5 / 2.0f, a5, a6);
        RenderUtils.Method1111(a + a5 / 2.0f, a4 - a5 / 2.0f, a5, a6);
        RenderUtils.Method1111(a + a5 / 2.0f, a2 + a5 / 2.0f, a5, a6);
        RenderUtils.Method1111(a3 - a5 / 2.0f, a4 - a5 / 2.0f, a5, a6);
        RenderUtils.Method1104(a - a5 / 2.0f - 0.5f, a2 + a5 / 2.0f, a3, a4 - a5 / 2.0f, a6);
        RenderUtils.Method1104(a, a2 + a5 / 2.0f, a3 + a5 / 2.0f + 0.5f, a4 - a5 / 2.0f, a6);
        RenderUtils.Method1104(a + a5 / 2.0f, a2 - a5 / 2.0f - 0.5f, a3 - a5 / 2.0f, a4 - a5 / 2.0f, a6);
        RenderUtils.Method1104(a + a5 / 2.0f, a2, a3 - a5 / 2.0f, a4 + a5 / 2.0f + 0.5f, a6);
    }

    public static void Method1111(float a, float a2, float a3, int a4) {
        RenderUtils.Method1112(a, a2, 0.0f, 360.0f, a3, a4);
    }

    public static void Method1112(float a, float a2, float a3, float a4, float a5, int a6) {
        RenderUtils.Method1115(a, a2, a3, a4, a5, a5, a6);
    }

    public static void Method1113(int a) {
        float a2 = (float)(a >> 24 & 0xFF) / 255.0f;
        float a3 = (float)(a >> 16 & 0xFF) / 255.0f;
        float a4 = (float)(a >> 8 & 0xFF) / 255.0f;
        float a5 = (float)(a & 0xFF) / 255.0f;
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)a2);
    }

    public static int Method1114(int a) {
        double a2 = Math.ceil((double)((double)(System.currentTimeMillis() + (long)a) / 4.0));
        return Color.getHSBColor((float)((float)((a2 %= 360.0) / 360.0)), (float)0.6f, (float)1.0f).getRGB();
    }

    public static void Method1115(float a, float a2, float a3, float a4, float a5, float a6, int a7) {
        float a8;
        float a9;
        float a10;
        GlStateManager.color((float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        float a11 = 0.0f;
        if (a3 > a4) {
            a11 = a4;
            a4 = a3;
            a3 = a11;
        }
        float a12 = (float)(a7 >> 24 & 0xFF) / 255.0f;
        float a13 = (float)(a7 >> 16 & 0xFF) / 255.0f;
        float a14 = (float)(a7 >> 8 & 0xFF) / 255.0f;
        float a15 = (float)(a7 & 0xFF) / 255.0f;
        Tessellator a16 = Tessellator.getInstance();
        WorldRenderer a17 = a16.getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.color((float)a13, (float)a14, (float)a15, (float)a12);
        if (a12 > 0.5f) {
            GL11.glEnable((int)2848);
            GL11.glLineWidth((float)2.0f);
            GL11.glBegin((int)3);
            for (a10 = a4; a10 >= a3; a10 -= 4.0f) {
                a9 = (float)Math.cos((double)((double)a10 * Math.PI / 180.0)) * (a5 * 1.001f);
                a8 = (float)Math.sin((double)((double)a10 * Math.PI / 180.0)) * (a6 * 1.001f);
                GL11.glVertex2f((float)(a + a9), (float)(a2 + a8));
            }
            GL11.glEnd();
            GL11.glDisable((int)2848);
        }
        GL11.glBegin((int)6);
        for (a10 = a4; a10 >= a3; a10 -= 4.0f) {
            a9 = (float)Math.cos((double)((double)a10 * Math.PI / 180.0)) * a5;
            a8 = (float)Math.sin((double)((double)a10 * Math.PI / 180.0)) * a6;
            GL11.glVertex2f((float)(a + a9), (float)(a2 + a8));
        }
        GL11.glEnd();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void Method1116(double a, double a2, double a3, double a4, int a5, int a6) {
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
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glColor4f((float)a12, (float)a13, (float)a14, (float)a11);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
    }

    public static void Method1117(float a, float a2, int a3, int a4, float a5, int a6) {
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2881);
        GL11.glBlendFunc((int)770, (int)771);
        RenderUtils.Method1113(a6);
        GL11.glBegin((int)9);
        for (int a7 = a3; a7 <= a4; ++a7) {
            double a8 = Math.sin((double)((double)a7 * Math.PI / 180.0)) * (double)a5;
            double a9 = Math.cos((double)((double)a7 * Math.PI / 180.0)) * (double)a5;
            GL11.glVertex3d((double)((double)a + a8), (double)((double)a2 + a9), (double)0.0);
        }
        GL11.glEnd();
        GL11.glDisable((int)2881);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void Method1118(float a, float a2, float a3, float a4, int a5, int a6, int a7) {
        RenderUtils.Method1104(a, a2, a3, a4, a5);
        RenderUtils.Method1104(a + 0.5f, a2 + 0.5f, a3 - 0.5f, a4 - 0.5f, a6);
        RenderUtils.Method1104(a + 1.0f, a2 + 1.0f, a3 - 1.0f, a4 - 1.0f, a7);
    }

    public static void Method1119(float a, float a2, float a3, float a4) {
        ScaledResolution a5 = new ScaledResolution(Minecraft.getMinecraft());
        int a6 = a5.getScaleFactor();
        GL11.glScissor((int)((int)(a * (float)a6)), (int)((int)(((float)a5.getScaledHeight() - a4) * (float)a6)), (int)((int)((a3 - a) * (float)a6)), (int)((int)((a4 - a2) * (float)a6)));
    }

    public static void Method1120(double a, double a2, double a3, double a4, double a5, float a6, float a7, float a8, float a9, float a10, float a11, float a12, float a13, float a14) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)a6, (float)a7, (float)a8, (float)a9);
        RenderUtils.Method1124(new AxisAlignedBB(a - a4, a2, a3 - a4, a + a4, a2 + a5, a3 + a4));
        GL11.glLineWidth((float)a14);
        GL11.glColor4f((float)a10, (float)a11, (float)a12, (float)a13);
        RenderUtils.Method1098(new AxisAlignedBB(a - a4, a2, a3 - a4, a + a4, a2 + a5, a3 + a4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1121(double a, double a2, double a3, double a4, double a5, float a6, float a7, float a8, float a9) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        GL11.glColor4f((float)a6, (float)a7, (float)a8, (float)a9);
        RenderUtils.Method1098(new AxisAlignedBB(a - a4, a2, a3 - a4, a + a4, a2 + a5, a3 + a4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method1122(double a, double a2, double a3, double a4, double a5, float a6, float a7, float a8, float a9) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        GL11.glColor4f((float)a6, (float)a7, (float)a8, (float)a9);
        RenderUtils.Method1124(new AxisAlignedBB(a - a4, a2, a3 - a4, a + a4, a2 + a5, a3 + a4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method1123(Entity a, Color a2) {
        GL11.glPushMatrix();
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double a3 = ReflectionUtils.Method2587();
        double a4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * a3 - ReflectionUtils.Method2591();
        double a5 = a.lastTickPosY + (a.posY - a.lastTickPosY) * a3 - ReflectionUtils.Method2592();
        double a6 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a3 - ReflectionUtils.Method2593();
        AxisAlignedBB a7 = AxisAlignedBB.fromBounds((double)(a4 - (double)a.width), (double)(a5 + 0.1), (double)(a6 - (double)a.width), (double)(a4 + (double)a.width), (double)(a5 + (double)a.height - 0.05), (double)(a6 + (double)a.width));
        if (a instanceof EntityLivingBase) {
            a7 = AxisAlignedBB.fromBounds((double)(a4 - (double)a.width + 0.2), (double)a5, (double)(a6 - (double)a.width + 0.2), (double)(a4 + (double)a.width - 0.2), (double)(a5 + (double)a.height + 0.2), (double)(a6 + (double)a.width - 0.2));
        }
        GL11.glLineWidth((float)1.0f);
        GL11.glTranslated((double)a4, (double)a5, (double)a6);
        GL11.glRotated((double)(-a.rotationYaw % 360.0f), (double)0.0, (double)1.0, (double)0.0);
        GL11.glTranslated((double)(-a4), (double)(-a5), (double)(-a6));
        GL11.glColor4f((float)((float)a2.getRed() / 255.0f), (float)((float)a2.getGreen() / 255.0f), (float)((float)a2.getBlue() / 255.0f), (float)1.0f);
        RenderUtils.Method1098(a7);
        GL11.glColor4f((float)((float)a2.getRed() / 255.0f), (float)((float)a2.getGreen() / 255.0f), (float)((float)a2.getBlue() / 255.0f), (float)0.2f);
        RenderUtils.Method1124(a7);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void Method1124(AxisAlignedBB a) {
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
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a2.draw();
    }

    public static void Method1125(Color a) {
        GL11.glColor4f((float)((float)a.getRed() / 255.0f), (float)((float)a.getGreen() / 255.0f), (float)((float)a.getBlue() / 255.0f), (float)((float)a.getAlpha() / 255.0f));
    }

    public static void Method1126(float a) {
        RenderUtils.Method1127();
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)a);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2960);
        GL11.glClear((int)1024);
        GL11.glClearStencil((int)15);
        GL11.glStencilFunc((int)512, (int)1, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void Method1127() {
        block0: {
            Framebuffer a = Minecraft.getMinecraft().getFramebuffer();
            if (a.depthBuffer <= -1) break block0;
            RenderUtils.Method1128(a);
            a.depthBuffer = -1;
        }
    }

    public static void Method1128(Framebuffer a) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)a.depthBuffer);
        int a2 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)a2);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)Minecraft.getMinecraft().displayWidth, (int)Minecraft.getMinecraft().displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)a2);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)a2);
    }

    public static void Method1129() {
        GL11.glStencilFunc((int)512, (int)0, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    public static void Method1130() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void Method1131(int a) {
        float a2 = (float)(a >> 24 & 0xFF) / 255.0f;
        float a3 = (float)(a >> 16 & 0xFF) / 255.0f;
        float a4 = (float)(a >> 8 & 0xFF) / 255.0f;
        float a5 = (float)(a & 0xFF) / 255.0f;
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)(a2 == 0.0f ? 1.0f : a2));
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)10754);
        GL11.glPolygonOffset((float)1.0f, (float)-2000000.0f);
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
    }

    public static void Method1132() {
        GL11.glPolygonOffset((float)1.0f, (float)2000000.0f);
        GL11.glDisable((int)10754);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)2960);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
    }

    public static void Method1133(int a) {
        float a2 = (float)(a >> 24 & 0xFF) / 255.0f;
        float a3 = (float)(a >> 16 & 0xFF) / 255.0f;
        float a4 = (float)(a >> 8 & 0xFF) / 255.0f;
        float a5 = (float)(a & 0xFF) / 255.0f;
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)(a2 == 0.0f ? 1.0f : a2));
    }

    public static void Method1134(double a, double a2, double a3, int a4, int a5, float a6) {
        float a7 = (float)(a4 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a4 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a4 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a4 & 0xFF) / 255.0f;
        float a11 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a12 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a13 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a14 = (float)(a5 & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        GL11.glColor4f((float)a8, (float)a9, (float)a10, (float)a7);
        RenderUtils.Method1124(new AxisAlignedBB(a, a2, a3, a + 1.0, a2 + 1.0, a3 + 1.0));
        GL11.glLineWidth((float)a6);
        GL11.glColor4f((float)a12, (float)a13, (float)a14, (float)a11);
        RenderUtils.Method1098(new AxisAlignedBB(a, a2, a3, a + 1.0, a2 + 1.0, a3 + 1.0));
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    public static Vec3 Method1135(double a, double a2, double a3) {
        FloatBuffer a4 = BufferUtils.createFloatBuffer((int)3);
        IntBuffer a5 = BufferUtils.createIntBuffer((int)16);
        FloatBuffer a6 = BufferUtils.createFloatBuffer((int)16);
        FloatBuffer a7 = BufferUtils.createFloatBuffer((int)16);
        GL11.glGetFloat((int)2982, (FloatBuffer)a6);
        GL11.glGetFloat((int)2983, (FloatBuffer)a7);
        GL11.glGetInteger((int)2978, (IntBuffer)a5);
        boolean a8 = GLU.gluProject((float)((float)a), (float)((float)a2), (float)((float)a3), (FloatBuffer)a6, (FloatBuffer)a7, (IntBuffer)a5, (FloatBuffer)a4);
        return new Vec3((double)a4.get(0), (double)((float)Display.getHeight() - a4.get(1)), (double)a4.get(2));
    }

    public static Vector3d Method1136(double a, double a2, double a3) {
        FloatBuffer a4 = GLAllocation.createDirectFloatBuffer((int)4);
        FloatBuffer a5 = BufferUtils.createFloatBuffer((int)3);
        IntBuffer a6 = BufferUtils.createIntBuffer((int)16);
        FloatBuffer a7 = BufferUtils.createFloatBuffer((int)16);
        FloatBuffer a8 = BufferUtils.createFloatBuffer((int)16);
        GL11.glGetFloat((int)2982, (FloatBuffer)a7);
        GL11.glGetFloat((int)2983, (FloatBuffer)a8);
        GL11.glGetInteger((int)2978, (IntBuffer)a6);
        if (GLU.gluProject((float)((float)a), (float)((float)a2), (float)((float)a3), (FloatBuffer)a7, (FloatBuffer)a8, (IntBuffer)a6, (FloatBuffer)a4)) {
            return new Vector3d((double)(a4.get(0) / (float)RenderUtils.Method1078()), (double)(((float)Display.getHeight() - a4.get(1)) / (float)RenderUtils.Method1078()), (double)a4.get(2));
        }
        return null;
    }

    public static void Method1137(float a, float a2, float a3, float a4, float a5, int a6) {
        boolean a7 = GL11.glIsEnabled((int)3042);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        RenderUtils.Method1138(a6);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)(a - a3 / a4), (double)(a2 + a3));
        GL11.glVertex2d((double)a, (double)(a2 + a3 / a5));
        GL11.glVertex2d((double)(a + a3 / a4), (double)(a2 + a3));
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glEnd();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.8f);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)(a - a3 / a4), (double)(a2 + a3));
        GL11.glVertex2d((double)a, (double)(a2 + a3 / a5));
        GL11.glVertex2d((double)(a + a3 / a4), (double)(a2 + a3));
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void Method1138(int a) {
        float a2 = (float)(a >> 16 & 0xFF) / 255.0f;
        float a3 = (float)(a >> 8 & 0xFF) / 255.0f;
        float a4 = (float)(a & 0xFF) / 255.0f;
        float a5 = (float)(a >> 24 & 0xFF) / 255.0f;
        GL11.glColor4f((float)a2, (float)a3, (float)a4, (float)a5);
    }

    public static Color Method1139(float[] a, Color[] a2, float a3) {
        Color a4 = null;
        if (a.length == a2.length) {
            int[] a5 = RenderUtils.Method1140(a, a3);
            float[] a6 = new float[]{a[a5[0]], a[a5[1]]};
            Color[] a7 = new Color[]{a2[a5[0]], a2[a5[1]]};
            float a8 = a6[1] - a6[0];
            float a9 = a3 - a6[0];
            float a10 = a9 / a8;
            a4 = RenderUtils.Method1141(a7[0], a7[1], 1.0f - a10);
            return a4;
        }
        throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
    }

    public static int[] Method1140(float[] a, float a2) {
        int a3;
        int[] a4 = new int[2];
        for (a3 = 0; a3 < a.length && a[a3] <= a2; ++a3) {
        }
        if (a3 >= a.length) {
            a3 = a.length - 1;
        }
        a4[0] = a3 - 1;
        a4[1] = a3;
        return a4;
    }

    public static Color Method1141(Color a, Color a2, double a3) {
        float a4 = (float)a3;
        float a5 = 1.0f - a4;
        float[] a6 = new float[3];
        float[] a7 = new float[3];
        a.getColorComponents(a6);
        a2.getColorComponents(a7);
        float a8 = a6[0] * a4 + a7[0] * a5;
        float a9 = a6[1] * a4 + a7[1] * a5;
        float a10 = a6[2] * a4 + a7[2] * a5;
        if (a8 < 0.0f) {
            a8 = 0.0f;
        } else if (a8 > 255.0f) {
            a8 = 255.0f;
        }
        if (a9 < 0.0f) {
            a9 = 0.0f;
        } else if (a9 > 255.0f) {
            a9 = 255.0f;
        }
        if (a10 < 0.0f) {
            a10 = 0.0f;
        } else if (a10 > 255.0f) {
            a10 = 255.0f;
        }
        Color a11 = null;
        try {
            a11 = new Color(a8, a9, a10);
        }
        catch (IllegalArgumentException a12) {
            NumberFormat a13 = NumberFormat.getNumberInstance();
            System.out.println(a13.format((double)a8) + "; " + a13.format((double)a9) + "; " + a13.format((double)a10));
            a12.printStackTrace();
        }
        return a11;
    }

    public static void Method1142(int a, int a2, int a3, int a4, int a5, int a6) {
        float a7 = 0.00390625f;
        float a8 = 0.00390625f;
        Tessellator a9 = Tessellator.getInstance();
        WorldRenderer a10 = a9.getWorldRenderer();
        a10.begin(7, DefaultVertexFormats.POSITION_TEX);
        a10.pos((double)a, (double)(a2 + a6), 0.0).tex((double)((float)a3 * a7), (double)((float)(a4 + a6) * a8)).endVertex();
        a10.pos((double)(a + a5), (double)(a2 + a6), 0.0).tex((double)((float)(a3 + a5) * a7), (double)((float)(a4 + a6) * a8)).endVertex();
        a10.pos((double)(a + a5), (double)a2, 0.0).tex((double)((float)(a3 + a5) * a7), (double)((float)a4 * a8)).endVertex();
        a10.pos((double)a, (double)a2, 0.0).tex((double)((float)a3 * a7), (double)((float)a4 * a8)).endVertex();
        a9.draw();
    }

    public static boolean Method1143(Entity a) {
        return RenderUtils.Method1144(a.getEntityBoundingBox()) || a.ignoreFrustumCheck;
    }

    public static boolean Method1144(AxisAlignedBB a) {
        Entity a2 = Wrapper.INSTANCE.Method2868().getRenderViewEntity();
        Field1620.setPosition(a2.posX, a2.posY, a2.posZ);
        return Field1620.isBoundingBoxInFrustum(a);
    }

    public static void Method1145(float a, float a2, float a3) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)a, (float)a2, (float)0.0f);
        GlStateManager.scale((float)a3, (float)a3, (float)1.0f);
        GlStateManager.translate((float)(-a), (float)(-a2), (float)0.0f);
    }

    public static void Method1146() {
        GlStateManager.popMatrix();
    }

    static {
        RenderUtils.Method1147(new int[1]);
        Field1620 = new Frustum();
        Field1621 = Wrapper.INSTANCE.Method2868();
    }

    public static void Method1147(int[] nArray) {
        Field1622 = nArray;
    }

    public static int[] Method1148() {
        return Field1622;
    }

    private static IllegalArgumentException Method1149(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}