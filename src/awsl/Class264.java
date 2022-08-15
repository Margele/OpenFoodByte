/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class138;
import awsl.Class250;
import awsl.Class267;
import awsl.Class276;
import awsl.Class9;

public class Class264 {
    static final int Field1435 = 1;
    static final int Field1436 = 2;
    static final int Field1437 = 4;
    static final int Field1438 = 8;
    static final int Field1439 = 16;
    static final int Field1440 = 32;
    static final int Field1441 = 64;
    static final int Field1442 = 128;
    static final int Field1443 = 256;
    static final int Field1444 = 512;
    static final int Field1445 = 1024;
    static final int Field1446 = 2048;
    public Object Field1447;
    int Field1448;
    int Field1449;
    int Field1450;
    private int Field1451;
    private int[] Field1452;
    int Field1453;
    int Field1454;
    Class276 Field1455;
    Class264 Field1456;
    Class250 Field1457;
    Class264 Field1458;

    public int Method2850() {
        if ((this.Field1448 & 2) == 0) {
            throw new IllegalStateException("Label offset position has not been resolved yet");
        }
        return this.Field1450;
    }

    void Method2851(Class9 a, Class138 a2, int a3, boolean a4) {
        if ((this.Field1448 & 2) == 0) {
            this.Method2852(-1 - a3, a2.Field991);
            a2.Method489(-1);
        } else {
            a2.Method489(this.Field1450 - a3);
        }
    }

    private void Method2852(int a, int a2) {
        if (this.Field1452 == null) {
            this.Field1452 = new int[6];
        }
        if (this.Field1451 >= this.Field1452.length) {
            int[] a3 = new int[this.Field1452.length + 6];
            System.arraycopy((Object)this.Field1452, (int)0, (Object)a3, (int)0, (int)this.Field1452.length);
            this.Field1452 = a3;
        }
        this.Field1452[this.Field1451++] = a;
        this.Field1452[this.Field1451++] = a2;
    }

    boolean Method2853(Class9 a, int a2, byte[] a3) {
        boolean a4 = false;
        this.Field1448 |= 2;
        this.Field1450 = a2;
        int a5 = 0;
        while (a5 < this.Field1451) {
            int a6 = this.Field1452[a5++];
            int a7 = this.Field1452[a5++];
            int a8 = a2 - a6;
            if (a8 < Short.MIN_VALUE || a8 > Short.MAX_VALUE) {
                int a9 = a3[a7 - 1] & 0xFF;
                a3[a7 - 1] = a9 <= 168 ? (byte)(a9 + 49) : (byte)(a9 + 20);
                a4 = true;
            }
            a3[a7++] = (byte)(a8 >>> 8);
            a3[a7] = (byte)a8;
        }
        return a4;
    }

    Class264 Method2854() {
        return this.Field1455 == null ? this : this.Field1455.Field1504;
    }

    boolean Method2855(long a) {
        if ((this.Field1448 & 0x400) != 0) {
            return (this.Field1452[(int)(a >>> 32)] & (int)a) != 0;
        }
        return false;
    }

    boolean Method2856(Class264 a) {
        if ((this.Field1448 & 0x400) == 0 || (a.Field1448 & 0x400) == 0) {
            return false;
        }
        for (int a2 = 0; a2 < this.Field1452.length; ++a2) {
            if ((this.Field1452[a2] & a.Field1452[a2]) == 0) continue;
            return true;
        }
        return false;
    }

    void Method2857(long a, int a2) {
        if ((this.Field1448 & 0x400) == 0) {
            this.Field1448 |= 0x400;
            this.Field1452 = new int[a2 / 32 + 1];
        }
        int n = (int)(a >>> 32);
        this.Field1452[n] = this.Field1452[n] | (int)a;
    }

    void Method2858(Class264 a, long a2, int a3) {
        Class250 a4;
        Class264 a5;
        Class264 class264 = this;
        String[] a6 = Class267.Method2862();
        void a7 = a5;
        a5 = a7.Field1458;
        a7.Field1458 = null;
        if ((a7.Field1448 & 0x800) != 0) {
        }
        a7.Field1448 |= 0x800;
        if ((a7.Field1448 & 0x100) != 0 && !a7.Method2856(a)) {
            a4 = new Class250();
            a4.Field1384 = a7.Field1453;
            a4.Field1385 = a.Field1457.Field1385;
            a4.Field1386 = a7.Field1457;
            a7.Field1457 = a4;
            if (a7.Method2855(a2)) {
            }
            a7.Method2857(a2, a3);
        }
        a4 = a7.Field1457;
        if (((a7.Field1448 & 0x80) == 0 || a4 != a7.Field1457.Field1386) && a4.Field1385.Field1458 == null) {
            a4.Field1385.Field1458 = a5;
            a5 = a4.Field1385;
        }
        a4 = a4.Field1386;
    }

    public String Method2859() {
        return "L" + System.identityHashCode((Object)this);
    }

    private static IllegalStateException Method2860(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}