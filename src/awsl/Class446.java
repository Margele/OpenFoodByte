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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import obfuscate.a;

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
    public static List Method2766(String a2) {
        void a3;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = Class446.Method2764().Method1383();
        String[] a4 = Class447.Method2759();
        if (iterator.Method932()) {
            Class447 a5 = (Class447)iterator.Method933();
            if (a5.Method2755().equalsIgnoreCase(a2)) {
                a3.Method2530((Object)a5);
            }
        }
        if (a.trash() == null) {
            Class447.Method2758(new String[4]);
        }
        return a3;
    }

    public static Class447 Method2767(String a2, String a3) {
        Iterator iterator = Class446.Method2764().Method1383();
        String[] a4 = Class447.Method2759();
        if (iterator.Method932()) {
            Class447 a5 = (Class447)iterator.Method933();
            if (a5.Method2755().equalsIgnoreCase(a2) && a5.Method2754().equals((Object)a3)) {
                return a5;
            }
        }
        return null;
    }

    public static List Method2768(String a2) {
        ArrayList a3 = new ArrayList();
        String[] a4 = Class447.Method2759();
        Iterator iterator = Class446.Method2764().Method1383();
        if (iterator.Method932()) {
            Class447 a5 = (Class447)iterator.Method933();
            if (a5.Method2755().equals((Object)a2)) {
                a3.Method2530((Object)a5);
            }
            a.trash(new String[4]);
        }
        return a3;
    }
}