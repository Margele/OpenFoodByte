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

public class Class106
extends Class91 {
    public Object Field850;

    public Class106(Object a) {
        super(18);
        this.Field850 = a;
    }

    @Override
    public int Method0() {
        return 9;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1950(this.Field850);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class106(this.Field850).Method3646(this);
    }
}