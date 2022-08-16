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
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import obfuscate.a;

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
    public void Method1437(Raster a2, Raster a3, WritableRaster a4) {
        int n = a2.getMinX();
        String[] a5 = Class236.Method2106();
        int a6 = a2.getMinY();
        int a7 = a2.getWidth();
        int a8 = a2.getHeight();
        int[] a9 = null;
        int[] a10 = null;
        int[] a11 = null;
        int[] a12 = new int[a7 * 4];
        int a13 = 0;
        if (a13 < a8) {
            void a14;
            a9 = a2.getPixels((int)a14, a6, a7, 1, a9);
            a11 = a3.getPixels((int)a14, a6, a7, 1, a11);
            int a15 = 0;
            int a16 = 0;
            int a17 = 0;
            if (a17 < a7) {
                int a18 = a9[a16 + 3];
                void a19 = a10[a16 + 3];
                if (((a18 ^ a15) & 0x80) != 0 || ((a18 ^ a19) & 0x80) != 0) {
                    if ((this.Field1340 + a13 + a17) % 10 > 4) {
                        a12[a16] = 0;
                        a12[a16 + 1] = 0;
                        a12[a16 + 2] = 0;
                    }
                    a12[a16] = 255;
                    a12[a16 + 1] = 255;
                    a12[a16 + 2] = 127;
                    a12[a16 + 3] = 255;
                }
                a12[a16] = a11[a16];
                a12[a16 + 1] = a11[a16 + 1];
                a12[a16 + 2] = a11[a16 + 2];
                a12[a16] = 255;
                a12[a16 + 1] = 0;
                a12[a16 + 2] = 0;
                a12[a16 + 3] = 0;
                a15 = a18;
                a16 += 4;
                ++a17;
            }
            a4.setPixels((int)a14, a6, a7, 1, a12);
            int[] a22 = a9;
            a9 = a10;
            a10 = a22;
            ++a6;
            ++a13;
        }
        if (a.trash() == null) {
            Class236.Method2105(new String[1]);
        }
    }
}