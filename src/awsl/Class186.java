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
import awsl.Class776;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Class186
extends Class193 {
    private float Field1146 = 2.0f;
    private float Field1147 = (float)Math.toRadians((double)108.0);
    private float Field1148 = (float)Math.toRadians((double)162.0);
    private float Field1149 = (float)Math.toRadians((double)90.0);

    public void Method56(float a) {
        this.Field1146 = a;
    }

    public float Method57() {
        return this.Field1146;
    }

    public float Method59() {
        return this.Field1147;
    }

    public void Method58(float a) {
        this.Field1147 = a;
    }

    public float Method61() {
        return this.Field1148;
    }

    public void Method60(float a) {
        this.Field1148 = a;
    }

    public float Method165() {
        return this.Field1149;
    }

    public void Method164(float a) {
        this.Field1149 = a;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        void a4;
        int n = a.getWidth();
        int n2 = a.getHeight();
        boolean a5 = Class193.Method1269();
        int a6 = a.getType();
        WritableRaster a7 = a.getRaster();
        a2 = this.Method1263(a, null);
        float a8 = 2.0f * this.Field1146 * 1.414f;
        float[] a9 = new float[]{this.Field1147, this.Field1148, this.Field1149};
        float[] a10 = new float[]{0.0f, -1.0f, 1.0f, 0.0f, 0.0f};
        float[] a11 = new float[]{0.0f, 0.0f, 0.0f, -1.0f, 1.0f};
        float a12 = a8 / 2.0f;
        int[] a13 = new int[a4];
        int[] a14 = this.Method104(a, 0, 0, (int)a4, (int)a3, null);
        int a15 = 0;
        if (a15 < a3) {
            int a16 = 0;
            int a17 = a15 * a4;
            if (a16 < a4) {
                a13[a16] = a14[a17] & 0xFF000000 | 0xFFFFFF;
                ++a16;
                ++a17;
            }
            if ((a16 = 0) < 3) {
                a17 = 16 - 8 * a16;
                int a18 = 255 << a17;
                float a19 = a9[a16];
                float a20 = (float)Math.sin((double)a19);
                float a21 = (float)Math.cos((double)a19);
                int a22 = 0;
                if (a22 < a4) {
                    float a23 = (float)a22 * a21 + (float)a15 * a20;
                    float a24 = (float)(-a22) * a20 + (float)a15 * a21;
                    a23 = a23 - Class776.Method1714(a23 - a12, a8) + a12;
                    a24 = a24 - Class776.Method1714(a24 - a12, a8) + a12;
                    float a25 = 1.0f;
                    int a26 = 0;
                    if (a26 < 5) {
                        float a27 = a23 + a10[a26] * a8;
                        float a28 = a24 + a11[a26] * a8;
                        float a29 = a27 * a21 - a28 * a20;
                        float a30 = a27 * a20 + a28 * a21;
                        int a31 = Class776.Method1712((int)a29, 0, (int)(a4 - true));
                        int a32 = Class776.Method1712((int)a30, 0, (int)(a3 - true));
                        int a33 = a14[a32 * a4 + a31];
                        int a34 = a33 >> a17 & 0xFF;
                        float a35 = (float)a34 / 255.0f;
                        a35 = 1.0f - a35 * a35;
                        a35 = (float)((double)a35 * ((double)a12 * 1.414));
                        float a36 = (float)a22 - a29;
                        float a37 = (float)a15 - a30;
                        float a38 = a36 * a36;
                        float a39 = a37 * a37;
                        float a40 = (float)Math.sqrt((double)(a38 + a39));
                        float a41 = 1.0f - Class776.Method1708(a40, a40 + 1.0f, a35);
                        a25 = Math.min((float)a25, (float)a41);
                        ++a26;
                    }
                    a26 = (int)(255.0f * a25);
                    a26 <<= a17;
                    a26 ^= ~a18;
                    int n3 = a22++;
                    a13[n3] = a13[n3] & (a26 |= 0xFF000000);
                }
                ++a16;
            }
            this.Method1267(a2, 0, a15, (int)a4, 1, a13);
            ++a15;
        }
        return a2;
    }

    public String toString() {
        return "Pixellate/Color Halftone...";
    }
}