/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class130;
import awsl.Class136;
import awsl.Class148;
import awsl.Class225;
import awsl.Class253;
import awsl.Class31;
import awsl.Class39;

public class Class244
extends Class253 {
    private boolean Field1351;

    public Class244(Class253 a) {
        this(327680, a);
        if (this.getClass() != Class244.class) {
            throw new IllegalStateException();
        }
    }

    protected Class244(int a, Class253 a2) {
        super(a, a2);
    }

    @Override
    public Class148 Method2114(String a, boolean a2) {
        this.Method2288();
        Class39.Method3395(a, false);
        return new Class130(super.Method2114(a, a2));
    }

    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        this.Method2288();
        int a5 = a >>> 24;
        if (a5 != 19) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString((int)a5));
        }
        Class225.Method2200(a, a2);
        Class39.Method3395(a3, false);
        return new Class130(super.Method2115(a, a2, a3, a4));
    }

    @Override
    public void Method2120(Class136 a) {
        this.Method2288();
        throw new IllegalArgumentException("Invalid attribute (must not be null)");
    }

    @Override
    public void Method2121() {
        this.Method2288();
        this.Field1351 = true;
        super.Method2121();
    }

    private void Method2288() {
        if (this.Field1351) {
            throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
        }
    }

    private static IllegalStateException Method2281(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}