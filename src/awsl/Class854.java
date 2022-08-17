package awsl;

import org.xml.sax.Attributes;

final class Class854 extends Class831 {
   final Class730 Field3749;

   Class854(Class730 a) {
      super(a);
      this.Field3749 = a;
   }

   public void Method3501(String a, Attributes a) {
      String a = a.getValue("desc");
      boolean a = Boolean.valueOf(a.getValue("visible"));
      int a = Integer.parseInt(a.getValue("typeRef"));
      Class31 a = Class31.Method3435(a.getValue("typePath"));
      this.Field3749.Method1950(((Class267)this.Field3749.Method1963()).Method1973(a, a, a, a));
   }

   public void Method3514(String a) {
      Class148 a = (Class148)this.Field3749.Method1964();
      a.Method401();
   }
}
