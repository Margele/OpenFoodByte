/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package awsl;

import awsl.Class447;
import awsl.Class91;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Class446 {
    private static final ArrayList Field2115 = new ArrayList();
    public static final ArrayList Field2116 = new ArrayList();

    public static void Method2762(Class447 a) {
        Field2115.Method2530((Object)a);
    }

    public static void Method2763(Class447 a) {
        Field2115.remove((Object)a);
    }

    public static ArrayList Method2764() {
        ArrayList a = new ArrayList((Collection)Field2115);
        a.addAll((Collection)Field2116);
        return a;
    }

    public static Class447 Method2765(String a) {
        Iterator iterator = Class446.Method2764().Method1383();
        while (iterator.Method932()) {
            Class447 a2 = (Class447)iterator.Method933();
            if (!a2.Method2754().equalsIgnoreCase(a)) continue;
            return a2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static List Method2766(String a) {
        void a2;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = Class446.Method2764().Method1383();
        String[] a3 = Class447.Method2759();
        if (iterator.Method932()) {
            Class447 a4 = (Class447)iterator.Method933();
            if (a4.Method2755().equalsIgnoreCase(a)) {
                a2.Method2530((Object)a4);
            }
        }
        if (Class91.Method3648() == null) {
            Class447.Method2758(new String[4]);
        }
        return a2;
    }

    public static Class447 Method2767(String a, String a2) {
        Iterator iterator = Class446.Method2764().Method1383();
        String[] a3 = Class447.Method2759();
        if (iterator.Method932()) {
            Class447 a4 = (Class447)iterator.Method933();
            if (a4.Method2755().equalsIgnoreCase(a) && a4.Method2754().equals((Object)a2)) {
                return a4;
            }
        }
        return null;
    }

    public static List Method2768(String a) {
        ArrayList a2 = new ArrayList();
        String[] a3 = Class447.Method2759();
        Iterator iterator = Class446.Method2764().Method1383();
        if (iterator.Method932()) {
            Class447 a4 = (Class447)iterator.Method933();
            if (a4.Method2755().equals((Object)a)) {
                a2.Method2530((Object)a4);
            }
            Class91.Method3647(new String[4]);
        }
        return a2;
    }
}