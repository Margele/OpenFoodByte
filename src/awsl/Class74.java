package awsl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
      Properties a = new Properties();
      int a = a.length - 1;

      for(int a = 0; a < a - 1; ++a) {
         a.load(new FileInputStream(a[a]));
      }

      Iterator var8 = a.entrySet().Method1383();

      while(var8.Method932()) {
         Map.Entry a = (Map.Entry)var8.Method933();
         Field692.put((String)a.getKey(), (String)a.getValue());
      }

      Set a = new HashSet(Field692.keySet());
      File a = new File(a[a - 1]);
      File a = new File(a[a]);
      Method3751(a, a, new Class59(Field692, a));
      Iterator a = a.Method1383();

      while(a.Method932()) {
         String a = (String)a.Method933();
         if (!a.endsWith("/remove")) {
            System.out.println("INFO: unused mapping " + a);
         }
      }

   }

   static void Method3751(File a, File a, Class37 a) throws IOException {
      String[] a = Class690.Method2342();
      if (a.isDirectory()) {
         File[] a = a.listFiles();
         int a = 0;
         if (a < a.length) {
            Method3751(a[a], a, a);
            ++a;
         }
      }

      if (a.getName().endsWith(".class")) {
         Class690 a = new Class690();
         Class165 a = new Class165(new FileInputStream(a));
         Class169 a = new Class169(0);
         Class230 a = new Class230(a, a);
         Class173 a = new Class173(a, a);
         a.Method1470(a, 2);
         Set a = new TreeSet(new Class77());
         a.addAll(a.values());
         a = new Class165(a.Method1503());
         a = new Class169(0);
         Iterator a = a.Method1383();
         if (a.Method932()) {
            Class52 a = (Class52)a.Method933();
            a.Method3192(a);
         }

         a.Method1470(a, 2);
         if (Field692.Method2665(a.Method1464() + "/remove") != null) {
            return;
         }

         String a = a.Method3374(a.Method1464());
         File a = new File(a, a + ".class");
         if (!a.exists() || a.lastModified() < a.lastModified()) {
            if (!a.getParentFile().exists() && !a.getParentFile().mkdirs()) {
               throw new IOException("Cannot create directory " + a.getParentFile());
            }

            OutputStream a = new FileOutputStream(a);

            try {
               a.write(a.Method1503());
            } finally {
               a.close();
            }
         }
      }

   }

   private static IOException Method3752(IOException iOException) {
      return iOException;
   }
}
