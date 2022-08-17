package awsl;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import obfuscate.b;

public class Class225 extends Class167 {
   private int Field1261;
   private boolean Field1262;
   private boolean Field1263;
   private boolean Field1264;
   private boolean Field1265;
   private Map Field1266;
   private boolean Field1267;

   public static void main(String[] a) throws Exception {
      if (a.length != 1) {
         System.err.println("Verifies the given class.");
         System.err.println("Usage: CheckClassAdapter <fully qualified class name or class file name>");
      } else {
         Class165 var1;
         if (a[0].endsWith(".class")) {
            var1 = new Class165(new FileInputStream(a[0]));
         } else {
            var1 = new Class165(a[0]);
         }

         Method2193(var1, false, new PrintWriter(System.err));
      }
   }

   public static void Method2192(Class165 a, ClassLoader a, boolean a, PrintWriter a) {
      Class224 var4 = new Class224();
      a.Method1470(new Class225(var4, false), 2);
      b var5 = var4.Field1246 == null ? null : b.Method3205(var4.Field1246);
      List var6 = var4.Field1260;
      ArrayList var7 = new ArrayList();
      Iterator var8 = var4.Field1247.Method1383();

      while(var8.Method932()) {
         var7.Method2530(b.Method3205((String)var8.Method933()));
      }

      for(int var14 = 0; var14 < var6.Method1799(); ++var14) {
         Class15 var9 = (Class15)var6.get(var14);
         Class813 var10 = new Class813(b.Method3205(var4.Field1244), var5, var7, (var4.Field1243 & 512) != 0);
         Class780 var11 = new Class780(var10);
         var10.Method3672(a);

         try {
            var11.Method847(var4.Field1244, var9);
         } catch (Exception var13) {
            var13.printStackTrace(a);
            Method2194(var9, var11, a);
         }
      }

      a.flush();
   }

   public static void Method2193(Class165 a, boolean a, PrintWriter a) {
      Method2192(a, (ClassLoader)null, a, a);
   }

   static void Method2194(Class15 a, Class780 a, PrintWriter a) {
      Class784[] var3 = a.Method849();
      Class804 var4 = new Class804();
      Class41 var5 = new Class41(var4);
      a.println(a.Field195 + a.Field196);

      int var6;
      for(var6 = 0; var6 < a.Field208.Method183(); ++var6) {
         a.Field208.Method186(var6).Method1(var5);
         StringBuilder var7 = new StringBuilder();
         Class784 var8 = var3[var6];
         var7.append('?');

         while(var7.length() < a.Field210 + a.Field211 + 1) {
            var7.append(' ');
         }

         a.print(Integer.toString(var6 + 100000).substring(1));
         a.print(" " + var7 + " : " + var4.Field3580.get(var4.Field3580.Method1799() - 1));
      }

      for(var6 = 0; var6 < a.Field209.Method1799(); ++var6) {
         ((Class794)a.Field209.get(var6)).Method796(var5);
         a.print(" " + var4.Field3580.get(var4.Field3580.Method1799() - 1));
      }

      a.println();
   }

   private static String Method2071(String a) {
      int var1 = a.lastIndexOf(47);
      int var2 = a.length();
      if (a.charAt(var2 - 1) == ';') {
         --var2;
      }

      return var1 == -1 ? a : a.substring(var1 + 1, var2);
   }

   public Class225(Class167 a) {
      this(a, true);
   }

   public Class225(Class167 a, boolean a) {
      this(327680, a, a);
      if (this.getClass() != Class225.class) {
         throw new IllegalStateException();
      }
   }

   protected Class225(int a, Class167 a, boolean a) {
      super(a, a);
      this.Field1266 = new HashMap();
      this.Field1267 = a;
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      if (this.Field1262) {
         throw new IllegalStateException("visit must be called only once");
      } else {
         this.Field1262 = true;
         this.Method2195();
         Method2196(a, 423473);
         if (!a.endsWith("package-info")) {
            Class39.Method3393(a, "class name");
         }

         if ("java/lang/Object".equals(a)) {
            throw new IllegalArgumentException("The super class name of the Object class must be 'null'");
         } else {
            Class39.Method3393(a, "super class name");
            Method2197(a);
            if ((a & 512) != 0 && !"java/lang/Object".equals(a)) {
               throw new IllegalArgumentException("The super class name of interfaces must be 'java/lang/Object'");
            } else {
               for(int var7 = 0; var7 < a.length; ++var7) {
                  Class39.Method3393(a[var7], "interface name at index " + var7);
               }

               this.Field1261 = a;
               super.Method1447(a, a, a, a, a, a);
            }
         }
      }
   }

