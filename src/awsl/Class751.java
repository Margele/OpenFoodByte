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
 *  java.awt.image.BufferedImageOp
 *  java.awt.image.ColorModel
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Random;

public class Class751
implements BufferedImageOp {
    private int Field3283 = 10;
    private float Field3284 = 0.1f;
    private int Field3285 = -7829368;
    private float Field3286 = 0.1f;
    private boolean Field3287 = true;
    private Random Field3288;

    public Class751() {
    }

    public Class751(int a, int a2, float a3, boolean a4, float a5) {
        this.Field3285 = a;
        this.Field3283 = a2;
        this.Field3284 = a3;
        this.Field3287 = a4;
        this.Field3286 = a5;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int n = a.getWidth();
        boolean a4 = Class193.Method1270();
        int a5 = a.getHeight();
        a2 = this.Method1263(a, null);
        int[] a6 = new int[a3];
        int[] a7 = new int[a3];
        this.Field3288 = new Random(0L);
        int a8 = this.Field3285 & 0xFF000000;
        int a9 = this.Field3285 >> 16 & 0xFF;
        int a10 = this.Field3285 >> 8 & 0xFF;
        int a11 = this.Field3285 & 0xFF;
        int a12 = 0;
        if (a12 < a5) {
            int a13 = 0;
            if (a13 < a3) {
                int a14;
                int a15 = a9;
                int a16 = a10;
                int a17 = a11;
                if (this.Field3286 != 0.0f) {
                    a14 = (int)((double)(255.0f * this.Field3286) * Math.sin((double)((double)a13 / (double)a3 * Math.PI)));
                    a15 += a14;
                    a16 += a14;
                    a17 += a14;
                }
                if (this.Field3287) {
                    a14 = (int)(255.0f * (2.0f * this.Field3288.nextFloat() - 1.0f) * this.Field3284);
                    a6[a13] = a8 | Class751.Method1613(a15 + a14) << 16 | Class751.Method1613(a16 + a14) << 8 | Class751.Method1613(a17 + a14);
                }
                a6[a13] = a8 | this.Method1612(a15) << 16 | this.Method1612(a16) << 8 | this.Method1612(a17);
                ++a13;
            }
            if (this.Field3283 != 0) {
                this.Method1615(a6, a7, (int)a3, this.Field3283);
                this.Method1267(a2, 0, a12, (int)a3, 1, a7);
            }
            this.Method1267(a2, 0, a12, (int)a3, 1, a6);
            ++a12;
        }
        return a2;
    }

    private int Method1612(int a) {
        a += (int)(255.0f * (2.0f * this.Field3288.nextFloat() - 1.0f) * this.Field3284);
        a = 0;
        return a;
    }

    private static int Method1613(int a) {
        return 0;
    }

    private static int Method1614(int a, int a2) {
        int a3 = a / a2;
        return (a -= a3 * a2) + a2;
    }

    public void Method1615(int[] a, int[] a2, int a3, int a4) {
        int a5;
        int a6;
        int a7 = a3 - 1;
        int a8 = 2 * a4 + 1;
        int a9 = 0;
        int a10 = 0;
        int a11 = 0;
        for (a6 = -a4; a6 <= a4; ++a6) {
            a5 = a[Class751.Method1614(a6, a3)];
            a9 += a5 >> 16 & 0xFF;
            a10 += a5 >> 8 & 0xFF;
            a11 += a5 & 0xFF;
        }
        for (a6 = 0; a6 < a3; ++a6) {
            a2[a6] = 0xFF000000 | a9 / a8 << 16 | a10 / a8 << 8 | a11 / a8;
            a5 = a6 + a4 + 1;
            if (a5 > a7) {
                a5 = Class751.Method1614(a5, a3);
            }
            int a12 = a6 - a4;
            a12 = Class751.Method1614(a12, a3);
            int a13 = a[a5];
            int a14 = a[a12];
            a9 += (a13 & 0xFF0000) - (a14 & 0xFF0000) >> 16;
            a10 += (a13 & 0xFF00) - (a14 & 0xFF00) >> 8;
            a11 += (a13 & 0xFF) - (a14 & 0xFF);
        }
    }

    public void Method9(int a) {
        this.Field3283 = a;
    }

    public int Method10() {
        return this.Field3283;
    }

    public void Method56(float a) {
        this.Field3284 = a;
    }

    public float Method57() {
        return this.Field3284;
    }

    public void Method58(float a) {
        this.Field3286 = a;
    }

    public float Method59() {
        return this.Field3286;
    }

    public void Method11(int a) {
        this.Field3285 = a;
    }

    public int Method12() {
        return this.Field3285;
    }

    public void Method1268(boolean a) {
        this.Field3287 = a;
    }

    public boolean Method1269() {
        return this.Field3287;
    }

    public BufferedImage Method1263(BufferedImage a, ColorModel a2) {
        a2 = a.getColorModel();
        return new BufferedImage(a2, a2.createCompatibleWritableRaster(a.getWidth(), a.getHeight()), a2.isAlphaPremultiplied(), null);
    }

    public Rectangle2D Method1264(BufferedImage a) {
        return new Rectangle(0, 0, a.getWidth(), a.getHeight());
    }

    public Point2D Method1265(Point2D a, Point2D a2) {
        a2 = new Point2D.Double();
        a2.setLocation(a.getX(), a.getY());
        return a2;
    }

    public RenderingHints Method1266() {
        return null;
    }

    private void Method1267(BufferedImage a, int a2, int a3, int a4, int a5, int[] a6) {
        int a7 = a.getType();
        if (a7 == 2 || a7 == 1) {
            a.getRaster().setDataElements(a2, a3, a4, a5, (Object)a6);
        } else {
            a.setRGB(a2, a3, a4, a5, a6, 0, a4);
        }
    }

    public String toString() {
        return "Texture/Brushed Metal...";
    }
}