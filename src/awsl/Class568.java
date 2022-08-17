package awsl;

import java.util.Iterator;
import java.util.Locale;
import obfuscate.a;

public class Class568 {
   public static String Method1249(String a) {
      String var2 = a.trim();
      int var3 = var2.length();
      StringBuilder var4 = new StringBuilder(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         char var1 = var2.charAt(var5);
         if (var1 >= ' ' && var1 != '+' && var1 != '%' && var1 != '=' && var1 != ';') {
            var4.append(var1);
         } else {
            var4.append('%');
            var4.append(Character.forDigit((char)(var1 >>> 4 & 15), 16));
            var4.append(Character.forDigit((char)(var1 & 15), 16));
         }
      }

      return var4.toString();
   }

   public static Class298 Method1250(String a) {
      Class298 var1 = new Class298();
      Class290 var4 = new Class290(a);
      String var2 = Method1252(var4.Method2891('=').trim());
      if ("".equals(var2)) {
         throw new Class666("Cookies must have a 'name'");
      } else {
         var1.Method3009("name", var2);
         var4.Method2887('=');
         var1.Method3009("value", Method1252(var4.Method2891(';')).trim());
         var4.Method2885();

         while(var4.Method2884()) {
            var2 = Method1252(var4.Method2892("=;")).trim().toLowerCase(Locale.ROOT);
            if ("name".equalsIgnoreCase(var2)) {
               throw new Class666("Illegal attribute name: 'name'");
            }

            if ("value".equalsIgnoreCase(var2)) {
               throw new Class666("Illegal attribute name: 'value'");
            }

            Object var3;
            if (var4.Method2885() != '=') {
               var3 = Boolean.TRUE;
            } else {
               var3 = Method1252(var4.Method2891(';')).trim();
               var4.Method2885();
            }

            if (!"".equals(var2) && !"".equals(var3)) {
               var1.Method3009(var2, var3);
            }
         }

         return var1;
      }
   }

   public static String Method1251(Class298 a) throws Class666 {
      StringBuilder var2 = new StringBuilder();
      Class666.Method3438();
      String var3 = null;
      String var4 = null;
      Iterator var5 = a.Method2968().Method1383();
      String var6;
      if (var5.Method932()) {
         var6 = (String)var5.Method933();
         if ("name".equalsIgnoreCase(var6)) {
            var3 = a.Method2963(var6).trim();
         }

         if ("value".equalsIgnoreCase(var6)) {
            var4 = a.Method2963(var6).trim();
         }
      }

      if ("".equals(var3.trim())) {
         throw new Class666("Cookie does not have a name");
      } else {
         var4 = "";
         var2.append(Method1249(var3));
         var2.append("=");
         var2.append(Method1249((String)var4));
         var5 = a.Method2968().Method1383();

         while(var5.Method932()) {
            var6 = (String)var5.Method933();
            if (!"name".equalsIgnoreCase(var6)) {
               if ("value".equalsIgnoreCase(var6)) {
                  ;
               }

               Object var7 = a.Method2974(var6);
               if (var7 instanceof Boolean) {
                  if (!Boolean.TRUE.equals(var7)) {
                     break;
                  }

                  var2.append(';').append(Method1249(var6));
               }

               var2.append(';').append(Method1249(var6)).append('=').append(Method1249(var7.Method3780()));
               break;
            }
         }

         String var10000 = var2.toString();
         if (a.trash() == null) {
            Class666.Method85(new int[2]);
         }

         return var10000;
      }
   }

   public static String Method1252(String a) {
      int var1 = a.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = a.charAt(var3);
         if (var4 == '+') {
            var4 = ' ';
         } else if (var4 == '%' && var3 + 2 < var1) {
            int var5 = Class290.Method2882(a.charAt(var3 + 1));
            int var6 = Class290.Method2882(a.charAt(var3 + 2));
            var4 = (char)(var5 * 16 + var6);
            var3 += 2;
         }

         var2.append(var4);
      }

      return var2.toString();
   }

   private static Class666 Method1253(Class666 class666) {
      return class666;
   }
}
