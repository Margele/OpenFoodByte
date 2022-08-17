package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class819 extends Class831 {
   final Class730 Field3657;

   Class819(Class730 a) {
      super(a);
      this.Field3657 = a;
   }

   public final void Method3501(String a, Attributes a) {
      int var3 = Integer.parseInt(a.getValue("major"));
      int var4 = Integer.parseInt(a.getValue("minor"));
      HashMap var5 = new HashMap();
      var5.put("version", new Integer(var4 << 16 | var3));
      var5.put("access", a.getValue("access"));
      var5.put("name", a.getValue("name"));
      var5.put("parent", a.getValue("parent"));
      var5.put("source", a.getValue("source"));
      var5.put("signature", a.getValue("signature"));
      var5.put("interfaces", new ArrayList());
      this.Field3657.Method1950(var5);
   }
}
