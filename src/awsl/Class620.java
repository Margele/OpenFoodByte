package awsl;

public class Class620 extends Class619 {
   private float Field2875 = 1.0F;

   public Class620(Class594 a) {
      super(a);
   }

   public float Method20(float a, float a) {
      float var4 = 0.0F;
      Class598.Method86();
      float var5 = 1.0F;
      if (var5 <= this.Field2875) {
         var4 += this.Field2874.Method20(var5 * a, var5 * a) / var5;
         var5 *= 2.0F;
      }

      return var4;
   }
}
