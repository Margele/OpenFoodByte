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

class Class153
extends Class143 {
    public Class153(float a, ColorModel a2, ColorModel a3) {
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
            int a7;
            int a8;
            int a9;
            int a10 = a[a6];
            int a11 = a2[a6];
            int a12 = a[a6 + 1];
            int a13 = a2[a6 + 1];
            int a14 = a[a6 + 2];
            int a15 = a2[a6 + 2];
            int a16 = a[a6 + 3];
            int a17 = a2[a6 + 3];
            if (a11 != 255) {
                a9 = Class153.Method1436(255 - (255 - a10 << 8) / (a11 + 1));
            }
            a9 = a10;
            if (a13 != 255) {
                a8 = Class153.Method1436(255 - (255 - a12 << 8) / (a13 + 1));
            }
            a8 = a12;
            if (a15 != 255) {
                a7 = Class153.Method1436(255 - (255 - a14 << 8) / (a15 + 1));
            }
            a7 = a14;
            float a18 = a3 * (float)a16 / 255.0f;
            float a19 = 1.0f - a18;
            a2[a6] = (int)(a18 * (float)a9 + a19 * (float)a11);
            a2[a6 + 1] = (int)(a18 * (float)a8 + a19 * (float)a13);
            a2[a6 + 2] = (int)(a18 * (float)a7 + a19 * (float)a15);
            a2[a6 + 3] = (int)((float)a16 * a3 + (float)a17 * a19);
            a6 += 4;
        }
    }
}