package awsl;

import java.awt.Rectangle;
import java.util.Random;

public class Class781 extends Class798 implements Class594, Cloneable {
   protected float Field3484 = 32.0F;
   protected float Field3485 = 1.0F;
   protected float Field3486 = 0.0F;
   public float Field3487 = 1.0F;
   public float Field3488 = 1.0F;
   public float Field3489 = 0.5F;
   public float Field3490 = 0.5F;
   public float Field3491 = 2.0F;
   public boolean Field3492 = false;
   protected Class755 Field3493 = new Class758();
   protected float[] Field3494 = new float[]{1.0F, 0.0F, 0.0F, 0.0F};
   protected float Field3495;
   protected Random Field3496 = new Random();
   protected float Field3497 = 1.0F;
   protected float Field3498 = 0.0F;
   protected float Field3499 = 0.0F;
   protected float Field3500 = 1.0F;
   protected Class748[] Field3501 = null;
   protected float Field3502 = 0.0F;
   protected int Field3503 = 2;
   private float Field3504;
   private float Field3505;
   private static byte[] Field3506;
   private float Field3507;
   public static final int Field3508 = 0;
   public static final int Field3509 = 1;
   public static final int Field3510 = 2;
   public static final int Field3511 = 3;
   public static final int Field3512 = 4;

