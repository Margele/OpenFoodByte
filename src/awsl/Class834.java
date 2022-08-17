package awsl;

import org.xml.sax.Attributes;

final class Class834 extends Class831 {
   final Class730 Field3723;

   Class834(Class730 a) {
      super(a);
      this.Field3723 = a;
   }

   public void Method3501(String a, Attributes a) {
      int a = Integer.parseInt(a.getValue("parameter"));
      String a = a.getValue("desc");
      boolean a = Boolean.valueOf(a.getValue("visible"));
      this.Field3723.Method1950(((Class267)this.Field3723.Method1963()).Method1971(a, a, a));
   }

   public void Method3514(String a) {
      Class148 a = (Class148)this.Field3723.Method1964();
      a.Method401();
   }
}
