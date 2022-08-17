package awsl;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.util.Vector;

public class Class833 extends Class798 {
   public static final int Field3691 = 0;
   public static final int Field3692 = 1;
   public static final int Field3693 = 0;
   public static final int Field3694 = 1;
   public static final int Field3695 = 2;
   public static final int Field3696 = 3;
   private float Field3697;
   private float Field3698;
   private int Field3699;
   private float Field3700 = 10000.0F;
   Class768 Field3701;
   private Vector Field3702 = new Vector();
   private int Field3703 = 0;
   private int Field3704 = 0;
   private Class594 Field3705;
   private Image Field3706;
   private int[] Field3707;
   private int Field3708 = 1;
   private int Field3709 = 1;
   private Class590 Field3710;
   private Class590 Field3711;
   private Class590 Field3712;
   private Class600 Field3713;
   private Class600 Field3714;
   private Class600 Field3715;
   private Class590 Field3716;
   private Class590 Field3717;
   protected static final float Field3718 = 0.003921569F;
   public static final int Field3719 = 0;
   public static final int Field3720 = 1;
   public static final int Field3721 = 2;
   public static final int Field3722 = 3;

   public Class833() {
      this.Method3774(new Class775(this));
      this.Field3697 = 1.0F;
      this.Field3698 = 5.0F;
      this.Field3699 = 0;
      this.Field3701 = new Class768();
      this.Field3710 = new Class590();
      this.Field3711 = new Class590();
      this.Field3712 = new Class590();
      this.Field3713 = new Class600();
      this.Field3714 = new Class600();
      this.Field3715 = new Class600();
      this.Field3716 = new Class590();
      this.Field3717 = new Class590();
   }

   public void Method3771(Class768 a) {
      this.Field3701 = a;
   }

   public Class768 Method3772() {
      return this.Field3701;
   }

   public void Method18(Class594 a) {
      this.Field3705 = a;
   }

   public Class594 Method19() {
      return this.Field3705;
   }

   public void Method56(float a) {
      this.Field3697 = a;
   }

   public float Method57() {
      return this.Field3697;
   }

   public void Method58(float a) {
      this.Field3698 = a;
   }

   public float Method59() {
      return this.Field3698;
   }

   public void Method9(int a) {
      this.Field3699 = a;
   }

   public int Method10() {
      return this.Field3699;
   }

   public void Method60(float a) {
      this.Field3700 = a;
   }

   public float Method61() {
      return this.Field3700;
   }

   public void Method1271(BufferedImage a) {
      this.Field3706 = a;
      this.Field3708 = a.getWidth();
      this.Field3709 = a.getHeight();
      this.Field3707 = this.Method104(a, 0, 0, this.Field3708, this.Field3709, (int[])null);
   }

   public Image Method3773() {
      return this.Field3706;
   }

   public void Method11(int a) {
      this.Field3703 = a;
   }

   public int Method12() {
      return this.Field3703;
   }

   public void Method13(int a) {
      this.Field3704 = a;
   }

   public int Method14() {
      return this.Field3704;
   }

   public void Method15(int a) {
      this.Field3701.Field3422 = a;
   }

   public int Method16() {
      return this.Field3701.Field3422;
   }

   public void Method3774(Class773 a) {
      this.Field3702.addElement(a);
   }

   public void Method3775(Class773 a) {
      this.Field3702.removeElement(a);
   }

   public Vector Method3776() {
      return this.Field3702;
   }

