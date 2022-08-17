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

   public void Method2369(int a, int a, float a2) {
      Color a = Class416.Method2352();
      RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 - 1.0), -1);
      Class418.Method2375();
      RenderUtils.Method1105(this.Field1994 + 2.0, this.Field1995 + 12.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + this.Field1997 - 2.0, (new Color(150, 150, 150, 77)).getRGB());
      Class565.Field2637.Method1222(this.Field1988.getMode(), (float)(this.Field1994 + this.Field1996 / 2.0), (float)(this.Field1995 + 11.0), -1);
      Class565.Field2639.Method1217(this.Field1999 ? "h" : "i", (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2639.Method1225(this.Field1999 ? "h" : "i") - 3.0), (float)(this.Field1995 + 13.0), -1);
      if (this.Field1999) {
         RenderUtils.Method1106(this.Field1994 + 2.0, this.Field1995 + 23.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + 25.0, (new Color(0, 0, 0, 76)).getRGB(), 0);
         double a = this.Field1995 + 24.0;
         int a = 0;
         if (a < this.Field1988.Method2728().length) {
            String a = this.Field1988.Method2728()[a];
            String a = a.substring(0, 1).toUpperCase() + a.substring(1, a.length());
            int a = (new Color(163, 162, 162, 255)).getRGB();
            if (this.Field1988.isCurrentMode(a)) {
               ;
            }

            if ((double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= a && (double)a < a + (double)Class565.Field2637.Field2625 - 5.0) {
               a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 150)).getRGB();
            }

            Class565.Field2637.Method1222(a, (float)(this.Field1994 + this.Field1996 / 2.0), (float)(a - 1.0), a);
            a += (double)(Class565.Field2637.Field2625 - 5.0F);
            ++a;
         }
      }

      if (a.trash() == null) {
         Class418.Method2373(false);
      }

   }

   public boolean Method2370(int a, int a, int a) {
      int a = Class418.Method2374();
      if (this.Method2372(a, a)) {
         this.Field1999 = !this.Field1999;
         return true;
      } else if (!this.Field1999) {
         return false;
      } else {
         double a = this.Field1995 + 24.0;
         int a = 0;
         if (a < this.Field1988.Method2728().length) {
            String a = this.Field1988.Method2728()[a];
            if (this.Field1988.isCurrentMode(a)) {
               ;
            }

            if ((double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= a && (double)a <= a + (double)Class565.Field2637.Field2625 - 5.0) {
               if (this.Field1990 != null) {
                  this.Field1988.Method2720(a);
                  this.Field1999 = false;
               }

               return true;
            }

            a += (double)(Class565.Field2637.Field2625 - 5.0F);
            ++a;
         }

         return super.Method2370(a, a, a);
      }
   }

   public void Method2371(int a, int a1, int a2) {
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2372(int a, int a) {
      return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= this.Field1995 + 11.0 && (double)a <= this.Field1995 + 23.0;
   }
}
