/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.CompositeContext
 *  java.awt.image.ColorModel
 *  java.awt.image.Raster
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class236;
import awsl.Class91;
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class Class240
implements CompositeContext {
    private int Field1340;

    public Class240(int a, ColorModel a2, ColorModel a3) {
        this.Field1340 = a;
    }

    public void Method1434() {
    }

    /*
     * WARNING - void declaration
     */
    public void Method1437(Raster a, Raster a2, WritableRaster a3) {
        int n = a.getMinX();
        String[] a4 = Class236.Method2106();
        int a5 = a.getMinY();
        int a6 = a.getWidth();
        int a7 = a.getHeight();
        int[] a8 = null;
        int[] a9 = null;
        int[] a10 = null;
        int[] a11 = new int[a6 * 4];
        int a12 = 0;
        if (a12 < a7) {
            void a13;
            a8 = a.getPixels((int)a13, a5, a6, 1, a8);
            a10 = a2.getPixels((int)a13, a5, a6, 1, a10);
            int a14 = 0;
            int a15 = 0;
            int a16 = 0;
            if (a16 < a6) {
                int a17 = a8[a15 + 3];
                void a18 = a9[a15 + 3];
                if (((a17 ^ a14) & 0x80) != 0 || ((a17 ^ a18) & 0x80) != 0) {
                    if ((this.Field1340 + a12 + a16) % 10 > 4) {
                        a11[a15] = 0;
                        a11[a15 + 1] = 0;
                        a11[a15 + 2] = 0;
                    }
                    a11[a15] = 255;
                    a11[a15 + 1] = 255;
                    a11[a15 + 2] = 127;
                    a11[a15 + 3] = 255;
                }
                a11[a15] = a10[a15];
                a11[a15 + 1] = a10[a15 + 1];
                a11[a15 + 2] = a10[a15 + 2];
                a11[a15] = 255;
                a11[a15 + 1] = 0;
                a11[a15 + 2] = 0;
                a11[a15 + 3] = 0;
                a14 = a17;
                a15 += 4;
                ++a16;
            }
            a3.setPixels((int)a13, a5, a6, 1, a11);
            int[] a22 = a8;
            a8 = a9;
            a9 = a22;
            ++a5;
            ++a12;
        }
        if (Class91.Method3648() == null) {
            Class236.Method2105(new String[1]);
        }
    }
}