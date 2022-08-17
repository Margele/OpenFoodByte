package awsl;

import net.minecraft.client.Minecraft;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.utils.MathUtils;

public final class Class438 {
   private double Field2080;
   private double Field2081;
   final Notification Field2082;

   public Class438(Notification a, double a, double a) {
      this.Field2082 = a;
      this.Field2080 = a;
      this.Field2081 = a;
   }

   public void Method2666(double a, double a) {
      this.Field2080 = this.Method2671(this.Field2080, a, 1.0);
      this.Field2081 = this.Method2671(this.Field2081, a, 1.0);
   }

   public double Method2667() {
      return this.Field2080;
   }

   public void Method2668(float a) {
      this.Field2080 = (double)a;
   }

   public double Method2669() {
      return this.Field2081;
   }

   public void Method2670(float a) {
      this.Field2081 = (double)a;
   }

   public double Method2671(double a, double a, double a) {
      double a = Math.abs(a - a);
      int a = Minecraft.getDebugFPS();
      if (a > 0.0) {
         double a = MathUtils.floor(Math.min(10.0, Math.max(0.05, 144.0 / (double)a * (a / 10.0) * a)), 0.05);
         if (a != 0.0 && a < a) {
            a = a;
         }

         if (a < a) {
            return a + a;
         }

         if (a > a) {
            return a - a;
         }
      }

      return a;
   }
}
