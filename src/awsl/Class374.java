/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import awsl.Class681;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import obfuscate.a;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ColorValue;

public class Class374
extends Class390 {
    public double Field1763;
    public ColorValue Field1764;
    public boolean Field1765;
    public float Field1766;
    public float Field1767;
    public float Field1768;
    public float Field1769;
    public boolean Field1770;
    private boolean Field1771;
    private boolean Field1772;
    private boolean Field1773;
    public float Field1774 = 0.0f;
    public float Field1775 = 0.0f;
    private static a[] Field1776;

    public Class374(ColorValue a2, Class381 a3, int a4, int a5, String a6, String a7) {
        super(a3, a4, a5, a6, a7);
        this.Field1764 = a2;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a3.Method1414());
        this.Field1910 = 18;
        if (this.Field1764 != null) {
            this.Field1763 = this.Field1764.Method2442();
            this.Method415(this.Field1764.Method2442());
        }
        this.Field1920 = "ColorPicker";
    }

    @Override
    public void Method419(int a2, int a3) {
        this.Field1916 = !this.Field1764.Method2756();
    }

    @Override
    public void Method411(int a2, int a3) {
        super.Method411(a2, a3);
        this.Field1910 = 12;
        if (GlobalModule.INSTANCE.Field3190.Method1825() != this || !GlobalModule.INSTANCE.Field3190.Method1834()) {
            this.Field1770 = false;
        }
        if (this.Field1764.Method2437()) {
            this.Method415(this.Field1764.Method2442());
        }
        if (this.Field1915) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u00a79" + this.Field1914 + "\n\u00a7e\u53f3\u952e\u6253\u5f00\u7740\u8272\u5668\n\u00a7eShift\u70b9\u51fb\u6b64\u5904\u5207\u6362\u5f69\u8272");
        }
    }

    @Override
    public void Method412(int a2, int a3) {
        float a4 = this.Method432()[0];
        float a5 = this.Method432()[1];
        Class565.Field2636.Method1217(this.Field1764.Method2754(), this.Field1907 + 5, this.Field1908 + 2, -1);
        int a6 = new Color(this.Method431()).darker().darker().getRGB();
        if (this == GlobalModule.INSTANCE.Field3190.Method1825() && this.Field1770) {
            a6 = -1;
        }
        RenderUtils.Method1104(a4 - 18.5f, a5 - 0.5f, a4 - 3.0f, a5 + 6.5f, a6);
        this.Method445(a4 - 18.0f, a5, a4 - 3.25f, a5 + 6.0f);
        RenderUtils.Method1104(a4 - 18.0f, a5, a4 - 3.25f, a5 + 6.0f, this.Method431());
    }

    @Override
    public void Method413(int a2, int a3, boolean a4) {
        float a5;
        float a6 = this.Method432()[0];
        this.Field1915 = MathUtils.isHovering(a2, a3, a6 - 18.5f, (a5 = this.Method432()[1]) - 0.5f, a6 - 3.0f, a5 + 6.5f) && this.Field1919.Method1392(a2, a3);
        if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown((int)0) && Keyboard.isKeyDown((int)42)) {
            this.Field1764.Method2438(!this.Field1764.Method2437());
            this.Method415(this.Field1764.Method2442());
            GlobalModule.INSTANCE.fileManager.saveValues();
        }
        if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown((int)1)) {
            this.Field1770 = !this.Field1770;
            GlobalModule.INSTANCE.Field3190.Method1824(this);
            this.Field1774 = a6 + 2.0f - (float)this.Field1907;
            this.Field1775 = a5 - (float)this.Field1908;
        }
        this.Field1918 = a4;
    }

    public boolean Method420() {
        return this.Field1915;
    }

    /*
     * WARNING - void declaration
     */
    public void Method421(int a2, int a3) {
        float a4;
        float a5;
        void a6;
        float a7;
        float a8;
        void a9;
        void a10;
        float[] fArray = this.Method433();
        void var5_4 = a10[0];
        a[] a11 = Class374.Method448();
        void a12 = a10[1];
        int a13 = Class681.Method1612(1);
        void a14 = a9;
        void a15 = a12;
        float a16 = this.Method434();
        float a17 = this.Method435();
        RenderUtils.Method1110((float)a14, (float)a15, (float)(a14 + a16), (float)(a15 + a17), 3.0f, a13);
        RenderUtils.Method1110((float)(a14 + 0.5f), (float)(a15 + 0.5f), (float)(a14 + a16 - 0.5f), (float)(a15 + a17 - 0.5f), 3.0f, Class681.Method1612(0x39393B));
        RenderUtils.Method1110((float)(a14 + 1.0f), (float)(a15 + 1.0f), (float)(a14 + a16 - 1.0f), (float)(a15 + a17 - 1.0f), 3.0f, Class681.Method1612(0x232323));
        float a18 = a16 - 17.0f;
        void a19 = a14 + 3.0f;
        void a20 = a15 + 3.0f;
        void a21 = a19 + a18;
        void a22 = a20 + a18;
        int a23 = new Color(255, 255, 255, 180).getRGB();
        if ((float)a2 <= a19 || (float)a3 <= a20 || (float)a2 >= a21 || (float)a3 >= a22) {
            // empty if block
        }
        RenderUtils.Method1104((float)(a19 - 0.5f), (float)(a20 - 0.5f), (float)(a21 + 0.5f), (float)(a22 + 0.5f), Class681.Method1612(0));
        this.Method446((float)a19, (float)a20, (float)a21, (float)a22);
        float a24 = this.Field1767 * (a21 - a19);
        float a25 = (1.0f - this.Field1768) * (a22 - a20);
        if (this.Field1771) {
            a8 = a21 - a19;
            a7 = (float)a2 - a19;
            if (a7 <= 0.0f) {
                a7 = 0.0f;
            }
            if (a7 >= a8) {
                a7 = a8;
            }
            this.Field1767 = a7 / a8;
            a24 = a7;
            a6 = a22 - a20;
            a5 = (float)a3 - a20;
            if (a5 <= 0.0f) {
                a5 = 0.0f;
            }
            if (a5 >= a6) {
                a5 = a6;
            }
            this.Field1768 = 1.0f - a5 / a6;
            a25 = a5;
            this.Method442(Color.HSBtoRGB((float)this.Field1766, (float)this.Field1767, (float)this.Field1768), false);
        }
        a8 = a19 + a24 - 0.5f;
        a7 = a20 + a25 - 0.5f;
        a6 = a19 + a24 + 0.5f;
        a5 = a20 + a25 + 0.5f;
        RenderUtils.Method1104((float)(a8 - 0.5f), a7 - 0.5f, a8, (float)(a5 + 0.5f), a13);
        RenderUtils.Method1104((float)a6, a7 - 0.5f, (float)(a6 + 0.5f), a5 + 0.5f, a13);
        RenderUtils.Method1104(a8, a7 - 0.5f, (float)a6, a7, a13);
        RenderUtils.Method1104(a8, a5, (float)a6, a5 + 0.5f, a13);
        RenderUtils.Method1104(a8, a7, (float)a6, a5, a23);
        a24 = a21 + 3.0f;
        a8 = a24 + 8.0f;
        if ((float)a2 <= a24 || (float)a3 <= a20 || (float)a2 >= a8 || (float)a3 >= a22) {
            // empty if block
        }
        a6 = a22 - a20;
        a5 = (1.0f - this.Field1766) * a6;
        if (this.Field1772) {
            a4 = (float)a3 - a20;
            if (a4 <= 0.0f) {
                a4 = 0.0f;
            }
            if (a4 >= a6) {
                a4 = a6;
            }
            this.Field1766 = 1.0f - a4 / a6;
            a5 = a4;
            this.Method442(Color.HSBtoRGB((float)this.Field1766, (float)this.Field1767, (float)this.Field1768), false);
        }
        RenderUtils.Method1104(a24 - 0.5f, (float)(a20 - 0.5f), a8 + 0.5f, (float)(a22 + 0.5f), a13);
        a4 = a22 - a20;
        float a26 = a4 / 5.0f;
        float a27 = a20;
        int a28 = 0;
        if ((float)a28 < 5.0f) {
            boolean a29 = (float)a28 == 4.0f;
            this.Method426(a24, a27, a8, (float)(a27 + a26), this.Method444(Color.HSBtoRGB((float)(1.0f - 0.2f * (float)a28), (float)1.0f, (float)1.0f)), this.Method444(Color.HSBtoRGB((float)(1.0f - 0.2f * (float)(a28 + 1)), (float)1.0f, (float)1.0f)));
            a27 += a26;
            ++a28;
            a.trash(new String[3]);
        }
        void a30 = a20 + a5 - 0.5f;
        void a31 = a20 + a5 + 0.5f;
        RenderUtils.Method1104(a24 - 0.5f, (float)(a30 - 0.5f), a24, (float)(a31 + 0.5f), a13);
        RenderUtils.Method1104(a8, (float)(a30 - 0.5f), a8 + 0.5f, (float)(a31 + 0.5f), a13);
        RenderUtils.Method1104(a24, (float)(a30 - 0.5f), a8, (float)a30, a13);
        RenderUtils.Method1104(a24, (float)a31, a8, (float)(a31 + 0.5f), a13);
        RenderUtils.Method1104(a24, (float)a30, a8, (float)a31, a23);
        a25 = a22 + 3.0f;
        a7 = a25 + 8.0f;
        if ((float)a2 <= a19 || (float)a3 <= a25 || (float)a2 >= a21 || (float)a3 >= a7) {
            // empty if block
        }
        int a32 = Color.HSBtoRGB((float)this.Field1766, (float)this.Field1767, (float)this.Field1768);
        int a33 = a32 >> 16 & 0xFF;
        int a34 = a32 >> 8 & 0xFF;
        int a35 = a32 & 0xFF;
        a4 = a21 - a19;
        a26 = this.Field1769 * a4;
        if (this.Field1773) {
            a27 = (float)a2 - a19;
            if (a27 <= 0.0f) {
                a27 = 0.0f;
            }
            if (a27 >= a6) {
                a27 = a6;
            }
            this.Field1769 = a27 / a4;
            a26 = a27;
            this.Method442(new Color(a33, a34, a35, (int)(this.Field1769 * 255.0f)).getRGB(), true);
        }
        RenderUtils.Method1104((float)(a19 - 0.5f), a25 - 0.5f, (float)(a21 + 0.5f), a7 + 0.5f, a13);
        this.Method445((float)a19, a25, (float)a21, a7);
        this.Method427((double)a19, a25, (double)a21, a7, true, new Color(a33, a34, a35, 0).getRGB(), new Color(a33, a34, a35, 255).getRGB());
        a27 = a19 + a26 - 0.5f;
        a31 = a19 + a26 + 0.5f;
        RenderUtils.Method1104(a27 - 0.5f, a25, (float)(a31 + 0.5f), a7, a13);
        RenderUtils.Method1104(a27, a25, (float)a31, a7, a23);
    }

    public static void Method422(float a2, float a3, float a4, float a5, float a6, int a7, int a8) {
        RenderUtils.Method1103(a2 + a6, a3 + a6, a4 - a6 * 2.0f, a5 - a6 * 2.0f, a7);
        RenderUtils.Method1103(a2, a3, a4, a6, a8);
        RenderUtils.Method1103(a2, a3 + a6, a6, a5 - a6, a8);
        RenderUtils.Method1103(a2 + a4 - a6, a3 + a6, a6, a5 - a6, a8);
        RenderUtils.Method1103(a2 + a6, a3 + a5 - a6, a4 - a6 * 2.0f, a6, a8);
    }

    public boolean Method423(int a2, int a3) {
        float[] a4 = this.Method433();
        float a5 = a4[0];
        float a6 = a4[1];
        float a7 = this.Method434();
        float a8 = this.Method435();
        return (float)a2 >= a5 && (float)a2 <= a5 + a7 && (float)a3 >= a6 && (float)a3 <= a6 + a8;
    }

    public void Method424(int a2, int a3) {
        if (Mouse.isButtonDown((int)0)) {
            float[] a4 = this.Method433();
            float a5 = a4[0];
            float a6 = a4[1];
            float a7 = this.Method434();
            float a8 = this.Method435();
            float a9 = a7 - 9.0f - 8.0f;
            float a10 = a5 + 3.0f;
            float a11 = a6 + 3.0f;
            float a12 = a10 + a9;
            float a13 = a11 + a9;
            float a14 = a13 + 3.0f;
            float a15 = a14 + 8.0f;
            float a16 = a12 + 3.0f;
            float a17 = a16 + 8.0f;
            this.Field1771 = !this.Field1771 && (float)a2 > a10 && (float)a3 > a11 && (float)a2 < a12 && (float)a3 < a13;
            this.Field1773 = !this.Field1773 && (float)a2 > a10 && (float)a3 > a14 && (float)a2 < a12 && (float)a3 < a15;
            this.Field1772 = !this.Field1772 && (float)a2 > a16 && (float)a3 > a11 && (float)a2 < a17 && (float)a3 < a13;
            this.Field1765 = true;
        }
    }

    public void Method425() {
        this.Field1765 = false;
        this.Field1772 = false;
        this.Field1771 = false;
        this.Field1773 = false;
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    /*
     * WARNING - void declaration
     */
    public void Method426(float a2, float a3, float a4, float a5, int a6, int a7) {
        void a8;
        float a9 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a10 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a11 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a12 = (float)(a6 & 0xFF) / 255.0f;
        float a13 = (float)(a7 >> 24 & 0xFF) / 255.0f;
        float a14 = (float)(a7 >> 16 & 0xFF) / 255.0f;
        float f = (float)(a7 >> 8 & 0xFF) / 255.0f;
        a[] a15 = Class374.Method448();
        float a16 = (float)(a7 & 0xFF) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        Tessellator a17 = Tessellator.getInstance();
        WorldRenderer a18 = a17.getWorldRenderer();
        a18.begin(7, DefaultVertexFormats.POSITION_COLOR);
        a18.pos((double)a4, (double)a3, 0.0).color(a10, a11, a12, a9).endVertex();
        a18.pos((double)a2, (double)a3, 0.0).color(a10, a11, a12, a9).endVertex();
        a18.pos((double)a2, (double)a5, 0.0).color(a14, (float)a8, a16, a13).endVertex();
        a18.pos((double)a4, (double)a5, 0.0).color(a14, (float)a8, a16, a13).endVertex();
        a17.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        if (a.trash() == null) {
            Class374.Method447(new a[4]);
        }
    }

    public void Method427(double a2, double a3, double a4, double a5, boolean a6, int a7, int a8) {
        GL11.glDisable((int)3553);
        a[] aArray = Class374.Method448();
        GL11.glEnable((int)3042);
        a[] aArray2 = aArray;
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        RenderUtils.Method1113(a7);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        RenderUtils.Method1113(a8);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a3);
        RenderUtils.Method1113(a8);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        RenderUtils.Method1113(a7);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3553);
    }

    private void Method428() {
        float[] a2 = this.Field1764.Method2443();
        this.Field1766 = a2[0];
        this.Field1767 = a2[1];
        this.Field1768 = a2[2];
    }

    private void Method429(float a2, float a3, float a4) {
        this.Field1764.Method2440(Color.getHSBColor((float)a2, (float)a3, (float)a4).getRGB());
    }

    public boolean Method430() {
        return this.Field1770;
    }

    public int Method431() {
        return this.Field1764.Method2442();
    }

    public float[] Method432() {
        return new float[]{this.Field1907 + 78, (float)this.Field1908 + 3.5f};
    }

    public float[] Method433() {
        return new float[]{(float)this.Field1907 + this.Field1774 - 75.0f, (float)this.Field1908 + this.Field1775 + 8.0f};
    }

    public float Method434() {
        return 70.0f;
    }

    public float Method435() {
        return this.Method434();
    }

    public void Method436(float a2) {
        this.Method440(a2, this.Field1767, this.Field1768);
    }

    public void Method437(float a2) {
        this.Method440(this.Field1766, a2, this.Field1768);
    }

    public void Method438(float a2) {
        this.Method440(this.Field1766, this.Field1767, a2);
    }

    public void Method439(float a2) {
        this.Field1769 = MathUtils.clamp(a2, 0.0f, 1.0f);
    }

    public void Method440(float a2, float a3, float a4) {
        this.Field1766 = a2;
        this.Field1767 = a3;
        this.Field1768 = a4;
    }

    public void Method415(int a2) {
        float[] a3 = this.Method441(a2);
        this.Field1766 = a3[0];
        this.Field1767 = a3[1];
        this.Field1768 = a3[2];
        this.Field1769 = (float)(a2 >> 24 & 0xFF) / 255.0f;
    }

    private float[] Method441(int a2) {
        int a3 = a2 >> 16 & 0xFF;
        int a4 = a2 >> 8 & 0xFF;
        int a5 = a2 & 0xFF;
        return Color.RGBtoHSB((int)a3, (int)a4, (int)a5, null);
    }

    public void Method442(int a2, boolean a3) {
        this.Method443(a2);
    }

    public void Method443(int a2) {
        this.Field1764.Method2440(Class681.Method2697(a2).getRGB());
    }

    public int Method444(int a2) {
        int a3 = a2 >> 16 & 0xFF;
        int a4 = a2 >> 8 & 0xFF;
        int a5 = a2 & 0xFF;
        int a6 = 255;
        return (a3 & 0xFF) << 16 | (a4 & 0xFF) << 8 | a5 & 0xFF | (a6 & 0xFF) << 24;
    }

    private void Method445(float a2, float a3, float a4, float a5) {
        RenderUtils.Method1104(a2, a3, a4, a5, this.Method444(0xFFFFFF));
        boolean bl = false;
        a[] a6 = Class374.Method448();
        if (a3 < a5) {
            boolean a7 = true;
            float a8 = a2 + (float)(true ? 1 : 0);
            if (a8 < a4) {
                if (a8 <= a4 - 1.0f) {
                    RenderUtils.Method1104(a8, a3, a8 + 1.0f, a3 + 1.0f, this.Method444(0x808080));
                }
                a8 += 2.0f;
            }
            a3 += 1.0f;
        }
    }

    private void Method446(float a2, float a3, float a4, float a5) {
        int a6 = this.Method444(Color.HSBtoRGB((float)this.Field1766, (float)1.0f, (float)1.0f));
        this.Method427(a2, a3, a4, a5, true, this.Method444(0xFFFFFF), a6);
        this.Method426(a2, a3, a4, a5, 0, this.Method444(0));
    }

    public static void Method447(a[] aArray) {
        Field1776 = aArray;
    }

    public static a[] Method448() {
        return Field1776;
    }

    static {
        Class374.Method447(new a[4]);
    }
}