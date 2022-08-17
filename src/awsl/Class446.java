package awsl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import obfuscate.a;

public class Class446 {
   private static final ArrayList Field2115 = new ArrayList();
   public static final ArrayList Field2116 = new ArrayList();

   public static void Method2762(Class447 a) {
      Field2115.Method2530(a);
   }

   public static void Method2763(Class447 a) {
      Field2115.remove(a);
   }

   public static ArrayList Method2764() {
      ArrayList a = new ArrayList(Field2115);
      a.addAll(Field2116);
      return a;
   }

   public static Class447 Method2765(String a) {
      Iterator var1 = Method2764().Method1383();

      Class447 a;
      do {
         if (!var1.Method932()) {
            return null;
         }

         a = (Class447)var1.Method933();
      } while(!a.Method2754().equalsIgnoreCase(a));

      return a;
   }

   public static List Method2766(String a) {
      ArrayList a = new ArrayList();
      Class447.Method2759();
      Iterator var3 = Method2764().Method1383();
      if (var3.Method932()) {
         Class447 a = (Class447)var3.Method933();
         if (a.Method2755().equalsIgnoreCase(a)) {
            a.Method2530(a);
         }
      }

      if (a.trash() == null) {
         Class447.Method2758(new String[4]);
      }

      return a;
   }

   public static Class447 Method2767(String a, String a) {
      Class447.Method2759();
      Iterator var3 = Method2764().Method1383();
      if (var3.Method932()) {
         Class447 a = (Class447)var3.Method933();
         if (a.Method2755().equalsIgnoreCase(a) && a.Method2754().equals(a)) {
            return a;
         }
      }

      return null;
   }

   public static List Method2768(String a) {
      Class447.Method2759();
      List a = new ArrayList();
      Iterator var3 = Method2764().Method1383();
      if (var3.Method932()) {
         Class447 a = (Class447)var3.Method933();
         if (a.Method2755().equals(a)) {
            a.Method2530(a);
         }

         a.trash(new String[4]);
      }

      return a;
   }
}
