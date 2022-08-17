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
      float a = this.Field3497 * (float)a + this.Field3498 * (float)a;
      Class193.Method1270();
      float a = this.Field3499 * (float)a + this.Field3500 * (float)a;
      a /= this.Field3484;
      a /= this.Field3484 * this.Field3485;
      a += 1000.0F;
      a += 1000.0F;
      this.Method20(a, a);
      float a = this.Field3501[0].Field3278;
      float a = this.Field3501[1].Field3278;
      int a = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
      int a = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
      int a = a[a * a + a];
      float a = (a - a) / this.Field3542;
      a = Class776.Method1708(0.0F, this.Field3542, a);
      if (this.Field3543) {
         a = Class776.Method1712((int)((this.Field3501[1].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
         a = Class776.Method1712((int)((this.Field3501[1].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
         int a = a[a * a + a];
         a = Class776.Method1719(0.5F, a, a);
         a = Class776.Method1719(a, a, a);
      }

      a = Class776.Method1719(a, this.Field3544, a);
      return a;
   }

   public String toString() {
      return "Pixellate/Crystallize...";
   }
}
