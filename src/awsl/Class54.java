package awsl;

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
      File var1 = new File(a[0]);
      GZIPInputStream var2 = new GZIPInputStream(new FileInputStream(var1));
      LineNumberReader var3 = new LineNumberReader(new InputStreamReader(var2));

      while(true) {
         while(true) {
            String var4 = var3.readLine();
            if (var4.startsWith("class")) {
               String var5 = var4.substring(6, var4.lastIndexOf(32));
               String var6 = var4.substring(var4.lastIndexOf(32) + 1);
               Field603.put(var5, var6);
            } else {
               Field602.Method2530(var4);
            }
         }
      }
   }

   static void Method3195(File a) throws IOException {
      String[] var1 = Class690.Method2342();
      if (!Field604 || !a.getName().contains("debug")) {
         if (a.isDirectory()) {
            File[] var2 = a.listFiles();
            int var3 = 0;
            if (var3 < var2.length) {
               Method3195(var2[var3]);
               ++var3;
            }
         }

         if (a.getName().endsWith(".jar")) {
            File var10 = new File(a.getParentFile(), a.getName() + ".new");
            ZipFile var11 = new ZipFile(a);
            ZipOutputStream var4 = new ZipOutputStream(new FileOutputStream(var10));
            Enumeration var5 = var11.entries();
            byte[] var6 = new byte[10000];
            if (var5.hasMoreElements()) {
               ZipEntry var7 = (ZipEntry)var5.nextElement();
               if (var7.isDirectory()) {
                  var4.putNextEntry(var7);
               }

               var4.putNextEntry(var7);
               if (var7.getName().endsWith(".class")) {
                  Class165 var8 = new Class165(var11.getInputStream(var7));
                  var8.Method1470(new Class233(), 0);
               }

               InputStream var12 = var11.getInputStream(var7);

               while(true) {
                  int var9 = var12.Method2521(var6, 0, var6.length);
                  if (var9 != -1) {
                     var4.write(var6, 0, var9);
                  }

                  if (var9 == -1) {
                     var4.closeEntry();
                     break;
                  }
               }
            }

            var4.close();
            var11.close();
            if (!a.delete()) {
               throw new IOException("Cannot delete file " + a);
            }

            if (!var10.renameTo(a)) {
               throw new IOException("Cannot rename file " + var10);
            }
         }

      }
   }

   private static IOException Method3196(IOException iOException) {
      return iOException;
   }
}
