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

import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class826
extends Class831 {
    final Class730 Field3667;

    Class826(Class730 a) {
        this.Field3667 = a;
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method3501(String a, Attributes a2) {
        void a3;
        ArrayList arrayList = (ArrayList)((HashMap)this.Field3667.Method1963()).Method2665((Object)a);
        int[] a4 = Class831.Method3658();
        String a5 = a2.getValue("type");
        if ("uninitialized".equals((Object)a5)) {
            a3.Method2530((Object)this.Method3654(a2.getValue("label")));
        }
        Integer a6 = (Integer)Class730.Field3207.Method2665((Object)a5);
        a3.Method2530((Object)a5);
        a3.Method2530((Object)a6);
    }
}