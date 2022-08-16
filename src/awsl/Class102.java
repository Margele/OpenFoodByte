/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package awsl;

import awsl.Class104;
import awsl.Class267;
import java.util.Map;
import obfuscate.a;

public class Class102
extends a {
    public Class104 Field829;

    public Class102(int a2, Class104 a3) {
        super(a2);
        this.Field829 = a3;
    }

    public void Method68(int a2) {
        this.Field796 = a2;
    }

    @Override
    public int Method0() {
        return 7;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1957(this.Field796, this.Field829.Method303());
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class102(this.Field796, Class102.Method3644(this.Field829, a2)).Method3646(this);
    }
}