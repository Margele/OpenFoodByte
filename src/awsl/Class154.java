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

import awsl.Class148;
import awsl.Class690;
import obfuscate.b;

public class Class154
extends Class148 {
    private final Class690 Field1019;

    public Class154(Class148 a, Class690 a2) {
        super(327680, a);
        this.Field1019 = a2;
    }

    @Override
    public void Method397(String a2, Object a3) {
        Object[] a4;
        int a5;
        String[] a6 = Class690.Method2342();
        this.Field1019.Method2496(a2);
        if (a3 instanceof Byte) {
            this.Field1019.Method2492(((Byte)a3).byteValue());
        }
        if (a3 instanceof Boolean) {
            this.Field1019.Method2492((Boolean)a3 != false ? 1 : 0);
        }
        if (a3 instanceof Character) {
            this.Field1019.Method2492(((Character)a3).charValue());
        }
        if (a3 instanceof Short) {
            this.Field1019.Method2492(((Short)a3).shortValue());
        }
        if (a3 instanceof b) {
            this.Field1019.Method2496(((b)a3).Method3225());
        }
        if (a3 instanceof byte[]) {
            a5 = 0;
            a4 = (byte[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2492(a4[a5]);
                ++a5;
            }
        }
        if (a3 instanceof boolean[]) {
            a5 = 0;
            a4 = (boolean[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2492(a4[a5] != 0 ? 1 : 0);
                ++a5;
            }
        }
        if (a3 instanceof short[]) {
            a5 = 0;
            a4 = (short[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2492(a4[a5]);
                ++a5;
            }
        }
        if (a3 instanceof char[]) {
            a5 = 0;
            a4 = (char[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2492(a4[a5]);
                ++a5;
            }
        }
        if (a3 instanceof int[]) {
            a5 = 0;
            a4 = (int[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2492(a4[a5]);
                ++a5;
            }
        }
        if (a3 instanceof long[]) {
            a5 = 0;
            a4 = (long[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2494(a4[a5]);
                ++a5;
            }
        }
        if (a3 instanceof float[]) {
            a5 = 0;
            a4 = (float[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2493(a4[a5]);
                ++a5;
            }
        }
        if (a3 instanceof double[]) {
            a5 = 0;
            a4 = (double[])a3;
            if (a5 < a4.length) {
                this.Field1019.Method2495(a4[a5]);
                ++a5;
            }
        }
        this.Field1019.Method2501(a3);
        this.Field1006.Method397(a2, a3);
    }

    @Override
    public void Method398(String a2, String a3, String a4) {
        this.Field1019.Method2496(a2);
        this.Field1019.Method2496(a3);
        this.Field1019.Method2496(a4);
        this.Field1006.Method398(a2, a3, a4);
    }

    @Override
    public Class148 Method399(String a2, String a3) {
        this.Field1019.Method2496(a2);
        this.Field1019.Method2496(a3);
        return new Class154(this.Field1006.Method399(a2, a3), this.Field1019);
    }

    @Override
    public Class148 Method400(String a2) {
        this.Field1019.Method2496(a2);
        return new Class154(this.Field1006.Method400(a2), this.Field1019);
    }

    @Override
    public void Method401() {
        this.Field1006.Method401();
    }
}