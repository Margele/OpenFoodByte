package awsl;

import java.awt.image.BufferedImage;

public class Class889 extends Class877 {
   private int Field3891;
   private int Field3892;
   private int Field3893;
   private int Field3894;
   private boolean Field3895;

   public Class889() {
      this(0, 0, true);
   }

   public Class889(int a, int a, boolean a) {
      this.Field3893 = a;
      this.Field3894 = a;
      this.Field3895 = a;
      this.Method9(0);
   }

   public void Method13(int a) {
      this.Field3893 = a;
   }

   public int Method14() {
      return this.Field3893;
   }

   public void Method15(int a) {
      this.Field3894 = a;
   }

   public int Method16() {
      return this.Field3894;
   }

   public void Method87(boolean a) {
      this.Field3895 = a;
   }

   public boolean Method88() {
      return this.Field3895;
   }

   protected void Method3439(int a, int a, float[] a) {
      boolean var4 = Class193.Method1269();
      if (this.Field3895) {
         a[0] = (float)((a + this.Field3891 - this.Field3893) % this.Field3891);
         a[1] = (float)((a + this.Field3892 - this.Field3894) % this.Field3892);
      }

      a[0] = (float)(a - this.Field3893);
      a[1] = (float)(a - this.Field3894);
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      this.Field3891 = a.getWidth();
      this.Field3892 = a.getHeight();
      if (this.Field3895) {
         if (this.Field3893 < 0) {
            this.Field3893 += this.Field3891;
         }

         if (this.Field3894 < 0) {
            this.Field3894 += this.Field3892;
         }

         this.Field3893 %= this.Field3891;
         this.Field3894 %= this.Field3892;
      }

      return super.Method62(a, a);
   }

   public String toString() {
      return "Distort/Offset...";
   }
}
