package awsl;

public class Class787 extends Class781 {
   private float Field3542 = 0.4F;
   private boolean Field3543 = false;
   private int Field3544 = -16777216;

   public Class787() {
      this.Method56(16.0F);
      this.Method868(0.0F);
   }

   public void Method927(float a) {
      this.Field3542 = a;
   }

   public float Method928() {
      return this.Field3542;
   }

   public void Method87(boolean a) {
      this.Field3543 = a;
   }

   public boolean Method88() {
      return this.Field3543;
   }

   public void Method11(int a) {
      this.Field3544 = a;
   }

   public int Method12() {
      return this.Field3544;
   }

   public int Method877(int a, int a, int[] a, int a, int a) {
      float var7 = this.Field3497 * (float)a + this.Field3498 * (float)a;
      Class193.Method1270();
      float var8 = this.Field3499 * (float)a + this.Field3500 * (float)a;
      var7 /= this.Field3484;
      var8 /= this.Field3484 * this.Field3485;
      var7 += 1000.0F;
      var8 += 1000.0F;
      this.Method20(var7, var8);
      float var10 = this.Field3501[0].Field3278;
      float var11 = this.Field3501[1].Field3278;
      int var12 = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
      int var13 = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
      int var14 = a[var13 * a + var12];
      float var9 = (var11 - var10) / this.Field3542;
      var9 = Class776.Method1708(0.0F, this.Field3542, var9);
      if (this.Field3543) {
         var12 = Class776.Method1712((int)((this.Field3501[1].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
         var13 = Class776.Method1712((int)((this.Field3501[1].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
         int var15 = a[var13 * a + var12];
         var15 = Class776.Method1719(0.5F, var15, var14);
         var14 = Class776.Method1719(var9, var15, var14);
      }

      var14 = Class776.Method1719(var9, this.Field3544, var14);
      return var14;
   }

   public String toString() {
      return "Pixellate/Crystallize...";
   }
}