   public void Method1458(String a, String a) {
      this.Method2195();
      if (this.Field1263) {
         throw new IllegalStateException("visitSource can be called only once.");
      } else {
         this.Field1263 = true;
         super.Method1458(a, a);
      }
   }

   public void Method1453(String a, String a, String a) {
      this.Method2195();
      if (this.Field1264) {
         throw new IllegalStateException("visitOuterClass can be called only once.");
      } else {
         this.Field1264 = true;
         throw new IllegalArgumentException("Illegal outer class owner");
      }
   }

   public void Method1452(String a, String a, String a, int a) {
      this.Method2195();
      Class39.Method3393(a, "class name");
      Class39.Method3393(a, "outer class name");

      int var5;
      for(var5 = 0; var5 < a.length() && Character.isDigit(a.charAt(var5)); ++var5) {
      }

      if (var5 < a.length()) {
         Class39.Method3391(a, var5, -1, "inner class name");
      }

      Method2196(a, 30239);
      super.Method1452(a, a, a, a);
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      this.Method2195();
      Method2196(a, 413919);
      Class39.Method3389(this.Field1261, a, "field name");
      Class39.Method3395(a, false);
      Method2199(a);
      Class39.Method3387(a);
      Class253 var6 = super.Method1450(a, a, a, a, a);
      return new Class244(var6);
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      this.Method2195();
      Method2196(a, 400895);
      if (!"<init>".equals(a) && !"<clinit>".equals(a)) {
         Class39.Method3392(this.Field1261, a, "method name");
      }

      Class39.Method1873(a);
      Method2198(a);

      for(int var6 = 0; var6 < a.length; ++var6) {
         Class39.Method3393(a[var6], "exception name at index " + var6);
      }

      Class39 var7;
      if (this.Field1267) {
         var7 = new Class39(a, a, a, super.Method1451(a, a, a, a, a), this.Field1266);
      } else {
         var7 = new Class39(super.Method1451(a, a, a, a, a), this.Field1266);
      }

      var7.Field314 = this.Field1261;
      return var7;
   }

