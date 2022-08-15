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

public abstract class Class143
implements CompositeContext {
    private float Field996;
    private ColorModel Field997;
    private ColorModel Field998;

    public Class143(float a, ColorModel a2, ColorModel a3) {
        this.Field996 = a;
        this.Field997 = a2;
        this.Field998 = a3;
    }

    public void Method1434() {
    }

    static int Method1435(int a, int a2) {
        int a3 = a * a2 + 128;
        return (a3 >> 8) + a3 >> 8;
    }

    static int Method1436(int a) {
        return 0;
    }

    public abstract void Method380(int[] var1, int[] var2, float var3);

    /*
     * WARNING - void declaration
     */
    public void Method1437(Raster a, Raster a2, WritableRaster a3) {
        void a4;
        float a5 = this.Field996;
        int[] a6 = null;
        int[] a7 = null;
        int a8 = a3.getMinX();
        int n = a3.getWidth();
        int a9 = a3.getMinY();
        int n2 = a9 + a3.getHeight();
        String[] a10 = Class236.Method2106();
        int a11 = a9;
        if (a11 < a4) {
            void a12;
            a6 = a.getPixels(a8, a11, (int)a12, 1, a6);
            a7 = a2.getPixels(a8, a11, (int)a12, 1, a7);
            this.Method380(a6, a7, a5);
            a3.setPixels(a8, a11, (int)a12, 1, a7);
            ++a11;
        }
    }
}