package awsl;

import org.xml.sax.Attributes;

final class Class847 extends Class831 {
   final Class730 Field3739;

   Class847(Class730 a) {
      super(a);
      this.Field3739 = a;
   }

   public final void Method3501(String a, Attributes a) {
      int var3 = Integer.parseInt(a.getValue("maxStack"));
      int var4 = Integer.parseInt(a.getValue("maxLocals"));
      this.Method3655().Method1842(var3, var4);
   }
}
