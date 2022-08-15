/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.Kernel
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class183;
import awsl.Class193;
import awsl.Class767;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class Class187
extends Class183 {
    protected float Field1150;
    protected Kernel Field1151;

    public Class187() {
        this(2.0f);
    }

    public Class187(float a) {
        this.Method56(a);
    }

    public void Method56(float a) {
        this.Field1150 = a;
        this.Field1151 = Class187.Method1294(a);
    }

    public float Method57() {
        return this.Field1150;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = this.Method1263(a, null);
        int[] a5 = new int[a3 * a4];
        int[] a6 = new int[a3 * a4];
        a.getRGB(0, 0, a3, a4, a5, 0, a3);
        if (this.Field1150 > 0.0f) {
            Class187.Method1293(this.Field1151, a5, a6, a3, a4, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
            Class187.Method1293(this.Field1151, a6, a5, a4, a3, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
        }
        a2.setRGB(0, 0, a3, a4, a5, 0, a3);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void Method1293(Kernel a, int[] a2, int[] a3, int a4, int a5, boolean a6, boolean a7, boolean a8, int a9) {
        float[] a10 = a.getKernelData(null);
        int a11 = a.getWidth();
        int n = a11 / 2;
        boolean a12 = Class193.Method1269();
        int a13 = 0;
        if (a13 < a5) {
            int a14 = a13;
            int a15 = a13 * a4;
            int a16 = 0;
            if (a16 < a4) {
                int a17;
                int a18;
                void a19;
                float a20 = 0.0f;
                float a21 = 0.0f;
                float a22 = 0.0f;
                float a23 = 0.0f;
                void a24 = a19;
                void a25 = -a19;
                if (a25 <= a19) {
                    float a26 = a10[a24 + a25];
                    if (a26 != 0.0f) {
                        a18 = a16 + a25;
                        if (a9 == Field1136) {
                            a18 = 0;
                        }
                        if (a9 == Field1137) {
                            a18 = (a16 + a4) % a4;
                            if (a18 >= a4) {
                                if (a9 == Field1136) {
                                    a18 = a4 - 1;
                                }
                                if (a9 == Field1137) {
                                    a18 = (a16 + a4) % a4;
                                }
                            }
                        }
                        a17 = a2[a15 + a18];
                        int a27 = a17 >> 24 & 0xFF;
                        int a28 = a17 >> 16 & 0xFF;
                        int a29 = a17 >> 8 & 0xFF;
                        int a30 = a17 & 0xFF;
                        float a31 = (float)a27 * 0.003921569f;
                        a28 = (int)((float)a28 * a31);
                        a29 = (int)((float)a29 * a31);
                        a30 = (int)((float)a30 * a31);
                        a23 += a26 * (float)a27;
                        a20 += a26 * (float)a28;
                        a21 += a26 * (float)a29;
                        a22 += a26 * (float)a30;
                    }
                    ++a25;
                }
                if (a23 != 0.0f && a23 != 255.0f) {
                    float a32 = 255.0f / a23;
                    a20 *= a32;
                    a21 *= a32;
                    a22 *= a32;
                }
                int a33 = Class767.Method1687((int)((double)a23 + 0.5));
                int a34 = Class767.Method1687((int)((double)a20 + 0.5));
                a18 = Class767.Method1687((int)((double)a21 + 0.5));
                a17 = Class767.Method1687((int)((double)a22 + 0.5));
                a3[a14] = a33 << 24 | a34 << 16 | a18 << 8 | a17;
                a14 += a5;
                ++a16;
            }
            ++a13;
        }
    }

    public static Kernel Method1294(float a) {
        int a2;
        int a3 = (int)Math.ceil((double)a);
        int a4 = a3 * 2 + 1;
        float[] a5 = new float[a4];
        float a6 = a / 3.0f;
        float a7 = 2.0f * a6 * a6;
        float a8 = (float)Math.PI * 2 * a6;
        float a9 = (float)Math.sqrt((double)a8);
        float a10 = a * a;
        float a11 = 0.0f;
        int a12 = 0;
        for (a2 = -a3; a2 <= a3; ++a2) {
            float a13 = a2 * a2;
            a5[a12] = a13 > a10 ? 0.0f : (float)Math.exp((double)(-a13 / a7)) / a9;
            a11 += a5[a12];
            ++a12;
        }
        a2 = 0;
        while (a2 < a4) {
            int n = a2++;
            a5[n] = a5[n] / a11;
        }
        return new Kernel(a4, 1, a5);
    }

    @Override
    public String toString() {
        return "Blur/Gaussian Blur...";
    }
}