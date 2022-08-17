package awsl;

import java.io.IOException;
import java.io.InputStream;
import obfuscate.b;

public class Class165 {
   static final boolean Field1020 = true;
   static final boolean Field1021 = true;
   static final boolean Field1022 = true;
   static final boolean Field1023 = true;
   static final boolean Field1024 = true;
   public static final int Field1025 = 1;
   public static final int Field1026 = 2;
   public static final int Field1027 = 4;
   public static final int Field1028 = 8;
   public final byte[] Field1029;
   private final int[] Field1030;
   private final String[] Field1031;
   private final int Field1032;
   public final int Field1033;

   public Class165(byte[] a) {
      this(a, 0, a.length);
   }

   public Class165(byte[] a, int a, int a2) {
      this.Field1029 = a;
      if (this.Method1491(a + 6) > 52) {
         throw new IllegalArgumentException();
      } else {
         this.Field1030 = new int[this.Method1490(a + 8)];
         int a = this.Field1030.length;
         this.Field1031 = new String[a];
         int a = 0;
         int a = a + 10;

         for(int a = 1; a < a; ++a) {
            this.Field1030[a] = a + 1;
            int a;
            switch (a[a]) {
               case 1:
                  a = 3 + this.Method1490(a + 1);
                  if (a > a) {
                     a = a;
                  }
                  break;
               case 2:
               case 7:
               case 8:
               case 13:
               case 14:
               case 16:
               case 17:
               default:
                  a = 3;
                  break;
               case 3:
               case 4:
               case 9:
               case 10:
               case 11:
               case 12:
               case 18:
                  a = 5;
                  break;
               case 5:
               case 6:
                  a = 9;
                  ++a;
                  break;
               case 15:
                  a = 4;
            }

            a += a;
         }

         this.Field1032 = a;
         this.Field1033 = a;
      }
   }

   public int Method1463() {
      return this.Method1490(this.Field1033);
   }

   public String Method1464() {
      return this.Method1496(this.Field1033 + 2, new char[this.Field1032]);
   }

   public String Method1465() {
      return this.Method1496(this.Field1033 + 4, new char[this.Field1032]);
   }

   public String[] Method1466() {
      int a = this.Field1033 + 6;
      int a = this.Method1490(a);
      String[] a = new String[a];
      char[] a = new char[this.Field1032];

      for(int a = 0; a < a; ++a) {
         a += 2;
         a[a] = this.Method1496(a, a);
      }

      return a;
   }

   void Method1467(Class169 a) {
      char[] a = new char[this.Field1032];
      int a = this.Field1030.length;
      Class261[] a = new Class261[a];

      int a;
      for(a = 1; a < a; ++a) {
         int a = this.Field1030[a];
         int a = this.Field1029[a - 1];
         Class261 a = new Class261(a);
         int a;
         int a;
         switch (a) {
            case 1:
               String a = this.Field1031[a];
               a = this.Field1030[a];
               a = this.Field1031[a] = this.Method1495(a + 2, this.Method1490(a), a);
               a.Method2831(a, a, (String)null, (String)null);
               break;
            case 2:
            case 7:
            case 8:
            case 13:
            case 14:
            case 16:
            case 17:
            default:
               a.Method2831(a, this.Method1494(a, a), (String)null, (String)null);
               break;
            case 3:
               a.Method2827(this.Method1492(a));
               break;
            case 4:
               a.Method2829(Float.intBitsToFloat(this.Method1492(a)));
               break;
            case 5:
               a.Method2828(this.Method1493(a));
               ++a;
               break;
            case 6:
               a.Method2830(Double.longBitsToDouble(this.Method1493(a)));
               ++a;
               break;
            case 9:
            case 10:
            case 11:
               a = this.Field1030[this.Method1490(a + 2)];
               a.Method2831(a, this.Method1496(a, a), this.Method1494(a, a), this.Method1494(a + 2, a));
               break;
            case 12:
               a.Method2831(a, this.Method1494(a, a), this.Method1494(a + 2, a), (String)null);
               break;
            case 15:
               a = this.Field1030[this.Method1490(a + 1)];
               a = this.Field1030[this.Method1490(a + 2)];
               a.Method2831(20 + this.Method1489(a), this.Method1496(a, a), this.Method1494(a, a), this.Method1494(a + 2, a));
               break;
            case 18:
               if (a.Field1110 == null) {
                  this.Method1468(a, a, a);
               }

               a = this.Field1030[this.Method1490(a + 2)];
               a.Method2832(this.Method1494(a, a), this.Method1494(a + 2, a), this.Method1490(a));
         }

         a = a.Field1433 % a.length;
         a.Field1434 = a[a];
         a[a] = a;
      }

      a = this.Field1030[1] - 1;
      a.Field1082.Method493(this.Field1029, a, this.Field1033 - a);
      a.Field1083 = a;
      a.Field1084 = (int)(0.75 * (double)a);
      a.Field1081 = a;
   }

