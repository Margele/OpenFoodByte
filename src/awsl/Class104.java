/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package awsl;

import awsl.Class264;
import awsl.Class267;
import java.util.Map;
import obfuscate.a;

public class Class104
extends a {
    private Class264 Field848;

    public Class104() {
        super(-1);
    }

    public Class104(Class264 a2) {
        super(-1);
        this.Field848 = a2;
    }

    @Override
    public int Method0() {
        return 8;
    }

    public Class264 Method303() {
        if (this.Field848 == null) {
            this.Field848 = new Class264();
        }
        return this.Field848;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1947(this.Method303());
    }

    @Override
    public a Method2(Map a2) {
        return (a)a2.Method2665((Object)this);
    }

    public void Method304() {
        this.Field848 = null;
    }
}