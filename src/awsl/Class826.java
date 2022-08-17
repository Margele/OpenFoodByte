package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class826 extends Class831 {
   final Class730 Field3667;

   Class826(Class730 a) {
      super(a);
      this.Field3667 = a;
   }

   public void Method3501(String a, Attributes a) {
      Class831.Method3658();
      ArrayList a = (ArrayList)((HashMap)this.Field3667.Method1963()).Method2665(a);
      String a = a.getValue("type");
      if ("uninitialized".equals(a)) {
         a.Method2530(this.Method3654(a.getValue("label")));
      }

      Integer a = (Integer)Class730.Field3207.Method2665(a);
      a.Method2530(a);
      a.Method2530(a);
   }
}
