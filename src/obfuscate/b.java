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
      char[] a = a.toCharArray();
      return new b(a[0] == '[' ? 9 : 10, a, 0, a.length);
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
      char[] a = a.toCharArray();
      int a = 1;
      int a = 0;

      while(true) {
         while(true) {
            char a = a[a++];
            if (a == ')') {
               b[] a = new b[a];
               a = 1;

               for(a = 0; a[a] != ')'; ++a) {
                  a[a] = Method3216(a, a);
                  a += a[a].Field584 + (a[a].Field581 == 10 ? 2 : 0);
               }

               return a;
            }

            if (a == 'L') {
               while(a[a++] != ';') {
               }

               ++a;
            } else if (a != '[') {
               ++a;
            }
         }
      }
   }

   public static b[] Method3212(Method a) {
      Class[] a = a.getParameterTypes();
      b[] a = new b[a.length];
      int a = a.length - 1;

      while(true) {
         a[a] = Method3208(a[a]);
         --a;
      }
   }

   public static b Method3213(String a) {
      char[] a = a.toCharArray();
      return Method3216(a, a.indexOf(41) + 1);
   }

   public static b Method3214(Method a) {
      return Method3208(a.getReturnType());
   }

   public static int Method3215(String a) {
      int a = 1;
      int a = 1;

      while(true) {
         while(true) {
            char a = a.charAt(a++);
            if (a == ')') {
               a = a.charAt(a);
               return a << 2 | (a == 'V' ? 0 : (a != 'D' && a != 'J' ? 1 : 2));
            }

            if (a == 'L') {
               while(a.charAt(a++) != ';') {
               }

               ++a;
            } else if (a != '[') {
               if (a != 'D' && a != 'J') {
                  ++a;
               } else {
                  a += 2;
               }
            } else {
               while((a = a.charAt(a)) == '[') {
                  ++a;
               }

               if (a == 'D' || a == 'J') {
                  --a;
               }
            }
         }
      }
   }

   private static b Method3216(char[] a, int a) {
      int a;
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
            for(a = 1; a[a + a] != ';'; ++a) {
            }

            return new b(10, a, a + 1, a - 1);
         case 'S':
            return Field576;
         case 'V':
            return Field572;
         case 'Z':
            return Field573;
         case '[':
            for(a = 1; a[a + a] == '['; ++a) {
            }

            if (a[a + a] == 'L') {
               ++a;

               while(a[a + a] != ';') {
                  ++a;
               }
            }

            return new b(9, a, a, a + 1);
      }
   }

   public int Method3217() {
      return this.Field581;
   }

   public int Method3218() {
      int a;
      for(a = 1; this.Field582[this.Field583 + a] == '['; ++a) {
      }

      return a;
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
            StringBuilder a = new StringBuilder(this.Method3219().Method3220());
            int a = this.Method3218();

            while(true) {
               a.append("[]");
               --a;
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
      StringBuffer a = new StringBuffer();
      this.Method3227(a);
      return a.toString();
   }

   public static String Method3226(b a, b[] a) {
      StringBuffer a = new StringBuffer();
      a.append('(');

      for(int a = 0; a < a.length; ++a) {
         a[a].Method3227(a);
      }

      a.append(')');
      a.Method3227(a);
      return a.toString();
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
      StringBuffer a = new StringBuffer();
      Method3232(a, a);
      return a.toString();
   }

   public static String Method3230(Constructor a) {
      Class[] a = a.getParameterTypes();
      StringBuffer a = new StringBuffer();
      a.append('(');

      for(int a = 0; a < a.length; ++a) {
         Method3232(a, a[a]);
      }

      return a.append(")V").toString();
   }

   public static String Method3231(Method a) {
      Class[] a = a.getParameterTypes();
      StringBuffer a = new StringBuffer();
      a.append('(');

      for(int a = 0; a < a.length; ++a) {
         Method3232(a, a[a]);
      }

      a.append(')');
      Method3232(a, a.getReturnType());
      return a.toString();
   }

   private static void Method3232(StringBuffer a, Class a) {
      Class267.Method2862();
      Class a = a;
      if (a.isPrimitive()) {
         boolean a;
         if (a == Integer.TYPE) {
            a = true;
         }

         if (a == Void.TYPE) {
            a = true;
         }

         if (a == Boolean.TYPE) {
            a = true;
         }

         if (a == Byte.TYPE) {
            a = true;
         }

         if (a == Character.TYPE) {
            a = true;
         }

         if (a == Short.TYPE) {
            a = true;
         }

         if (a == Double.TYPE) {
            a = true;
         }

         if (a == Float.TYPE) {
            a = true;
         }

         char a = 'J';
         a.append(a);
      } else {
         if (a.isArray()) {
            a.append('[');
            a = a.getComponentType();
         }

         a.append('L');
         String a = a.getName();
         int a = a.length();
         int a = 0;
         if (a < a) {
            char a = a.charAt(a);
            a.append(a == '.' ? '/' : a);
            ++a;
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
         b a = (b)a;
         if (this.Field581 != a.Field581) {
            return false;
         } else {
            if (this.Field581 >= 9) {
               if (this.Field584 != a.Field584) {
                  return false;
               }

               int a = this.Field583;
               int a = a.Field583;

               for(int a = a + this.Field584; a < a; ++a) {
                  if (this.Field582[a] != a.Field582[a]) {
                     return false;
                  }

                  ++a;
               }
            }

            return true;
         }
      }
   }

   public int Method3236() {
      int a = 13 * this.Field581;
      if (this.Field581 >= 9) {
         int a = this.Field583;

         for(int a = a + this.Field584; a < a; ++a) {
            a = 17 * (a + this.Field582[a]);
         }
      }

      return a;
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
