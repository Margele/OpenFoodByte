package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class Class763 extends Class798 {
   public static final int Field3355 = 0;
   public static final int Field3356 = 1;
   public static final int Field3357 = 0;
   public static final int Field3358 = 1;
   public static final int Field3359 = 2;
   public static final int Field3360 = 3;
   private float Field3361 = 1.0F;
   private float Field3362 = 5.0F;
   private float Field3363 = 10000.0F;
   private int Field3364 = 0;
   private int Field3365 = 0;
   private Class594 Field3366;
   private BufferedImage Field3367;
   private int[] Field3368;
   private int Field3369 = 1;
   private int Field3370 = 1;
   private Class590 Field3371 = new Class590();
   private Class590 Field3372 = new Class590();
   private Class590 Field3373 = new Class590();
   private Class600 Field3374 = new Class600();
   private Class600 Field3375 = new Class600();
   private Class600 Field3376 = new Class600();
   private Class590 Field3377 = new Class590();
   private Class590 Field3378 = new Class590();
   protected static final float Field3379 = 0.003921569F;

   public void Method18(Class594 a) {
      this.Field3366 = a;
   }

   public Class594 Method19() {
      return this.Field3366;
   }

   public void Method56(float a) {
      this.Field3361 = a;
   }

   public float Method57() {
      return this.Field3361;
   }

   public void Method58(float a) {
      this.Field3362 = a;
   }

   public float Method59() {
      return this.Field3362;
   }

   public void Method1271(BufferedImage a) {
      this.Field3367 = a;
      this.Field3369 = a.getWidth();
      this.Field3370 = a.getHeight();
      this.Field3368 = this.Method104(a, 0, 0, this.Field3369, this.Field3370, (int[])null);
   }

   public BufferedImage Method1272() {
      return this.Field3367;
   }

   public void Method9(int a) {
      this.Field3365 = a;
   }

   public int Method10() {
      return this.Field3365;
   }

   protected void Method1777(Class600 a, int a) {
      a.Method113((float)(a >> 16 & 255) * 0.003921569F, (float)(a >> 8 & 255) * 0.003921569F, (float)(a & 255) * 0.003921569F, (float)(a >> 24 & 255) * 0.003921569F);
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int a = 0;
      Class193.Method1270();
      int[] a = new int[a * a];
      float a = Math.abs(6.0F * this.Field3361);
      boolean a = this.Field3361 < 0.0F;
      Class590 a = new Class590(0.0F, 0.0F, 0.0F);
      Class590 a = new Class590((float)a / 2.0F, (float)a / 2.0F, this.Field3363);
      Class590 a = new Class590();
      Class600 a = new Class600();
      Class594 a = this.Field3366;
      if (this.Field3365 != 0 && this.Field3365 != 1 && this.Field3365 != 2) {
         ;
      }

      if (this.Field3362 != 0.0F) {
         int a = a;
         int a = a;
         int[] a = a;
         if (this.Field3365 == 2 && this.Field3366 instanceof Class596) {
            Class596 a = (Class596)this.Field3366;
            a = a.Method12();
            a = a.Method14();
            a = a.Method86();
         }

         Kernel a = Class187.Method1294(this.Field3362);
         int[] a = new int[a * a];
         int[] a = new int[a * a];
         Class187.Method1293(a, a, a, a, a, true, false, false, Class183.Field1136);
         Class187.Method1293(a, a, a, a, a, true, false, false, Class183.Field1136);
         new Class596(a, a, a, 1, this.Field3365 == 1);
      }

      Class594 a = new Class596(a, a, a, 1, this.Field3365 == 1);
      Class590 a = new Class590();
      Class590 a = new Class590();
      Class590 a = new Class590();
      int a = 0;
      if (a < a) {
         float a = (float)a;
         a.Field2776 = (float)a;
         int a = 0;
         if (a < a) {
            float a = (float)a;
            int a;
            if (this.Field3365 != 3) {
               a = 0;
               a.Field2775 = a.Field2776 = a.Field2777 = 0.0F;
               float a = a * a.Method20(a, a);
               float a = a * a.Method20(a - 1.0F, a) - a;
               float a = a * a.Method20(a, a - 1.0F) - a;
               float a = a < a - 1 ? a * a.Method20(a + 1.0F, a) - a : -2.0F;
               float a = a < a - 1 ? a * a.Method20(a, a + 1.0F) - a : -2.0F;
               if (a != -2.0F && a != -2.0F) {
                  a.Field2775 = -1.0F;
                  a.Field2776 = 0.0F;
                  a.Field2777 = a;
                  a.Field2775 = 0.0F;
                  a.Field2776 = 1.0F;
                  a.Field2777 = a;
                  a.Method23(a, a);
                  a.Method25();
                  if ((double)a.Field2777 < 0.0) {
                     a.Field2777 = -a.Field2777;
                  }

                  a.Method323(a);
                  ++a;
               }

               if (a != -2.0F && a != -2.0F) {
                  a.Field2775 = -1.0F;
                  a.Field2776 = 0.0F;
                  a.Field2777 = a;
                  a.Field2775 = 0.0F;
                  a.Field2776 = -1.0F;
                  a.Field2777 = a;
                  a.Method23(a, a);
                  a.Method25();
                  if ((double)a.Field2777 < 0.0) {
                     a.Field2777 = -a.Field2777;
                  }

                  a.Method323(a);
                  ++a;
               }

               if (a != -2.0F && a != -2.0F) {
                  a.Field2775 = 0.0F;
                  a.Field2776 = -1.0F;
                  a.Field2777 = a;
                  a.Field2775 = 1.0F;
                  a.Field2776 = 0.0F;
                  a.Field2777 = a;
                  a.Method23(a, a);
                  a.Method25();
                  if ((double)a.Field2777 < 0.0) {
                     a.Field2777 = -a.Field2777;
                  }

                  a.Method323(a);
                  ++a;
               }

               if (a != -2.0F && a != -2.0F) {
                  a.Field2775 = 1.0F;
                  a.Field2776 = 0.0F;
                  a.Field2777 = a;
                  a.Field2775 = 0.0F;
                  a.Field2776 = 1.0F;
                  a.Field2777 = a;
                  a.Method23(a, a);
                  a.Method25();
                  if ((double)a.Field2777 < 0.0) {
                     a.Field2777 = -a.Field2777;
                  }

                  a.Method323(a);
                  ++a;
               }

               a.Field2775 /= (float)a;
               a.Field2776 /= (float)a;
               a.Field2777 /= (float)a;
            }

            a.Field2775 = -a.Field2775;
            a.Field2776 = -a.Field2776;
            a.Field2775 = (float)a;
            if (a.Field2777 >= 0.0F) {
               if (this.Field3367 != null) {
                  this.Field3378.Method316(a);
                  this.Field3378.Method325(a);
                  this.Field3378.Method25();
                  this.Field3377.Method316(a);
                  this.Field3377.Method25();
                  this.Field3377.Method322(2.0F * this.Field3377.Method22(this.Field3378));
                  this.Field3377.Method325(this.Field3372);
                  this.Field3377.Method25();
                  this.Method1777(a, this.Method1778(a, a, a, a));
                  a = a[a] & -16777216;
                  int a = (int)(a.Field2813 * 255.0F) << 16 | (int)(a.Field2814 * 255.0F) << 8 | (int)(a.Field2815 * 255.0F);
                  a[a++] = a | a;
               }

               a[a++] = 0;
            }

            a[a++] = 0;
            ++a;
         }

         ++a;
      }

      return a;
   }

   private int Method1778(Class590 a, int[] a1, int a2, int a3) {
      if (this.Field3367 != null) {
         float a = 0.5F * (1.0F + a.Field2775);
         float a = 0.5F * (1.0F + a.Field2776);
         a = Class776.Method1711(a * (float)this.Field3369, 0.0F, (float)(this.Field3369 - 1));
         a = Class776.Method1711(a * (float)this.Field3370, 0.0F, (float)(this.Field3370 - 1));
         int a = (int)a;
         int a = (int)a;
         float a = a - (float)a;
         float a = a - (float)a;
         int a = this.Field3369 * a + a;
         int a = a == this.Field3369 - 1 ? 0 : 1;
         int a = a == this.Field3370 - 1 ? 0 : this.Field3369;
         return Class776.Method1720(a, a, this.Field3368[a], this.Field3368[a + a], this.Field3368[a + a], this.Field3368[a + a + a]);
      } else {
         return 0;
      }
   }

   public String toString() {
      return "Stylize/Shade...";
   }
}
