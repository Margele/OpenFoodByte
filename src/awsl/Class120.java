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

public class Class120
extends Class91 {
    public String Field952;
    public int Field953;

    public Class120(String a, int a2) {
        super(197);
        this.Field952 = a;
        this.Field953 = a2;
    }

    @Override
    public int Method0() {
        return 13;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1951(this.Field952, this.Field953);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class120(this.Field952, this.Field953).Method3646(this);
    }
}