   protected void Method1777(Class600 a, int a) {
      a.Method113((float)(a >> 16 & 255) * 0.003921569F, (float)(a >> 8 & 255) * 0.003921569F, (float)(a & 255) * 0.003921569F, (float)(a >> 24 & 255) * 0.003921569F);
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int a = 0;
      Class193.Method1270();
      int[] a = new int[a * a];
      float a = Math.abs(6.0F * this.Field3697);
      boolean a = this.Field3697 < 0.0F;
      Class590 a = new Class590(0.0F, 0.0F, 0.0F);
      Class590 a = new Class590((float)a / 2.0F, (float)a / 2.0F, this.Field3700);
      Class590 a = new Class590();
      Class600 a = new Class600();
      Class600 a = new Class600(new Color(this.Field3701.Field3422));
      Class600 a = new Class600(new Color(this.Field3701.Field3423));
      Class594 a = this.Field3705;
      if (this.Field3704 != 0 && this.Field3704 != 1 && this.Field3704 != 2) {
         ;
      }

      if (this.Field3698 != 0.0F) {
         int a = a;
         int a = a;
         int[] a = a;
         if (this.Field3704 == 2 && this.Field3705 instanceof Class596) {
            Class596 a = (Class596)this.Field3705;
            a = a.Method12();
            a = a.Method14();
            a = a.Method86();
         }

         int[] a = new int[a * a];
         int[] a = new int[a * a];
         Kernel a = Class187.Method1294(this.Field3698);
         Class187.Method1293(a, a, a, a, a, true, false, false, Class187.Field1137);
         Class187.Method1293(a, a, a, a, a, true, false, false, Class187.Field1137);
         a = new Class596(a, a, a, 1, this.Field3704 == 1);
         if (this.Field3699 != 0) {
            a = new Class778(this, (Class594)a);
         }
      }

      if (this.Field3704 != 2) {
         a = new Class596(a, a, a, 1, this.Field3704 == 1);
      }

      float a = this.Field3701.Field3428;
      float a = 1.0F - a;
      Class590 a = new Class590();
      Class590 a = new Class590();
      Class590 a = new Class590();
      Class773[] a = new Class773[this.Field3702.size()];
      this.Field3702.copyInto(a);
      int a = 0;
      if (a < a.length) {
         a[a].Method17(a, a);
         ++a;
      }

      float[][] a = new float[3][a];
      int a = 0;
      if (a < a) {
         a[1][a] = a * ((Class594)a).Method20((float)a, 0.0F);
         ++a;
      }

      int a = 0;
      if (a < a) {
         boolean var25 = true;
         boolean a = a < a - 1;
         a.Field2776 = (float)a;
         int a = 0;
         if (a < a) {
            a[2][a] = a * ((Class594)a).Method20((float)a, (float)(a + 1));
            ++a;
         }

         int a = 0;
         if (a < a) {
            boolean var28 = true;
            boolean a = a < a - 1;
            if (this.Field3704 != 3) {
               int a = 0;
               a.Field2775 = a.Field2776 = a.Field2777 = 0.0F;
               float a = a[1][a];
               float a = a[1][a - 1] - a;
               float a = a[0][a] - a;
               float a = a[1][a + 1] - a;
               float a = a[2][a] - a;
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
               a.Field2775 /= (float)a;
               a.Field2776 /= (float)a;
               a.Field2777 /= (float)a;
            }

            a.Field2775 = -a.Field2775;
            a.Field2776 = -a.Field2776;
            a.Field2775 = (float)a;
            if (a.Field2777 >= 0.0F) {
               if (this.Field3703 == 0) {
                  this.Method1777(a, a[a]);
               }

               this.Method1777(a, this.Field3701.Field3422);
               if (a != 0.0F && this.Field3706 != null) {
                  this.Field3717.Method316(a);
                  this.Field3717.Method325(a);
                  this.Field3717.Method25();
                  this.Field3716.Method316(a);
                  this.Field3716.Method25();
                  this.Field3716.Method322(2.0F * this.Field3716.Method22(this.Field3717));
                  this.Field3716.Method325(this.Field3711);
                  this.Field3716.Method25();
                  this.Method1777(a, this.Method1778(this.Field3716, a, a, a));
                  a.Field2813 = a * a.Field2813 + a * a.Field2813;
                  a.Field2814 = a * a.Field2814 + a * a.Field2814;
                  a.Field2815 = a * a.Field2815 + a * a.Field2815;
               }

               Class600 a = this.Method3777(a, a, a, a, a, this.Field3701, a);
               int a = a[a] & -16777216;
               int a = (int)(a.Field2813 * 255.0F) << 16 | (int)(a.Field2814 * 255.0F) << 8 | (int)(a.Field2815 * 255.0F);
               a[a++] = a | a;
            }

            a[a++] = 0;
            a = a + 1;
         }

         float[] a = a[0];
         a[0] = a[1];
         a[1] = a[2];
         a[2] = a;
         a = a + 1;
      }

      return a;
   }

