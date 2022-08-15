/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package awsl;

import awsl.Class136;
import awsl.Class148;
import awsl.Class31;

public abstract class Class253 {
    protected final int Field1389;
    protected Class253 Field1390;

    public Class253(int a) {
        this(a, null);
    }

    public Class253(int a, Class253 a2) {
        if (a != 262144 && a != 327680) {
            throw new IllegalArgumentException();
        }
        this.Field1389 = a;
        this.Field1390 = a2;
    }

    public Class148 Method2114(String a, boolean a2) {
        if (this.Field1390 != null) {
            return this.Field1390.Method2114(a, a2);
        }
        return null;
    }

    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        if (this.Field1389 < 327680) {
            throw new RuntimeException();
        }
        if (this.Field1390 != null) {
            return this.Field1390.Method2115(a, a2, a3, a4);
        }
        return null;
    }

    public void Method2120(Class136 a) {
        block0: {
            if (this.Field1390 == null) break block0;
            this.Field1390.Method2120(a);
        }
    }

    public void Method2121() {
        block0: {
            if (this.Field1390 == null) break block0;
            this.Field1390.Method2121();
        }
    }

    private static IllegalArgumentException Method2247(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}