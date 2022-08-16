/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package awsl;

import awsl.Class104;
import awsl.Class267;
import java.util.Map;
import obfuscate.a;

public class Class108
extends a {
    public int Field851;
    public Class104 Field852;

    public Class108(int a2, Class104 a3) {
        super(-1);
        this.Field851 = a2;
        this.Field852 = a3;
    }

    @Override
    public int Method0() {
        return 15;
    }

    @Override
    public void Method1(Class267 a2) {
        a2.Method1981(this.Field851, this.Field852.Method303());
    }

    @Override
    public a Method2(Map a2) {
        return new Class108(this.Field851, Class108.Method3644(this.Field852, a2));
    }
}