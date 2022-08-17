package awsl;

import obfuscate.a;
import obfuscate.b;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public abstract class Class831 {
   final Class730 Field3688;
   private static int[] Field3689;

   protected Class831(Class730 a) {
      this.Field3688 = a;
   }

   public void Method3501(String a, Attributes a) throws SAXException {
   }

   public void Method3514(String a) {
   }

   protected final Object Method3651(String a, String a) throws SAXException {
      Object var3 = null;
      if ("Ljava/lang/String;".equals(a)) {
         var3 = this.Method3653(a);
      } else if (!"Ljava/lang/Integer;".equals(a) && !"I".equals(a) && !"S".equals(a) && !"B".equals(a) && !"C".equals(a) && !"Z".equals(a)) {
         if ("Ljava/lang/Short;".equals(a)) {
            var3 = new Short(a);
         } else if ("Ljava/lang/Byte;".equals(a)) {
            var3 = new Byte(a);
         } else if ("Ljava/lang/Character;".equals(a)) {
            var3 = new Character(this.Method3653(a).charAt(0));
         } else if ("Ljava/lang/Boolean;".equals(a)) {
            var3 = Boolean.valueOf(a);
         } else if (!"Ljava/lang/Long;".equals(a) && !"J".equals(a)) {
            if (!"Ljava/lang/Float;".equals(a) && !"F".equals(a)) {
               if (!"Ljava/lang/Double;".equals(a) && !"D".equals(a)) {
                  if (b.Method3229(b.class).equals(a)) {
                     var3 = b.Method3204(a);
                  } else {
                     if (!b.Method3229(Class279.class).equals(a)) {
                        throw new SAXException("Invalid value:" + a + " desc:" + a + " ctx:" + this);
                     }

                     var3 = this.Method3652(a);
                  }
               } else {
                  var3 = new Double(a);
               }
            } else {
               var3 = new Float(a);
            }
         } else {
            var3 = new Long(a);
         }
      } else {
         var3 = new Integer(a);
      }

      return var3;
   }

   Class279 Method3652(String a) throws SAXException {
      try {
         int var2 = a.indexOf(46);
         int var3 = a.indexOf(40, var2 + 1);
         int var4 = a.lastIndexOf(40);
         int var5 = Integer.parseInt(a.substring(var4 + 1, a.length() - 1));
         String var6 = a.substring(0, var2);
         String var7 = a.substring(var2 + 1, var3);
         String var8 = a.substring(var3, var4 - 1);
         return new Class279(var5, var6, var7, var8);
      } catch (RuntimeException var9) {
         throw new SAXException("Malformed handle " + a, var9);
      }
   }

   private final String Method3653(String a) throws SAXException {
      Method3658();
      StringBuffer var3 = new StringBuffer(a.length());

      try {
         int var4 = 0;
         if (var4 < a.length()) {
            char var5 = a.charAt(var4);
            if (var5 == '\\') {
               ++var4;
               var5 = a.charAt(var4);
               if (var5 == '\\') {
                  var3.append('\\');
               }

               ++var4;
               var3.append((char)Integer.parseInt(a.substring(var4, var4 + 4), 16));
               var4 += 3;
            }

            var3.append(var5);
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw new SAXException(var6);
      }

      return var3.toString();
   }

   protected final Class264 Method3654(Object a) {
      Class264 var2 = (Class264)this.Field3688.Field3203.Method2665(a);
      var2 = new Class264();
      this.Field3688.Field3203.put(a, var2);
      return var2;
   }

   protected final Class267 Method3655() {
      return (Class267)this.Field3688.Method1963();
   }

   protected final int Method3656(String a) {
      Method3658();
      int var3 = 0;
      if (a.indexOf("public") != -1) {
         var3 |= 1;
      }

      if (a.indexOf("private") != -1) {
         var3 |= 2;
      }

      if (a.indexOf("protected") != -1) {
         var3 |= 4;
      }

      if (a.indexOf("static") != -1) {
         var3 |= 8;
      }

      if (a.indexOf("final") != -1) {
         var3 |= 16;
      }

      if (a.indexOf("super") != -1) {
         var3 |= 32;
      }

      if (a.indexOf("synchronized") != -1) {
         var3 |= 32;
      }

      if (a.indexOf("volatile") != -1) {
         var3 |= 64;
      }

      if (a.indexOf("bridge") != -1) {
         var3 |= 64;
      }

      if (a.indexOf("varargs") != -1) {
         var3 |= 128;
      }

      if (a.indexOf("transient") != -1) {
         var3 |= 128;
      }

      if (a.indexOf("native") != -1) {
         var3 |= 256;
      }

      if (a.indexOf("interface") != -1) {
         var3 |= 512;
      }

      if (a.indexOf("abstract") != -1) {
         var3 |= 1024;
      }

      if (a.indexOf("strict") != -1) {
         var3 |= 2048;
      }

      if (a.indexOf("synthetic") != -1) {
         var3 |= 4096;
      }

      if (a.indexOf("annotation") != -1) {
         var3 |= 8192;
      }

      if (a.indexOf("enum") != -1) {
         var3 |= 16384;
      }

      if (a.indexOf("deprecated") != -1) {
         var3 |= 131072;
      }

      if (a.indexOf("mandated") != -1) {
         var3 |= 32768;
      }

      if (a.trash() == null) {
         Method3657(new int[4]);
      }

      return var3;
   }

   public static void Method3657(int[] arr) {
      Field3689 = arr;
   }

   public static int[] Method3658() {
      return Field3689;
   }

   private static Exception Method3659(Exception exception) {
      return exception;
   }

   static {
      Method3657(new int[1]);
   }
}
