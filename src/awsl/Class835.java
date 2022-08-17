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
      String var4 = a.getValue("desc");
      boolean var5 = Boolean.valueOf(a.getValue("visible"));
      Object var6 = this.Field3724.Method1963();
      if (var6 instanceof Class167) {
         this.Field3724.Method1950(((Class167)var6).Method1448(var4, var5));
      }

      if (var6 instanceof Class253) {
         this.Field3724.Method1950(((Class253)var6).Method2114(var4, var5));
      }

      if (var6 instanceof Class267) {
         this.Field3724.Method1950(((Class267)var6).Method1969(var4, var5));
      }

   }

   public void Method3514(String a) {
      Class148 var2 = (Class148)this.Field3724.Method1964();
      var2.Method401();
   }
}
