/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 */
package awsl;

import awsl.Class104;
import awsl.Class126;
import awsl.Class15;
import awsl.Class264;
import awsl.Class267;
import awsl.Class31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Class128
extends Class126 {
    public List Field977;
    public List Field978;
    public List Field979;

    public Class128(int a, Class31 a2, Class104[] a3, Class104[] a4, int[] a5, String a6) {
        this(327680, a, a2, a3, a4, a5, a6);
    }

    public Class128(int a, int a2, Class31 a3, Class104[] a4, Class104[] a5, int[] a6, String a7) {
        super(a, a2, a3, a7);
        this.Field977 = new ArrayList(a4.length);
        int n = Class15.Method1984();
        this.Field977.addAll((Collection)Arrays.asList((Object[])a4));
        this.Field978 = new ArrayList(a5.length);
        this.Field978.addAll((Collection)Arrays.asList((Object[])a5));
        this.Field979 = new ArrayList(a6.length);
        int a8 = n;
        int[] nArray = a6;
        int n2 = nArray.length;
        int n3 = 0;
        if (n3 < n2) {
            int a9 = nArray[n3];
            this.Field979.Method2530((Object)a9);
            ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method679(Class267 a, boolean a2) {
        void a3;
        Class264[] a4 = new Class264[this.Field977.Method1799()];
        Class264[] class264Array = new Class264[this.Field978.Method1799()];
        int a5 = Class15.Method3445();
        int[] a6 = new int[this.Field979.Method1799()];
        int a7 = 0;
        if (a7 < a4.length) {
            a4[a7] = ((Class104)this.Field977.get(a7)).Method303();
            a3[a7] = ((Class104)this.Field978.get(a7)).Method303();
            a6[a7] = (Integer)this.Field979.get(a7);
            ++a7;
        }
        this.Method646(a.Method1844(this.Field975, this.Field976, a4, (Class264[])a3, a6, this.Field973, true));
    }
}