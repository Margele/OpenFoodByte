package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class866 extends Class877 {
   private float Field3778 = 0.0F;
   private float Field3779 = 0.0F;
   private float Field3780;
   private float Field3781;
   private float Field3782;

   public Class866() {
      this.Method9(0);
   }

   public void Method56(float a) {
      this.Field3779 = a;
   }

   public float Method57() {
      return this.Field3779;
   }

   public void Method58(float a) {
      this.Field3778 = a;
   }

   public float Method59() {
      return this.Field3778;
   }

   public void Method60(float a) {
      this.Field3782 = a;
   }

   public float Method61() {
      return this.Field3782;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      this.Field3780 = (float)a.getWidth();
      Class193.Method1269();
      this.Field3781 = (float)a.getHeight();
      int a = a.getType();
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
         float[] a = new float[4];
         int a = 0;
         if (a < a) {
            int a = 0;
            if (a < a) {
               this.Method3439(a + a, a + a, a);
               int a = (int)Math.floor((double)a[0]);
               int a = (int)Math.floor((double)a[1]);
               float a = a[0] - (float)a;
               float a = a[1] - (float)a;
               int a;
               if (a < a && a < a) {
                  a = a * a + a;
                  int var10000 = a[a];
                  var10000 = a[a + 1];
                  var10000 = a[a + a];
                  var10000 = a[a + a + 1];
               }

               int a = this.Method3495(a, a, a, a, a);
               int a = this.Method3495(a, a + 1, a, a, a);
               int a = this.Method3495(a, a, a + 1, a, a);
               int a = this.Method3495(a, a + 1, a + 1, a, a);
               a = Class776.Method1720(a, a, a, a, a, a);
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               float a = a[2];
               a = (int)((float)a * a);
               a = (int)((float)a * a);
               a = (int)((float)a * a);
               a = a & -16777216 | a << 16 | a << 8 | a;
               if (a[3] != 0.0F) {
                  a[a] = Class767.Method1691(a, a[a * a + a], 1);
               }

               a[a] = a;
               ++a;
            }

            this.Method1267(a, 0, a, this.Field3820.width, 1, a);
            ++a;
         }

         return a;
      }
   }

   private final int Method3495(int[] a, int a, int a, int a, int a) {
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
         }
      }
   }

   protected void Method3439(int a, int a, float[] a) {
      float a = this.Field3779;
      float a = (float)a;
      float a = (float)a;
      float a = (float)Math.sin((double)this.Field3778);
      float a = (float)Math.cos((double)this.Field3778);
      float var10000 = a * this.Field3780;
      float a = a * (float)Math.sqrt((double)(this.Field3780 * this.Field3780 + this.Field3781 * this.Field3781));
      float a = a < 0.0F ? this.Field3780 : 0.0F;
      float a = a < 0.0F ? this.Field3781 : 0.0F;
      a -= a;
      a -= a;
      float a = a * a + a * a;
      float a = -a * a + a * a;
      boolean a = a < a;
      boolean a = a > a * 2.0F;
      boolean var16 = true;
      a = a > a * 2.0F ? a : 2.0F * a - a;
      a = a * a - a * a;
      a = a * a + a * a;
      a += a;
      a += a;
      boolean var19;
      if (!(a < 0.0F) && !(a < 0.0F) && !(a >= this.Field3780) && !(a >= this.Field3781)) {
         var19 = false;
      } else {
         var19 = true;
      }

      a = (float)a;
      a = (float)a;
      float a = 1.9F * (1.0F - (float)Math.cos(Math.exp((double)((a - a) / this.Field3782))));
      a[2] = 1.0F - a;
      a[0] = a[1] = -1.0F;
      a[3] = 1.0F;
   }

   public String toString() {
      return "Distort/Curl...";
   }
}