   private void Method1468(Class169 a, Class261[] a1, char[] a) {
      int a = this.Method1484();
      boolean a = false;
      int a = this.Method1490(a);

      while(true) {
         String a = this.Method1494(a + 2, a);
         if ("BootstrapMethods".equals(a)) {
            a = true;
            return;
         }

         a += 6 + this.Method1492(a + 4);
         --a;
      }
   }

   public Class165(InputStream a) throws IOException {
      this(Method1469(a, false));
   }

   public Class165(String a) throws IOException {
      this(Method1469(ClassLoader.getSystemResourceAsStream(a.replace('.', '/') + ".class"), true));
   }

   private static byte[] Method1469(InputStream a, boolean a1) throws IOException {
      throw new IOException("Class not found");
   }

   public void Method1470(Class167 a, int a) {
      this.Method1471(a, new Class136[0], a);
   }

   public void Method1471(Class167 a, Class136[] a, int a) {
      int a = this.Field1033;
      char[] a = new char[this.Field1032];
      Class247 a = new Class247();
      a.Field1352 = a;
      a.Field1353 = a;
      a.Field1354 = a;
      int a = this.Method1490(a);
      this.Method1496(a + 2, a);
      this.Method1496(a + 4, a);
      String[] a = new String[this.Method1490(a + 6)];
      a += 8;

      for(int a = 0; a < a.length; ++a) {
         a[a] = this.Method1496(a, a);
         a += 2;
      }

      String a = null;
      String a = null;
      String a = null;
      String a = null;
      String a = null;
      String a = null;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      Class136 a = null;
      a = this.Method1484();
      int a = this.Method1490(a);

      while(true) {
         String a = this.Method1494(a + 2, a);
         if ("SourceFile".equals(a)) {
            this.Method1494(a + 8, a);
         } else if ("InnerClasses".equals(a)) {
            int a = a + 8;
         } else {
            int a;
            if ("EnclosingMethod".equals(a)) {
               this.Method1496(a + 8, a);
               a = this.Method1490(a + 10);
               this.Method1494(this.Field1030[a], a);
               this.Method1494(this.Field1030[a] + 2, a);
            } else if ("Signature".equals(a)) {
               this.Method1494(a + 8, a);
            } else if ("RuntimeVisibleAnnotations".equals(a)) {
               int a = a + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(a)) {
               int a = a + 8;
            } else if ("Deprecated".equals(a)) {
               a |= 131072;
            } else if ("Synthetic".equals(a)) {
               a |= 266240;
            } else if ("SourceDebugExtension".equals(a)) {
               a = this.Method1492(a + 4);
               this.Method1495(a + 8, a, new char[a]);
            } else if ("RuntimeInvisibleAnnotations".equals(a)) {
               int a = a + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(a)) {
               int a = a + 8;
            } else if (!"BootstrapMethods".equals(a)) {
               Class136 a = this.Method1485(a, a, a + 8, this.Method1492(a + 4), a, -1, (Class264[])null);
               a.Field989 = a;
               a = a;
            } else {
               int[] a = new int[this.Method1490(a + 8)];
               int a = 0;

               for(int a = a + 10; a < a.length; ++a) {
                  a[a] = a;
                  a += 2 + this.Method1490(a + 2) << 1;
               }

               a.Field1355 = a;
            }
         }

         a += 6 + this.Method1492(a + 4);
         --a;
      }
   }

   private int Method1472(Class167 a, Class247 a, int a) {
      char[] a = a.Field1354;
      int a = this.Method1490(a);
      this.Method1494(a + 2, a);
      this.Method1494(a + 4, a);
      a += 6;
      String a = null;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      Object a = null;
      Class136 a = null;
      int a = this.Method1490(a);

      while(true) {
         String a = this.Method1494(a + 2, a);
         if ("ConstantValue".equals(a)) {
            int a = this.Method1490(a + 8);
            a = null;
         } else if ("Signature".equals(a)) {
            this.Method1494(a + 8, a);
         } else if ("Deprecated".equals(a)) {
            a |= 131072;
         } else if ("Synthetic".equals(a)) {
            a |= 266240;
         } else if ("RuntimeVisibleAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeVisibleTypeAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeInvisibleAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(a)) {
            int a = a + 8;
         } else {
            Class136 a = this.Method1485(a.Field1352, a, a + 8, this.Method1492(a + 4), a, -1, (Class264[])null);
            a.Field989 = a;
            a = a;
         }

         a += 6 + this.Method1492(a + 4);
         --a;
      }
   }

