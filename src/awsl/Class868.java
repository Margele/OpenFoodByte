package awsl;

import java.awt.image.BufferedImage;

public class Class868 extends Class877 {
   private float Field3793 = 1.0F;
   private BufferedImage Field3794 = null;
   private int[] Field3795;
   private int[] Field3796;
   private int Field3797;
   private int Field3798;

   public void Method1271(BufferedImage a) {
      this.Field3794 = a;
   }

   public BufferedImage Method1272() {
      return this.Field3794;
   }

   public void Method56(float a) {
      this.Field3793 = a;
   }

   public float Method57() {
      return this.Field3793;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      BufferedImage a = this.Field3794 != null ? this.Field3794 : a;
      this.Field3797 = a.getWidth();
      this.Field3798 = a.getHeight();
      int[] a = new int[this.Field3797 * this.Field3798];
      this.Method104(a, 0, 0, this.Field3797, this.Field3798, a);
      this.Field3795 = new int[this.Field3797 * this.Field3798];
      this.Field3796 = new int[this.Field3797 * this.Field3798];
      int a = 0;
      int a = 0;
      int a;
      int a;
      int a;
      int a;
      int a;
      if (a < this.Field3798) {
         a = 0;
         if (a < this.Field3797) {
            a = a[a];
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            a[a] = (a + a + a) / 8;
            ++a;
            ++a;
         }

         ++a;
      }

      int a = 0;
      int a = 0;
      if (a < this.Field3798) {
         a = (a + this.Field3798 - 1) % this.Field3798 * this.Field3797;
         a = a * this.Field3797;
         a = (a + 1) % this.Field3798 * this.Field3797;
         int a = 0;
         if (a < this.Field3797) {
            a = (a + this.Field3797 - 1) % this.Field3797;
            int a = (a + 1) % this.Field3797;
            this.Field3795[a] = a[a + a] + a[a + a] + a[a + a] - a[a + a] - a[a + a] - a[a + a];
            this.Field3796[a] = a[a + a] + a[a + a] + a[a + a] - a[a + a] - a[a + a] - a[a + a];
            a = a + 1;
            a = a + 1;
         }

         a = a + 1;
      }

      int[] a = null;
      a = super.Method62(a, a);
      this.Field3795 = this.Field3796 = null;
      return a;
   }

   protected void Method3439(int a, int a, float[] a) {
      float a = (float)a;
      float a = (float)a;
      int a = a % this.Field3798 * this.Field3797 + a % this.Field3797;
      a[0] = (float)a + this.Field3793 * (float)this.Field3795[a];
      a[1] = (float)a + this.Field3793 * (float)this.Field3796[a];
   }

   public String toString() {
      return "Distort/Displace...";
   }
}
