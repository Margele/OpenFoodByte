/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class267;

public class Class138 {
    byte[] Field990;
    int Field991;

    public Class138() {
        this.Field990 = new byte[64];
    }

    public Class138(int a) {
        this.Field990 = new byte[a];
    }

    public Class138 Method485(int a) {
        int a2 = this.Field991;
        if (a2 + 1 > this.Field990.length) {
            this.Method494(1);
        }
        this.Field990[a2++] = (byte)a;
        this.Field991 = a2;
        return this;
    }

    Class138 Method486(int a, int a2) {
        int a3 = this.Field991;
        if (a3 + 2 > this.Field990.length) {
            this.Method494(2);
        }
        byte[] a4 = this.Field990;
        a4[a3++] = (byte)a;
        a4[a3++] = (byte)a2;
        this.Field991 = a3;
        return this;
    }

    public Class138 Method487(int a) {
        int a2 = this.Field991;
        if (a2 + 2 > this.Field990.length) {
            this.Method494(2);
        }
        byte[] a3 = this.Field990;
        a3[a2++] = (byte)(a >>> 8);
        a3[a2++] = (byte)a;
        this.Field991 = a2;
        return this;
    }

    Class138 Method488(int a, int a2) {
        int a3 = this.Field991;
        if (a3 + 3 > this.Field990.length) {
            this.Method494(3);
        }
        byte[] a4 = this.Field990;
        a4[a3++] = (byte)a;
        a4[a3++] = (byte)(a2 >>> 8);
        a4[a3++] = (byte)a2;
        this.Field991 = a3;
        return this;
    }

    public Class138 Method489(int a) {
        int a2 = this.Field991;
        if (a2 + 4 > this.Field990.length) {
            this.Method494(4);
        }
        byte[] a3 = this.Field990;
        a3[a2++] = (byte)(a >>> 24);
        a3[a2++] = (byte)(a >>> 16);
        a3[a2++] = (byte)(a >>> 8);
        a3[a2++] = (byte)a;
        this.Field991 = a2;
        return this;
    }

    public Class138 Method490(long a) {
        int a2 = this.Field991;
        if (a2 + 8 > this.Field990.length) {
            this.Method494(8);
        }
        byte[] a3 = this.Field990;
        int a4 = (int)(a >>> 32);
        a3[a2++] = (byte)(a4 >>> 24);
        a3[a2++] = (byte)(a4 >>> 16);
        a3[a2++] = (byte)(a4 >>> 8);
        a3[a2++] = (byte)a4;
        a4 = (int)a;
        a3[a2++] = (byte)(a4 >>> 24);
        a3[a2++] = (byte)(a4 >>> 16);
        a3[a2++] = (byte)(a4 >>> 8);
        a3[a2++] = (byte)a4;
        this.Field991 = a2;
        return this;
    }

    public Class138 Method491(String a) {
        int a2 = a.length();
        if (a2 > 65535) {
            throw new IllegalArgumentException();
        }
        int a3 = this.Field991;
        if (a3 + 2 + a2 > this.Field990.length) {
            this.Method494(2 + a2);
        }
        byte[] a4 = this.Field990;
        a4[a3++] = (byte)(a2 >>> 8);
        a4[a3++] = (byte)a2;
        for (int a5 = 0; a5 < a2; ++a5) {
            char a6 = a.charAt(a5);
            if (a6 < '\u0001' || a6 > '\u007f') {
                this.Field991 = a3;
                return this.Method492(a, a5, 65535);
            }
            a4[a3++] = (byte)a6;
        }
        this.Field991 = a3;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    Class138 Method492(String a, int a2, int a3) {
        void a4;
        char a5;
        void a6;
        int n = a.length();
        int n2 = a2;
        String[] a7 = Class267.Method2862();
        int a8 = a2;
        if (a8 < a6) {
            a5 = a.charAt(a8);
            if (a5 >= '\u0001' && a5 <= '\u007f') {
                ++a4;
            }
            if (a5 > '\u07ff') {
                a4 += 3;
            }
            a4 += 2;
            ++a8;
        }
        if (a4 > a3) {
            throw new IllegalArgumentException();
        }
        a8 = this.Field991 - a2 - 2;
        this.Field990[a8] = (byte)(a4 >>> 8);
        this.Field990[a8 + 1] = (byte)a4;
        if (this.Field991 + a4 - a2 > this.Field990.length) {
            this.Method494((int)(a4 - a2));
        }
        int a9 = this.Field991;
        int a10 = a2;
        if (a10 < a6) {
            a5 = a.charAt(a10);
            if (a5 >= '\u0001' && a5 <= '\u007f') {
                this.Field990[a9++] = (byte)a5;
            }
            if (a5 > '\u07ff') {
                this.Field990[a9++] = (byte)(0xE0 | a5 >> 12 & 0xF);
                this.Field990[a9++] = (byte)(0x80 | a5 >> 6 & 0x3F);
                this.Field990[a9++] = (byte)(0x80 | a5 & 0x3F);
            }
            this.Field990[a9++] = (byte)(0xC0 | a5 >> 6 & 0x1F);
            this.Field990[a9++] = (byte)(0x80 | a5 & 0x3F);
            ++a10;
        }
        this.Field991 = a9;
        return this;
    }

    public Class138 Method493(byte[] a, int a2, int a3) {
        if (this.Field991 + a3 > this.Field990.length) {
            this.Method494(a3);
        }
        System.arraycopy((Object)a, (int)a2, (Object)this.Field990, (int)this.Field991, (int)a3);
        this.Field991 += a3;
        return this;
    }

    private void Method494(int a) {
        int a2 = 2 * this.Field990.length;
        int a3 = this.Field991 + a;
        byte[] a4 = new byte[a2 > a3 ? a2 : a3];
        System.arraycopy((Object)this.Field990, (int)0, (Object)a4, (int)0, (int)this.Field991);
        this.Field990 = a4;
    }

    private static IllegalArgumentException Method495(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}