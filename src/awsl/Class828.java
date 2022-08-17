package awsl;

import org.xml.sax.Attributes;

final class Class828 extends Class831 {
   final Class730 Field3675;

   Class828(Class730 a) {
      super(a);
      this.Field3675 = a;
   }

   public final void Method3501(String a, Attributes a) {
      int a = this.Method3656(a.getValue("access"));
      String a = a.getValue("name");
      String a = a.getValue("outerName");
      String a = a.getValue("innerName");
      this.Field3675.Field3202.Method1452(a, a, a, a);
   }
}
