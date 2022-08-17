package awsl;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class Class663 {
   private final ContentHandler Field2934;

   protected Class663(ContentHandler a) {
      this.Field2934 = a;
   }

   protected ContentHandler Method2391() {
      return this.Field2934;
   }

   protected void Method2392() {
      try {
         this.Field2934.Method1635();
      } catch (SAXException var2) {
         throw new RuntimeException(var2.getMessage(), var2.getException());
      }
   }

   protected void Method2393() {
      try {
         this.Field2934.Method1636();
      } catch (SAXException var2) {
         throw new RuntimeException(var2.getMessage(), var2.getException());
      }
   }

   protected final void Method2394(String a, Attributes a) {
      try {
         this.Field2934.Method1633("", a, a, a);
      } catch (SAXException var4) {
         throw new RuntimeException(var4.getMessage(), var4.getException());
      }
   }

   protected final void Method2395(String a) {
      try {
         this.Field2934.Method1634("", a, a);
      } catch (SAXException var3) {
         throw new RuntimeException(var3.getMessage(), var3.getException());
      }
   }

   protected final void Method2396(String a, Attributes a) {
      this.Method2394(a, a);
      this.Method2395(a);
   }
}
