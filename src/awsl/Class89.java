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

import awsl.Class187;
import awsl.Class193;
import awsl.Class755;
import awsl.Class767;
import awsl.Class771;
import java.awt.image.BufferedImage;

public class Class89
extends Class193 {
    private float Field763 = 1.0f;
    private int Field764 = 5;
    private float Field765 = 0.0f;
    private float Field766 = 0.1f;
    private boolean Field767 = false;
    private Class755 Field768 = new Class771(-1, -16777216);

    public void Method56(float a) {
        this.Field763 = a;
    }

    public float Method57() {
        return this.Field763;
    }

    public void Method58(float a) {
        this.Field766 = a;
    }

    public float Method59() {
        return this.Field766;
    }

    public void Method9(int a) {
        this.Field764 = a;
    }

    public int Method10() {
        return this.Field764;
    }

    public void Method60(float a) {
        this.Field765 = a;
    }

    public float Method61() {
        return this.Field765;
    }

    public void Method87(boolean a) {
        this.Field767 = a;
    }

    public boolean Method88() {
        return this.Field767;
    }

    public void Method176(Class755 a) {
        this.Field768 = a;
    }

    public Class755 Method177() {
        return this.Field768;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        void a12;
        int n = a.getWidth();
        int a13 = a.getHeight();
        int[] a14 = new int[a12];
        int a15 = (int)((float)this.Field764 / 1.414f);
        int[] a16 = new int[this.Field764 + 1];
        int[] nArray = new int[a15 + 1];
        boolean a17 = Class193.Method1270();
        if (this.Field768 != null) {
            int a18 = 0;
            if (a18 <= this.Field764) {
                a11 = this.Field768.Method283((float)a18 / (float)this.Field764);
                a10 = a11 >> 16 & 0xFF;
                a9 = a11 >> 8 & 0xFF;
                a8 = a11 & 0xFF;
                a16[a18] = a11 = a11 & 0xFF000000 | (int)(this.Field766 * (float)a10) << 16 | (int)(this.Field766 * (float)a9) << 8 | (int)(this.Field766 * (float)a8);
                ++a18;
            }
            if ((a18 = 0) <= a15) {
                a11 = this.Field768.Method283((float)a18 / (float)a15);
                a10 = a11 >> 16 & 0xFF;
                a9 = a11 >> 8 & 0xFF;
                a8 = a11 & 0xFF;
                a20[a18] = a11 = a11 & 0xFF000000 | (int)(this.Field766 * (float)a10) << 16 | (int)(this.Field766 * (float)a9) << 8 | (int)(this.Field766 * (float)a8);
                ++a18;
            }
        }
        BufferedImage a19 = new BufferedImage((int)a12, a13, 2);
        a11 = (int)(this.Field763 * 3.0f * 255.0f);
        a10 = 0;
        if (a10 < a13) {
            this.Method104(a, 0, a10, (int)a12, 1, a14);
            a9 = 0;
            if (a9 < a12) {
                a8 = a14[a9];
                a7 = a8 & 0xFF000000;
                a6 = a8 >> 16 & 0xFF;
                a5 = a8 >> 8 & 0xFF;
                a4 = a8 & 0xFF;
                a3 = a6 + a5 + a4;
                if (a3 < a11) {
                    a14[a9] = -16777216;
                }
                a14[a9] = a7 | (a3 /= 3) << 16 | a3 << 8 | a3;
                ++a9;
            }
            this.Method1267(a19, 0, a10, (int)a12, 1, a14);
            ++a10;
        }
        if (this.Field765 != 0.0f) {
            a19 = new Class187(this.Field765).Method62(a19, null);
        }
        a2 = this.Method1263(a, null);
        int[] a22 = this.Field767 ? new int[a12 * a13] : this.Method104(a, 0, 0, (int)a12, a13, null);
        a9 = 0;
        if (a9 < a13) {
            a8 = a9 * a12;
            this.Method104(a19, 0, a9, (int)a12, 1, a14);
            a7 = Math.max((int)(a9 - this.Field764), (int)0) - a9;
            a6 = Math.min((int)(a9 + this.Field764), (int)(a13 - 1)) - a9;
            a5 = Math.max((int)(a9 - a15), (int)0) - a9;
            a4 = Math.min((int)(a9 + a15), (int)(a13 - 1)) - a9;
            a3 = 0;
            if (a3 < a12) {
                if ((float)(a14[a3] & 0xFF) > this.Field763 * 255.0f) {
                    void a20;
                    int a21 = Math.max((int)(a3 - this.Field764), (int)0) - a3;
                    int a23 = Math.min((int)(a3 + this.Field764), (int)(a12 - true)) - a3;
                    int a24 = Math.max((int)(a3 - a15), (int)0) - a3;
                    int a25 = Math.min((int)(a3 + a15), (int)(a12 - true)) - a3;
                    int a26 = 0;
                    int a27 = 0;
                    if (a26 <= a23) {
                        a22[a8 + a26] = Class767.Method1691(a22[a8 + a26], a16[a27], 4);
                        ++a26;
                        ++a27;
                    }
                    a26 = -1;
                    a27 = 1;
                    if (a26 >= a21) {
                        a22[a8 + a26] = Class767.Method1691(a22[a8 + a26], a16[a27], 4);
                        --a26;
                        ++a27;
                    }
                    a26 = 1;
                    a27 = a8 + a12;
                    int a28 = 0;
                    if (a26 <= a6) {
                        a22[a27] = Class767.Method1691(a22[a27], a16[a28], 4);
                        ++a26;
                        a27 += a12;
                        ++a28;
                    }
                    a26 = -1;
                    a27 = a8 - a12;
                    a28 = 0;
                    if (a26 >= a7) {
                        a22[a27] = Class767.Method1691(a22[a27], a16[a28], 4);
                        --a26;
                        a27 -= a12;
                        ++a28;
                    }
                    a26 = Math.max((int)a24, (int)a5);
                    a27 = Math.min((int)a25, (int)a4);
                    a28 = Math.min((int)a25, (int)a4);
                    int a29 = 1;
                    int a30 = a8 + a12 + 1;
                    int a31 = 0;
                    if (a29 <= a28) {
                        a22[a30] = Class767.Method1691(a22[a30], (int)a20[a31], 4);
                        ++a29;
                        a30 += a12 + true;
                        ++a31;
                    }
                    a28 = Math.min((int)(-a24), (int)(-a5));
                    a29 = 1;
                    a30 = a8 - a12 - 1;
                    a31 = 0;
                    if (a29 <= a28) {
                        a22[a30] = Class767.Method1691(a22[a30], (int)a20[a31], 4);
                        ++a29;
                        a30 -= a12 + true;
                        ++a31;
                    }
                    a28 = Math.min((int)a25, (int)(-a5));
                    a29 = 1;
                    a30 = a8 - a12 + 1;
                    a31 = 0;
                    if (a29 <= a28) {
                        a22[a30] = Class767.Method1691(a22[a30], (int)a20[a31], 4);
                        ++a29;
                        a30 += -a12 + true;
                        ++a31;
                    }
                    a28 = Math.min((int)(-a24), (int)a4);
                    a29 = 1;
                    a30 = a8 + a12 - 1;
                    a31 = 0;
                    if (a29 <= a28) {
                        a22[a30] = Class767.Method1691(a22[a30], (int)a20[a31], 4);
                        ++a29;
                        a30 += a12 - true;
                        ++a31;
                    }
                }
                ++a8;
                ++a3;
            }
            ++a9;
        }
        this.Method1267(a2, 0, 0, (int)a12, a13, a22);
        return a2;
    }

    public String toString() {
        return "Effects/Glint...";
    }
}