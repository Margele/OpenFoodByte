package awsl;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class851 extends Class831 {
   final Class730 Field3747;

   Class851(Class730 a) {
      super(a);
      this.Field3747 = a;
   }

   public final void Method3501(String a, Attributes a1) throws SAXException {
      Class831.Method3658();
      Class807 a = (Class807)Class730.Field3206.Method2665(a);
      throw new SAXException("Invalid element: " + a + " at " + this.Field3747.Field3201);
   }

   private static SAXException Method3677(SAXException sAXException) {
      return sAXException;
   }
}