   private int Method1473(Class167 a, Class247 a, int a) {
      char[] a = a.Field1354;
      a.Field1356 = this.Method1490(a);
      a.Field1357 = this.Method1494(a + 2, a);
      a.Field1358 = this.Method1494(a + 4, a);
      a += 6;
      int a = false;
      int a = false;
      String[] a = null;
      String a = null;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      int a = false;
      Class136 a = null;
      int a = this.Method1490(a);

      while(true) {
         String a = this.Method1494(a + 2, a);
         if ("Code".equals(a)) {
            if ((a.Field1353 & 1) == 0) {
               int a = a + 8;
            }
         } else if ("Exceptions".equals(a)) {
            a = new String[this.Method1490(a + 8)];
            int a = a + 10;

            for(int a = 0; a < a.length; ++a) {
               a[a] = this.Method1496(a, a);
               a += 2;
            }
         } else if ("Signature".equals(a)) {
            this.Method1494(a + 8, a);
         } else if ("Deprecated".equals(a)) {
            a.Field1356 |= 131072;
         } else if ("RuntimeVisibleAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeVisibleTypeAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("AnnotationDefault".equals(a)) {
            int a = a + 8;
         } else if ("Synthetic".equals(a)) {
            a.Field1356 |= 266240;
         } else if ("RuntimeInvisibleAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeVisibleParameterAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("RuntimeInvisibleParameterAnnotations".equals(a)) {
            int a = a + 8;
         } else if ("MethodParameters".equals(a)) {
            int a = a + 8;
         } else {
            Class136 a = this.Method1485(a.Field1352, a, a + 8, this.Method1492(a + 4), a, -1, (Class264[])null);
            a.Field989 = a;
            a = a;
         }

         a += 6 + this.Method1492(a + 4);
         --a;
      }
   }

