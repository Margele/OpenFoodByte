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

   public Class165(byte[] a, int a, int a) {
      this.Field1029 = a;
      if (this.Method1491(a + 6) > 52) {
         throw new IllegalArgumentException();
      } else {
         this.Field1030 = new int[this.Method1490(a + 8)];
         int var4 = this.Field1030.length;
         this.Field1031 = new String[var4];
         int var5 = 0;
         int var6 = a + 10;

         for(int var7 = 1; var7 < var4; ++var7) {
            this.Field1030[var7] = var6 + 1;
            int var8;
            switch (a[var6]) {
               case 1:
                  var8 = 3 + this.Method1490(var6 + 1);
                  if (var8 > var5) {
                     var5 = var8;
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
                  var8 = 3;
                  break;
               case 3:
               case 4:
               case 9:
               case 10:
               case 11:
               case 12:
               case 18:
                  var8 = 5;
                  break;
               case 5:
               case 6:
                  var8 = 9;
                  ++var7;
                  break;
               case 15:
                  var8 = 4;
            }

            var6 += var8;
         }

         this.Field1032 = var5;
         this.Field1033 = var6;
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
      int var1 = this.Field1033 + 6;
      int var2 = this.Method1490(var1);
      String[] var3 = new String[var2];
      char[] var4 = new char[this.Field1032];

      for(int var5 = 0; var5 < var2; ++var5) {
         var1 += 2;
         var3[var5] = this.Method1496(var1, var4);
      }

      return var3;
   }

   void Method1467(Class169 a) {
      char[] var2 = new char[this.Field1032];
      int var3 = this.Field1030.length;
      Class261[] var4 = new Class261[var3];

      int var5;
      for(var5 = 1; var5 < var3; ++var5) {
         int var6 = this.Field1030[var5];
         byte var7 = this.Field1029[var6 - 1];
         Class261 var8 = new Class261(var5);
         int var9;
         int var10;
         switch (var7) {
            case 1:
               String var11 = this.Field1031[var5];
               var6 = this.Field1030[var5];
               var11 = this.Field1031[var5] = this.Method1495(var6 + 2, this.Method1490(var6), var2);
               var8.Method2831(var7, var11, (String)null, (String)null);
               break;
            case 2:
            case 7:
            case 8:
            case 13:
            case 14:
            case 16:
            case 17:
            default:
               var8.Method2831(var7, this.Method1494(var6, var2), (String)null, (String)null);
               break;
            case 3:
               var8.Method2827(this.Method1492(var6));
               break;
            case 4:
               var8.Method2829(Float.intBitsToFloat(this.Method1492(var6)));
               break;
            case 5:
               var8.Method2828(this.Method1493(var6));
               ++var5;
               break;
            case 6:
               var8.Method2830(Double.longBitsToDouble(this.Method1493(var6)));
               ++var5;
               break;
            case 9:
            case 10:
            case 11:
               var9 = this.Field1030[this.Method1490(var6 + 2)];
               var8.Method2831(var7, this.Method1496(var6, var2), this.Method1494(var9, var2), this.Method1494(var9 + 2, var2));
               break;
            case 12:
               var8.Method2831(var7, this.Method1494(var6, var2), this.Method1494(var6 + 2, var2), (String)null);
               break;
            case 15:
               var10 = this.Field1030[this.Method1490(var6 + 1)];
               var9 = this.Field1030[this.Method1490(var10 + 2)];
               var8.Method2831(20 + this.Method1489(var6), this.Method1496(var10, var2), this.Method1494(var9, var2), this.Method1494(var9 + 2, var2));
               break;
            case 18:
               if (a.Field1110 == null) {
                  this.Method1468(a, var4, var2);
               }

               var9 = this.Field1030[this.Method1490(var6 + 2)];
               var8.Method2832(this.Method1494(var9, var2), this.Method1494(var9 + 2, var2), this.Method1490(var6));
         }

         var10 = var8.Field1433 % var4.length;
         var8.Field1434 = var4[var10];
         var4[var10] = var8;
      }

      var5 = this.Field1030[1] - 1;
      a.Field1082.Method493(this.Field1029, var5, this.Field1033 - var5);
      a.Field1083 = var4;
      a.Field1084 = (int)(0.75 * (double)var3);
      a.Field1081 = var3;
   }

   private void Method1468(Class169 a, Class261[] a, char[] a) {
      int var4 = this.Method1484();
      boolean var5 = false;
      int var6 = this.Method1490(var4);

      while(true) {
         String var7 = this.Method1494(var4 + 2, a);
         if ("BootstrapMethods".equals(var7)) {
            var5 = true;
            return;
         }

         var4 += 6 + this.Method1492(var4 + 4);
         --var6;
      }
   }

   public Class165(InputStream a) throws IOException {
      this(Method1469(a, false));
   }

   public Class165(String a) throws IOException {
      this(Method1469(ClassLoader.getSystemResourceAsStream(a.replace('.', '/') + ".class"), true));
   }

   private static byte[] Method1469(InputStream a, boolean a) throws IOException {
      throw new IOException("Class not found");
   }

   public void Method1470(Class167 a, int a) {
      this.Method1471(a, new Class136[0], a);
   }

   public void Method1471(Class167 a, Class136[] a, int a) {
      int var4 = this.Field1033;
      char[] var5 = new char[this.Field1032];
      Class247 var6 = new Class247();
      var6.Field1352 = a;
      var6.Field1353 = a;
      var6.Field1354 = var5;
      int var7 = this.Method1490(var4);
      this.Method1496(var4 + 2, var5);
      this.Method1496(var4 + 4, var5);
      String[] var10 = new String[this.Method1490(var4 + 6)];
      var4 += 8;

      for(int var11 = 0; var11 < var10.length; ++var11) {
         var10[var11] = this.Method1496(var4, var5);
         var4 += 2;
      }

      Object var28 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      Object var15 = null;
      Object var16 = null;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      Class136 var22 = null;
      var4 = this.Method1484();
      int var23 = this.Method1490(var4);

      while(true) {
         String var24 = this.Method1494(var4 + 2, var5);
         if ("SourceFile".equals(var24)) {
            this.Method1494(var4 + 8, var5);
         } else if ("InnerClasses".equals(var24)) {
            int var33 = var4 + 8;
         } else {
            int var35;
            if ("EnclosingMethod".equals(var24)) {
               this.Method1496(var4 + 8, var5);
               var35 = this.Method1490(var4 + 10);
               this.Method1494(this.Field1030[var35], var5);
               this.Method1494(this.Field1030[var35] + 2, var5);
            } else if ("Signature".equals(var24)) {
               this.Method1494(var4 + 8, var5);
            } else if ("RuntimeVisibleAnnotations".equals(var24)) {
               int var29 = var4 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(var24)) {
               int var31 = var4 + 8;
            } else if ("Deprecated".equals(var24)) {
               var7 |= 131072;
            } else if ("Synthetic".equals(var24)) {
               var7 |= 266240;
            } else if ("SourceDebugExtension".equals(var24)) {
               var35 = this.Method1492(var4 + 4);
               this.Method1495(var4 + 8, var35, new char[var35]);
            } else if ("RuntimeInvisibleAnnotations".equals(var24)) {
               int var30 = var4 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(var24)) {
               int var32 = var4 + 8;
            } else if (!"BootstrapMethods".equals(var24)) {
               Class136 var34 = this.Method1485(a, var24, var4 + 8, this.Method1492(var4 + 4), var5, -1, (Class264[])null);
               var34.Field989 = var22;
               var22 = var34;
            } else {
               int[] var25 = new int[this.Method1490(var4 + 8)];
               int var26 = 0;

               for(int var27 = var4 + 10; var26 < var25.length; ++var26) {
                  var25[var26] = var27;
                  var27 += 2 + this.Method1490(var27 + 2) << 1;
               }

               var6.Field1355 = var25;
            }
         }

         var4 += 6 + this.Method1492(var4 + 4);
         --var23;
      }
   }

   private int Method1472(Class167 a, Class247 a, int a) {
      char[] var4 = a.Field1354;
      int var5 = this.Method1490(a);
      this.Method1494(a + 2, var4);
      this.Method1494(a + 4, var4);
      a += 6;
      Object var8 = null;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      Object var13 = null;
      Class136 var14 = null;
      int var15 = this.Method1490(a);

      while(true) {
         String var16 = this.Method1494(a + 2, var4);
         if ("ConstantValue".equals(var16)) {
            int var17 = this.Method1490(a + 8);
            var13 = null;
         } else if ("Signature".equals(var16)) {
            this.Method1494(a + 8, var4);
         } else if ("Deprecated".equals(var16)) {
            var5 |= 131072;
         } else if ("Synthetic".equals(var16)) {
            var5 |= 266240;
         } else if ("RuntimeVisibleAnnotations".equals(var16)) {
            int var18 = a + 8;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var16)) {
            int var20 = a + 8;
         } else if ("RuntimeInvisibleAnnotations".equals(var16)) {
            int var19 = a + 8;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var16)) {
            int var21 = a + 8;
         } else {
            Class136 var22 = this.Method1485(a.Field1352, var16, a + 8, this.Method1492(a + 4), var4, -1, (Class264[])null);
            var22.Field989 = var14;
            var14 = var22;
         }

         a += 6 + this.Method1492(a + 4);
         --var15;
      }
   }

   private int Method1473(Class167 a, Class247 a, int a) {
      char[] var4 = a.Field1354;
      a.Field1356 = this.Method1490(a);
      a.Field1357 = this.Method1494(a + 2, var4);
      a.Field1358 = this.Method1494(a + 4, var4);
      a += 6;
      boolean var5 = false;
      boolean var6 = false;
      String[] var7 = null;
      Object var8 = null;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      Class136 var18 = null;
      int var19 = this.Method1490(a);

      while(true) {
         String var20 = this.Method1494(a + 2, var4);
         if ("Code".equals(var20)) {
            if ((a.Field1353 & 1) == 0) {
               int var23 = a + 8;
            }
         } else if ("Exceptions".equals(var20)) {
            var7 = new String[this.Method1490(a + 8)];
            int var24 = a + 10;

            for(int var33 = 0; var33 < var7.length; ++var33) {
               var7[var33] = this.Method1496(var24, var4);
               var24 += 2;
            }
         } else if ("Signature".equals(var20)) {
            this.Method1494(a + 8, var4);
         } else if ("Deprecated".equals(var20)) {
            a.Field1356 |= 131072;
         } else if ("RuntimeVisibleAnnotations".equals(var20)) {
            int var26 = a + 8;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var20)) {
            int var28 = a + 8;
         } else if ("AnnotationDefault".equals(var20)) {
            int var30 = a + 8;
         } else if ("Synthetic".equals(var20)) {
            a.Field1356 |= 266240;
         } else if ("RuntimeInvisibleAnnotations".equals(var20)) {
            int var27 = a + 8;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var20)) {
            int var29 = a + 8;
         } else if ("RuntimeVisibleParameterAnnotations".equals(var20)) {
            int var31 = a + 8;
         } else if ("RuntimeInvisibleParameterAnnotations".equals(var20)) {
            int var32 = a + 8;
         } else if ("MethodParameters".equals(var20)) {
            int var25 = a + 8;
         } else {
            Class136 var21 = this.Method1485(a.Field1352, var20, a + 8, this.Method1492(a + 4), var4, -1, (Class264[])null);
            var21.Field989 = var18;
            var18 = var21;
         }

         a += 6 + this.Method1492(a + 4);
         --var19;
      }
   }

   private void Method1474(Class267 a, Class247 a, int a) {
      byte[] var5 = this.Field1029;
      char[] var6 = a.Field1354;
      Class267.Method2862();
      int var7 = this.Method1490(a);
      int var8 = this.Method1490(a + 2);
      int var9 = this.Method1492(a + 4);
      a += 8;
      int var10 = a;
      int var11 = a + var9;
      Class264[] var12 = a.Field1359 = new Class264[var9 + 2];
      this.Method1483(var9 + 1, var12);
      int var13;
      int var15;
      if (a < var11) {
         var13 = a - a;
         int var14 = var5[a] & 255;
         switch (Class169.Field1059[var14]) {
            case 0:
            case 4:
               ++a;
            case 9:
               this.Method1483(var13 + this.Method1491(a + 1), var12);
               a += 3;
            case 10:
               this.Method1483(var13 + this.Method1492(a + 1), var12);
               a += 5;
            case 17:
               var14 = var5[a + 1] & 255;
               if (var14 == 132) {
                  a += 6;
               }

               a += 4;
            case 14:
               a = a + 4 - (var13 & 3);
               this.Method1483(var13 + this.Method1492(a), var12);
               var15 = this.Method1492(a + 8) - this.Method1492(a + 4) + 1;
               this.Method1483(var13 + this.Method1492(a + 12), var12);
               a += 4;
               --var15;
               a += 12;
            case 15:
               a = a + 4 - (var13 & 3);
               this.Method1483(var13 + this.Method1492(a), var12);
               var15 = this.Method1492(a + 4);
               this.Method1483(var13 + this.Method1492(a + 12), var12);
               a += 8;
               --var15;
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

      int var18;
      int var19;
      int var20;
      boolean var21;
      boolean var22;
      int var23;
      int var24;
      int var25;
      Class247 var26;
      Class136 var27;
      int var28;
      int var30;
      int var31;
      int var32;
      int[] var38;
      int[] var40;
      int var42;
      byte var43;
      int var44;
      label423: {
         var13 = this.Method1490(a);
         Class264 var39 = this.Method1483(this.Method1490(a + 2), var12);
         Class264 var41 = this.Method1483(this.Method1490(a + 4), var12);
         Class264 var16 = this.Method1483(this.Method1490(a + 6), var12);
         String var17 = this.Method1494(this.Field1030[this.Method1490(a + 8)], var6);
         a.Method1960(var39, var41, var16, var17);
         a += 8;
         --var13;
         a += 2;
         var38 = null;
         var40 = null;
         var43 = 0;
         var42 = 0;
         var44 = -1;
         var18 = -1;
         var19 = 0;
         var20 = 0;
         var21 = true;
         var22 = (a.Field1353 & 8) != 0;
         var23 = 0;
         var24 = 0;
         var25 = 0;
         var26 = null;
         var27 = null;
         var28 = this.Method1490(a);
         String var29 = this.Method1494(a + 2, var6);
         Class264 var10000;
         if ("LocalVariableTable".equals(var29)) {
            if ((a.Field1353 & 2) != 0) {
               break label423;
            }

            var19 = a + 8;
            var30 = this.Method1490(a + 8);
            var32 = this.Method1490(a + 10);
            if (var12[var32] == null) {
               var10000 = this.Method1483(var32, var12);
               var10000.Field1448 |= 1;
            }

            var32 += this.Method1490(a + 12);
            if (var12[var32] == null) {
               var10000 = this.Method1483(var32, var12);
               var10000.Field1448 |= 1;
            }

            var31 = a + 10;
            --var30;
         }

         if ("LocalVariableTypeTable".equals(var29)) {
            var20 = a + 8;
         }

         if ("LineNumberTable".equals(var29)) {
            if ((a.Field1353 & 2) != 0) {
               break label423;
            }

            var30 = this.Method1490(a + 8);
            var32 = this.Method1490(a + 10);
            if (var12[var32] == null) {
               var10000 = this.Method1483(var32, var12);
               var10000.Field1448 |= 1;
            }

            var12[var32].Field1449 = this.Method1490(a + 12);
            var31 = a + 4;
            --var30;
         }

         if ("RuntimeVisibleTypeAnnotations".equals(var29)) {
            var38 = this.Method1475(a, a, a + 8, true);
            var44 = var38.length != 0 && this.Method1489(var38[0]) >= 67 ? this.Method1490(var38[0] + 1) : -1;
         }

         if ("RuntimeInvisibleTypeAnnotations".equals(var29)) {
            var40 = this.Method1475(a, a, a + 8, false);
            var18 = var40.length != 0 && this.Method1489(var40[0]) >= 67 ? this.Method1490(var40[0] + 1) : -1;
         }

         if ("StackMapTable".equals(var29)) {
            if ((a.Field1353 & 4) != 0) {
               break label423;
            }

            var23 = a + 10;
            var24 = this.Method1492(a + 4);
            var25 = this.Method1490(a + 8);
         }

         if ("StackMap".equals(var29)) {
            if ((a.Field1353 & 4) != 0) {
               break label423;
            }

            var21 = false;
            var23 = a + 10;
            var24 = this.Method1492(a + 4);
            var25 = this.Method1490(a + 8);
         }

         byte var50 = 0;
         if (var50 < a.Field1352.length) {
            if (a.Field1352[var50].Field987.equals(var29)) {
               Class136 var51 = a.Field1352[var50].Method471(this, a + 8, this.Method1492(a + 4), var6, var10 - 8, var12);
               var51.Field989 = var27;
               var27 = var51;
            }

            var30 = var50 + 1;
         }
      }

      a += 6 + this.Method1492(a + 4);
      --var28;
      a += 2;
      var26 = a;
      a.Field1362 = -1;
      a.Field1366 = 0;
      a.Field1367 = 0;
      a.Field1368 = 0;
      a.Field1370 = 0;
      a.Field1369 = new Object[var8];
      a.Field1371 = new Object[var7];
      this.Method1480(a);
      int var45;
      if (var23 < var23 + var24 - 2) {
         if (var5[var23] == 8) {
            var45 = this.Method1490(var23 + 1);
            if (var45 < var9 && (var5[var10 + var45] & 255) == 187) {
               this.Method1483(var45, var12);
            }
         }

         var28 = var23 + 1;
      }

      a = var10;
      String var54;
      int var57;
      if (var10 < var11) {
         var28 = var10 - var10;
         Class264 var47 = var12[var28];
         a.Method1947(var47);
         if ((a.Field1353 & 2) == 0 && var47.Field1449 > 0) {
            a.Method1981(var47.Field1449, var47);
         }

         while(var26.Field1362 == var28 || var26.Field1362 == -1) {
            if (var26.Field1362 != -1) {
               a.Method1845(-1, var26.Field1367, var26.Field1369, var26.Field1370, var26.Field1371);
               a.Method1845(var26.Field1366, var26.Field1368, var26.Field1369, var26.Field1370, var26.Field1371);
            }

            var23 = this.Method1481(var23, var21, var22, var26);
            --var25;
            var26 = null;
         }

         var30 = var5[var10] & 255;
         Class264[] var34;
         int var35;
         switch (Class169.Field1059[var30]) {
            case 0:
               a.Method1948(var30);
               a = var10 + 1;
            case 4:
               if (var30 > 54) {
                  var30 -= 59;
                  a.Method1840(54 + (var30 >> 2), var30 & 3);
               }

               var30 -= 26;
               a.Method1840(21 + (var30 >> 2), var30 & 3);
               ++a;
            case 9:
               a.Method1957(var30, var12[var28 + this.Method1491(a + 1)]);
               a += 3;
            case 10:
               a.Method1957(var30 - 33, var12[var28 + this.Method1492(a + 1)]);
               a += 5;
            case 17:
               var30 = var5[a + 1] & 255;
               if (var30 == 132) {
                  a.Method1841(this.Method1490(a + 2), this.Method1491(a + 4));
                  a += 6;
               }

               a.Method1840(var30, this.Method1490(a + 2));
               a += 4;
            case 14:
               a = a + 4 - (var28 & 3);
               var31 = var28 + this.Method1492(a);
               var32 = this.Method1492(a + 4);
               int var33 = this.Method1492(a + 8);
               var34 = new Class264[var33 - var32 + 1];
               a += 12;
               var35 = 0;
               if (var35 < var34.length) {
                  var34[var35] = var12[var28 + this.Method1492(a)];
                  a += 4;
                  ++var35;
               }

               a.Method1959(var32, var33, var12[var31], var34);
            case 15:
               a = a + 4 - (var28 & 3);
               var31 = var28 + this.Method1492(a);
               var32 = this.Method1492(a + 4);
               int[] var52 = new int[var32];
               var34 = new Class264[var32];
               a += 8;
               byte var58 = 0;
               if (var58 < var32) {
                  var52[var58] = this.Method1492(a);
                  var34[var58] = var12[var28 + this.Method1492(a + 4)];
                  a += 8;
                  var35 = var58 + 1;
               }

               a.Method1958(var12[var31], var52, var34);
            case 3:
               a.Method1840(var30, var5[a + 1] & 255);
               a += 2;
            case 1:
               a.Method854(var30, var5[a + 1]);
               a += 2;
            case 2:
               a.Method854(var30, this.Method1491(a + 1));
               a += 3;
            case 11:
               a.Method1950(this.Method1497(var5[a + 1] & 255, var6));
               a += 2;
            case 12:
               a.Method1950(this.Method1497(this.Method1490(a + 1), var6));
               a += 3;
            case 6:
            case 7:
               var31 = this.Field1030[this.Method1490(a + 1)];
               boolean var53 = var5[var31 - 1] == 11;
               var54 = this.Method1496(var31, var6);
               var31 = this.Field1030[this.Method1490(var31 + 2)];
               String var56 = this.Method1494(var31, var6);
               String var59 = this.Method1494(var31 + 2, var6);
               if (var30 < 182) {
                  a.Method1949(var30, var54, var56, var59);
               }

               a.Method1954(var30, var54, var56, var59, var53);
               if (var30 == 185) {
                  a += 5;
               }

               a += 3;
            case 8:
               var31 = this.Field1030[this.Method1490(a + 1)];
               var32 = a.Field1355[this.Method1490(var31)];
               Class279 var55 = (Class279)this.Method1497(this.Method1490(var32), var6);
               var57 = this.Method1490(var32 + 2);
               Object[] var60 = new Object[var57];
               var32 += 4;
               int var36 = 0;
               if (var36 < var57) {
                  var60[var36] = this.Method1497(this.Method1490(var32), var6);
                  var32 += 2;
                  ++var36;
               }

               var31 = this.Field1030[this.Method1490(var31 + 2)];
               String var61 = this.Method1494(var31, var6);
               String var37 = this.Method1494(var31 + 2, var6);
               a.Method1956(var61, var37, var55, var60);
               a += 5;
            case 5:
               a.Method1952(var30, this.Method1496(a + 1, var6));
               a += 3;
            case 13:
               a.Method1841(var5[a + 1] & 255, var5[a + 2]);
               a += 3;
            case 16:
         }

         a.Method1951(this.Method1496(a + 1, var6), var5[a + 3] & 255);
         a += 4;
         boolean var62;
         if (var43 < var38.length && var44 <= var28) {
            if (var44 == var28) {
               var31 = this.Method1476(a, var38[var43]);
               this.Method1478(var31 + 2, var6, true, a.Method1973(a.Field1360, a.Field1361, this.Method1494(var31, var6), true));
            }

            var15 = var43 + 1;
            if (var15 < var38.length && this.Method1489(var38[var15]) >= 67) {
               this.Method1490(var38[var15] + 1);
            } else {
               var62 = true;
            }
         }

         if (var42 < var40.length && var18 <= var28) {
            if (var18 == var28) {
               var31 = this.Method1476(a, var40[var42]);
               this.Method1478(var31 + 2, var6, true, a.Method1973(a.Field1360, a.Field1361, this.Method1494(var31, var6), false));
            }

            ++var42;
            if (var42 < var40.length && this.Method1489(var40[var42]) >= 67) {
               this.Method1490(var40[var42] + 1);
            } else {
               var62 = true;
            }
         }
      }

      if (var12[var9] != null) {
         a.Method1947(var12[var9]);
      }

      Class136 var46;
      if ((a.Field1353 & 2) == 0) {
         var46 = null;
         a = var20 + 2;
         int[] var48 = new int[this.Method1490(var20) * 3];
         var45 = var48.length;
         --var45;
         var48[var45] = a + 6;
         --var45;
         var48[var45] = this.Method1490(a + 8);
         --var45;
         var48[var45] = this.Method1490(a);
         a += 10;
         a = var19 + 2;
         var45 = this.Method1490(var19);
         var30 = this.Method1490(a);
         var31 = this.Method1490(a + 2);
         var32 = this.Method1490(a + 8);
         var54 = null;

         for(var57 = 0; var57 < var48.length; var57 += 3) {
            if (var48[var57] == var30 && var48[var57 + 1] == var32) {
               var54 = this.Method1494(var48[var57 + 2], var6);
               break;
            }
         }

         a.Method1843(this.Method1494(a + 4, var6), this.Method1494(a + 6, var6), var54, var12[var30], var12[var30 + var31], var32);
         a += 10;
         --var45;
      }

      byte var49 = 0;
      if (var49 < var38.length) {
         if (this.Method1489(var38[var49]) >> 1 == 32) {
            var45 = this.Method1476(a, var38[var49]);
            this.Method1478(var45 + 2, var6, true, a.Method1844(a.Field1360, a.Field1361, a.Field1363, a.Field1364, a.Field1365, this.Method1494(var45, var6), true));
         }

         var28 = var49 + 1;
      }

      var49 = 0;
      if (var49 < var40.length) {
         if (this.Method1489(var40[var49]) >> 1 == 32) {
            var45 = this.Method1476(a, var40[var49]);
            this.Method1478(var45 + 2, var6, true, a.Method1844(a.Field1360, a.Field1361, a.Field1363, a.Field1364, a.Field1365, this.Method1494(var45, var6), false));
         }

         var28 = var49 + 1;
      }

      var46 = var27.Field989;
      var27.Field989 = null;
      a.Method1980(var27);
      a.Method1842(var7, var8);
   }

   private int[] Method1475(Class267 a, Class247 a, int a, boolean a) {
      char[] var5 = a.Field1354;
      int[] var6 = new int[this.Method1490(a)];
      a += 2;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = a;
         int var8 = this.Method1492(a);
         int var9;
         switch (var8 >>> 24) {
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
               var9 = this.Method1490(a + 1);

               while(true) {
                  int var10 = this.Method1490(a + 3);
                  int var11 = this.Method1490(a + 5);
                  this.Method1483(var10, a.Field1359);
                  this.Method1483(var10 + var11, a.Field1359);
                  a += 6;
                  --var9;
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

         var9 = this.Method1489(a);
         if (var8 >>> 24 == 66) {
            Object var12 = null;
            a += 1 + 2 * var9;
            a = this.Method1478(a + 2, var5, true, a.Method1974(var8, (Class31)var12, this.Method1494(a, var5), a));
         } else {
            a = this.Method1478(a + 3 + 2 * var9, var5, true, (Class148)null);
         }
      }

      return var6;
   }

   private int Method1476(Class247 a, int a) {
      int var3;
      int var4;
      var3 = this.Method1492(a);
      label25:
      switch (var3 >>> 24) {
         case 0:
         case 1:
         case 22:
            var3 &= -65536;
            a += 2;
            break;
         case 19:
         case 20:
         case 21:
            var3 &= -16777216;
            ++a;
            break;
         case 64:
         case 65:
            var3 &= -16777216;
            var4 = this.Method1490(a + 1);
            a.Field1363 = new Class264[var4];
            a.Field1364 = new Class264[var4];
            a.Field1365 = new int[var4];
            a += 3;
            int var5 = 0;

            while(true) {
               if (var5 >= var4) {
                  break label25;
               }

               int var6 = this.Method1490(a);
               int var7 = this.Method1490(a + 2);
               a.Field1363[var5] = this.Method1483(var6, a.Field1359);
               a.Field1364[var5] = this.Method1483(var6 + var7, a.Field1359);
               a.Field1365[var5] = this.Method1490(a + 4);
               a += 6;
               ++var5;
            }
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var3 &= -16776961;
            a += 4;
            break;
         default:
            var3 &= var3 >>> 24 < 67 ? -256 : -16777216;
            a += 3;
      }

      var4 = this.Method1489(a);
      a.Field1360 = var3;
      a.Field1361 = null;
      return a + 1 + 2 * var4;
   }

   private void Method1477(Class267 a, Class247 a, int a, boolean a) {
      int var6 = this.Field1029[a++] & 255;
      int var7 = b.Method3211(a.Field1358).length - var6;

      int var5;
      Class148 var8;
      for(var5 = 0; var5 < var7; ++var5) {
         var8 = a.Method1971(var5, "Ljava/lang/Synthetic;", false);
         var8.Method401();
      }

      char[] var9 = a.Field1354;
      if (var5 < var6 + var7) {
         int var10 = this.Method1490(a);
         a += 2;

         while(true) {
            var8 = a.Method1971(var5, this.Method1494(a, var9), a);
            a = this.Method1478(a + 2, var9, true, var8);
            --var10;
         }
      }

   }

   private int Method1478(int a, char[] a, boolean a, Class148 a) {
      int var5 = this.Method1490(a);
      a += 2;

      while(true) {
         a = this.Method1479(a + 2, a, this.Method1494(a, a), a);
         --var5;
      }
   }

   private int Method1479(int a, char[] a, String a, Class148 a) {
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
      String var2 = a.Field1358;
      Object[] var3 = a.Field1369;
      int var4 = 0;
      if ((a.Field1356 & 8) == 0) {
         if ("<init>".equals(a.Field1357)) {
            var3[var4++] = Class45.Field402;
         } else {
            var3[var4++] = this.Method1496(this.Field1033 + 2, a.Field1354);
         }
      }

      int var5 = 1;

      while(true) {
         int var6 = var5;
         switch (var2.charAt(var5++)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
               var3[var4++] = Class45.Field397;
               break;
            case 'D':
               var3[var4++] = Class45.Field399;
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
               a.Field1367 = var4;
               return;
            case 'F':
               var3[var4++] = Class45.Field398;
               break;
            case 'J':
               var3[var4++] = Class45.Field400;
               break;
            case 'L':
               while(var2.charAt(var5) != ';') {
                  ++var5;
               }

               var3[var4++] = var2.substring(var6 + 1, var5++);
               break;
            case '[':
               while(var2.charAt(var5) == '[') {
                  ++var5;
               }

               if (var2.charAt(var5) == 'L') {
                  ++var5;

                  while(var2.charAt(var5) != ';') {
                     ++var5;
                  }
               }

               int var10001 = var4++;
               ++var5;
               var3[var10001] = var2.substring(var6, var5);
         }
      }
   }

   private int Method1481(int a, boolean a, boolean a, Class247 a) {
      char[] var5 = a.Field1354;
      Class264[] var6 = a.Field1359;
      int var7 = this.Field1029[a++] & 255;
      a.Field1368 = 0;
      int var8;
      if (var7 < 64) {
         var8 = var7;
         a.Field1366 = 3;
         a.Field1370 = 0;
      } else if (var7 < 128) {
         var8 = var7 - 64;
         a = this.Method1482(a.Field1371, 0, a, var5, var6);
         a.Field1366 = 4;
         a.Field1370 = 1;
      } else {
         var8 = this.Method1490(a);
         a += 2;
         if (var7 == 247) {
            a = this.Method1482(a.Field1371, 0, a, var5, var6);
            a.Field1366 = 4;
            a.Field1370 = 1;
         } else if (var7 >= 248 && var7 < 251) {
            a.Field1366 = 2;
            a.Field1368 = 251 - var7;
            a.Field1367 -= a.Field1368;
            a.Field1370 = 0;
         } else {
            if (var7 != 251) {
               int var9;
               int var10;
               if (var7 < 255) {
                  var9 = a.Field1367;
                  var10 = var7 - 251;

                  while(true) {
                     a = this.Method1482(a.Field1369, var9++, a, var5, var6);
                     --var10;
                  }
               }

               a.Field1366 = 0;
               var9 = this.Method1490(a);
               a += 2;
               a.Field1368 = var9;
               a.Field1367 = var9;
               var10 = 0;

               while(true) {
                  a = this.Method1482(a.Field1369, var10++, a, var5, var6);
                  --var9;
               }
            }

            a.Field1366 = 3;
            a.Field1370 = 0;
         }
      }

      a.Field1362 += var8 + 1;
      this.Method1483(a.Field1362, var6);
      return a;
   }

   private int Method1482(Object[] a, int a, int a, char[] a, Class264[] a) {
      int var6 = this.Field1029[a++] & 255;
      switch (var6) {
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
      int var1 = this.Field1033 + 8 + this.Method1490(this.Field1033 + 6) * 2;
      int var2 = this.Method1490(var1);
      int var3 = this.Method1490(var1 + 8);

      while(true) {
         var1 += 6 + this.Method1492(var1 + 12);
         --var3;
      }
   }

   private Class136 Method1485(Class136[] a, String a, int a, int a, char[] a, int a, Class264[] a) {
      for(int var8 = 0; var8 < a.length; ++var8) {
         if (a[var8].Field987.equals(a)) {
            return a[var8].Method471(this, a, a, a, a, a);
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
      byte[] var2 = this.Field1029;
      return (var2[a] & 255) << 8 | var2[a + 1] & 255;
   }

   public short Method1491(int a) {
      byte[] var2 = this.Field1029;
      return (short)((var2[a] & 255) << 8 | var2[a + 1] & 255);
   }

   public int Method1492(int a) {
      byte[] var2 = this.Field1029;
      return (var2[a] & 255) << 24 | (var2[a + 1] & 255) << 16 | (var2[a + 2] & 255) << 8 | var2[a + 3] & 255;
   }

   public long Method1493(int a) {
      long var2 = (long)this.Method1492(a);
      long var4 = (long)this.Method1492(a + 4) & 4294967295L;
      return var2 << 32 | var4;
   }

   public String Method1494(int a, char[] a) {
      int var3 = this.Method1490(a);
      return null;
   }

   private String Method1495(int a, int a, char[] a) {
      int var4 = a + a;
      byte[] var5 = this.Field1029;
      int var6 = 0;
      byte var8 = 0;
      char var9 = 0;

      while(true) {
         while(a < var4) {
            int var7 = var5[a++];
            switch (var8) {
               case 0:
                  var7 &= 255;
                  if (var7 < 128) {
                     a[var6++] = (char)var7;
                  } else {
                     if (var7 < 224 && var7 > 191) {
                        var9 = (char)(var7 & 31);
                        var8 = 1;
                        continue;
                     }

                     var9 = (char)(var7 & 15);
                     var8 = 2;
                  }
                  break;
               case 1:
                  a[var6++] = (char)(var9 << 6 | var7 & 63);
                  var8 = 0;
                  break;
               case 2:
                  var9 = (char)(var9 << 6 | var7 & 63);
                  var8 = 1;
            }
         }

         return new String(a, 0, var6);
      }
   }

   public String Method1496(int a, char[] a) {
      return this.Method1494(this.Field1030[this.Method1490(a)], a);
   }

   public Object Method1497(int a, char[] a) {
      int var3 = this.Field1030[a];
      switch (this.Field1029[var3 - 1]) {
         case 3:
            return new Integer(this.Method1492(var3));
         case 4:
            return new Float(Float.intBitsToFloat(this.Method1492(var3)));
         case 5:
            return new Long(this.Method1493(var3));
         case 6:
            return new Double(Double.longBitsToDouble(this.Method1493(var3)));
         case 7:
            return b.Method3205(this.Method1494(var3, a));
         case 8:
            return this.Method1494(var3, a);
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         default:
            int var4 = this.Method1489(var3);
            int[] var5 = this.Field1030;
            int var6 = var5[this.Method1490(var3 + 1)];
            String var7 = this.Method1496(var6, a);
            var6 = var5[this.Method1490(var6 + 2)];
            String var8 = this.Method1494(var6, a);
            String var9 = this.Method1494(var6 + 2, a);
            return new Class279(var4, var7, var8, var9);
         case 16:
            return b.Method3206(this.Method1494(var3, a));
      }
   }

   private static Exception Method1498(Exception exception) {
      return exception;
   }
}
