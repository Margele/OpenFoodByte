package awsl;

public class Class366 {
   Class368 Field1730 = new Class368(0.0, 0.0, 0.0);
   Class368 Field1731 = new Class368(0.0, 0.0, 0.0);

   Class366(double a, double a, double a, double a, double a, double a) {
      this.Field1730.Field1733 = a;
      this.Field1730.Field1734 = a;
      this.Field1730.Field1735 = a;
      this.Field1731.Field1733 = a;
      this.Field1731.Field1734 = a;
      this.Field1731.Field1735 = a;
   }

   Class368 Method649(Class366 a) {
      double var2 = this.Field1730.Field1733;
      double var4 = this.Field1731.Field1733;
      double var6 = a.Field1730.Field1733;
      double var8 = a.Field1731.Field1733;
      double var10 = this.Field1730.Field1734;
      double var12 = this.Field1731.Field1734;
      double var14 = a.Field1730.Field1734;
      double var16 = a.Field1731.Field1734;
      double var18 = -var2 * var16 - var6 * var16 - var8 * (var10 - var14);
      double var20 = var4 * var16 - var8 * var12;
      return var20 == 0.0 ? this.Method651(a) : this.Method650(var18, var20);
   }

   private Class368 Method650(double a, double a) {
      double var5 = a / a;
      Class368 var7 = new Class368(0.0, 0.0, 0.0);
      var7.Field1733 = this.Field1730.Field1733 + this.Field1731.Field1733 * var5;
      var7.Field1734 = this.Field1730.Field1734 + this.Field1731.Field1734 * var5;
      var7.Field1735 = this.Field1730.Field1735 + this.Field1731.Field1735 * var5;
      return var7;
   }

   private Class368 Method651(Class366 a) {
      double var2 = this.Field1730.Field1733;
      double var4 = this.Field1731.Field1733;
      double var6 = a.Field1730.Field1733;
      double var8 = a.Field1731.Field1733;
      double var10 = this.Field1730.Field1735;
      double var12 = this.Field1731.Field1735;
      double var14 = a.Field1730.Field1735;
      double var16 = a.Field1731.Field1735;
      double var18 = -var2 * var16 - var6 * var16 - var8 * (var10 - var14);
      double var20 = var4 * var16 - var8 * var12;
      return var20 == 0.0 ? this.Method652(a) : this.Method650(var18, var20);
   }

   private Class368 Method652(Class366 a) {
      double var2 = this.Field1730.Field1734;
      double var4 = this.Field1731.Field1734;
      double var6 = a.Field1730.Field1734;
      double var8 = a.Field1731.Field1734;
      double var10 = this.Field1730.Field1735;
      double var12 = this.Field1731.Field1735;
      double var14 = a.Field1730.Field1735;
      double var16 = a.Field1731.Field1735;
      double var18 = -var2 * var16 - var6 * var16 - var8 * (var10 - var14);
      double var20 = var4 * var16 - var8 * var12;
      return var20 == 0.0 ? null : this.Method650(var18, var20);
   }

   public Class368 Method653(Class368 a, Class368 a) {
      Class368 var3 = new Class368(this.Field1730.Field1733, this.Field1730.Field1734, this.Field1730.Field1735);
      double var4 = a.Method659(this.Field1730).Method662(a) / this.Field1731.Method662(a);
      var3.Method667(this.Field1731.Method664(var4));
      return this.Field1731.Method662(a) == 0.0 ? null : var3;
   }
}
