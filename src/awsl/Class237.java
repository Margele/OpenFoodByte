/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.CompositeContext
 *  java.awt.color.ColorSpace
 *  java.awt.image.ColorModel
 *  java.awt.image.Raster
 *  java.awt.image.WritableRaster
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class236;
import awsl.Class91;
import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Class237
implements CompositeContext {
    private int Field1301;
    private float Field1302;
    private ColorModel Field1303;
    private ColorModel Field1304;
    private ColorSpace Field1305;
    private ColorSpace Field1306;
    private boolean Field1307;
    private boolean Field1308;

    public Class237(int a, float a2, ColorModel a3, ColorModel a4) {
        this.Field1301 = a;
        this.Field1302 = a2;
        this.Field1303 = a3;
        this.Field1304 = a4;
        this.Field1305 = a3.getColorSpace();
        this.Field1306 = a4.getColorSpace();
        ColorModel a5 = ColorModel.getRGBdefault();
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

    public void Method1437(Raster a, Raster a2, WritableRaster a3) {
        float[] a4;
        float[] a5;
        float a6 = 0.0f;
        float a7 = 0.0f;
        float a8 = this.Field1302;
        Object var9_7 = null;
        Object var10_8 = null;
        String[] a9 = Class236.Method2106();
        float[] a10 = null;
        switch (this.Field1301) {
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                a5 = new float[3];
                a4 = new float[3];
                a10 = new float[3];
            }
        }
        int[] a11 = null;
        int[] a12 = null;
        int a13 = a3.getMinX();
        int a14 = a3.getWidth();
        int a15 = a3.getMinY();
        int a16 = a15 + a3.getHeight();
        int a17 = a15;
        if (a17 < a16) {
            a11 = a.getPixels(a13, a17, a14, 1, a11);
            a12 = a2.getPixels(a13, a17, a14, 1, a12);
            int a18 = 0;
            int a19 = a14 * 4;
            if (a18 < a19) {
                int a20;
                int a21;
                int a22;
                int a23 = a11[a18];
                int a24 = a12[a18];
                int a25 = a11[a18 + 1];
                int a26 = a12[a18 + 1];
                int a27 = a11[a18 + 2];
                int a28 = a12[a18 + 2];
                int a29 = a11[a18 + 3];
                int a30 = a12[a18 + 3];
                switch (this.Field1301) {
                    default: {
                        a22 = a24 + a23;
                        if (a22 > 255) {
                            a22 = 255;
                        }
                        if ((a21 = a26 + a25) > 255) {
                            a21 = 255;
                        }
                        if ((a20 = a28 + a27) <= 255) break;
                        a20 = 255;
                        Class91.Method3647(new String[2]);
                    }
                    case 2: {
                        a22 = a24 - a23;
                        a22 = 0;
                        a21 = a26 - a25;
                        a21 = 0;
                        a20 = a28 - a27;
                        a20 = 0;
                    }
                    case 3: {
                        a22 = a24 - a23;
                        a22 = -a22;
                        a21 = a26 - a25;
                        a21 = -a21;
                        a20 = a28 - a27;
                        a20 = -a20;
                    }
                    case 4: {
                        int a31 = a24 * a23 + 128;
                        a22 = (a31 >> 8) + a31 >> 8;
                        a31 = a26 * a25 + 128;
                        a21 = (a31 >> 8) + a31 >> 8;
                        a31 = a28 * a27 + 128;
                        a20 = (a31 >> 8) + a31 >> 8;
                    }
                    case 8: {
                        int a31 = (255 - a24) * (255 - a23) + 128;
                        a22 = 255 - ((a31 >> 8) + a31 >> 8);
                        a31 = (255 - a26) * (255 - a25) + 128;
                        a21 = 255 - ((a31 >> 8) + a31 >> 8);
                        a31 = (255 - a28) * (255 - a27) + 128;
                        a20 = 255 - ((a31 >> 8) + a31 >> 8);
                    }
                    case 16: {
                        int a31;
                        if (a24 < 128) {
                            a31 = a24 * a23 + 128;
                            a22 = 2 * ((a31 >> 8) + a31 >> 8);
                        }
                        a31 = (255 - a24) * (255 - a23) + 128;
                        a22 = 2 * (255 - ((a31 >> 8) + a31 >> 8));
                        if (a26 < 128) {
                            a31 = a26 * a25 + 128;
                            a21 = 2 * ((a31 >> 8) + a31 >> 8);
                        }
                        a31 = (255 - a26) * (255 - a25) + 128;
                        a21 = 2 * (255 - ((a31 >> 8) + a31 >> 8));
                        if (a28 < 128) {
                            a31 = a28 * a27 + 128;
                            a20 = 2 * ((a31 >> 8) + a31 >> 8);
                        }
                        a31 = (255 - a28) * (255 - a27) + 128;
                        a20 = 2 * (255 - ((a31 >> 8) + a31 >> 8));
                    }
                    case 5: {
                        a22 = a24 < a23 ? a24 : a23;
                        a21 = a26 < a25 ? a26 : a25;
                        a20 = a28 < a27 ? a28 : a27;
                    }
                    case 9: {
                        a22 = a24 > a23 ? a24 : a23;
                        a21 = a26 > a25 ? a26 : a25;
                        a20 = a28 > a27 ? a28 : a27;
                    }
                    case 22: {
                        a22 = (a24 + a23) / 2;
                        a21 = (a26 + a25) / 2;
                        a20 = (a28 + a27) / 2;
                    }
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: {
                        Color.RGBtoHSB((int)a23, (int)a25, (int)a27, (float[])a5);
                        Color.RGBtoHSB((int)a24, (int)a26, (int)a28, (float[])a4);
                        switch (this.Field1301) {
                            case 12: {
                                a10[0] = a5[0];
                                a10[1] = a4[1];
                                a10[2] = a4[2];
                            }
                            case 13: {
                                a10[0] = a4[0];
                                a10[1] = a5[1];
                                a10[2] = a4[2];
                            }
                            case 14: {
                                a10[0] = a4[0];
                                a10[1] = a4[1];
                                a10[2] = a5[2];
                            }
                            case 15: {
                                a10[0] = a5[0];
                                a10[1] = a5[1];
                                a10[2] = a4[2];
                            }
                        }
                        int a32 = Color.HSBtoRGB((float)a10[0], (float)a10[1], (float)a10[2]);
                        a22 = (a32 & 0xFF0000) >> 16;
                        a21 = (a32 & 0xFF00) >> 8;
                        a20 = a32 & 0xFF;
                    }
                    case 6: {
                        if (a24 != 255) {
                            a22 = Class237.Method1436(255 - (255 - a23 << 8) / (a24 + 1));
                        }
                        a22 = a23;
                        if (a26 != 255) {
                            a21 = Class237.Method1436(255 - (255 - a25 << 8) / (a26 + 1));
                        }
                        a21 = a25;
                        if (a28 != 255) {
                            a20 = Class237.Method1436(255 - (255 - a27 << 8) / (a28 + 1));
                        }
                        a20 = a27;
                    }
                    case 7: {
                        a22 = Math.max((int)(255 - (255 - a24 << 8) / a23), (int)0);
                        a22 = a23;
                        a21 = Math.max((int)(255 - (255 - a26 << 8) / a25), (int)0);
                        a21 = a25;
                        a20 = Math.max((int)(255 - (255 - a28 << 8) / a27), (int)0);
                        a20 = a27;
                    }
                    case 10: {
                        a22 = Class237.Method1436((a23 << 8) / (256 - a24));
                        a21 = Class237.Method1436((a25 << 8) / (256 - a26));
                        a20 = Class237.Method1436((a27 << 8) / (256 - a28));
                    }
                    case 11: {
                        if (a23 != 255) {
                            a22 = Math.min((int)((a24 << 8) / (255 - a23)), (int)255);
                        }
                        a22 = a23;
                        if (a25 != 255) {
                            a21 = Math.min((int)((a26 << 8) / (255 - a25)), (int)255);
                        }
                        a21 = a25;
                        if (a27 != 255) {
                            a20 = Math.min((int)((a28 << 8) / (255 - a27)), (int)255);
                        }
                        a20 = a27;
                    }
                    case 17: {
                        int a33 = Class237.Method1435(a23, a24);
                        a22 = a33 + Class237.Method1435(a24, 255 - Class237.Method1435(255 - a24, 255 - a23) - a33);
                        a33 = Class237.Method1435(a25, a26);
                        a21 = a33 + Class237.Method1435(a26, 255 - Class237.Method1435(255 - a26, 255 - a25) - a33);
                        a33 = Class237.Method1435(a27, a28);
                        a20 = a33 + Class237.Method1435(a28, 255 - Class237.Method1435(255 - a28, 255 - a27) - a33);
                    }
                    case 18: {
                        if (a23 > 127) {
                            a22 = 255 - 2 * Class237.Method1435(255 - a23, 255 - a24);
                        }
                        a22 = 2 * Class237.Method1435(a23, a24);
                        if (a25 > 127) {
                            a21 = 255 - 2 * Class237.Method1435(255 - a25, 255 - a26);
                        }
                        a21 = 2 * Class237.Method1435(a25, a26);
                        if (a27 > 127) {
                            a20 = 255 - 2 * Class237.Method1435(255 - a27, 255 - a28);
                        }
                        a20 = 2 * Class237.Method1435(a27, a28);
                    }
                    case 19: {
                        a22 = a23 > 127 ? Math.max((int)a23, (int)a24) : Math.min((int)a23, (int)a24);
                        a21 = a25 > 127 ? Math.max((int)a25, (int)a26) : Math.min((int)a25, (int)a26);
                        a20 = a27 > 127 ? Math.max((int)a27, (int)a28) : Math.min((int)a27, (int)a28);
                    }
                    case 20: {
                        a22 = a24 + Class237.Method1435(a23, 255 - a24 - a24);
                        a21 = a26 + Class237.Method1435(a25, 255 - a26 - a26);
                        a20 = a28 + Class237.Method1435(a27, 255 - a28 - a28);
                    }
                    case 21: {
                        a22 = 255 - Math.abs((int)(255 - a23 - a24));
                        a21 = 255 - Math.abs((int)(255 - a25 - a26));
                        a20 = 255 - Math.abs((int)(255 - a27 - a28));
                    }
                }
                a6 = a8 * (float)a29 / 255.0f;
                a7 = 1.0f - a6;
                a12[a18] = (int)(a6 * (float)a22 + a7 * (float)a24);
                a12[a18 + 1] = (int)(a6 * (float)a21 + a7 * (float)a26);
                a12[a18 + 2] = (int)(a6 * (float)a20 + a7 * (float)a28);
                a12[a18 + 3] = (int)((float)a29 * a8 + (float)a30 * a7);
                a18 += 4;
            }
            a3.setPixels(a13, a17, a14, 1, a12);
            ++a17;
        }
    }
}