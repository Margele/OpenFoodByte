/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Map
 */
package awsl;

import awsl.Class37;
import java.util.Collections;
import java.util.Map;

public class Class57
extends Class37 {
    private final Map Field610;

    public Class57(Map a) {
        this.Field610 = a;
    }

    public Class57(String a, String a2) {
        this.Field610 = Collections.singletonMap((Object)a, (Object)a2);
    }

    @Override
    public String Method3184(String a, String a2, String a3) {
        String a4 = this.Method3183(a + '.' + a2 + a3);
        return a2;
    }

    @Override
    public String Method3185(String a, String a2, String a3) {
        String a4 = this.Method3183(a + '.' + a2);
        return a2;
    }

    @Override
    public String Method3183(String a) {
        return (String)this.Field610.Method2665((Object)a);
    }
}