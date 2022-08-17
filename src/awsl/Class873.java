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
      HashMap a = new HashMap();
      a.put("min", a.getValue("min"));
      a.put("max", a.getValue("max"));
      a.put("dflt", a.getValue("dflt"));
      a.put("labels", new ArrayList());
      this.Field3808.Method1950(a);
   }

   public final void Method3514(String a) {
      HashMap a = (HashMap)this.Field3808.Method1964();
      int a = Integer.parseInt((String)a.Method2665("min"));
      int a = Integer.parseInt((String)a.Method2665("max"));
      Class264 a = this.Method3654(a.Method2665("dflt"));
      ArrayList a = (ArrayList)a.Method2665("labels");
      Class264[] a = (Class264[])a.toArray(new Class264[a.Method1799()]);
      this.Method3655().Method1959(a, a, a, a);
   }
}
