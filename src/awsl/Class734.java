package awsl;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class Class734 extends DefaultHandler {
   private String Field3217;
   private final ContentHandler Field3218;
   private Class672 Field3219;
   private boolean Field3220 = false;
   private ContentHandler Field3221;

   Class734(String a, ContentHandler a, Class672 a) {
      this.Field3217 = a;
      this.Field3218 = a;
      this.Field3219 = a;
   }

   public final void Method1633(String a, String a, String a, Attributes a) throws SAXException {
      int[] var5 = Class831.Method3658();
      if (this.Field3220) {
         this.Field3221.Method1633(a, a, a, a);
      }

      if (a.equals(this.Field3217)) {
         this.Field3221 = this.Field3219.Method2326();
         this.Field3221.Method1635();
         this.Field3221.Method1633(a, a, a, a);
         this.Field3220 = true;
      }

      if (this.Field3218 != null) {
         this.Field3218.Method1633(a, a, a, a);
      }

   }

   public final void Method1634(String a, String a, String a) throws SAXException {
      int[] var4 = Class831.Method3658();
      if (this.Field3220) {
         this.Field3221.Method1634(a, a, a);
         if (!a.equals(this.Field3217)) {
            return;
         }

         this.Field3221.Method1636();
         this.Field3220 = false;
      }

      if (this.Field3218 != null) {
         this.Field3218.Method1634(a, a, a);
      }

   }

   public final void Method1635() throws SAXException {
      if (this.Field3218 != null) {
         this.Field3218.Method1635();
      }

   }

   public final void Method1636() throws SAXException {
      if (this.Field3218 != null) {
         this.Field3218.Method1636();
      }

   }

   public final void Method1637(char[] a, int a, int a) throws SAXException {
      if (this.Field3220) {
         this.Field3221.Method1637(a, a, a);
      } else if (this.Field3218 != null) {
         this.Field3218.Method1637(a, a, a);
      }

   }

   private static SAXException Method1638(SAXException sAXException) {
      return sAXException;
   }
}
