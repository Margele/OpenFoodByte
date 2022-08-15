/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class755;
import awsl.Class767;
import awsl.Class771;
import awsl.Class776;
import awsl.Class798;
import java.awt.Rectangle;

public class Class762
extends Class798 {
    public static final int Field3342 = 0;
    public static final int Field3343 = 1;
    public static final int Field3344 = 2;
    public static final int Field3345 = 3;
    private float Field3346 = 1.0f;
    protected Class755 Field3347 = new Class771();
    private boolean Field3348 = true;
    private boolean Field3349 = false;
    private boolean Field3350 = false;
    private int Field3351;
    private static final int Field3352 = 41;
    private static final int Field3353 = (int)(41.0 * Math.sqrt((double)2.0));
    private static final int Field3354 = (int)(41.0 * Math.sqrt((double)5.0));

    public void Method56(float a) {
        this.Field3346 = a;
    }

    public float Method57() {
        return this.Field3346;
    }

    public void Method176(Class755 a) {
        this.Field3347 = a;
    }

    public Class755 Method177() {
        return this.Field3347;
    }

    public void Method87(boolean a) {
        this.Field3348 = a;
    }

    public boolean Method88() {
        return this.Field3348;
    }

    public void Method9(int a) {
        this.Field3351 = a;
    }

    public int Method10() {
        return this.Field3351;
    }

    public void Method1282(boolean a) {
        this.Field3349 = a;
    }

    public boolean Method1283() {
        return this.Field3349;
    }

    public void Method1770(boolean a) {
        this.Field3350 = a;
    }

    public boolean Method1771() {
        return this.Field3350;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int[] a5 = new int[a * a2];
        this.Method1615(a3, a5, a, a2);
        int a6 = this.Method1772(a5, a, a2);
        this.Method1773(a5, a3, a, a2, a6);
        return a3;
    }

    public int Method1772(int[] a, int a2, int a3) {
        int a4;
        int a5;
        int a6;
        int a7;
        int a8 = a2 - 3;
        int a9 = a3 - 3;
        int a10 = 0;
        for (a7 = 0; a7 < a3; ++a7) {
            for (a6 = 0; a6 < a2; ++a6) {
                a5 = a6 + a7 * a2;
                if (a[a5] <= 0 || (a4 = a6 < 2 || a6 > a8 || a7 < 2 || a7 > a9 ? this.Method1774(a6, a7, a, a2, a5, a8, a9) : this.Method1775(a, a2, a5)) <= a10) continue;
                a10 = a4;
            }
        }
        a7 = a3 - 1;
        a6 = a2 - 1;
        while (true) {
            a5 = a6 + a7 * a2;
            if (a[a5] > 0 && (a4 = a6 < 2 || a6 > a8 || a7 < 2 || a7 > a9 ? this.Method1774(a6, a7, a, a2, a5, a8, a9) : this.Method1775(a, a2, a5)) > a10) {
                a10 = a4;
            }
            --a6;
        }
    }

    private void Method1615(int[] a, int[] a2, int a3, int a4) {
        for (int a5 = 0; a5 < a4; ++a5) {
            for (int a6 = 0; a6 < a3; ++a6) {
                int a7 = a6 + a5 * a3;
                int a8 = this.Field3348 ? a[a7] >> 24 & 0xFF : Class767.Method1689(a[a7]);
                a2[a7] = a8 * 41 / 10;
            }
        }
    }

    private void Method1773(int[] a, int[] a2, int a3, int a4, int a5) {
        boolean a6 = Class193.Method1270();
        a5 = 1;
        int a7 = 0;
        if (a7 < a4) {
            int a8 = 0;
            if (a8 < a3) {
                int a9 = a8 + a7 * a3;
                int a10 = a[a9];
                float a11 = 0.0f;
                int a12 = 0;
                int a13 = 0;
                int a14 = 0;
                int a15 = 0;
                a15 = 0;
                a14 = 0;
                a13 = 0;
                a12 = 0;
                a12 = a2[a9] >> 24 & 0xFF;
                a11 = Class776.Method1711(this.Field3346 * (float)a10 / (float)a5, 0.0f, 1.0f);
                switch (this.Field3351) {
                    case 1: {
                        a11 = Class776.Method1709(a11);
                    }
                    case 2: {
                        a11 = Class776.Method1710(a11);
                    }
                    case 3: {
                        a11 = Class776.Method1708(0.0f, 1.0f, a11);
                    }
                }
                if (this.Field3347 == null) {
                    a14 = a15 = (int)(a11 * 255.0f);
                    a13 = a15;
                }
                int a16 = this.Field3347.Method283(a11);
                a13 = a16 >> 16 & 0xFF;
                a14 = a16 >> 8 & 0xFF;
                a15 = a16 & 0xFF;
                int n = a12 = this.Field3348 ? a2[a9] >> 24 & 0xFF : Class767.Method1689(a2[a9]);
                if (this.Field3349) {
                    a13 = 255 - a13;
                    a14 = 255 - a14;
                    a15 = 255 - a15;
                }
                if (this.Field3350) {
                    a16 = 255;
                    int a17 = a2[a9];
                    int a18 = (a17 & 0xFF000000) >> 24;
                    int a19 = (a17 & 0xFF0000) >> 16;
                    int a20 = (a17 & 0xFF00) >> 8;
                    int a21 = a17 & 0xFF;
                    a19 = a13 * a19 / a16;
                    a20 = a14 * a20 / a16;
                    a21 = a15 * a21 / a16;
                    a19 = 0;
                    if (a19 > 255) {
                        a19 = 255;
                    }
                    if ((a20 = 0) > 255) {
                        a20 = 255;
                    }
                    if ((a21 = 0) > 255) {
                        a21 = 255;
                    }
                    a2[a9] = a18 << 24 | a19 << 16 | a20 << 8 | a21;
                }
                a2[a9] = a12 << 24 | a13 << 16 | a14 << 8 | a15;
                ++a8;
            }
            ++a7;
        }
    }

    private int Method1774(int a, int a2, int[] a3, int a4, int a5, int a6, int a7) {
        int a8 = a5 - a4 - a4 - 2;
        int a9 = a8 + a4;
        int a10 = a9 + a4;
        int a11 = a10 + a4;
        int a12 = a11 + a4;
        if (a2 == a7 + 2 || a == a6 + 2) {
            a3[a5] = 41;
            return 41;
        }
        int a13 = a3[a10 + 1] + 41;
        a13 = a3[a9 + 2] + 41;
        int a14 = a13;
        if (a13 < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a10 + 3] + 41) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a11 + 2] + 41) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a9 + 1] + Field3353) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a9 + 3] + Field3353) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a11 + 1] + Field3353) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a11 + 3] + Field3353) < a14) {
            a14 = a13;
        }
        if (a2 == 1 || a == 1 || a2 == a7 + 1 || a == a6 + 1) {
            a3[a5] = a14;
            return a3[a5];
        }
        a13 = a3[a8 + 1] + Field3354;
        if (a13 < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a8 + 3] + Field3354) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a9 + 4] + Field3354) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a11 + 4] + Field3354) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a12 + 3] + Field3354) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a12 + 1] + Field3354) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a11] + Field3354) < a14) {
            a14 = a13;
        }
        if ((a13 = a3[a9] + Field3354) < a14) {
            a14 = a13;
        }
        a3[a5] = a14;
        return a3[a5];
    }

    private int Method1775(int[] a, int a2, int a3) {
        int a4 = a3 - a2 - a2 - 2;
        int a5 = a4 + a2;
        int a6 = a5 + a2;
        int a7 = a6 + a2;
        int a8 = a7 + a2;
        int a9 = a[a6 + 1] + 41;
        a9 = a[a5 + 2] + 41;
        int a10 = a9;
        if (a9 < a10) {
            a10 = a9;
        }
        if ((a9 = a[a6 + 3] + 41) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a7 + 2] + 41) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a5 + 1] + Field3353) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a5 + 3] + Field3353) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a7 + 1] + Field3353) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a7 + 3] + Field3353) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a4 + 1] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a4 + 3] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a5 + 4] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a7 + 4] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a8 + 3] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a8 + 1] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a7] + Field3354) < a10) {
            a10 = a9;
        }
        if ((a9 = a[a5] + Field3354) < a10) {
            a10 = a9;
        }
        a[a3] = a10;
        return a[a3];
    }

    public String toString() {
        return "Stylize/Shapeburst...";
    }
}