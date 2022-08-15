/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.image.BufferedImage
 *  java.awt.image.WritableRaster
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Class81
extends Class193 {
    private float Field707 = 0.0f;
    private float Field708 = 0.0f;
    private float Field709 = 0.0f;
    private BufferedImage Field710;
    private BufferedImage Field711;

    public void Method56(float a) {
        this.Field707 = a;
    }

    public float Method57() {
        return this.Field707;
    }

    public void Method58(float a) {
        this.Field708 = a;
    }

    public float Method59() {
        return this.Field708;
    }

    public void Method60(float a) {
        this.Field709 = a;
    }

    public float Method61() {
        return this.Field709;
    }

    public void Method1271(BufferedImage a) {
        this.Field710 = a;
    }

    public BufferedImage Method1272() {
        return this.Field710;
    }

    public void Method1273(BufferedImage a) {
        this.Field711 = a;
    }

    public BufferedImage Method1274() {
        return this.Field711;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int n = a.getWidth();
        int a3 = a.getHeight();
        int a4 = a.getType();
        WritableRaster writableRaster = a.getRaster();
        boolean a5 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        WritableRaster a6 = a2.getRaster();
        if (this.Field710 != null && this.Field711 != null) {
            float[] a7 = null;
            float[] a8 = null;
            int[] a9 = null;
            int[] a10 = null;
            int[] a11 = null;
            int a12 = 0;
            if (a12 < a3) {
                void a13;
                a9 = this.Method104(a, 0, a12, (int)a13, 1, a9);
                a10 = this.Method104(this.Field710, 0, a12, (int)a13, 1, a10);
                a11 = this.Method104(this.Field711, 0, a12, (int)a13, 1, a11);
                int a14 = 0;
                if (a14 < a13) {
                    int a15 = a9[a14];
                    int a16 = a10[a14];
                    int a17 = a11[a14];
                    int a18 = a15 >> 16 & 0xFF;
                    int a19 = a15 >> 8 & 0xFF;
                    int a20 = a15 & 0xFF;
                    int a21 = a17 >> 16 & 0xFF;
                    int a22 = a17 >> 8 & 0xFF;
                    int a23 = a17 & 0xFF;
                    if (Math.abs((float)((a7 = Color.RGBtoHSB((int)a18, (int)a20, (int)a19, a7))[0] - (a8 = Color.RGBtoHSB((int)a21, (int)a23, (int)a22, a8))[0])) < this.Field707 && Math.abs((float)(a7[1] - a8[1])) < this.Field708 && Math.abs((float)(a7[2] - a8[2])) < this.Field709) {
                        a9[a14] = a16;
                    }
                    a9[a14] = a15;
                    ++a14;
                }
                this.Method1267(a2, 0, a12, (int)a13, 1, a9);
                ++a12;
            }
        }
        return a2;
    }

    public String toString() {
        return "Keying/Key...";
    }
}