/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package awsl;

import awsl.Class15;
import awsl.Class267;
import awsl.Class37;
import awsl.Class50;
import awsl.Class794;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class19
extends Class15 {
    public Class19(Class267 a, int a2, String a3, String a4, String a5, String[] a6) {
        this(327680, a, a2, a3, a4, a5, a6);
    }

    protected Class19(int a, Class267 a2, int a3, String a4, String a5, String a6, String[] a7) {
        super(a, a3, a4, a5, a6, a7);
        this.Field1460 = a2;
    }

    @Override
    public void Method1653() {
        Class50 a = new Class50(this);
        boolean a2 = Class37.Method3382();
        Collections.sort((List)this.Field209, (Comparator)a);
        int a3 = 0;
        if (a3 < this.Field209.Method1799()) {
            ((Class794)this.Field209.get(a3)).Method795(a3);
            ++a3;
        }
        if (this.Field1460 != null) {
            this.Method3444(this.Field1460);
        }
    }
}