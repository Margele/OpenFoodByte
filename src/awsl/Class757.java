package awsl;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class757 extends Class798 {
   public static final int Field3303 = 0;
   public static final int Field3304 = 1;
   public static final int Field3305 = 2;
   public static final int Field3306 = 3;
   private Class755 Field3307 = new Class771();
   private float Field3308 = 0.0F;
   private float Field3309 = 0.5F;
   private float Field3310 = 0.0F;
   private int Field3311 = 8;
   private Random Field3312 = new Random();
   private long Field3313 = 567L;
   private int Field3314 = 1;
   private float Field3315 = 0.5F;
   private int Field3316 = 0;
   private boolean Field3317 = false;

   public void Method9(int a) {
      this.Field3314 = a;
   }

   public int Method10() {
      return this.Field3314;
   }

   public void Method11(int a) {
      this.Field3311 = a;
   }

   public int Method12() {
      return this.Field3311;
   }

   public void Method56(float a) {
      this.Field3309 = a;
   }

   public float Method57() {
      return this.Field3309;
   }

   public void Method58(float a) {
      this.Field3310 = a;
   }

   public float Method59() {
      return this.Field3310;
   }

   public void Method60(float a) {
      this.Field3308 = a;
   }

   public float Method61() {
      return this.Field3308;
   }

   public void Method164(float a) {
      this.Field3315 = a;
   }

   public float Method165() {
      return this.Field3315;
   }

   public void Method13(int a) {
      this.Field3316 = a;
   }

   public int Method14() {
      return this.Field3316;
   }

   public void Method87(boolean a) {
      this.Field3317 = a;
   }

   public boolean Method88() {
      return this.Field3317;
   }

   public void Method89() {
      this.Field3313 = (new Date()).getTime();
   }

   private float Method20(float a, float a) {
      return a + (a - a) * this.Field3312.nextFloat();
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int[] var6 = new int[a * a];
      this.Field3312.setSeed(this.Field3313);
      Class193.Method1270();
      float var7 = (float)Math.sin((double)this.Field3308);
      float var8 = (float)Math.cos((double)this.Field3308);
      int var9 = 0;
      int var11 = 0;
      int var12;
      if (var11 < a) {
         var12 = 0;
         if (var12 < a) {
            var6[var9] = this.Field3317 ? -1 : a[var9];
            ++var9;
            ++var12;
         }

         ++var11;
      }

      int var10;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      byte var29;
      switch (this.Field3314) {
         case 0:
            var10 = (int)(2.0F * this.Field3309 * (float)a * (float)a / (float)(this.Field3311 + 1));
            var29 = 0;
            if (var29 >= var10) {
               break;
            }

            var11 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % a;
            var12 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % a;
            var13 = this.Field3312.nextInt() % this.Field3311 + 1;
            var14 = a[var12 * a + var11];
            var15 = var11 - var13;
            if (var15 < var11 + var13 + 1) {
               if (var15 < a) {
                  var16 = this.Field3317 ? -1 : var6[var12 * a + var15];
                  var6[var12 * a + var15] = Class776.Method1719(this.Field3315, var16, var14);
               }

               ++var15;
            }

            var15 = var12 - var13;
            if (var15 < var12 + var13 + 1) {
               if (var15 < a) {
                  var16 = this.Field3317 ? -1 : var6[var15 * a + var11];
                  var6[var15 * a + var11] = Class776.Method1719(this.Field3315, var16, var14);
               }

               ++var15;
            }

            var9 = var29 + 1;
         case 1:
            var10 = (int)(2.0F * this.Field3309 * (float)a * (float)a / 2.0F);
            var29 = 0;
            if (var29 >= var10) {
               break;
            }

            var11 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % a;
            var12 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % a;
            var13 = a[var12 * a + var11];
            var14 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % this.Field3311;
            var15 = (int)((float)var14 * var8);
            var16 = (int)((float)var14 * var7);
            var17 = var11 - var15;
            var18 = var12 - var16;
            var19 = var11 + var15;
            int var20 = var12 + var16;
            if (var19 < var17) {
               boolean var26 = true;
            }

            byte var31 = 1;
            if (var20 < var18) {
               boolean var27 = true;
            }

            byte var32 = 1;
            var15 = var19 - var17;
            var16 = var20 - var18;
            var15 = Math.abs(var15);
            var16 = Math.abs(var16);
            int var21 = var17;
            int var22 = var18;
            int var28;
            if (var17 < a && var18 < a) {
               var28 = this.Field3317 ? -1 : var6[var18 * a + var17];
               var6[var18 * a + var17] = Class776.Method1719(this.Field3315, var28, var13);
            }

            label151: {
               int var23;
               int var24;
               int var25;
               if (Math.abs(var15) > Math.abs(var16)) {
                  var23 = 2 * var16 - var15;
                  var24 = 2 * var16;
                  var25 = 2 * (var16 - var15);

                  do {
                     do {
                        if (var21 == var19) {
                           break label151;
                        }

                        var23 += var24;
                        var23 += var25;
                        var22 += var32;
                        var21 += var31;
                     } while(var21 >= a);
                  } while(var22 >= a);

                  var28 = this.Field3317 ? -1 : var6[var22 * a + var21];
                  var6[var22 * a + var21] = Class776.Method1719(this.Field3315, var28, var13);
               }

               var23 = 2 * var15 - var16;
               var24 = 2 * var15;
               var25 = 2 * (var15 - var16);

               while(var22 != var20) {
                  var23 += var24;
                  var23 += var25;
                  var21 += var31;
                  var22 += var32;
                  if (var21 < a && var22 < a) {
                     var28 = this.Field3317 ? -1 : var6[var22 * a + var21];
                     var6[var22 * a + var21] = Class776.Method1719(this.Field3315, var28, var13);
                     break;
                  }
               }
            }

            var9 = var29 + 1;
         case 2:
         case 3:
            var11 = this.Field3311 + 1;
            var12 = var11 * var11;
            var10 = (int)(2.0F * this.Field3309 * (float)a * (float)a / (float)var11);
            var29 = 0;
            if (var29 < var10) {
               var13 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % a;
               var14 = (this.Field3312.nextInt() & Integer.MAX_VALUE) % a;
               var15 = a[var14 * a + var13];
               var16 = var13 - var11;
               if (var16 < var13 + var11 + 1) {
                  var17 = var14 - var11;
                  if (var17 < var14 + var11 + 1) {
                     if (this.Field3314 == 2) {
                        var18 = (var16 - var13) * (var16 - var13) + (var17 - var14) * (var17 - var14);
                     }

                     byte var30 = 0;
                     if (var16 < a && var17 < a && var30 <= var12) {
                        var19 = this.Field3317 ? -1 : var6[var17 * a + var16];
                        var6[var17 * a + var16] = Class776.Method1719(this.Field3315, var19, var15);
                     }

                     ++var17;
                  }

                  ++var16;
               }

               var9 = var29 + 1;
            }
      }

      return var6;
   }

   public String toString() {
      return "Effects/Smear...";
   }
}
