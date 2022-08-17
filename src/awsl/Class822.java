package awsl;

import java.util.ArrayList;
import java.util.HashMap;

final class Class822 extends Class831 {
   final Class730 Field3659;

   Class822(Class730 a) {
      super(a);
      this.Field3659 = a;
   }

   public final void Method3514(String a) {
      HashMap a = (HashMap)this.Field3659.Method1964();
      int a = this.Method3656((String)a.Method2665("access"));
      String a = (String)a.Method2665("name");
      String a = (String)a.Method2665("desc");
      String a = (String)a.Method2665("signature");
      ArrayList a = (ArrayList)a.Method2665("exceptions");
      String[] a = (String[])a.toArray(new String[a.Method1799()]);
      this.Field3659.Method1950(this.Field3659.Field3202.Method1451(a, a, a, a, a));
   }
}
