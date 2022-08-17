package awsl;

public class Class585 implements Class594 {
   private float Field2754 = 10.0F;

   public void Method56(float a) {
      this.Field2754 = a;
   }

   public float Method57() {
      return this.Field2754;
   }

   public float Method20(float a, float a) {
      float a = Class598.Method157(a + 0.5F, a) * this.Field2754;
      float a = Class598.Method157(a, a + 0.5F) * this.Field2754;
      return Class598.Method157(a + a, a + a);
   }
}
