package awsl;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class Class338 {
   public double Field1633;
   public double Field1634;
   public double Field1635;

   public Class338(double a, double a, double a) {
      this.Field1633 = a;
      this.Field1634 = a;
      this.Field1635 = a;
   }

   public double Method220() {
      return this.Field1633;
   }

   public double Method221() {
      return this.Field1634;
   }

   public double Method222() {
      return this.Field1635;
   }

   public double Method223(Vec3 a) {
      double var2 = a.xCoord - this.Field1633;
      double var4 = a.yCoord - this.Field1634;
      double var6 = a.zCoord - this.Field1635;
      return (double)MathHelper.sqrt_double(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public Class338 Method224(double a, double a, double a) {
      return new Class338(this.Field1633 + a, this.Field1634 + a, this.Field1635 + a);
   }

   public Class338 Method225(double a) {
      return new Class338(this.Field1633 * a, this.Field1634 * a, this.Field1635 * a);
   }

   public Class338 Method226() {
      return new Class338(Math.floor(this.Field1633), Math.floor(this.Field1634), Math.floor(this.Field1635));
   }

   public double Method227(Class338 a) {
      return Math.pow(a.Field1633 - this.Field1633, 2.0) + Math.pow(a.Field1634 - this.Field1634, 2.0) + Math.pow(a.Field1635 - this.Field1635, 2.0);
   }

   public Class338 Method228(Class338 a) {
      return this.Method224(a.Method220(), a.Method221(), a.Method222());
   }

   public Vec3 Method229() {
      return new Vec3(this.Field1633, this.Field1634, this.Field1635);
   }

   public String Method230() {
      return "[" + this.Field1633 + ";" + this.Field1634 + ";" + this.Field1635 + "]";
   }
}
