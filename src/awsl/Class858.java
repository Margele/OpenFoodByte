package awsl;

import java.awt.Rectangle;

public class Class858 extends Class798 {
   private float Field3752 = 5.0F;
   private float Field3753 = 1.0F;
   private float Field3754 = 0.0F;
   private int Field3755 = -16777216;

   public void Method56(float a) {
      this.Field3752 = a;
   }

   public float Method57() {
      return this.Field3752;
   }

   public void Method58(float a) {
      this.Field3753 = a;
   }

   public float Method59() {
      return this.Field3753;
   }

   public void Method60(float a) {
      this.Field3754 = a;
   }

   public float Method61() {
      return this.Field3754;
   }

   public void Method9(int a) {
      this.Field3755 = a;
   }

   public int Method10() {
      return this.Field3755;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      Class193.Method1270();
      int a = 0;
      short[][] a = new short[3][a];
      int[] a = new int[a * a];
      short[] a = new short[256];
      int a = (int)(this.Field3754 * 256.0F / this.Field3752);
      int a = 0;
      if (a < 256) {
         a[a] = (short)Class767.Method1687((int)(255.0 * Math.floor((double)(this.Field3752 * (float)(a + a) / 256.0F)) / (double)(this.Field3752 - 1.0F) - (double)a));
         ++a;
      }

      int a = 0;
      if (a < a) {
         int a = a[a];
         a[1][a] = (short)Class767.Method1689(a);
         a = a + 1;
      }

      a = 0;
      if (a < a) {
         boolean a = a < a - 1;
         int a = a + a;
         int a;
         if (a < a - 1) {
            a = 0;
            if (a < a) {
               int a = a[a++];
               a[2][a] = (short)Class767.Method1689(a);
               ++a;
            }
         }

         int a = 0;
         if (a < a) {
            boolean a = a < a - 1;
            int a = a - 1;
            int a = a + 1;
            int a = 0;
            short a = a[0][a];
            short a = a[0][a];
            short a = a[1][a];
            short a = a[1][a];
            short a = a[a];
            short a = a[a];
            short a = a[a];
            short a = a[a];
            if (a != a || a != a || a != a || a != a) {
               a = (int)(this.Field3753 * (float)(Math.abs(a - a) + Math.abs(a - a) + Math.abs(a - a) + Math.abs(a - a)));
               if (a > 255) {
                  a = 255;
               }
            }

            a[a] = Class767.Method1693(a[a], this.Field3755, 1, a);
            a[a] = a[a];
            ++a;
            a = a + 1;
         }

         short[] a = a[0];
         a[0] = a[1];
         a[1] = a[2];
         a[2] = a;
         a = a + 1;
      }

      return a;
   }

   public String toString() {
      return "Stylize/Contour...";
   }
}
