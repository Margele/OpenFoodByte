/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.Raster
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Class192
extends Class193 {
    private BufferedImage Field1157;
    private BufferedImage Field1158;

    public Class192() {
    }

    public Class192(BufferedImage a, BufferedImage a2) {
        this.Field1158 = a;
        this.Field1157 = a2;
    }

    public void Method1271(BufferedImage a) {
        this.Field1157 = a;
    }

    public BufferedImage Method1272() {
        return this.Field1157;
    }

    public void Method1273(BufferedImage a) {
        this.Field1158 = a;
    }

    public BufferedImage Method1274() {
        return this.Field1158;
    }

    /*
     * WARNING - void declaration
     */
    public static void Method1275(Raster a, WritableRaster a2, Raster a3) {
        void a4;
        int a5 = a.getMinX();
        int a6 = a.getMinY();
        int a7 = a.getWidth();
        int a8 = a.getHeight();
        Object var8_7 = null;
        int[] a9 = null;
        int[] a10 = null;
        boolean bl = false;
        boolean a11 = Class193.Method1270();
        if (a4 < a8) {
            int[] a12;
            a12 = a.getPixels(a5, a6, a7, 1, a12);
            a9 = a3.getPixels(a5, a6, a7, 1, a9);
            a10 = a2.getPixels(a5, a6, a7, 1, a10);
            int a13 = a5;
            int a14 = 0;
            if (a14 < a7) {
                int a15 = a12[a13];
                int a16 = a10[a13];
                int a17 = a12[a13 + 1];
                int a18 = a10[a13 + 1];
                int a19 = a12[a13 + 2];
                int a20 = a10[a13 + 2];
                int a21 = a12[a13 + 3];
                int a22 = a10[a13 + 3];
                float a23 = (float)a9[a13 + 3] / 255.0f;
                float a24 = 1.0f - a23;
                a10[a13] = (int)(a23 * (float)a15 + a24 * (float)a16);
                a10[a13 + 1] = (int)(a23 * (float)a17 + a24 * (float)a18);
                a10[a13 + 2] = (int)(a23 * (float)a19 + a24 * (float)a20);
                a10[a13 + 3] = (int)(a23 * (float)a21 + a24 * (float)a22);
                a13 += 4;
                ++a14;
            }
            a2.setPixels(a5, a6, a7, 1, a10);
            ++a6;
            ++a4;
        }
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        int a5 = a.getType();
        WritableRaster a6 = a.getRaster();
        a2 = this.Method1263(a, null);
        WritableRaster a7 = a2.getRaster();
        if (this.Field1157 != null && this.Field1158 != null) {
            Class192.Method1275((Raster)a.getRaster(), a2.getRaster(), (Raster)this.Field1158.getRaster());
        }
        return a2;
    }

    public String toString() {
        return "Keying/Key...";
    }
}