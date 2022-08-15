/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class861
extends Class798 {
    public static final float Field3758 = (float)Math.sqrt((double)2.0);
    public static final float[] Field3759 = new float[]{0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] Field3760 = new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] Field3761 = new float[]{-1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f};
    public static final float[] Field3762 = new float[]{-1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] Field3763 = new float[]{-1.0f, 0.0f, 1.0f, -2.0f, 0.0f, 2.0f, -1.0f, 0.0f, 1.0f};
    public static float[] Field3764 = new float[]{-1.0f, -2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f};
    public static final float[] Field3765 = new float[]{-1.0f, 0.0f, 1.0f, -Field3758, 0.0f, Field3758, -1.0f, 0.0f, 1.0f};
    public static float[] Field3766 = new float[]{-1.0f, -Field3758, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, Field3758, 1.0f};
    protected float[] Field3767 = Field3763;
    protected float[] Field3768 = Field3764;

    public void Method160(float[] a) {
        this.Field3767 = a;
    }

    public float[] Method3535() {
        return this.Field3767;
    }

    public void Method161(float[] a) {
        this.Field3768 = a;
    }

    public float[] Method3536() {
        return this.Field3768;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        boolean bl = false;
        boolean a5 = Class193.Method1269();
        int[] a6 = new int[a * a2];
        int a7 = 0;
        if (a7 < a2) {
            int a8 = 0;
            if (a8 < a) {
                int a9 = 0;
                int a10 = 0;
                int a11 = 0;
                int a12 = 0;
                int a13 = 0;
                int a14 = 0;
                int a15 = 0;
                int a16 = 0;
                int a17 = 0;
                int a18 = a3[a7 * a + a8] & 0xFF000000;
                int a19 = -1;
                if (a19 <= 1) {
                    int a20;
                    int a21 = a7 + a19;
                    if (0 <= a21 && a21 < a2) {
                        a20 = a21 * a;
                    }
                    a20 = a7 * a;
                    int a22 = 3 * (a19 + 1) + 1;
                    int a23 = -1;
                    if (a23 <= 1) {
                        int a24 = a8 + a23;
                        if (0 > a24 || a24 >= a) {
                            a24 = a8;
                        }
                        int a25 = a3[a20 + a24];
                        float a26 = this.Field3768[a22 + a23];
                        float a27 = this.Field3767[a22 + a23];
                        a9 = (a25 & 0xFF0000) >> 16;
                        a10 = (a25 & 0xFF00) >> 8;
                        a11 = a25 & 0xFF;
                        a12 += (int)(a26 * (float)a9);
                        a13 += (int)(a26 * (float)a10);
                        a14 += (int)(a26 * (float)a11);
                        a15 += (int)(a27 * (float)a9);
                        a16 += (int)(a27 * (float)a10);
                        a17 += (int)(a27 * (float)a11);
                        ++a23;
                    }
                    ++a19;
                }
                a9 = (int)(Math.sqrt((double)(a12 * a12 + a15 * a15)) / 1.8);
                a10 = (int)(Math.sqrt((double)(a13 * a13 + a16 * a16)) / 1.8);
                a11 = (int)(Math.sqrt((double)(a14 * a14 + a17 * a17)) / 1.8);
                a9 = Class767.Method1687(a9);
                a10 = Class767.Method1687(a10);
                a11 = Class767.Method1687(a11);
                a6[a++] = a18 | a9 << 16 | a10 << 8 | a11;
                ++a8;
            }
            ++a7;
        }
        return a6;
    }

    public String toString() {
        return "Edges/Detect Edges";
    }
}