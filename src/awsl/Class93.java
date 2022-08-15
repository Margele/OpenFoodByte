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

public class Class93
extends Class91 {
    public String Field807;
    public String Field808;
    public String Field809;

    public Class93(int a, String a2, String a3, String a4) {
        super(a);
        this.Field807 = a2;
        this.Field808 = a3;
        this.Field809 = a4;
    }

    public void Method68(int a) {
        this.Field796 = a;
    }

    @Override
    public int Method0() {
        return 4;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1949(this.Field796, this.Field807, this.Field808, this.Field809);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class93(this.Field796, this.Field807, this.Field808, this.Field809).Method3646(this);
    }
}