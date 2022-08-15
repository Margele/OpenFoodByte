/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.RenderingHints
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Double
 *  java.awt.geom.Rectangle2D
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class776;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class800
extends Class193 {
    private int Field3570 = 1;
    private int Field3571 = 1;
    private int Field3572 = 1;
    private BufferedImage Field3573;
    private boolean Field3574 = true;

    public void Method87(boolean a) {
        this.Field3574 = a;
    }

    public boolean Method88() {
        return this.Field3574;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = new BufferedImage(a3, a4, 2);
        int[] a5 = new int[a3 * a4];
        int[] a6 = new int[a3 * a4];
        this.Method104(a, 0, 0, a3, a4, a5);
        if (this.Field3574) {
            Class776.Method1727(a5, 0, a5.length);
        }
        for (int a7 = 0; a7 < this.Field3572; ++a7) {
            this.Method3303(a5, a6, a3, a4, this.Field3570, 1);
            this.Method3303(a6, a5, a4, a3, this.Field3571, 2);
        }
        if (this.Field3574) {
            Class776.Method1728(a5, 0, a5.length);
        }
        this.Method1267(a2, 0, 0, a3, a4, a5);
        return a2;
    }

    @Override
    public BufferedImage Method1263(BufferedImage a, ColorModel a2) {
        a2 = a.getColorModel();
        return new BufferedImage(a2, a2.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a2.isAlphaPremultiplied(), null);
    }

    @Override
    public Rectangle2D Method1264(BufferedImage a) {
        return new Rectangle(0, 0, a.getWidth(), a.getHeight());
    }

    @Override
    public Point2D Method1265(Point2D a, Point2D a2) {
        a2 = new Point2D.Double();
        a2.setLocation(a.getX(), a.getY());
        return a2;
    }

    @Override
    public RenderingHints Method1266() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void Method3303(int[] a, int[] a2, int a3, int a4, int a5, int a6) {
        void a7;
        int a8 = a3 - 1;
        int[] a9 = new int[a3];
        int[] a10 = new int[a3];
        int[] nArray = new int[a3];
        int[] a11 = new int[a3];
        int[] a12 = new int[a3];
        int a13 = 0;
        boolean bl = false;
        boolean a14 = Class193.Method1269();
        if (a7 < a4) {
            void a15;
            int a16;
            int a17;
            void a18 = a7;
            if (this.Field3573 != null) {
                if (a6 == 1) {
                    this.Method104(this.Field3573, 0, (int)a7, a3, 1, a12);
                }
                this.Method104(this.Field3573, (int)a7, 0, 1, a3, a12);
            }
            if ((a17 = 0) < a3) {
                a16 = a[a13 + a17];
                a11[a17] = a16 >> 24 & 0xFF;
                a9[a17] = a16 >> 16 & 0xFF;
                a10[a17] = a16 >> 8 & 0xFF;
                a15[a17] = a16 & 0xFF;
                int n = a17;
                a11[n] = a11[n] + a11[a17 - 1];
                int n2 = a17;
                a9[n2] = a9[n2] + a9[a17 - 1];
                int n3 = a17;
                a10[n3] = a10[n3] + a10[a17 - 1];
                void v3 = a15;
                int n4 = a17;
                v3[n4] = v3[n4] + a15[a17 - 1];
                ++a17;
            }
            if ((a17 = 0) < a3) {
                int a19;
                if (this.Field3573 != null) {
                    if (a6 == 1) {
                        a16 = (int)((float)((a12[a17] & 0xFF) * this.Field3570) / 255.0f);
                    }
                    a16 = (int)((float)((a12[a17] & 0xFF) * this.Field3571) / 255.0f);
                }
                if (a6 == 1) {
                    a16 = (int)(this.Method3304(a17, (int)a7, a3, a4) * (float)this.Field3570);
                }
                a16 = (int)(this.Method3304((int)a7, a17, a4, a3) * (float)this.Field3571);
                int a20 = 2 * a16 + 1;
                int a21 = 0;
                int a22 = 0;
                int a23 = 0;
                int a24 = 0;
                int a25 = a17 + a16;
                if (a25 > a8) {
                    a19 = a25 - a8;
                    int a26 = a8;
                    a21 += (a11[a26] - a11[a26 - 1]) * a19;
                    a22 += (a9[a26] - a9[a26 - 1]) * a19;
                    a23 += (a10[a26] - a10[a26 - 1]) * a19;
                    a24 += (a15[a26] - a15[a26 - 1]) * a19;
                    a25 = a8;
                }
                a19 = a17 - a16 - 1;
                a21 -= a11[0] * a19;
                a22 -= a9[0] * a19;
                a23 -= a10[0] * a19;
                a24 -= a15[0] * a19;
                a19 = 0;
                a2[a18] = (a21 += a11[a25] - a11[a19]) / a20 << 24 | (a22 += a9[a25] - a9[a19]) / a20 << 16 | (a23 += a10[a25] - a10[a19]) / a20 << 8 | (a24 += a15[a25] - a15[a19]) / a20;
                a18 += a4;
                ++a17;
            }
            a13 += a3;
            ++a7;
        }
    }

    protected float Method3304(int a, int a2, int a3, int a4) {
        return (float)a / (float)a3;
    }

    public void Method9(int a) {
        this.Field3570 = a;
    }

    public int Method10() {
        return this.Field3570;
    }

    public void Method11(int a) {
        this.Field3571 = a;
    }

    public int Method12() {
        return this.Field3571;
    }

    public void Method13(int a) {
        this.Field3570 = this.Field3571 = a;
    }

    public int Method14() {
        return this.Field3570;
    }

    public void Method15(int a) {
        this.Field3572 = a;
    }

    public int Method16() {
        return this.Field3572;
    }

    public void Method1271(BufferedImage a) {
        this.Field3573 = a;
    }

    public BufferedImage Method1272() {
        return this.Field3573;
    }

    public String toString() {
        return "Blur/Variable Blur...";
    }
}