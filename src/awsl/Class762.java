package awsl;

import java.awt.Rectangle;

public class Class762 extends Class798 {
   public static final int Field3342 = 0;
   public static final int Field3343 = 1;
   public static final int Field3344 = 2;
   public static final int Field3345 = 3;
   private float Field3346 = 1.0F;
   protected Class755 Field3347 = new Class771();
   private boolean Field3348 = true;
   private boolean Field3349 = false;
   private boolean Field3350 = false;
   private int Field3351;
   private static final int Field3352 = 41;
   private static final int Field3353 = (int)(41.0 * Math.sqrt(2.0));
   private static final int Field3354 = (int)(41.0 * Math.sqrt(5.0));

   public void Method56(float a) {
      this.Field3346 = a;
   }

   public float Method57() {
      return this.Field3346;
   }

   public void Method176(Class755 a) {
      this.Field3347 = a;
   }

   public Class755 Method177() {
      return this.Field3347;
   }

   public void Method87(boolean a) {
      this.Field3348 = a;
   }

   public boolean Method88() {
      return this.Field3348;
   }

   public void Method9(int a) {
      this.Field3351 = a;
   }

   public int Method10() {
      return this.Field3351;
   }

   public void Method1282(boolean a) {
      this.Field3349 = a;
   }

   public boolean Method1283() {
      return this.Field3349;
   }

   public void Method1770(boolean a) {
      this.Field3350 = a;
   }

   public boolean Method1771() {
      return this.Field3350;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int[] var5 = new int[a * a];
      this.Method1615(a, var5, a, a);
      int var6 = this.Method1772(var5, a, a);
      this.Method1773(var5, a, a, a, var6);
      return a;
   }

   public int Method1772(int[] a, int a, int a) {
      int var4 = a - 3;
      int var5 = a - 3;
      int var6 = 0;

      int var7;
      int var8;
      int var9;
      int var10;
      for(var8 = 0; var8 < a; ++var8) {
         for(var9 = 0; var9 < a; ++var9) {
            var10 = var9 + var8 * a;
            if (a[var10] > 0) {
               if (var9 >= 2 && var9 <= var4 && var8 >= 2 && var8 <= var5) {
                  var7 = this.Method1775(a, a, var10);
               } else {
                  var7 = this.Method1774(var9, var8, a, a, var10, var4, var5);
               }

               if (var7 > var6) {
                  var6 = var7;
               }
            }
         }
      }

      var8 = a - 1;
      var9 = a - 1;

      while(true) {
         var10 = var9 + var8 * a;
         if (a[var10] > 0) {
            if (var9 >= 2 && var9 <= var4 && var8 >= 2 && var8 <= var5) {
               var7 = this.Method1775(a, a, var10);
            } else {
               var7 = this.Method1774(var9, var8, a, a, var10, var4, var5);
            }

            if (var7 > var6) {
               var6 = var7;
            }
         }

         --var9;
      }
   }

   private void Method1615(int[] a, int[] a, int a, int a) {
      for(int var5 = 0; var5 < a; ++var5) {
         for(int var6 = 0; var6 < a; ++var6) {
            int var7 = var6 + var5 * a;
            int var8 = this.Field3348 ? a[var7] >> 24 & 255 : Class767.Method1689(a[var7]);
            a[var7] = var8 * 41 / 10;
         }
      }

   }

