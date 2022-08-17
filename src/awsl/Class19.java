package awsl;

import java.util.Collections;
import java.util.Comparator;

public class Class19 extends Class15 {
   public Class19(Class267 a, int a, String a, String a, String a, String[] a) {
      this(327680, a, a, a, a, a, a);
   }

   protected Class19(int a, Class267 a, int a, String a, String a, String a, String[] a) {
      super(a, a, a, a, a, a);
      this.Field1460 = a;
   }

   public void Method1653() {
      Class37.Method3382();
      Comparator a = new Class50(this);
      Collections.sort(this.Field209, a);
      int a = 0;
      if (a < this.Field209.Method1799()) {
         ((Class794)this.Field209.get(a)).Method795(a);
         ++a;
      }

      if (this.Field1460 != null) {
         this.Method3444(this.Field1460);
      }

   }
}
