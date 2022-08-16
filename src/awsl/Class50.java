/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
package awsl;

import awsl.Class19;
import awsl.Class794;
import java.util.Comparator;

class Class50
implements Comparator {
    final Class19 Field587;

    Class50(Class19 a) {
        this.Field587 = a;
    }

    public int Method3197(Class794 a, Class794 a2) {
        int a3 = this.Method3198(a);
        int a4 = this.Method3198(a2);
        return a3 - a4;
    }

    private int Method3198(Class794 a2) {
        int a3 = this.Field587.Field208.Method188(a2.Field3559);
        int a4 = this.Field587.Field208.Method188(a2.Field3560);
        return a4 - a3;
    }

    public int Method2141(Object object, Object object2) {
        return this.Method3197((Class794)object, (Class794)object2);
    }
}