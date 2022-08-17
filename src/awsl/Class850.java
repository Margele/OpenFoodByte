package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class850 extends Class831 {
   final Class730 Field3746;

   Class850(Class730 a) {
      super(a);
      this.Field3746 = a;
   }

   public final void Method3501(String a, Attributes a) {
      this.Field3746.Field3203 = new HashMap();
      HashMap var3 = new HashMap();
      var3.put("access", a.getValue("access"));
      var3.put("name", a.getValue("name"));
      var3.put("desc", a.getValue("desc"));
      var3.put("signature", a.getValue("signature"));
      var3.put("exceptions", new ArrayList());
      this.Field3746.Method1950(var3);
   }

   public final void Method3514(String a) {
      ((Class267)this.Field3746.Method1964()).Method1653();
      this.Field3746.Field3203 = null;
   }
}
