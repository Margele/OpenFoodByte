package awsl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
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
      File a = new File(a[0]);
      InputStream a = new GZIPInputStream(new FileInputStream(a));
      BufferedReader a = new LineNumberReader(new InputStreamReader(a));

      while(true) {
         while(true) {
            String a = a.readLine();
            if (a.startsWith("class")) {
               String a = a.substring(6, a.lastIndexOf(32));
               String a = a.substring(a.lastIndexOf(32) + 1);
               Field603.put(a, a);
            } else {
               Field602.Method2530(a);
            }
         }
      }
   }

   static void Method3195(File a) throws IOException {
      String[] a = Class690.Method2342();
      if (!Field604 || !a.getName().contains("debug")) {
         if (a.isDirectory()) {
            File[] a = a.listFiles();
            int a = 0;
            if (a < a.length) {
               Method3195(a[a]);
               ++a;
            }
         }

         if (a.getName().endsWith(".jar")) {
            File a = new File(a.getParentFile(), a.getName() + ".new");
            ZipFile a = new ZipFile(a);
            ZipOutputStream a = new ZipOutputStream(new FileOutputStream(a));
            Enumeration a = a.entries();
            byte[] a = new byte[10000];
            if (a.hasMoreElements()) {
               ZipEntry a = (ZipEntry)a.nextElement();
               if (a.isDirectory()) {
                  a.putNextEntry(a);
               }

               a.putNextEntry(a);
               if (a.getName().endsWith(".class")) {
                  Class165 a = new Class165(a.getInputStream(a));
                  a.Method1470(new Class233(), 0);
               }

               InputStream a = a.getInputStream(a);

               while(true) {
                  int a = a.Method2521(a, 0, a.length);
                  if (a != -1) {
                     a.write(a, 0, a);
                  }

                  if (a == -1) {
                     a.closeEntry();
                     break;
                  }
               }
            }

            a.close();
            a.close();
            if (!a.delete()) {
               throw new IOException("Cannot delete file " + a);
            }

            if (!a.renameTo(a)) {
               throw new IOException("Cannot rename file " + a);
            }
         }

      }
   }

   private static IOException Method3196(IOException iOException) {
      return iOException;
   }
}
