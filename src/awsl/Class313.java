package awsl;

public class Class313 extends Class321 {
   public Class313(int a, double a) {
      super(a, a);
   }

   public Class313(int a, double a, Class661 a) {
      super(a, a, a);
   }

   protected double Method797(double a) {
      double a = a / (double)this.Field1605;
      return a < 0.5 ? 2.0 * Math.pow(a, 2.0) : 1.0 - Math.pow(-2.0 * a + 2.0, 2.0) / 2.0;
   }
}
