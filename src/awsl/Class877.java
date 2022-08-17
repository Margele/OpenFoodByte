package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public abstract class Class877 extends Class193 {
   public static final int Field3812 = 0;
   public static final int Field3813 = 1;
   public static final int Field3814 = 2;
   public static final int Field3815 = 3;
   public static final int Field3816 = 0;
   public static final int Field3817 = 1;
   protected int Field3818 = 3;
   protected int Field3819 = 1;
   protected Rectangle Field3820;
   protected Rectangle Field3821;

   public void Method9(int a) {
      this.Field3818 = a;
   }

   public int Method10() {
      return this.Field3818;
   }

   public void Method11(int a) {
      this.Field3819 = a;
   }

   public int Method12() {
      return this.Field3819;
   }

   protected abstract void Method3439(int integer1, int integer2, float[] arr);

   protected void Method834(Rectangle a) {
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      this.Field3821 = new Rectangle(0, 0, var4, var5);
      this.Field3820 = new Rectangle(0, 0, var4, var5);
      this.Method834(this.Field3820);
      ColorModel var8 = a.getColorModel();
      a = new BufferedImage(var8, var8.createCompatibleWritableRaster(this.Field3820.width, this.Field3820.height), var8.isAlphaPremultiplied(), (Hashtable)null);
      WritableRaster var32 = a.getRaster();
      int[] var9 = this.Method104(a, 0, 0, var4, var5, (int[])null);
      if (this.Field3819 == 0) {
         return this.Method3589(a, var4, var5, var9, this.Field3820);
      } else {
         int var12 = var4 - 1;
         int var13 = var5 - 1;
         int var14 = this.Field3820.width;
         int var15 = this.Field3820.height;
         boolean var18 = false;
         int[] var19 = new int[var14];
         int var16 = this.Field3820.x;
         int var17 = this.Field3820.y;
         float[] var20 = new float[2];
         int var21 = 0;
         if (var21 < var15) {
            int var22 = 0;
            if (var22 < var14) {
               this.Method3439(var16 + var22, var17 + var21, var20);
               int var23 = (int)Math.floor((double)var20[0]);
               int var24 = (int)Math.floor((double)var20[1]);
               float var25 = var20[0] - (float)var23;
               float var26 = var20[1] - (float)var24;
               if (var23 < var12 && var24 < var13) {
                  int var31 = var4 * var24 + var23;
                  int var10000 = var9[var31];
                  var10000 = var9[var31 + 1];
                  var10000 = var9[var31 + var4];
                  var10000 = var9[var31 + var4 + 1];
               }

               int var27 = this.Method3588(var9, var23, var24, var4, var5);
               int var28 = this.Method3588(var9, var23 + 1, var24, var4, var5);
               int var29 = this.Method3588(var9, var23, var24 + 1, var4, var5);
               int var30 = this.Method3588(var9, var23 + 1, var24 + 1, var4, var5);
               var19[var22] = Class776.Method1720(var25, var26, var27, var28, var29, var30);
               ++var22;
            }

            this.Method1267(a, 0, var21, this.Field3820.width, 1, var19);
            ++var21;
         }

         return a;
      }
   }

   private final int Method3588(int[] a, int a, int a, int a, int a) {
      if (a < a && a < a) {
         return a[a * a + a];
      } else {
         switch (this.Field3818) {
            case 0:
            default:
               return 0;
            case 1:
               return a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)];
            case 2:
               return a[Class776.Method1715(a, a) * a + Class776.Method1715(a, a)];
            case 3:
               return a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)] & 16777215;
         }
      }
   }

   protected BufferedImage Method3589(BufferedImage a, int a, int a, int[] a, Rectangle a) {
      int var6 = a;
      int var7 = a;
      int var8 = a.width;
      int var9 = a.height;
      int[] var14 = new int[var8];
      int var10 = a.x;
      int var11 = a.y;
      int[] var15 = new int[4];
      float[] var16 = new float[2];

      for(int var17 = 0; var17 < var9; ++var17) {
         for(int var18 = 0; var18 < var8; ++var18) {
            this.Method3439(var10 + var18, var11 + var17, var16);
            int var12 = (int)var16[0];
            int var13 = (int)var16[1];
            int var19;
            if (!(var16[0] < 0.0F) && var12 < var6 && !(var16[1] < 0.0F) && var13 < var7) {
               var19 = var6 * var13 + var12;
               var15[0] = a[var19];
               var14[var18] = a[var19];
            } else {
               switch (this.Field3818) {
                  case 0:
                  default:
                     var19 = 0;
                     break;
                  case 1:
                     var19 = a[Class776.Method1712(var13, 0, var7 - 1) * var6 + Class776.Method1712(var12, 0, var6 - 1)];
                     break;
                  case 2:
                     var19 = a[Class776.Method1715(var13, var7) * var6 + Class776.Method1715(var12, var6)];
                     break;
                  case 3:
                     var19 = a[Class776.Method1712(var13, 0, var7 - 1) * var6 + Class776.Method1712(var12, 0, var6 - 1)] & 16777215;
               }

               var14[var18] = var19;
            }
         }

         this.Method1267(a, 0, var17, a.width, 1, var14);
      }

      return a;
   }
}
