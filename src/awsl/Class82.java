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

public class Class82
extends a {
    public int Field712;
    public int Field713;

    public Class82(int a2, int a3) {
        super(132);
        this.Field712 = a2;
        this.Field713 = a3;
    }

    @Override
    public int Method0() {
        return 10;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1841(this.Field712, this.Field713);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class82(this.Field712, this.Field713).Method3646(this);
    }
}