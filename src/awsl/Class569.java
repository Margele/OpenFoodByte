/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package awsl;

import awsl.Class290;
import awsl.Class298;
import awsl.Class568;
import awsl.Class666;
import java.util.Iterator;

public class Class569 {
    /*
     * WARNING - void declaration
     */
    public static Class298 Method1007(String a) throws Class666 {
        void a2;
        Class298 class298 = new Class298();
        Class290 a3 = new Class290(a);
        int[] a4 = Class666.Method3438();
        if (a3.Method2884()) {
            String a5 = Class568.Method1252(a3.Method2891('='));
            a3.Method2887('=');
            a2.Method3009(a5, Class568.Method1252(a3.Method2891(';')));
            a3.Method2885();
        }
        return a2;
    }

    public static String Method1008(Class298 a) throws Class666 {
        boolean a2 = false;
        StringBuilder a3 = new StringBuilder();
        int[] a4 = Class666.Method3438();
        Iterator iterator = a.Method2968().Method1383();
        if (iterator.Method932()) {
            String a5 = (String)iterator.Method933();
            Object a6 = a.Method2974(a5);
            if (!Class298.Field1580.Method3429(a6)) {
                a3.append(';');
                a3.append(Class568.Method1249(a5));
                a3.append("=");
                a3.append(Class568.Method1249(a6.Method3780()));
                a2 = true;
            }
        }
        return a3.toString();
    }

    private static Class666 Method1009(Class666 class666) {
        return class666;
    }
}