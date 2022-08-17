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
      HashMap var2 = (HashMap)this.Field3751.Method1964();
      int var3 = (Integer)var2.Method2665("version");
      int var4 = this.Method3656((String)var2.Method2665("access"));
      String var5 = (String)var2.Method2665("name");
      String var6 = (String)var2.Method2665("signature");
      String var7 = (String)var2.Method2665("parent");
      ArrayList var8 = (ArrayList)var2.Method2665("interfaces");
      String[] var9 = (String[])var8.toArray(new String[var8.Method1799()]);
      this.Field3751.Field3202.Method1447(var3, var4, var5, var6, var7, var9);
      this.Field3751.Method1950(this.Field3751.Field3202);
   }
}
