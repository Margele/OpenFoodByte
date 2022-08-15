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

public class Class195
extends Class193 {
    private float Field1162 = 0.0f;
    private float Field1163 = 0.0f;
    private float Field1164 = 0.0f;
    private int Field1165;

    public void Method56(float a) {
        this.Field1162 = a;
    }

    public float Method57() {
        return this.Field1162;
    }

    public void Method58(float a) {
        this.Field1163 = a;
    }

    public float Method59() {
        return this.Field1163;
    }

    public void Method60(float a) {
        this.Field1164 = a;
    }

    public float Method61() {
        return this.Field1164;
    }

    public void Method9(int a) {
        this.Field1165 = a;
    }

    public int Method10() {
        return this.Field1165;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int n = a.getWidth();
        boolean a3 = Class193.Method1270();
        int a4 = a.getHeight();
        int a5 = a.getType();
        WritableRaster a6 = a.getRaster();
        a2 = this.Method1263(a, null);
        WritableRaster a7 = a2.getRaster();
        float[] a8 = null;
        float[] a9 = null;
        int a10 = this.Field1165;
        int a11 = a10 >> 16 & 0xFF;
        int a12 = a10 >> 8 & 0xFF;
        int a13 = a10 & 0xFF;
        a9 = Color.RGBtoHSB((int)a11, (int)a13, (int)a12, a9);
        int[] a14 = null;
        int a15 = 0;
        if (a15 < a4) {
            void a16;
            a14 = this.Method104(a, 0, a15, (int)a16, 1, a14);
            int a17 = 0;
            if (a17 < a16) {
                int a18 = a14[a17];
                int a19 = a18 >> 16 & 0xFF;
                int a20 = a18 & 0xFF;
                int a21 = a18 >> 8 & 0xFF;
                if (Math.abs((float)((a8 = Color.RGBtoHSB((int)a19, (int)a20, (int)a21, a8))[0] - a9[0])) < this.Field1162 && Math.abs((float)(a8[1] - a9[1])) < this.Field1163 && Math.abs((float)(a8[2] - a9[2])) < this.Field1164) {
                    a14[a17] = a18 & 0xFFFFFF;
                }
                a14[a17] = a18;
                ++a17;
            }
            this.Method1267(a2, 0, a15, (int)a16, 1, a14);
            ++a15;
        }
        return a2;
    }

    public String toString() {
        return "Keying/Chroma Key...";
    }
}