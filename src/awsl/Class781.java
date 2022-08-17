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

      for(int a = 0; a < this.Field3501.length; ++a) {
         this.Field3501[a] = new Class748(this);
      }

      if (Field3506 == null) {
         Field3506 = new byte[8192];
         float a = 1.0F;
         float a = 0.0F;
         float a = 2.5F;

         for(int a = 0; a < 10; ++a) {
            if (a > 1) {
               a *= (float)a;
            }

            float a = (float)Math.pow((double)a, (double)a) * (float)Math.exp((double)(-a)) / a;
            int a = (int)(a * 8192.0F);
            a += a;
            int a = (int)(a * 8192.0F);

            for(int a = a; a < a; ++a) {
               Field3506[a] = (byte)a;
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
      float a = (float)Math.cos((double)a);
      float a = (float)Math.sin((double)a);
      this.Field3497 = a;
      this.Field3498 = a;
      this.Field3499 = -a;
      this.Field3500 = a;
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
      byte a;
      boolean a;
      switch (this.Field3503) {
         case 0:
         default:
            a = Field3506[this.Field3496.nextInt() & 8191];
         case 1:
            a = true;
         case 2:
            a = true;
         case 3:
            a = true;
         case 4:
      }

      a = 2;
      int a = 0;
      if (a < a) {
         float a = 0.0F;
         float a = 0.0F;
         float a = 1.0F;
         float var10000;
         switch (this.Field3503) {
            case 0:
               a = this.Field3496.nextFloat();
               a = this.Field3496.nextFloat();
            case 1:
               a = 0.5F;
               a = 0.5F;
               if (this.Field3502 == 0.0F) {
                  break;
               }

               var10000 = (float)((double)a + (double)this.Field3502 * ((double)this.Field3496.nextFloat() - 0.5));
               var10000 = (float)((double)a + (double)this.Field3502 * ((double)this.Field3496.nextFloat() - 0.5));
            case 2:
               if ((a & 1) == 0) {
                  a = 0.75F;
                  a = 0.0F;
               }

               a = 0.75F;
               a = 0.5F;
               if (this.Field3502 == 0.0F) {
                  break;
               }

               a += this.Field3502 * Class598.Method157(271.0F * ((float)a + a), 271.0F * ((float)a + a));
               a += this.Field3502 * Class598.Method157(271.0F * ((float)a + a) + 89.0F, 271.0F * ((float)a + a) + 137.0F);
            case 3:
               switch (a) {
                  case 0:
                     a = 0.207F;
                     a = 0.207F;
                  case 1:
                     a = 0.707F;
                     a = 0.707F;
                     a = 1.6F;
               }

               if (this.Field3502 == 0.0F) {
                  break;
               }

               a += this.Field3502 * Class598.Method157(271.0F * ((float)a + a), 271.0F * ((float)a + a));
               var10000 = a + this.Field3502 * Class598.Method157(271.0F * ((float)a + a) + 89.0F, 271.0F * ((float)a + a) + 137.0F);
            case 4:
               if ((a & 1) == 0) {
                  a = 0.25F;
                  a = 0.35F;
                  a = 0.75F;
                  a = 0.65F;
               }

               a = 0.75F;
               a = 0.35F;
               a = 0.25F;
               a = 0.65F;
               if (this.Field3502 != 0.0F) {
                  a += this.Field3502 * Class598.Method157(271.0F * ((float)a + a), 271.0F * ((float)a + a));
                  a += this.Field3502 * Class598.Method157(271.0F * ((float)a + a) + 89.0F, 271.0F * ((float)a + a) + 137.0F);
               }
         }

         float a = Math.abs(a - a);
         float a = Math.abs(a - a);
         a *= a;
         a *= a;
         if (this.Field3491 == 1.0F) {
            var10000 = a + a;
         }

         float a;
         if (this.Field3491 == 2.0F) {
            a = (float)Math.sqrt((double)(a * a + a * a));
         }

         a = (float)Math.pow((double)((float)Math.pow((double)a, (double)this.Field3491) + (float)Math.pow((double)a, (double)this.Field3491)), (double)(1.0F / this.Field3491));
         Class748 a;
         if (a < a[0].Field3278) {
            a = a[2];
            a[2] = a[1];
            a[1] = a[0];
            a[0] = a;
            a.Field3278 = a;
            a.Field3274 = a;
            a.Field3275 = a;
            a.Field3272 = (float)a + a;
            a.Field3273 = (float)a + a;
         }

         if (a < a[1].Field3278) {
            a = a[2];
            a[2] = a[1];
            a[1] = a;
            a.Field3278 = a;
            a.Field3274 = a;
            a.Field3275 = a;
            a.Field3272 = (float)a + a;
            a.Field3273 = (float)a + a;
         }

         if (a < a[2].Field3278) {
            a = a[2];
            a.Field3278 = a;
            a.Field3274 = a;
            a.Field3275 = a;
            a.Field3272 = (float)a + a;
            a.Field3273 = (float)a + a;
         }

         ++a;
      }

      return a[2].Field3278;
   }

   public float Method20(float a, float a) {
      int a;
      for(a = 0; a < this.Field3501.length; ++a) {
         this.Field3501[a].Field3278 = Float.POSITIVE_INFINITY;
      }

      a = (int)a;
      int a = (int)a;
      float a = a - (float)a;
      float a = a - (float)a;
      float a = this.Method876(a, a, a, a, this.Field3501);
      if (a > a) {
         a = this.Method876(a, a + 1.0F, a, a - 1, this.Field3501);
      }

      if (a > 1.0F - a) {
         a = this.Method876(a, a - 1.0F, a, a + 1, this.Field3501);
      }

      if (a > a) {
         this.Method876(a + 1.0F, a, a - 1, a, this.Field3501);
         if (a > a) {
            a = this.Method876(a + 1.0F, a + 1.0F, a - 1, a - 1, this.Field3501);
         }

         if (a > 1.0F - a) {
            a = this.Method876(a + 1.0F, a - 1.0F, a - 1, a + 1, this.Field3501);
         }
      }

      if (a > 1.0F - a) {
         a = this.Method876(a - 1.0F, a, a + 1, a, this.Field3501);
         if (a > a) {
            a = this.Method876(a - 1.0F, a + 1.0F, a + 1, a - 1, this.Field3501);
         }

         if (a > 1.0F - a) {
            a = this.Method876(a - 1.0F, a - 1.0F, a + 1, a + 1, this.Field3501);
         }
      }

      float a = 0.0F;

      for(int a = 0; a < 3; ++a) {
         a += this.Field3494[a] * this.Field3501[a].Field3278;
      }

      float a;
      if (this.Field3495 != 0.0F) {
         a = (float)Math.atan2((double)(a - this.Field3501[0].Field3273), (double)(a - this.Field3501[0].Field3272));
         if (a < 0.0F) {
            a += 6.2831855F;
         }

         a /= 12.566371F;
         a += this.Field3495 * a;
      }

      if (this.Field3507 != 0.0F) {
         a = 1.0F / (this.Field3501[0].Field3275 + this.Field3501[0].Field3274);
         a += this.Field3507 * a;
      }

      return a;
   }

   public float Method67(float a, float a, float a) {
      float a = 0.0F;

      for(float a = 1.0F; a <= a; a *= 2.0F) {
         a += this.Method20(a * a, a * a) / a;
      }

      return a;
   }

   public int Method877(int a, int a, int[] a, int a, int a) {
      float a = this.Field3497 * (float)a + this.Field3498 * (float)a;
      float a = this.Field3499 * (float)a + this.Field3500 * (float)a;
      a /= this.Field3484;
      a /= this.Field3484 * this.Field3485;
      a += 1000.0F;
      a += 1000.0F;
      float a = this.Field3488 == 1.0F ? this.Method20(a, a) : this.Method67(a, a, this.Field3488);
      a *= 2.0F;
      a *= this.Field3487;
      int a = -16777216;
      int a;
      int a;
      int a;
      if (this.Field3493 != null) {
         a = this.Field3493.Method283(a);
         if (this.Field3492) {
            a = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
            a = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
            a = a[a * a + a];
            a = (this.Field3501[1].Field3278 - this.Field3501[0].Field3278) / (this.Field3501[1].Field3278 + this.Field3501[0].Field3278);
            a = Class776.Method1708(this.Field3494[1], this.Field3494[0], a);
            a = Class776.Method1719(a, -16777216, a);
         }

         return a;
      } else {
         a = Class767.Method1687((int)(a * 255.0F));
         a = a << 16;
         a = a << 8;
         return a | a | a | a;
      }
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int a = 0;
      int[] a = new int[a * a];

      for(int a = 0; a < a; ++a) {
         for(int a = 0; a < a; ++a) {
            a[a++] = this.Method877(a, a, a, a, a);
         }
      }

      return a;
   }

   public Object Method878() {
      Class781 a = (Class781)super.Method878();
      a.Field3494 = (float[])((float[])this.Field3494.clone());
      a.Field3501 = (Class748[])((Class748[])this.Field3501.clone());
      a.Field3496 = new Random();
      return a;
   }

   public String toString() {
      return "Texture/Cellular...";
   }
}
