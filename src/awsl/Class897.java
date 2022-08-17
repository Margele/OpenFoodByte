package awsl;

import java.awt.image.BufferedImage;

public class Class897 extends Class877 {
   private float[] Field3976;
   private float[] Field3977;
   private float Field3978 = 4.0F;
   private float Field3979 = 4.0F;
   private float Field3980 = 1.0F;
   private float Field3981 = 1.0F;

   public Class897() {
      this.Method9(1);
   }

   public void Method56(float a) {
      this.Field3978 = a;
   }

   public float Method57() {
      return this.Field3978;
   }

   public void Method58(float a) {
      this.Field3979 = a;
   }

   public float Method59() {
      return this.Field3979;
   }

   public void Method60(float a) {
      this.Field3980 = a;
   }

   public float Method61() {
      return this.Field3980;
   }

   public void Method164(float a) {
      this.Field3981 = a;
   }

   public float Method165() {
      return this.Field3981;
   }

   private void Method89() {
      Class193.Method1269();
      this.Field3976 = new float[256];
      this.Field3977 = new float[256];
      int a = 0;
      if (a < 256) {
         float a = 6.2831855F * (float)a / 256.0F * this.Field3981;
         this.Field3976[a] = (float)((double)(-this.Field3979) * Math.sin((double)a));
         this.Field3977[a] = (float)((double)this.Field3979 * Math.cos((double)a));
         ++a;
      }

   }

   private int Method1614(int a, int a) {
      return Class767.Method1687((int)(127.0F * (1.0F + Class598.Method157((float)a / this.Field3978, (float)a / this.Field3978))));
   }

   protected void Method3439(int a, int a, float[] a) {
      int a = this.Method1614(a, a);
      a[0] = (float)a + this.Field3976[a];
      a[1] = (float)a + this.Field3977[a];
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Method89();
      return super.Method62(a, a);
   }

   public String toString() {
      return "Distort/Marble...";
   }
}
