package awsl;

import org.xml.sax.Attributes;

final class Class835 extends Class831 {
   final Class730 Field3724;

   Class835(Class730 a) {
      super(a);
      this.Field3724 = a;
   }

   public void Method3501(String a, Attributes a) {
      Class831.Method3658();
      String a = a.getValue("desc");
      boolean a = Boolean.valueOf(a.getValue("visible"));
      Object a = this.Field3724.Method1963();
      if (a instanceof Class167) {
         this.Field3724.Method1950(((Class167)a).Method1448(a, a));
      }

      if (a instanceof Class253) {
         this.Field3724.Method1950(((Class253)a).Method2114(a, a));
      }

      if (a instanceof Class267) {
         this.Field3724.Method1950(((Class267)a).Method1969(a, a));
      }

   }

   public void Method3514(String a) {
      Class148 a = (Class148)this.Field3724.Method1964();
      a.Method401();
   }
}
