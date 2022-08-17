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
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      BufferedImage var6 = this.Field3794 != null ? this.Field3794 : a;
      this.Field3797 = var6.getWidth();
      this.Field3798 = var6.getHeight();
      int[] var7 = new int[this.Field3797 * this.Field3798];
      this.Method104(var6, 0, 0, this.Field3797, this.Field3798, var7);
      this.Field3795 = new int[this.Field3797 * this.Field3798];
      this.Field3796 = new int[this.Field3797 * this.Field3798];
      int var8 = 0;
      int var9 = 0;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      if (var9 < this.Field3798) {
         var10 = 0;
         if (var10 < this.Field3797) {
            var11 = var7[var8];
            var12 = var11 >> 16 & 255;
            var13 = var11 >> 8 & 255;
            var14 = var11 & 255;
            var7[var8] = (var12 + var13 + var14) / 8;
            ++var8;
            ++var10;
         }

         ++var9;
      }

      byte var18 = 0;
      byte var19 = 0;
      if (var19 < this.Field3798) {
         var10 = (var19 + this.Field3798 - 1) % this.Field3798 * this.Field3797;
         var11 = var19 * this.Field3797;
         var12 = (var19 + 1) % this.Field3798 * this.Field3797;
         byte var20 = 0;
         if (var20 < this.Field3797) {
            var14 = (var20 + this.Field3797 - 1) % this.Field3797;
            int var16 = (var20 + 1) % this.Field3797;
            this.Field3795[var18] = var7[var14 + var10] + var7[var14 + var11] + var7[var14 + var12] - var7[var16 + var10] - var7[var16 + var11] - var7[var16 + var12];
            this.Field3796[var18] = var7[var14 + var12] + var7[var20 + var12] + var7[var16 + var12] - var7[var14 + var10] - var7[var20 + var10] - var7[var16 + var10];
            var8 = var18 + 1;
            var13 = var20 + 1;
         }

         var9 = var19 + 1;
      }

      Object var17 = null;
      a = super.Method62(a, a);
      this.Field3795 = this.Field3796 = null;
      return a;
   }

   protected void Method3439(int a, int a, float[] a) {
      float var6 = (float)a;
      float var7 = (float)a;
      int var8 = a % this.Field3798 * this.Field3797 + a % this.Field3797;
      a[0] = (float)a + this.Field3793 * (float)this.Field3795[var8];
      a[1] = (float)a + this.Field3793 * (float)this.Field3796[var8];
   }

   public String toString() {
      return "Distort/Displace...";
   }
}
