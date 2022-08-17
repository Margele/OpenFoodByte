package awsl;

import org.xml.sax.Attributes;

final class Class875 extends Class831 {
   final Class730 Field3810;

   Class875(Class730 a) {
      super(a);
      this.Field3810 = a;
   }

   public final void Method3501(String a, Attributes a) {
      Class264 var3 = this.Method3654(a.getValue("start"));
      Class264 var4 = this.Method3654(a.getValue("end"));
      Class264 var5 = this.Method3654(a.getValue("handler"));
      String var6 = a.getValue("type");
      this.Method3655().Method1960(var3, var4, var5, var6);
   }
}
