package awsl;

import java.awt.Rectangle;

public class Class846 extends Class798 {
   private static final float Field3734 = 255.9F;
   private float Field3735 = 2.3561945F;
   private float Field3736 = 0.5235988F;
   private boolean Field3737 = false;
   private float Field3738 = 3.0F;

   public void Method56(float a) {
      this.Field3735 = a;
   }

   public float Method57() {
      return this.Field3735;
   }

   public void Method58(float a) {
      this.Field3736 = a;
   }

   public float Method59() {
      return this.Field3736;
   }

   public void Method60(float a) {
      this.Field3738 = 3.0F * a;
   }

   public float Method61() {
      return this.Field3738 / 3.0F;
   }

   public void Method87(boolean a) {
      this.Field3737 = a;
   }

   public boolean Method88() {
      return this.Field3737;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int a = 0;
      int[] a = new int[a * a];
      Class193.Method1269();
      int[] a = new int[a * a];
      int a = 0;
      if (a < a.length) {
         a[a] = Class767.Method1689(a[a]);
         ++a;
      }

      int a = (int)(Math.cos((double)this.Field3735) * Math.cos((double)this.Field3736) * 255.89999389648438);
      int a = (int)(Math.sin((double)this.Field3735) * Math.cos((double)this.Field3736) * 255.89999389648438);
      int a = (int)(Math.sin((double)this.Field3736) * 255.89999389648438);
      int a = (int)(1530.0F / this.Field3738);
      int a = a * a;
      int a = a * a;
      int a = 0;
      int a = 0;
      if (a < a) {
         int a = a + a;
         int a = a + a;
         int a = 0;
         if (a < a) {
            if (a < a - 2 && a < a - 2) {
               a = a[a - 1] + a[a - 1] + a[a - 1] - a[a + 1] - a[a + 1] - a[a + 1];
               int a = a[a - 1] + a[a] + a[a + 1] - a[a - 1] - a[a] - a[a + 1];
               int a;
               if ((a = a * a + a * a + a) < 0) {
                  int a = false;
               }

               int a = (int)((double)a / Math.sqrt((double)(a * a + a * a + a)));
            }

            if (this.Field3737) {
               int a = a[a];
               int a = a & -16777216;
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               a = a * a >> 8;
               a = a * a >> 8;
               a = a * a >> 8;
               a[a++] = a | a << 16 | a << 8 | a;
            }

            a[a++] = -16777216 | a << 16 | a << 8 | a;
            ++a;
            int var24 = a + 1;
            ++a;
            ++a;
         }

         ++a;
         int var10000 = a + a;
      }

      return a;
   }

   public String toString() {
      return "Stylize/Emboss...";
   }
}
