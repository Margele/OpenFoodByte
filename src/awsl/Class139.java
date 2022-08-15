/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.ColorModel
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class143;
import awsl.Class236;
import java.awt.image.ColorModel;

class Class139
extends Class143 {
    public Class139(float a, ColorModel a2, ColorModel a3) {
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
            int a15 = a8 + Class139.Method1435(a7, 255 - a8 - a8);
            int a16 = a10 + Class139.Method1435(a9, 255 - a10 - a10);
            int a17 = a12 + Class139.Method1435(a11, 255 - a12 - a12);
            float a18 = a3 * (float)a13 / 255.0f;
            float a19 = 1.0f - a18;
            a2[a6] = (int)(a18 * (float)a15 + a19 * (float)a8);
            a2[a6 + 1] = (int)(a18 * (float)a16 + a19 * (float)a10);
            a2[a6 + 2] = (int)(a18 * (float)a17 + a19 * (float)a12);
            a2[a6 + 3] = (int)((float)a13 * a3 + (float)a14 * a19);
            a6 += 4;
        }
    }
}