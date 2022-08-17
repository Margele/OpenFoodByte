package awsl;

import java.awt.Color;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class411 extends Class413 {
   ModeValue Field1988;

   public Class411(Class417 a, ModeValue a) {
      this.Field1991 = a;
      this.Field1992 = a;
      this.Field1988 = (ModeValue)this.Field1992;
      super.Method3576();
   }

   public void Method2369(int a, int a, float a) {
      Color var5 = Class416.Method2352();
      RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 - 1.0), -1);
      Class418.Method2375();
      RenderUtils.Method1105(this.Field1994 + 2.0, this.Field1995 + 12.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + this.Field1997 - 2.0, (new Color(150, 150, 150, 77)).getRGB());
      Class565.Field2637.Method1222(this.Field1988.getMode(), (float)(this.Field1994 + this.Field1996 / 2.0), (float)(this.Field1995 + 11.0), -1);
      Class565.Field2639.Method1217(this.Field1999 ? "h" : "i", (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2639.Method1225(this.Field1999 ? "h" : "i") - 3.0), (float)(this.Field1995 + 13.0), -1);
      if (this.Field1999) {
         RenderUtils.Method1106(this.Field1994 + 2.0, this.Field1995 + 23.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + 25.0, (new Color(0, 0, 0, 76)).getRGB(), 0);
         double var6 = this.Field1995 + 24.0;
         int var8 = 0;
         if (var8 < this.Field1988.Method2728().length) {
            String var9 = this.Field1988.Method2728()[var8];
            String var10 = var9.substring(0, 1).toUpperCase() + var9.substring(1, var9.length());
            int var11 = (new Color(163, 162, 162, 255)).getRGB();
            if (this.Field1988.isCurrentMode(var9)) {
               ;
            }

            if ((double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= var6 && (double)a < var6 + (double)Class565.Field2637.Field2625 - 5.0) {
               var11 = (new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), 150)).getRGB();
            }

            Class565.Field2637.Method1222(var10, (float)(this.Field1994 + this.Field1996 / 2.0), (float)(var6 - 1.0), var11);
            var6 += (double)(Class565.Field2637.Field2625 - 5.0F);
            ++var8;
         }
      }

      if (a.trash() == null) {
         Class418.Method2373(false);
      }

   }

   public boolean Method2370(int a, int a, int a) {
      boolean var4 = Class418.Method2374();
      if (this.Method2372(a, a)) {
         this.Field1999 = !this.Field1999;
         return true;
      } else if (!this.Field1999) {
         return false;
      } else {
         double var5 = this.Field1995 + 24.0;
         int var7 = 0;
         if (var7 < this.Field1988.Method2728().length) {
            String var8 = this.Field1988.Method2728()[var7];
            if (this.Field1988.isCurrentMode(var8)) {
               ;
            }

            if ((double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= var5 && (double)a <= var5 + (double)Class565.Field2637.Field2625 - 5.0) {
               if (this.Field1990 != null) {
                  this.Field1988.Method2720(var8);
                  this.Field1999 = false;
               }

               return true;
            }

            var5 += (double)(Class565.Field2637.Field2625 - 5.0F);
            ++var7;
         }

         return super.Method2370(a, a, a);
      }
   }

   public void Method2371(int a, int a, int a) {
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2372(int a, int a) {
      return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= this.Field1995 + 11.0 && (double)a <= this.Field1995 + 23.0;
   }
}
