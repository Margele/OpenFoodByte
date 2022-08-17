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
      HashMap a = new HashMap();
      a.put("dflt", a.getValue("dflt"));
      a.put("labels", new ArrayList());
      a.put("keys", new ArrayList());
      this.Field3733.Method1950(a);
   }

   public final void Method3514(String a) {
      Class831.Method3658();
      HashMap a = (HashMap)this.Field3733.Method1964();
      Class264 a = this.Method3654(a.Method2665("dflt"));
      ArrayList a = (ArrayList)a.Method2665("keys");
      ArrayList a = (ArrayList)a.Method2665("labels");
      Class264[] a = (Class264[])a.toArray(new Class264[a.Method1799()]);
      int[] a = new int[a.Method1799()];
      int a = 0;
      if (a < a.length) {
         a[a] = Integer.parseInt((String)a.get(a));
         ++a;
      }

      this.Method3655().Method1958(a, a, a);
   }
}
