/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
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

final class Class822
extends Class831 {
    final Class730 Field3659;

    Class822(Class730 a) {
        this.Field3659 = a;
        super(a);
    }

    @Override
    public final void Method3514(String a) {
        HashMap a2 = (HashMap)this.Field3659.Method1964();
        int a3 = this.Method3656((String)a2.Method2665((Object)"access"));
        String a4 = (String)a2.Method2665((Object)"name");
        String a5 = (String)a2.Method2665((Object)"desc");
        String a6 = (String)a2.Method2665((Object)"signature");
        ArrayList a7 = (ArrayList)a2.Method2665((Object)"exceptions");
        String[] a8 = (String[])a7.toArray((Object[])new String[a7.Method1799()]);
        this.Field3659.Method1950(this.Field3659.Field3202.Method1451(a3, a4, a5, a6, a8));
    }
}