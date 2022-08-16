/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class148;
import awsl.Class801;

public final class Class132
extends Class148 {
    private final Class801 Field982;

    public Class132(Class801 a) {
        this(null, a);
    }

    public Class132(Class148 a, Class801 a2) {
        super(327680, a);
        this.Field982 = a2;
    }

    @Override
    public void Method397(String a2, Object a3) {
        this.Field982.Method3255(a2, a3);
        super.Method397(a2, a3);
    }

    @Override
    public void Method398(String a2, String a3, String a4) {
        this.Field982.Method3256(a2, a3, a4);
        super.Method398(a2, a3, a4);
    }

    @Override
    public Class148 Method399(String a2, String a3) {
        Class801 a4 = this.Field982.Method3257(a2, a3);
        Class148 a5 = this.Field1006 == null ? null : this.Field1006.Method399(a2, a3);
        return new Class132(a5, a4);
    }

    @Override
    public Class148 Method400(String a2) {
        Class801 a3 = this.Field982.Method3258(a2);
        Class148 a4 = this.Field1006 == null ? null : this.Field1006.Method400(a2);
        return new Class132(a4, a3);
    }

    @Override
    public void Method401() {
        this.Field982.Method3259();
        super.Method401();
    }
}