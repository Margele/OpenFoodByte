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
import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import obfuscate.a;

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

    public void Method1437(Raster a2, Raster a3, WritableRaster a4) {
        float[] a5;
        float[] a6;
        float a7 = 0.0f;
        float a8 = 0.0f;
        float a9 = this.Field1302;
        Object var9_7 = null;
        Object var10_8 = null;
        String[] a10 = Class236.Method2106();
        float[] a11 = null;
        switch (this.Field1301) {
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                a6 = new float[3];
                a5 = new float[3];
                a11 = new float[3];
            }
        }
        int[] a12 = null;
        int[] a13 = null;
        int a14 = a4.getMinX();
        int a15 = a4.getWidth();
        int a16 = a4.getMinY();
        int a17 = a16 + a4.getHeight();
        int a18 = a16;
        if (a18 < a17) {
            a12 = a2.getPixels(a14, a18, a15, 1, a12);
            a13 = a3.getPixels(a14, a18, a15, 1, a13);
            int a19 = 0;
            int a20 = a15 * 4;
            if (a19 < a20) {
                int a21;
                int a22;
                int a23;
                int a24 = a12[a19];
                int a25 = a13[a19];
                int a26 = a12[a19 + 1];
                int a27 = a13[a19 + 1];
                int a28 = a12[a19 + 2];
                int a29 = a13[a19 + 2];
                int a30 = a12[a19 + 3];
                int a31 = a13[a19 + 3];
                switch (this.Field1301) {
                    default: {
                        a23 = a25 + a24;
                        if (a23 > 255) {
                            a23 = 255;
                        }
                        if ((a22 = a27 + a26) > 255) {
                            a22 = 255;
                        }
                        if ((a21 = a29 + a28) <= 255) break;
                        a21 = 255;
                        a.trash(new String[2]);
                    }
                    case 2: {
                        a23 = a25 - a24;
                        a23 = 0;
                        a22 = a27 - a26;
                        a22 = 0;
                        a21 = a29 - a28;
                        a21 = 0;
                    }
                    case 3: {
                        a23 = a25 - a24;
                        a23 = -a23;
                        a22 = a27 - a26;
                        a22 = -a22;
                        a21 = a29 - a28;
                        a21 = -a21;
                    }
                    case 4: {
                        int a32 = a25 * a24 + 128;
                        a23 = (a32 >> 8) + a32 >> 8;
                        a32 = a27 * a26 + 128;
                        a22 = (a32 >> 8) + a32 >> 8;
                        a32 = a29 * a28 + 128;
                        a21 = (a32 >> 8) + a32 >> 8;
                    }
                    case 8: {
                        int a32 = (255 - a25) * (255 - a24) + 128;
                        a23 = 255 - ((a32 >> 8) + a32 >> 8);
                        a32 = (255 - a27) * (255 - a26) + 128;
                        a22 = 255 - ((a32 >> 8) + a32 >> 8);
                        a32 = (255 - a29) * (255 - a28) + 128;
                        a21 = 255 - ((a32 >> 8) + a32 >> 8);
                    }
                    case 16: {
                        int a32;
                        if (a25 < 128) {
                            a32 = a25 * a24 + 128;
                            a23 = 2 * ((a32 >> 8) + a32 >> 8);
                        }
                        a32 = (255 - a25) * (255 - a24) + 128;
                        a23 = 2 * (255 - ((a32 >> 8) + a32 >> 8));
                        if (a27 < 128) {
                            a32 = a27 * a26 + 128;
                            a22 = 2 * ((a32 >> 8) + a32 >> 8);
                        }
                        a32 = (255 - a27) * (255 - a26) + 128;
                        a22 = 2 * (255 - ((a32 >> 8) + a32 >> 8));
                        if (a29 < 128) {
                            a32 = a29 * a28 + 128;
                            a21 = 2 * ((a32 >> 8) + a32 >> 8);
                        }
                        a32 = (255 - a29) * (255 - a28) + 128;
                        a21 = 2 * (255 - ((a32 >> 8) + a32 >> 8));
                    }
                    case 5: {
                        a23 = a25 < a24 ? a25 : a24;
                        a22 = a27 < a26 ? a27 : a26;
                        a21 = a29 < a28 ? a29 : a28;
                    }
                    case 9: {
                        a23 = a25 > a24 ? a25 : a24;
                        a22 = a27 > a26 ? a27 : a26;
                        a21 = a29 > a28 ? a29 : a28;
                    }
                    case 22: {
                        a23 = (a25 + a24) / 2;
                        a22 = (a27 + a26) / 2;
                        a21 = (a29 + a28) / 2;
                    }
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: {
                        Color.RGBtoHSB((int)a24, (int)a26, (int)a28, (float[])a6);
                        Color.RGBtoHSB((int)a25, (int)a27, (int)a29, (float[])a5);
                        switch (this.Field1301) {
                            case 12: {
                                a11[0] = a6[0];
                                a11[1] = a5[1];
                                a11[2] = a5[2];
                            }
                            case 13: {
                                a11[0] = a5[0];
                                a11[1] = a6[1];
                                a11[2] = a5[2];
                            }
                            case 14: {
                                a11[0] = a5[0];
                                a11[1] = a5[1];
                                a11[2] = a6[2];
                            }
                            case 15: {
                                a11[0] = a6[0];
                                a11[1] = a6[1];
                                a11[2] = a5[2];
                            }
                        }
                        int a33 = Color.HSBtoRGB((float)a11[0], (float)a11[1], (float)a11[2]);
                        a23 = (a33 & 0xFF0000) >> 16;
                        a22 = (a33 & 0xFF00) >> 8;
                        a21 = a33 & 0xFF;
                    }
                    case 6: {
                        if (a25 != 255) {
                            a23 = Class237.Method1436(255 - (255 - a24 << 8) / (a25 + 1));
                        }
                        a23 = a24;
                        if (a27 != 255) {
                            a22 = Class237.Method1436(255 - (255 - a26 << 8) / (a27 + 1));
                        }
                        a22 = a26;
                        if (a29 != 255) {
                            a21 = Class237.Method1436(255 - (255 - a28 << 8) / (a29 + 1));
                        }
                        a21 = a28;
                    }
                    case 7: {
                        a23 = Math.max((int)(255 - (255 - a25 << 8) / a24), (int)0);
                        a23 = a24;
                        a22 = Math.max((int)(255 - (255 - a27 << 8) / a26), (int)0);
                        a22 = a26;
                        a21 = Math.max((int)(255 - (255 - a29 << 8) / a28), (int)0);
                        a21 = a28;
                    }
                    case 10: {
                        a23 = Class237.Method1436((a24 << 8) / (256 - a25));
                        a22 = Class237.Method1436((a26 << 8) / (256 - a27));
                        a21 = Class237.Method1436((a28 << 8) / (256 - a29));
                    }
                    case 11: {
                        if (a24 != 255) {
                            a23 = Math.min((int)((a25 << 8) / (255 - a24)), (int)255);
                        }
                        a23 = a24;
                        if (a26 != 255) {
                            a22 = Math.min((int)((a27 << 8) / (255 - a26)), (int)255);
                        }
                        a22 = a26;
                        if (a28 != 255) {
                            a21 = Math.min((int)((a29 << 8) / (255 - a28)), (int)255);
                        }
                        a21 = a28;
                    }
                    case 17: {
                        int a34 = Class237.Method1435(a24, a25);
                        a23 = a34 + Class237.Method1435(a25, 255 - Class237.Method1435(255 - a25, 255 - a24) - a34);
                        a34 = Class237.Method1435(a26, a27);
                        a22 = a34 + Class237.Method1435(a27, 255 - Class237.Method1435(255 - a27, 255 - a26) - a34);
                        a34 = Class237.Method1435(a28, a29);
                        a21 = a34 + Class237.Method1435(a29, 255 - Class237.Method1435(255 - a29, 255 - a28) - a34);
                    }
                    case 18: {
                        if (a24 > 127) {
                            a23 = 255 - 2 * Class237.Method1435(255 - a24, 255 - a25);
                        }
                        a23 = 2 * Class237.Method1435(a24, a25);
                        if (a26 > 127) {
                            a22 = 255 - 2 * Class237.Method1435(255 - a26, 255 - a27);
                        }
                        a22 = 2 * Class237.Method1435(a26, a27);
                        if (a28 > 127) {
                            a21 = 255 - 2 * Class237.Method1435(255 - a28, 255 - a29);
                        }
                        a21 = 2 * Class237.Method1435(a28, a29);
                    }
                    case 19: {
                        a23 = a24 > 127 ? Math.max((int)a24, (int)a25) : Math.min((int)a24, (int)a25);
                        a22 = a26 > 127 ? Math.max((int)a26, (int)a27) : Math.min((int)a26, (int)a27);
                        a21 = a28 > 127 ? Math.max((int)a28, (int)a29) : Math.min((int)a28, (int)a29);
                    }
                    case 20: {
                        a23 = a25 + Class237.Method1435(a24, 255 - a25 - a25);
                        a22 = a27 + Class237.Method1435(a26, 255 - a27 - a27);
                        a21 = a29 + Class237.Method1435(a28, 255 - a29 - a29);
                    }
                    case 21: {
                        a23 = 255 - Math.abs((int)(255 - a24 - a25));
                        a22 = 255 - Math.abs((int)(255 - a26 - a27));
                        a21 = 255 - Math.abs((int)(255 - a28 - a29));
                    }
                }
                a7 = a9 * (float)a30 / 255.0f;
                a8 = 1.0f - a7;
                a13[a19] = (int)(a7 * (float)a23 + a8 * (float)a25);
                a13[a19 + 1] = (int)(a7 * (float)a22 + a8 * (float)a27);
                a13[a19 + 2] = (int)(a7 * (float)a21 + a8 * (float)a29);
                a13[a19 + 3] = (int)((float)a30 * a9 + (float)a31 * a8);
                a19 += 4;
            }
            a4.setPixels(a14, a18, a15, 1, a13);
            ++a18;
        }
    }
}