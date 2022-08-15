/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
package awsl;

import awsl.Class594;
import awsl.Class598;
import awsl.Class617;
import java.util.Random;

public class Class616
implements Class594 {
    public float Field2861 = 2.0f;
    public boolean Field2862 = false;
    public boolean Field2863 = false;
    private float[] Field2864 = new float[]{1.0f, 0.0f, 0.0f, 0.0f};
    private Random Field2865 = new Random();
    private Class617[] Field2866 = new Class617[2];

    public Class616() {
        for (int a = 0; a < this.Field2866.length; ++a) {
            this.Field2866[a] = new Class617(this);
        }
    }

    public void Method866(int a, float a2) {
        this.Field2864[a] = a2;
    }

    public float Method867(int a) {
        return this.Field2864[a];
    }

    private float Method3530(float a, float a2, int a3, int a4, Class617[] a5) {
        this.Field2865.setSeed((long)(571 * a3 + 23 * a4));
        int n = 3 + this.Field2865.nextInt() % 4;
        int a6 = 4;
        int[] a7 = Class598.Method86();
        int a8 = 0;
        if (a8 < a6) {
            float a9;
            float a10 = this.Field2865.nextFloat();
            float a11 = this.Field2865.nextFloat();
            float a12 = Math.abs((float)(a - a10));
            float a13 = Math.abs((float)(a2 - a11));
            if (this.Field2861 == 1.0f) {
                a9 = a12 + a13;
            }
            if (this.Field2861 == 2.0f) {
                a9 = (float)Math.sqrt((double)(a12 * a12 + a13 * a13));
            }
            a9 = (float)Math.pow((double)(Math.pow((double)a12, (double)this.Field2861) + Math.pow((double)a13, (double)this.Field2861)), (double)(1.0f / this.Field2861));
            int a14 = 0;
            if (a14 < a5.length) {
                Class617 a15;
                if ((double)a5[a14].Field2870 == Double.POSITIVE_INFINITY) {
                    a15 = a5[a14];
                    a15.Field2870 = a9;
                    a15.Field2868 = a10;
                    a15.Field2869 = a11;
                    a5[a14] = a15;
                }
                if (a9 < a5[a14].Field2870) {
                    a15 = a5[a5.length - 1];
                    int a16 = a5.length - 1;
                    if (a16 > a14) {
                        a5[a16] = a5[a16 - 1];
                        --a16;
                    }
                    a15.Field2870 = a9;
                    a15.Field2868 = a10;
                    a15.Field2869 = a11;
                    a5[a14] = a15;
                }
                ++a14;
            }
            ++a8;
        }
        return a5[1].Field2870;
    }

    @Override
    public float Method20(float a, float a2) {
        int a3;
        float a4;
        float a5;
        float a6;
        int a7;
        boolean bl = false;
        int[] a8 = Class598.Method86();
        if (a7 < this.Field2866.length) {
            this.Field2866[a7].Field2870 = Float.POSITIVE_INFINITY;
            ++a7;
        }
        if ((a6 = this.Method3530(a5 = a - (float)(a7 = (int)a), a4 = a2 - (float)(a3 = (int)a2), a7, a3, this.Field2866)) > a4) {
            a6 = this.Method3530(a5, a4 + 1.0f, a7, a3 - 1, this.Field2866);
        }
        if (a6 > 1.0f - a4) {
            a6 = this.Method3530(a5, a4 - 1.0f, a7, a3 + 1, this.Field2866);
        }
        if (a6 > a5) {
            this.Method3530(a5 + 1.0f, a4, a7 - 1, a3, this.Field2866);
            if (a6 > a4) {
                a6 = this.Method3530(a5 + 1.0f, a4 + 1.0f, a7 - 1, a3 - 1, this.Field2866);
            }
            if (a6 > 1.0f - a4) {
                a6 = this.Method3530(a5 + 1.0f, a4 - 1.0f, a7 - 1, a3 + 1, this.Field2866);
            }
        }
        if (a6 > 1.0f - a5) {
            a6 = this.Method3530(a5 - 1.0f, a4, a7 + 1, a3, this.Field2866);
            if (a6 > a4) {
                a6 = this.Method3530(a5 - 1.0f, a4 + 1.0f, a7 + 1, a3 - 1, this.Field2866);
            }
            if (a6 > 1.0f - a4) {
                a6 = this.Method3530(a5 - 1.0f, a4 - 1.0f, a7 + 1, a3 + 1, this.Field2866);
            }
        }
        float a9 = 0.0f;
        int a10 = 0;
        if (a10 < 2) {
            a9 += this.Field2864[a10] * this.Field2866[a10].Field2870;
            ++a10;
        }
        if (this.Field2863) {
            a9 = (float)((double)a9 + (Math.atan2((double)(a4 - this.Field2866[0].Field2869), (double)(a5 - this.Field2866[0].Field2868)) / (Math.PI * 2) + 0.5));
        }
        return a9;
    }
}