package awsl;

import org.xml.sax.Attributes;

final class Class865 extends Class831 {
   final Class730 Field3777;

   Class865(Class730 a) {
      super(a);
      this.Field3777 = a;
   }

   public final void Method3501(String a, Attributes a) {
      String a = a.getValue("name");
      String a = a.getValue("desc");
      String a = a.getValue("signature");
      Class264 a = this.Method3654(a.getValue("start"));
      Class264 a = this.Method3654(a.getValue("end"));
      int a = Integer.parseInt(a.getValue("var"));
      this.Method3655().Method1843(a, a, a, a, a, a);
   }
}
