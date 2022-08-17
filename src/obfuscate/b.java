package obfuscate;

import awsl.Class267;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class b {
   public static final int Field560 = 0;
   public static final int Field561 = 1;
   public static final int Field562 = 2;
   public static final int Field563 = 3;
   public static final int Field564 = 4;
   public static final int Field565 = 5;
   public static final int Field566 = 6;
   public static final int Field567 = 7;
   public static final int Field568 = 8;
   public static final int Field569 = 9;
   public static final int Field570 = 10;
   public static final int Field571 = 11;
   public static final b Field572;
   public static final b Field573;
   public static final b Field574;
   public static final b Field575;
   public static final b Field576;
   public static final b Field577;
   public static final b Field578;
   public static final b Field579;
   public static final b Field580;
   private final int Field581;
   private final char[] Field582;
   private final int Field583;
   private final int Field584;
   private static a[] Field585;

   private b(int a, char[] a, int a, int a) {
      this.Field581 = a;
      this.Field582 = a;
      this.Field583 = a;
      this.Field584 = a;
   }

   public static b Method3204(String a) {
      return Method3216(a.toCharArray(), 0);
   }

   public static b Method3205(String a) {
      char[] var1 = a.toCharArray();
      return new b(var1[0] == '[' ? 9 : 10, var1, 0, var1.length);
   }

   public static b Method3206(String a) {
      return Method3216(a.toCharArray(), 0);
   }

   public static b Method3207(b a, b[] a) {
      return Method3204(Method3226(a, a));
   }

   public static b Method3208(Class a) {
      if (a.isPrimitive()) {
         if (a == Integer.TYPE) {
            return Field577;
         } else if (a == Void.TYPE) {
            return Field572;
         } else if (a == Boolean.TYPE) {
            return Field573;
         } else if (a == Byte.TYPE) {
            return Field575;
         } else if (a == Character.TYPE) {
            return Field574;
         } else if (a == Short.TYPE) {
            return Field576;
         } else if (a == Double.TYPE) {
            return Field580;
         } else {
            return a == Float.TYPE ? Field578 : Field579;
         }
      } else {
         return Method3204(Method3229(a));
      }
   }

   public static b Method3209(Constructor a) {
      return Method3204(Method3230(a));
   }

   public static b Method3210(Method a) {
      return Method3204(Method3231(a));
   }

   public static b[] Method3211(String a) {
      char[] var1 = a.toCharArray();
      int var2 = 1;
      int var3 = 0;

      while(true) {
         while(true) {
            char var4 = var1[var2++];
            if (var4 == ')') {
               b[] var5 = new b[var3];
               var2 = 1;

               for(var3 = 0; var1[var2] != ')'; ++var3) {
                  var5[var3] = Method3216(var1, var2);
                  var2 += var5[var3].Field584 + (var5[var3].Field581 == 10 ? 2 : 0);
               }

               return var5;
            }

            if (var4 == 'L') {
               while(var1[var2++] != ';') {
               }

               ++var3;
            } else if (var4 != '[') {
               ++var3;
            }
         }
      }
   }

   public static b[] Method3212(Method a) {
      Class[] var1 = a.getParameterTypes();
      b[] var2 = new b[var1.length];
      int var3 = var1.length - 1;

      while(true) {
         var2[var3] = Method3208(var1[var3]);
         --var3;
      }
   }

   public static b Method3213(String a) {
      char[] var1 = a.toCharArray();
      return Method3216(var1, a.indexOf(41) + 1);
   }

   public static b Method3214(Method a) {
      return Method3208(a.getReturnType());
   }

   public static int Method3215(String a) {
      int var1 = 1;
      int var2 = 1;

      while(true) {
         while(true) {
            char var3 = a.charAt(var2++);
            if (var3 == ')') {
               var3 = a.charAt(var2);
               return var1 << 2 | (var3 == 'V' ? 0 : (var3 != 'D' && var3 != 'J' ? 1 : 2));
            }

            if (var3 == 'L') {
               while(a.charAt(var2++) != ';') {
               }

               ++var1;
            } else if (var3 != '[') {
               if (var3 != 'D' && var3 != 'J') {
                  ++var1;
               } else {
                  var1 += 2;
               }
            } else {
               while((var3 = a.charAt(var2)) == '[') {
                  ++var2;
               }

               if (var3 == 'D' || var3 == 'J') {
                  --var1;
               }
            }
         }
      }
   }

   private static b Method3216(char[] a, int a) {
      int var2;
      switch (a[a]) {
         case 'B':
            return Field575;
         case 'C':
            return Field574;
         case 'D':
            return Field580;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'W':
         case 'X':
         case 'Y':
         default:
            return new b(11, a, a, a.length - a);
         case 'F':
            return Field578;
         case 'I':
            return Field577;
         case 'J':
            return Field579;
         case 'L':
            for(var2 = 1; a[a + var2] != ';'; ++var2) {
            }

            return new b(10, a, a + 1, var2 - 1);
         case 'S':
            return Field576;
         case 'V':
            return Field572;
         case 'Z':
            return Field573;
         case '[':
            for(var2 = 1; a[a + var2] == '['; ++var2) {
            }

            if (a[a + var2] == 'L') {
               ++var2;

               while(a[a + var2] != ';') {
                  ++var2;
               }
            }

            return new b(9, a, a, var2 + 1);
      }
   }

   public int Method3217() {
      return this.Field581;
   }

   public int Method3218() {
      int var1;
      for(var1 = 1; this.Field582[this.Field583 + var1] == '['; ++var1) {
      }

      return var1;
   }

   public b Method3219() {
      return Method3216(this.Field582, this.Field583 + this.Method3218());
   }

   public String Method3220() {
      switch (this.Field581) {
         case 0:
            return "void";
         case 1:
            return "boolean";
         case 2:
            return "char";
         case 3:
            return "byte";
         case 4:
            return "short";
         case 5:
            return "int";
         case 6:
            return "float";
         case 7:
            return "long";
         case 8:
            return "double";
         case 9:
            StringBuilder var1 = new StringBuilder(this.Method3219().Method3220());
            int var2 = this.Method3218();

            while(true) {
               var1.append("[]");
               --var2;
            }
         case 10:
            return (new String(this.Field582, this.Field583, this.Field584)).replace('/', '.');
         default:
            return null;
      }
   }

   public String Method3221() {
      return new String(this.Field582, this.Field583, this.Field584);
   }

   public b[] Method3222() {
      return Method3211(this.Method3225());
   }

   public b Method3223() {
      return Method3213(this.Method3225());
   }

   public int Method3224() {
      return Method3215(this.Method3225());
   }

   public String Method3225() {
      StringBuffer var1 = new StringBuffer();
      this.Method3227(var1);
      return var1.toString();
   }

   public static String Method3226(b a, b[] a) {
      StringBuffer var2 = new StringBuffer();
      var2.append('(');

      for(int var3 = 0; var3 < a.length; ++var3) {
         a[var3].Method3227(var2);
      }

      var2.append(')');
      a.Method3227(var2);
      return var2.toString();
   }

   private void Method3227(StringBuffer a) {
      if (this.Field582 == null) {
         a.append((char)((this.Field583 & -16777216) >>> 24));
      } else if (this.Field581 == 10) {
         a.append('L');
         a.append(this.Field582, this.Field583, this.Field584);
         a.append(';');
      } else {
         a.append(this.Field582, this.Field583, this.Field584);
      }

   }

   public static String Method3228(Class a) {
      return a.getName().replace('.', '/');
   }

   public static String Method3229(Class a) {
      StringBuffer var1 = new StringBuffer();
      Method3232(var1, a);
      return var1.toString();
   }

   public static String Method3230(Constructor a) {
      Class[] var1 = a.getParameterTypes();
      StringBuffer var2 = new StringBuffer();
      var2.append('(');

      for(int var3 = 0; var3 < var1.length; ++var3) {
         Method3232(var2, var1[var3]);
      }

      return var2.append(")V").toString();
   }

   public static String Method3231(Method a) {
      Class[] var1 = a.getParameterTypes();
      StringBuffer var2 = new StringBuffer();
      var2.append('(');

      for(int var3 = 0; var3 < var1.length; ++var3) {
         Method3232(var2, var1[var3]);
      }

      var2.append(')');
      Method3232(var2, a.getReturnType());
      return var2.toString();
   }

   private static void Method3232(StringBuffer a, Class a) {
      Class267.Method2862();
      Class var3 = a;
      if (a.isPrimitive()) {
         boolean var8;
         if (a == Integer.TYPE) {
            var8 = true;
         }

         if (a == Void.TYPE) {
            var8 = true;
         }

         if (a == Boolean.TYPE) {
            var8 = true;
         }

         if (a == Byte.TYPE) {
            var8 = true;
         }

         if (a == Character.TYPE) {
            var8 = true;
         }

         if (a == Short.TYPE) {
            var8 = true;
         }

         if (a == Double.TYPE) {
            var8 = true;
         }

         if (a == Float.TYPE) {
            var8 = true;
         }

         char var9 = 'J';
         a.append(var9);
      } else {
         if (a.isArray()) {
            a.append('[');
            var3 = a.getComponentType();
         }

         a.append('L');
         String var4 = var3.getName();
         int var5 = var4.length();
         int var6 = 0;
         if (var6 < var5) {
            char var7 = var4.charAt(var6);
            a.append(var7 == '.' ? '/' : var7);
            ++var6;
         }

         a.append(';');
      }
   }

   public int Method3233() {
      return this.Field582 == null ? this.Field583 & 255 : 1;
   }

   public int Method3234(int a) {
      return a != 46 && a != 79 ? a + (this.Field582 == null ? (this.Field583 & 16711680) >> 16 : 4) : a + (this.Field582 == null ? (this.Field583 & '\uff00') >> 8 : 4);
   }

   public boolean Method3235(Object a) {
      if (this == a) {
         return true;
      } else if (!(a instanceof b)) {
         return false;
      } else {
         b var2 = (b)a;
         if (this.Field581 != var2.Field581) {
            return false;
         } else {
            if (this.Field581 >= 9) {
               if (this.Field584 != var2.Field584) {
                  return false;
               }

               int var3 = this.Field583;
               int var4 = var2.Field583;

               for(int var5 = var3 + this.Field584; var3 < var5; ++var4) {
                  if (this.Field582[var3] != var2.Field582[var4]) {
                     return false;
                  }

                  ++var3;
               }
            }

            return true;
         }
      }
   }

   public int Method3236() {
      int var1 = 13 * this.Field581;
      if (this.Field581 >= 9) {
         int var2 = this.Field583;

         for(int var3 = var2 + this.Field584; var2 < var3; ++var2) {
            var1 = 17 * (var1 + this.Field582[var2]);
         }
      }

      return var1;
   }

   public String Method3237() {
      return this.Method3225();
   }

   static {
      trash((a[])null);
      Field572 = new b(0, (char[])null, 1443168256, 1);
      Field573 = new b(1, (char[])null, 1509950721, 1);
      Field574 = new b(2, (char[])null, 1124075009, 1);
      Field575 = new b(3, (char[])null, 1107297537, 1);
      Field576 = new b(4, (char[])null, 1392510721, 1);
      Field577 = new b(5, (char[])null, 1224736769, 1);
      Field578 = new b(6, (char[])null, 1174536705, 1);
      Field579 = new b(7, (char[])null, 1241579778, 1);
      Field580 = new b(8, (char[])null, 1141048066, 1);
   }

   public static void trash(a[] arr) {
      Field585 = arr;
   }

   public static a[] trash() {
      return Field585;
   }
}
