/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class132;
import awsl.Class136;
import awsl.Class148;
import awsl.Class253;
import awsl.Class31;
import awsl.Class801;

public final class Class270
extends Class253 {
    public final Class801 Field1466;

    public Class270(Class801 a) {
        this(null, a);
    }

    public Class270(Class253 a, Class801 a2) {
        super(327680, a);
        this.Field1466 = a2;
    }

    @Override
    public Class148 Method2114(String a, boolean a2) {
        Class801 a3 = this.Field1466.Method3260(a, a2);
        Class148 a4 = this.Field1390 == null ? null : this.Field1390.Method2114(a, a2);
        return new Class132(a4, a3);
    }

    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        Class801 a5 = this.Field1466.Method3261(a, a2, a3, a4);
        Class148 a6 = this.Field1390 == null ? null : this.Field1390.Method2115(a, a2, a3, a4);
        return new Class132(a6, a5);
    }

    @Override
    public void Method2120(Class136 a) {
        this.Field1466.Method3262(a);
        super.Method2120(a);
    }

    @Override
    public void Method2121() {
        this.Field1466.Method3263();
        super.Method2121();
    }
}