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
import awsl.Class91;
import java.util.Map;

public class Class88
extends Class91 {
    public String Field759;
    public String Field760;
    public Class279 Field761;
    public Object[] Field762;

    public Class88(String a, String a2, Class279 a3, Object[] a4) {
        super(186);
        this.Field759 = a;
        this.Field760 = a2;
        this.Field761 = a3;
        this.Field762 = a4;
    }

    @Override
    public int Method0() {
        return 6;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1956(this.Field759, this.Field760, this.Field761, this.Field762);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class88(this.Field759, this.Field760, this.Field761, this.Field762).Method3646(this);
    }
}