   private void Method1474(Class267 a, Class247 a, int a) {
      byte[] a = this.Field1029;
      char[] a = a.Field1354;
      Class267.Method2862();
      int a = this.Method1490(a);
      int a = this.Method1490(a + 2);
      int a = this.Method1492(a + 4);
      a += 8;
      int a = a;
      int a = a + a;
      Class264[] a = a.Field1359 = new Class264[a + 2];
      this.Method1483(a + 1, a);
      int a;
      int a;
      if (a < a) {
         a = a - a;
         int a = a[a] & 255;
         switch (Class169.Field1059[a]) {
            case 0:
            case 4:
               ++a;
            case 9:
               this.Method1483(a + this.Method1491(a + 1), a);
               a += 3;
            case 10:
               this.Method1483(a + this.Method1492(a + 1), a);
               a += 5;
            case 17:
               a = a[a + 1] & 255;
               if (a == 132) {
                  a += 6;
               }

               a += 4;
            case 14:
               a = a + 4 - (a & 3);
               this.Method1483(a + this.Method1492(a), a);
               a = this.Method1492(a + 8) - this.Method1492(a + 4) + 1;
               this.Method1483(a + this.Method1492(a + 12), a);
               a += 4;
               --a;
               a += 12;
            case 15:
               a = a + 4 - (a & 3);
               this.Method1483(a + this.Method1492(a), a);
               a = this.Method1492(a + 4);
               this.Method1483(a + this.Method1492(a + 12), a);
               a += 8;
               --a;
               a += 8;
            case 1:
            case 3:
            case 11:
               a += 2;
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
               a += 3;
            case 7:
            case 8:
               a += 5;
            case 16:
            default:
               a += 4;
         }
      }

      int a;
      int a;
      int a;
      boolean a;
      boolean a;
      int a;
      int a;
      int a;
      Class247 a;
      Class136 a;
      int a;
      int a;
      int a;
      int a;
      int[] a;
      int[] a;
      int a;
      byte a;
      int a;
      label423: {
         a = this.Method1490(a);
         Class264 a = this.Method1483(this.Method1490(a + 2), a);
         Class264 a = this.Method1483(this.Method1490(a + 4), a);
         Class264 a = this.Method1483(this.Method1490(a + 6), a);
         String a = this.Method1494(this.Field1030[this.Method1490(a + 8)], a);
         a.Method1960(a, a, a, a);
         a += 8;
         --a;
         a += 2;
         a = null;
         a = null;
         a = 0;
         a = 0;
         a = -1;
         a = -1;
         a = 0;
         a = 0;
         a = true;
         a = (a.Field1353 & 8) != 0;
         a = 0;
         a = 0;
         a = 0;
         a = null;
         a = null;
         a = this.Method1490(a);
         String a = this.Method1494(a + 2, a);
         Class264 var10000;
         if ("LocalVariableTable".equals(a)) {
            if ((a.Field1353 & 2) != 0) {
               break label423;
            }

            a = a + 8;
            a = this.Method1490(a + 8);
            a = this.Method1490(a + 10);
            if (a[a] == null) {
               var10000 = this.Method1483(a, a);
               var10000.Field1448 |= 1;
            }

            a += this.Method1490(a + 12);
            if (a[a] == null) {
               var10000 = this.Method1483(a, a);
               var10000.Field1448 |= 1;
            }

            a = a + 10;
            --a;
         }

         if ("LocalVariableTypeTable".equals(a)) {
            a = a + 8;
         }

         if ("LineNumberTable".equals(a)) {
            if ((a.Field1353 & 2) != 0) {
               break label423;
            }

            a = this.Method1490(a + 8);
            a = this.Method1490(a + 10);
            if (a[a] == null) {
               var10000 = this.Method1483(a, a);
               var10000.Field1448 |= 1;
            }

            a[a].Field1449 = this.Method1490(a + 12);
            a = a + 4;
            --a;
         }

         if ("RuntimeVisibleTypeAnnotations".equals(a)) {
            a = this.Method1475(a, a, a + 8, true);
            a = a.length != 0 && this.Method1489(a[0]) >= 67 ? this.Method1490(a[0] + 1) : -1;
         }

         if ("RuntimeInvisibleTypeAnnotations".equals(a)) {
            a = this.Method1475(a, a, a + 8, false);
            a = a.length != 0 && this.Method1489(a[0]) >= 67 ? this.Method1490(a[0] + 1) : -1;
         }

         if ("StackMapTable".equals(a)) {
            if ((a.Field1353 & 4) != 0) {
               break label423;
            }

            a = a + 10;
            a = this.Method1492(a + 4);
            a = this.Method1490(a + 8);
         }

         if ("StackMap".equals(a)) {
            if ((a.Field1353 & 4) != 0) {
               break label423;
            }

            a = false;
            a = a + 10;
            a = this.Method1492(a + 4);
            a = this.Method1490(a + 8);
         }

         int a = 0;
         if (a < a.Field1352.length) {
            if (a.Field1352[a].Field987.equals(a)) {
               Class136 a = a.Field1352[a].Method471(this, a + 8, this.Method1492(a + 4), a, a - 8, a);
               a.Field989 = a;
               a = a;
            }

            a = a + 1;
         }
      }

      a += 6 + this.Method1492(a + 4);
      --a;
      a += 2;
      a = a;
      a.Field1362 = -1;
      a.Field1366 = 0;
      a.Field1367 = 0;
      a.Field1368 = 0;
      a.Field1370 = 0;
      a.Field1369 = new Object[a];
      a.Field1371 = new Object[a];
      this.Method1480(a);
      int a;
      if (a < a + a - 2) {
         if (a[a] == 8) {
            a = this.Method1490(a + 1);
            if (a < a && (a[a + a] & 255) == 187) {
               this.Method1483(a, a);
            }
         }

         a = a + 1;
      }

      a = a;
      String a;
      int a;
      if (a < a) {
         a = a - a;
         Class264 a = a[a];
         a.Method1947(a);
         if ((a.Field1353 & 2) == 0 && a.Field1449 > 0) {
            a.Method1981(a.Field1449, a);
         }

         while(a.Field1362 == a || a.Field1362 == -1) {
            if (a.Field1362 != -1) {
               a.Method1845(-1, a.Field1367, a.Field1369, a.Field1370, a.Field1371);
               a.Method1845(a.Field1366, a.Field1368, a.Field1369, a.Field1370, a.Field1371);
            }

            a = this.Method1481(a, a, a, a);
            --a;
            a = null;
         }

         a = a[a] & 255;
         Class264[] a;
         int a;
         switch (Class169.Field1059[a]) {
            case 0:
               a.Method1948(a);
               a = a + 1;
            case 4:
               if (a > 54) {
                  a -= 59;
                  a.Method1840(54 + (a >> 2), a & 3);
               }

               a -= 26;
               a.Method1840(21 + (a >> 2), a & 3);
               ++a;
            case 9:
               a.Method1957(a, a[a + this.Method1491(a + 1)]);
               a += 3;
            case 10:
               a.Method1957(a - 33, a[a + this.Method1492(a + 1)]);
               a += 5;
            case 17:
               a = a[a + 1] & 255;
               if (a == 132) {
                  a.Method1841(this.Method1490(a + 2), this.Method1491(a + 4));
                  a += 6;
               }

               a.Method1840(a, this.Method1490(a + 2));
               a += 4;
            case 14:
               a = a + 4 - (a & 3);
               a = a + this.Method1492(a);
               a = this.Method1492(a + 4);
               int a = this.Method1492(a + 8);
               a = new Class264[a - a + 1];
               a += 12;
               a = 0;
               if (a < a.length) {
                  a[a] = a[a + this.Method1492(a)];
                  a += 4;
                  ++a;
               }

               a.Method1959(a, a, a[a], a);
            case 15:
               a = a + 4 - (a & 3);
               a = a + this.Method1492(a);
               a = this.Method1492(a + 4);
               int[] a = new int[a];
               a = new Class264[a];
               a += 8;
               int a = 0;
               if (a < a) {
                  a[a] = this.Method1492(a);
                  a[a] = a[a + this.Method1492(a + 4)];
                  a += 8;
                  a = a + 1;
               }

               a.Method1958(a[a], a, a);
            case 3:
               a.Method1840(a, a[a + 1] & 255);
               a += 2;
            case 1:
               a.Method854(a, a[a + 1]);
               a += 2;
            case 2:
               a.Method854(a, this.Method1491(a + 1));
               a += 3;
            case 11:
               a.Method1950(this.Method1497(a[a + 1] & 255, a));
               a += 2;
            case 12:
               a.Method1950(this.Method1497(this.Method1490(a + 1), a));
               a += 3;
            case 6:
            case 7:
               a = this.Field1030[this.Method1490(a + 1)];
               boolean a = a[a - 1] == 11;
               a = this.Method1496(a, a);
               a = this.Field1030[this.Method1490(a + 2)];
               String a = this.Method1494(a, a);
               String a = this.Method1494(a + 2, a);
               if (a < 182) {
                  a.Method1949(a, a, a, a);
               }

               a.Method1954(a, a, a, a, a);
               if (a == 185) {
                  a += 5;
               }

               a += 3;
            case 8:
               a = this.Field1030[this.Method1490(a + 1)];
               a = a.Field1355[this.Method1490(a)];
               Class279 a = (Class279)this.Method1497(this.Method1490(a), a);
               a = this.Method1490(a + 2);
               Object[] a = new Object[a];
               a += 4;
               int a = 0;
               if (a < a) {
                  a[a] = this.Method1497(this.Method1490(a), a);
                  a += 2;
                  ++a;
               }

               a = this.Field1030[this.Method1490(a + 2)];
               String a = this.Method1494(a, a);
               String a = this.Method1494(a + 2, a);
               a.Method1956(a, a, a, a);
               a += 5;
            case 5:
               a.Method1952(a, this.Method1496(a + 1, a));
               a += 3;
            case 13:
               a.Method1841(a[a + 1] & 255, a[a + 2]);
               a += 3;
            case 16:
         }

         a.Method1951(this.Method1496(a + 1, a), a[a + 3] & 255);
         a += 4;
         boolean var62;
         if (a < a.length && a <= a) {
            if (a == a) {
               a = this.Method1476(a, a[a]);
               this.Method1478(a + 2, a, true, a.Method1973(a.Field1360, a.Field1361, this.Method1494(a, a), true));
            }

            a = a + 1;
            if (a < a.length && this.Method1489(a[a]) >= 67) {
               this.Method1490(a[a] + 1);
            } else {
               var62 = true;
            }
         }

         if (a < a.length && a <= a) {
            if (a == a) {
               a = this.Method1476(a, a[a]);
               this.Method1478(a + 2, a, true, a.Method1973(a.Field1360, a.Field1361, this.Method1494(a, a), false));
            }

            ++a;
            if (a < a.length && this.Method1489(a[a]) >= 67) {
               this.Method1490(a[a] + 1);
            } else {
               var62 = true;
            }
         }
      }

      if (a[a] != null) {
         a.Method1947(a[a]);
      }

      Class136 a;
      if ((a.Field1353 & 2) == 0) {
         a = null;
         a = a + 2;
         int[] a = new int[this.Method1490(a) * 3];
         a = a.length;
         --a;
         a[a] = a + 6;
         --a;
         a[a] = this.Method1490(a + 8);
         --a;
         a[a] = this.Method1490(a);
         a += 10;
         a = a + 2;
         a = this.Method1490(a);
         a = this.Method1490(a);
         a = this.Method1490(a + 2);
         a = this.Method1490(a + 8);
         a = null;

         for(a = 0; a < a.length; a += 3) {
            if (a[a] == a && a[a + 1] == a) {
               a = this.Method1494(a[a + 2], a);
               break;
            }
         }

         a.Method1843(this.Method1494(a + 4, a), this.Method1494(a + 6, a), a, a[a], a[a + a], a);
         a += 10;
         --a;
      }

      int a = 0;
      if (a < a.length) {
         if (this.Method1489(a[a]) >> 1 == 32) {
            a = this.Method1476(a, a[a]);
            this.Method1478(a + 2, a, true, a.Method1844(a.Field1360, a.Field1361, a.Field1363, a.Field1364, a.Field1365, this.Method1494(a, a), true));
         }

         a = a + 1;
      }

      a = 0;
      if (a < a.length) {
         if (this.Method1489(a[a]) >> 1 == 32) {
            a = this.Method1476(a, a[a]);
            this.Method1478(a + 2, a, true, a.Method1844(a.Field1360, a.Field1361, a.Field1363, a.Field1364, a.Field1365, this.Method1494(a, a), false));
         }

         a = a + 1;
      }

      a = a.Field989;
      a.Field989 = null;
      a.Method1980(a);
      a.Method1842(a, a);
   }

