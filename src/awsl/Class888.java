package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class Class888 {
   private final HashMap Field3888 = new HashMap();
   private final ArrayList Field3889 = new ArrayList();
   private final ArrayList Field3890 = new ArrayList();

   public void Method3540(String a, Object a) {
      Class831.Method3658();
      String a = a;
      if (a.startsWith("*/")) {
         a = a.substring(1);
         this.Field3889.Method2530(a);
      }

      if (a.endsWith("/*")) {
         a = a.substring(0, a.length() - 1);
         this.Field3890.Method2530(a);
      }

      this.Field3888.put(a, a);
   }

   public Object Method3541(String a) {
      int[] a = Class831.Method3658();
      if (this.Field3888.containsKey(a)) {
         return this.Field3888.Method2665(a);
      } else {
         int a = a.lastIndexOf(47);
         Iterator a = this.Field3889.Method1383();
         String a;
         if (a.Method932()) {
            a = (String)a.Method933();
            if (a.substring(a).endsWith(a)) {
               return this.Field3888.Method2665(a);
            }
         }

         a = this.Field3890.Method1383();
         if (a.Method932()) {
            a = (String)a.Method933();
            if (a.startsWith(a)) {
               return this.Field3888.Method2665(a);
            }
         }

         return null;
      }
   }
}
