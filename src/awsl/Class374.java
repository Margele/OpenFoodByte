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
import awsl.Class91;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
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
    private static Class91[] Field1776;

    public Class374(ColorValue a, Class381 a2, int a3, int a4, String a5, String a6) {
        super(a2, a3, a4, a5, a6);
        this.Field1764 = a;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a2.Method1414());
        this.Field1910 = 18;
        if (this.Field1764 != null) {
            this.Field1763 = this.Field1764.Method2442();
            this.Method415(this.Field1764.Method2442());
        }
        this.Field1920 = "ColorPicker";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1764.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
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
    public void Method412(int a, int a2) {
        float a3 = this.Method432()[0];
        float a4 = this.Method432()[1];
        Class565.Field2636.Method1217(this.Field1764.Method2754(), this.Field1907 + 5, this.Field1908 + 2, -1);
        int a5 = new Color(this.Method431()).darker().darker().getRGB();
        if (this == GlobalModule.INSTANCE.Field3190.Method1825() && this.Field1770) {
            a5 = -1;
        }
        RenderUtils.Method1104(a3 - 18.5f, a4 - 0.5f, a3 - 3.0f, a4 + 6.5f, a5);
        this.Method445(a3 - 18.0f, a4, a3 - 3.25f, a4 + 6.0f);
        RenderUtils.Method1104(a3 - 18.0f, a4, a3 - 3.25f, a4 + 6.0f, this.Method431());
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        float a4;
        float a5 = this.Method432()[0];
        this.Field1915 = MathUtils.Method549(a, a2, a5 - 18.5f, (a4 = this.Method432()[1]) - 0.5f, a5 - 3.0f, a4 + 6.5f) && this.Field1919.Method1392(a, a2);
        if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown((int)0) && Keyboard.isKeyDown((int)42)) {
            this.Field1764.Method2438(!this.Field1764.Method2437());
            this.Method415(this.Field1764.Method2442());
            GlobalModule.INSTANCE.fileManager.saveValues();
        }
        if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown((int)1)) {
            this.Field1770 = !this.Field1770;
            GlobalModule.INSTANCE.Field3190.Method1824(this);
            this.Field1774 = a5 + 2.0f - (float)this.Field1907;
            this.Field1775 = a4 - (float)this.Field1908;
        }
        this.Field1918 = a3;
    }

    public boolean Method420() {
        return this.Field1915;
    }

    /*
     * WARNING - void declaration
     */
    public void Method421(int a, int a2) {
        float a3;
        float a4;
        void a5;
        float a6;
        float a7;
        void a8;
        void a9;
        float[] fArray = this.Method433();
        void var5_4 = a9[0];
        Class91[] a10 = Class374.Method448();
        void a11 = a9[1];
        int a12 = Class681.Method1612(1);
        void a13 = a8;
        void a14 = a11;
        float a15 = this.Method434();
        float a16 = this.Method435();
        RenderUtils.Method1110((float)a13, (float)a14, (float)(a13 + a15), (float)(a14 + a16), 3.0f, a12);
        RenderUtils.Method1110((float)(a13 + 0.5f), (float)(a14 + 0.5f), (float)(a13 + a15 - 0.5f), (float)(a14 + a16 - 0.5f), 3.0f, Class681.Method1612(0x39393B));
        RenderUtils.Method1110((float)(a13 + 1.0f), (float)(a14 + 1.0f), (float)(a13 + a15 - 1.0f), (float)(a14 + a16 - 1.0f), 3.0f, Class681.Method1612(0x232323));
        float a17 = a15 - 17.0f;
        void a18 = a13 + 3.0f;
        void a19 = a14 + 3.0f;
        void a20 = a18 + a17;
        void a21 = a19 + a17;
        int a22 = new Color(255, 255, 255, 180).getRGB();
        if ((float)a <= a18 || (float)a2 <= a19 || (float)a >= a20 || (float)a2 >= a21) {
            // empty if block
        }
        RenderUtils.Method1104((float)(a18 - 0.5f), (float)(a19 - 0.5f), (float)(a20 + 0.5f), (float)(a21 + 0.5f), Class681.Method1612(0));
        this.Method446((float)a18, (float)a19, (float)a20, (float)a21);
        float a23 = this.Field1767 * (a20 - a18);
        float a24 = (1.0f - this.Field1768) * (a21 - a19);
        if (this.Field1771) {
            a7 = a20 - a18;
            a6 = (float)a - a18;
            if (a6 <= 0.0f) {
                a6 = 0.0f;
            }
            if (a6 >= a7) {
                a6 = a7;
            }
            this.Field1767 = a6 / a7;
            a23 = a6;
            a5 = a21 - a19;
            a4 = (float)a2 - a19;
            if (a4 <= 0.0f) {
                a4 = 0.0f;
            }
            if (a4 >= a5) {
                a4 = a5;
            }
            this.Field1768 = 1.0f - a4 / a5;
            a24 = a4;
            this.Method442(Color.HSBtoRGB((float)this.Field1766, (float)this.Field1767, (float)this.Field1768), false);
        }
        a7 = a18 + a23 - 0.5f;
        a6 = a19 + a24 - 0.5f;
        a5 = a18 + a23 + 0.5f;
        a4 = a19 + a24 + 0.5f;
        RenderUtils.Method1104((float)(a7 - 0.5f), a6 - 0.5f, a7, (float)(a4 + 0.5f), a12);
        RenderUtils.Method1104((float)a5, a6 - 0.5f, (float)(a5 + 0.5f), a4 + 0.5f, a12);
        RenderUtils.Method1104(a7, a6 - 0.5f, (float)a5, a6, a12);
        RenderUtils.Method1104(a7, a4, (float)a5, a4 + 0.5f, a12);
        RenderUtils.Method1104(a7, a6, (float)a5, a4, a22);
        a23 = a20 + 3.0f;
        a7 = a23 + 8.0f;
        if ((float)a <= a23 || (float)a2 <= a19 || (float)a >= a7 || (float)a2 >= a21) {
            // empty if block
        }
        a5 = a21 - a19;
        a4 = (1.0f - this.Field1766) * a5;
        if (this.Field1772) {
            a3 = (float)a2 - a19;
            if (a3 <= 0.0f) {
                a3 = 0.0f;
            }
            if (a3 >= a5) {
                a3 = a5;
            }
            this.Field1766 = 1.0f - a3 / a5;
            a4 = a3;
            this.Method442(Color.HSBtoRGB((float)this.Field1766, (float)this.Field1767, (float)this.Field1768), false);
        }
        RenderUtils.Method1104(a23 - 0.5f, (float)(a19 - 0.5f), a7 + 0.5f, (float)(a21 + 0.5f), a12);
        a3 = a21 - a19;
        float a25 = a3 / 5.0f;
        float a26 = a19;
        int a27 = 0;
        if ((float)a27 < 5.0f) {
            boolean a28 = (float)a27 == 4.0f;
            this.Method426(a23, a26, a7, (float)(a26 + a25), this.Method444(Color.HSBtoRGB((float)(1.0f - 0.2f * (float)a27), (float)1.0f, (float)1.0f)), this.Method444(Color.HSBtoRGB((float)(1.0f - 0.2f * (float)(a27 + 1)), (float)1.0f, (float)1.0f)));
            a26 += a25;
            ++a27;
            Class91.Method3647(new String[3]);
        }
        void a29 = a19 + a4 - 0.5f;
        void a30 = a19 + a4 + 0.5f;
        RenderUtils.Method1104(a23 - 0.5f, (float)(a29 - 0.5f), a23, (float)(a30 + 0.5f), a12);
        RenderUtils.Method1104(a7, (float)(a29 - 0.5f), a7 + 0.5f, (float)(a30 + 0.5f), a12);
        RenderUtils.Method1104(a23, (float)(a29 - 0.5f), a7, (float)a29, a12);
        RenderUtils.Method1104(a23, (float)a30, a7, (float)(a30 + 0.5f), a12);
        RenderUtils.Method1104(a23, (float)a29, a7, (float)a30, a22);
        a24 = a21 + 3.0f;
        a6 = a24 + 8.0f;
        if ((float)a <= a18 || (float)a2 <= a24 || (float)a >= a20 || (float)a2 >= a6) {
            // empty if block
        }
        int a31 = Color.HSBtoRGB((float)this.Field1766, (float)this.Field1767, (float)this.Field1768);
        int a32 = a31 >> 16 & 0xFF;
        int a33 = a31 >> 8 & 0xFF;
        int a34 = a31 & 0xFF;
        a3 = a20 - a18;
        a25 = this.Field1769 * a3;
        if (this.Field1773) {
            a26 = (float)a - a18;
            if (a26 <= 0.0f) {
                a26 = 0.0f;
            }
            if (a26 >= a5) {
                a26 = a5;
            }
            this.Field1769 = a26 / a3;
            a25 = a26;
            this.Method442(new Color(a32, a33, a34, (int)(this.Field1769 * 255.0f)).getRGB(), true);
        }
        RenderUtils.Method1104((float)(a18 - 0.5f), a24 - 0.5f, (float)(a20 + 0.5f), a6 + 0.5f, a12);
        this.Method445((float)a18, a24, (float)a20, a6);
        this.Method427((double)a18, a24, (double)a20, a6, true, new Color(a32, a33, a34, 0).getRGB(), new Color(a32, a33, a34, 255).getRGB());
        a26 = a18 + a25 - 0.5f;
        a30 = a18 + a25 + 0.5f;
        RenderUtils.Method1104(a26 - 0.5f, a24, (float)(a30 + 0.5f), a6, a12);
        RenderUtils.Method1104(a26, a24, (float)a30, a6, a22);
    }

    public static void Method422(float a, float a2, float a3, float a4, float a5, int a6, int a7) {
        RenderUtils.Method1103(a + a5, a2 + a5, a3 - a5 * 2.0f, a4 - a5 * 2.0f, a6);
        RenderUtils.Method1103(a, a2, a3, a5, a7);
        RenderUtils.Method1103(a, a2 + a5, a5, a4 - a5, a7);
        RenderUtils.Method1103(a + a3 - a5, a2 + a5, a5, a4 - a5, a7);
        RenderUtils.Method1103(a + a5, a2 + a4 - a5, a3 - a5 * 2.0f, a5, a7);
    }

    public boolean Method423(int a, int a2) {
        float[] a3 = this.Method433();
        float a4 = a3[0];
        float a5 = a3[1];
        float a6 = this.Method434();
        float a7 = this.Method435();
        return (float)a >= a4 && (float)a <= a4 + a6 && (float)a2 >= a5 && (float)a2 <= a5 + a7;
    }

    public void Method424(int a, int a2) {
        if (Mouse.isButtonDown((int)0)) {
            float[] a3 = this.Method433();
            float a4 = a3[0];
            float a5 = a3[1];
            float a6 = this.Method434();
            float a7 = this.Method435();
            float a8 = a6 - 9.0f - 8.0f;
            float a9 = a4 + 3.0f;
            float a10 = a5 + 3.0f;
            float a11 = a9 + a8;
            float a12 = a10 + a8;
            float a13 = a12 + 3.0f;
            float a14 = a13 + 8.0f;
            float a15 = a11 + 3.0f;
            float a16 = a15 + 8.0f;
            this.Field1771 = !this.Field1771 && (float)a > a9 && (float)a2 > a10 && (float)a < a11 && (float)a2 < a12;
            this.Field1773 = !this.Field1773 && (float)a > a9 && (float)a2 > a13 && (float)a < a11 && (float)a2 < a14;
            this.Field1772 = !this.Field1772 && (float)a > a15 && (float)a2 > a10 && (float)a < a16 && (float)a2 < a12;
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
    public void Method426(float a, float a2, float a3, float a4, int a5, int a6) {
        void a7;
        float a8 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a9 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a10 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a11 = (float)(a5 & 0xFF) / 255.0f;
        float a12 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a13 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float f = (float)(a6 >> 8 & 0xFF) / 255.0f;
        Class91[] a14 = Class374.Method448();
        float a15 = (float)(a6 & 0xFF) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        Tessellator a16 = Tessellator.getInstance();
        WorldRenderer a17 = a16.getWorldRenderer();
        a17.begin(7, DefaultVertexFormats.POSITION_COLOR);
        a17.pos((double)a3, (double)a2, 0.0).color(a9, a10, a11, a8).endVertex();
        a17.pos((double)a, (double)a2, 0.0).color(a9, a10, a11, a8).endVertex();
        a17.pos((double)a, (double)a4, 0.0).color(a13, (float)a7, a15, a12).endVertex();
        a17.pos((double)a3, (double)a4, 0.0).color(a13, (float)a7, a15, a12).endVertex();
        a16.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        if (Class91.Method3648() == null) {
            Class374.Method447(new Class91[4]);
        }
    }

    public void Method427(double a, double a2, double a3, double a4, boolean a5, int a6, int a7) {
        GL11.glDisable((int)3553);
        Class91[] class91Array = Class374.Method448();
        GL11.glEnable((int)3042);
        Class91[] class91Array2 = class91Array;
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        RenderUtils.Method1113(a6);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        RenderUtils.Method1113(a7);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a2);
        RenderUtils.Method1113(a7);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        RenderUtils.Method1113(a6);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3553);
    }

    private void Method428() {
        float[] a = this.Field1764.Method2443();
        this.Field1766 = a[0];
        this.Field1767 = a[1];
        this.Field1768 = a[2];
    }

    private void Method429(float a, float a2, float a3) {
        this.Field1764.Method2440(Color.getHSBColor((float)a, (float)a2, (float)a3).getRGB());
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

    public void Method436(float a) {
        this.Method440(a, this.Field1767, this.Field1768);
    }

    public void Method437(float a) {
        this.Method440(this.Field1766, a, this.Field1768);
    }

    public void Method438(float a) {
        this.Method440(this.Field1766, this.Field1767, a);
    }

    public void Method439(float a) {
        this.Field1769 = MathUtils.Method574(a, 0.0f, 1.0f);
    }

    public void Method440(float a, float a2, float a3) {
        this.Field1766 = a;
        this.Field1767 = a2;
        this.Field1768 = a3;
    }

    public void Method415(int a) {
        float[] a2 = this.Method441(a);
        this.Field1766 = a2[0];
        this.Field1767 = a2[1];
        this.Field1768 = a2[2];
        this.Field1769 = (float)(a >> 24 & 0xFF) / 255.0f;
    }

    private float[] Method441(int a) {
        int a2 = a >> 16 & 0xFF;
        int a3 = a >> 8 & 0xFF;
        int a4 = a & 0xFF;
        return Color.RGBtoHSB((int)a2, (int)a3, (int)a4, null);
    }

    public void Method442(int a, boolean a2) {
        this.Method443(a);
    }

    public void Method443(int a) {
        this.Field1764.Method2440(Class681.Method2697(a).getRGB());
    }

    public int Method444(int a) {
        int a2 = a >> 16 & 0xFF;
        int a3 = a >> 8 & 0xFF;
        int a4 = a & 0xFF;
        int a5 = 255;
        return (a2 & 0xFF) << 16 | (a3 & 0xFF) << 8 | a4 & 0xFF | (a5 & 0xFF) << 24;
    }

    private void Method445(float a, float a2, float a3, float a4) {
        RenderUtils.Method1104(a, a2, a3, a4, this.Method444(0xFFFFFF));
        boolean bl = false;
        Class91[] a5 = Class374.Method448();
        if (a2 < a4) {
            boolean a6 = true;
            float a7 = a + (float)(true ? 1 : 0);
            if (a7 < a3) {
                if (a7 <= a3 - 1.0f) {
                    RenderUtils.Method1104(a7, a2, a7 + 1.0f, a2 + 1.0f, this.Method444(0x808080));
                }
                a7 += 2.0f;
            }
            a2 += 1.0f;
        }
    }

    private void Method446(float a, float a2, float a3, float a4) {
        int a5 = this.Method444(Color.HSBtoRGB((float)this.Field1766, (float)1.0f, (float)1.0f));
        this.Method427(a, a2, a3, a4, true, this.Method444(0xFFFFFF), a5);
        this.Method426(a, a2, a3, a4, 0, this.Method444(0));
    }

    public static void Method447(Class91[] class91Array) {
        Field1776 = class91Array;
    }

    public static Class91[] Method448() {
        return Field1776;
    }

    static {
        Class374.Method447(new Class91[4]);
    }
}