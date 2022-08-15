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

final class Class825
extends Class831 {
    final Class730 Field3666;

    Class825(Class730 a) {
        this.Field3666 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) {
        HashMap a3 = new HashMap();
        a3.put((Object)"local", (Object)new ArrayList());
        a3.put((Object)"stack", (Object)new ArrayList());
        this.Field3666.Method1950(a2.getValue("type"));
        this.Field3666.Method1950(a2.getValue("count") == null ? "0" : a2.getValue("count"));
        this.Field3666.Method1950(a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method3514(String a) {
        void a2;
        HashMap a3 = (HashMap)this.Field3666.Method1964();
        ArrayList a4 = (ArrayList)a3.Method2665((Object)"local");
        int n = a4.Method1799();
        int[] a5 = Class831.Method3658();
        Object[] a6 = a4.toArray();
        ArrayList a7 = (ArrayList)a3.Method2665((Object)"stack");
        int a8 = a7.Method1799();
        Object[] a9 = a7.toArray();
        String a10 = (String)this.Field3666.Method1964();
        String a11 = (String)this.Field3666.Method1964();
        if ("NEW".equals((Object)a11)) {
            this.Method3655().Method1845(-1, (int)a2, a6, a8, a9);
        }
        if ("FULL".equals((Object)a11)) {
            this.Method3655().Method1845(0, (int)a2, a6, a8, a9);
        }
        if ("APPEND".equals((Object)a11)) {
            this.Method3655().Method1845(1, (int)a2, a6, 0, null);
        }
        if ("CHOP".equals((Object)a11)) {
            this.Method3655().Method1845(2, Integer.parseInt((String)a10), null, 0, null);
        }
        if ("SAME".equals((Object)a11)) {
            this.Method3655().Method1845(3, 0, null, 0, null);
        }
        if ("SAME1".equals((Object)a11)) {
            this.Method3655().Method1845(4, 0, null, a8, a9);
        }
    }
}