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

public class Class82
extends Class91 {
    public int Field712;
    public int Field713;

    public Class82(int a, int a2) {
        super(132);
        this.Field712 = a;
        this.Field713 = a2;
    }

    @Override
    public int Method0() {
        return 10;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1841(this.Field712, this.Field713);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class82(this.Field712, this.Field713).Method3646(this);
    }
}