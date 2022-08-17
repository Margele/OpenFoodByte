package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class186 extends Class193 {
   private float Field1146 = 2.0F;
   private float Field1147 = (float)Math.toRadians(108.0);
   private float Field1148 = (float)Math.toRadians(162.0);
   private float Field1149 = (float)Math.toRadians(90.0);

   public void Method56(float a) {
      this.Field1146 = a;
   }

   public float Method57() {
      return this.Field1146;
   }

   public float Method59() {
      return this.Field1147;
   }

   public void Method58(float a) {
      this.Field1147 = a;
   }

   public float Method61() {
      return this.Field1148;
   }

   public void Method60(float a) {
      this.Field1148 = a;
   }

   public float Method165() {
      return this.Field1149;
   }

   public void Method164(float a) {
      this.Field1149 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      Class193.Method1269();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      float a = 2.0F * this.Field1146 * 1.414F;
      float[] a = new float[]{this.Field1147, this.Field1148, this.Field1149};
      float[] a = new float[]{0.0F, -1.0F, 1.0F, 0.0F, 0.0F};
      float[] a = new float[]{0.0F, 0.0F, 0.0F, -1.0F, 1.0F};
      float a = a / 2.0F;
      int[] a = new int[a];
      int[] a = this.Method104(a, 0, 0, a, a, (int[])null);
      int a = 0;
      if (a < a) {
         int a = 0;
         int a = a * a;
         if (a < a) {
            a[a] = a[a] & -16777216 | 16777215;
            ++a;
            ++a;
         }

         int a = 0;
         if (a < 3) {
            a = 16 - 8 * a;
            int a = 255 << a;
            float a = a[a];
            float a = (float)Math.sin((double)a);
            float a = (float)Math.cos((double)a);
            int a = 0;
            if (a < a) {
               float a = (float)a * a + (float)a * a;
               float a = (float)(-a) * a + (float)a * a;
               a = a - Class776.Method1714(a - a, a) + a;
               a = a - Class776.Method1714(a - a, a) + a;
               float a = 1.0F;
               int a = 0;
               if (a < 5) {
                  float a = a + a[a] * a;
                  float a = a + a[a] * a;
                  float a = a * a - a * a;
                  float a = a * a + a * a;
                  int a = Class776.Method1712((int)a, 0, a - 1);
                  int a = Class776.Method1712((int)a, 0, a - 1);
                  int a = a[a * a + a];
                  int a = a >> a & 255;
                  float a = (float)a / 255.0F;
                  a = 1.0F - a * a;
                  a = (float)((double)a * (double)a * 1.414);
                  float a = (float)a - a;
                  float a = (float)a - a;
                  float a = a * a;
                  float a = a * a;
                  float a = (float)Math.sqrt((double)(a + a));
                  float a = 1.0F - Class776.Method1708(a, a + 1.0F, a);
                  a = Math.min(a, a);
                  ++a;
               }

               a = (int)(255.0F * a);
               a <<= a;
               a ^= ~a;
               a |= -16777216;
               a[a] &= a;
               ++a;
            }

            a = a + 1;
         }

         this.Method1267(a, 0, a, a, 1, a);
         ++a;
      }

      return a;
   }

   public String toString() {
      return "Pixellate/Color Halftone...";
   }
}
