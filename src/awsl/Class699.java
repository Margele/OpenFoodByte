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
import java.util.AbstractMap;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import obfuscate.a;

class Class699
extends AbstractMap {
    final Class699 Field3013;
    public final BitSet Field3014;
    public final Map Field3015;
    public final Class104 Field3016;
    final Class17 Field3017;

    Class699(Class17 class17, Class699 a2, BitSet a3) {
        this.Field3017 = class17;
        boolean a4 = Class37.Method3383();
        this.Field3015 = new HashMap();
        this.Field3013 = a2;
        this.Field3014 = a3;
        Object a5 = a2;
        if (a5.Field3014 == a3) {
            throw new RuntimeException("Recursive invocation of " + a3);
        }
        a5 = a5.Field3013;
        this.Field3016 = new Class104();
        this.Field3016 = null;
        a5 = null;
        int a6 = 0;
        int a7 = class17.Field208.Method183();
        if (a6 < a7) {
            a a8 = class17.Field208.Method186(a6);
            if (a8.Method0() == 8) {
                Class104 a9 = (Class104)a8;
                a5 = new Class104();
                this.Field3015.put((Object)a9, a5);
            }
            if (this.Method2660(a6) == this) {
                a5 = null;
            }
            ++a6;
        }
    }

    public Class699 Method2660(int a2) {
        if (!this.Field3014.get(a2)) {
            return null;
        }
        if (!this.Field3017.Field227.get(a2)) {
            return this;
        }
        Class699 a3 = this;
        Class699 a4 = this.Field3013;
        while (true) {
            if (a4.Field3014.get(a2)) {
                a3 = a4;
            }
            a4 = a4.Field3013;
        }
    }

    public Class104 Method2661(Class104 a2) {
        Class699 a3 = this.Method2660(this.Field3017.Field208.Method188(a2));
        return (Class104)a3.Field3015.Method2665((Object)a2);
    }

    public Class104 Method2662(Class104 a2) {
        return (Class104)this.Field3015.Method2665((Object)a2);
    }

    public Set Method2663() {
        return null;
    }

    public Class104 Method2664(Object a2) {
        return this.Method2661((Class104)a2);
    }

    public Object Method2665(Object object) {
        return this.Method2664(object);
    }

    private static RuntimeException Method2095(RuntimeException runtimeException) {
        return runtimeException;
    }
}