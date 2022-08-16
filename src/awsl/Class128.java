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

    public Class128(int a2, Class31 a3, Class104[] a4, Class104[] a5, int[] a6, String a7) {
        this(327680, a2, a3, a4, a5, a6, a7);
    }

    public Class128(int a2, int a3, Class31 a4, Class104[] a5, Class104[] a6, int[] a7, String a8) {
        super(a2, a3, a4, a8);
        this.Field977 = new ArrayList(a5.length);
        int n = Class15.Method1984();
        this.Field977.addAll((Collection)Arrays.asList((Object[])a5));
        this.Field978 = new ArrayList(a6.length);
        this.Field978.addAll((Collection)Arrays.asList((Object[])a6));
        this.Field979 = new ArrayList(a7.length);
        int a9 = n;
        int[] nArray = a7;
        int n2 = nArray.length;
        int n3 = 0;
        if (n3 < n2) {
            int a10 = nArray[n3];
            this.Field979.Method2530((Object)a10);
            ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method679(Class267 a2, boolean a3) {
        void a4;
        Class264[] a5 = new Class264[this.Field977.Method1799()];
        Class264[] class264Array = new Class264[this.Field978.Method1799()];
        int a6 = Class15.Method3445();
        int[] a7 = new int[this.Field979.Method1799()];
        int a8 = 0;
        if (a8 < a5.length) {
            a5[a8] = ((Class104)this.Field977.get(a8)).Method303();
            a4[a8] = ((Class104)this.Field978.get(a8)).Method303();
            a7[a8] = (Integer)this.Field979.get(a8);
            ++a8;
        }
        this.Method646(a2.Method1844(this.Field975, this.Field976, a5, (Class264[])a4, a7, this.Field973, true));
    }
}