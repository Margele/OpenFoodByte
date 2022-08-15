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
import awsl.Class91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Class122
extends Class91 {
    public int Field959;
    public int Field960;
    public Class104 Field961;
    public List Field962;

    public Class122(int a, int a2, Class104 a3, Class104[] a4) {
        super(170);
        this.Field959 = a;
        this.Field960 = a2;
        this.Field961 = a3;
        this.Field962 = new ArrayList();
        this.Field962.addAll((Collection)Arrays.asList((Object[])a4));
    }

    @Override
    public int Method0() {
        return 11;
    }

    @Override
    public void Method1(Class267 a) {
        Class264[] a2 = new Class264[this.Field962.Method1799()];
        int a3 = Class15.Method3445();
        int a4 = 0;
        if (a4 < a2.length) {
            a2[a4] = ((Class104)this.Field962.get(a4)).Method303();
            ++a4;
        }
        a.Method1959(this.Field959, this.Field960, this.Field961.Method303(), a2);
        this.Method3643(a);
    }

    @Override
    public Class91 Method2(Map a) {
        return new Class122(this.Field959, this.Field960, Class122.Method3644(this.Field961, a), Class122.Method3645(this.Field962, a)).Method3646(this);
    }
}