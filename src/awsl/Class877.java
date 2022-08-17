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
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      this.Field3821 = new Rectangle(0, 0, a, a);
      this.Field3820 = new Rectangle(0, 0, a, a);
      this.Method834(this.Field3820);
      ColorModel a = a.getColorModel();
      a = new BufferedImage(a, a.createCompatibleWritableRaster(this.Field3820.width, this.Field3820.height), a.isAlphaPremultiplied(), (Hashtable)null);
      WritableRaster a = a.getRaster();
      int[] a = this.Method104(a, 0, 0, a, a, (int[])null);
      if (this.Field3819 == 0) {
         return this.Method3589(a, a, a, a, this.Field3820);
      } else {
         int a = a - 1;
         int a = a - 1;
         int a = this.Field3820.width;
         int a = this.Field3820.height;
         int a = false;
         int[] a = new int[a];
         int a = this.Field3820.x;
         int a = this.Field3820.y;
         float[] a = new float[2];
         int a = 0;
         if (a < a) {
            int a = 0;
            if (a < a) {
               this.Method3439(a + a, a + a, a);
               int a = (int)Math.floor((double)a[0]);
               int a = (int)Math.floor((double)a[1]);
               float a = a[0] - (float)a;
               float a = a[1] - (float)a;
               if (a < a && a < a) {
                  int a = a * a + a;
                  int var10000 = a[a];
                  var10000 = a[a + 1];
                  var10000 = a[a + a];
                  var10000 = a[a + a + 1];
               }

               int a = this.Method3588(a, a, a, a, a);
               int a = this.Method3588(a, a + 1, a, a, a);
               int a = this.Method3588(a, a, a + 1, a, a);
               int a = this.Method3588(a, a + 1, a + 1, a, a);
               a[a] = Class776.Method1720(a, a, a, a, a, a);
               ++a;
            }

            this.Method1267(a, 0, a, this.Field3820.width, 1, a);
            ++a;
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
      int a = a;
      int a = a;
      int a = a.width;
      int a = a.height;
      int[] a = new int[a];
      int a = a.x;
      int a = a.y;
      int[] a = new int[4];
      float[] a = new float[2];

      for(int a = 0; a < a; ++a) {
         for(int a = 0; a < a; ++a) {
            this.Method3439(a + a, a + a, a);
            int a = (int)a[0];
            int a = (int)a[1];
            int a;
            if (!(a[0] < 0.0F) && a < a && !(a[1] < 0.0F) && a < a) {
               a = a * a + a;
               a[0] = a[a];
               a[a] = a[a];
            } else {
               switch (this.Field3818) {
                  case 0:
                  default:
                     a = 0;
                     break;
                  case 1:
                     a = a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)];
                     break;
                  case 2:
                     a = a[Class776.Method1715(a, a) * a + Class776.Method1715(a, a)];
                     break;
                  case 3:
                     a = a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)] & 16777215;
               }

               a[a] = a;
            }
         }

         this.Method1267(a, 0, a, a.width, 1, a);
      }

      return a;
   }
}
