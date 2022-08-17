package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class871 extends Class831 {
   final Class730 Field3803;

   Class871(Class730 a) {
      super(a);
      this.Field3803 = a;
   }

   public final void Method3501(String a, Attributes a) {
      ((ArrayList)((HashMap)this.Field3803.Method1963()).Method2665("labels")).Method2530(this.Method3654(a.getValue("name")));
   }
}
