/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class598;

public class Class592 {
    protected float[] Field2783;
    protected float[] Field2784;
    protected float[] Field2785;

    public Class592(int a) {
        this.Field2783 = new float[a];
        this.Field2784 = new float[a];
        this.Field2785 = new float[a];
        int a2 = 1;
        for (int a3 = 0; a3 < a; ++a3) {
            double a4 = Math.PI * -2 / (double)(a2 <<= 1);
            this.Field2783[a3] = (float)Math.sin((double)(0.5 * a4));
            this.Field2784[a3] = -2.0f * this.Field2783[a3] * this.Field2783[a3];
            this.Field2785[a3] = (float)Math.sin((double)a4);
        }
    }

    private void Method51(int a, float[] a2, float[] a3) {
        int a4 = 0;
        for (int a5 = 0; a5 < a; ++a5) {
            int a6;
            if (a5 > a4) {
                float a7 = a2[a4];
                a2[a4] = a2[a5];
                a2[a5] = a7;
                a7 = a3[a4];
                a3[a4] = a3[a5];
                a3[a5] = a7;
            }
            for (a6 = a >> 1; a4 >= a6 && a6 >= 2; a4 -= a6, a6 >>= 1) {
            }
            a4 += a6;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void Method52(int a, int a2, int a3, float[] a4, float[] a5) {
        boolean bl = true;
        int[] a6 = Class598.Method86();
        int a7 = 0;
        if (a7 < a2) {
            void a8;
            void a9 = a8;
            a8 <<= 1;
            float a10 = (float)a3 * this.Field2783[a7];
            float a11 = this.Field2784[a7];
            float a12 = (float)a3 * this.Field2785[a7];
            float a13 = 1.0f;
            float a14 = 0.0f;
            int a15 = 0;
            if (a15 < a9) {
                int a16 = a15;
                if (a16 < a) {
                    int a17 = a16 + a9;
                    float a18 = a4[a17];
                    float a19 = a5[a17];
                    float a20 = a13 * a18 - a14 * a19;
                    float a21 = a14 * a18 + a13 * a19;
                    a4[a17] = a4[a16] - a20;
                    int n = a16;
                    a4[n] = a4[n] + a20;
                    a5[a17] = a5[a16] - a21;
                    int n2 = a16;
                    a5[n2] = a5[n2] + a21;
                    a16 += a8;
                }
                a10 = a13;
                a13 = a10 * a11 - a14 * a12 + a13;
                a14 = a14 * a11 + a10 * a12 + a14;
                ++a15;
            }
            ++a7;
        }
        if (a3 == -1) {
            float a22 = 1.0f / (float)a;
            int a23 = 0;
            if (a23 < a) {
                int n = a23;
                a4[n] = a4[n] * a22;
                int n3 = a23++;
                a5[n3] = a5[n3] * a22;
            }
        }
    }

    public void Method53(float[] a, float[] a2, int a3, int a4, boolean a5) {
        this.Method51(a4, a, a2);
        this.Method52(a4, a3, 1, a, a2);
    }

    public void Method54(float[] a, float[] a2, int a3, int a4, boolean a5) {
        int a6;
        int a7;
        int a8 = this.Method55(a3);
        int a9 = this.Method55(a4);
        int a10 = Math.max((int)a4, (int)a3);
        float[] a11 = new float[a10];
        float[] a12 = new float[a10];
        for (a7 = 0; a7 < a4; ++a7) {
            a6 = a7 * a3;
            System.arraycopy((Object)a, (int)a6, (Object)a11, (int)0, (int)a3);
            System.arraycopy((Object)a2, (int)a6, (Object)a12, (int)0, (int)a3);
            this.Method53(a11, a12, a8, a3, a5);
            System.arraycopy((Object)a11, (int)0, (Object)a, (int)a6, (int)a3);
            System.arraycopy((Object)a12, (int)0, (Object)a2, (int)a6, (int)a3);
        }
        for (a7 = 0; a7 < a3; ++a7) {
            int a13;
            a6 = a7;
            for (a13 = 0; a13 < a4; ++a13) {
                a11[a13] = a[a6];
                a12[a13] = a2[a6];
                a6 += a3;
            }
            this.Method53(a11, a12, a9, a4, a5);
            a6 = a7;
            for (a13 = 0; a13 < a4; ++a13) {
                a[a6] = a11[a13];
                a2[a6] = a12[a13];
                a6 += a3;
            }
        }
    }

    private int Method55(int a) {
        int a2 = 1;
        int a3 = 0;
        while (a2 < a) {
            a2 *= 2;
            ++a3;
        }
        return a2 == a ? a3 : -1;
    }
}