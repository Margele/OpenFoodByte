/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package awsl;

import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import java.util.HashMap;

final class Class857
extends Class831 {
    final Class730 Field3751;

    Class857(Class730 a) {
        this.Field3751 = a;
        super(a);
    }

    @Override
    public final void Method3514(String a) {
        HashMap a2 = (HashMap)this.Field3751.Method1964();
        int a3 = (Integer)a2.Method2665((Object)"version");
        int a4 = this.Method3656((String)a2.Method2665((Object)"access"));
        String a5 = (String)a2.Method2665((Object)"name");
        String a6 = (String)a2.Method2665((Object)"signature");
        String a7 = (String)a2.Method2665((Object)"parent");
        ArrayList a8 = (ArrayList)a2.Method2665((Object)"interfaces");
        String[] a9 = (String[])a8.toArray((Object[])new String[a8.Method1799()]);
        this.Field3751.Field3202.Method1447(a3, a4, a5, a6, a7, a9);
        this.Field3751.Method1950(this.Field3751.Field3202);
    }
}