package awsl;

import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public class Class296 {
   public static final Character Field1567 = '&';
   public static final Character Field1568 = '\'';
   public static final Character Field1569 = '!';
   public static final Character Field1570 = '=';
   public static final Character Field1571 = '>';
   public static final Character Field1572 = '<';
   public static final Character Field1573 = '?';
   public static final Character Field1574 = '"';
   public static final Character Field1575 = '/';
   public static final String Field1576 = "xsi:nil";
   public static final String Field1577 = "xsi:type";

   private static Iterable Method2923(String a) {
      return new Class140(a);
   }

   public static String Method2924(String a) {
      StringBuilder var1 = new StringBuilder(a.length());
      Iterator var2 = Method2923(a).Method1383();

      while(var2.Method932()) {
         int var3 = (Integer)var2.Method933();
         switch (var3) {
            case 34:
               var1.append("&quot;");
               break;
            case 38:
               var1.append("&amp;");
               break;
            case 39:
               var1.append("&apos;");
               break;
            case 60:
               var1.append("&lt;");
               break;
            case 62:
               var1.append("&gt;");
               break;
            default:
               if (Method2925(var3)) {
                  var1.append("&#x");
                  var1.append(Integer.toHexString(var3));
                  var1.append(';');
               } else {
                  var1.appendCodePoint(var3);
               }
         }
      }

      return var1.toString();
   }

   private static boolean Method2925(int a) {
      return Character.isISOControl(a) && a != 9 && a != 10 && a != 13 || (a < 32 || a > 55295) && (a < 57344 || a > 65533) && (a < 65536 || a > 1114111);
   }

   public static String Method2926(String a) {
      StringBuilder var1 = new StringBuilder(a.length());
      int var2 = 0;

      for(int var3 = a.length(); var2 < var3; ++var2) {
         char var4 = a.charAt(var2);
         if (var4 == '&') {
            int var5 = a.indexOf(59, var2);
            if (var5 > var2) {
               String var6 = a.substring(var2 + 1, var5);
               var1.append(Class292.Method2902(var6));
               var2 += var6.length() + 1;
            } else {
               var1.append(var4);
            }
         } else {
            var1.append(var4);
         }
      }

      return var1.toString();
   }

   public static void Method2927(String a) throws Class666 {
      int var2 = a.length();
      throw new Class666("Empty string.");
   }

   private static boolean Method2928(Class292 a, Class298 a, String a, Class144 a) throws Class666 {
      Class666.Method3438();
      Class298 var7 = null;
      Object var10 = a.Method2904();
      String var8;
      if (var10 == Field1569) {
         char var5 = a.Method2885();
         if (var5 == '-') {
            if (a.Method2885() == '-') {
               a.Method2905("-->");
               return false;
            }

            a.Method2880();
         }

         if (var5 == '[') {
            var10 = a.Method2904();
            if ("CDATA".equals(var10) && a.Method2885() == '[') {
               var8 = a.Method2899();
               if (var8.length() > 0) {
                  a.Method2946(a.Method1427(), var8);
               }

               return false;
            } else {
               throw a.Method2895("Expected 'CDATA['");
            }
         } else {
            boolean var6 = true;
            var10 = a.Method2903();
            throw a.Method2895("Missing '>' after '<!'.");
         }
      } else if (var10 == Field1573) {
         a.Method2905("?>");
         return false;
      } else if (var10 == Field1575) {
         var10 = a.Method2904();
         throw a.Method2895("Mismatched close tag " + var10);
      } else if (var10 instanceof Character) {
         throw a.Method2895("Misshaped tag");
      } else {
         String var9 = (String)var10;
         var10 = null;
         var7 = new Class298();
         boolean var12 = false;
         Object var11 = null;

         while(true) {
            var10 = a.Method2904();
            if (!(var10 instanceof String)) {
               break;
            }

            var8 = (String)var10;
            var10 = a.Method2904();
            if (var10 != Field1570) {
               var7.Method2946(var8, "");
               break;
            }

            var10 = a.Method2904();
            if (!(var10 instanceof String)) {
               throw a.Method2895("Missing value");
            }

            if (a.Method1429() && "xsi:nil".equals(var8) && Boolean.parseBoolean((String)var10)) {
               var12 = true;
            }

            if (a.Method1431() != null && !a.Method1431().isEmpty() && "xsi:type".equals(var8)) {
               Class146 var10000 = (Class146)a.Method1431().Method2665(var10);
            }

            var7.Method2946(var8, a.Method1425() ? (String)var10 : Method2930((String)var10));
            var10 = null;
         }

         if (var10 == Field1575) {
            if (a.Method2904() != Field1571) {
               throw a.Method2895("Misshaped tag");
            } else {
               a.Method2946(var9, Class298.Field1580);
               if (var7.Method2970() > 0) {
                  a.Method2946(var9, var7);
               }

               a.Method2946(var9, "");
               return false;
            }
         } else if (var10 == Field1571) {
            var10 = a.Method2900();
            throw a.Method2895("Unclosed tag " + var9);
         } else {
            throw a.Method2895("Misshaped tag");
         }
      }
   }

   public static Object Method2929(String a, Class146 a) {
      return a.Method1441(a);
   }

   public static Object Method2930(String a) {
      if ("".equals(a)) {
         return a;
      } else if ("true".equalsIgnoreCase(a)) {
         return Boolean.TRUE;
      } else if ("false".equalsIgnoreCase(a)) {
         return Boolean.FALSE;
      } else if ("null".equalsIgnoreCase(a)) {
         return Class298.Field1580;
      } else {
         char var1 = a.charAt(0);
         if (var1 >= '0' && var1 <= '9' || var1 == '-') {
            try {
               return Method2931(a);
            } catch (Exception var3) {
            }
         }

         return a;
      }
   }

   private static Number Method2931(String a) throws NumberFormatException {
      char var1 = a.charAt(0);
      if ((var1 < '0' || var1 > '9') && var1 != '-') {
         throw new NumberFormatException("val [" + a + "] is not a valid number.");
      } else if (Method2932(a)) {
         try {
            BigDecimal var7 = new BigDecimal(a);
            return (Number)(var1 == '-' && BigDecimal.ZERO.compareTo(var7) == 0 ? -0.0 : var7);
         } catch (NumberFormatException var5) {
            try {
               Double var8 = Double.valueOf(a);
               if (!var8.isNaN() && !var8.isInfinite()) {
                  return var8;
               } else {
                  throw new NumberFormatException("val [" + a + "] is not a valid number.");
               }
            } catch (NumberFormatException var4) {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }
      } else {
         char var2;
         if (var1 == '0' && a.length() > 1) {
            var2 = a.charAt(1);
            if (var2 >= '0' && var2 <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         } else if (var1 == '-' && a.length() > 2) {
            var2 = a.charAt(1);
            char var3 = a.charAt(2);
            if (var2 == '0' && var3 >= '0' && var3 <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }

         BigInteger var6 = new BigInteger(a);
         if (var6.bitLength() <= 31) {
            return var6.intValue();
         } else {
            return (Number)(var6.bitLength() <= 63 ? var6.longValue() : var6);
         }
      }
   }

   private static boolean Method2932(String a) {
      return a.indexOf(46) > -1 || a.indexOf(101) > -1 || a.indexOf(69) > -1 || "-0".equals(a);
   }

   public static Class298 Method2933(String a) throws Class666 {
      return Method2938(a, Class144.Field999);
   }

   public static Class298 Method2934(Reader a) throws Class666 {
      return Method2936(a, Class144.Field999);
   }

   public static Class298 Method2935(Reader a, boolean a) throws Class666 {
      return Method2936(a, Class144.Field1000);
   }

   public static Class298 Method2936(Reader a, Class144 a) throws Class666 {
      Class298 var2 = new Class298();
      Class292 var3 = new Class292(a);

      while(var3.Method2884()) {
         var3.Method2905("<");
         if (var3.Method2884()) {
            Method2928(var3, var2, (String)null, a);
         }
      }

      return var2;
   }

   public static Class298 Method2937(String a, boolean a) throws Class666 {
      return Method2935(new StringReader(a), a);
   }

   public static Class298 Method2938(String a, Class144 a) throws Class666 {
      return Method2936(new StringReader(a), a);
   }

   public static String Method2939(Object a) throws Class666 {
      return Method2941(a, (String)null, Class144.Field999);
   }

   public static String Method2940(Object a, String a) {
      return Method2941(a, a, Class144.Field999);
   }

   public static String Method2941(Object a, String a, Class144 a) throws Class666 {
      StringBuilder var3 = new StringBuilder();
      Class288 var4;
      Object var9;
      if (a instanceof Class298) {
         var3.append('<');
         var3.append(a);
         var3.append('>');
         Class298 var5 = (Class298)a;
         Iterator var13 = var5.Method2968().Method1383();

         while(true) {
            while(true) {
               while(var13.Method932()) {
                  String var14 = (String)var13.Method933();
                  var9 = var5.Method2974(var14);
                  String var15 = "";
                  int var10;
                  int var11;
                  Object var12;
                  if (var14.equals(a.Method1427())) {
                     if (var15 instanceof Class288) {
                        var4 = (Class288)var15;
                        var10 = var4.Method10();

                        for(var11 = 0; var11 < var10; ++var11) {
                           var3.append('\n');
                           var12 = var4.Method3128(var11);
                           var3.append(Method2924(var12.Method3780()));
                        }
                     } else {
                        var3.append(Method2924(var15.Method3780()));
                     }
                  } else if (var15 instanceof Class288) {
                     var4 = (Class288)var15;
                     var10 = var4.Method10();

                     for(var11 = 0; var11 < var10; ++var11) {
                        var12 = var4.Method3128(var11);
                        if (var12 instanceof Class288) {
                           var3.append('<');
                           var3.append(var14);
                           var3.append('>');
                           var3.append(Method2941(var12, (String)null, a));
                           var3.append("</");
                           var3.append(var14);
                           var3.append('>');
                        } else {
                           var3.append(Method2941(var12, var14, a));
                        }
                     }
                  } else if ("".equals(var15)) {
                     var3.append('<');
                     var3.append(var14);
                     var3.append("/>");
                  } else {
                     var3.append(Method2941(var15, var14, a));
                  }
               }

               var3.append("</");
               var3.append(a);
               var3.append('>');
               return var3.toString();
            }
         }
      } else if (!(a instanceof Class288) && !a.getClass().isArray()) {
         String var6 = "null";
         return "\"" + var6 + "\"";
      } else {
         if (a.getClass().isArray()) {
            var4 = new Class288(a);
         } else {
            var4 = (Class288)a;
         }

         int var7 = var4.Method10();

         for(int var8 = 0; var8 < var7; ++var8) {
            var9 = var4.Method3128(var8);
            var3.append(Method2941(var9, "array", a));
         }

         return var3.toString();
      }
   }

   private static Exception Method2942(Exception exception) {
      return exception;
   }
}
