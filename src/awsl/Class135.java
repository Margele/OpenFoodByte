/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.image.ColorModel
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class143;
import awsl.Class236;
import java.awt.Color;
import java.awt.image.ColorModel;

class Class135
extends Class143 {
    private float[] Field985 = new float[3];
    private float[] Field986 = new float[3];

    public Class135(float a, ColorModel a2, ColorModel a3) {
        super(a, a2, a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method380(int[] a, int[] a2, float a3) {
        void a4;
        void a5;
        int n = a.length;
        boolean bl = false;
        String[] a6 = Class236.Method2106();
        if (a5 < a4) {
            int a7 = a[a5];
            int a8 = a2[a5];
            int a9 = a[a5 + true];
            int a10 = a2[a5 + true];
            int a11 = a[a5 + 2];
            int a12 = a2[a5 + 2];
            int a13 = a[a5 + 3];
            int a14 = a2[a5 + 3];
            Color.RGBtoHSB((int)a7, (int)a9, (int)a11, (float[])this.Field985);
            Color.RGBtoHSB((int)a8, (int)a10, (int)a12, (float[])this.Field986);
            this.Field986[0] = this.Field985[0];
            int a15 = Color.HSBtoRGB((float)this.Field986[0], (float)this.Field986[1], (float)this.Field986[2]);
            int a16 = (a15 & 0xFF0000) >> 16;
            int a17 = (a15 & 0xFF00) >> 8;
            int a18 = a15 & 0xFF;
            float a19 = a3 * (float)a13 / 255.0f;
            float a20 = 1.0f - a19;
            a2[a5] = (int)(a19 * (float)a16 + a20 * (float)a8);
            a2[a5 + true] = (int)(a19 * (float)a17 + a20 * (float)a10);
            a2[a5 + 2] = (int)(a19 * (float)a18 + a20 * (float)a12);
            a2[a5 + 3] = (int)((float)a13 * a3 + (float)a14 * a20);
            a5 += 4;
        }
    }
}