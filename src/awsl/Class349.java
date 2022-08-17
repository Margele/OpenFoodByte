package awsl;

import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class349 {
   private double Field1677 = 0.1;
   private double Field1678;
   private double Field1679;

   public Class349() {
   }

   public Class349(double a) {
      this.Field1677 = a;
   }

   public void Method4(boolean a) {
      float a = (float)((double)GlobalModule.Field3185 * this.Field1677);
      if (this.Field1679 + (double)a < 1.0) {
         this.Field1679 += (double)a;
      } else {
         this.Field1679 = 1.0;
      }

      this.Field1678 = this.Field1679;
   }

   public double Method5(double a) {
      RenderUtils.trash();
      float a = (float)((double)GlobalModule.Field3185 * this.Field1677);
      if (this.Field1679 < a) {
         if (this.Field1679 + (double)a < a) {
            this.Field1679 += (double)a;
         }

         this.Field1679 = a;
      }

      if (this.Field1679 - (double)a > a) {
         this.Field1679 -= (double)a;
      }

      this.Field1679 = a;
      return this.Field1679;
   }

   public double Method6() {
      return this.Field1678;
   }

   public void Method7(double a) {
      this.Field1677 = a;
   }

   public void Method8(double a) {
      this.Field1679 = a;
   }
}
