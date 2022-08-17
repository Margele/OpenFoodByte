package awsl;

import net.minecraft.util.Vec3i;
import obfuscate.a;

public class Class223 {
   public static final Class223 Field1238 = new Class223(0.0, 0.0, 0.0);
   public final double Field1239;
   public final double Field1240;
   public final double Field1241;

   public Class223(double a, double a, double a) {
      if (a == -0.0) {
         a = 0.0;
      }

      if (a == -0.0) {
         a = 0.0;
      }

      if (a == -0.0) {
         a = 0.0;
      }

      this.Field1239 = a;
      this.Field1240 = a;
      this.Field1241 = a;
   }

   public Class223(Vec3i a) {
      this((double)a.getX(), (double)a.getY(), (double)a.getZ());
   }

   public Class223 Method2169() {
      double a = Math.sqrt(this.Field1239 * this.Field1239 + this.Field1240 * this.Field1240 + this.Field1241 * this.Field1241);
      return a < 1.0E-4 ? Field1238 : new Class223(this.Field1239 / a, this.Field1240 / a, this.Field1241 / a);
   }

   public Class223 Method2170(Class223 a) {
      return this.Method2171(a.Field1239, a.Field1240, a.Field1241);
   }

   public Class223 Method2171(double a, double a, double a) {
      return this.Method2173(-a, -a, -a);
   }

   public Class223 Method2172(Class223 a) {
      return this.Method2173(a.Field1239, a.Field1240, a.Field1241);
   }

   public Class223 Method2173(double a, double a, double a) {
      return new Class223(this.Field1239 + a, this.Field1240 + a, this.Field1241 + a);
   }

   public double Method2174(Class223 a) {
      double a = a.Field1239 - this.Field1239;
      double a = a.Field1240 - this.Field1240;
      double a = a.Field1241 - this.Field1241;
      return a * a + a * a + a * a;
   }

   public double Method2175(double a, double a, double a) {
      double a = a - this.Field1239;
      double a = a - this.Field1240;
      double a = a - this.Field1241;
      return a * a + a * a + a * a;
   }

   public Class223 Method2176(double a) {
      return new Class223(this.Field1239 * a, this.Field1240 * a, this.Field1241 * a);
   }

   public boolean Method2177(Object a) {
      if (this == a) {
         return true;
      } else if (!(a instanceof Class223)) {
         return false;
      } else {
         Class223 a = (Class223)a;
         return Double.compare(a.Field1239, this.Field1239) == 0 && Double.compare(a.Field1240, this.Field1240) == 0 && Double.compare(a.Field1241, this.Field1241) == 0;
      }
   }

   public int Method2178() {
      long a = Double.doubleToLongBits(this.Field1239);
      int a = (int)(a ^ a >>> 32);
      Class216.Method2647();
      a = Double.doubleToLongBits(this.Field1240);
      a = 31 * a + (int)(a ^ a >>> 32);
      a = Double.doubleToLongBits(this.Field1241);
      a = 31 * a + (int)(a ^ a >>> 32);
      if (a.trash() == null) {
         Class216.Method2646("w2n8Y");
      }

      return a;
   }

   public String Method2179() {
      return "(" + this.Field1239 + ", " + this.Field1240 + ", " + this.Field1241 + ")";
   }

   public Class223 Method2180(float a) {
      return new Class223(this.Field1239 * (double)a, this.Field1240 * (double)a, this.Field1241 * (double)a);
   }
}
