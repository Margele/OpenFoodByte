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

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var6 = 0;
      Class193.Method1270();
      int[] var7 = new int[a * a];
      float var8 = Math.abs(6.0F * this.Field3697);
      boolean var9 = this.Field3697 < 0.0F;
      Class590 var10 = new Class590(0.0F, 0.0F, 0.0F);
      Class590 var11 = new Class590((float)a / 2.0F, (float)a / 2.0F, this.Field3700);
      Class590 var12 = new Class590();
      Class600 var13 = new Class600();
      Class600 var14 = new Class600(new Color(this.Field3701.Field3422));
      Class600 var15 = new Class600(new Color(this.Field3701.Field3423));
      Object var16 = this.Field3705;
      if (this.Field3704 != 0 && this.Field3704 != 1 && this.Field3704 != 2) {
         ;
      }

      if (this.Field3698 != 0.0F) {
         int var17 = a;
         int var18 = a;
         int[] var19 = a;
         if (this.Field3704 == 2 && this.Field3705 instanceof Class596) {
            Class596 var20 = (Class596)this.Field3705;
            var17 = var20.Method12();
            var18 = var20.Method14();
            var19 = var20.Method86();
         }

         int[] var39 = new int[var17 * var18];
         int[] var21 = new int[var17 * var18];
         Kernel var22 = Class187.Method1294(this.Field3698);
         Class187.Method1293(var22, var19, var39, var17, var18, true, false, false, Class187.Field1137);
         Class187.Method1293(var22, var39, var21, var18, var17, true, false, false, Class187.Field1137);
         var16 = new Class596(var21, var17, var18, 1, this.Field3704 == 1);
         if (this.Field3699 != 0) {
            var16 = new Class778(this, (Class594)var16);
         }
      }

      if (this.Field3704 != 2) {
         var16 = new Class596(a, a, a, 1, this.Field3704 == 1);
      }

      float var36 = this.Field3701.Field3428;
      float var37 = 1.0F - var36;
      Class590 var38 = new Class590();
      Class590 var40 = new Class590();
      Class590 var41 = new Class590();
      Class773[] var42 = new Class773[this.Field3702.size()];
      this.Field3702.copyInto(var42);
      int var23 = 0;
      if (var23 < var42.length) {
         var42[var23].Method17(a, a);
         ++var23;
      }

      float[][] var43 = new float[3][a];
      int var24 = 0;
      if (var24 < a) {
         var43[1][var24] = var8 * ((Class594)var16).Method20((float)var24, 0.0F);
         ++var24;
      }

      byte var44 = 0;
      if (var44 < a) {
         boolean var25 = true;
         boolean var26 = var44 < a - 1;
         var10.Field2776 = (float)var44;
         int var27 = 0;
         if (var27 < a) {
            var43[2][var27] = var8 * ((Class594)var16).Method20((float)var27, (float)(var44 + 1));
            ++var27;
         }

         byte var45 = 0;
         if (var45 < a) {
            boolean var28 = true;
            boolean var29 = var45 < a - 1;
            if (this.Field3704 != 3) {
               int var30 = 0;
               var12.Field2775 = var12.Field2776 = var12.Field2777 = 0.0F;
               float var31 = var43[1][var45];
               float var32 = var43[1][var45 - 1] - var31;
               float var33 = var43[0][var45] - var31;
               float var34 = var43[1][var45 + 1] - var31;
               float var35 = var43[2][var45] - var31;
               var38.Field2775 = -1.0F;
               var38.Field2776 = 0.0F;
               var38.Field2777 = var32;
               var40.Field2775 = 0.0F;
               var40.Field2776 = 1.0F;
               var40.Field2777 = var35;
               var41.Method23(var38, var40);
               var41.Method25();
               if ((double)var41.Field2777 < 0.0) {
                  var41.Field2777 = -var41.Field2777;
               }

               var12.Method323(var41);
               ++var30;
               var38.Field2775 = -1.0F;
               var38.Field2776 = 0.0F;
               var38.Field2777 = var32;
               var40.Field2775 = 0.0F;
               var40.Field2776 = -1.0F;
               var40.Field2777 = var33;
               var41.Method23(var38, var40);
               var41.Method25();
               if ((double)var41.Field2777 < 0.0) {
                  var41.Field2777 = -var41.Field2777;
               }

               var12.Method323(var41);
               ++var30;
               var38.Field2775 = 0.0F;
               var38.Field2776 = -1.0F;
               var38.Field2777 = var33;
               var40.Field2775 = 1.0F;
               var40.Field2776 = 0.0F;
               var40.Field2777 = var34;
               var41.Method23(var38, var40);
               var41.Method25();
               if ((double)var41.Field2777 < 0.0) {
                  var41.Field2777 = -var41.Field2777;
               }

               var12.Method323(var41);
               ++var30;
               var38.Field2775 = 1.0F;
               var38.Field2776 = 0.0F;
               var38.Field2777 = var34;
               var40.Field2775 = 0.0F;
               var40.Field2776 = 1.0F;
               var40.Field2777 = var35;
               var41.Method23(var38, var40);
               var41.Method25();
               if ((double)var41.Field2777 < 0.0) {
                  var41.Field2777 = -var41.Field2777;
               }

               var12.Method323(var41);
               ++var30;
               var12.Field2775 /= (float)var30;
               var12.Field2776 /= (float)var30;
               var12.Field2777 /= (float)var30;
            }

            var12.Field2775 = -var12.Field2775;
            var12.Field2776 = -var12.Field2776;
            var10.Field2775 = (float)var45;
            if (var12.Field2777 >= 0.0F) {
               if (this.Field3703 == 0) {
                  this.Method1777(var14, a[var6]);
               }

               this.Method1777(var14, this.Field3701.Field3422);
               if (var36 != 0.0F && this.Field3706 != null) {
                  this.Field3717.Method316(var11);
                  this.Field3717.Method325(var10);
                  this.Field3717.Method25();
                  this.Field3716.Method316(var12);
                  this.Field3716.Method25();
                  this.Field3716.Method322(2.0F * this.Field3716.Method22(this.Field3717));
                  this.Field3716.Method325(this.Field3711);
                  this.Field3716.Method25();
                  this.Method1777(var13, this.Method1778(this.Field3716, a, a, a));
                  var14.Field2813 = var36 * var13.Field2813 + var37 * var14.Field2813;
                  var14.Field2814 = var36 * var13.Field2814 + var37 * var14.Field2814;
                  var14.Field2815 = var36 * var13.Field2815 + var37 * var14.Field2815;
               }

               Class600 var48 = this.Method3777(var10, var11, var12, var14, var15, this.Field3701, var42);
               int var47 = a[var6] & -16777216;
               int var49 = (int)(var48.Field2813 * 255.0F) << 16 | (int)(var48.Field2814 * 255.0F) << 8 | (int)(var48.Field2815 * 255.0F);
               var7[var6++] = var47 | var49;
            }

            var7[var6++] = 0;
            var27 = var45 + 1;
         }

         float[] var46 = var43[0];
         var43[0] = var43[1];
         var43[1] = var43[2];
         var43[2] = var46;
         var24 = var44 + 1;
      }

      return var7;
   }

   protected Class600 Method3777(Class590 a, Class590 a, Class590 a, Class600 a, Class600 a, Class768 a, Class773[] a) {
      this.Field3713.Method115(a);
      this.Field3713.Method121(a.Field3424);

      for(int var8 = 0; var8 < a.length; ++var8) {
         Class773 var9 = a[var8];
         this.Field3712.Method316(a);
         this.Field3710.Method316(var9.Field3435);
         if (var9.Field3434 != 1) {
            this.Field3710.Method325(a);
         }

         this.Field3710.Method25();
         float var10 = this.Field3712.Method22(this.Field3710);
         if ((double)var10 >= 0.0) {
            float var11 = 0.0F;
            this.Field3711.Method316(a);
            this.Field3711.Method325(a);
            this.Field3711.Method25();
            if (var9.Field3434 == 3) {
               var11 = var9.Field3436.Method22(this.Field3710);
               if (var11 < var9.Field3446) {
                  continue;
               }
            }

            this.Field3712.Method322(2.0F * var10);
            this.Field3712.Method325(this.Field3710);
            float var12 = this.Field3712.Method22(this.Field3711);
            float var13;
            if ((double)var12 < 0.0) {
               var13 = 0.0F;
            } else {
               var13 = var12 / (a.Field3427 - a.Field3427 * var12 + var12);
            }

            if (var9.Field3434 == 3) {
               var11 = var9.Field3446 / var11;
               float var14 = var11 * var11;
               var14 *= var14;
               var14 *= var14;
               var14 = (float)Math.pow((double)var11, (double)(var9.Field3442 * 10.0F)) * (1.0F - var14);
               var13 *= var14;
               var10 *= var14;
            }

            this.Field3714.Method115(a);
            this.Field3714.Method121(a.Field3425);
            Class600 var10000 = this.Field3714;
            var10000.Field2813 *= var9.Field3437.Field2813 * var10;
            var10000 = this.Field3714;
            var10000.Field2814 *= var9.Field3437.Field2814 * var10;
            var10000 = this.Field3714;
            var10000.Field2815 *= var9.Field3437.Field2815 * var10;
            this.Field3715.Method115(a);
            this.Field3715.Method121(a.Field3426);
            var10000 = this.Field3715;
            var10000.Field2813 *= var9.Field3437.Field2813 * var13;
            var10000 = this.Field3715;
            var10000.Field2814 *= var9.Field3437.Field2814 * var13;
            var10000 = this.Field3715;
            var10000.Field2815 *= var9.Field3437.Field2815 * var13;
            this.Field3714.Method122(this.Field3715);
            this.Field3714.Method112(0.0F, 1.0F);
            this.Field3713.Method122(this.Field3714);
         }
      }

      this.Field3713.Method112(0.0F, 1.0F);
      return this.Field3713;
   }

   private int Method1778(Class590 a, int[] a, int a, int a) {
      if (this.Field3706 == null) {
         return 0;
      } else {
         float var5 = (float)Math.acos((double)(-a.Field2776));
         float var7 = var5 / 3.1415927F;
         float var6;
         if (var7 != 0.0F && var7 != 1.0F) {
            float var8 = a.Field2775 / (float)Math.sin((double)var5);
            if (var8 > 1.0F) {
               var8 = 1.0F;
            } else if (var8 < -1.0F) {
               var8 = -1.0F;
            }

            var6 = (float)Math.acos((double)var8) / 3.1415927F;
         } else {
            var6 = 0.0F;
         }

         var6 = Class776.Method1711(var6 * (float)this.Field3708, 0.0F, (float)(this.Field3708 - 1));
         var7 = Class776.Method1711(var7 * (float)this.Field3709, 0.0F, (float)(this.Field3709 - 1));
         int var15 = (int)var6;
         int var9 = (int)var7;
         float var10 = var6 - (float)var15;
         float var11 = var7 - (float)var9;
         int var12 = this.Field3708 * var9 + var15;
         int var13 = var15 == this.Field3708 - 1 ? 0 : 1;
         int var14 = var9 == this.Field3709 - 1 ? 0 : this.Field3708;
         return Class776.Method1720(var10, var11, this.Field3707[var12], this.Field3707[var12 + var13], this.Field3707[var12 + var14], this.Field3707[var12 + var13 + var14]);
      }
   }

   public String toString() {
      return "Stylize/Light Effects...";
   }

   static int Method3778(Class833 a) {
      return a.Field3699;
   }
}
