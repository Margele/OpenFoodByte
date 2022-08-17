package awsl;

public class Class51 extends Class62 {
   private float Field588 = 1.0F;
   private float Field589 = 1.0F;

   protected float Method29(float a) {
      a *= this.Field588;
      a = (a - 0.5F) * this.Field589 + 0.5F;
      return a;
   }

   public void Method56(float a) {
      this.Field588 = a;
      this.Field633 = false;
   }

   public float Method57() {
      return this.Field588;
   }

   public void Method58(float a) {
      this.Field589 = a;
      this.Field633 = false;
   }

   public float Method59() {
      return this.Field589;
   }

   public String toString() {
      return "Colors/Contrast...";
   }
}
