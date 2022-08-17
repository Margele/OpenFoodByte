package awsl;

import java.awt.image.BufferedImage;

public class Class869 extends Class877 {
   private float[] Field3799;
   private float[] Field3800;
   private float Field3801 = 4.0F;

   public Class869() {
      this.Method9(1);
   }

   public void Method56(float a) {
      this.Field3801 = a;
   }

   public float Method57() {
      return this.Field3801;
   }

   protected void Method3439(int a, int a, float[] a) {
      int var4 = (int)(Math.random() * 255.0);
      float var5 = (float)Math.random();
      a[0] = (float)a + var5 * this.Field3799[var4];
      a[1] = (float)a + var5 * this.Field3800[var4];
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3799 = new float[256];
      this.Field3800 = new float[256];
      Class193.Method1269();
      int var4 = 0;
      if (var4 < 256) {
         float var5 = 6.2831855F * (float)var4 / 256.0F;
         this.Field3799[var4] = (float)((double)this.Field3801 * Math.sin((double)var5));
         this.Field3800[var4] = (float)((double)this.Field3801 * Math.cos((double)var5));
         ++var4;
      }

      return super.Method62(a, a);
   }

   public String toString() {
      return "Distort/Diffuse...";
   }
}
