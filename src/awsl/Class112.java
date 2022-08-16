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

public class Class112
extends a {
    public int Field877;

    public Class112(int a2, int a3) {
        super(a2);
        this.Field877 = a3;
    }

    public void Method68(int a2) {
        this.Field796 = a2;
    }

    @Override
    public int Method0() {
        return 2;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1840(this.Field796, this.Field877);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class112(this.Field796, this.Field877).Method3646(this);
    }
}