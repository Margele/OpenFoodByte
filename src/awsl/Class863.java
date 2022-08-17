package awsl;

import org.xml.sax.Attributes;

final class Class863 extends Class831 {
   final Class730 Field3770;

   Class863(Class730 a) {
      super(a);
      this.Field3770 = a;
   }

   public final void Method3501(String a, Attributes a) {
      int var3 = Integer.parseInt(a.getValue("line"));
      Class264 var4 = this.Method3654(a.getValue("start"));
      this.Method3655().Method1981(var3, var4);
   }
}
