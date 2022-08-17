package awsl;

public class Class55 extends Class62 {
   private float Field605 = 1.0F;

   protected float Method29(float a) {
      return 1.0F - (float)Math.exp((double)(-a * this.Field605));
   }

   public void Method56(float a) {
      this.Field605 = a;
      this.Field633 = false;
   }

   public float Method57() {
      return this.Field605;
   }

   public String toString() {
      return "Colors/Exposure...";
   }
}
