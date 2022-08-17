package awsl;

import java.util.ArrayList;
import java.util.HashMap;

final class Class857 extends Class831 {
   final Class730 Field3751;

   Class857(Class730 a) {
      super(a);
      this.Field3751 = a;
   }

   public final void Method3514(String a) {
      HashMap a = (HashMap)this.Field3751.Method1964();
      int a = (Integer)a.Method2665("version");
      int a = this.Method3656((String)a.Method2665("access"));
      String a = (String)a.Method2665("name");
      String a = (String)a.Method2665("signature");
      String a = (String)a.Method2665("parent");
      ArrayList a = (ArrayList)a.Method2665("interfaces");
      String[] a = (String[])a.toArray(new String[a.Method1799()]);
      this.Field3751.Field3202.Method1447(a, a, a, a, a, a);
      this.Field3751.Method1950(this.Field3751.Field3202);
   }
}
