package awsl;

import org.xml.sax.Attributes;

final class Class870 extends Class831 {
   final Class730 Field3802;

   Class870(Class730 a) {
      super(a);
      this.Field3802 = a;
   }

   public void Method3501(String a, Attributes a) {
      String var3 = a.getValue("file");
      String var4 = a.getValue("debug");
      this.Field3802.Field3202.Method1458(var3, var4);
   }
}
