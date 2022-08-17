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

   public void Method3501(String a, Attributes a1) throws SAXException {
   }

   public void Method3514(String a) {
   }

   protected final Object Method3651(String a, String a) throws SAXException {
      Object a = null;
      if ("Ljava/lang/String;".equals(a)) {
         a = this.Method3653(a);
      } else if (!"Ljava/lang/Integer;".equals(a) && !"I".equals(a) && !"S".equals(a) && !"B".equals(a) && !"C".equals(a) && !"Z".equals(a)) {
         if ("Ljava/lang/Short;".equals(a)) {
            a = new Short(a);
         } else if ("Ljava/lang/Byte;".equals(a)) {
            a = new Byte(a);
         } else if ("Ljava/lang/Character;".equals(a)) {
            a = new Character(this.Method3653(a).charAt(0));
         } else if ("Ljava/lang/Boolean;".equals(a)) {
            a = Boolean.valueOf(a);
         } else if (!"Ljava/lang/Long;".equals(a) && !"J".equals(a)) {
            if (!"Ljava/lang/Float;".equals(a) && !"F".equals(a)) {
               if (!"Ljava/lang/Double;".equals(a) && !"D".equals(a)) {
                  if (b.Method3229(b.class).equals(a)) {
                     a = b.Method3204(a);
                  } else {
                     if (!b.Method3229(Class279.class).equals(a)) {
                        throw new SAXException("Invalid value:" + a + " desc:" + a + " ctx:" + this);
                     }

                     a = this.Method3652(a);
                  }
               } else {
                  a = new Double(a);
               }
            } else {
               a = new Float(a);
            }
         } else {
            a = new Long(a);
         }
      } else {
         a = new Integer(a);
      }

      return a;
   }

   Class279 Method3652(String a) throws SAXException {
      try {
         int a = a.indexOf(46);
         int a = a.indexOf(40, a + 1);
         int a = a.lastIndexOf(40);
         int a = Integer.parseInt(a.substring(a + 1, a.length() - 1));
         String a = a.substring(0, a);
         String a = a.substring(a + 1, a);
         String a = a.substring(a, a - 1);
         return new Class279(a, a, a, a);
      } catch (RuntimeException var9) {
         throw new SAXException("Malformed handle " + a, var9);
      }
   }

   private final String Method3653(String a) throws SAXException {
      Method3658();
      StringBuffer a = new StringBuffer(a.length());

      try {
         int a = 0;
         if (a < a.length()) {
            char a = a.charAt(a);
            if (a == '\\') {
               ++a;
               a = a.charAt(a);
               if (a == '\\') {
                  a.append('\\');
               }

               ++a;
               a.append((char)Integer.parseInt(a.substring(a, a + 4), 16));
               a += 3;
            }

            a.append(a);
            ++a;
         }
      } catch (RuntimeException var6) {
         throw new SAXException(var6);
      }

      return a.toString();
   }

   protected final Class264 Method3654(Object a) {
      Class264 a = (Class264)this.Field3688.Field3203.Method2665(a);
      a = new Class264();
      this.Field3688.Field3203.put(a, a);
      return a;
   }

   protected final Class267 Method3655() {
      return (Class267)this.Field3688.Method1963();
   }

   protected final int Method3656(String a) {
      Method3658();
      int a = 0;
      if (a.indexOf("public") != -1) {
         a |= 1;
      }

      if (a.indexOf("private") != -1) {
         a |= 2;
      }

      if (a.indexOf("protected") != -1) {
         a |= 4;
      }

      if (a.indexOf("static") != -1) {
         a |= 8;
      }

      if (a.indexOf("final") != -1) {
         a |= 16;
      }

      if (a.indexOf("super") != -1) {
         a |= 32;
      }

      if (a.indexOf("synchronized") != -1) {
         a |= 32;
      }

      if (a.indexOf("volatile") != -1) {
         a |= 64;
      }

      if (a.indexOf("bridge") != -1) {
         a |= 64;
      }

      if (a.indexOf("varargs") != -1) {
         a |= 128;
      }

      if (a.indexOf("transient") != -1) {
         a |= 128;
      }

      if (a.indexOf("native") != -1) {
         a |= 256;
      }

      if (a.indexOf("interface") != -1) {
         a |= 512;
      }

      if (a.indexOf("abstract") != -1) {
         a |= 1024;
      }

      if (a.indexOf("strict") != -1) {
         a |= 2048;
      }

      if (a.indexOf("synthetic") != -1) {
         a |= 4096;
      }

      if (a.indexOf("annotation") != -1) {
         a |= 8192;
      }

      if (a.indexOf("enum") != -1) {
         a |= 16384;
      }

      if (a.indexOf("deprecated") != -1) {
         a |= 131072;
      }

      if (a.indexOf("mandated") != -1) {
         a |= 32768;
      }

      if (a.trash() == null) {
         Method3657(new int[4]);
      }

      return a;
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
