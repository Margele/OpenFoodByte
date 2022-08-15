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
 *  java.awt.image.Kernel
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import awsl.Class776;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class Class183
extends Class193 {
    public static int Field1135 = 0;
    public static int Field1136 = 1;
    public static int Field1137 = 2;
    protected Kernel Field1138 = null;
    protected boolean Field1139 = true;
    protected boolean Field1140 = true;
    private int Field1141 = Field1136;

    public Class183() {
        this(new float[9]);
    }

    public Class183(float[] a) {
        this(new Kernel(3, 3, a));
    }

    public Class183(int a, int a2, float[] a3) {
        this(new Kernel(a2, a, a3));
    }

    public Class183(Kernel a) {
        this.Field1138 = a;
    }

    public void Method1280(Kernel a) {
        this.Field1138 = a;
    }

    public Kernel Method1281() {
        return this.Field1138;
    }

    public void Method9(int a) {
        this.Field1141 = a;
    }

    public int Method10() {
        return this.Field1141;
    }

    public void Method87(boolean a) {
        this.Field1139 = a;
    }

    public boolean Method88() {
        return this.Field1139;
    }

    public void Method1282(boolean a) {
        this.Field1140 = a;
    }

    public boolean Method1283() {
        return this.Field1140;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = this.Method1263(a, null);
        int[] a5 = new int[a3 * a4];
        int[] a6 = new int[a3 * a4];
        this.Method104(a, 0, 0, a3, a4, a5);
        if (this.Field1140) {
            Class776.Method1727(a5, 0, a5.length);
        }
        Class183.Method1285(this.Field1138, a5, a6, a3, a4, this.Field1139, this.Field1141);
        if (this.Field1140) {
            Class776.Method1728(a6, 0, a6.length);
        }
        this.Method1267(a2, 0, 0, a3, a4, a6);
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

    public static void Method1284(Kernel a, int[] a2, int[] a3, int a4, int a5, int a6) {
        Class183.Method1285(a, a2, a3, a4, a5, true, a6);
    }

    public static void Method1285(Kernel a, int[] a2, int[] a3, int a4, int a5, boolean a6, int a7) {
        if (a.getHeight() == 1) {
            Class183.Method1287(a, a2, a3, a4, a5, a6, a7);
        } else if (a.getWidth() == 1) {
            Class183.Method1288(a, a2, a3, a4, a5, a6, a7);
        } else {
            Class183.Method1286(a, a2, a3, a4, a5, a6, a7);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void Method1286(Kernel a, int[] a2, int[] a3, int a4, int a5, boolean a6, int a7) {
        block6: {
            int a8;
            block7: {
                int a9;
                int a10;
                int a11;
                int a12;
                float a13;
                float a14;
                float a15;
                float a16;
                int a17;
                block8: {
                    block9: {
                        int a18;
                        block10: {
                            int a19;
                            float a20;
                            block11: {
                                void a21;
                                void a22;
                                int a23 = 0;
                                float[] a24 = a.getKernelData(null);
                                int n = a.getHeight();
                                int a25 = a.getWidth();
                                void var12_11 = a22 / 2;
                                boolean a26 = Class193.Method1269();
                                int a27 = a25 / 2;
                                a8 = 0;
                                if (a8 >= a5) break block6;
                                a17 = 0;
                                if (a17 >= a4) break block7;
                                a16 = 0.0f;
                                a15 = 0.0f;
                                a14 = 0.0f;
                                a13 = 0.0f;
                                a12 = -a21;
                                if (a12 > a21) break block8;
                                a11 = a8 + a12;
                                if (0 <= a11 && a11 < a5) {
                                    a10 = a11 * a4;
                                }
                                if (a7 == Field1136) {
                                    a10 = a8 * a4;
                                }
                                if (a7 != Field1137) break block9;
                                a10 = (a11 + a5) % a5 * a4;
                                a9 = a25 * (a12 + a21) + a27;
                                a18 = -a27;
                                if (a18 > a27) break block9;
                                a20 = a24[a9 + a18];
                                if (a20 == 0.0f) break block10;
                                a19 = a17 + a18;
                                if (0 <= a19 && a19 < a4) break block11;
                                if (a7 == Field1136) {
                                    a19 = a17;
                                }
                                if (a7 != Field1137) break block10;
                                a19 = (a17 + a4) % a4;
                            }
                            int a28 = a2[a10 + a19];
                            a13 += a20 * (float)(a28 >> 24 & 0xFF);
                            a16 += a20 * (float)(a28 >> 16 & 0xFF);
                            a15 += a20 * (float)(a28 >> 8 & 0xFF);
                            a14 += a20 * (float)(a28 & 0xFF);
                        }
                        ++a18;
                    }
                    ++a12;
                }
                a12 = Class767.Method1687((int)((double)a13 + 0.5));
                a11 = Class767.Method1687((int)((double)a16 + 0.5));
                a10 = Class767.Method1687((int)((double)a15 + 0.5));
                a9 = Class767.Method1687((int)((double)a14 + 0.5));
                a3[a23++] = a12 << 24 | a11 << 16 | a10 << 8 | a9;
                ++a17;
            }
            ++a8;
        }
    }

    public static void Method1287(Kernel a, int[] a2, int[] a3, int a4, int a5, boolean a6, int a7) {
        int a8 = 0;
        float[] a9 = a.getKernelData(null);
        int a10 = a.getWidth();
        int a11 = a10 / 2;
        for (int a12 = 0; a12 < a5; ++a12) {
            int a13 = a12 * a4;
            for (int a14 = 0; a14 < a4; ++a14) {
                int a15;
                int a16;
                int a17;
                float a18 = 0.0f;
                float a19 = 0.0f;
                float a20 = 0.0f;
                float a21 = 0.0f;
                int a22 = a11;
                for (a17 = -a11; a17 <= a11; ++a17) {
                    float a23 = a9[a22 + a17];
                    if (a23 == 0.0f) continue;
                    a16 = a14 + a17;
                    if (a7 == Field1136) {
                        a16 = 0;
                    } else if (a7 == Field1137) {
                        a16 = (a14 + a4) % a4;
                    }
                    a15 = a2[a13 + a16];
                    a21 += a23 * (float)(a15 >> 24 & 0xFF);
                    a18 += a23 * (float)(a15 >> 16 & 0xFF);
                    a19 += a23 * (float)(a15 >> 8 & 0xFF);
                    a20 += a23 * (float)(a15 & 0xFF);
                }
                a17 = Class767.Method1687((int)((double)a21 + 0.5));
                int a24 = Class767.Method1687((int)((double)a18 + 0.5));
                a16 = Class767.Method1687((int)((double)a19 + 0.5));
                a15 = Class767.Method1687((int)((double)a20 + 0.5));
                a3[a8++] = a17 << 24 | a24 << 16 | a16 << 8 | a15;
            }
        }
    }

    public static void Method1288(Kernel a, int[] a2, int[] a3, int a4, int a5, boolean a6, int a7) {
        int a8 = 0;
        float[] a9 = a.getKernelData(null);
        int a10 = a.getHeight();
        int a11 = a10 / 2;
        for (int a12 = 0; a12 < a5; ++a12) {
            for (int a13 = 0; a13 < a4; ++a13) {
                int a14;
                int a15;
                int a16;
                float a17 = 0.0f;
                float a18 = 0.0f;
                float a19 = 0.0f;
                float a20 = 0.0f;
                for (a16 = -a11; a16 <= a11; ++a16) {
                    a15 = a12 + a16;
                    a14 = a7 == Field1136 ? 0 : (a7 == Field1137 ? (a12 + a5) % a5 * a4 : a15 * a4);
                    float a21 = a9[a16 + a11];
                    if (a21 == 0.0f) continue;
                    int a22 = a2[a14 + a13];
                    a20 += a21 * (float)(a22 >> 24 & 0xFF);
                    a17 += a21 * (float)(a22 >> 16 & 0xFF);
                    a18 += a21 * (float)(a22 >> 8 & 0xFF);
                    a19 += a21 * (float)(a22 & 0xFF);
                }
                a16 = Class767.Method1687((int)((double)a20 + 0.5));
                a15 = Class767.Method1687((int)((double)a17 + 0.5));
                a14 = Class767.Method1687((int)((double)a18 + 0.5));
                int a23 = Class767.Method1687((int)((double)a19 + 0.5));
                a3[a8++] = a16 << 24 | a15 << 16 | a14 << 8 | a23;
            }
        }
    }

    public String toString() {
        return "Blur/Convolve...";
    }
}