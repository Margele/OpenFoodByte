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
      String var4 = a;
      if (a.startsWith("*/")) {
         var4 = a.substring(1);
         this.Field3889.Method2530(var4);
      }

      if (a.endsWith("/*")) {
         var4 = a.substring(0, a.length() - 1);
         this.Field3890.Method2530(var4);
      }

      this.Field3888.put(var4, a);
   }

   public Object Method3541(String a) {
      int[] var2 = Class831.Method3658();
      if (this.Field3888.containsKey(a)) {
         return this.Field3888.Method2665(a);
      } else {
         int var3 = a.lastIndexOf(47);
         Iterator var4 = this.Field3889.Method1383();
         String var5;
         if (var4.Method932()) {
            var5 = (String)var4.Method933();
            if (a.substring(var3).endsWith(var5)) {
               return this.Field3888.Method2665(var5);
            }
         }

         var4 = this.Field3890.Method1383();
         if (var4.Method932()) {
            var5 = (String)var4.Method933();
            if (a.startsWith(var5)) {
               return this.Field3888.Method2665(var5);
            }
         }

         return null;
      }
   }
}
