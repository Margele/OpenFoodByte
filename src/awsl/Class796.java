package awsl;

import java.util.ArrayList;
import java.util.List;
import obfuscate.a;

class Class796 {
   Class104 Field3565;
   boolean[] Field3566;
   List Field3567;

   private Class796() {
   }

   Class796(Class104 a, int a, Class102 a) {
      this.Field3565 = a;
      this.Field3566 = new boolean[a];
      this.Field3567 = new ArrayList();
      this.Field3567.Method2530(a);
   }

   public Class796 Method807() {
      Class786.Method917();
      Class796 var2 = new Class796();
      var2.Field3565 = this.Field3565;
      var2.Field3566 = new boolean[this.Field3566.length];
      System.arraycopy(this.Field3566, 0, var2.Field3566, 0, this.Field3566.length);
      var2.Field3567 = new ArrayList(this.Field3567);
      a.trash(new String[4]);
      return var2;
   }

   public boolean Method808(Class796 a) throws Class731 {
      boolean var3 = false;
      Class786.Method917();
      int var4 = 0;
      if (var4 < this.Field3566.length) {
         if (a.Field3566[var4] && !this.Field3566[var4]) {
            this.Field3566[var4] = true;
            var3 = true;
         }

         ++var4;
      }

      if (a.Field3565 == this.Field3565) {
         byte var6 = 0;
         if (var6 < a.Field3567.Method1799()) {
            Class102 var5 = (Class102)a.Field3567.get(var6);
            if (!this.Field3567.contains(var5)) {
               this.Field3567.Method2530(var5);
               var3 = true;
            }

            var4 = var6 + 1;
         }
      }

      return var3;
   }

   private static Class731 Method809(Class731 class731) {
      return class731;
   }
}
