/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import awsl.Class598;
import awsl.Class798;
import java.awt.Rectangle;
import java.util.Random;

public class Class783
extends Class798 {
    private float Field3521 = 32.0f;
    private float Field3522 = 0.0f;
    private int Field3523 = 10;
    private float Field3524 = 1.0f;
    private float Field3525 = 1.0f;
    private float Field3526 = 0.0f;
    private float Field3527 = 0.0f;
    private int Field3528 = 2;
    private int Field3529 = -8806401;
    private float Field3530;
    private float Field3531;

    public void Method56(float a) {
        this.Field3521 = a;
    }

    public float Method57() {
        return this.Field3521;
    }

    public void Method9(int a) {
        this.Field3523 = a;
    }

    public int Method10() {
        return this.Field3523;
    }

    public void Method58(float a) {
        this.Field3525 = a;
    }

    public float Method59() {
        return this.Field3525;
    }

    public void Method60(float a) {
        this.Field3524 = a;
    }

    public float Method61() {
        return this.Field3524;
    }

    public void Method164(float a) {
        this.Field3526 = a;
    }

    public float Method165() {
        return this.Field3526;
    }

    public void Method166(float a) {
        this.Field3527 = a;
    }

    public float Method167() {
        return this.Field3527;
    }

    public void Method11(int a) {
        this.Field3528 = a;
    }

    public int Method12() {
        return this.Field3528;
    }

    public void Method13(int a) {
        this.Field3529 = a;
    }

    public int Method14() {
        return this.Field3529;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5;
        Random a6 = new Random(0L);
        this.Field3530 = (float)Math.sin((double)0.1);
        this.Field3531 = (float)Math.cos((double)0.1);
        int a7 = this.Field3569.width;
        int n = this.Field3569.height;
        int a8 = a4.width;
        int a9 = a4.height;
        int a10 = 0;
        int[] a11 = new int[a8 * a9];
        boolean bl = false;
        boolean a12 = Class193.Method1269();
        if (a5 < a9) {
            int a13 = 0;
            if (a13 < a8) {
                a11[a10++] = this.Field3529;
                ++a13;
            }
            ++a5;
        }
        a5 = this.Field3523 / this.Field3528;
        a5 = 1;
        float a14 = 1.0f / this.Field3521;
        float a15 = 0.95f;
        a10 = 0;
        int a16 = 0;
        if (a16 < a9) {
            int a17 = 0;
            if (a17 < a8) {
                int a18 = 0;
                if (a18 < this.Field3528) {
                    int a19;
                    int a20;
                    int a21;
                    float a22;
                    float a23 = (float)a17 + a6.nextFloat();
                    float a24 = (float)a16 + a6.nextFloat();
                    float a25 = a23 * a14;
                    float a26 = a24 * a14;
                    float a27 = 0.1f + this.Field3524;
                    float a28 = this.Method20(a25 - a15, a26) - this.Method20(a25 + a15, a26);
                    float a29 = this.Method20(a25, a26 + a15) - this.Method20(a25, a26 - a15);
                    if (this.Field3526 > 0.0f) {
                        int a30 = 0;
                        if (a30 < 3) {
                            a22 = 1.0f + (float)a30 * this.Field3526;
                            float a31 = a23 + this.Field3521 * a27 * a28 * a22;
                            float a32 = a24 + this.Field3521 * a27 * a29 * a22;
                            if (!(a31 < 0.0f || a31 >= (float)(a8 - 1) || a32 < 0.0f || a32 >= (float)(a9 - 1))) {
                                a21 = (int)a32 * a8 + (int)a31;
                                a20 = a11[a21];
                                a19 = a20 >> 16 & 0xFF;
                                int a33 = a20 >> 8 & 0xFF;
                                int a34 = a20 & 0xFF;
                                if (a30 == 2) {
                                    a19 += a5;
                                }
                                if (a30 == 1) {
                                    a33 += a5;
                                }
                                a34 += a5;
                                if (a19 > 255) {
                                    a19 = 255;
                                }
                                if (a33 > 255) {
                                    a33 = 255;
                                }
                                if (a34 > 255) {
                                    a34 = 255;
                                }
                                a11[a21] = 0xFF000000 | a19 << 16 | a33 << 8 | a34;
                            }
                            ++a30;
                        }
                    }
                    float a35 = a23 + this.Field3521 * a27 * a28;
                    a22 = a24 + this.Field3521 * a27 * a29;
                    if (!(a35 < 0.0f || a35 >= (float)(a8 - 1) || a22 < 0.0f || a22 >= (float)(a9 - 1))) {
                        int a36 = (int)a22 * a8 + (int)a35;
                        int a37 = a11[a36];
                        a21 = a37 >> 16 & 0xFF;
                        a20 = a37 >> 8 & 0xFF;
                        a19 = a37 & 0xFF;
                        a20 += a5;
                        a19 += a5;
                        if ((a21 += a5) > 255) {
                            a21 = 255;
                        }
                        if (a20 > 255) {
                            a20 = 255;
                        }
                        if (a19 > 255) {
                            a19 = 255;
                        }
                        a11[a36] = 0xFF000000 | a21 << 16 | a20 << 8 | a19;
                    }
                    ++a18;
                }
                ++a17;
            }
            ++a16;
        }
        return a11;
    }

    private static int Method900(int a, float a2) {
        int a3 = a >> 16 & 0xFF;
        int a4 = a >> 8 & 0xFF;
        int a5 = a & 0xFF;
        a3 = (int)((float)a3 + a2);
        a4 = (int)((float)a4 + a2);
        a5 = (int)((float)a5 + a2);
        if (a3 > 255) {
            a3 = 255;
        }
        if (a4 > 255) {
            a4 = 255;
        }
        if (a5 > 255) {
            a5 = 255;
        }
        return 0xFF000000 | a3 << 16 | a4 << 8 | a5;
    }

    private static int Method901(int a, float a2, int a3) {
        int a4 = a >> 16 & 0xFF;
        int a5 = a >> 8 & 0xFF;
        int a6 = a & 0xFF;
        if (a3 == 2) {
            a4 = (int)((float)a4 + a2);
        } else if (a3 == 1) {
            a5 = (int)((float)a5 + a2);
        } else {
            a6 = (int)((float)a6 + a2);
        }
        if (a4 > 255) {
            a4 = 255;
        }
        if (a5 > 255) {
            a5 = 255;
        }
        if (a6 > 255) {
            a6 = 255;
        }
        return 0xFF000000 | a4 << 16 | a5 << 8 | a6;
    }

    private static float Method154(float a, float a2, float a3, float a4) {
        float a5 = 0.0f;
        float a6 = 2.0f;
        float a7 = 1.0f;
        a += 371.0f;
        a2 += 529.0f;
        for (int a8 = 0; a8 < (int)a4; ++a8) {
            a5 += Class598.Method158(a, a2, a3) / a7;
            a *= a6;
            a2 *= a6;
            a7 *= 2.0f;
        }
        float a9 = a4 - (float)((int)a4);
        if (a9 != 0.0f) {
            a5 += a9 * Class598.Method158(a, a2, a3) / a7;
        }
        return a5;
    }

    private float Method20(float a, float a2) {
        float a3 = this.Field3530 * a + this.Field3531 * this.Field3527;
        float a4 = this.Field3531 * a - this.Field3531 * this.Field3527;
        float a5 = (double)this.Field3525 == 0.0 ? Class598.Method158(a3, a2, a4) : Class783.Method154(a3, a2, a4, this.Field3525);
        return a5;
    }

    public String toString() {
        return "Texture/Caustics...";
    }
}