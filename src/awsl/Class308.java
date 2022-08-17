package awsl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import obfuscate.a;

public final class Class308 {
   private static String[] Field1592;

   public static a Method715(a a, int[] a, char[] a) {
      if (a.length != a.length) {
         throw new IllegalArgumentException("Mask must be same length as pattern");
      } else {
         return (a)Method716(a, a.length, Class308::Method740, Class308::Method739, Class308::Method738);
      }
   }

   public static Object Method716(a a, int a, Predicate a, BiPredicate a, BiFunction a) {
      String[] a = Method742();
      int a = 0;
      a a = a;
      boolean a = a.test(a);
      if (a.test(a, a)) {
         ++a;
      }

      int a = 1;
      if (a <= a - 1) {
         a = a.Method3641();
         ++a;
      }

      int a = 0;
      if (a >= a) {
         a a = a;
         int a = 1;
         if (a <= a - 1) {
            a = a.Method3641();
            ++a;
         }

         return a.apply(a, a);
      } else {
         a = a.Method3642();
         return null;
      }
   }

   public static a Method717(a a, int[] a, String a) {
      return Method715(a, a, a.toCharArray());
   }

   public static a Method718(a a, int[] a) {
      StringBuilder a = new StringBuilder();
      int[] var3 = a;
      int var4 = a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int a = var3[var5];
         a.append((char)(a == -666 ? '?' : 'x'));
      }

      return Method717(a, a, a.toString());
   }

   public static a Method719(Class116 a, int[] a) {
      return Method718(a.Method184(), a);
   }

   public static a Method720(Class15 a, int[] a) {
      return Method719(a.Field208, a);
   }

   public static a Method721(a a, int a) {
      a a = a;

      for(int a = 0; a < Math.abs(a); a = a.Method3642()) {
         ++a;
      }

      return a;
   }

   public static String Method722(Class224 a) {
      StringBuilder a = new StringBuilder("METHODS:\n");
      Method742();
      Iterator var3 = a.Field1260.Method1383();
      if (var3.Method932()) {
         Class15 a = (Class15)var3.Method933();
         a.append("\t");
         a.append(a.Field195);
         a.append(a.Field196);
         a.append("\n");
         a.trash(new String[3]);
      }

      a.append("\nFIELDS:\n");
      var3 = a.Field1259.Method1383();
      if (var3.Method932()) {
         Class241 a = (Class241)var3.Method933();
         a.append("\t");
         a.append(a.Field1343);
         a.append(" ");
         a.append(a.Field1342);
         a.append("\n");
      }

      return a.toString();
   }

   public static int Method723(Class15 a, String a, String a, Class104 a, Class104 a) {
      Optional a = a.Field212.stream().max(Comparator.comparingInt(Class308::Method737));
      int a = (Integer)a.map(Class308::Method736).orElse(0);
      Class790 a = new Class790(a, a, (String)null, a, a, a);
      a.Field212.Method2530(a);
      return a;
   }

   public static Class116 Method724(String a, String[] a, Class116 a) {
      String a = (String)Stream.of(a).collect(Collectors.joining("", "(", ")V"));
      return Method725(a, a, a);
   }

   public static Class116 Method725(String a, String a, Class116 a) {
      Class116 a = new Class116();
      a.Method194(new Class110(187, a));
      a.Method194(new Class83(89));
      a.Method195(a);
      a.Method194(new Class98(183, a, "<init>", a, false));
      return a;
   }

   public static Class15 Method726(Class224 a, String a, String a) {
      Iterator var3 = a.Field1260.Method1383();

      Class15 a;
      do {
         if (!var3.Method932()) {
            return null;
         }

         a = (Class15)var3.Method933();
      } while(!a.Field195.equals(a) || !a.Field196.equals(a));

      return a;
   }

   public static a Method727(Class15 a, int a, String a, String a, String a) {
      a[] var5 = a.Field208.Method192();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         a a = var5[var7];
         if (a instanceof Class98) {
            Class98 a = (Class98)a;
            if (a.Method3640() == a && a.Field824.equals(a) && a.Field825.equals(a) && a.Field826.equals(a)) {
               return a;
            }
         }
      }

      return null;
   }

   public static a Method728(Class15 a, int a, String a, String a, String a) {
      a[] var5 = a.Field208.Method192();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         a a = var5[var7];
         if (a instanceof Class93) {
            Class93 a = (Class93)a;
            if (a.Method3640() == a && a.Field807.equals(a) && a.Field808.equals(a) && a.Field809.equals(a)) {
               return a;
            }
         }
      }

      return null;
   }

   public static List Method729(Class15 a, int a, String a, String a, String a) {
      List a = new ArrayList();
      a[] var6 = a.Field208.Method192();
      int var7 = var6.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         a a = var6[var8];
         if (a instanceof Class93) {
            Class93 a = (Class93)a;
            if (a.Method3640() == a && a.Field807.equals(a) && a.Field808.equals(a) && a.Field809.equals(a)) {
               a.Method2530(a);
            }
         }
      }

      return a;
   }

   public static a Method730(Class15 a, int[] a) {
      a[] var2 = a.Field208.Method192();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         a a = var2[var4];
         int[] var6 = a;
         int var7 = a.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            int a = var6[var8];
            if (a == a.Method3640()) {
               return a;
            }
         }
      }

      return null;
   }

   public static a Method731(Class15 a, String a) {
      a[] var2 = a.Field208.Method192();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         a a = var2[var4];
         if (a instanceof Class106) {
            Class106 a = (Class106)a;
            if (a.Field850 instanceof String) {
               String a = (String)a.Field850;
               if (a.equals(a)) {
                  return a;
               }
            }
         }
      }

      return null;
   }

   public static a Method732(Class15 a) {
      return a.Field208.Method184().Method3642();
   }

   public static a Method733(Class15 a) {
      return a.Field208.Method186(a.Field208.Method183() - 2);
   }

   public static Class224 Method734(byte[] a) {
      Class224 a = new Class224();
      Class165 a = new Class165(a);
      a.Method1470(a, 0);
      return a;
   }

   public static byte[] Method735(Class224 a) {
      Class169 a = new Class169(3);
      a.Method2213(a);
      return a.Method1503();
   }

   private static Integer Method736(Class790 a) {
      return a.Field3550.matches("[JD]") ? a.Field3554 + 2 : a.Field3554 + 1;
   }

   private static int Method737(Class790 a) {
      return a.Field3554;
   }

   private static a Method738(a a, a a1) {
      return a;
   }

   private static boolean Method739(char[] a, int[] a, Integer a, a a) {
      return a[a] != 'x' || a.Method3640() == a[a];
   }

   private static boolean Method740(a a) {
      return true;
   }

   public static void Method741(String[] arr) {
      Field1592 = arr;
   }

   public static String[] Method742() {
      return Field1592;
   }

   private static IllegalArgumentException Method743(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      Method741(new String[4]);
   }
}