   private int[] Method1475(Class267 a, Class247 a, int a, boolean a) {
      char[] a = a.Field1354;
      int[] a = new int[this.Method1490(a)];
      a += 2;

      for(int a = 0; a < a.length; ++a) {
         a[a] = a;
         int a = this.Method1492(a);
         int a;
         switch (a >>> 24) {
            case 0:
            case 1:
            case 22:
               a += 2;
               break;
            case 19:
            case 20:
            case 21:
               ++a;
               break;
            case 64:
            case 65:
               a = this.Method1490(a + 1);

               while(true) {
                  int a = this.Method1490(a + 3);
                  int a = this.Method1490(a + 5);
                  this.Method1483(a, a.Field1359);
                  this.Method1483(a + a, a.Field1359);
                  a += 6;
                  --a;
               }
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
               a += 4;
               break;
            default:
               a += 3;
         }

         a = this.Method1489(a);
         if (a >>> 24 == 66) {
            Object a = null;
            a += 1 + 2 * a;
            a = this.Method1478(a + 2, a, true, a.Method1974(a, (Class31)a, this.Method1494(a, a), a));
         } else {
            a = this.Method1478(a + 3 + 2 * a, a, true, (Class148)null);
         }
      }

      return a;
   }

   private int Method1476(Class247 a, int a) {
      int a;
      int a;
      a = this.Method1492(a);
      label25:
      switch (a >>> 24) {
         case 0:
         case 1:
         case 22:
            a &= -65536;
            a += 2;
            break;
         case 19:
         case 20:
         case 21:
            a &= -16777216;
            ++a;
            break;
         case 64:
         case 65:
            a &= -16777216;
            a = this.Method1490(a + 1);
            a.Field1363 = new Class264[a];
            a.Field1364 = new Class264[a];
            a.Field1365 = new int[a];
            a += 3;
            int a = 0;

            while(true) {
               if (a >= a) {
                  break label25;
               }

               int a = this.Method1490(a);
               int a = this.Method1490(a + 2);
               a.Field1363[a] = this.Method1483(a, a.Field1359);
               a.Field1364[a] = this.Method1483(a + a, a.Field1359);
               a.Field1365[a] = this.Method1490(a + 4);
               a += 6;
               ++a;
            }
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            a &= -16776961;
            a += 4;
            break;
         default:
            a &= a >>> 24 < 67 ? -256 : -16777216;
            a += 3;
      }

      a = this.Method1489(a);
      a.Field1360 = a;
      a.Field1361 = null;
      return a + 1 + 2 * a;
   }

