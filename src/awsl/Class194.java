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

class Class194
extends Class143 {
    private float[] Field1160 = new float[3];
    private float[] Field1161 = new float[3];

    public Class194(float a, ColorModel a2, ColorModel a3) {
        super(a, a2, a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method380(int[] a, int[] a2, float a3) {
        void a4;
        int n = a.length;
        String[] a5 = Class236.Method2106();
        int a6 = 0;
        if (a6 < a4) {
            int a7 = a[a6];
            int a8 = a2[a6];
            int a9 = a[a6 + 1];
            int a10 = a2[a6 + 1];
            int a11 = a[a6 + 2];
            int a12 = a2[a6 + 2];
            int a13 = a[a6 + 3];
            int a14 = a2[a6 + 3];
            Color.RGBtoHSB((int)a7, (int)a9, (int)a11, (float[])this.Field1160);
            Color.RGBtoHSB((int)a8, (int)a10, (int)a12, (float[])this.Field1161);
            this.Field1161[2] = this.Field1160[2];
            int a15 = Color.HSBtoRGB((float)this.Field1161[0], (float)this.Field1161[1], (float)this.Field1161[2]);
            int a16 = (a15 & 0xFF0000) >> 16;
            int a17 = (a15 & 0xFF00) >> 8;
            int a18 = a15 & 0xFF;
            float a19 = a3 * (float)a13 / 255.0f;
            float a20 = 1.0f - a19;
            a2[a6] = (int)(a19 * (float)a16 + a20 * (float)a8);
            a2[a6 + 1] = (int)(a19 * (float)a17 + a20 * (float)a10);
            a2[a6 + 2] = (int)(a19 * (float)a18 + a20 * (float)a12);
            a2[a6 + 3] = (int)((float)a13 * a3 + (float)a14 * a20);
            a6 += 4;
        }
    }
}