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
import awsl.Class91;
import java.util.Map;

public class Class102
extends Class91 {
    public Class104 Field829;

    public Class102(int a, Class104 a2) {
        super(a);
        this.Field829 = a2;
    }

    public void Method68(int a) {
        this.Field796 = a;
    }

    @Override
    public int Method0() {
        return 7;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1957(this.Field796, this.Field829.Method303());
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class102(this.Field796, Class102.Method3644(this.Field829, a)).Method3646(this);
    }
}