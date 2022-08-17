package awsl;

import org.xml.sax.Attributes;

final class Class876 extends Class831 {
   final Class730 Field3811;

   Class876(Class730 a) {
      super(a);
      this.Field3811 = a;
   }

   public void Method3501(String a, Attributes a) {
      String a = a.getValue("desc");
      boolean a = Boolean.valueOf(a.getValue("visible"));
      int a = Integer.parseInt(a.getValue("typeRef"));
      Class31 a = Class31.Method3435(a.getValue("typePath"));
      Class831.Method3658();
      Object a = this.Field3811.Method1963();
      if (a instanceof Class167) {
         this.Field3811.Method1950(((Class167)a).Method1449(a, a, a, a));
      }

      if (a instanceof Class253) {
         this.Field3811.Method1950(((Class253)a).Method2115(a, a, a, a));
      }

      if (a instanceof Class267) {
         this.Field3811.Method1950(((Class267)a).Method1970(a, a, a, a));
      }

   }

   public void Method3514(String a) {
      Class148 a = (Class148)this.Field3811.Method1964();
      a.Method401();
   }
}
