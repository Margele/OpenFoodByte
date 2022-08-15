/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Properties
 *  java.util.Set
 *  java.util.TreeSet
 */
package awsl;

import awsl.Class165;
import awsl.Class169;
import awsl.Class173;
import awsl.Class230;
import awsl.Class37;
import awsl.Class52;
import awsl.Class59;
import awsl.Class690;
import awsl.Class77;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class Class74 {
    static final HashMap Field692 = new HashMap();

    public static void main(String[] a) throws IOException {
        Map.Entry a2;
        Properties a3 = new Properties();
        int a4 = a.length - 1;
        for (int a5 = 0; a5 < a4 - 1; ++a5) {
            a3.load((InputStream)new FileInputStream(a[a5]));
        }
        Iterator a5 = a3.entrySet().Method1383();
        while (a5.Method932()) {
            a2 = (Map.Entry)a5.Method933();
            Field692.put((Object)((String)a2.getKey()), (Object)((String)a2.getValue()));
        }
        a5 = new HashSet((Collection)Field692.keySet());
        a2 = new File(a[a4 - 1]);
        File a6 = new File(a[a4]);
        Class74.Method3751((File)a2, a6, new Class59((Map)Field692, (Set)a5));
        Iterator a7 = a5.Method1383();
        while (a7.Method932()) {
            String a8 = (String)a7.Method933();
            if (a8.endsWith("/remove")) continue;
            System.out.println("INFO: unused mapping " + a8);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void Method3751(File a, File a2, Class37 a3) throws IOException {
        Object a4;
        String[] a5 = Class690.Method2342();
        if (a.isDirectory()) {
            int a6 = 0;
            a4 = a.listFiles();
            if (a6 < ((File[])a4).length) {
                Class74.Method3751(a4[a6], a2, a3);
                ++a6;
            }
        }
        if (a.getName().endsWith(".class")) {
            Object a7;
            a4 = new Class690();
            Class165 a8 = new Class165((InputStream)new FileInputStream(a));
            Class169 a9 = new Class169(0);
            Class230 a10 = new Class230(a9, (Class690)((Object)a4));
            Class173 a11 = new Class173(a10, a3);
            a8.Method1470(a11, 2);
            TreeSet a12 = new TreeSet((Comparator)new Class77());
            a12.addAll(a4.values());
            a8 = new Class165(a9.Method1503());
            a9 = new Class169(0);
            Iterator a13 = a12.Method1383();
            if (a13.Method932()) {
                a7 = (Class52)a13.Method933();
                ((Class52)a7).Method3192(a9);
            }
            a8.Method1470(a9, 2);
            if (Field692.Method2665((Object)(a8.Method1464() + "/remove")) != null) {
                return;
            }
            a7 = a3.Method3374(a8.Method1464());
            File a14 = new File(a2, (String)a7 + ".class");
            if (!a14.exists() || a14.lastModified() < a.lastModified()) {
                if (!a14.getParentFile().exists() && !a14.getParentFile().mkdirs()) {
                    throw new IOException("Cannot create directory " + a14.getParentFile());
                }
                try (FileOutputStream a15 = new FileOutputStream(a14);){
                    a15.write(a9.Method1503());
                }
            }
        }
    }

    private static IOException Method3752(IOException iOException) {
        return iOException;
    }
}