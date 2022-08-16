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

public class Class120
extends a {
    public String Field952;
    public int Field953;

    public Class120(String a2, int a3) {
        super(197);
        this.Field952 = a2;
        this.Field953 = a3;
    }

    @Override
    public int Method0() {
        return 13;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1951(this.Field952, this.Field953);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class120(this.Field952, this.Field953).Method3646(this);
    }
}