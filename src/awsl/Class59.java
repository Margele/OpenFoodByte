/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 */
package awsl;

import awsl.Class57;
import java.util.Map;
import java.util.Set;

final class Class59
extends Class57 {
    final Set Field625;

    Class59(Map a, Set set) {
        this.Field625 = set;
        super(a);
    }

    @Override
    public String Method3183(String a) {
        String a2 = super.Method3183(a);
        this.Field625.remove((Object)a);
        return a2;
    }
}