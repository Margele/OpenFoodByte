package awsl;

import java.awt.Color;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Class412 extends Class413 {
   BooleanValue Field1989;

   public Class412(Class417 a, BooleanValue a) {
      this.Field1991 = a;
      this.Field1992 = a;
      this.Field1989 = (BooleanValue)this.Field1992;
      super.Method3576();
   }

   public void Method2369(int a, int a, float a) {
      Color var4 = Class416.Method2352();
      int var5 = (new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 200)).getRGB();
      RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 + 0.0), -1);
      Class565.Field2640.Method1217("j", (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2640.Method1225("j") - 3.0), (float)(this.Field1995 + 3.0), this.Field1989.getBooleanValue() ? var5 : (new Color(150, 150, 150, 255)).getRGB());
      if (this.Method2372(a, a)) {
         RenderUtils.Method1105(this.Field1994 + this.Field1996 - 2.0, this.Field1995 + 2.0, this.Field1994 + this.Field1996 - 13.0, this.Field1995 + 13.0, 1427181841);
      }

   }

   public boolean Method2370(int a, int a, int a) {
      if (this.Method2372(a, a)) {
         this.Field1989.Method2510(!this.Field1989.getBooleanValue());
         return true;
      } else {
         return super.Method2370(a, a, a);
      }
   }

   public void Method2371(int a, int a, int a) {
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2372(int a, int a) {
      return (double)a >= this.Field1994 + this.Field1996 - 13.0 && (double)a <= this.Field1994 + this.Field1996 - 2.0 && (double)a >= this.Field1995 + 2.0 && (double)a <= this.Field1995 + 13.0;
   }
}
