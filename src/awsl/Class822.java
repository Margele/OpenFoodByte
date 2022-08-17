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
      HashMap var2 = (HashMap)this.Field3659.Method1964();
      int var3 = this.Method3656((String)var2.Method2665("access"));
      String var4 = (String)var2.Method2665("name");
      String var5 = (String)var2.Method2665("desc");
      String var6 = (String)var2.Method2665("signature");
      ArrayList var7 = (ArrayList)var2.Method2665("exceptions");
      String[] var8 = (String[])var7.toArray(new String[var7.Method1799()]);
      this.Field3659.Method1950(this.Field3659.Field3202.Method1451(var3, var4, var5, var6, var8));
   }
}
