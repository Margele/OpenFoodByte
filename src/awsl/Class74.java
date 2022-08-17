package awsl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeSet;

public class Class74 {
   static final HashMap Field692 = new HashMap();

   public static void main(String[] a) throws IOException {
      Properties var1 = new Properties();
      int var2 = a.length - 1;

      for(int var3 = 0; var3 < var2 - 1; ++var3) {
         var1.load(new FileInputStream(a[var3]));
      }

      Iterator var8 = var1.entrySet().Method1383();

      while(var8.Method932()) {
         Map.Entry var4 = (Map.Entry)var8.Method933();
         Field692.put((String)var4.getKey(), (String)var4.getValue());
      }

      HashSet var9 = new HashSet(Field692.keySet());
      File var10 = new File(a[var2 - 1]);
      File var5 = new File(a[var2]);
      Method3751(var10, var5, new Class59(Field692, var9));
      Iterator var6 = var9.Method1383();

      while(var6.Method932()) {
         String var7 = (String)var6.Method933();
         if (!var7.endsWith("/remove")) {
            System.out.println("INFO: unused mapping " + var7);
         }
      }

   }

   static void Method3751(File a, File a, Class37 a) throws IOException {
      String[] var3 = Class690.Method2342();
      if (a.isDirectory()) {
         File[] var4 = a.listFiles();
         int var5 = 0;
         if (var5 < var4.length) {
            Method3751(var4[var5], a, a);
            ++var5;
         }
      }

      if (a.getName().endsWith(".class")) {
         Class690 var17 = new Class690();
         Class165 var18 = new Class165(new FileInputStream(a));
         Class169 var6 = new Class169(0);
         Class230 var7 = new Class230(var6, var17);
         Class173 var8 = new Class173(var7, a);
         var18.Method1470(var8, 2);
         TreeSet var9 = new TreeSet(new Class77());
         var9.addAll(var17.values());
         var18 = new Class165(var6.Method1503());
         var6 = new Class169(0);
         Iterator var10 = var9.Method1383();
         if (var10.Method932()) {
            Class52 var11 = (Class52)var10.Method933();
            var11.Method3192(var6);
         }

         var18.Method1470(var6, 2);
         if (Field692.Method2665(var18.Method1464() + "/remove") != null) {
            return;
         }

         String var19 = a.Method3374(var18.Method1464());
         File var12 = new File(a, var19 + ".class");
         if (!var12.exists() || var12.lastModified() < a.lastModified()) {
            if (!var12.getParentFile().exists() && !var12.getParentFile().mkdirs()) {
               throw new IOException("Cannot create directory " + var12.getParentFile());
            }

            FileOutputStream var13 = new FileOutputStream(var12);

            try {
               var13.write(var6.Method1503());
            } finally {
               var13.close();
            }
         }
      }

   }

   private static IOException Method3752(IOException iOException) {
      return iOException;
   }
}
