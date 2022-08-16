/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package awsl;

import awsl.Class267;
import java.util.Map;
import obfuscate.a;

public class Class86
extends a {
    public int Field734;

    public Class86(int a2, int a3) {
        super(a2);
        this.Field734 = a3;
    }

    public void Method68(int a2) {
        this.Field796 = a2;
    }

    @Override
    public int Method0() {
        return 1;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method854(this.Field796, this.Field734);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class86(this.Field796, this.Field734).Method3646(this);
    }
}