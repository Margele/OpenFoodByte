package awsl;

import obfuscate.a;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class426 {
   public Class705 Field2046;
   public Class414 Field2047;
   public Class447 Field2048;
   public double Field2049;
   public double Field2050;
   public double Field2051;
   public double Field2052;
   public double Field2053;
   public String Field2054;
   public boolean Field2055;
   private static String[] Field2056;

   public void Method2308() {
      this.Field2046 = this.Field2047.Field2003.Field2039;
   }

   public void Method2309() {
      this.Field2050 = this.Field2047.Field2004 + this.Field2047.Field2006 + 3.0;
      this.Field2051 = this.Field2047.Field2003.Field2029 + this.Field2049 + 15.0;
      this.Field2052 = this.Field2047.Field2006 + 10.0;
      Method2315();
      this.Field2053 = 15.0;
      String var2 = this.Field2048.Method2754();
      String var4;
      double var7;
      if (this.Field2048 instanceof ModeValue) {
         label45: {
            if (this.Field2055) {
               this.Field2053 = 25.0;
               int var3 = 0;
               if (var3 < ((ModeValue)this.Field2048).Method2728().length) {
                  var4 = ((ModeValue)this.Field2048).Method2728()[var3];
                  if (((ModeValue)this.Field2048).isCurrentMode(var4)) {
                     ;
                  }

                  this.Field2053 += (double)(Class565.Field2637.Field2625 - 5.0F);
                  ++var3;
               }

               if (((ModeValue)this.Field2048).Method2728().length <= 1) {
                  break label45;
               }

               this.Field2053 += 3.0;
            }

            this.Field2053 = 25.0;
         }

         this.Field2054 = this.Field2048.Method2754();
         var7 = this.Field2050 + this.Field2052 - (double)((int)Class565.Field2637.Method1225(((ModeValue)this.Field2048).getMode()));
         if (var7 < this.Field2050 + 33.0) {
            this.Field2052 += this.Field2050 + 33.0 - var7;
         }
      }

      if (this.Field2048 instanceof FloatValue) {
         this.Field2054 = var2.substring(0, 1).toUpperCase() + var2.substring(1, var2.length());
         String var8 = "" + (double)Math.round((double)((FloatValue)this.Field2048).getFloatValue() * 100.0) / 100.0;
         var4 = "" + (double)Math.round((double)((FloatValue)this.Field2048).Method2751() * 100.0) / 100.0;
         double var5 = this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(this.Field2054) - (double)Class565.Field2637.Method1225(var4) - 4.0;
         if (var5 < this.Field2050) {
            this.Field2052 += this.Field2050 - var5 + 1.0;
         }
      }

      if (this.Field2048 instanceof BooleanValue) {
         this.Field2054 = var2.substring(0, 1).toUpperCase() + var2.substring(1, var2.length());
         var7 = this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(this.Field2054);
         if (var7 < this.Field2050 + 13.0) {
            this.Field2052 += this.Field2050 + 13.0 - var7 + 1.0;
         }
      }

      if (a.trash() == null) {
         Method2314(new String[2]);
      }

   }

   public void Method2310(int a, int a, float a) {
   }

   public boolean Method2311(int a, int a, int a) {
      return this.Method2313(a, a);
   }

   public void Method2312(int a, int a, int a) {
   }

   public boolean Method2313(int a, int a) {
      return (double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a >= this.Field2051 && (double)a <= this.Field2051 + this.Field2053;
   }

   public static void Method2314(String[] arr) {
      Field2056 = arr;
   }

   public static String[] Method2315() {
      return Field2056;
   }

   static {
      if (Method2315() == null) {
         Method2314(new String[5]);
      }

   }
}
