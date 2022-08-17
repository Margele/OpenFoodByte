package awsl;

public class Class313 extends Class321 {
   public Class313(int a, double a) {
      super(a, a);
   }

   public Class313(int a, double a, Class661 a) {
      super(a, a, a);
   }

   protected double Method797(double a) {
      double var3 = a / (double)this.Field1605;
      return var3 < 0.5 ? 2.0 * Math.pow(var3, 2.0) : 1.0 - Math.pow(-2.0 * var3 + 2.0, 2.0) / 2.0;
   }
}
