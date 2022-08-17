package awsl;

import obfuscate.a;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class413 {
   public Class705 Field1990;
   public Class417 Field1991;
   public Class447 Field1992;
   public double Field1993;
   public double Field1994;
   public double Field1995;
   public double Field1996;
   public double Field1997;
   public String Field1998;
   public boolean Field1999;
   private static boolean Field2000;

   public void Method3576() {
      this.Field1990 = this.Field1991.Field2014.Field2039;
   }

   public void Method3577() {
      Method3580();
      this.Field1994 = this.Field1991.Field2014.Field2028;
      this.Field1995 = this.Field1991.Field2014.Field2029 + this.Field1993 + 12.0;
      this.Field1996 = this.Field1991.Field2017 + 4.0;
      this.Field1997 = 15.0;
      String var2 = this.Field1992.Method2754();
      String var4;
      double var7;
      if (this.Field1992 instanceof ModeValue) {
         label47: {
            if (this.Field1999) {
               this.Field1997 = 25.0;
               int var3 = 0;
               if (var3 < ((ModeValue)this.Field1992).Method2728().length) {
                  var4 = ((ModeValue)this.Field1992).Method2728()[var3];
                  if (((ModeValue)this.Field1992).isCurrentMode(var4)) {
                     ;
                  }

                  this.Field1997 += (double)(Class565.Field2637.Field2625 - 5.0F);
                  ++var3;
               }

               if (((ModeValue)this.Field1992).Method2728().length <= 1) {
                  break label47;
               }

               this.Field1997 += 3.0;
            }

            this.Field1997 = 25.0;
         }

         this.Field1998 = this.Field1992.Method2754();
         var7 = this.Field1994 + this.Field1996 - (double)((int)Class565.Field2637.Method1225(((ModeValue)this.Field1992).getMode()));
         if (var7 < this.Field1994 + 33.0) {
            this.Field1996 += this.Field1994 + 33.0 - var7;
         }
      }

      if (this.Field1992 instanceof FloatValue) {
         this.Field1998 = var2.substring(0, 1).toUpperCase() + var2.substring(1, var2.length());
         String var8 = "" + (double)Math.round((double)((FloatValue)this.Field1992).getFloatValue() * 100.0) / 100.0;
         var4 = "" + (double)Math.round((double)((FloatValue)this.Field1992).Method2751() * 100.0) / 100.0;
         double var5 = this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225(this.Field1998) - (double)Class565.Field2637.Method1225(var4) - 4.0;
         if (var5 < this.Field1994) {
            this.Field1996 += this.Field1994 - var5 + 1.0;
         }
      }

      if (this.Field1992 instanceof BooleanValue) {
         this.Field1998 = var2.substring(0, 1).toUpperCase() + var2.substring(1, var2.length());
         var7 = this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225(this.Field1998);
         if (var7 < this.Field1994 + 13.0) {
            this.Field1996 += this.Field1994 + 13.0 - var7 + 1.0;
         }
      }

      if (a.trash() == null) {
         Method3579(false);
      }

   }

   public void Method2369(int a, int a, float a) {
   }

   public boolean Method2370(int a, int a, int a) {
      return this.Method3578(a, a);
   }

   public void Method2371(int a, int a, int a) {
   }

   public boolean Method3578(int a, int a) {
      return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= this.Field1995 && (double)a <= this.Field1995 + this.Field1997;
   }

   public static void Method3579(boolean boolean1) {
      Field2000 = boolean1;
   }

   public static boolean Method3580() {
      return Field2000;
   }

   public static boolean Method3581() {
      boolean var0 = Method3580();
      return true;
   }

   static {
      if (Method3581()) {
         Method3579(true);
      }

   }
}
