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
import awsl.Class91;
import java.util.Map;

public class Class86
extends Class91 {
    public int Field734;

    public Class86(int a, int a2) {
        super(a);
        this.Field734 = a2;
    }

    public void Method68(int a) {
        this.Field796 = a;
    }

    @Override
    public int Method0() {
        return 1;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method854(this.Field796, this.Field734);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class86(this.Field796, this.Field734).Method3646(this);
    }
}