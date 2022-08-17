package awsl;

class Class60 extends Class62 {
   final Class830 Field626;

   Class60(Class830 a) {
      this.Field626 = a;
   }

   protected float Method29(float a) {
      a += Class830.Method3649(this.Field626) * (float)Math.sin((double)(a * 2.0F) * Math.PI);
      return 1.0F - (float)Math.exp((double)(-a * Class830.Method3650(this.Field626)));
   }
}
