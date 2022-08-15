/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import awsl.Class776;
import awsl.Class877;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class866
extends Class877 {
    private float Field3778 = 0.0f;
    private float Field3779 = 0.0f;
    private float Field3780;
    private float Field3781;
    private float Field3782;

    public Class866() {
        this.Method9(0);
    }

    public void Method56(float a) {
        this.Field3779 = a;
    }

    public float Method57() {
        return this.Field3779;
    }

    public void Method58(float a) {
        this.Field3778 = a;
    }

    public float Method59() {
        return this.Field3778;
    }

    public void Method60(float a) {
        this.Field3782 = a;
    }

    public float Method61() {
        return this.Field3782;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        this.Field3780 = a.getWidth();
        this.Field3781 = a.getHeight();
        int a5 = a.getType();
        this.Field3821 = new Rectangle(0, 0, a3, a4);
        boolean a6 = Class193.Method1269();
        this.Field3820 = new Rectangle(0, 0, a3, a4);
        this.Method834(this.Field3820);
        ColorModel a7 = a.getColorModel();
        a2 = new BufferedImage(a7, a7.createCompatibleWritableRaster(this.Field3820.width, this.Field3820.height), a7.isAlphaPremultiplied(), null);
        a7 = a2.getRaster();
        int[] a8 = this.Method104(a, 0, 0, a3, a4, null);
        if (this.Field3819 == 0) {
            return this.Method3589(a2, a3, a4, a8, this.Field3820);
        }
        int a9 = a3;
        int a10 = a4;
        int a11 = a3 - 1;
        int a12 = a4 - 1;
        int a13 = this.Field3820.width;
        int a14 = this.Field3820.height;
        boolean a15 = false;
        int[] a16 = new int[a13];
        int a17 = this.Field3820.x;
        int a18 = this.Field3820.y;
        float[] a19 = new float[4];
        int a20 = 0;
        if (a20 < a14) {
            int a21 = 0;
            if (a21 < a13) {
                int a22;
                int a23;
                int a24;
                int a25;
                int a26;
                this.Method3439(a17 + a21, a18 + a20, a19);
                int a27 = (int)Math.floor((double)a19[0]);
                int a28 = (int)Math.floor((double)a19[1]);
                float a29 = a19[0] - (float)a27;
                float a30 = a19[1] - (float)a28;
                if (a27 < a11) {
                    if (a28 < a12) {
                        a26 = a9 * a28 + a27;
                        a25 = a8[a26];
                        a24 = a8[a26 + 1];
                        a23 = a8[a26 + a9];
                        a22 = a8[a26 + a9 + 1];
                    }
                }
                a25 = this.Method3495(a8, a27, a28, a9, a10);
                a24 = this.Method3495(a8, a27 + 1, a28, a9, a10);
                a23 = this.Method3495(a8, a27, a28 + 1, a9, a10);
                a22 = this.Method3495(a8, a27 + 1, a28 + 1, a9, a10);
                a26 = Class776.Method1720(a29, a30, a25, a24, a23, a22);
                int a31 = a26 >> 16 & 0xFF;
                int a32 = a26 >> 8 & 0xFF;
                int a33 = a26 & 0xFF;
                float a34 = a19[2];
                a31 = (int)((float)a31 * a34);
                a32 = (int)((float)a32 * a34);
                a33 = (int)((float)a33 * a34);
                a26 = a26 & 0xFF000000 | a31 << 16 | a32 << 8 | a33;
                if (a19[3] != 0.0f) {
                    a16[a21] = Class767.Method1691(a26, a8[a9 * a20 + a21], 1);
                }
                a16[a21] = a26;
                ++a21;
            }
            this.Method1267(a2, 0, a20, this.Field3820.width, 1, a16);
            ++a20;
        }
        return a2;
    }

    private final int Method3495(int[] a, int a2, int a3, int a4, int a5) {
        block7: {
            block6: {
                if (a2 >= a4) break block6;
                if (a3 < a5) break block7;
            }
            switch (this.Field3818) {
                default: {
                    return 0;
                }
                case 2: {
                    return a[Class776.Method1715(a3, a5) * a4 + Class776.Method1715(a2, a4)];
                }
                case 1: 
            }
            return a[Class776.Method1712(a3, 0, a5 - 1) * a4 + Class776.Method1712(a2, 0, a4 - 1)];
        }
        return a[a3 * a4 + a2];
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4 = this.Field3779;
        float a5 = a;
        float a6 = a2;
        float a7 = (float)Math.sin((double)this.Field3778);
        float a8 = (float)Math.cos((double)this.Field3778);
        float a9 = a4 * this.Field3780;
        a9 = a4 * (float)Math.sqrt((double)(this.Field3780 * this.Field3780 + this.Field3781 * this.Field3781));
        float a10 = a8 < 0.0f ? this.Field3780 : 0.0f;
        float a11 = a7 < 0.0f ? this.Field3781 : 0.0f;
        float a12 = (a5 -= a10) * a8 + (a6 -= a11) * a7;
        float a13 = -a5 * a7 + a6 * a8;
        boolean a14 = a12 < a9;
        boolean a15 = a12 > a9 * 2.0f;
        boolean a16 = true;
        a12 = a12 > a9 * 2.0f ? a12 : 2.0f * a9 - a12;
        a5 = a12 * a8 - a13 * a7;
        a6 = a12 * a7 + a13 * a8;
        boolean a17 = (a5 += a10) < 0.0f || (a6 += a11) < 0.0f || a5 >= this.Field3780 || a6 >= this.Field3781;
        a5 = a;
        a6 = a2;
        float a18 = 1.9f * (1.0f - (float)Math.cos((double)Math.exp((double)((a12 - a9) / this.Field3782))));
        a3[2] = 1.0f - a18;
        a3[1] = -1.0f;
        a3[0] = -1.0f;
        a3[3] = 1.0f;
    }

    public String toString() {
        return "Distort/Curl...";
    }
}