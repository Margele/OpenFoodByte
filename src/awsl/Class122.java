/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
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

public class Class122
extends a {
    public int Field959;
    public int Field960;
    public Class104 Field961;
    public List Field962;

    public Class122(int a2, int a3, Class104 a4, Class104[] a5) {
        super(170);
        this.Field959 = a2;
        this.Field960 = a3;
        this.Field961 = a4;
        this.Field962 = new ArrayList();
        this.Field962.addAll((Collection)Arrays.asList((Object[])a5));
    }

    @Override
    public int Method0() {
        return 11;
    }

    @Override
    public void Method1(Class267 a2) {
        Class264[] a3 = new Class264[this.Field962.Method1799()];
        int a4 = Class15.Method3445();
        int a5 = 0;
        if (a5 < a3.length) {
            a3[a5] = ((Class104)this.Field962.get(a5)).Method303();
            ++a5;
        }
        a2.Method1959(this.Field959, this.Field960, this.Field961.Method303(), a3);
        this.Method3643(a2);
    }

    @Override
    public a Method2(Map a2) {
        return new Class122(this.Field959, this.Field960, Class122.Method3644(this.Field961, a2), Class122.Method3645(this.Field962, a2)).Method3646(this);
    }
}