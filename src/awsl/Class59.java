package awsl;

import java.util.Map;
import java.util.Set;

final class Class59 extends Class57 {
   final Set Field625;

   Class59(Map a, Set set) {
      super(a);
      this.Field625 = set;
   }

   public String Method3183(String a) {
      String a = super.Method3183(a);
      this.Field625.remove(a);
      return a;
   }
}
