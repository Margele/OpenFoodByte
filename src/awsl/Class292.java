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
      StringBuilder var3 = new StringBuilder();

      int var2;
      do {
         if (!this.Method2884()) {
            throw this.Method2895("Unclosed CDATA");
         }

         char var1 = this.Method2885();
         var3.append(var1);
         var2 = var3.length() - 3;
      } while(var3.charAt(var2) != ']' || var3.charAt(var2 + 1) != ']' || var3.charAt(var2 + 2) != '>');

      var3.setLength(var2);
      return var3.toString();
   }

   public Object Method2900() throws Class666 {
      char var1;
      do {
         var1 = this.Method2885();
      } while(Character.isWhitespace(var1));

      return null;
   }

   public Object Method2901(char a) throws Class666 {
      StringBuilder var2 = new StringBuilder();

      while(true) {
         char var3 = this.Method2885();
         if (!Character.isLetterOrDigit(var3) && var3 != '#') {
            if (var3 == ';') {
               String var4 = var2.toString();
               return Method2902(var4);
            }

            throw this.Method2895("Missing ';' in XML entity: &" + var2);
         }

         var2.append(Character.toLowerCase(var3));
      }
   }

   static String Method2902(String a) {
      if (a.isEmpty()) {
         return "";
      } else if (a.charAt(0) != '#') {
         Character var2 = (Character)Field1560.Method2665(a);
         return '&' + a + ';';
      } else {
         int var1;
         if (a.charAt(1) != 'x' && a.charAt(1) != 'X') {
            var1 = Integer.parseInt(a.substring(1));
         } else {
            var1 = Integer.parseInt(a.substring(2), 16);
         }

         return new String(new int[]{var1}, 0, 1);
      }
   }

   public Object Method2903() throws Class666 {
      char var1;
      do {
         var1 = this.Method2885();
      } while(Character.isWhitespace(var1));

      switch (var1) {
         case '\u0000':
            throw this.Method2895("Misshaped meta tag");
         case '!':
            return Class296.Field1569;
         case '"':
         case '\'':
            var1 = this.Method2885();
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
               var1 = this.Method2885();
               if (Character.isWhitespace(var1)) {
                  return Boolean.TRUE;
               }

               switch (var1) {
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
      int[] var1 = Class666.Method3438();

      char var2;
      do {
         var2 = this.Method2885();
      } while(Character.isWhitespace(var2));

      switch (var2) {
         case '\u0000':
            throw this.Method2895("Misshaped element");
         case '!':
            return Class296.Field1569;
         case '"':
         case '\'':
            new StringBuilder();
            var2 = this.Method2885();
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
            StringBuilder var4 = new StringBuilder();

            while(true) {
               var4.append(var2);
               var2 = this.Method2885();
               if (Character.isWhitespace(var2)) {
                  return var4.toString();
               }

               switch (var2) {
                  case '\u0000':
                     return var4.toString();
                  case '!':
                  case '/':
                  case '=':
                  case '>':
                  case '?':
                  case '[':
                  case ']':
                     this.Method2880();
                     return var4.toString();
                  case '"':
                  case '\'':
                  case '<':
                     throw this.Method2895("Bad character in a name");
               }
            }
      }
   }

   public void Method2905(String a) {
      byte var7 = 0;
      Class666.Method3438();
      int var8 = a.length();
      char[] var9 = new char[var8];
      int var5 = 0;
      if (var5 < var8) {
         char var4 = this.Method2885();
      } else {
         boolean var3 = true;
         var5 = 0;
         if (var5 < var8) {
            if (var9[var7] != a.charAt(var5)) {
               var3 = false;
            }

            int var6 = var7 + 1;
            if (var6 >= var8) {
               int var10000 = var6 - var8;
            }

            ++var5;
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
