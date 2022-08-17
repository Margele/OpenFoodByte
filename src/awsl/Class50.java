package awsl;

import java.util.Comparator;

class Class50 implements Comparator {
   final Class19 Field587;

   Class50(Class19 a) {
      this.Field587 = a;
   }

   public int Method3197(Class794 a, Class794 a) {
      int var3 = this.Method3198(a);
      int var4 = this.Method3198(a);
      return var3 - var4;
   }

   private int Method3198(Class794 a) {
      int var2 = this.Field587.Field208.Method188(a.Field3559);
      int var3 = this.Field587.Field208.Method188(a.Field3560);
      return var3 - var2;
   }

   public int Method2141(Object object1, Object object2) {
      return this.Method3197((Class794)object1, (Class794)object2);
   }
}
