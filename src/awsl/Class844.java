package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class844 extends Class831 {
   final Class730 Field3732;

   Class844(Class730 a) {
      super(a);
      this.Field3732 = a;
   }

   public final void Method3501(String a, Attributes a) {
      HashMap var3 = (HashMap)this.Field3732.Method1963();
      ((ArrayList)var3.Method2665("labels")).Method2530(this.Method3654(a.getValue("name")));
      ((ArrayList)var3.Method2665("keys")).Method2530(a.getValue("key"));
   }
}
