package awsl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import trash.foodbyte.utils.RenderUtils;

public class Class421 {
   public String Field2027;
   public double Field2028;
   public double Field2029;
   private double Field2030;
   private double Field2031;
   public double Field2032;
   public double Field2033;
   public boolean Field2034;
   public boolean Field2035;
   public boolean Field2036;
   public ArrayList Field2037 = new ArrayList();
   public ArrayList Field2038 = new ArrayList();
   public Class705 Field2039;
   private static String[] Field2040;

   public Class421(String a, double a, double a, double a, double a, boolean a, Class705 a) {
      this.Field2027 = a;
      this.Field2028 = a;
      this.Field2029 = a;
      this.Field2032 = a;
      this.Field2033 = a;
      this.Field2035 = a;
      this.Field2034 = false;
      this.Field2036 = true;
      this.Field2039 = a;
      this.Method2381();
   }

   public void Method2381() {
   }

   public void Method2385(int a, int a, float a) {
      String[] var4 = Method2390();
      if (this.Field2036) {
         if (this.Field2034) {
            this.Field2028 = this.Field2030 + (double)a;
            this.Field2029 = this.Field2031 + (double)a;
         }

         Color var5 = Class416.Method2352().darker();
         int var6 = (new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), 170)).getRGB();
         RenderUtils.Method1105(this.Field2028 - 2.0, this.Field2029, this.Field2028 + this.Field2032 + 2.0, this.Field2029 + this.Field2033, (new Color(0, 155, 255)).getRGB());
         Class565.Field2635.Method1224(this.Field2027.substring(0, 1) + this.Field2027.toLowerCase().substring(1, this.Field2027.length()), (float)(this.Field2028 + this.Field2032 / 2.0), (float)(this.Field2029 + 1.0), -1052689);
         double var7;
         int var9;
         Iterator var10;
         if (this.Field2035 && !this.Field2037.isEmpty()) {
            var7 = this.Field2029 + this.Field2033;
            var9 = (new Color(0, 0, 0, 150)).getRGB();
            var10 = this.Field2037.Method1383();
            if (var10.Method932()) {
               Class414 var11 = (Class414)var10.Method933();
               RenderUtils.Method1105(this.Field2028, var7, this.Field2028 + this.Field2032, var7 + var11.Field2007 + 1.0, var9);
               var11.Field2004 = this.Field2028 + 2.0;
               var11.Field2005 = var7;
               var11.Field2006 = this.Field2032 - 4.0;
               var11.Method3568(a, a, a);
               var7 += var11.Field2007 + 1.0;
            }

            RenderUtils.Method1105(this.Field2028, var7 + 1.0, this.Field2028 + this.Field2032, var7 + 1.0, var9);
         }

         if (this.Field2035 && !this.Field2038.isEmpty()) {
            var7 = this.Field2029 + this.Field2033;
            var9 = (new Color(0, 0, 0, 150)).getRGB();
            var10 = this.Field2038.Method1383();
            if (var10.Method932()) {
               Class417 var12 = (Class417)var10.Method933();
               var12.Field2015 = this.Field2028 + 2.0;
               var12.Field2016 = var7;
               var12.Field2017 = this.Field2032 - 4.0;
               var12.Method2376(a, a, a);
               double var10000 = var7 + var12.Field2018 + 1.0;
            }
         }

      }
   }

   public boolean Method2386(int a, int a, int a) {
      String[] var4 = Method2390();
      if (!this.Field2036) {
         return false;
      } else if (this.Method2388(a, a)) {
         this.Field2030 = this.Field2028 - (double)a;
         this.Field2031 = this.Field2029 - (double)a;
         return this.Field2034 = true;
      } else if (a == 1 && this.Method2388(a, a)) {
         this.Field2035 = !this.Field2035;
         return true;
      } else {
         if (this.Field2035) {
            Iterator var5 = this.Field2037.Method1383();
            if (var5.Method932()) {
               Class414 var6 = (Class414)var5.Method933();
               if (var6.Method3569(a, a, a)) {
                  return true;
               }
            }

            var5 = this.Field2038.Method1383();
            if (var5.Method932()) {
               Class417 var7 = (Class417)var5.Method933();
               if (var7.Method2377(a, a, a)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void Method2387(int a, int a, int a) {
      if (this.Field2036) {
         this.Field2034 = false;
      }
   }

   public boolean Method2388(int a, int a) {
      return (double)a >= this.Field2028 && (double)a <= this.Field2028 + this.Field2032 && (double)a >= this.Field2029 && (double)a <= this.Field2029 + this.Field2033;
   }

   public static void Method2389(String[] arr) {
      Field2040 = arr;
   }

   public static String[] Method2390() {
      return Field2040;
   }

   static {
      if (Method2390() == null) {
         Method2389(new String[4]);
      }

   }
}
