package awsl;

public class Class622 extends Class619 {
   private float Field2876;

   public Class622(Class594 a, float a) {
      super(a);
      this.Field2876 = a;
   }

   public void Method56(float a) {
      this.Field2876 = a;
   }

   public float Method57() {
      return this.Field2876;
   }

   public float Method20(float a, float a) {
      Class598.Method86();
      float var4 = 0.0F;
      float var5 = 1.0F;
      if (var5 <= this.Field2876) {
         var4 += Math.abs(this.Field2874.Method20(var5 * a, var5 * a)) / var5;
         var5 *= 2.0F;
      }

      return var4;
   }
}
