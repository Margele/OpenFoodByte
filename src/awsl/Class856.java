package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class856 extends Class831 {
   final Class730 Field3750;

   Class856(Class730 a) {
      super(a);
      this.Field3750 = a;
   }

   public final void Method3501(String a, Attributes a) {
      ((ArrayList)((HashMap)this.Field3750.Method1963()).Method2665("interfaces")).Method2530(a.getValue("name"));
   }
}
