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
      int a = Integer.parseInt(a.getValue("major"));
      int a = Integer.parseInt(a.getValue("minor"));
      HashMap a = new HashMap();
      a.put("version", new Integer(a << 16 | a));
      a.put("access", a.getValue("access"));
      a.put("name", a.getValue("name"));
      a.put("parent", a.getValue("parent"));
      a.put("source", a.getValue("source"));
      a.put("signature", a.getValue("signature"));
      a.put("interfaces", new ArrayList());
      this.Field3657.Method1950(a);
   }
}
