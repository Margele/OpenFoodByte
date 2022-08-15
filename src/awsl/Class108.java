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
import awsl.Class91;
import java.util.Map;

public class Class108
extends Class91 {
    public int Field851;
    public Class104 Field852;

    public Class108(int a, Class104 a2) {
        super(-1);
        this.Field851 = a;
        this.Field852 = a2;
    }

    @Override
    public int Method0() {
        return 15;
    }

    @Override
    public void Method1(Class267 a) {
        a.Method1981(this.Field851, this.Field852.Method303());
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class108(this.Field851, Class108.Method3644(this.Field852, a));
    }
}