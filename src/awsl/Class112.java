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

public class Class112
extends Class91 {
    public int Field877;

    public Class112(int a, int a2) {
        super(a);
        this.Field877 = a2;
    }

    public void Method68(int a) {
        this.Field796 = a;
    }

    @Override
    public int Method0() {
        return 2;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1840(this.Field796, this.Field877);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class112(this.Field796, this.Field877).Method3646(this);
    }
}