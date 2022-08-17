package awsl;

public class Class785 extends Class781 {
   private float Field3536 = 0.4F;
   private boolean Field3537 = false;
   private int Field3538 = -16777216;
   private float Field3539 = 0.1F;

   public Class785() {
      this.Method56(16.0F);
      this.Method868(0.0F);
   }

   public void Method927(float a) {
      this.Field3536 = a;
   }

   public float Method928() {
      return this.Field3536;
   }

   public void Method87(boolean a) {
      this.Field3537 = a;
   }

   public boolean Method88() {
      return this.Field3537;
   }

   public void Method11(int a) {
      this.Field3538 = a;
   }

   public int Method12() {
      return this.Field3538;
   }

   public void Method929(float a) {
      this.Field3539 = a;
   }

   public float Method930() {
      return this.Field3539;
   }

   public int Method877(int a, int a, int[] a, int a, int a) {
      float var7 = this.Field3497 * (float)a + this.Field3498 * (float)a;
      float var8 = this.Field3499 * (float)a + this.Field3500 * (float)a;
      var7 /= this.Field3484;
      var8 /= this.Field3484 * this.Field3485;
      var7 += 1000.0F;
      var8 += 1000.0F;
      Class193.Method1270();
      this.Method20(var7, var8);
      float var10 = this.Field3501[0].Field3278;
      int var11 = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
      int var12 = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
      int var13 = a[var12 * a + var11];
      if (this.Field3537) {
         float var14 = this.Field3501[1].Field3278;
         var11 = Class776.Method1712((int)((this.Field3501[1].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
         var12 = Class776.Method1712((int)((this.Field3501[1].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
         int var15 = a[var12 * a + var11];
         var13 = Class776.Method1719(0.5F * var10 / var14, var13, var15);
      }

      float var9 = 1.0F - Class776.Method1708(this.Field3536, this.Field3536 + this.Field3539, var10);
      var13 = Class776.Method1719(var9, this.Field3538, var13);
      return var13;
   }

   public String toString() {
      return "Pixellate/Pointillize...";
   }
}
