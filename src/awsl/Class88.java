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
import awsl.Class279;
import java.util.Map;
import obfuscate.a;

public class Class88
extends a {
    public String Field759;
    public String Field760;
    public Class279 Field761;
    public Object[] Field762;

    public Class88(String a2, String a3, Class279 a4, Object[] a5) {
        super(186);
        this.Field759 = a2;
        this.Field760 = a3;
        this.Field761 = a4;
        this.Field762 = a5;
    }

    @Override
    public int Method0() {
        return 6;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1956(this.Field759, this.Field760, this.Field761, this.Field762);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class88(this.Field759, this.Field760, this.Field761, this.Field762).Method3646(this);
    }
}