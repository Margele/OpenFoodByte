package awsl;

import java.io.Reader;
import java.util.HashMap;

public class Class292 extends Class290 {
   public static final HashMap Field1560 = new HashMap(8);

   public Class292(Reader a) {
      super(a);
   }

   public Class292(String a) {
      super(a);
   }

   public String Method2899() throws Class666 {
      StringBuilder a = new StringBuilder();

      int a;
      do {
         if (!this.Method2884()) {
            throw this.Method2895("Unclosed CDATA");
         }

         char a = this.Method2885();
         a.append(a);
         a = a.length() - 3;
      } while(a.charAt(a) != ']' || a.charAt(a + 1) != ']' || a.charAt(a + 2) != '>');

      a.setLength(a);
      return a.toString();
   }

   public Object Method2900() throws Class666 {
      char a;
      do {
         a = this.Method2885();
      } while(Character.isWhitespace(a));

      return null;
   }

   public Object Method2901(char a) throws Class666 {
      StringBuilder a = new StringBuilder();

      while(true) {
         char a = this.Method2885();
         if (!Character.isLetterOrDigit(a) && a != '#') {
            if (a == ';') {
               String a = a.toString();
               return Method2902(a);
            }

            throw this.Method2895("Missing ';' in XML entity: &" + a);
         }

         a.append(Character.toLowerCase(a));
      }
   }

   static String Method2902(String a) {
      if (a.isEmpty()) {
         return "";
      } else if (a.charAt(0) != '#') {
         Character a = (Character)Field1560.Method2665(a);
         return '&' + a + ';';
      } else {
         int a;
         if (a.charAt(1) != 'x' && a.charAt(1) != 'X') {
            a = Integer.parseInt(a.substring(1));
         } else {
            a = Integer.parseInt(a.substring(2), 16);
         }

         return new String(new int[]{a}, 0, 1);
      }
   }

   public Object Method2903() throws Class666 {
      char a;
      do {
         a = this.Method2885();
      } while(Character.isWhitespace(a));

      switch (a) {
         case '\u0000':
            throw this.Method2895("Misshaped meta tag");
         case '!':
            return Class296.Field1569;
         case '"':
         case '\'':
            a = this.Method2885();
            throw this.Method2895("Unterminated string");
         case '/':
            return Class296.Field1575;
         case '<':
            return Class296.Field1572;
         case '=':
            return Class296.Field1570;
         case '>':
            return Class296.Field1571;
         case '?':
            return Class296.Field1573;
         default:
            while(true) {
               a = this.Method2885();
               if (Character.isWhitespace(a)) {
                  return Boolean.TRUE;
               }

               switch (a) {
                  case '\u0000':
                     throw this.Method2895("Unterminated string");
                  case '!':
                  case '"':
                  case '\'':
                  case '/':
                  case '<':
                  case '=':
                  case '>':
                  case '?':
                     this.Method2880();
                     return Boolean.TRUE;
               }
            }
      }
   }

   public Object Method2904() throws Class666 {
      int[] a = Class666.Method3438();

      char a;
      do {
         a = this.Method2885();
      } while(Character.isWhitespace(a));

      switch (a) {
         case '\u0000':
            throw this.Method2895("Misshaped element");
         case '!':
            return Class296.Field1569;
         case '"':
         case '\'':
            new StringBuilder();
            a = this.Method2885();
            throw this.Method2895("Unterminated string");
         case '/':
            return Class296.Field1575;
         case '<':
            throw this.Method2895("Misplaced '<'");
         case '=':
            return Class296.Field1570;
         case '>':
            return Class296.Field1571;
         case '?':
            return Class296.Field1573;
         default:
            StringBuilder a = new StringBuilder();

            while(true) {
               a.append(a);
               a = this.Method2885();
               if (Character.isWhitespace(a)) {
                  return a.toString();
               }

               switch (a) {
                  case '\u0000':
                     return a.toString();
                  case '!':
                  case '/':
                  case '=':
                  case '>':
                  case '?':
                  case '[':
                  case ']':
                     this.Method2880();
                     return a.toString();
                  case '"':
                  case '\'':
                  case '<':
                     throw this.Method2895("Bad character in a name");
               }
            }
      }
   }

   public void Method2905(String a) {
      byte a = 0;
      Class666.Method3438();
      int a = a.length();
      char[] a = new char[a];
      int a = 0;
      if (a < a) {
         char a = this.Method2885();
      } else {
         boolean a = true;
         a = 0;
         if (a < a) {
            if (a[a] != a.charAt(a)) {
               a = false;
            }

            int a = a + 1;
            if (a >= a) {
               int var10000 = a - a;
            }

            ++a;
         }

      }
   }

   static {
      Field1560.put("amp", Class296.Field1567);
      Field1560.put("apos", Class296.Field1568);
      Field1560.put("gt", Class296.Field1571);
      Field1560.put("lt", Class296.Field1572);
      Field1560.put("quot", Class296.Field1574);
   }

   private static Class666 Method2906(Class666 class666) {
      return class666;
   }
}
