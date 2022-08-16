/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 */
package awsl;

import awsl.Class148;
import awsl.Class39;
import obfuscate.b;

public class Class130
extends Class148 {
    private final boolean Field980;
    private boolean Field981;

    public Class130(Class148 a) {
        this(a, true);
    }

    Class130(Class148 a, boolean a2) {
        super(327680, a);
        this.Field980 = a2;
    }

    @Override
    public void Method397(String a2, Object a3) {
        block2: {
            int a4;
            this.Method402();
            this.Method403(a2);
            if (!(a3 instanceof Byte || a3 instanceof Boolean || a3 instanceof Character || a3 instanceof Short || a3 instanceof Integer || a3 instanceof Long || a3 instanceof Float || a3 instanceof Double || a3 instanceof String || a3 instanceof b || a3 instanceof byte[] || a3 instanceof boolean[] || a3 instanceof char[] || a3 instanceof short[] || a3 instanceof int[] || a3 instanceof long[] || a3 instanceof float[] || a3 instanceof double[])) {
                throw new IllegalArgumentException("Invalid annotation value");
            }
            if (a3 instanceof b && (a4 = ((b)a3).Method3217()) == 11) {
                throw new IllegalArgumentException("Invalid annotation value");
            }
            if (this.Field1006 == null) break block2;
            this.Field1006.Method397(a2, a3);
        }
    }

    @Override
    public void Method398(String a2, String a3, String a4) {
        this.Method402();
        this.Method403(a2);
        Class39.Method3395(a3, false);
        throw new IllegalArgumentException("Invalid enum value");
    }

    @Override
    public Class148 Method399(String a2, String a3) {
        this.Method402();
        this.Method403(a2);
        Class39.Method3395(a3, false);
        return new Class130(this.Field1006 == null ? null : this.Field1006.Method399(a2, a3));
    }

    @Override
    public Class148 Method400(String a2) {
        this.Method402();
        this.Method403(a2);
        return new Class130(this.Field1006 == null ? null : this.Field1006.Method400(a2), false);
    }

    @Override
    public void Method401() {
        block0: {
            this.Method402();
            this.Field981 = true;
            if (this.Field1006 == null) break block0;
            this.Field1006.Method401();
        }
    }

    private void Method402() {
        if (this.Field981) {
            throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
        }
    }

    private void Method403(String a2) {
        if (this.Field980) {
            throw new IllegalArgumentException("Annotation value name must not be null");
        }
    }

    private static IllegalArgumentException Method404(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}