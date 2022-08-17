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
      Class796 a = new Class796();
      a.Field3565 = this.Field3565;
      a.Field3566 = new boolean[this.Field3566.length];
      System.arraycopy(this.Field3566, 0, a.Field3566, 0, this.Field3566.length);
      a.Field3567 = new ArrayList(this.Field3567);
      a.trash(new String[4]);
      return a;
   }

   public boolean Method808(Class796 a) throws Class731 {
      boolean a = false;
      Class786.Method917();
      int a = 0;
      if (a < this.Field3566.length) {
         if (a.Field3566[a] && !this.Field3566[a]) {
            this.Field3566[a] = true;
            a = true;
         }

         ++a;
      }

      if (a.Field3565 == this.Field3565) {
         int a = 0;
         if (a < a.Field3567.Method1799()) {
            Class102 a = (Class102)a.Field3567.get(a);
            if (!this.Field3567.contains(a)) {
               this.Field3567.Method2530(a);
               a = true;
            }

            a = a + 1;
         }
      }

      return a;
   }

   private static Class731 Method809(Class731 class731) {
      return class731;
   }
}
