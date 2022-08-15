/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Date
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import awsl.Class755;
import awsl.Class771;
import awsl.Class776;
import awsl.Class798;
import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class757
extends Class798 {
    public static final int Field3303 = 0;
    public static final int Field3304 = 1;
    public static final int Field3305 = 2;
    public static final int Field3306 = 3;
    private Class755 Field3307 = new Class771();
    private float Field3308 = 0.0f;
    private float Field3309 = 0.5f;
    private float Field3310 = 0.0f;
    private int Field3311 = 8;
    private Random Field3312 = new Random();
    private long Field3313 = 567L;
    private int Field3314 = 1;
    private float Field3315 = 0.5f;
    private int Field3316 = 0;
    private boolean Field3317 = false;

    public void Method9(int a) {
        this.Field3314 = a;
    }

    public int Method10() {
        return this.Field3314;
    }

    public void Method11(int a) {
        this.Field3311 = a;
    }

    public int Method12() {
        return this.Field3311;
    }

    public void Method56(float a) {
        this.Field3309 = a;
    }

    public float Method57() {
        return this.Field3309;
    }

    public void Method58(float a) {
        this.Field3310 = a;
    }

    public float Method59() {
        return this.Field3310;
    }

    public void Method60(float a) {
        this.Field3308 = a;
    }

    public float Method61() {
        return this.Field3308;
    }

    public void Method164(float a) {
        this.Field3315 = a;
    }

    public float Method165() {
        return this.Field3315;
    }

    public void Method13(int a) {
        this.Field3316 = a;
    }

    public int Method14() {
        return this.Field3316;
    }

    public void Method87(boolean a) {
        this.Field3317 = a;
    }

    public boolean Method88() {
        return this.Field3317;
    }

    public void Method89() {
        this.Field3313 = new Date().getTime();
    }

    private float Method20(float a, float a2) {
        return a + (a2 - a) * this.Field3312.nextFloat();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected int[] Method714(int a, int a, int[] a, Rectangle a) {
        a = new int[a * a];
        this.Field3312.setSeed(this.Field3313);
        var7_6 = (float)Math.sin((double)this.Field3308);
        a = Class193.Method1270();
        a = (float)Math.cos((double)this.Field3308);
        a = 0;
        a = 0;
        if (a < a) {
            a = 0;
            if (a < a) {
                a[a] = this.Field3317 != false ? -1 : a[a];
                ++a;
                ++a;
            }
            ++a;
        }
        switch (this.Field3314) {
            case 0: {
                a = (int)(2.0f * this.Field3309 * (float)a * (float)a / (float)(this.Field3311 + 1));
                a = 0;
                if (a >= a) break;
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % a;
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % a;
                a = this.Field3312.nextInt() % this.Field3311 + 1;
                a = a[a * a + a];
                a = a - a;
                if (a < a + a + 1) {
                    if (a < a) {
                        a = this.Field3317 != false ? -1 : a[a * a + a];
                        a[a * a + a] = Class776.Method1719(this.Field3315, a, a);
                    }
                    ++a;
                }
                if ((a = a - a) < a + a + 1) {
                    if (a < a) {
                        a = this.Field3317 != false ? -1 : a[a * a + a];
                        a[a * a + a] = Class776.Method1719(this.Field3315, a, a);
                    }
                    ++a;
                }
                ++a;
            }
            case 1: {
                a = (int)(2.0f * this.Field3309 * (float)a * (float)a / 2.0f);
                a = 0;
                if (a >= a) break;
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % a;
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % a;
                a = a[a * a + a];
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % this.Field3311;
                a = (int)((float)a * a);
                a = (int)((float)a * a);
                a = a - a;
                a = a - a;
                a = a + a;
                a = a + a;
                if (a < a) {
                    a = -1;
                }
                a = 1;
                if (a < a) {
                    a = -1;
                }
                a = 1;
                a = a - a;
                a = a - a;
                a = Math.abs((int)a);
                a = Math.abs((int)a);
                a = a;
                a = a;
                if (a < a) {
                    if (a < a) {
                        a = this.Field3317 != false ? -1 : a[a * a + a];
                        a[a * a + a] = Class776.Method1719(this.Field3315, a, a);
                    }
                }
                if (Math.abs((int)a) <= Math.abs((int)a)) ** GOTO lbl94
                a = 2 * a - a;
                a = 2 * a;
                a = 2 * (a - a);
                while (a != a) {
                    a += a;
                    a += a;
                    a += a;
                    if ((a += a) >= a) continue;
                    if (a >= a) continue;
                    a = this.Field3317 != false ? -1 : a[a * a + a];
                    a[a * a + a] = Class776.Method1719(this.Field3315, a, a);
lbl94:
                    // 2 sources

                    a = 2 * a - a;
                    a = 2 * a;
                    a = 2 * (a - a);
                    while (a != a) {
                        a += a;
                        a += a;
                        a += a;
                        if ((a += a) >= a) continue;
                        if (a >= a) continue;
                        a = this.Field3317 != false ? -1 : a[a * a + a];
                        a[a * a + a] = Class776.Method1719(this.Field3315, a, a);
                        break;
                    }
                    break;
                }
                ++a;
            }
            case 2: 
            case 3: {
                a = this.Field3311 + 1;
                a = a * a;
                a = (int)(2.0f * this.Field3309 * (float)a * (float)a / (float)a);
                a = 0;
                if (a >= a) break;
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % a;
                a = (this.Field3312.nextInt() & 0x7FFFFFFF) % a;
                a = a[a * a + a];
                a = a - a;
                if (a < a + a + 1) {
                    a = a - a;
                    if (a < a + a + 1) {
                        if (this.Field3314 == 2) {
                            a = (a - a) * (a - a) + (a - a) * (a - a);
                        }
                        a = 0;
                        if (a < a) {
                            if (a < a && a <= a) {
                                a = this.Field3317 != false ? -1 : a[a * a + a];
                                a[a * a + a] = Class776.Method1719(this.Field3315, a, a);
                            }
                        }
                        ++a;
                    }
                    ++a;
                }
                ++a;
            }
        }
        return a;
    }

    public String toString() {
        return "Effects/Smear...";
    }
}