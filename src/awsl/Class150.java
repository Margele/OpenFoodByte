/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 */
package awsl;

import awsl.Class138;
import awsl.Class148;
import awsl.Class169;
import awsl.Class261;
import awsl.Class267;
import awsl.Class31;
import awsl.Class46;

final class Class150
extends Class148 {
    private final Class169 Field1010;
    private int Field1011;
    private final boolean Field1012;
    private final Class138 Field1013;
    private final Class138 Field1014;
    private final int Field1015;
    Class150 Field1016;
    Class150 Field1017;

    Class150(Class169 a, boolean a2, Class138 a3, Class138 a4, int a5) {
        super(327680);
        this.Field1010 = a;
        this.Field1012 = a2;
        this.Field1013 = a3;
        this.Field1014 = a4;
        this.Field1015 = a5;
    }

    @Override
    public void Method397(String a, Object a2) {
        int a3;
        ++this.Field1011;
        String[] a4 = Class267.Method2862();
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a));
        }
        if (a2 instanceof String) {
            this.Field1013.Method488(115, this.Field1010.Method1506((String)a2));
        }
        if (a2 instanceof Byte) {
            this.Field1013.Method488(66, this.Field1010.Method1519((int)((Byte)a2).byteValue()).Field1426);
        }
        if (a2 instanceof Boolean) {
            int a5 = (Boolean)a2 != false ? 1 : 0;
            this.Field1013.Method488(90, this.Field1010.Method1519((int)a5).Field1426);
        }
        if (a2 instanceof Character) {
            this.Field1013.Method488(67, this.Field1010.Method1519((int)((Character)a2).charValue()).Field1426);
        }
        if (a2 instanceof Short) {
            this.Field1013.Method488(83, this.Field1010.Method1519((int)((Short)a2).shortValue()).Field1426);
        }
        if (a2 instanceof Class46) {
            this.Field1013.Method488(99, this.Field1010.Method1506(((Class46)a2).Method3225()));
        }
        if (a2 instanceof byte[]) {
            byte[] a6 = (byte[])a2;
            this.Field1013.Method488(91, a6.length);
            a3 = 0;
            if (a3 < a6.length) {
                this.Field1013.Method488(66, this.Field1010.Method1519((int)a6[a3]).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof boolean[]) {
            boolean[] a7 = (boolean[])a2;
            this.Field1013.Method488(91, a7.length);
            a3 = 0;
            if (a3 < a7.length) {
                this.Field1013.Method488(90, this.Field1010.Method1519((int)(a7[a3] ? 1 : 0)).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof short[]) {
            short[] a8 = (short[])a2;
            this.Field1013.Method488(91, a8.length);
            a3 = 0;
            if (a3 < a8.length) {
                this.Field1013.Method488(83, this.Field1010.Method1519((int)a8[a3]).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof char[]) {
            char[] a9 = (char[])a2;
            this.Field1013.Method488(91, a9.length);
            a3 = 0;
            if (a3 < a9.length) {
                this.Field1013.Method488(67, this.Field1010.Method1519((int)a9[a3]).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof int[]) {
            int[] a10 = (int[])a2;
            this.Field1013.Method488(91, a10.length);
            a3 = 0;
            if (a3 < a10.length) {
                this.Field1013.Method488(73, this.Field1010.Method1519((int)a10[a3]).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof long[]) {
            long[] a11 = (long[])a2;
            this.Field1013.Method488(91, a11.length);
            a3 = 0;
            if (a3 < a11.length) {
                this.Field1013.Method488(74, this.Field1010.Method1521((long)a11[a3]).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof float[]) {
            float[] a12 = (float[])a2;
            this.Field1013.Method488(91, a12.length);
            a3 = 0;
            if (a3 < a12.length) {
                this.Field1013.Method488(70, this.Field1010.Method1520((float)a12[a3]).Field1426);
                ++a3;
            }
        }
        if (a2 instanceof double[]) {
            double[] a13 = (double[])a2;
            this.Field1013.Method488(91, a13.length);
            a3 = 0;
            if (a3 < a13.length) {
                this.Field1013.Method488(68, this.Field1010.Method1522((double)a13[a3]).Field1426);
                ++a3;
            }
        }
        Class261 a14 = this.Field1010.Method1504(a2);
        this.Field1013.Method488(".s.IFJDCS".charAt(a14.Field1427), a14.Field1426);
    }

    @Override
    public void Method398(String a, String a2, String a3) {
        ++this.Field1011;
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a));
        }
        this.Field1013.Method488(101, this.Field1010.Method1506(a2)).Method487(this.Field1010.Method1506(a3));
    }

    @Override
    public Class148 Method399(String a, String a2) {
        ++this.Field1011;
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a));
        }
        this.Field1013.Method488(64, this.Field1010.Method1506(a2)).Method487(0);
        return new Class150(this.Field1010, true, this.Field1013, this.Field1013, this.Field1013.Field991 - 2);
    }

    @Override
    public Class148 Method400(String a) {
        ++this.Field1011;
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a));
        }
        this.Field1013.Method488(91, 0);
        return new Class150(this.Field1010, false, this.Field1013, this.Field1013, this.Field1013.Field991 - 2);
    }

    @Override
    public void Method401() {
        if (this.Field1014 != null) {
            byte[] a = this.Field1014.Field990;
            a[this.Field1015] = (byte)(this.Field1011 >>> 8);
            a[this.Field1015 + 1] = (byte)this.Field1011;
        }
    }

    int Method1321() {
        int a = 0;
        Class150 a2 = this;
        while (true) {
            a += a2.Field1013.Field991;
            a2 = a2.Field1016;
        }
    }

    void Method1322(Class138 a) {
        int a2 = 0;
        int a3 = 2;
        Class150 a4 = this;
        Class150 a5 = null;
        while (true) {
            ++a2;
            a3 += a4.Field1013.Field991;
            a4.Method401();
            a4.Field1017 = a5;
            a5 = a4;
            a4 = a4.Field1016;
        }
    }

    static void Method1323(Class150[] a, int a2, Class138 a3) {
        int a4;
        int a5 = 1 + 2 * (a.length - a2);
        for (a4 = a2; a4 < a.length; ++a4) {
            a5 += a[a4] == null ? 0 : a[a4].Method1321();
        }
        a3.Method489(a5).Method485(a.length - a2);
        a4 = a2;
        if (a4 < a.length) {
            Class150 a6 = a[a4];
            Class150 a7 = null;
            int a8 = 0;
            while (true) {
                ++a8;
                a6.Method401();
                a6.Field1017 = a7;
                a7 = a6;
                a6 = a6.Field1016;
            }
        }
    }

    static void Method1324(int a, Class31 a2, Class138 a3) {
        switch (a >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                a3.Method487(a >>> 16);
                break;
            }
            case 19: 
            case 20: 
            case 21: {
                a3.Method485(a >>> 24);
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                a3.Method489(a);
                break;
            }
            default: {
                a3.Method488(a >>> 24, (a & 0xFFFF00) >> 8);
            }
        }
        a3.Method485(0);
    }
}