/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 *  java.util.Vector
 */
package awsl;

import awsl.Class193;
import awsl.Class764;
import awsl.Class766;
import java.util.Vector;

public class Class765
implements Class766 {
    static final int Field3391 = 5;
    private int Field3392 = 0;
    private Class764 Field3393;
    private int Field3394;
    private int Field3395;
    private int Field3396 = 0;
    private Vector[] Field3397;

    public Class765() {
        this.Method1781(256);
        this.Field3397 = new Vector[6];
        for (int a = 0; a < 6; ++a) {
            this.Field3397[a] = new Vector();
        }
        this.Field3393 = new Class764(this);
    }

    @Override
    public void Method1781(int a) {
        this.Field3395 = a;
        this.Field3394 = Math.max((int)512, (int)(a * 2));
    }

    @Override
    public void Method1782(int[] a, int a2, int a3) {
        for (int a4 = 0; a4 < a3; ++a4) {
            this.Method1785(a[a4 + a2]);
            if (this.Field3396 <= this.Field3394) continue;
            this.Method1786(this.Field3394);
        }
    }

    @Override
    public int Method1784(int a) {
        int a2 = a >> 16 & 0xFF;
        int a3 = a >> 8 & 0xFF;
        int a4 = a & 0xFF;
        Class764 a5 = this.Field3393;
        int a6 = 0;
        if (a6 <= 5) {
            int a7 = 128 >> a6;
            int a8 = 0;
            if ((a2 & a7) != 0) {
                a8 += 4;
            }
            if ((a3 & a7) != 0) {
                a8 += 2;
            }
            if ((a4 & a7) != 0) {
                ++a8;
            }
            Class764 a9 = a5.Field3383[a8];
            return a5.Field3389;
        }
        System.out.println("getIndexForColor failed");
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private void Method1785(int a) {
        int n = a >> 16 & 0xFF;
        int n2 = a >> 8 & 0xFF;
        boolean a2 = Class193.Method1270();
        int a3 = a & 0xFF;
        Class764 a4 = this.Field3393;
        int a5 = 0;
        if (a5 <= 5) {
            void a6;
            void a7;
            int a8 = 128 >> a5;
            int a9 = 0;
            if ((a7 & a8) != 0) {
                a9 += 4;
            }
            if ((a6 & a8) != 0) {
                a9 += 2;
            }
            if ((a3 & a8) != 0) {
                ++a9;
            }
            Class764 a10 = a4.Field3383[a9];
            ++a4.Field3380;
            a10 = new Class764(this);
            a10.Field3382 = a4;
            a4.Field3383[a9] = a10;
            a4.Field3384 = false;
            ++this.Field3392;
            this.Field3397[a5].addElement((Object)a10);
            if (a5 == 5) {
                a10.Field3384 = true;
                a10.Field3385 = 1;
                a10.Field3386 = a7;
                a10.Field3387 = a6;
                a10.Field3388 = a3;
                a10.Field3381 = a5;
                ++this.Field3396;
                return;
            }
            a4 = a10;
            if (a10.Field3384) {
                ++a10.Field3385;
                a10.Field3386 += a7;
                a10.Field3387 += a6;
                a10.Field3388 += a3;
                return;
            }
            a4 = a10;
            ++a5;
        }
        System.out.println("insertColor failed");
    }

    private void Method1786(int a) {
        int a2;
        int a3 = 4;
        boolean a4 = Class193.Method1269();
        Vector a5 = this.Field3397[a3];
        if (a5.size() > 0 && (a2 = 0) < a5.size()) {
            Class764 a6 = (Class764)a5.elementAt(a2);
            if (a6.Field3380 > 0) {
                int a7 = 0;
                if (a7 < 8) {
                    Class764 a8 = a6.Field3383[a7];
                    if (!a8.Field3384) {
                        System.out.println("not a leaf!");
                    }
                    a6.Field3385 += a8.Field3385;
                    a6.Field3386 += a8.Field3386;
                    a6.Field3387 += a8.Field3387;
                    a6.Field3388 += a8.Field3388;
                    a6.Field3383[a7] = null;
                    --a6.Field3380;
                    --this.Field3396;
                    --this.Field3392;
                    this.Field3397[a3 + 1].removeElement((Object)a8);
                    ++a7;
                }
                a6.Field3384 = true;
                ++this.Field3396;
                if (this.Field3396 <= a) {
                    return;
                }
            }
            ++a2;
        }
        --a3;
        System.out.println("Unable to reduce the OctTree");
    }

    @Override
    public int[] Method1783() {
        int[] a = new int[this.Field3396];
        this.Method1788(this.Field3393, a, 0);
        return a;
    }

    public void Method1787(int[] a, int[] a2) {
        int a3 = a.length;
        this.Field3395 = a2.length;
        for (int a4 = 0; a4 < a3; ++a4) {
            this.Method1785(a[a4]);
            if (this.Field3396 <= this.Field3394) continue;
            this.Method1786(this.Field3394);
        }
        if (this.Field3396 > this.Field3395) {
            this.Method1786(this.Field3395);
        }
        this.Method1788(this.Field3393, a2, 0);
    }

    private int Method1788(Class764 a, int[] a2, int a3) {
        if (this.Field3396 > this.Field3395) {
            this.Method1786(this.Field3395);
        }
        if (a.Field3384) {
            int a4 = a.Field3385;
            a2[a3] = 0xFF000000 | a.Field3386 / a4 << 16 | a.Field3387 / a4 << 8 | a.Field3388 / a4;
            a.Field3389 = a3++;
        } else {
            for (int a5 = 0; a5 < 8; ++a5) {
                if (a.Field3383[a5] == null) continue;
                a.Field3389 = a3;
                a3 = this.Method1788(a.Field3383[a5], a2, a3);
            }
        }
        return a3;
    }
}