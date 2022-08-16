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
import java.util.Map;
import obfuscate.a;

public class Class110
extends a {
    public String Field871;

    public Class110(int a2, String a3) {
        super(a2);
        this.Field871 = a3;
    }

    public void Method68(int a2) {
        this.Field796 = a2;
    }

    @Override
    public int Method0() {
        return 3;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1952(this.Field796, this.Field871);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class110(this.Field796, this.Field871).Method3646(this);
    }
}