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
      String[] a = Method2390();
      if (this.Field2036) {
         if (this.Field2034) {
            this.Field2028 = this.Field2030 + (double)a;
            this.Field2029 = this.Field2031 + (double)a;
         }

         Color a = Class416.Method2352().darker();
         int a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 170)).getRGB();
         RenderUtils.Method1105(this.Field2028 - 2.0, this.Field2029, this.Field2028 + this.Field2032 + 2.0, this.Field2029 + this.Field2033, (new Color(0, 155, 255)).getRGB());
         Class565.Field2635.Method1224(this.Field2027.substring(0, 1) + this.Field2027.toLowerCase().substring(1, this.Field2027.length()), (float)(this.Field2028 + this.Field2032 / 2.0), (float)(this.Field2029 + 1.0), -1052689);
         double a;
         int a;
         Iterator var10;
         if (this.Field2035 && !this.Field2037.isEmpty()) {
            a = this.Field2029 + this.Field2033;
            a = (new Color(0, 0, 0, 150)).getRGB();
            var10 = this.Field2037.Method1383();
            if (var10.Method932()) {
               Class414 a = (Class414)var10.Method933();
               RenderUtils.Method1105(this.Field2028, a, this.Field2028 + this.Field2032, a + a.Field2007 + 1.0, a);
               a.Field2004 = this.Field2028 + 2.0;
               a.Field2005 = a;
               a.Field2006 = this.Field2032 - 4.0;
               a.Method3568(a, a, a);
               a += a.Field2007 + 1.0;
            }

            RenderUtils.Method1105(this.Field2028, a + 1.0, this.Field2028 + this.Field2032, a + 1.0, a);
         }

         if (this.Field2035 && !this.Field2038.isEmpty()) {
            a = this.Field2029 + this.Field2033;
            a = (new Color(0, 0, 0, 150)).getRGB();
            var10 = this.Field2038.Method1383();
            if (var10.Method932()) {
               Class417 a = (Class417)var10.Method933();
               a.Field2015 = this.Field2028 + 2.0;
               a.Field2016 = a;
               a.Field2017 = this.Field2032 - 4.0;
               a.Method2376(a, a, a);
               double var10000 = a + a.Field2018 + 1.0;
            }
         }

      }
   }

   public boolean Method2386(int a, int a, int a) {
      String[] a = Method2390();
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
               Class414 a = (Class414)var5.Method933();
               if (a.Method3569(a, a, a)) {
                  return true;
               }
            }

            var5 = this.Field2038.Method1383();
            if (var5.Method932()) {
               Class417 a = (Class417)var5.Method933();
               if (a.Method2377(a, a, a)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void Method2387(int a, int a1, int a2) {
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
