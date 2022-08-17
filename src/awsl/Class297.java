package awsl;

import java.util.Iterator;

public class Class297 {
   private static Object Method3037(Class292 a, boolean a, Class288 a, boolean a) throws Class666 {
      Object var7 = null;
      Class666.Method3438();
      Class288 var9 = null;
      Class298 var10 = null;
      String var12 = null;

      while(a.Method2884()) {
         Object var11 = a.Method2900();
         if (var11 == Class296.Field1572) {
            var11 = a.Method2904();
            if (var11 instanceof Character) {
               if (var11 == Class296.Field1575) {
                  var11 = a.Method2904();
                  if (!(var11 instanceof String)) {
                     throw new Class666("Expected a closing name instead of '" + var11 + "'.");
                  }

                  if (a.Method2904() != Class296.Field1571) {
                     throw a.Method2895("Misshaped close tag");
                  }

                  return var11;
               }

               if (var11 == Class296.Field1569) {
                  char var6 = a.Method2885();
                  if (var6 == '-') {
                     if (a.Method2885() == '-') {
                        a.Method2905("-->");
                     }

                     a.Method2880();
                  }

                  if (var6 == '[') {
                     var11 = a.Method2904();
                     if (var11.Method3429("CDATA") && a.Method2885() == '[') {
                        a.Method3154(a.Method2899());
                     }

                     throw a.Method2895("Expected 'CDATA['");
                  }

                  boolean var8 = true;
                  var11 = a.Method2903();
                  throw a.Method2895("Missing '>' after '<!'.");
               }

               if (var11 == Class296.Field1573) {
                  a.Method2905("?>");
               }

               throw a.Method2895("Misshaped tag");
            }

            if (!(var11 instanceof String)) {
               throw a.Method2895("Bad tagName '" + var11 + "'.");
            }

            var12 = (String)var11;
            var9 = new Class288();
            var10 = new Class298();
            var9.Method3154(var12);
            a.Method3154(var9);
            var10.Method3009("tagName", var12);
            a.Method3154(var10);
            var11 = null;
            var11 = a.Method2904();
            throw a.Method2895("Misshaped tag");
         }

         a.Method3154(var11 instanceof String ? Class296.Method2926((String)var11) : var11);
      }

      throw a.Method2895("Bad XML");
   }

   public static Class288 Method3038(String a) throws Class666 {
      return (Class288)Method3037(new Class292(a), true, (Class288)null, false);
   }

   public static Class288 Method3039(String a, boolean a) throws Class666 {
      return (Class288)Method3037(new Class292(a), true, (Class288)null, a);
   }

   public static Class288 Method3040(Class292 a, boolean a) throws Class666 {
      return (Class288)Method3037(a, true, (Class288)null, a);
   }

   public static Class288 Method3041(Class292 a) throws Class666 {
      return (Class288)Method3037(a, true, (Class288)null, false);
   }

   public static Class298 Method3042(String a) throws Class666 {
      return (Class298)Method3037(new Class292(a), false, (Class288)null, false);
   }

   public static Class298 Method3043(String a, boolean a) throws Class666 {
      return (Class298)Method3037(new Class292(a), false, (Class288)null, a);
   }

   public static Class298 Method3044(Class292 a) throws Class666 {
      return (Class298)Method3037(a, false, (Class288)null, false);
   }

   public static Class298 Method3045(Class292 a, boolean a) throws Class666 {
      return (Class298)Method3037(a, false, (Class288)null, a);
   }

   public static String Method3046(Class288 a) throws Class666 {
      StringBuilder var5 = new StringBuilder();
      String var6 = a.Method3125(0);
      Class296.Method2927(var6);
      var6 = Class296.Method2924(var6);
      var5.append('<');
      var5.append(var6);
      Object var4 = a.Method3128(1);
      int var1;
      if (var4 instanceof Class298) {
         var1 = 2;
         Class298 var2 = (Class298)var4;
         Iterator var7 = var2.Method2968().Method1383();

         while(var7.Method932()) {
            String var8 = (String)var7.Method933();
            Object var9 = var2.Method2974(var8);
            Class296.Method2927(var8);
            var5.append(' ');
            var5.append(Class296.Method2924(var8));
            var5.append('=');
            var5.append('"');
            var5.append(Class296.Method2924(var9.Method3780()));
            var5.append('"');
         }
      } else {
         var1 = 1;
      }

      int var3 = a.Method10();
      if (var1 >= var3) {
         var5.append('/');
         var5.append('>');
      } else {
         var5.append('>');

         do {
            var4 = a.Method3115(var1);
            ++var1;
            if (var4 instanceof String) {
               var5.append(Class296.Method2924(var4.Method3780()));
            } else if (var4 instanceof Class298) {
               var5.append(Method3047((Class298)var4));
            } else if (var4 instanceof Class288) {
               var5.append(Method3046((Class288)var4));
            } else {
               var5.append(var4.Method3780());
            }
         } while(var1 < var3);

         var5.append('<');
         var5.append('/');
         var5.append(var6);
         var5.append('>');
      }

      return var5.toString();
   }

   public static String Method3047(Class298 a) throws Class666 {
      new StringBuilder();
      String var6 = a.Method2995("tagName");
      return Class296.Method2924(a.Method3025());
   }

   private static Class666 Method3048(Class666 class666) {
      return class666;
   }
}
