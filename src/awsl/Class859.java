package awsl;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class859 extends Class831 {
   final Class730 Field3756;

   Class859(Class730 a) {
      super(a);
      this.Field3756 = a;
   }

   public final void Method3501(String a, Attributes a) throws SAXException {
      ArrayList a = (ArrayList)this.Field3756.Method1963();
      a.Method2530(this.Method3651(a.getValue("desc"), a.getValue("cst")));
   }
}
