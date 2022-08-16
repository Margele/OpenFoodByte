/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class104;
import awsl.Class15;
import awsl.Class264;
import awsl.Class267;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import obfuscate.a;

public class Class96
extends a {
    public Class104 Field817;
    public List Field818;
    public List Field819;

    public Class96(Class104 a2, int[] a3, Class104[] a4) {
        super(171);
        this.Field817 = a2;
        int a5 = Class15.Method1984();
        this.Field818 = new ArrayList(0);
        this.Field819 = new ArrayList(0);
        int a6 = 0;
        if (a6 < a3.length) {
            this.Field818.Method2530((Object)new Integer(a3[a6]));
            ++a6;
        }
        this.Field819.addAll((Collection)Arrays.asList((Object[])a4));
    }

    @Override
    public int Method0() {
        return 12;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method1(Class267 a2) {
        int a3;
        void a4;
        int[] a5 = new int[this.Field818.Method1799()];
        boolean bl = false;
        int a6 = Class15.Method1984();
        if (a4 < a5.length) {
            a5[a4] = (Integer)this.Field818.get((int)a4);
            ++a4;
        }
        if ((a3 = 0) < (a = new Class264[this.Field819.Method1799()]).length) {
            a[a3] = ((Class104)this.Field819.get(a3)).Method303();
            ++a3;
        }
        a2.Method1958(this.Field817.Method303(), a5, a);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        Class96 a3 = new Class96(Class96.Method3644(this.Field817, a2), null, Class96.Method3645(this.Field819, a2));
        a3.Field818.addAll((Collection)this.Field818);
        return a3.Method3646(this);
    }
}