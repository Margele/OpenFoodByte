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

final class Class845
extends Class831 {
    final Class730 Field3733;

    Class845(Class730 a) {
        this.Field3733 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        HashMap a3 = new HashMap();
        a3.put((Object)"dflt", (Object)a2.getValue("dflt"));
        a3.put((Object)"labels", (Object)new ArrayList());
        a3.put((Object)"keys", (Object)new ArrayList());
        this.Field3733.Method1950(a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void Method3514(String a) {
        void a2;
        HashMap a3 = (HashMap)this.Field3733.Method1964();
        Class264 a4 = this.Method3654(a3.Method2665((Object)"dflt"));
        ArrayList a5 = (ArrayList)a3.Method2665((Object)"keys");
        ArrayList arrayList = (ArrayList)a3.Method2665((Object)"labels");
        int[] a6 = Class831.Method3658();
        Class264[] a7 = (Class264[])a2.toArray((Object[])new Class264[a2.Method1799()]);
        int a8 = 0;
        int[] a9 = new int[a5.Method1799()];
        if (a8 < a9.length) {
            a9[a8] = Integer.parseInt((String)((String)a5.get(a8)));
            ++a8;
        }
        this.Method3655().Method1958(a4, a9, a7);
    }
}