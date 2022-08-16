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
import obfuscate.b;

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
    public void Method397(String a2, Object a3) {
        int a4;
        ++this.Field1011;
        String[] a5 = Class267.Method2862();
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a2));
        }
        if (a3 instanceof String) {
            this.Field1013.Method488(115, this.Field1010.Method1506((String)a3));
        }
        if (a3 instanceof Byte) {
            this.Field1013.Method488(66, this.Field1010.Method1519((int)((Byte)a3).byteValue()).Field1426);
        }
        if (a3 instanceof Boolean) {
            int a6 = (Boolean)a3 != false ? 1 : 0;
            this.Field1013.Method488(90, this.Field1010.Method1519((int)a6).Field1426);
        }
        if (a3 instanceof Character) {
            this.Field1013.Method488(67, this.Field1010.Method1519((int)((Character)a3).charValue()).Field1426);
        }
        if (a3 instanceof Short) {
            this.Field1013.Method488(83, this.Field1010.Method1519((int)((Short)a3).shortValue()).Field1426);
        }
        if (a3 instanceof b) {
            this.Field1013.Method488(99, this.Field1010.Method1506(((b)a3).Method3225()));
        }
        if (a3 instanceof byte[]) {
            byte[] a7 = (byte[])a3;
            this.Field1013.Method488(91, a7.length);
            a4 = 0;
            if (a4 < a7.length) {
                this.Field1013.Method488(66, this.Field1010.Method1519((int)a7[a4]).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof boolean[]) {
            boolean[] a8 = (boolean[])a3;
            this.Field1013.Method488(91, a8.length);
            a4 = 0;
            if (a4 < a8.length) {
                this.Field1013.Method488(90, this.Field1010.Method1519((int)(a8[a4] ? 1 : 0)).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof short[]) {
            short[] a9 = (short[])a3;
            this.Field1013.Method488(91, a9.length);
            a4 = 0;
            if (a4 < a9.length) {
                this.Field1013.Method488(83, this.Field1010.Method1519((int)a9[a4]).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof char[]) {
            char[] a10 = (char[])a3;
            this.Field1013.Method488(91, a10.length);
            a4 = 0;
            if (a4 < a10.length) {
                this.Field1013.Method488(67, this.Field1010.Method1519((int)a10[a4]).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof int[]) {
            int[] a11 = (int[])a3;
            this.Field1013.Method488(91, a11.length);
            a4 = 0;
            if (a4 < a11.length) {
                this.Field1013.Method488(73, this.Field1010.Method1519((int)a11[a4]).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof long[]) {
            long[] a12 = (long[])a3;
            this.Field1013.Method488(91, a12.length);
            a4 = 0;
            if (a4 < a12.length) {
                this.Field1013.Method488(74, this.Field1010.Method1521((long)a12[a4]).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof float[]) {
            float[] a13 = (float[])a3;
            this.Field1013.Method488(91, a13.length);
            a4 = 0;
            if (a4 < a13.length) {
                this.Field1013.Method488(70, this.Field1010.Method1520((float)a13[a4]).Field1426);
                ++a4;
            }
        }
        if (a3 instanceof double[]) {
            double[] a14 = (double[])a3;
            this.Field1013.Method488(91, a14.length);
            a4 = 0;
            if (a4 < a14.length) {
                this.Field1013.Method488(68, this.Field1010.Method1522((double)a14[a4]).Field1426);
                ++a4;
            }
        }
        Class261 a15 = this.Field1010.Method1504(a3);
        this.Field1013.Method488(".s.IFJDCS".charAt(a15.Field1427), a15.Field1426);
    }

    @Override
    public void Method398(String a2, String a3, String a4) {
        ++this.Field1011;
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a2));
        }
        this.Field1013.Method488(101, this.Field1010.Method1506(a3)).Method487(this.Field1010.Method1506(a4));
    }

    @Override
    public Class148 Method399(String a2, String a3) {
        ++this.Field1011;
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a2));
        }
        this.Field1013.Method488(64, this.Field1010.Method1506(a3)).Method487(0);
        return new Class150(this.Field1010, true, this.Field1013, this.Field1013, this.Field1013.Field991 - 2);
    }

    @Override
    public Class148 Method400(String a2) {
        ++this.Field1011;
        if (this.Field1012) {
            this.Field1013.Method487(this.Field1010.Method1506(a2));
        }
        this.Field1013.Method488(91, 0);
        return new Class150(this.Field1010, false, this.Field1013, this.Field1013, this.Field1013.Field991 - 2);
    }

    @Override
    public void Method401() {
        if (this.Field1014 != null) {
            byte[] a2 = this.Field1014.Field990;
            a2[this.Field1015] = (byte)(this.Field1011 >>> 8);
            a2[this.Field1015 + 1] = (byte)this.Field1011;
        }
    }

    int Method1321() {
        int a2 = 0;
        Class150 a3 = this;
        while (true) {
            a2 += a3.Field1013.Field991;
            a3 = a3.Field1016;
        }
    }

    void Method1322(Class138 a2) {
        int a3 = 0;
        int a4 = 2;
        Class150 a5 = this;
        Class150 a6 = null;
        while (true) {
            ++a3;
            a4 += a5.Field1013.Field991;
            a5.Method401();
            a5.Field1017 = a6;
            a6 = a5;
            a5 = a5.Field1016;
        }
    }

    static void Method1323(Class150[] a2, int a3, Class138 a4) {
        int a5;
        int a6 = 1 + 2 * (a2.length - a3);
        for (a5 = a3; a5 < a2.length; ++a5) {
            a6 += a2[a5] == null ? 0 : a2[a5].Method1321();
        }
        a4.Method489(a6).Method485(a2.length - a3);
        a5 = a3;
        if (a5 < a2.length) {
            Class150 a7 = a2[a5];
            Class150 a8 = null;
            int a9 = 0;
            while (true) {
                ++a9;
                a7.Method401();
                a7.Field1017 = a8;
                a8 = a7;
                a7 = a7.Field1016;
            }
        }
    }

    static void Method1324(int a2, Class31 a3, Class138 a4) {
        switch (a2 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                a4.Method487(a2 >>> 16);
                break;
            }
            case 19: 
            case 20: 
            case 21: {
                a4.Method485(a2 >>> 24);
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                a4.Method489(a2);
                break;
            }
            default: {
                a4.Method488(a2 >>> 24, (a2 & 0xFFFF00) >> 8);
            }
        }
        a4.Method485(0);
    }
}