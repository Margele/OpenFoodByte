package awsl;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class827 extends Class798 {
   public float Field3668 = 1.0F;
   private float Field3669 = 0.0F;
   private Class755 Field3670 = new Class771();
   private Random Field3671 = new Random();
   private long Field3672 = 567L;
   private boolean Field3673 = false;
   private boolean Field3674 = false;

   public void Method56(float a) {
      this.Field3668 = a;
   }

   public float Method57() {
      return this.Field3668;
   }

   public void Method58(float a) {
      this.Field3669 = a;
   }

   public float Method59() {
      return this.Field3669;
   }

   public void Method176(Class755 a) {
      this.Field3670 = a;
   }

   public Class755 Method177() {
      return this.Field3670;
   }

   public void Method87(boolean a) {
      this.Field3673 = a;
   }

   public boolean Method88() {
      return this.Field3673;
   }

   public void Method1282(boolean a) {
      this.Field3674 = a;
   }

   public boolean Method1283() {
      return this.Field3674;
   }

   public void Method9(int a) {
      this.Field3672 = (long)a;
   }

   public int Method10() {
      return (int)this.Field3672;
   }

   public void Method89() {
      this.Field3672 = (new Date()).getTime();
   }

   private int Method1772(int[] a, int a, int a) {
      if (this.Field3674) {
         return a[a * this.Field3569.width + a];
      } else {
         int a = (int)(255.0F * this.Field3671.nextFloat());
         int a = (int)(255.0F * this.Field3671.nextFloat());
         int a = (int)(255.0F * this.Field3671.nextFloat());
         return -16777216 | a << 16 | a << 8 | a;
      }
   }

   private int Method900(int a, float a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = Class767.Method1687(a + (int)((double)a * ((double)this.Field3671.nextFloat() - 0.5)));
      a = Class767.Method1687(a + (int)((double)a * ((double)this.Field3671.nextFloat() - 0.5)));
      a = Class767.Method1687(a + (int)((double)a * ((double)this.Field3671.nextFloat() - 0.5)));
      return -16777216 | a << 16 | a << 8 | a;
   }

   private int Method1614(int a, int a) {
      return Class767.Method1691(a, a, 13);
   }

   private int Method3633(int a, int a, int[] a, int a) {
      return a[a * a + a];
   }

   private void Method3634(int a, int a, int a, int[] a, int a) {
      a[a * a + a] = a;
   }

   private boolean Method3635(int a, int a, int a, int a, int[] a, int a, int a6, int a) {
      int a = this.Method3633(a, a, a, a);
      int a = this.Method3633(a, a, a, a);
      int a = this.Method3633(a, a, a, a);
      int a = this.Method3633(a, a, a, a);
      float a = 256.0F / (2.0F * (float)a) * this.Field3668;
      int a = (a + a) / 2;
      int a = (a + a) / 2;
      if (a == a && a == a && a == a && a == a) {
         return true;
      } else {
         if (a != a || a != a) {
            int a = this.Method1614(a, a);
            a = this.Method900(a, a);
            this.Method3634(a, a, a, a, a);
            if (a != a) {
               int a = this.Method1614(a, a);
               a = this.Method900(a, a);
               this.Method3634(a, a, a, a, a);
            }
         }

         if (a != a || a != a) {
            if (a != a || a != a) {
               int a = this.Method1614(a, a);
               a = this.Method900(a, a);
               this.Method3634(a, a, a, a, a);
            }

            if (a != a) {
               int a = this.Method1614(a, a);
               a = this.Method900(a, a);
               this.Method3634(a, a, a, a, a);
            }
         }

         if (a != a || a != a) {
            int a = this.Method1614(a, a);
            int a = this.Method1614(a, a);
            a = this.Method1614(a, a);
            a = this.Method900(a, a);
            this.Method3634(a, a, a, a, a);
         }

         return a - a >= 3 || a - a >= 3;
      }
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int[] a = new int[a * a];
      Class193.Method1269();
      this.Field3671.setSeed(this.Field3672);
      int a = a - 1;
      int a = a - 1;
      this.Method3634(0, 0, this.Method1772(a, 0, 0), a, a);
      this.Method3634(a, 0, this.Method1772(a, a, 0), a, a);
      this.Method3634(0, a, this.Method1772(a, 0, a), a, a);
      this.Method3634(a, a, this.Method1772(a, a, a), a, a);
      this.Method3634(a / 2, a / 2, this.Method1772(a, a / 2, a / 2), a, a);
      this.Method3634(0, a / 2, this.Method1772(a, 0, a / 2), a, a);
      this.Method3634(a, a / 2, this.Method1772(a, a, a / 2), a, a);
      this.Method3634(a / 2, 0, this.Method1772(a, a / 2, 0), a, a);
      this.Method3634(a / 2, a, this.Method1772(a, a / 2, a), a, a);
      int a = 1;
      if (this.Method3635(0, 0, a - 1, a - 1, a, a, a, 0)) {
         ++a;
      }

      if (this.Field3673 && this.Field3670 != null) {
         int a = 0;
         int a = 0;
         if (a < a) {
            int a = 0;
            if (a < a) {
               a[a] = this.Field3670.Method283((float)(a[a] & 255) / 255.0F);
               ++a;
               ++a;
            }

            ++a;
         }
      }

      return a;
   }

   public String toString() {
      return "Texture/Plasma...";
   }
}
