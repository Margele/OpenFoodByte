package awsl;

import org.xml.sax.Attributes;

final class Class853 extends Class831 {
   final Class730 Field3748;

   Class853(Class730 a) {
      super(a);
      this.Field3748 = a;
   }

   public final void Method3501(String a, Attributes a) {
      String a = a.getValue("owner");
      String a = a.getValue("name");
      String a = a.getValue("desc");
      this.Field3748.Field3202.Method1453(a, a, a);
   }
}
