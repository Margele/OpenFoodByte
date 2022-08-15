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

class Class141
extends Class143 {
    public Class141(float a, ColorModel a2, ColorModel a3) {
        super(a, a2, a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method380(int[] a, int[] a2, float a3) {
        void a4;
        int a5 = a.length;
        boolean bl = false;
        String[] a6 = Class236.Method2106();
        if (a4 < a5) {
            int a7;
            int a8;
            int a9 = a[a4];
            int a10 = a2[a4];
            int a11 = a[a4 + true];
            int a12 = a2[a4 + true];
            int a13 = a[a4 + 2];
            int a14 = a2[a4 + 2];
            int a15 = a[a4 + 3];
            int a16 = a2[a4 + 3];
            int a17 = a10 + a9;
            if (a17 > 255) {
                a17 = 255;
            }
            if ((a8 = a12 + a11) > 255) {
                a8 = 255;
            }
            if ((a7 = a14 + a13) > 255) {
                a7 = 255;
            }
            float a18 = a3 * (float)a15 / 255.0f;
            float a19 = 1.0f - a18;
            a2[a4] = (int)(a18 * (float)a17 + a19 * (float)a10);
            a2[a4 + true] = (int)(a18 * (float)a8 + a19 * (float)a12);
            a2[a4 + 2] = (int)(a18 * (float)a7 + a19 * (float)a14);
            a2[a4 + 3] = (int)((float)a15 * a3 + (float)a16 * a19);
            a4 += 4;
        }
    }
}