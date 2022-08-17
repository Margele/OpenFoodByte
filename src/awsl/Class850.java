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
      HashMap a = new HashMap();
      a.put("access", a.getValue("access"));
      a.put("name", a.getValue("name"));
      a.put("desc", a.getValue("desc"));
      a.put("signature", a.getValue("signature"));
      a.put("exceptions", new ArrayList());
      this.Field3746.Method1950(a);
   }

   public final void Method3514(String a) {
      ((Class267)this.Field3746.Method1964()).Method1653();
      this.Field3746.Field3203 = null;
   }
}
