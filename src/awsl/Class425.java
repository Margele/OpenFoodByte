package awsl;

import java.awt.Color;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Class425 extends Class426 {
   BooleanValue Field2045;

   public Class425(Class414 a, BooleanValue a) {
      this.Field2047 = a;
      this.Field2048 = a;
      this.Field2045 = (BooleanValue)this.Field2048;
      super.Method2308();
   }

   public void Method2310(int a, int a, float a2) {
      Color a = Class416.Method2352();
      int a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 200)).getRGB();
      RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 + 0.0), -1);
      Class565.Field2640.Method1217("j", (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2640.Method1225("j") - 3.0), (float)(this.Field2051 + 3.0), this.Field2045.getBooleanValue() ? a : (new Color(150, 150, 150, 255)).getRGB());
      if (this.Method2407(a, a)) {
         RenderUtils.Method1105(this.Field2050 + this.Field2052 - 2.0, this.Field2051 + 2.0, this.Field2050 + this.Field2052 - 13.0, this.Field2051 + 13.0, 1427181841);
      }

   }

   public boolean Method2311(int a, int a, int a) {
      if (this.Method2407(a, a)) {
         this.Field2045.Method2510(!this.Field2045.getBooleanValue());
         return true;
      } else {
         return super.Method2311(a, a, a);
      }
   }

   public void Method2312(int a, int a1, int a2) {
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2407(int a, int a) {
      return (double)a >= this.Field2050 + this.Field2052 - 13.0 && (double)a <= this.Field2050 + this.Field2052 - 2.0 && (double)a >= this.Field2051 + 2.0 && (double)a <= this.Field2051 + 13.0;
   }
}