   private void Method1477(Class267 a, Class247 a, int a, boolean a) {
      int a = this.Field1029[a++] & 255;
      int a = b.Method3211(a.Field1358).length - a;

      int a;
      Class148 a;
      for(a = 0; a < a; ++a) {
         a = a.Method1971(a, "Ljava/lang/Synthetic;", false);
         a.Method401();
      }

      char[] a = a.Field1354;
      if (a < a + a) {
         int a = this.Method1490(a);
         a += 2;

         while(true) {
            a = a.Method1971(a, this.Method1494(a, a), a);
            a = this.Method1478(a + 2, a, true, a);
            --a;
         }
      }

   }

   private int Method1478(int a, char[] a, boolean a2, Class148 a) {
      int a = this.Method1490(a);
      a += 2;

      while(true) {
         a = this.Method1479(a + 2, a, this.Method1494(a, a), a);
         --a;
      }
   }

   private int Method1479(int a, char[] a, String a2, Class148 a3) {
      switch (this.Field1029[a] & 255) {
         case 64:
            return this.Method1478(a + 3, a, true, (Class148)null);
         case 91:
            return this.Method1478(a + 1, a, false, (Class148)null);
         case 101:
            return a + 5;
         default:
            return a + 3;
      }
   }

   private void Method1480(Class247 a) {
      String a = a.Field1358;
      Object[] a = a.Field1369;
      int a = 0;
      if ((a.Field1356 & 8) == 0) {
         if ("<init>".equals(a.Field1357)) {
            a[a++] = Class45.Field402;
         } else {
            a[a++] = this.Method1496(this.Field1033 + 2, a.Field1354);
         }
      }

      int a = 1;

      while(true) {
         int a = a;
         switch (a.charAt(a++)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
               a[a++] = Class45.Field397;
               break;
            case 'D':
               a[a++] = Class45.Field399;
               break;
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
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
               a.Field1367 = a;
               return;
            case 'F':
               a[a++] = Class45.Field398;
               break;
            case 'J':
               a[a++] = Class45.Field400;
               break;
            case 'L':
               while(a.charAt(a) != ';') {
                  ++a;
               }

               a[a++] = a.substring(a + 1, a++);
               break;
            case '[':
               while(a.charAt(a) == '[') {
                  ++a;
               }

               if (a.charAt(a) == 'L') {
                  ++a;

                  while(a.charAt(a) != ';') {
                     ++a;
                  }
               }

               int var10001 = a++;
               ++a;
               a[var10001] = a.substring(a, a);
         }
      }
   }

