package awsl;

import org.xml.sax.Attributes;

final class Class841 extends Class831 {
   final Class730 Field3729;

   Class841(Class730 a) {
      super(a);
      this.Field3729 = a;
   }

   public void Method3501(String a, Attributes a) {
      Class148 var3 = (Class148)this.Field3729.Method1963();
      var3.Method398(a.getValue("name"), a.getValue("desc"), a.getValue("value"));
   }
}
