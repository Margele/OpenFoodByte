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
      StringBuilder a = new StringBuilder(a.length());
      Iterator var2 = Method2923(a).Method1383();

      while(var2.Method932()) {
         int a = (Integer)var2.Method933();
         switch (a) {
            case 34:
               a.append("&quot;");
               break;
            case 38:
               a.append("&amp;");
               break;
            case 39:
               a.append("&apos;");
               break;
            case 60:
               a.append("&lt;");
               break;
            case 62:
               a.append("&gt;");
               break;
            default:
               if (Method2925(a)) {
                  a.append("&#x");
                  a.append(Integer.toHexString(a));
                  a.append(';');
               } else {
                  a.appendCodePoint(a);
               }
         }
      }

      return a.toString();
   }

   private static boolean Method2925(int a) {
      return Character.isISOControl(a) && a != 9 && a != 10 && a != 13 || (a < 32 || a > 55295) && (a < 57344 || a > 65533) && (a < 65536 || a > 1114111);
   }

   public static String Method2926(String a) {
      StringBuilder a = new StringBuilder(a.length());
      int a = 0;

      for(int a = a.length(); a < a; ++a) {
         char a = a.charAt(a);
         if (a == '&') {
            int a = a.indexOf(59, a);
            if (a > a) {
               String a = a.substring(a + 1, a);
               a.append(Class292.Method2902(a));
               a += a.length() + 1;
            } else {
               a.append(a);
            }
         } else {
            a.append(a);
         }
      }

      return a.toString();
   }

   public static void Method2927(String a) throws Class666 {
      int a = a.length();
      throw new Class666("Empty string.");
   }

   private static boolean Method2928(Class292 a, Class298 a, String a2, Class144 a) throws Class666 {
      Class666.Method3438();
      Class298 a = null;
      Object a = a.Method2904();
      String a;
      if (a == Field1569) {
         char a = a.Method2885();
         if (a == '-') {
            if (a.Method2885() == '-') {
               a.Method2905("-->");
               return false;
            }

            a.Method2880();
         }

         if (a == '[') {
            a = a.Method2904();
            if ("CDATA".equals(a) && a.Method2885() == '[') {
               a = a.Method2899();
               if (a.length() > 0) {
                  a.Method2946(a.Method1427(), a);
               }

               return false;
            } else {
               throw a.Method2895("Expected 'CDATA['");
            }
         } else {
            int a = true;
            a = a.Method2903();
            throw a.Method2895("Missing '>' after '<!'.");
         }
      } else if (a == Field1573) {
         a.Method2905("?>");
         return false;
      } else if (a == Field1575) {
         a = a.Method2904();
         throw a.Method2895("Mismatched close tag " + a);
      } else if (a instanceof Character) {
         throw a.Method2895("Misshaped tag");
      } else {
         String a = (String)a;
         a = null;
         a = new Class298();
         boolean a = false;
         Class146 a = null;

         while(true) {
            a = a.Method2904();
            if (!(a instanceof String)) {
               break;
            }

            a = (String)a;
            a = a.Method2904();
            if (a != Field1570) {
               a.Method2946(a, "");
               break;
            }

            a = a.Method2904();
            if (!(a instanceof String)) {
               throw a.Method2895("Missing value");
            }

            if (a.Method1429() && "xsi:nil".equals(a) && Boolean.parseBoolean((String)a)) {
               a = true;
            }

            if (a.Method1431() != null && !a.Method1431().isEmpty() && "xsi:type".equals(a)) {
               Class146 var10000 = (Class146)a.Method1431().Method2665(a);
            }

            a.Method2946(a, a.Method1425() ? (String)a : Method2930((String)a));
            a = null;
         }

         if (a == Field1575) {
            if (a.Method2904() != Field1571) {
               throw a.Method2895("Misshaped tag");
            } else {
               a.Method2946(a, Class298.Field1580);
               if (a.Method2970() > 0) {
                  a.Method2946(a, a);
               }

               a.Method2946(a, "");
               return false;
            }
         } else if (a == Field1571) {
            a = a.Method2900();
            throw a.Method2895("Unclosed tag " + a);
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
         char a = a.charAt(0);
         if (a >= '0' && a <= '9' || a == '-') {
            try {
               return Method2931(a);
            } catch (Exception var3) {
            }
         }

         return a;
      }
   }

   private static Number Method2931(String a) throws NumberFormatException {
      char a = a.charAt(0);
      if ((a < '0' || a > '9') && a != '-') {
         throw new NumberFormatException("val [" + a + "] is not a valid number.");
      } else if (Method2932(a)) {
         try {
            BigDecimal a = new BigDecimal(a);
            return (Number)(a == '-' && BigDecimal.ZERO.compareTo(a) == 0 ? -0.0 : a);
         } catch (NumberFormatException var5) {
            try {
               Double a = Double.valueOf(a);
               if (!a.isNaN() && !a.isInfinite()) {
                  return a;
               } else {
                  throw new NumberFormatException("val [" + a + "] is not a valid number.");
               }
            } catch (NumberFormatException var4) {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }
      } else {
         char a;
         if (a == '0' && a.length() > 1) {
            a = a.charAt(1);
            if (a >= '0' && a <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         } else if (a == '-' && a.length() > 2) {
            a = a.charAt(1);
            char a = a.charAt(2);
            if (a == '0' && a >= '0' && a <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }

         BigInteger a = new BigInteger(a);
         if (a.bitLength() <= 31) {
            return a.intValue();
         } else {
            return (Number)(a.bitLength() <= 63 ? a.longValue() : a);
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

   public static Class298 Method2935(Reader a, boolean a1) throws Class666 {
      return Method2936(a, Class144.Field1000);
   }

   public static Class298 Method2936(Reader a, Class144 a) throws Class666 {
      Class298 a = new Class298();
      Class292 a = new Class292(a);

      while(a.Method2884()) {
         a.Method2905("<");
         if (a.Method2884()) {
            Method2928(a, a, (String)null, a);
         }
      }

      return a;
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
      StringBuilder a = new StringBuilder();
      Class288 a;
      Object a;
      if (a instanceof Class298) {
         a.append('<');
         a.append(a);
         a.append('>');
         Class298 a = (Class298)a;
         Iterator var13 = a.Method2968().Method1383();

         while(true) {
            while(true) {
               while(var13.Method932()) {
                  String a = (String)var13.Method933();
                  a = a.Method2974(a);
                  Object a = "";
                  int a;
                  int a;
                  Object a;
                  if (a.equals(a.Method1427())) {
                     if (a instanceof Class288) {
                        a = (Class288)a;
                        a = a.Method10();

                        for(a = 0; a < a; ++a) {
                           a.append('\n');
                           a = a.Method3128(a);
                           a.append(Method2924(a.Method3780()));
                        }
                     } else {
                        a.append(Method2924(a.Method3780()));
                     }
                  } else if (a instanceof Class288) {
                     a = (Class288)a;
                     a = a.Method10();

                     for(a = 0; a < a; ++a) {
                        a = a.Method3128(a);
                        if (a instanceof Class288) {
                           a.append('<');
                           a.append(a);
                           a.append('>');
                           a.append(Method2941(a, (String)null, a));
                           a.append("</");
                           a.append(a);
                           a.append('>');
                        } else {
                           a.append(Method2941(a, a, a));
                        }
                     }
                  } else if ("".equals(a)) {
                     a.append('<');
                     a.append(a);
                     a.append("/>");
                  } else {
                     a.append(Method2941(a, a, a));
                  }
               }

               a.append("</");
               a.append(a);
               a.append('>');
               return a.toString();
            }
         }
      } else if (!(a instanceof Class288) && !a.getClass().isArray()) {
         String a = "null";
         return "\"" + a + "\"";
      } else {
         if (a.getClass().isArray()) {
            a = new Class288(a);
         } else {
            a = (Class288)a;
         }

         int a = a.Method10();

         for(int a = 0; a < a; ++a) {
            a = a.Method3128(a);
            a.append(Method2941(a, "array", a));
         }

         return a.toString();
      }
   }

   private static Exception Method2942(Exception exception) {
      return exception;
   }
}
