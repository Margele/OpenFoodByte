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
      float a = this.Field3497 * (float)a + this.Field3498 * (float)a;
      float a = this.Field3499 * (float)a + this.Field3500 * (float)a;
      a /= this.Field3484;
      a /= this.Field3484 * this.Field3485;
      a += 1000.0F;
      a += 1000.0F;
      Class193.Method1270();
      this.Method20(a, a);
      float a = this.Field3501[0].Field3278;
      int a = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
      int a = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
      int a = a[a * a + a];
      if (this.Field3537) {
         float a = this.Field3501[1].Field3278;
         a = Class776.Method1712((int)((this.Field3501[1].Field3272 - 1000.0F) * this.Field3484), 0, a - 1);
         a = Class776.Method1712((int)((this.Field3501[1].Field3273 - 1000.0F) * this.Field3484), 0, a - 1);
         int a = a[a * a + a];
         a = Class776.Method1719(0.5F * a / a, a, a);
      }

      float a = 1.0F - Class776.Method1708(this.Field3536, this.Field3536 + this.Field3539, a);
      a = Class776.Method1719(a, this.Field3538, a);
      return a;
   }

   public String toString() {
      return "Pixellate/Pointillize...";
   }
}
