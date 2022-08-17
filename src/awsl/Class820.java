package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class820 extends Class831 {
   final Class730 Field3658;

   Class820(Class730 a) {
      super(a);
      this.Field3658 = a;
   }

   public final void Method3501(String a, Attributes a) {
      ((ArrayList)((HashMap)this.Field3658.Method1963()).Method2665("exceptions")).Method2530(a.getValue("name"));
   }
}
