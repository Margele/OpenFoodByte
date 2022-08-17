package awsl;

import org.xml.sax.Attributes;

final class Class848 extends Class831 {
   final Class730 Field3740;

   Class848(Class730 a) {
      super(a);
      this.Field3740 = a;
   }

   public void Method3501(String a, Attributes a) {
      String var3 = a.getValue("name");
      int var4 = this.Method3656(a.getValue("access"));
      this.Method3655().Method1979(var3, var4);
   }
}
