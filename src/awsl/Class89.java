package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class89 extends Class193 {
   private float Field763 = 1.0F;
   private int Field764 = 5;
   private float Field765 = 0.0F;
   private float Field766 = 0.1F;
   private boolean Field767 = false;
   private Class755 Field768 = new Class771(-1, -16777216);

   public void Method56(float a) {
      this.Field763 = a;
   }

   public float Method57() {
      return this.Field763;
   }

   public void Method58(float a) {
      this.Field766 = a;
   }

   public float Method59() {
      return this.Field766;
   }

   public void Method9(int a) {
      this.Field764 = a;
   }

   public int Method10() {
      return this.Field764;
   }

   public void Method60(float a) {
      this.Field765 = a;
   }

   public float Method61() {
      return this.Field765;
   }

   public void Method87(boolean a) {
      this.Field767 = a;
   }

   public boolean Method88() {
      return this.Field767;
   }

   public void Method176(Class755 a) {
      this.Field768 = a;
   }

   public Class755 Method177() {
      return this.Field768;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      Class193.Method1270();
      int a = a.getHeight();
      int[] a = new int[a];
      int a = (int)((float)this.Field764 / 1.414F);
      int[] a = new int[this.Field764 + 1];
      int[] a = new int[a + 1];
      int a;
      int a;
      int a;
      int a;
      if (this.Field768 != null) {
         int a = 0;
         if (a <= this.Field764) {
            a = this.Field768.Method283((float)a / (float)this.Field764);
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            a = a & -16777216 | (int)(this.Field766 * (float)a) << 16 | (int)(this.Field766 * (float)a) << 8 | (int)(this.Field766 * (float)a);
            a[a] = a;
            ++a;
         }

         int a = 0;
         if (a <= a) {
            a = this.Field768.Method283((float)a / (float)a);
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            a = a & -16777216 | (int)(this.Field766 * (float)a) << 16 | (int)(this.Field766 * (float)a) << 8 | (int)(this.Field766 * (float)a);
            a[a] = a;
            a = a + 1;
         }
      }

      BufferedImage a = new BufferedImage(a, a, 2);
      a = (int)(this.Field763 * 3.0F * 255.0F);
      int a = 0;
      int a;
      int a;
      int a;
      int a;
      int a;
      byte a;
      if (a < a) {
         this.Method104(a, 0, a, a, 1, a);
         a = 0;
         if (a < a) {
            a = a[a];
            a = a & -16777216;
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            a = a + a + a;
            if (a < a) {
               a[a] = -16777216;
            }

            a /= 3;
            a[a] = a | a << 16 | a << 8 | a;
            a = a + 1;
         }

         this.Method1267(a, 0, a, a, 1, a);
         a = a + 1;
      }

      if (this.Field765 != 0.0F) {
         a = (new Class187(this.Field765)).Method62(a, (BufferedImage)null);
      }

      a = this.Method1263(a, (ColorModel)null);
      int[] a;
      if (this.Field767) {
         a = new int[a * a];
      } else {
         a = this.Method104(a, 0, 0, a, a, (int[])null);
      }

      a = 0;
      if (a < a) {
         a = a * a;
         this.Method104(a, 0, a, a, 1, a);
         a = Math.max(a - this.Field764, 0) - a;
         a = Math.min(a + this.Field764, a - 1) - a;
         a = Math.max(a - a, 0) - a;
         a = Math.min(a + a, a - 1) - a;
         int a = 0;
         if (a < a) {
            if ((float)(a[a] & 255) > this.Field763 * 255.0F) {
               int a = Math.max(a - this.Field764, 0) - a;
               int a = Math.min(a + this.Field764, a - 1) - a;
               int a = Math.max(a - a, 0) - a;
               int a = Math.min(a + a, a - 1) - a;
               int a = 0;
               int a = 0;
               if (a <= a) {
                  a[a + a] = Class767.Method1691(a[a + a], a[a], 4);
                  ++a;
                  ++a;
               }

               int a = -1;
               int a = 1;
               if (a >= a) {
                  a[a + a] = Class767.Method1691(a[a + a], a[a], 4);
                  a = a - 1;
                  a = a + 1;
               }

               a = 1;
               a = a + a;
               int a = 0;
               int var10000;
               if (a <= a) {
                  a[a] = Class767.Method1691(a[a], a[a], 4);
                  a = a + 1;
                  var10000 = a + a;
                  ++a;
               }

               int a = -1;
               a = a - a;
               int a = 0;
               if (a >= a) {
                  a[a] = Class767.Method1691(a[a], a[a], 4);
                  a = a - 1;
                  var10000 = a - a;
                  a = a + 1;
               }

               Math.max(a, a);
               Math.min(a, a);
               a = Math.min(a, a);
               int a = 1;
               int a = a + a + 1;
               int a = 0;
               if (a <= a) {
                  a[a] = Class767.Method1691(a[a], a[a], 4);
                  ++a;
                  var10000 = a + a + 1;
                  ++a;
               }

               a = Math.min(-a, -a);
               int a = 1;
               a = a - a - 1;
               int a = 0;
               if (a <= a) {
                  a[a] = Class767.Method1691(a[a], a[a], 4);
                  a = a + 1;
                  var10000 = a - (a + 1);
                  a = a + 1;
               }

               a = Math.min(a, -a);
               a = 1;
               a = a - a + 1;
               a = 0;
               if (a <= a) {
                  a[a] = Class767.Method1691(a[a], a[a], 4);
                  a = a + 1;
                  var10000 = a + -a + 1;
                  a = a + 1;
               }

               a = Math.min(-a, a);
               a = 1;
               a = a + a - 1;
               a = 0;
               if (a <= a) {
                  a[a] = Class767.Method1691(a[a], a[a], 4);
                  a = a + 1;
                  var10000 = a + (a - 1);
                  a = a + 1;
               }
            }

            ++a;
            a = a + 1;
         }

         a = a + 1;
      }

      this.Method1267(a, 0, 0, a, a, a);
      return a;
   }

   public String toString() {
      return "Effects/Glint...";
   }
}
