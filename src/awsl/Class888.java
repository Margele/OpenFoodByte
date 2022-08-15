/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 */
package awsl;

import awsl.Class831;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class Class888 {
    private final HashMap Field3888 = new HashMap();
    private final ArrayList Field3889 = new ArrayList();
    private final ArrayList Field3890 = new ArrayList();

    Class888() {
    }

    public void Method3540(String a, Object a2) {
        String a3;
        String string = a;
        int[] a4 = Class831.Method3658();
        if (a.startsWith("*/")) {
            a3 = a.substring(1);
            this.Field3889.Method2530((Object)a3);
        }
        if (a.endsWith("/*")) {
            a3 = a.substring(0, a.length() - 1);
            this.Field3890.Method2530((Object)a3);
        }
        this.Field3888.put((Object)a3, a2);
    }

    public Object Method3541(String a) {
        String a2;
        int[] a3 = Class831.Method3658();
        if (this.Field3888.containsKey((Object)a)) {
            return this.Field3888.Method2665((Object)a);
        }
        int a4 = a.lastIndexOf(47);
        Iterator a5 = this.Field3889.Method1383();
        if (a5.Method932()) {
            a2 = (String)a5.Method933();
            if (a.substring(a4).endsWith(a2)) {
                return this.Field3888.Method2665((Object)a2);
            }
        }
        if ((a5 = this.Field3890.Method1383()).Method932()) {
            a2 = (String)a5.Method933();
            if (a.startsWith(a2)) {
                return this.Field3888.Method2665((Object)a2);
            }
        }
        return null;
    }
}