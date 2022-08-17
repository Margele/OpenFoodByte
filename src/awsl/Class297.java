package awsl;

import java.util.Iterator;

public class Class297 {
   private static Object Method3037(Class292 a, boolean a1, Class288 a, boolean a3) throws Class666 {
      Object var7 = null;
      Class666.Method3438();
      Class288 a = null;
      Class298 a = null;
      String a = null;

      while(a.Method2884()) {
         Object a = a.Method2900();
         if (a == Class296.Field1572) {
            a = a.Method2904();
            if (a instanceof Character) {
               if (a == Class296.Field1575) {
                  a = a.Method2904();
                  if (!(a instanceof String)) {
                     throw new Class666("Expected a closing name instead of '" + a + "'.");
                  }

                  if (a.Method2904() != Class296.Field1571) {
                     throw a.Method2895("Misshaped close tag");
                  }

                  return a;
               }

               if (a == Class296.Field1569) {
                  char a = a.Method2885();
                  if (a == '-') {
                     if (a.Method2885() == '-') {
                        a.Method2905("-->");
                     }

                     a.Method2880();
                  }

                  if (a == '[') {
                     a = a.Method2904();
                     if (a.Method3429("CDATA") && a.Method2885() == '[') {
                        a.Method3154(a.Method2899());
                     }

                     throw a.Method2895("Expected 'CDATA['");
                  }

                  int a = true;
                  a = a.Method2903();
                  throw a.Method2895("Missing '>' after '<!'.");
               }

               if (a == Class296.Field1573) {
                  a.Method2905("?>");
               }

               throw a.Method2895("Misshaped tag");
            }

            if (!(a instanceof String)) {
               throw a.Method2895("Bad tagName '" + a + "'.");
            }

            a = (String)a;
            a = new Class288();
            a = new Class298();
            a.Method3154(a);
            a.Method3154(a);
            a.Method3009("tagName", a);
            a.Method3154(a);
            a = null;
            a = a.Method2904();
            throw a.Method2895("Misshaped tag");
         }

         a.Method3154(a instanceof String ? Class296.Method2926((String)a) : a);
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
      StringBuilder a = new StringBuilder();
      String a = a.Method3125(0);
      Class296.Method2927(a);
      a = Class296.Method2924(a);
      a.append('<');
      a.append(a);
      Object a = a.Method3128(1);
      int a;
      if (a instanceof Class298) {
         a = 2;
         Class298 a = (Class298)a;
         Iterator var7 = a.Method2968().Method1383();

         while(var7.Method932()) {
            String a = (String)var7.Method933();
            Object a = a.Method2974(a);
            Class296.Method2927(a);
            a.append(' ');
            a.append(Class296.Method2924(a));
            a.append('=');
            a.append('"');
            a.append(Class296.Method2924(a.Method3780()));
            a.append('"');
         }
      } else {
         a = 1;
      }

      int a = a.Method10();
      if (a >= a) {
         a.append('/');
         a.append('>');
      } else {
         a.append('>');

         do {
            a = a.Method3115(a);
            ++a;
            if (a instanceof String) {
               a.append(Class296.Method2924(a.Method3780()));
            } else if (a instanceof Class298) {
               a.append(Method3047((Class298)a));
            } else if (a instanceof Class288) {
               a.append(Method3046((Class288)a));
            } else {
               a.append(a.Method3780());
            }
         } while(a < a);

         a.append('<');
         a.append('/');
         a.append(a);
         a.append('>');
      }

      return a.toString();
   }

   public static String Method3047(Class298 a) throws Class666 {
      new StringBuilder();
      String a = a.Method2995("tagName");
      return Class296.Method2924(a.Method3025());
   }

   private static Class666 Method3048(Class666 class666) {
      return class666;
   }
}