   public Class781() {
      this.Field3501 = new Class748[3];

      for(int var1 = 0; var1 < this.Field3501.length; ++var1) {
         this.Field3501[var1] = new Class748(this);
      }

      if (Field3506 == null) {
         Field3506 = new byte[8192];
         float var9 = 1.0F;
         float var2 = 0.0F;
         float var3 = 2.5F;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var4 > 1) {
               var9 *= (float)var4;
            }

            float var5 = (float)Math.pow((double)var3, (double)var4) * (float)Math.exp((double)(-var3)) / var9;
            int var6 = (int)(var2 * 8192.0F);
            var2 += var5;
            int var7 = (int)(var2 * 8192.0F);

            for(int var8 = var6; var8 < var7; ++var8) {
               Field3506[var8] = (byte)var4;
            }
         }
      }

   }

   public void Method56(float a) {
      this.Field3484 = a;
   }

   public float Method57() {
      return this.Field3484;
   }

   public void Method58(float a) {
      this.Field3485 = a;
   }

   public float Method59() {
      return this.Field3485;
   }

   public void Method60(float a) {
      this.Field3486 = a;
      float var2 = (float)Math.cos((double)a);
      float var3 = (float)Math.sin((double)a);
      this.Field3497 = var2;
      this.Field3498 = var3;
      this.Field3499 = -var3;
      this.Field3500 = var2;
   }

   public float Method61() {
      return this.Field3486;
   }

   public void Method866(int a, float a) {
      this.Field3494[a] = a;
   }

   public float Method867(int a) {
      return this.Field3494[a];
   }

   public void Method164(float a) {
      this.Field3495 = a;
   }

   public float Method165() {
      return this.Field3495;
   }

   public void Method166(float a) {
      this.Field3507 = a;
   }

   public float Method167() {
      return this.Field3507;
   }

   public void Method168(float a) {
      this.Field3494[0] = a;
   }

   public float Method169() {
      return this.Field3494[0];
   }

   public void Method170(float a) {
      this.Field3494[1] = a;
   }

   public float Method171() {
      return this.Field3494[1];
   }

   public void Method172(float a) {
      this.Field3494[2] = a;
   }

   public float Method173() {
      return this.Field3494[2];
   }

   public void Method174(float a) {
      this.Field3494[3] = a;
   }

   public float Method175() {
      return this.Field3494[3];
   }

   public void Method176(Class755 a) {
      this.Field3493 = a;
   }

   public Class755 Method177() {
      return this.Field3493;
   }

   public void Method868(float a) {
      this.Field3502 = a;
   }

   public float Method869() {
      return this.Field3502;
   }

   public void Method9(int a) {
      this.Field3503 = a;
   }

   public int Method10() {
      return this.Field3503;
   }

   public void Method870(float a) {
      this.Field3491 = a;
   }

   public float Method871() {
      return this.Field3491;
   }

   public void Method872(float a) {
      this.Field3488 = a;
   }

   public float Method873() {
      return this.Field3488;
   }

   public void Method874(float a) {
      this.Field3487 = a;
   }

   public float Method875() {
      return this.Field3487;
   }

   private float Method876(float a, float a, int a, int a, Class748[] a) {
      Class193.Method1269();
      this.Field3496.setSeed((long)(571 * a + 23 * a));
      byte var7;
      boolean var16;
      switch (this.Field3503) {
         case 0:
         default:
            var7 = Field3506[this.Field3496.nextInt() & 8191];
         case 1:
            var16 = true;
         case 2:
            var16 = true;
         case 3:
            var16 = true;
         case 4:
      }

      var7 = 2;
      int var8 = 0;
      if (var8 < var7) {
         float var9 = 0.0F;
         float var10 = 0.0F;
         float var11 = 1.0F;
         float var10000;
         switch (this.Field3503) {
            case 0:
               var9 = this.Field3496.nextFloat();
               var10 = this.Field3496.nextFloat();
            case 1:
               var10 = 0.5F;
               var9 = 0.5F;
               if (this.Field3502 == 0.0F) {
                  break;
               }

               var10000 = (float)((double)var9 + (double)this.Field3502 * ((double)this.Field3496.nextFloat() - 0.5));
               var10000 = (float)((double)var10 + (double)this.Field3502 * ((double)this.Field3496.nextFloat() - 0.5));
            case 2:
               if ((a & 1) == 0) {
                  var9 = 0.75F;
                  var10 = 0.0F;
               }

               var9 = 0.75F;
               var10 = 0.5F;
               if (this.Field3502 == 0.0F) {
                  break;
               }

               var9 += this.Field3502 * Class598.Method157(271.0F * ((float)a + var9), 271.0F * ((float)a + var10));
               var10 += this.Field3502 * Class598.Method157(271.0F * ((float)a + var9) + 89.0F, 271.0F * ((float)a + var10) + 137.0F);
            case 3:
               switch (var8) {
                  case 0:
                     var9 = 0.207F;
                     var10 = 0.207F;
                  case 1:
                     var9 = 0.707F;
                     var10 = 0.707F;
                     var11 = 1.6F;
               }

               if (this.Field3502 == 0.0F) {
                  break;
               }

               var9 += this.Field3502 * Class598.Method157(271.0F * ((float)a + var9), 271.0F * ((float)a + var10));
               var10000 = var10 + this.Field3502 * Class598.Method157(271.0F * ((float)a + var9) + 89.0F, 271.0F * ((float)a + var10) + 137.0F);
            case 4:
               if ((a & 1) == 0) {
                  var9 = 0.25F;
                  var10 = 0.35F;
                  var9 = 0.75F;
                  var10 = 0.65F;
               }

               var9 = 0.75F;
               var10 = 0.35F;
               var9 = 0.25F;
               var10 = 0.65F;
               if (this.Field3502 != 0.0F) {
                  var9 += this.Field3502 * Class598.Method157(271.0F * ((float)a + var9), 271.0F * ((float)a + var10));
                  var10 += this.Field3502 * Class598.Method157(271.0F * ((float)a + var9) + 89.0F, 271.0F * ((float)a + var10) + 137.0F);
               }
         }

         float var12 = Math.abs(a - var9);
         float var13 = Math.abs(a - var10);
         var12 *= var11;
         var13 *= var11;
         if (this.Field3491 == 1.0F) {
            var10000 = var12 + var13;
         }

         float var14;
         if (this.Field3491 == 2.0F) {
            var14 = (float)Math.sqrt((double)(var12 * var12 + var13 * var13));
         }

         var14 = (float)Math.pow((double)((float)Math.pow((double)var12, (double)this.Field3491) + (float)Math.pow((double)var13, (double)this.Field3491)), (double)(1.0F / this.Field3491));
         Class748 var15;
         if (var14 < a[0].Field3278) {
            var15 = a[2];
            a[2] = a[1];
            a[1] = a[0];
            a[0] = var15;
            var15.Field3278 = var14;
            var15.Field3274 = var12;
            var15.Field3275 = var13;
            var15.Field3272 = (float)a + var9;
            var15.Field3273 = (float)a + var10;
         }

         if (var14 < a[1].Field3278) {
            var15 = a[2];
            a[2] = a[1];
            a[1] = var15;
            var15.Field3278 = var14;
            var15.Field3274 = var12;
            var15.Field3275 = var13;
            var15.Field3272 = (float)a + var9;
            var15.Field3273 = (float)a + var10;
         }

         if (var14 < a[2].Field3278) {
            var15 = a[2];
            var15.Field3278 = var14;
            var15.Field3274 = var12;
            var15.Field3275 = var13;
            var15.Field3272 = (float)a + var9;
            var15.Field3273 = (float)a + var10;
         }

         ++var8;
      }

      return a[2].Field3278;
   }

   public float Method20(float a, float a) {
      int var3;
      for(var3 = 0; var3 < this.Field3501.length; ++var3) {
         this.Field3501[var3].Field3278 = Float.POSITIVE_INFINITY;
      }

      var3 = (int)a;
      int var4 = (int)a;
      float var5 = a - (float)var3;
      float var6 = a - (float)var4;
      float var7 = this.Method876(var5, var6, var3, var4, this.Field3501);
      if (var7 > var6) {
         var7 = this.Method876(var5, var6 + 1.0F, var3, var4 - 1, this.Field3501);
      }

      if (var7 > 1.0F - var6) {
         var7 = this.Method876(var5, var6 - 1.0F, var3, var4 + 1, this.Field3501);
      }

      if (var7 > var5) {
         this.Method876(var5 + 1.0F, var6, var3 - 1, var4, this.Field3501);
         if (var7 > var6) {
            var7 = this.Method876(var5 + 1.0F, var6 + 1.0F, var3 - 1, var4 - 1, this.Field3501);
         }

         if (var7 > 1.0F - var6) {
            var7 = this.Method876(var5 + 1.0F, var6 - 1.0F, var3 - 1, var4 + 1, this.Field3501);
         }
      }

      if (var7 > 1.0F - var5) {
         var7 = this.Method876(var5 - 1.0F, var6, var3 + 1, var4, this.Field3501);
         if (var7 > var6) {
            var7 = this.Method876(var5 - 1.0F, var6 + 1.0F, var3 + 1, var4 - 1, this.Field3501);
         }

         if (var7 > 1.0F - var6) {
            var7 = this.Method876(var5 - 1.0F, var6 - 1.0F, var3 + 1, var4 + 1, this.Field3501);
         }
      }

      float var8 = 0.0F;

      for(int var9 = 0; var9 < 3; ++var9) {
         var8 += this.Field3494[var9] * this.Field3501[var9].Field3278;
      }

      float var10;
      if (this.Field3495 != 0.0F) {
         var10 = (float)Math.atan2((double)(a - this.Field3501[0].Field3273), (double)(a - this.Field3501[0].Field3272));
         if (var10 < 0.0F) {
            var10 += 6.2831855F;
         }

         var10 /= 12.566371F;
         var8 += this.Field3495 * var10;
      }

      if (this.Field3507 != 0.0F) {
         var10 = 1.0F / (this.Field3501[0].Field3275 + this.Field3501[0].Field3274);
         var8 += this.Field3507 * var10;
      }

      return var8;
   }

   public float Method67(float a, float a, float a) {
      float var4 = 0.0F;

      for(float var5 = 1.0F; var5 <= a; var5 *= 2.0F) {
         var4 += this.Method20(var5 * a, var5 * a) / var5;
      }

      return var4;
   }

   public int Method877(int a, int a, int[] a, int a, int a) {
      float var6 = this.Field3497 * (float)a + this.Field3498 * (float)a;
      float var7 = this.Field3499 * (float)a + this.Field3500 * (float)a;
      var6 /= this.Field3484;
      var7 /= this.Field3484 * this.Field3485;
      var6 += 1000.0F;
      var7 += 1000.0F;
      float var8 = this.Field3488 == 1.0F ? this.Method20(var6, var7) : this.Method67(var6, var7, this.Field3488);
      var8 *= 2.0F;
      var8 *= this.Field3487;
      int var9 = -16777216;
      int var10;
      int var11;
      int var12;
      if (this.Field3493 != null) {
         var10 = this.Field3493.Method283(var8);
         if (this.Field3492) {
            var11 = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
            var12 = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
            var10 = a[var12 * a + var11];
            var8 = (this.Field3501[1].Field3278 - this.Field3501[0].Field3278) / (this.Field3501[1].Field3278 + this.Field3501[0].Field3278);
            var8 = Class776.Method1708(this.Field3494[1], this.Field3494[0], var8);
            var10 = Class776.Method1719(var8, -16777216, var10);
         }

         return var10;
      } else {
         var10 = Class767.Method1687((int)(var8 * 255.0F));
         var11 = var10 << 16;
         var12 = var10 << 8;
         return var9 | var11 | var12 | var10;
      }
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var5 = 0;
      int[] var6 = new int[a * a];

      for(int var7 = 0; var7 < a; ++var7) {
         for(int var8 = 0; var8 < a; ++var8) {
            var6[var5++] = this.Method877(var8, var7, a, a, a);
         }
      }

      return var6;
   }

   public Object Method878() {
      Class781 var1 = (Class781)super.Method878();
      var1.Field3494 = (float[])((float[])this.Field3494.clone());
      var1.Field3501 = (Class748[])((Class748[])this.Field3501.clone());
      var1.Field3496 = new Random();
      return var1;
   }

   public String toString() {
      return "Texture/Cellular...";
   }
}
