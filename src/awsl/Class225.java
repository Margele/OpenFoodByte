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
         Class165 a;
         if (a[0].endsWith(".class")) {
            a = new Class165(new FileInputStream(a[0]));
         } else {
            a = new Class165(a[0]);
         }

         Method2193(a, false, new PrintWriter(System.err));
      }
   }

   public static void Method2192(Class165 a, ClassLoader a, boolean a2, PrintWriter a) {
      Class224 a = new Class224();
      a.Method1470(new Class225(a, false), 2);
      b a = a.Field1246 == null ? null : b.Method3205(a.Field1246);
      List a = a.Field1260;
      List a = new ArrayList();
      Iterator a = a.Field1247.Method1383();

      while(a.Method932()) {
         a.Method2530(b.Method3205((String)a.Method933()));
      }

      for(int a = 0; a < a.Method1799(); ++a) {
         Class15 a = (Class15)a.get(a);
         Class813 a = new Class813(b.Method3205(a.Field1244), a, a, (a.Field1243 & 512) != 0);
         Class780 a = new Class780(a);
         a.Method3672(a);

         try {
            a.Method847(a.Field1244, a);
         } catch (Exception var13) {
            var13.printStackTrace(a);
            Method2194(a, a, a);
         }
      }

      a.flush();
   }

   public static void Method2193(Class165 a, boolean a, PrintWriter a) {
      Method2192(a, (ClassLoader)null, a, a);
   }

   static void Method2194(Class15 a, Class780 a, PrintWriter a) {
      Class784[] a = a.Method849();
      Class804 a = new Class804();
      Class41 a = new Class41(a);
      a.println(a.Field195 + a.Field196);

      int a;
      for(a = 0; a < a.Field208.Method183(); ++a) {
         a.Field208.Method186(a).Method1(a);
         StringBuilder a = new StringBuilder();
         Class784 a = a[a];
         a.append('?');

         while(a.length() < a.Field210 + a.Field211 + 1) {
            a.append(' ');
         }

         a.print(Integer.toString(a + 100000).substring(1));
         a.print(" " + a + " : " + a.Field3580.get(a.Field3580.Method1799() - 1));
      }

      for(a = 0; a < a.Field209.Method1799(); ++a) {
         ((Class794)a.Field209.get(a)).Method796(a);
         a.print(" " + a.Field3580.get(a.Field3580.Method1799() - 1));
      }

      a.println();
   }

   private static String Method2071(String a) {
      int a = a.lastIndexOf(47);
      int a = a.length();
      if (a.charAt(a - 1) == ';') {
         --a;
      }

      return a == -1 ? a : a.substring(a + 1, a);
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
               for(int a = 0; a < a.length; ++a) {
                  Class39.Method3393(a[a], "interface name at index " + a);
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

   public void Method1453(String a, String a1, String a2) {
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

      int a;
      for(a = 0; a < a.length() && Character.isDigit(a.charAt(a)); ++a) {
      }

      if (a < a.length()) {
         Class39.Method3391(a, a, -1, "inner class name");
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
      Class253 a = super.Method1450(a, a, a, a, a);
      return new Class244(a);
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      this.Method2195();
      Method2196(a, 400895);
      if (!"<init>".equals(a) && !"<clinit>".equals(a)) {
         Class39.Method3392(this.Field1261, a, "method name");
      }

      Class39.Method1873(a);
      Method2198(a);

      for(int a = 0; a < a.length; ++a) {
         Class39.Method3393(a[a], "exception name at index " + a);
      }

      Class39 a;
      if (this.Field1267) {
         a = new Class39(a, a, a, super.Method1451(a, a, a, a, a), this.Field1266);
      } else {
         a = new Class39(super.Method1451(a, a, a, a, a), this.Field1266);
      }

      a.Field314 = this.Field1261;
      return a;
   }

   public Class148 Method1448(String a, boolean a) {
      this.Method2195();
      Class39.Method3395(a, false);
      return new Class130(super.Method1448(a, a));
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      this.Method2195();
      int a = a >>> 24;
      if (a != 17 && a != 16) {
         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(a));
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
         int a = (a & 1) == 0 ? 0 : 1;
         int a = (a & 2) == 0 ? 0 : 1;
         int a = (a & 4) == 0 ? 0 : 1;
         if (a + a + a > 1) {
            throw new IllegalArgumentException("public private and protected are mutually exclusive: " + a);
         } else {
            int a = (a & 16) == 0 ? 0 : 1;
            int a = (a & 1024) == 0 ? 0 : 1;
            if (a + a > 1) {
               throw new IllegalArgumentException("final and abstract are mutually exclusive: " + a);
            }
         }
      }
   }

   public static void Method2197(String a) {
      int a = 0;
      if (Method2210(a, 0) == '<') {
         a = Method1527(a, a);
      }

      for(a = Method2203(a, a); Method2210(a, a) == 'L'; a = Method2203(a, a)) {
      }

      if (a != a.length()) {
         throw new IllegalArgumentException(a + ": error at index " + a);
      }
   }

   public static void Method2198(String a) {
      int a = 0;
      if (Method2210(a, 0) == '<') {
         a = Method1527(a, a);
      }

      for(a = Method2209('(', a, a); "ZCBSIFJDL[T".indexOf(Method2210(a, a)) != -1; a = Method2207(a, a)) {
      }

      a = Method2209(')', a, a);
      if (Method2210(a, a) == 'V') {
         ++a;
      } else {
         a = Method2207(a, a);
      }

      while(Method2210(a, a) == '^') {
         ++a;
         if (Method2210(a, a) == 'L') {
            a = Method2203(a, a);
         } else {
            a = Method2206(a, a);
         }
      }

      if (a != a.length()) {
         throw new IllegalArgumentException(a + ": error at index " + a);
      }
   }

   public static void Method2199(String a) {
      int a = Method2202(a, 0);
      if (a != a.length()) {
         throw new IllegalArgumentException(a + ": error at index " + a);
      }
   }

   static void Method2200(int a, Class31 a1) {
      Class801.Method3300();
      int a = false;
      int a;
      switch (a >>> 24) {
         case 0:
         case 1:
         case 22:
            a = -65536;
         case 19:
         case 20:
         case 21:
         case 64:
         case 65:
         case 67:
         case 68:
         case 69:
         case 70:
            a = -16777216;
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
            a = true;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            a = -16776961;
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
      char a = Method2210(a, a);
      if (a == '*') {
         return a + 1;
      } else {
         if (a == '+' || a == '-') {
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
