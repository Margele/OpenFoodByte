/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
package awsl;

import awsl.Class267;
import awsl.Class91;
import java.util.Map;

public class Class110
extends Class91 {
    public String Field871;

    public Class110(int a, String a2) {
        super(a);
        this.Field871 = a2;
    }

    public void Method68(int a) {
        this.Field796 = a;
    }

    @Override
    public int Method0() {
        return 3;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1952(this.Field796, this.Field871);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class110(this.Field796, this.Field871).Method3646(this);
    }
}