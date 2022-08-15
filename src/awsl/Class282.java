/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
package awsl;

import awsl.Class217;
import java.util.Comparator;

public class Class282
implements Comparator {
    public int Method2140(Class217 a, Class217 a2) {
        return (int)(a.Method2127() + a.Method2134() - (a2.Method2127() + a2.Method2134()));
    }

    public int Method2141(Object object, Object object2) {
        return this.Method2140((Class217)object, (Class217)object2);
    }
}