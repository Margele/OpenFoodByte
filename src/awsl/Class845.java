package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class845 extends Class831 {
   final Class730 Field3733;

   Class845(Class730 a) {
      super(a);
      this.Field3733 = a;
   }

   public final void Method3501(String a, Attributes a) {
      HashMap var3 = new HashMap();
      var3.put("dflt", a.getValue("dflt"));
      var3.put("labels", new ArrayList());
      var3.put("keys", new ArrayList());
      this.Field3733.Method1950(var3);
   }

   public final void Method3514(String a) {
      Class831.Method3658();
      HashMap var3 = (HashMap)this.Field3733.Method1964();
      Class264 var4 = this.Method3654(var3.Method2665("dflt"));
      ArrayList var5 = (ArrayList)var3.Method2665("keys");
      ArrayList var6 = (ArrayList)var3.Method2665("labels");
      Class264[] var7 = (Class264[])var6.toArray(new Class264[var6.Method1799()]);
      int[] var8 = new int[var5.Method1799()];
      int var9 = 0;
      if (var9 < var8.length) {
         var8[var9] = Integer.parseInt((String)var5.get(var9));
         ++var9;
      }

      this.Method3655().Method1958(var4, var8, var7);
   }
}
