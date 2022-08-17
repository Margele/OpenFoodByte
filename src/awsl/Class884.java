package awsl;

import java.awt.Rectangle;

public class Class884 extends Class877 {
   private float Field3859 = 0.0F;
   private float Field3860 = 0.0F;
   private float Field3861 = 0.0F;
   private float Field3862 = 0.0F;
   private float Field3863 = 0.0F;
   private float Field3864 = 0.0F;
   private boolean Field3865 = true;

   public void Method87(boolean a) {
      this.Field3865 = a;
   }

   public boolean Method88() {
      return this.Field3865;
   }

   public void Method56(float a) {
      this.Field3859 = a;
      this.Method89();
   }

   public float Method57() {
      return this.Field3859;
   }

   public void Method58(float a) {
      this.Field3860 = a;
      this.Method89();
   }

   public float Method59() {
      return this.Field3860;
   }

   private void Method89() {
      this.Field3861 = (float)Math.sin((double)this.Field3859);
      this.Field3862 = (float)Math.sin((double)this.Field3860);
   }

   protected void Method834(Rectangle a) {
      float a = (float)Math.tan((double)this.Field3859);
      this.Field3863 = (float)(-a.height) * a;
      if ((double)a < 0.0) {
         a = -a;
      }

      a.width = (int)((float)a.height * a + (float)a.width + 0.999999F);
      a = (float)Math.tan((double)this.Field3860);
      this.Field3864 = (float)(-a.width) * a;
      if ((double)a < 0.0) {
         a = -a;
      }

      a.height = (int)((float)a.width * a + (float)a.height + 0.999999F);
   }

   protected void Method3439(int a, int a, float[] a) {
      a[0] = (float)a + this.Field3863 + (float)a * this.Field3861;
      a[1] = (float)a + this.Field3864 + (float)a * this.Field3862;
   }

   public String toString() {
      return "Distort/Shear...";
   }
}
