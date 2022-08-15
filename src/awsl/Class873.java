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
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class264;
import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class873
extends Class831 {
    final Class730 Field3808;

    Class873(Class730 a) {
        this.Field3808 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        HashMap a3 = new HashMap();
        a3.put((Object)"min", (Object)a2.getValue("min"));
        a3.put((Object)"max", (Object)a2.getValue("max"));
        a3.put((Object)"dflt", (Object)a2.getValue("dflt"));
        a3.put((Object)"labels", (Object)new ArrayList());
        this.Field3808.Method1950(a3);
    }

    @Override
    public final void Method3514(String a) {
        HashMap a2 = (HashMap)this.Field3808.Method1964();
        int a3 = Integer.parseInt((String)((String)a2.Method2665((Object)"min")));
        int a4 = Integer.parseInt((String)((String)a2.Method2665((Object)"max")));
        Class264 a5 = this.Method3654(a2.Method2665((Object)"dflt"));
        ArrayList a6 = (ArrayList)a2.Method2665((Object)"labels");
        Class264[] a7 = (Class264[])a6.toArray((Object[])new Class264[a6.Method1799()]);
        this.Method3655().Method1959(a3, a4, a5, a7);
    }
}