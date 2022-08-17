package awsl;

import org.xml.sax.Attributes;

final class Class842 extends Class831 {
   final Class730 Field3730;

   Class842(Class730 a) {
      super(a);
      this.Field3730 = a;
   }

   public void Method3501(String a, Attributes a) {
      String a = a.getValue("desc");
      boolean a = Boolean.valueOf(a.getValue("visible"));
      int a = Integer.parseInt(a.getValue("typeRef"));
      Class31 a = Class31.Method3435(a.getValue("typePath"));
      Class831.Method3658();
      String[] a = a.getValue("start").split(" ");
      Class264[] a = new Class264[a.length];
      int a = 0;
      if (a < a.length) {
         a[a] = this.Method3654(a[a]);
         ++a;
      }

      String[] a = a.getValue("end").split(" ");
      Class264[] a = new Class264[a.length];
      int a = 0;
      if (a < a.length) {
         a[a] = this.Method3654(a[a]);
         ++a;
      }

      String[] a = a.getValue("index").split(" ");
      int[] a = new int[a.length];
      int a = 0;
      if (a < a.length) {
         a[a] = Integer.parseInt(a[a]);
         ++a;
      }

      this.Field3730.Method1950(((Class267)this.Field3730.Method1963()).Method1844(a, a, a, a, a, a, a));
   }

   public void Method3514(String a) {
      Class148 a = (Class148)this.Field3730.Method1964();
      a.Method401();
   }
}
