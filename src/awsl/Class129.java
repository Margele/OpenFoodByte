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

class Class129
extends Class143 {
    public Class129(float a, ColorModel a2, ColorModel a3) {
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
            int a15 = a8 < a7 ? a8 : a7;
            int a16 = a10 < a9 ? a10 : a9;
            int a17 = a12 < a11 ? a12 : a11;
            float a18 = a3 * (float)a13 / 255.0f;
            float a19 = 1.0f - a18;
            a2[a5] = (int)(a18 * (float)a15 + a19 * (float)a8);
            a2[a5 + true] = (int)(a18 * (float)a16 + a19 * (float)a10);
            a2[a5 + 2] = (int)(a18 * (float)a17 + a19 * (float)a12);
            a2[a5 + 3] = (int)((float)a13 * a3 + (float)a14 * a19);
            a5 += 4;
        }
    }
}