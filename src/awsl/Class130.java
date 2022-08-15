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
import awsl.Class46;

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
    public void Method397(String a, Object a2) {
        block2: {
            int a3;
            this.Method402();
            this.Method403(a);
            if (!(a2 instanceof Byte || a2 instanceof Boolean || a2 instanceof Character || a2 instanceof Short || a2 instanceof Integer || a2 instanceof Long || a2 instanceof Float || a2 instanceof Double || a2 instanceof String || a2 instanceof Class46 || a2 instanceof byte[] || a2 instanceof boolean[] || a2 instanceof char[] || a2 instanceof short[] || a2 instanceof int[] || a2 instanceof long[] || a2 instanceof float[] || a2 instanceof double[])) {
                throw new IllegalArgumentException("Invalid annotation value");
            }
            if (a2 instanceof Class46 && (a3 = ((Class46)a2).Method3217()) == 11) {
                throw new IllegalArgumentException("Invalid annotation value");
            }
            if (this.Field1006 == null) break block2;
            this.Field1006.Method397(a, a2);
        }
    }

    @Override
    public void Method398(String a, String a2, String a3) {
        this.Method402();
        this.Method403(a);
        Class39.Method3395(a2, false);
        throw new IllegalArgumentException("Invalid enum value");
    }

    @Override
    public Class148 Method399(String a, String a2) {
        this.Method402();
        this.Method403(a);
        Class39.Method3395(a2, false);
        return new Class130(this.Field1006 == null ? null : this.Field1006.Method399(a, a2));
    }

    @Override
    public Class148 Method400(String a) {
        this.Method402();
        this.Method403(a);
        return new Class130(this.Field1006 == null ? null : this.Field1006.Method400(a), false);
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

    private void Method403(String a) {
        if (this.Field980) {
            throw new IllegalArgumentException("Annotation value name must not be null");
        }
    }

    private static IllegalArgumentException Method404(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}