   private void Method1773(int[] a, int[] a, int a, int a, int a) {
      boolean var6 = Class193.Method1270();
      byte var22 = 1;
      int var7 = 0;
      if (var7 < a) {
         int var8 = 0;
         if (var8 < a) {
            int var9 = var8 + var7 * a;
            int var10 = a[var9];
            float var11 = 0.0F;
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = false;
            var15 = false;
            var14 = false;
            var13 = false;
            var12 = false;
            int var23 = a[var9] >> 24 & 255;
            var11 = Class776.Method1711(this.Field3346 * (float)var10 / (float)var22, 0.0F, 1.0F);
            switch (this.Field3351) {
               case 1:
                  var11 = Class776.Method1709(var11);
               case 2:
                  var11 = Class776.Method1710(var11);
               case 3:
                  var11 = Class776.Method1708(0.0F, 1.0F, var11);
               default:
                  int var26;
                  if (this.Field3347 == null) {
                     var26 = (int)(var11 * 255.0F);
                  }

                  int var16 = this.Field3347.Method283(var11);
                  int var24 = var16 >> 16 & 255;
                  int var25 = var16 >> 8 & 255;
                  var26 = var16 & 255;
                  var23 = this.Field3348 ? a[var9] >> 24 & 255 : Class767.Method1689(a[var9]);
                  if (this.Field3349) {
                     var24 = 255 - var24;
                     var25 = 255 - var25;
                     var26 = 255 - var26;
                  }

                  if (this.Field3350) {
                     short var27 = 255;
                     int var17 = a[var9];
                     int var18 = (var17 & -16777216) >> 24;
                     int var19 = (var17 & 16711680) >> 16;
                     int var20 = (var17 & '\uff00') >> 8;
                     int var21 = var17 & 255;
                     var19 = var24 * var19 / var27;
                     var20 = var25 * var20 / var27;
                     var21 = var26 * var21 / var27;
                     short var28 = 0;
                     if (var28 > 255) {
                        var28 = 255;
                     }

                     short var29 = 0;
                     if (var29 > 255) {
                        var29 = 255;
                     }

                     short var30 = 0;
                     if (var30 > 255) {
                        var30 = 255;
                     }

                     a[var9] = var18 << 24 | var28 << 16 | var29 << 8 | var30;
                  }

                  a[var9] = var23 << 24 | var24 << 16 | var25 << 8 | var26;
                  ++var8;
            }
         }

         ++var7;
      }

   }

   private int Method1774(int a, int a, int[] a, int a, int a, int a, int a) {
      int var10 = a - a - a - 2;
      int var11 = var10 + a;
      int var12 = var11 + a;
      int var13 = var12 + a;
      int var14 = var13 + a;
      if (a != a + 2 && a != a + 2) {
         int var9 = a[var11 + 2] + 41;
         int var8 = var9;
         var9 = a[var12 + 1] + 41;
         if (var9 < var8) {
            var8 = var9;
         }

         var9 = a[var12 + 3] + 41;
         if (var9 < var8) {
            var8 = var9;
         }

         var9 = a[var13 + 2] + 41;
         if (var9 < var8) {
            var8 = var9;
         }

         var9 = a[var11 + 1] + Field3353;
         if (var9 < var8) {
            var8 = var9;
         }

         var9 = a[var11 + 3] + Field3353;
         if (var9 < var8) {
            var8 = var9;
         }

         var9 = a[var13 + 1] + Field3353;
         if (var9 < var8) {
            var8 = var9;
         }

         var9 = a[var13 + 3] + Field3353;
         if (var9 < var8) {
            var8 = var9;
         }

         if (a != 1 && a != 1 && a != a + 1 && a != a + 1) {
            var9 = a[var10 + 1] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var10 + 3] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var11 + 4] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var13 + 4] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var14 + 3] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var14 + 1] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var13] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            var9 = a[var11] + Field3354;
            if (var9 < var8) {
               var8 = var9;
            }

            return a[a] = var8;
         } else {
            return a[a] = var8;
         }
      } else {
         return a[a] = 41;
      }
   }

   private int Method1775(int[] a, int a, int a) {
      int var6 = a - a - a - 2;
      int var7 = var6 + a;
      int var8 = var7 + a;
      int var9 = var8 + a;
      int var10 = var9 + a;
      int var5 = a[var7 + 2] + 41;
      int var4 = var5;
      var5 = a[var8 + 1] + 41;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var8 + 3] + 41;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var9 + 2] + 41;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var7 + 1] + Field3353;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var7 + 3] + Field3353;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var9 + 1] + Field3353;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var9 + 3] + Field3353;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var6 + 1] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var6 + 3] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var7 + 4] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var9 + 4] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var10 + 3] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var10 + 1] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var9] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      var5 = a[var7] + Field3354;
      if (var5 < var4) {
         var4 = var5;
      }

      return a[a] = var4;
   }

   public String toString() {
      return "Stylize/Shapeburst...";
   }
}
