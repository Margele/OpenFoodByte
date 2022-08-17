package awsl;

import org.xml.sax.Attributes;

final class Class876 extends Class831 {
   final Class730 Field3811;

   Class876(Class730 a) {
      super(a);
      this.Field3811 = a;
   }

   public void Method3501(String a, Attributes a) {
      String var4 = a.getValue("desc");
      boolean var5 = Boolean.valueOf(a.getValue("visible"));
      int var6 = Integer.parseInt(a.getValue("typeRef"));
      Class31 var7 = Class31.Method3435(a.getValue("typePath"));
      Class831.Method3658();
      Object var8 = this.Field3811.Method1963();
      if (var8 instanceof Class167) {
         this.Field3811.Method1950(((Class167)var8).Method1449(var6, var7, var4, var5));
      }

      if (var8 instanceof Class253) {
         this.Field3811.Method1950(((Class253)var8).Method2115(var6, var7, var4, var5));
      }

      if (var8 instanceof Class267) {
         this.Field3811.Method1950(((Class267)var8).Method1970(var6, var7, var4, var5));
      }

   }

   public void Method3514(String a) {
      Class148 var2 = (Class148)this.Field3811.Method1964();
      var2.Method401();
   }
}
