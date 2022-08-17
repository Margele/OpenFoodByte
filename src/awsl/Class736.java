package awsl;

import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class Class736 extends DefaultHandler {
   private final String Field3222 = "class";
   private Class672 Field3223;
   private final Class674 Field3224;
   private boolean Field3225;
   private boolean Field3226 = false;
   private ContentHandler Field3227;

   Class736(Class672 a, Class674 a, boolean a) {
      this.Field3223 = a;
      this.Field3224 = a;
      this.Field3225 = a;
   }

   public final void Method1633(String a, String a, String a, Attributes a) throws SAXException {
      int[] a = Class831.Method3658();
      if (this.Field3226) {
         this.Field3227.Method1633(a, a, a, a);
      }

      if (a.equals(this.Field3222)) {
         String a = a.getValue("name");
         if (a.length() == 0) {
            throw new SAXException("Class element without name attribute.");
         }

         try {
            this.Field3224.Method2334(this.Field3225 ? a + ".class.xml" : a + ".class");
         } catch (IOException var8) {
            throw new SAXException(var8.toString(), var8);
         }

         this.Field3227 = this.Field3223.Method2326();
         this.Field3227.Method1635();
         this.Field3227.Method1633(a, a, a, a);
         this.Field3226 = true;
      }

   }

   public final void Method1634(String a, String a, String a) throws SAXException {
      if (this.Field3226) {
         this.Field3227.Method1634(a, a, a);
         if (a.equals(this.Field3222)) {
            this.Field3227.Method1636();
            this.Field3226 = false;

            try {
               this.Field3224.Method2335();
            } catch (IOException var5) {
               throw new SAXException(var5.toString(), var5);
            }
         }
      }

   }

   public final void Method1635() throws SAXException {
   }

   public final void Method1636() throws SAXException {
   }

   public final void Method1637(char[] a, int a, int a) throws SAXException {
      if (this.Field3226) {
         this.Field3227.Method1637(a, a, a);
      }

   }

   private static Exception Method1642(Exception exception) {
      return exception;
   }
}
