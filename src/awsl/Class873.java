package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class873 extends Class831 {
   final Class730 Field3808;

   Class873(Class730 a) {
      super(a);
      this.Field3808 = a;
   }

   public final void Method3501(String a, Attributes a) {
      HashMap var3 = new HashMap();
      var3.put("min", a.getValue("min"));
      var3.put("max", a.getValue("max"));
      var3.put("dflt", a.getValue("dflt"));
      var3.put("labels", new ArrayList());
      this.Field3808.Method1950(var3);
   }

   public final void Method3514(String a) {
      HashMap var2 = (HashMap)this.Field3808.Method1964();
      int var3 = Integer.parseInt((String)var2.Method2665("min"));
      int var4 = Integer.parseInt((String)var2.Method2665("max"));
      Class264 var5 = this.Method3654(var2.Method2665("dflt"));
      ArrayList var6 = (ArrayList)var2.Method2665("labels");
      Class264[] var7 = (Class264[])var6.toArray(new Class264[var6.Method1799()]);
      this.Method3655().Method1959(var3, var4, var5, var7);
   }
}
