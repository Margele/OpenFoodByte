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
      int var3 = this.Method3656(a.getValue("access"));
      String var4 = a.getValue("name");
      String var5 = a.getValue("signature");
      String var6 = a.getValue("desc");
      Object var7 = this.Method3651(var6, a.getValue("value"));
      this.Field3660.Method1950(this.Field3660.Field3202.Method1450(var3, var4, var6, var5, var7));
   }

   public void Method3514(String a) {
      ((Class253)this.Field3660.Method1964()).Method2121();
   }
}