   protected Class600 Method3777(Class590 a, Class590 a, Class590 a, Class600 a, Class600 a, Class768 a, Class773[] a) {
      this.Field3713.Method115(a);
      this.Field3713.Method121(a.Field3424);

      for(int a = 0; a < a.length; ++a) {
         Class773 a = a[a];
         this.Field3712.Method316(a);
         this.Field3710.Method316(a.Field3435);
         if (a.Field3434 != 1) {
            this.Field3710.Method325(a);
         }

         this.Field3710.Method25();
         float a = this.Field3712.Method22(this.Field3710);
         if ((double)a >= 0.0) {
            float a = 0.0F;
            this.Field3711.Method316(a);
            this.Field3711.Method325(a);
            this.Field3711.Method25();
            if (a.Field3434 == 3) {
               a = a.Field3436.Method22(this.Field3710);
               if (a < a.Field3446) {
                  continue;
               }
            }

            this.Field3712.Method322(2.0F * a);
            this.Field3712.Method325(this.Field3710);
            float a = this.Field3712.Method22(this.Field3711);
            float a;
            if ((double)a < 0.0) {
               a = 0.0F;
            } else {
               a = a / (a.Field3427 - a.Field3427 * a + a);
            }

            if (a.Field3434 == 3) {
               a = a.Field3446 / a;
               float a = a * a;
               a *= a;
               a *= a;
               a = (float)Math.pow((double)a, (double)(a.Field3442 * 10.0F)) * (1.0F - a);
               a *= a;
               a *= a;
            }

            this.Field3714.Method115(a);
            this.Field3714.Method121(a.Field3425);
            Class600 var10000 = this.Field3714;
            var10000.Field2813 *= a.Field3437.Field2813 * a;
            var10000 = this.Field3714;
            var10000.Field2814 *= a.Field3437.Field2814 * a;
            var10000 = this.Field3714;
            var10000.Field2815 *= a.Field3437.Field2815 * a;
            this.Field3715.Method115(a);
            this.Field3715.Method121(a.Field3426);
            var10000 = this.Field3715;
            var10000.Field2813 *= a.Field3437.Field2813 * a;
            var10000 = this.Field3715;
            var10000.Field2814 *= a.Field3437.Field2814 * a;
            var10000 = this.Field3715;
            var10000.Field2815 *= a.Field3437.Field2815 * a;
            this.Field3714.Method122(this.Field3715);
            this.Field3714.Method112(0.0F, 1.0F);
            this.Field3713.Method122(this.Field3714);
         }
      }

      this.Field3713.Method112(0.0F, 1.0F);
      return this.Field3713;
   }

   private int Method1778(Class590 a, int[] a1, int a2, int a3) {
      if (this.Field3706 == null) {
         return 0;
      } else {
         float a = (float)Math.acos((double)(-a.Field2776));
         float a = a / 3.1415927F;
         float a;
         if (a != 0.0F && a != 1.0F) {
            float a = a.Field2775 / (float)Math.sin((double)a);
            if (a > 1.0F) {
               a = 1.0F;
            } else if (a < -1.0F) {
               a = -1.0F;
            }

            a = (float)Math.acos((double)a) / 3.1415927F;
         } else {
            a = 0.0F;
         }

         a = Class776.Method1711(a * (float)this.Field3708, 0.0F, (float)(this.Field3708 - 1));
         a = Class776.Method1711(a * (float)this.Field3709, 0.0F, (float)(this.Field3709 - 1));
         int a = (int)a;
         int a = (int)a;
         float a = a - (float)a;
         float a = a - (float)a;
         int a = this.Field3708 * a + a;
         int a = a == this.Field3708 - 1 ? 0 : 1;
         int a = a == this.Field3709 - 1 ? 0 : this.Field3708;
         return Class776.Method1720(a, a, this.Field3707[a], this.Field3707[a + a], this.Field3707[a + a], this.Field3707[a + a + a]);
      }
   }

   public String toString() {
      return "Stylize/Light Effects...";
   }

   static int Method3778(Class833 a) {
      return a.Field3699;
   }
}
