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

class Class200
extends Class143 {
    public Class200(float a, ColorModel a2, ColorModel a3) {
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
            int a10;
            int a11 = a[a4];
            int a12 = a2[a4];
            int a13 = a[a4 + true];
            int a14 = a2[a4 + true];
            int a15 = a[a4 + 2];
            int a16 = a2[a4 + 2];
            int a17 = a[a4 + 3];
            int a18 = a2[a4 + 3];
            if (a12 < 128) {
                a10 = a12 * a11 + 128;
                a9 = 2 * ((a10 >> 8) + a10 >> 8);
            }
            a10 = (255 - a12) * (255 - a11) + 128;
            a9 = 2 * (255 - ((a10 >> 8) + a10 >> 8));
            if (a14 < 128) {
                a10 = a14 * a13 + 128;
                a8 = 2 * ((a10 >> 8) + a10 >> 8);
            }
            a10 = (255 - a14) * (255 - a13) + 128;
            a8 = 2 * (255 - ((a10 >> 8) + a10 >> 8));
            if (a16 < 128) {
                a10 = a16 * a15 + 128;
                a7 = 2 * ((a10 >> 8) + a10 >> 8);
            }
            a10 = (255 - a16) * (255 - a15) + 128;
            a7 = 2 * (255 - ((a10 >> 8) + a10 >> 8));
            float a19 = a3 * (float)a17 / 255.0f;
            float a20 = 1.0f - a19;
            a2[a4] = (int)(a19 * (float)a9 + a20 * (float)a12);
            a2[a4 + true] = (int)(a19 * (float)a8 + a20 * (float)a14);
            a2[a4 + 2] = (int)(a19 * (float)a7 + a20 * (float)a16);
            a2[a4 + 3] = (int)((float)a17 * a3 + (float)a18 * a20);
            a4 += 4;
        }
    }
}