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
import awsl.Class767;
import awsl.Class776;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Class73
extends Class193 {
    private BufferedImage Field690;
    private float Field691;

    public void Method1271(BufferedImage a) {
        this.Field690 = a;
    }

    public BufferedImage Method1272() {
        return this.Field690;
    }

    public void Method56(float a) {
        this.Field691 = a;
    }

    public float Method57() {
        return this.Field691;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int n = a.getWidth();
        boolean a3 = Class193.Method1270();
        int a4 = a.getHeight();
        int a5 = a.getType();
        WritableRaster a6 = a.getRaster();
        a2 = this.Method1263(a, null);
        WritableRaster a7 = a2.getRaster();
        if (this.Field690 != null) {
            int a8;
            a8 = Math.min((int)a8, (int)this.Field690.getWidth());
            a4 = Math.min((int)a4, (int)this.Field690.getWidth());
            int[] a9 = null;
            int[] a10 = null;
            int a11 = 0;
            if (a11 < a4) {
                a9 = this.Method104(a, 0, a11, a8, 1, a9);
                a10 = this.Method104(this.Field690, 0, a11, a8, 1, a10);
                int a12 = 0;
                if (a12 < a8) {
                    int a13 = a9[a12];
                    int a14 = a10[a12];
                    int a15 = a13 >> 24 & 0xFF;
                    int a16 = a13 >> 16 & 0xFF;
                    int a17 = a13 >> 8 & 0xFF;
                    int a18 = a13 & 0xFF;
                    int a19 = a14 >> 24 & 0xFF;
                    int a20 = a14 >> 16 & 0xFF;
                    int a21 = a14 >> 8 & 0xFF;
                    int a22 = a14 & 0xFF;
                    a16 = Class767.Method1687(Class776.Method1718(this.Field691, a16, a20));
                    a17 = Class767.Method1687(Class776.Method1718(this.Field691, a17, a21));
                    a18 = Class767.Method1687(Class776.Method1718(this.Field691, a18, a22));
                    a9[a12] = a15 << 24 | a16 << 16 | a17 << 8 | a18;
                    ++a12;
                }
                this.Method1267(a2, 0, a11, a8, 1, a9);
                ++a11;
            }
        }
        return a2;
    }

    public String toString() {
        return "Effects/Interpolate...";
    }
}