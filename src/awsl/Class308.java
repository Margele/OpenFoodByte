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
      String[] var5 = Method742();
      int var6 = 0;
      a var7 = a;
      boolean var8 = a.test(a);
      if (a.test(var6, a)) {
         ++var6;
      }

      int var9 = 1;
      if (var9 <= var6 - 1) {
         var7 = a.Method3641();
         ++var9;
      }

      byte var11 = 0;
      if (var11 >= a) {
         a var12 = var7;
         int var10 = 1;
         if (var10 <= var11 - 1) {
            var7 = var7.Method3641();
            ++var10;
         }

         return a.apply(var7, var12);
      } else {
         var7 = var7.Method3642();
         return null;
      }
   }

   public static a Method717(a a, int[] a, String a) {
      return Method715(a, a, a.toCharArray());
   }

   public static a Method718(a a, int[] a) {
      StringBuilder var2 = new StringBuilder();
      int[] var3 = a;
      int var4 = a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var2.append((char)(var6 == -666 ? '?' : 'x'));
      }

      return Method717(a, a, var2.toString());
   }

   public static a Method719(Class116 a, int[] a) {
      return Method718(a.Method184(), a);
   }

   public static a Method720(Class15 a, int[] a) {
      return Method719(a.Field208, a);
   }

   public static a Method721(a a, int a) {
      a var2 = a;

      for(int var3 = 0; var3 < Math.abs(a); var2 = var2.Method3642()) {
         ++var3;
      }

      return var2;
   }

   public static String Method722(Class224 a) {
      StringBuilder var2 = new StringBuilder("METHODS:\n");
      Method742();
      Iterator var3 = a.Field1260.Method1383();
      if (var3.Method932()) {
         Class15 var4 = (Class15)var3.Method933();
         var2.append("\t");
         var2.append(var4.Field195);
         var2.append(var4.Field196);
         var2.append("\n");
         a.trash(new String[3]);
      }

      var2.append("\nFIELDS:\n");
      var3 = a.Field1259.Method1383();
      if (var3.Method932()) {
         Class241 var5 = (Class241)var3.Method933();
         var2.append("\t");
         var2.append(var5.Field1343);
         var2.append(" ");
         var2.append(var5.Field1342);
         var2.append("\n");
      }

      return var2.toString();
   }

   public static int Method723(Class15 a, String a, String a, Class104 a, Class104 a) {
      Optional var5 = a.Field212.stream().max(Comparator.comparingInt(Class308::Method737));
      int var6 = (Integer)var5.map(Class308::Method736).orElse(0);
      Class790 var7 = new Class790(a, a, (String)null, a, a, var6);
      a.Field212.Method2530(var7);
      return var6;
   }

   public static Class116 Method724(String a, String[] a, Class116 a) {
      String var3 = (String)Stream.of(a).collect(Collectors.joining("", "(", ")V"));
      return Method725(a, var3, a);
   }

   public static Class116 Method725(String a, String a, Class116 a) {
      Class116 var3 = new Class116();
      var3.Method194(new Class110(187, a));
      var3.Method194(new Class83(89));
      var3.Method195(a);
      var3.Method194(new Class98(183, a, "<init>", a, false));
      return var3;
   }

   public static Class15 Method726(Class224 a, String a, String a) {
      Iterator var3 = a.Field1260.Method1383();

      Class15 var4;
      do {
         if (!var3.Method932()) {
            return null;
         }

         var4 = (Class15)var3.Method933();
      } while(!var4.Field195.equals(a) || !var4.Field196.equals(a));

      return var4;
   }

   public static a Method727(Class15 a, int a, String a, String a, String a) {
      a[] var5 = a.Field208.Method192();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         a var8 = var5[var7];
         if (var8 instanceof Class98) {
            Class98 var9 = (Class98)var8;
            if (var9.Method3640() == a && var9.Field824.equals(a) && var9.Field825.equals(a) && var9.Field826.equals(a)) {
               return var8;
            }
         }
      }

      return null;
   }

   public static a Method728(Class15 a, int a, String a, String a, String a) {
      a[] var5 = a.Field208.Method192();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         a var8 = var5[var7];
         if (var8 instanceof Class93) {
            Class93 var9 = (Class93)var8;
            if (var9.Method3640() == a && var9.Field807.equals(a) && var9.Field808.equals(a) && var9.Field809.equals(a)) {
               return var8;
            }
         }
      }

      return null;
   }

   public static List Method729(Class15 a, int a, String a, String a, String a) {
      ArrayList var5 = new ArrayList();
      a[] var6 = a.Field208.Method192();
      int var7 = var6.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         a var9 = var6[var8];
         if (var9 instanceof Class93) {
            Class93 var10 = (Class93)var9;
            if (var10.Method3640() == a && var10.Field807.equals(a) && var10.Field808.equals(a) && var10.Field809.equals(a)) {
               var5.Method2530(var10);
            }
         }
      }

      return var5;
   }

   public static a Method730(Class15 a, int[] a) {
      a[] var2 = a.Field208.Method192();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         a var5 = var2[var4];
         int[] var6 = a;
         int var7 = a.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var6[var8];
            if (var9 == var5.Method3640()) {
               return var5;
            }
         }
      }

      return null;
   }

   public static a Method731(Class15 a, String a) {
      a[] var2 = a.Field208.Method192();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         a var5 = var2[var4];
         if (var5 instanceof Class106) {
            Class106 var6 = (Class106)var5;
            if (var6.Field850 instanceof String) {
               String var7 = (String)var6.Field850;
               if (var7.equals(a)) {
                  return var5;
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
      Class224 var1 = new Class224();
      Class165 var2 = new Class165(a);
      var2.Method1470(var1, 0);
      return var1;
   }

   public static byte[] Method735(Class224 a) {
      Class169 var1 = new Class169(3);
      a.Method2213(var1);
      return var1.Method1503();
   }

   private static Integer Method736(Class790 a) {
      return a.Field3550.matches("[JD]") ? a.Field3554 + 2 : a.Field3554 + 1;
   }

   private static int Method737(Class790 a) {
      return a.Field3554;
   }

   private static a Method738(a a, a a) {
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
