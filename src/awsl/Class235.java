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
import awsl.Class253;
import awsl.Class31;
import awsl.Class37;

public class Class235
extends Class253 {
    private final Class37 Field1298;

    public Class235(Class253 a, Class37 a2) {
        this(327680, a, a2);
    }

    protected Class235(int a, Class253 a2, Class37 a3) {
        super(a, a2);
        this.Field1298 = a3;
    }

    @Override
    public Class148 Method2114(String a, boolean a2) {
        Class148 a3 = this.Field1390.Method2114(this.Field1298.Method3372(a), a2);
        return null;
    }

    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        Class148 a5 = super.Method2115(a, a2, this.Field1298.Method3372(a3), a4);
        return null;
    }
}