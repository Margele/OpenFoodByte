package awsl;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class860 extends Class831 {
   final Class730 Field3757;

   Class860(Class730 a) {
      super(a);
      this.Field3757 = a;
   }

   public final void Method3501(String a, Attributes a) throws SAXException {
      this.Field3757.Method1950(a.getValue("name"));
      this.Field3757.Method1950(a.getValue("desc"));
      this.Field3757.Method1950(this.Method3652(a.getValue("bsm")));
      this.Field3757.Method1950(new ArrayList());
   }

   public final void Method3514(String a) {
      ArrayList var2 = (ArrayList)this.Field3757.Method1964();
      Class279 var3 = (Class279)this.Field3757.Method1964();
      String var4 = (String)this.Field3757.Method1964();
      String var5 = (String)this.Field3757.Method1964();
      this.Method3655().Method1956(var5, var4, var3, var2.toArray());
   }
}
