package awsl;

import org.xml.sax.Attributes;

final class Class865 extends Class831 {
   final Class730 Field3777;

   Class865(Class730 a) {
      super(a);
      this.Field3777 = a;
   }

   public final void Method3501(String a, Attributes a) {
      String var3 = a.getValue("name");
      String var4 = a.getValue("desc");
      String var5 = a.getValue("signature");
      Class264 var6 = this.Method3654(a.getValue("start"));
      Class264 var7 = this.Method3654(a.getValue("end"));
      int var8 = Integer.parseInt(a.getValue("var"));
      this.Method3655().Method1843(var3, var4, var5, var6, var7, var8);
   }
}
