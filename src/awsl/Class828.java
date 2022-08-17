package awsl;

import org.xml.sax.Attributes;

final class Class828 extends Class831 {
   final Class730 Field3675;

   Class828(Class730 a) {
      super(a);
      this.Field3675 = a;
   }

   public final void Method3501(String a, Attributes a) {
      int var3 = this.Method3656(a.getValue("access"));
      String var4 = a.getValue("name");
      String var5 = a.getValue("outerName");
      String var6 = a.getValue("innerName");
      this.Field3675.Field3202.Method1452(var4, var5, var6, var3);
   }
}
