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
import awsl.Class46;
import awsl.Class690;

public class Class154
extends Class148 {
    private final Class690 Field1019;

    public Class154(Class148 a, Class690 a2) {
        super(327680, a);
        this.Field1019 = a2;
    }

    @Override
    public void Method397(String a, Object a2) {
        Object[] a3;
        int a4;
        String[] a5 = Class690.Method2342();
        this.Field1019.Method2496(a);
        if (a2 instanceof Byte) {
            this.Field1019.Method2492(((Byte)a2).byteValue());
        }
        if (a2 instanceof Boolean) {
            this.Field1019.Method2492((Boolean)a2 != false ? 1 : 0);
        }
        if (a2 instanceof Character) {
            this.Field1019.Method2492(((Character)a2).charValue());
        }
        if (a2 instanceof Short) {
            this.Field1019.Method2492(((Short)a2).shortValue());
        }
        if (a2 instanceof Class46) {
            this.Field1019.Method2496(((Class46)a2).Method3225());
        }
        if (a2 instanceof byte[]) {
            a4 = 0;
            a3 = (byte[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2492(a3[a4]);
                ++a4;
            }
        }
        if (a2 instanceof boolean[]) {
            a4 = 0;
            a3 = (boolean[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2492(a3[a4] != 0 ? 1 : 0);
                ++a4;
            }
        }
        if (a2 instanceof short[]) {
            a4 = 0;
            a3 = (short[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2492(a3[a4]);
                ++a4;
            }
        }
        if (a2 instanceof char[]) {
            a4 = 0;
            a3 = (char[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2492(a3[a4]);
                ++a4;
            }
        }
        if (a2 instanceof int[]) {
            a4 = 0;
            a3 = (int[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2492(a3[a4]);
                ++a4;
            }
        }
        if (a2 instanceof long[]) {
            a4 = 0;
            a3 = (long[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2494(a3[a4]);
                ++a4;
            }
        }
        if (a2 instanceof float[]) {
            a4 = 0;
            a3 = (float[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2493(a3[a4]);
                ++a4;
            }
        }
        if (a2 instanceof double[]) {
            a4 = 0;
            a3 = (double[])a2;
            if (a4 < a3.length) {
                this.Field1019.Method2495(a3[a4]);
                ++a4;
            }
        }
        this.Field1019.Method2501(a2);
        this.Field1006.Method397(a, a2);
    }

    @Override
    public void Method398(String a, String a2, String a3) {
        this.Field1019.Method2496(a);
        this.Field1019.Method2496(a2);
        this.Field1019.Method2496(a3);
        this.Field1006.Method398(a, a2, a3);
    }

    @Override
    public Class148 Method399(String a, String a2) {
        this.Field1019.Method2496(a);
        this.Field1019.Method2496(a2);
        return new Class154(this.Field1006.Method399(a, a2), this.Field1019);
    }

    @Override
    public Class148 Method400(String a) {
        this.Field1019.Method2496(a);
        return new Class154(this.Field1006.Method400(a), this.Field1019);
    }

    @Override
    public void Method401() {
        this.Field1006.Method401();
    }
}