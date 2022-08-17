package awsl;

import org.xml.sax.Attributes;

final class Class854 extends Class831 {
   final Class730 Field3749;

   Class854(Class730 a) {
      super(a);
      this.Field3749 = a;
   }

   public void Method3501(String a, Attributes a) {
      String var3 = a.getValue("desc");
      boolean var4 = Boolean.valueOf(a.getValue("visible"));
      int var5 = Integer.parseInt(a.getValue("typeRef"));
      Class31 var6 = Class31.Method3435(a.getValue("typePath"));
      this.Field3749.Method1950(((Class267)this.Field3749.Method1963()).Method1973(var5, var6, var3, var4));
   }

   public void Method3514(String a) {
      Class148 var2 = (Class148)this.Field3749.Method1964();
      var2.Method401();
   }
}
