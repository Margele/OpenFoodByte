/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.WritableRaster
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Class198
extends Class193 {
    private int Field1175 = 2;

    public Class198() {
    }

    public Class198(int a) {
        this.Field1175 = a;
    }

    public void Method9(int a) {
        this.Field1175 = a;
    }

    public int Method10() {
        return this.Field1175;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int a4 = a.getWidth();
        int n = a.getHeight();
        boolean a5 = Class193.Method1270();
        int a6 = a.getType();
        WritableRaster a7 = a.getRaster();
        a2 = this.Method1263(a, null);
        int[] a8 = new int[this.Field1175 * this.Field1175];
        int a9 = 0;
        if (a9 < a3) {
            int a10 = 0;
            if (a10 < a4) {
                int a11;
                int a12;
                int a13 = Math.min((int)this.Field1175, (int)(a4 - a10));
                int a14 = Math.min((int)this.Field1175, (int)(a3 - a9));
                int a15 = a13 * a14;
                this.Method104(a, a10, a9, a13, a14, a8);
                int a16 = 0;
                int a17 = 0;
                int a18 = 0;
                int a19 = 0;
                int a20 = 0;
                if (a20 < a14) {
                    a12 = 0;
                    if (a12 < a13) {
                        a11 = a8[a19];
                        a16 += a11 >> 16 & 0xFF;
                        a17 += a11 >> 8 & 0xFF;
                        a18 += a11 & 0xFF;
                        ++a19;
                        ++a12;
                    }
                    ++a20;
                }
                a11 = a16 / a15 << 16 | a17 / a15 << 8 | a18 / a15;
                a19 = 0;
                a20 = 0;
                if (a20 < a14) {
                    a12 = 0;
                    if (a12 < a13) {
                        a8[a19] = a8[a19] & 0xFF000000 | a11;
                        ++a19;
                        ++a12;
                    }
                    ++a20;
                }
                this.Method1267(a2, a10, a9, a13, a14, a8);
                a10 += this.Field1175;
            }
            a9 += this.Field1175;
        }
        return a2;
    }

    public String toString() {
        return "Pixellate/Mosaic...";
    }
}