package awsl;

import java.util.Iterator;
import java.util.Locale;
import obfuscate.a;

public class Class568 {
   public static String Method1249(String a) {
      String a = a.trim();
      int a = a.length();
      StringBuilder a = new StringBuilder(a);

      for(int a = 0; a < a; ++a) {
         char a = a.charAt(a);
         if (a >= ' ' && a != '+' && a != '%' && a != '=' && a != ';') {
            a.append(a);
         } else {
            a.append('%');
            a.append(Character.forDigit((char)(a >>> 4 & 15), 16));
            a.append(Character.forDigit((char)(a & 15), 16));
         }
      }

      return a.toString();
   }

   public static Class298 Method1250(String a) {
      Class298 a = new Class298();
      Class290 a = new Class290(a);
      String a = Method1252(a.Method2891('=').trim());
      if ("".equals(a)) {
         throw new Class666("Cookies must have a 'name'");
      } else {
         a.Method3009("name", a);
         a.Method2887('=');
         a.Method3009("value", Method1252(a.Method2891(';')).trim());
         a.Method2885();

         while(a.Method2884()) {
            a = Method1252(a.Method2892("=;")).trim().toLowerCase(Locale.ROOT);
            if ("name".equalsIgnoreCase(a)) {
               throw new Class666("Illegal attribute name: 'name'");
            }

            if ("value".equalsIgnoreCase(a)) {
               throw new Class666("Illegal attribute name: 'value'");
            }

            Object a;
            if (a.Method2885() != '=') {
               a = Boolean.TRUE;
            } else {
               a = Method1252(a.Method2891(';')).trim();
               a.Method2885();
            }

            if (!"".equals(a) && !"".equals(a)) {
               a.Method3009(a, a);
            }
         }

         return a;
      }
   }

   public static String Method1251(Class298 a) throws Class666 {
      StringBuilder a = new StringBuilder();
      Class666.Method3438();
      String a = null;
      Object a = null;
      Iterator var5 = a.Method2968().Method1383();
      String a;
      if (var5.Method932()) {
         a = (String)var5.Method933();
         if ("name".equalsIgnoreCase(a)) {
            a = a.Method2963(a).trim();
         }

         if ("value".equalsIgnoreCase(a)) {
            a = a.Method2963(a).trim();
         }
      }

      if ("".equals(a.trim())) {
         throw new Class666("Cookie does not have a name");
      } else {
         a = "";
         a.append(Method1249(a));
         a.append("=");
         a.append(Method1249((String)a));
         var5 = a.Method2968().Method1383();

         while(var5.Method932()) {
            a = (String)var5.Method933();
            if (!"name".equalsIgnoreCase(a)) {
               if ("value".equalsIgnoreCase(a)) {
                  ;
               }

               Object a = a.Method2974(a);
               if (a instanceof Boolean) {
                  if (!Boolean.TRUE.equals(a)) {
                     break;
                  }

                  a.append(';').append(Method1249(a));
               }

               a.append(';').append(Method1249(a)).append('=').append(Method1249(a.Method3780()));
               break;
            }
         }

         String var10000 = a.toString();
         if (a.trash() == null) {
            Class666.Method85(new int[2]);
         }

         return var10000;
      }
   }

   public static String Method1252(String a) {
      int a = a.length();
      StringBuilder a = new StringBuilder(a);

      for(int a = 0; a < a; ++a) {
         char a = a.charAt(a);
         if (a == '+') {
            a = ' ';
         } else if (a == '%' && a + 2 < a) {
            int a = Class290.Method2882(a.charAt(a + 1));
            int a = Class290.Method2882(a.charAt(a + 2));
            a = (char)(a * 16 + a);
            a += 2;
         }

         a.append(a);
      }

      return a.toString();
   }

   private static Class666 Method1253(Class666 class666) {
      return class666;
   }
}
