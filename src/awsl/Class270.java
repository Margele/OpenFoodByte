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
    public Class148 Method2114(String a2, boolean a3) {
        Class801 a4 = this.Field1466.Method3260(a2, a3);
        Class148 a5 = this.Field1390 == null ? null : this.Field1390.Method2114(a2, a3);
        return new Class132(a5, a4);
    }

    @Override
    public Class148 Method2115(int a2, Class31 a3, String a4, boolean a5) {
        Class801 a6 = this.Field1466.Method3261(a2, a3, a4, a5);
        Class148 a7 = this.Field1390 == null ? null : this.Field1390.Method2115(a2, a3, a4, a5);
        return new Class132(a7, a6);
    }

    @Override
    public void Method2120(Class136 a2) {
        this.Field1466.Method3262(a2);
        super.Method2120(a2);
    }

    @Override
    public void Method2121() {
        this.Field1466.Method3263();
        super.Method2121();
    }
}