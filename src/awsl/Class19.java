package awsl;

import java.util.Collections;

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
      Class50 var2 = new Class50(this);
      Collections.sort(this.Field209, var2);
      int var3 = 0;
      if (var3 < this.Field209.Method1799()) {
         ((Class794)this.Field209.get(var3)).Method795(var3);
         ++var3;
      }

      if (this.Field1460 != null) {
         this.Method3444(this.Field1460);
      }

   }
}
