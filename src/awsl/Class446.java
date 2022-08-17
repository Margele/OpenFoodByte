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
      ArrayList var0 = new ArrayList(Field2115);
      var0.addAll(Field2116);
      return var0;
   }

   public static Class447 Method2765(String a) {
      Iterator var1 = Method2764().Method1383();

      Class447 var2;
      do {
         if (!var1.Method932()) {
            return null;
         }

         var2 = (Class447)var1.Method933();
      } while(!var2.Method2754().equalsIgnoreCase(a));

      return var2;
   }

   public static List Method2766(String a) {
      ArrayList var2 = new ArrayList();
      Class447.Method2759();
      Iterator var3 = Method2764().Method1383();
      if (var3.Method932()) {
         Class447 var4 = (Class447)var3.Method933();
         if (var4.Method2755().equalsIgnoreCase(a)) {
            var2.Method2530(var4);
         }
      }

      if (a.trash() == null) {
         Class447.Method2758(new String[4]);
      }

      return var2;
   }

   public static Class447 Method2767(String a, String a) {
      Class447.Method2759();
      Iterator var3 = Method2764().Method1383();
      if (var3.Method932()) {
         Class447 var4 = (Class447)var3.Method933();
         if (var4.Method2755().equalsIgnoreCase(a) && var4.Method2754().equals(a)) {
            return var4;
         }
      }

      return null;
   }

   public static List Method2768(String a) {
      Class447.Method2759();
      ArrayList var2 = new ArrayList();
      Iterator var3 = Method2764().Method1383();
      if (var3.Method932()) {
         Class447 var4 = (Class447)var3.Method933();
         if (var4.Method2755().equals(a)) {
            var2.Method2530(var4);
         }

         a.trash(new String[4]);
      }

      return var2;
   }
}
