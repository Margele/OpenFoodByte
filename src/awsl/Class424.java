package awsl;

import java.awt.Color;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class424 extends Class426 {
   ModeValue Field2044;

   public Class424(Class414 a, ModeValue a) {
      this.Field2047 = a;
      this.Field2048 = a;
      this.Field2044 = (ModeValue)this.Field2048;
      super.Method2308();
   }

   public void Method2310(int a, int a, float a) {
      Class423.Method2410();
      Color var5 = Class416.Method2352();
      RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 - 1.0), -1);
      RenderUtils.Method1105(this.Field2050 + 2.0, this.Field2051 + 12.0, this.Field2050 + this.Field2052 - 2.0, this.Field2051 + this.Field2053 - 2.0, (new Color(150, 150, 150, 77)).getRGB());
      Class565.Field2637.Method1222(this.Field2044.getMode(), (float)(this.Field2050 + this.Field2052 / 2.0), (float)(this.Field2051 + 11.0), -1);
      Class565.Field2639.Method1217(this.Field2055 ? "h" : "i", (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2639.Method1225(this.Field2055 ? "h" : "i") - 3.0), (float)(this.Field2051 + 13.0), -1);
      if (this.Field2055) {
         RenderUtils.Method1106(this.Field2050 + 2.0, this.Field2051 + 23.0, this.Field2050 + this.Field2052 - 2.0, this.Field2051 + 25.0, (new Color(0, 0, 0, 76)).getRGB(), 0);
         double var6 = this.Field2051 + 24.0;
         int var8 = 0;
         if (var8 < this.Field2044.Method2728().length) {
            String var9 = this.Field2044.Method2728()[var8];
            String var10 = var9.substring(0, 1).toUpperCase() + var9.substring(1, var9.length());
            int var11 = (new Color(163, 162, 162, 255)).getRGB();
            if (this.Field2044.isCurrentMode(var9)) {
               ;
            }

            if ((double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a >= var6 && (double)a < var6 + (double)Class565.Field2637.Field2625 - 5.0) {
               var11 = (new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), 150)).getRGB();
            }

            Class565.Field2637.Method1222(var10, (float)(this.Field2050 + this.Field2052 / 2.0), (float)(var6 - 1.0), var11);
            var6 += (double)(Class565.Field2637.Field2625 - 5.0F);
            ++var8;
         }
      }

      if (a.trash() == null) {
         Class423.Method2408(false);
      }

   }

   public boolean Method2311(int a, int a, int a) {
      boolean var4 = Class423.Method2410();
      if (this.Method2407(a, a)) {
         this.Field2055 = !this.Field2055;
         return true;
      } else if (!this.Field2055) {
         return false;
      } else {
         double var5 = this.Field2051 + 24.0;
         int var7 = 0;
         if (var7 < this.Field2044.Method2728().length) {
            String var8 = this.Field2044.Method2728()[var7];
            if (this.Field2044.isCurrentMode(var8)) {
               ;
            }

            if ((double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a >= var5 && (double)a <= var5 + (double)Class565.Field2637.Field2625 - 5.0) {
               if (this.Field2046 != null) {
                  this.Field2044.Method2720(var8);
                  this.Field2055 = false;
               }

               return true;
            }

            var5 += (double)(Class565.Field2637.Field2625 - 5.0F);
            ++var7;
         }

         return super.Method2311(a, a, a);
      }
   }

   public void Method2312(int a, int a, int a) {
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2407(int a, int a) {
      return (double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a >= this.Field2051 + 11.0 && (double)a <= this.Field2051 + 23.0;
   }
}
