package awsl;

import java.awt.Rectangle;

public class Class849 extends Class798 {
   private int[][] Field3741;
   private float Field3742 = 0.0F;
   private float Field3743 = 1.0F;
   private float Field3744 = 0.0F;
   private float Field3745 = 1.0F;

   public void Method56(float a) {
      this.Field3742 = a;
   }

   public float Method57() {
      return this.Field3742;
   }

   public void Method58(float a) {
      this.Field3743 = a;
   }

   public float Method59() {
      return this.Field3743;
   }

   public void Method60(float a) {
      this.Field3744 = a;
   }

   public float Method61() {
      return this.Field3744;
   }

   public void Method164(float a) {
      this.Field3745 = a;
   }

   public float Method165() {
      return this.Field3745;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      Class193.Method1269();
      Class745 a = new Class745(a, a, a, 0, a);
      int a;
      if (a.Method1545() > 0) {
         float a = 255.0F / (float)a.Method1545();
         this.Field3741 = new int[3][256];
         float a = this.Field3742 * 255.0F;
         float a = this.Field3743 * 255.0F;
         if (a == a) {
            ++a;
         }

         a = 0;
         if (a < 3) {
            int a = 0;
            if (a < 256) {
               this.Field3741[a][a] = Class767.Method1687((int)(255.0F * (this.Field3744 + (this.Field3745 - this.Field3744) * ((float)a - a) / (a - a))));
               ++a;
            }

            ++a;
         }
      }

      this.Field3741 = (int[][])null;
      int a = 0;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            a[a] = this.Method3(a, a, a[a]);
            a = a + 1;
            ++a;
         }

         ++a;
      }

      this.Field3741 = (int[][])null;
      return a;
   }

   public int Method3(int a, int a1, int a) {
      if (this.Field3741 != null) {
         int a = a & -16777216;
         int a = this.Field3741[0][a >> 16 & 255];
         int a = this.Field3741[1][a >> 8 & 255];
         int a = this.Field3741[2][a & 255];
         return a | a << 16 | a << 8 | a;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Colors/Levels...";
   }
}
