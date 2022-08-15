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
import awsl.Class91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Class96
extends Class91 {
    public Class104 Field817;
    public List Field818;
    public List Field819;

    public Class96(Class104 a, int[] a2, Class104[] a3) {
        super(171);
        this.Field817 = a;
        int a4 = Class15.Method1984();
        this.Field818 = new ArrayList(0);
        this.Field819 = new ArrayList(0);
        int a5 = 0;
        if (a5 < a2.length) {
            this.Field818.Method2530((Object)new Integer(a2[a5]));
            ++a5;
        }
        this.Field819.addAll((Collection)Arrays.asList((Object[])a3));
    }

    @Override
    public int Method0() {
        return 12;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method1(Class267 a) {
        int a2;
        void a3;
        int[] a4 = new int[this.Field818.Method1799()];
        boolean bl = false;
        int a5 = Class15.Method1984();
        if (a3 < a4.length) {
            a4[a3] = (Integer)this.Field818.get((int)a3);
            ++a3;
        }
        if ((a2 = 0) < (a = new Class264[this.Field819.Method1799()]).length) {
            a[a2] = ((Class104)this.Field819.get(a2)).Method303();
            ++a2;
        }
        a.Method1958(this.Field817.Method303(), a4, a);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        Class96 a2 = new Class96(Class96.Method3644(this.Field817, a), null, Class96.Method3645(this.Field819, a));
        a2.Field818.addAll((Collection)this.Field818);
        return a2.Method3646(this);
    }
}