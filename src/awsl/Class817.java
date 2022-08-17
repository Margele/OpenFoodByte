package awsl;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class817 extends Class831 {
   final Class730 Field3654;

   Class817(Class730 a) {
      super(a);
      this.Field3654 = a;
   }

   public void Method3501(String a, Attributes a) throws SAXException {
      Class148 var3 = (Class148)this.Field3654.Method1963();
      var3.Method397(a.getValue("name"), this.Method3651(a.getValue("desc"), a.getValue("value")));
   }

   private static SAXException Method3677(SAXException sAXException) {
      return sAXException;
   }
}
