package awsl;

public class Class812 extends Class877 {
   private float Field3628 = 32.0F;
   private float Field3629 = 1.0F;
   private float Field3630 = 0.0F;
   private float Field3631 = 1.0F;
   private float Field3632 = 1.0F;
   private float Field3633 = 0.0F;
   private float Field3634 = 1.0F;
   private float Field3635 = 0.0F;
   private float Field3636 = 0.0F;
   private float Field3637 = 1.0F;

   public void Method56(float a) {
      this.Field3631 = a;
   }

   public float Method57() {
      return this.Field3631;
   }

   public void Method58(float a) {
      this.Field3628 = a;
   }

   public float Method59() {
      return this.Field3628;
   }

   public void Method60(float a) {
      this.Field3629 = a;
   }

   public float Method61() {
      return this.Field3629;
   }

   public void Method164(float a) {
      this.Field3630 = a;
      float var2 = (float)Math.cos((double)a);
      float var3 = (float)Math.sin((double)a);
      this.Field3634 = var2;
      this.Field3635 = var3;
      this.Field3636 = -var3;
      this.Field3637 = var2;
   }

   public float Method165() {
      return this.Field3630;
   }

   public void Method166(float a) {
      this.Field3632 = a;
   }

   public float Method167() {
      return this.Field3632;
   }

   public void Method168(float a) {
      this.Field3633 = a;
   }

   public float Method169() {
      return this.Field3633;
   }

   protected void Method3439(int a, int a, float[] a) {
      float var5 = this.Field3634 * (float)a + this.Field3635 * (float)a;
      float var6 = this.Field3636 * (float)a + this.Field3637 * (float)a;
      var5 /= this.Field3628;
      Class193.Method1269();
      var6 /= this.Field3628 * this.Field3629;
      if (this.Field3632 == 1.0F) {
         a[0] = (float)a + this.Field3631 * Class598.Method158(var5 + 0.5F, var6, this.Field3633);
         a[1] = (float)a + this.Field3631 * Class598.Method158(var5, var6 + 0.5F, this.Field3633);
      }

      a[0] = (float)a + this.Field3631 * Class598.Method154(var5 + 0.5F, var6, this.Field3632, this.Field3633);
      a[1] = (float)a + this.Field3631 * Class598.Method154(var5, var6 + 0.5F, this.Field3632, this.Field3633);
   }

   public String toString() {
      return "Distort/Swim...";
   }
}
