package awsl;

import obfuscate.a;

public class Class312 extends Class321 {
   float Field1599;
   float Field1600;
   boolean Field1601;

   public Class312(int a, double a, float a, float a, boolean a) {
      super(a, a);
      this.Field1599 = a;
      this.Field1600 = a;
      this.Field1601 = a;
   }

   public Class312(int a, double a, float a, float a, boolean a, Class661 a) {
      super(a, a, a);
      this.Field1599 = a;
      this.Field1600 = a;
      this.Field1601 = a;
   }

   protected double Method797(double a) {
      Class314.Method833();
      double a = Math.pow(a / (double)this.Field1605, (double)this.Field1600);
      double a = (double)(this.Field1599 * 0.1F);
      double var10000 = Math.pow(2.0, -10.0 * (this.Field1601 ? Math.sqrt(a) : a)) * Math.sin((a - a / 4.0) * (6.283185307179586 / a)) + 1.0;
      a.trash(new String[2]);
      return var10000;
   }
}
