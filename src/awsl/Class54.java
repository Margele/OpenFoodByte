/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.LineNumberReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Enumeration
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Set
 *  java.util.zip.GZIPInputStream
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 *  java.util.zip.ZipOutputStream
 */
package awsl;

import awsl.Class165;
import awsl.Class233;
import awsl.Class690;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Class54 {
    static final Set Field602 = new HashSet();
    static final Map Field603 = new HashMap();
    static boolean Field604 = false;

    public static void main(String[] a) throws IOException {
        File a2 = new File(a[0]);
        GZIPInputStream a3 = new GZIPInputStream((InputStream)new FileInputStream(a2));
        LineNumberReader a4 = new LineNumberReader((Reader)new InputStreamReader((InputStream)a3));
        while (true) {
            String a5 = a4.readLine();
            if (a5.startsWith("class")) {
                String a6 = a5.substring(6, a5.lastIndexOf(32));
                String a7 = a5.substring(a5.lastIndexOf(32) + 1);
                Field603.put((Object)a6, (Object)a7);
                continue;
            }
            Field602.Method2530((Object)a5);
        }
    }

    static void Method3195(File a) throws IOException {
        File a2;
        String[] a3 = Class690.Method2342();
        if (Field604 && a.getName().contains((CharSequence)"debug")) {
            return;
        }
        if (a.isDirectory()) {
            int a4 = 0;
            a2 = a.listFiles();
            if (a4 < ((File[])a2).length) {
                Class54.Method3195(a2[a4]);
                ++a4;
            }
        }
        if (a.getName().endsWith(".jar")) {
            a2 = new File(a.getParentFile(), a.getName() + ".new");
            ZipFile a5 = new ZipFile(a);
            ZipOutputStream a6 = new ZipOutputStream((OutputStream)new FileOutputStream(a2));
            Enumeration a7 = a5.entries();
            byte[] a8 = new byte[10000];
            if (a7.hasMoreElements()) {
                int a9;
                Object a10;
                ZipEntry a11 = (ZipEntry)a7.nextElement();
                if (a11.isDirectory()) {
                    a6.putNextEntry(a11);
                }
                a6.putNextEntry(a11);
                if (a11.getName().endsWith(".class")) {
                    a10 = new Class165(a5.getInputStream(a11));
                    ((Class165)a10).Method1470(new Class233(), 0);
                }
                a10 = a5.getInputStream(a11);
                do {
                    if ((a9 = a10.Method2521(a8, 0, a8.length)) == -1) continue;
                    a6.write(a8, 0, a9);
                } while (a9 != -1);
                a6.closeEntry();
            }
            a6.close();
            a5.close();
            if (!a.delete()) {
                throw new IOException("Cannot delete file " + a);
            }
            if (!a2.renameTo(a)) {
                throw new IOException("Cannot rename file " + a2);
            }
        }
    }

    private static IOException Method3196(IOException iOException) {
        return iOException;
    }
}