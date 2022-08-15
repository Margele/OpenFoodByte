/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.util.AbstractMap
 *  java.util.BitSet
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package awsl;

import awsl.Class104;
import awsl.Class17;
import awsl.Class37;
import awsl.Class91;
import java.util.AbstractMap;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Class699
extends AbstractMap {
    final Class699 Field3013;
    public final BitSet Field3014;
    public final Map Field3015;
    public final Class104 Field3016;
    final Class17 Field3017;

    Class699(Class17 class17, Class699 a, BitSet a2) {
        this.Field3017 = class17;
        boolean a3 = Class37.Method3383();
        this.Field3015 = new HashMap();
        this.Field3013 = a;
        this.Field3014 = a2;
        Object a4 = a;
        if (a4.Field3014 == a2) {
            throw new RuntimeException("Recursive invocation of " + a2);
        }
        a4 = a4.Field3013;
        this.Field3016 = new Class104();
        this.Field3016 = null;
        a4 = null;
        int a5 = 0;
        int a6 = class17.Field208.Method183();
        if (a5 < a6) {
            Class91 a7 = class17.Field208.Method186(a5);
            if (a7.Method0() == 8) {
                Class104 a8 = (Class104)a7;
                a4 = new Class104();
                this.Field3015.put((Object)a8, a4);
            }
            if (this.Method2660(a5) == this) {
                a4 = null;
            }
            ++a5;
        }
    }

    public Class699 Method2660(int a) {
        if (!this.Field3014.get(a)) {
            return null;
        }
        if (!this.Field3017.Field227.get(a)) {
            return this;
        }
        Class699 a2 = this;
        Class699 a3 = this.Field3013;
        while (true) {
            if (a3.Field3014.get(a)) {
                a2 = a3;
            }
            a3 = a3.Field3013;
        }
    }

    public Class104 Method2661(Class104 a) {
        Class699 a2 = this.Method2660(this.Field3017.Field208.Method188(a));
        return (Class104)a2.Field3015.Method2665((Object)a);
    }

    public Class104 Method2662(Class104 a) {
        return (Class104)this.Field3015.Method2665((Object)a);
    }

    public Set Method2663() {
        return null;
    }

    public Class104 Method2664(Object a) {
        return this.Method2661((Class104)a);
    }

    public Object Method2665(Object object) {
        return this.Method2664(object);
    }

    private static RuntimeException Method2095(RuntimeException runtimeException) {
        return runtimeException;
    }
}