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

class Class137
extends Class143 {
    public Class137(float a, ColorModel a2, ColorModel a3) {
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
            int a9;
            int a10 = a[a4];
            int a11 = a2[a4];
            int a12 = a[a4 + true];
            int a13 = a2[a4 + true];
            int a14 = a[a4 + 2];
            int a15 = a2[a4 + 2];
            int a16 = a[a4 + 3];
            int a17 = a2[a4 + 3];
            if (a10 > 127) {
                a9 = 255 - 2 * Class137.Method1435(255 - a10, 255 - a11);
            }
            a9 = 2 * Class137.Method1435(a10, a11);
            if (a12 > 127) {
                a8 = 255 - 2 * Class137.Method1435(255 - a12, 255 - a13);
            }
            a8 = 2 * Class137.Method1435(a12, a13);
            if (a14 > 127) {
                a7 = 255 - 2 * Class137.Method1435(255 - a14, 255 - a15);
            }
            a7 = 2 * Class137.Method1435(a14, a15);
            float a18 = a3 * (float)a16 / 255.0f;
            float a19 = 1.0f - a18;
            a2[a4] = (int)(a18 * (float)a9 + a19 * (float)a11);
            a2[a4 + true] = (int)(a18 * (float)a8 + a19 * (float)a13);
            a2[a4 + 2] = (int)(a18 * (float)a7 + a19 * (float)a15);
            a2[a4 + 3] = (int)((float)a16 * a3 + (float)a17 * a19);
            a4 += 4;
        }
    }
}