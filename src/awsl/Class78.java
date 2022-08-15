/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class592;
import awsl.Class776;
import java.awt.image.BufferedImage;

public class Class78
extends Class193 {
    private float Field701 = 10.0f;
    private float Field702 = 2.0f;
    private float Field703 = 255.0f;
    private float Field704 = 0.0f;
    private int Field705 = 5;

    public void Method56(float a) {
        this.Field701 = a;
    }

    public float Method57() {
        return this.Field701;
    }

    public void Method9(int a) {
        this.Field705 = a;
    }

    public int Method10() {
        return this.Field705;
    }

    public void Method58(float a) {
        this.Field702 = a;
    }

    public float Method59() {
        return this.Field702;
    }

    public void Method60(float a) {
        this.Field703 = a;
    }

    public float Method61() {
        return this.Field703;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3;
        void a4;
        int a5;
        int a6 = a.getWidth();
        int a7 = a.getHeight();
        boolean bl = true;
        boolean a8 = Class193.Method1269();
        int a9 = 1;
        int a10 = 0;
        int a11 = 0;
        int a12 = (int)Math.ceil((double)this.Field701);
        int a13 = a5 = 128;
        int a14 = a6 + a12 * 2;
        int a15 = a7 + a12 * 2;
        a5 = a12 < 32 ? Math.min((int)128, (int)(a6 + 2 * a12)) : Math.min((int)256, (int)(a6 + 2 * a12));
        a13 = a12 < 32 ? Math.min((int)128, (int)(a7 + 2 * a12)) : Math.min((int)256, (int)(a7 + 2 * a12));
        a2 = new BufferedImage(a6, a7, 2);
        if (a4 < a13) {
            a4 *= 2;
            ++a10;
        }
        if (a9 < a5) {
            a9 *= 2;
            ++a11;
        }
        int a16 = a9;
        void a17 = a4;
        a5 = a16;
        a13 = a17;
        Class592 a18 = new Class592(Math.max((int)a10, (int)a11));
        int[] a19 = new int[a16 * a17];
        float[][] a20 = new float[2][a16 * a17];
        float[][] a21 = new float[2][a16 * a17];
        float[][] a22 = new float[2][a16 * a17];
        double a23 = Math.PI / (double)this.Field705;
        double a24 = 1.0 / Math.cos((double)a23);
        double a25 = this.Field701 * this.Field701;
        double a26 = Math.toRadians((double)this.Field704);
        float a27 = 0.0f;
        int a28 = 0;
        int a29 = 0;
        if (a29 < a17) {
            a3 = 0;
            if (a3 < a16) {
                double a30;
                double a31 = (float)a3 - (float)a16 / 2.0f;
                double a32 = (float)a29 - (float)a17 / 2.0f;
                double a33 = a31 * a31 + a32 * a32;
                double d = a30 = a33 < a25 ? 1.0 : 0.0;
                if (a30 != 0.0) {
                    a33 = Math.sqrt((double)a33);
                    if (this.Field705 != 0) {
                        double a34 = Math.atan2((double)a32, (double)a31) + a26;
                        a34 = Class776.Method1713(a34, a23 * 2.0) - a23;
                        a30 = Math.cos((double)a34) * a24;
                    }
                    a30 = (a30 = 1.0) * a33 < (double)this.Field701 ? 1.0 : 0.0;
                }
                a27 += (float)a30;
                a20[0][a28] = (float)a30;
                a20[1][a28] = 0.0f;
                ++a28;
                ++a3;
            }
            ++a29;
        }
        a28 = 0;
        a29 = 0;
        if (a29 < a17) {
            a3 = 0;
            if (a3 < a16) {
                float[] fArray = a20[0];
                int n = a28++;
                fArray[n] = fArray[n] / a27;
                ++a3;
            }
            ++a29;
        }
        a18.Method54(a20[0], a20[1], a16, (int)a17, true);
        a29 = -a12;
        if (a29 < a7) {
            a3 = -a12;
            if (a3 < a6) {
                int a35;
                int a36;
                int a37 = a3;
                int a38 = a29;
                int a39 = a5;
                int a40 = a13;
                int a41 = 0;
                int a42 = 0;
                a39 += a37;
                a41 -= a37;
                a37 = 0;
                a40 += a38;
                a42 -= a38;
                a38 = 0;
                if (a37 + a39 > a6) {
                    a39 = a6 - a37;
                }
                if (a38 + a40 > a7) {
                    a40 = a7 - a38;
                }
                a.getRGB(a37, a38, a39, a40, a19, a42 * a16 + a41, a16);
                a28 = 0;
                int a43 = 0;
                if (a43 < a17) {
                    a36 = a43 + a29;
                    int a44 = a42;
                    if (a36 > a7) {
                        a44 = a42 + a40 - 1;
                    }
                    a44 = a43;
                    a44 *= a16;
                    int a45 = 0;
                    if (a45 < a16) {
                        a35 = a45 + a3;
                        int a46 = a41;
                        if (a35 > a6) {
                            a46 = a41 + a39 - 1;
                        }
                        a46 = a45;
                        a22[0][a28] = a19[a46 += a44] >> 24 & 0xFF;
                        float a47 = a19[a46] >> 16 & 0xFF;
                        float a48 = a19[a46] >> 8 & 0xFF;
                        float a49 = a19[a46] & 0xFF;
                        if (a47 > this.Field703) {
                            a47 *= this.Field702;
                        }
                        if (a48 > this.Field703) {
                            a48 *= this.Field702;
                        }
                        if (a49 > this.Field703) {
                            a49 *= this.Field702;
                        }
                        a22[1][a28] = a47;
                        a21[0][a28] = a48;
                        a21[1][a28] = a49;
                        ++a28;
                        ++a46;
                        ++a45;
                    }
                    ++a43;
                }
                a18.Method54(a22[0], a22[1], a9, (int)a4, true);
                a18.Method54(a21[0], a21[1], a9, (int)a4, true);
                a28 = 0;
                a43 = 0;
                if (a43 < a17) {
                    a36 = 0;
                    if (a36 < a16) {
                        float a50 = a22[0][a28];
                        float a51 = a22[1][a28];
                        float a52 = a20[0][a28];
                        float a53 = a20[1][a28];
                        a22[0][a28] = a50 * a52 - a51 * a53;
                        a22[1][a28] = a50 * a53 + a51 * a52;
                        a50 = a21[0][a28];
                        a51 = a21[1][a28];
                        a21[0][a28] = a50 * a52 - a51 * a53;
                        a21[1][a28] = a50 * a53 + a51 * a52;
                        ++a28;
                        ++a36;
                    }
                    ++a43;
                }
                a18.Method54(a22[0], a22[1], a9, (int)a4, false);
                a18.Method54(a21[0], a21[1], a9, (int)a4, false);
                a43 = a16 >> 1;
                a36 = a17 >> 1;
                int a54 = 0;
                int a55 = 0;
                if (a55 < a16) {
                    a35 = a55 ^ a43;
                    int a56 = a35 * a9;
                    int a57 = 0;
                    if (a57 < a16) {
                        int a58 = a56 + (a57 ^ a36);
                        int a59 = (int)a22[0][a58];
                        int a60 = (int)a22[1][a58];
                        int a61 = (int)a21[0][a58];
                        int a62 = (int)a21[1][a58];
                        if (a60 > 255) {
                            a60 = 255;
                        }
                        if (a61 > 255) {
                            a61 = 255;
                        }
                        if (a62 > 255) {
                            a62 = 255;
                        }
                        int a63 = a59 << 24 | a60 << 16 | a61 << 8 | a62;
                        a19[a54++] = a63;
                        ++a57;
                    }
                    ++a55;
                }
                a37 = a3 + a12;
                a38 = a29 + a12;
                a39 = a5 - 2 * a12;
                a40 = a13 - 2 * a12;
                if (a37 + a39 > a6) {
                    a39 = a6 - a37;
                }
                if (a38 + a40 > a7) {
                    a40 = a7 - a38;
                }
                a2.setRGB(a37, a38, a39, a40, a19, a12 * a16 + a12, a16);
                a3 += a5 - 2 * a12;
            }
            a29 += a13 - 2 * a12;
        }
        return a2;
    }

    public String toString() {
        return "Blur/Lens Blur...";
    }
}