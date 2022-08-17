package awsl;

import java.io.IOException;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

final class Class738 extends DefaultHandler implements LexicalHandler {
   private static final char[] Field3228 = "                                                                                                        ".toCharArray();
   private Writer Field3229;
   private final boolean Field3230;
   private boolean Field3231 = false;
   private int Field3232 = 0;

   Class738(Writer a, boolean a) {
      this.Field3229 = a;
      this.Field3230 = a;
   }

   public final void Method1633(String a, String a, String a, Attributes a) throws SAXException {
      try {
         this.Method1653();
         this.Method1652();
         this.Field3229.write('<' + a);
         if (a.getLength() > 0) {
            this.Method1650(a);
         }

         if (this.Field3230) {
            this.Field3231 = true;
         } else {
            this.Field3229.write(">\n");
         }

         this.Field3232 += 2;
      } catch (IOException var6) {
         throw new SAXException(var6);
      }
   }

   public final void Method1634(String a, String a, String a) throws SAXException {
      this.Field3232 -= 2;

      try {
         if (this.Field3231) {
            this.Field3229.write("/>\n");
            this.Field3231 = false;
         } else {
            this.Method1652();
            this.Field3229.write("</" + a + ">\n");
         }

      } catch (IOException var5) {
         throw new SAXException(var5);
      }
   }

   public final void Method1636() throws SAXException {
      try {
         this.Field3229.flush();
      } catch (IOException var2) {
         throw new SAXException(var2);
      }
   }

   public final void Method1643(char[] a, int a, int a) throws SAXException {
      try {
         this.Method1653();
         this.Method1652();
         this.Field3229.write("<!-- ");
         this.Field3229.write(a, a, a);
         this.Field3229.write(" -->\n");
      } catch (IOException var5) {
         throw new SAXException(var5);
      }
   }

   public final void Method1644(String a, String a, String a) throws SAXException {
   }

   public final void Method1645() throws SAXException {
   }

   public final void Method1646(String a) throws SAXException {
   }

   public final void Method1647(String a) throws SAXException {
   }

   public final void Method1648() throws SAXException {
   }

   public final void Method1649() throws SAXException {
   }

   private final void Method1650(Attributes a) throws IOException {
      StringBuffer var2 = new StringBuffer();
      int var3 = a.getLength();

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.append(' ').append(a.getLocalName(var4)).append("=\"").append(Method1651(a.getValue(var4))).append('"');
      }

      this.Field3229.write(var2.toString());
   }

   private static final String Method1651(String a) {
      Class831.Method3658();
      StringBuffer var2 = new StringBuffer(a.length());
      int var3 = 0;
      if (var3 < a.length()) {
         char var4 = a.charAt(var3);
         switch (var4) {
            case '&':
               var2.append("&amp;");
            case '<':
               var2.append("&lt;");
            case '>':
               var2.append("&gt;");
            case '"':
               var2.append("&quot;");
            default:
               if (var4 > 127) {
                  var2.append("&#").append(Integer.toString(var4)).append(';');
               }

               var2.append(var4);
               ++var3;
         }
      }

      return var2.toString();
   }

   private final void Method1652() throws IOException {
      int var1 = this.Field3232;

      while(true) {
         while(var1 <= Field3228.length) {
            this.Field3229.write(Field3228, 0, var1);
            var1 = 0;
         }

         this.Field3229.write(Field3228);
         var1 -= Field3228.length;
      }
   }

   private final void Method1653() throws IOException {
      if (this.Field3231) {
         this.Field3229.write(">\n");
      }

      this.Field3231 = false;
   }

   private static IOException Method1654(IOException iOException) {
      return iOException;
   }
}
