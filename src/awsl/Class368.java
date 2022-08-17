package awsl;

public class Class368 {
   public double Field1733;
   public double Field1734;
   public double Field1735;

   Class368(double a, double a, double a) {
      this.Field1733 = a;
      this.Field1734 = a;
      this.Field1735 = a;
   }

   public Class368 Method657(Class368 a) {
      return new Class368(this.Field1733 + a.Field1733, this.Field1734 + a.Field1734, this.Field1735 + a.Field1735);
   }

   public Class368 Method658(double a, double a, double a) {
      return new Class368(this.Field1733 + a, this.Field1734 + a, this.Field1735 + a);
   }

   Class368 Method659(Class368 a) {
      return new Class368(this.Field1733 - a.Field1733, this.Field1734 - a.Field1734, this.Field1735 - a.Field1735);
   }

   public Class368 Method660(double a, double a, double a) {
      return new Class368(this.Field1733 - a, this.Field1734 - a, this.Field1735 - a);
   }

   Class368 Method661() {
      double var1 = Math.sqrt(this.Field1733 * this.Field1733 + this.Field1734 * this.Field1734 + this.Field1735 * this.Field1735);
      return new Class368(this.Field1733 / var1, this.Field1734 / var1, this.Field1735 / var1);
   }

   double Method662(Class368 a) {
      return this.Field1733 * a.Field1733 + this.Field1734 * a.Field1734 + this.Field1735 * a.Field1735;
   }

   Class368 Method663(Class368 a) {
      return new Class368(this.Field1734 * a.Field1735 - this.Field1735 * a.Field1734, this.Field1735 * a.Field1733 - this.Field1733 * a.Field1735, this.Field1733 * a.Field1734 - this.Field1734 * a.Field1733);
   }

   Class368 Method664(double a) {
      return new Class368(this.Field1733 * a, this.Field1734 * a, this.Field1735 * a);
   }

   public Class368 Method665(double a) {
      return new Class368(this.Field1733 / a, this.Field1734 / a, this.Field1735 / a);
   }

   public double Method666() {
      return Math.sqrt(this.Field1733 * this.Field1733 + this.Field1734 * this.Field1734 + this.Field1735 * this.Field1735);
   }

   void Method667(Class368 a) {
      this.Field1733 += a.Field1733;
      this.Field1734 += a.Field1734;
      this.Field1735 += a.Field1735;
   }

   public Class368 Method668(double a, double a, double a) {
      this.Field1733 += a;
      this.Field1734 += a;
      this.Field1735 += a;
      return this;
   }

   public Class368 Method669(Class368 a) {
      this.Field1733 -= a.Field1733;
      this.Field1734 -= a.Field1734;
      this.Field1735 -= a.Field1735;
      return this;
   }

   public Class368 Method670(double a, double a, double a) {
      this.Field1733 -= a;
      this.Field1734 -= a;
      this.Field1735 -= a;
      return this;
   }

   Class368 Method671() {
      double var1 = Math.sqrt(this.Field1733 * this.Field1733 + this.Field1734 * this.Field1734 + this.Field1735 * this.Field1735);
      this.Field1733 /= var1;
      this.Field1734 /= var1;
      this.Field1735 /= var1;
      return this;
   }

   public Class368 Method672(Class368 a) {
      this.Field1733 = this.Field1734 * a.Field1735 - this.Field1735 * a.Field1734;
      this.Field1734 = this.Field1735 * a.Field1733 - this.Field1733 * a.Field1735;
      this.Field1735 = this.Field1733 * a.Field1734 - this.Field1734 * a.Field1733;
      return this;
   }

   public Class368 Method673(double a) {
      this.Field1733 *= a;
      this.Field1734 *= a;
      this.Field1735 *= a;
      return this;
   }

   public Class368 Method674(double a) {
      this.Field1733 /= a;
      this.Field1734 /= a;
      this.Field1735 /= a;
      return this;
   }

   public String Method675() {
      return "(X: " + this.Field1733 + " Y: " + this.Field1734 + " Z: " + this.Field1735 + ")";
   }
}