   public Class148 Method1448(String a, boolean a) {
      this.Method2195();
      Class39.Method3395(a, false);
      return new Class130(super.Method1448(a, a));
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      this.Method2195();
      int var5 = a >>> 24;
      if (var5 != 17 && var5 != 16) {
         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(var5));
      } else {
         Method2200(a, a);
         Class39.Method3395(a, false);
         return new Class130(super.Method1449(a, a, a, a));
      }
   }

   public void Method1459(Class136 a) {
      this.Method2195();
      throw new IllegalArgumentException("Invalid attribute (must not be null)");
   }

   public void Method1460() {
      this.Method2195();
      this.Field1265 = true;
      super.Method1460();
   }

   private void Method2195() {
      if (!this.Field1262) {
         throw new IllegalStateException("Cannot visit member before visit has been called.");
      } else if (this.Field1265) {
         throw new IllegalStateException("Cannot visit member after visitEnd has been called.");
      }
   }

   static void Method2196(int a, int a) {
      if ((a & ~a) != 0) {
         throw new IllegalArgumentException("Invalid access flags: " + a);
      } else {
         int var2 = (a & 1) == 0 ? 0 : 1;
         int var3 = (a & 2) == 0 ? 0 : 1;
         int var4 = (a & 4) == 0 ? 0 : 1;
         if (var2 + var3 + var4 > 1) {
            throw new IllegalArgumentException("public private and protected are mutually exclusive: " + a);
         } else {
            int var5 = (a & 16) == 0 ? 0 : 1;
            int var6 = (a & 1024) == 0 ? 0 : 1;
            if (var5 + var6 > 1) {
               throw new IllegalArgumentException("final and abstract are mutually exclusive: " + a);
            }
         }
      }
   }

   public static void Method2197(String a) {
      int var1 = 0;
      if (Method2210(a, 0) == '<') {
         var1 = Method1527(a, var1);
      }

      for(var1 = Method2203(a, var1); Method2210(a, var1) == 'L'; var1 = Method2203(a, var1)) {
      }

      if (var1 != a.length()) {
         throw new IllegalArgumentException(a + ": error at index " + var1);
      }
   }

   public static void Method2198(String a) {
      int var1 = 0;
      if (Method2210(a, 0) == '<') {
         var1 = Method1527(a, var1);
      }

      for(var1 = Method2209('(', a, var1); "ZCBSIFJDL[T".indexOf(Method2210(a, var1)) != -1; var1 = Method2207(a, var1)) {
      }

      var1 = Method2209(')', a, var1);
      if (Method2210(a, var1) == 'V') {
         ++var1;
      } else {
         var1 = Method2207(a, var1);
      }

      while(Method2210(a, var1) == '^') {
         ++var1;
         if (Method2210(a, var1) == 'L') {
            var1 = Method2203(a, var1);
         } else {
            var1 = Method2206(a, var1);
         }
      }

      if (var1 != a.length()) {
         throw new IllegalArgumentException(a + ": error at index " + var1);
      }
   }

   public static void Method2199(String a) {
      int var1 = Method2202(a, 0);
      if (var1 != a.length()) {
         throw new IllegalArgumentException(a + ": error at index " + var1);
      }
   }

   static void Method2200(int a, Class31 a) {
      Class801.Method3300();
      boolean var3 = false;
      int var6;
      switch (a >>> 24) {
         case 0:
         case 1:
         case 22:
            var6 = -65536;
         case 19:
         case 20:
         case 21:
         case 64:
         case 65:
         case 67:
         case 68:
         case 69:
         case 70:
            var6 = -16777216;
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
            var3 = true;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var6 = -16776961;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(a >>> 24));
      }
   }

   private static int Method1527(String a, int a) {
      a = Method2209('<', a, a);

      for(a = Method2201(a, a); Method2210(a, a) != '>'; a = Method2201(a, a)) {
      }

      return a + 1;
   }

   private static int Method2201(String a, int a) {
      a = Method2208(a, a);
      a = Method2209(':', a, a);
      if ("L[T".indexOf(Method2210(a, a)) != -1) {
         a = Method2202(a, a);
      }

      while(Method2210(a, a) == ':') {
         a = Method2202(a, a + 1);
      }

      return a;
   }

   private static int Method2202(String var0, int var1) {
      // $FF: Couldn't be decompiled
   }

   private static int Method2203(String a, int a) {
      a = Method2209('L', a, a);

      for(a = Method2208(a, a); Method2210(a, a) == '/'; a = Method2208(a, a + 1)) {
      }

      if (Method2210(a, a) == '<') {
         a = Method2204(a, a);
      }

      while(Method2210(a, a) == '.') {
         a = Method2208(a, a + 1);
         if (Method2210(a, a) == '<') {
            a = Method2204(a, a);
         }
      }

      return Method2209(';', a, a);
   }

   private static int Method2204(String a, int a) {
      a = Method2209('<', a, a);

      for(a = Method2205(a, a); Method2210(a, a) != '>'; a = Method2205(a, a)) {
      }

      return a + 1;
   }

   private static int Method2205(String a, int a) {
      char var2 = Method2210(a, a);
      if (var2 == '*') {
         return a + 1;
      } else {
         if (var2 == '+' || var2 == '-') {
            ++a;
         }

         return Method2202(a, a);
      }
   }

   private static int Method2206(String a, int a) {
      a = Method2209('T', a, a);
      a = Method2208(a, a);
      return Method2209(';', a, a);
   }

   private static int Method2207(String var0, int var1) {
      // $FF: Couldn't be decompiled
   }

   private static int Method2208(String a, int a) {
      if (!Character.isJavaIdentifierStart(Method2210(a, a))) {
         throw new IllegalArgumentException(a + ": identifier expected at index " + a);
      } else {
         ++a;

         while(Character.isJavaIdentifierPart(Method2210(a, a))) {
            ++a;
         }

         return a;
      }
   }

   private static int Method2209(char a, String a, int a) {
      if (Method2210(a, a) == a) {
         return a + 1;
      } else {
         throw new IllegalArgumentException(a + ": '" + a + "' expected at index " + a);
      }
   }

   private static char Method2210(String a, int a) {
      return a < a.length() ? a.charAt(a) : '\u0000';
   }

   private static Exception Method1535(Exception exception) {
      return exception;
   }
}
