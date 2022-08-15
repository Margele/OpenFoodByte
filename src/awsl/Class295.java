/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Enumeration
 *  java.util.Iterator
 *  java.util.Properties
 */
package awsl;

import awsl.Class298;
import awsl.Class666;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class Class295 {
    public static Class298 Method2943(Properties a) throws Class666 {
        Enumeration a2;
        Class298 a3 = new Class298();
        int[] a4 = Class666.Method3438();
        if (!a.isEmpty() && (a2 = a.propertyNames()).hasMoreElements()) {
            String a5 = (String)a2.nextElement();
            a3.Method3009(a5, a.getProperty(a5));
        }
        return a3;
    }

    public static Properties Method2944(Class298 a) throws Class666 {
        Properties a2 = new Properties();
        int[] a3 = Class666.Method3438();
        Iterator iterator = a.Method2968().Method1383();
        if (iterator.Method932()) {
            String a4 = (String)iterator.Method933();
            Object a5 = a.Method2974(a4);
            if (!Class298.Field1580.Method3429(a5)) {
                a2.put((Object)a4, (Object)a5.Method3780());
            }
        }
        return a2;
    }

    private static Class666 Method2945(Class666 class666) {
        return class666;
    }
}