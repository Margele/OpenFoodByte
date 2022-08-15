/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.Kernel
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class187;
import awsl.Class193;
import awsl.Class767;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class Class881
extends Class193 {
    private int Field3846 = 5;
    private int Field3847 = 5;
    private int Field3848 = 10;

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = this.Method1263(a, null);
        int[] a5 = new int[a3 * a4];
        int[] a6 = new int[a3 * a4];
        this.Method104(a, 0, 0, a3, a4, a5);
        Kernel a7 = Class187.Method1294(this.Field3846);
        this.Method3600(a7, a5, a6, a3, a4, true);
        this.Method3600(a7, a6, a5, a4, a3, true);
        this.Method1267(a2, 0, 0, a3, a4, a5);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private void Method3600(Kernel a, int[] a2, int[] a3, int a4, int a5, boolean a6) {
        void a7;
        boolean bl = false;
        float[] a8 = a.getKernelData(null);
        int a9 = a.getWidth();
        int a10 = a9 / 2;
        boolean bl2 = false;
        boolean a11 = Class193.Method1269();
        if (a7 < a5) {
            void a12 = a7 * a4;
            void a13 = a7;
            int a14 = 0;
            if (a14 < a4) {
                int a15;
                int a16;
                float a17 = 0.0f;
                float a18 = 0.0f;
                float a19 = 0.0f;
                float a20 = 0.0f;
                int a21 = a10;
                int a22 = a2[a12 + a14];
                int a23 = a22 >> 24 & 0xFF;
                int a24 = a22 >> 16 & 0xFF;
                int a25 = a22 >> 8 & 0xFF;
                int a26 = a22 & 0xFF;
                float a27 = 0.0f;
                float a28 = 0.0f;
                float a29 = 0.0f;
                float a30 = 0.0f;
                int a31 = -a10;
                if (a31 <= a10) {
                    float a32 = a8[a21 + a31];
                    if (a32 != 0.0f) {
                        a16 = a14 + a31;
                        if (0 > a16 || a16 >= a4) {
                            a16 = a14;
                        }
                        a15 = a2[a12 + a16];
                        int a33 = a15 >> 24 & 0xFF;
                        int a34 = a15 >> 16 & 0xFF;
                        int a35 = a15 >> 8 & 0xFF;
                        int a36 = a15 & 0xFF;
                        int a37 = a23 - a33;
                        if (a37 >= -this.Field3848 && a37 <= this.Field3848) {
                            a20 += a32 * (float)a33;
                            a27 += a32;
                        }
                        if ((a37 = a24 - a34) >= -this.Field3848 && a37 <= this.Field3848) {
                            a17 += a32 * (float)a34;
                            a28 += a32;
                        }
                        if ((a37 = a25 - a35) >= -this.Field3848 && a37 <= this.Field3848) {
                            a18 += a32 * (float)a35;
                            a29 += a32;
                        }
                        if ((a37 = a26 - a36) >= -this.Field3848 && a37 <= this.Field3848) {
                            a19 += a32 * (float)a36;
                            a30 += a32;
                        }
                    }
                    ++a31;
                }
                a20 = a27 == 0.0f ? (float)a23 : a20 / a27;
                a17 = a28 == 0.0f ? (float)a24 : a17 / a28;
                a18 = a29 == 0.0f ? (float)a25 : a18 / a29;
                a19 = a30 == 0.0f ? (float)a26 : a19 / a30;
                a31 = Class767.Method1687((int)((double)a20 + 0.5));
                int a38 = Class767.Method1687((int)((double)a17 + 0.5));
                a16 = Class767.Method1687((int)((double)a18 + 0.5));
                a15 = Class767.Method1687((int)((double)a19 + 0.5));
                a3[a13] = a31 << 24 | a38 << 16 | a16 << 8 | a15;
                a13 += a5;
                ++a14;
            }
            ++a7;
        }
    }

    public void Method9(int a) {
        this.Field3846 = a;
    }

    public int Method10() {
        return this.Field3846;
    }

    public void Method11(int a) {
        this.Field3847 = a;
    }

    public int Method12() {
        return this.Field3847;
    }

    public void Method13(int a) {
        this.Field3846 = this.Field3847 = a;
    }

    public int Method14() {
        return this.Field3846;
    }

    public void Method15(int a) {
        this.Field3848 = a;
    }

    public int Method16() {
        return this.Field3848;
    }

    public String toString() {
        return "Blur/Smart Blur...";
    }
}