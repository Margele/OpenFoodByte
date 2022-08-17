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
      double var7 = Math.abs(a - a);
      int var9 = Minecraft.getDebugFPS();
      if (var7 > 0.0) {
         double var10 = MathUtils.floor(Math.min(10.0, Math.max(0.05, 144.0 / (double)var9 * (var7 / 10.0) * a)), 0.05);
         if (var7 != 0.0 && var7 < var10) {
            var10 = var7;
         }

         if (a < a) {
            return a + var10;
         }

         if (a > a) {
            return a - var10;
         }
      }

      return a;
   }
}
