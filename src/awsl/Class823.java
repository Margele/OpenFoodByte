package awsl;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class823 extends Class831 {
   final Class730 Field3660;

   Class823(Class730 a) {
      super(a);
      this.Field3660 = a;
   }

   public final void Method3501(String a, Attributes a) throws SAXException {
      int a = this.Method3656(a.getValue("access"));
      String a = a.getValue("name");
      String a = a.getValue("signature");
      String a = a.getValue("desc");
      Object a = this.Method3651(a, a.getValue("value"));
      this.Field3660.Method1950(this.Field3660.Field3202.Method1450(a, a, a, a, a));
   }

   public void Method3514(String a) {
      ((Class253)this.Field3660.Method1964()).Method2121();
   }
}