   private int Method1481(int a, boolean a1, boolean a2, Class247 a) {
      char[] a = a.Field1354;
      Class264[] a = a.Field1359;
      int a = this.Field1029[a++] & 255;
      a.Field1368 = 0;
      int a;
      if (a < 64) {
         a = a;
         a.Field1366 = 3;
         a.Field1370 = 0;
      } else if (a < 128) {
         a = a - 64;
         a = this.Method1482(a.Field1371, 0, a, a, a);
         a.Field1366 = 4;
         a.Field1370 = 1;
      } else {
         a = this.Method1490(a);
         a += 2;
         if (a == 247) {
            a = this.Method1482(a.Field1371, 0, a, a, a);
            a.Field1366 = 4;
            a.Field1370 = 1;
         } else if (a >= 248 && a < 251) {
            a.Field1366 = 2;
            a.Field1368 = 251 - a;
            a.Field1367 -= a.Field1368;
            a.Field1370 = 0;
         } else {
            if (a != 251) {
               int a;
               int a;
               if (a < 255) {
                  a = a.Field1367;
                  a = a - 251;

                  while(true) {
                     a = this.Method1482(a.Field1369, a++, a, a, a);
                     --a;
                  }
               }

               a.Field1366 = 0;
               a = this.Method1490(a);
               a += 2;
               a.Field1368 = a;
               a.Field1367 = a;
               a = 0;

               while(true) {
                  a = this.Method1482(a.Field1369, a++, a, a, a);
                  --a;
               }
            }

            a.Field1366 = 3;
            a.Field1370 = 0;
         }
      }

      a.Field1362 += a + 1;
      this.Method1483(a.Field1362, a);
      return a;
   }

