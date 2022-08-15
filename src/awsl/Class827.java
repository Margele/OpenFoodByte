/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Date
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import awsl.Class755;
import awsl.Class767;
import awsl.Class771;
import awsl.Class798;
import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class827
extends Class798 {
    public float Field3668 = 1.0f;
    private float Field3669 = 0.0f;
    private Class755 Field3670 = new Class771();
    private Random Field3671 = new Random();
    private long Field3672 = 567L;
    private boolean Field3673 = false;
    private boolean Field3674 = false;

    public void Method56(float a) {
        this.Field3668 = a;
    }

    public float Method57() {
        return this.Field3668;
    }

    public void Method58(float a) {
        this.Field3669 = a;
    }

    public float Method59() {
        return this.Field3669;
    }

    public void Method176(Class755 a) {
        this.Field3670 = a;
    }

    public Class755 Method177() {
        return this.Field3670;
    }

    public void Method87(boolean a) {
        this.Field3673 = a;
    }

    public boolean Method88() {
        return this.Field3673;
    }

    public void Method1282(boolean a) {
        this.Field3674 = a;
    }

    public boolean Method1283() {
        return this.Field3674;
    }

    public void Method9(int a) {
        this.Field3672 = a;
    }

    public int Method10() {
        return (int)this.Field3672;
    }

    public void Method89() {
        this.Field3672 = new Date().getTime();
    }

    private int Method1772(int[] a, int a2, int a3) {
        if (this.Field3674) {
            return a[a3 * this.Field3569.width + a2];
        }
        int a4 = (int)(255.0f * this.Field3671.nextFloat());
        int a5 = (int)(255.0f * this.Field3671.nextFloat());
        int a6 = (int)(255.0f * this.Field3671.nextFloat());
        return 0xFF000000 | a4 << 16 | a5 << 8 | a6;
    }

    private int Method900(int a, float a2) {
        int a3 = a >> 16 & 0xFF;
        int a4 = a >> 8 & 0xFF;
        int a5 = a & 0xFF;
        a3 = Class767.Method1687(a3 + (int)((double)a2 * ((double)this.Field3671.nextFloat() - 0.5)));
        a4 = Class767.Method1687(a4 + (int)((double)a2 * ((double)this.Field3671.nextFloat() - 0.5)));
        a5 = Class767.Method1687(a5 + (int)((double)a2 * ((double)this.Field3671.nextFloat() - 0.5)));
        return 0xFF000000 | a3 << 16 | a4 << 8 | a5;
    }

    private int Method1614(int a, int a2) {
        return Class767.Method1691(a, a2, 13);
    }

    private int Method3633(int a, int a2, int[] a3, int a4) {
        return a3[a2 * a4 + a];
    }

    private void Method3634(int a, int a2, int a3, int[] a4, int a5) {
        a4[a2 * a5 + a] = a3;
    }

    private boolean Method3635(int a, int a2, int a3, int a4, int[] a5, int a6, int a7, int a8) {
        int a9 = this.Method3633(a, a2, a5, a6);
        int a10 = this.Method3633(a, a4, a5, a6);
        int a11 = this.Method3633(a3, a2, a5, a6);
        int a12 = this.Method3633(a3, a4, a5, a6);
        float a13 = 256.0f / (2.0f * (float)a8) * this.Field3668;
        int a14 = (a + a3) / 2;
        int a15 = (a2 + a4) / 2;
        if (a14 == a && a14 == a3 && a15 == a2 && a15 == a4) {
            return true;
        }
        if (a14 != a || a14 != a3) {
            int a16 = this.Method1614(a9, a10);
            a16 = this.Method900(a16, a13);
            this.Method3634(a, a15, a16, a5, a6);
            if (a != a3) {
                int a17 = this.Method1614(a11, a12);
                a17 = this.Method900(a17, a13);
                this.Method3634(a3, a15, a17, a5, a6);
            }
        }
        if (a15 != a2 || a15 != a4) {
            if (a != a14 || a15 != a4) {
                int a18 = this.Method1614(a10, a12);
                a18 = this.Method900(a18, a13);
                this.Method3634(a14, a4, a18, a5, a6);
            }
            if (a2 != a4) {
                int a19 = this.Method1614(a9, a11);
                a19 = this.Method900(a19, a13);
                this.Method3634(a14, a2, a19, a5, a6);
            }
        }
        if (a2 != a4 || a != a3) {
            int a20 = this.Method1614(a9, a12);
            int a21 = this.Method1614(a10, a11);
            a20 = this.Method1614(a20, a21);
            a20 = this.Method900(a20, a13);
            this.Method3634(a14, a15, a20, a5, a6);
        }
        return a3 - a >= 3 || a4 - a2 >= 3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        void a6;
        int[] nArray = new int[a * a2];
        boolean bl = Class193.Method1269();
        this.Field3671.setSeed(this.Field3672);
        int n = a - 1;
        boolean a7 = bl;
        int a8 = a2 - 1;
        this.Method3634(0, 0, this.Method1772(a3, 0, 0), (int[])a6, a);
        this.Method3634((int)a5, 0, this.Method1772(a3, (int)a5, 0), (int[])a6, a);
        this.Method3634(0, a8, this.Method1772(a3, 0, a8), (int[])a6, a);
        this.Method3634((int)a5, a8, this.Method1772(a3, (int)a5, a8), (int[])a6, a);
        this.Method3634((int)(a5 / 2), a8 / 2, this.Method1772(a3, (int)(a5 / 2), a8 / 2), (int[])a6, a);
        this.Method3634(0, a8 / 2, this.Method1772(a3, 0, a8 / 2), (int[])a6, a);
        this.Method3634((int)a5, a8 / 2, this.Method1772(a3, (int)a5, a8 / 2), (int[])a6, a);
        this.Method3634((int)(a5 / 2), 0, this.Method1772(a3, (int)(a5 / 2), 0), (int[])a6, a);
        this.Method3634((int)(a5 / 2), a8, this.Method1772(a3, (int)(a5 / 2), a8), (int[])a6, a);
        int a9 = 1;
        if (this.Method3635(0, 0, a - 1, a2 - 1, (int[])a6, a, a9, 0)) {
            ++a9;
        }
        if (this.Field3673 && this.Field3670 != null) {
            int a10 = 0;
            int a11 = 0;
            if (a11 < a2) {
                int a12 = 0;
                if (a12 < a) {
                    a6[a10] = this.Field3670.Method283((float)(a6[a10] & 0xFF) / 255.0f);
                    ++a10;
                    ++a12;
                }
                ++a11;
            }
        }
        return a6;
    }

    public String toString() {
        return "Texture/Plasma...";
    }
}