   private int Method1482(Object[] a, int a, int a, char[] a, Class264[] a) {
      int a = this.Field1029[a++] & 255;
      switch (a) {
         case 0:
            a[a] = Class45.Field396;
            break;
         case 1:
            a[a] = Class45.Field397;
            break;
         case 2:
            a[a] = Class45.Field398;
            break;
         case 3:
            a[a] = Class45.Field399;
            break;
         case 4:
            a[a] = Class45.Field400;
            break;
         case 5:
            a[a] = Class45.Field401;
            break;
         case 6:
            a[a] = Class45.Field402;
            break;
         case 7:
            a[a] = this.Method1496(a, a);
            a += 2;
            break;
         default:
            a[a] = this.Method1483(this.Method1490(a), a);
            a += 2;
      }

      return a;
   }

   protected Class264 Method1483(int a, Class264[] a) {
      if (a[a] == null) {
         a[a] = new Class264();
      }

      return a[a];
   }

   private int Method1484() {
      int a = this.Field1033 + 8 + this.Method1490(this.Field1033 + 6) * 2;
      int a = this.Method1490(a);
      int a = this.Method1490(a + 8);

      while(true) {
         a += 6 + this.Method1492(a + 12);
         --a;
      }
   }

   private Class136 Method1485(Class136[] a, String a, int a, int a, char[] a, int a, Class264[] a) {
      for(int a = 0; a < a.length; ++a) {
         if (a[a].Field987.equals(a)) {
            return a[a].Method471(this, a, a, a, a, a);
         }
      }

      return (new Class136(a)).Method471(this, a, a, (char[])null, -1, (Class264[])null);
   }

   public int Method1486() {
      return this.Field1030.length;
   }

   public int Method1487(int a) {
      return this.Field1030[a];
   }

   public int Method1488() {
      return this.Field1032;
   }

   public int Method1489(int a) {
      return this.Field1029[a] & 255;
   }

   public int Method1490(int a) {
      byte[] a = this.Field1029;
      return (a[a] & 255) << 8 | a[a + 1] & 255;
   }

   public short Method1491(int a) {
      byte[] a = this.Field1029;
      return (short)((a[a] & 255) << 8 | a[a + 1] & 255);
   }

   public int Method1492(int a) {
      byte[] a = this.Field1029;
      return (a[a] & 255) << 24 | (a[a + 1] & 255) << 16 | (a[a + 2] & 255) << 8 | a[a + 3] & 255;
   }

   public long Method1493(int a) {
      long a = (long)this.Method1492(a);
      long a = (long)this.Method1492(a + 4) & 4294967295L;
      return a << 32 | a;
   }

   public String Method1494(int a, char[] a1) {
      int a = this.Method1490(a);
      return null;
   }

   private String Method1495(int a, int a, char[] a) {
      int a = a + a;
      byte[] a = this.Field1029;
      int a = 0;
      int a = 0;
      char a = 0;

      while(true) {
         while(a < a) {
            int a = a[a++];
            switch (a) {
               case 0:
                  a &= 255;
                  if (a < 128) {
                     a[a++] = (char)a;
                  } else {
                     if (a < 224 && a > 191) {
                        a = (char)(a & 31);
                        a = 1;
                        continue;
                     }

                     a = (char)(a & 15);
                     a = 2;
                  }
                  break;
               case 1:
                  a[a++] = (char)(a << 6 | a & 63);
                  a = 0;
                  break;
               case 2:
                  a = (char)(a << 6 | a & 63);
                  a = 1;
            }
         }

         return new String(a, 0, a);
      }
   }

   public String Method1496(int a, char[] a) {
      return this.Method1494(this.Field1030[this.Method1490(a)], a);
   }

   public Object Method1497(int a, char[] a) {
      int a = this.Field1030[a];
      switch (this.Field1029[a - 1]) {
         case 3:
            return new Integer(this.Method1492(a));
         case 4:
            return new Float(Float.intBitsToFloat(this.Method1492(a)));
         case 5:
            return new Long(this.Method1493(a));
         case 6:
            return new Double(Double.longBitsToDouble(this.Method1493(a)));
         case 7:
            return b.Method3205(this.Method1494(a, a));
         case 8:
            return this.Method1494(a, a);
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         default:
            int a = this.Method1489(a);
            int[] a = this.Field1030;
            int a = a[this.Method1490(a + 1)];
            String a = this.Method1496(a, a);
            a = a[this.Method1490(a + 2)];
            String a = this.Method1494(a, a);
            String a = this.Method1494(a + 2, a);
            return new Class279(a, a, a, a);
         case 16:
            return b.Method3206(this.Method1494(a, a));
      }
   }

   private static Exception Method1498(Exception exception) {
      return exception;
   }
}
