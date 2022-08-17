package awsl;

import java.util.HashMap;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;

public class Class327 {
   public Class326 Field1612;
   private final HashMap Field1613 = new HashMap();

   public Class327(Class a) {
      try {
         this.Field1612 = (Class326)a.newInstance();
      } catch (IllegalAccessException | InstantiationException var3) {
         var3.printStackTrace();
      }

   }

   public double Method997(Class322 a, double a, double a, double a) {
      if (a > a) {
         double var8 = a;
         a = a;
         a = var8;
      }

      if (a.Method1191() < a) {
         a.Method1192(a.Method1191() + (double)(GlobalModule.Field3185 * 0.001F));
      }

      if (this.Field1612 instanceof Class325) {
         return Class325.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class332) {
         return Class332.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class331) {
         return Class331.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class330) {
         return Class330.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class329) {
         return Class329.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class320) {
         return Class320.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class319) {
         return Class319.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class318) {
         return Class318.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class317) {
         return Class317.Method1010(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class324) {
         return Class324.Method1010(a.Method1191(), a, a, a);
      } else {
         return this.Field1612 instanceof Class323 ? Class323.Method1010(a.Method1191(), a, a, a) : 0.0;
      }
   }

   public double Method998(Class322 a, double a, double a, double a) {
      if (a > a) {
         double var8 = a;
         a = a;
         a = var8;
      }

      if (a.Method1191() < a) {
         a.Method1192(a.Method1191() + (double)(GlobalModule.Field3185 * 0.001F));
      }

      if (this.Field1612 instanceof Class325) {
         return Class325.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class332) {
         return Class332.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class331) {
         return Class331.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class330) {
         return Class330.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class329) {
         return Class329.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class320) {
         return Class320.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class319) {
         return Class319.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class318) {
         return Class318.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class317) {
         return Class317.Method1012(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class324) {
         return Class324.Method1012(a.Method1191(), a, a, a);
      } else {
         return this.Field1612 instanceof Class323 ? Class323.Method1012(a.Method1191(), a, a, a) : 0.0;
      }
   }

   public double Method999(Class322 a, double a, double a, double a) {
      boolean var8 = Class326.Method1248();
      if (a > a) {
         double var9 = a;
         a = a;
         a = var9;
      }

      if (a.Method1191() < a) {
         a.Method1192(a.Method1191() + (double)(GlobalModule.Field3185 * 0.001F));
      }

      if (this.Field1612 instanceof Class325) {
         return Class325.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class332) {
         return Class332.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class331) {
         return Class331.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class330) {
         return Class330.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class329) {
         return Class329.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class320) {
         return Class320.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class319) {
         return Class319.Method1188(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class318) {
         return Class318.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class317) {
         return Class317.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class324) {
         return Class324.Method1014(a.Method1191(), a, a, a);
      } else if (this.Field1612 instanceof Class323) {
         return Class323.Method1014(a.Method1191(), a, a, a);
      } else {
         if (a.trash() == null) {
            Class326.Method1246(false);
         }

         return 0.0;
      }
   }

   public double Method1000(int a, double a, double a, double a) {
      if (!this.Field1613.containsKey(a)) {
         this.Field1613.put(a, new Class322());
         return 0.0;
      } else {
         return this.Method997((Class322)this.Field1613.Method2665(a), a, a, a);
      }
   }

   public double Method1001(int a, double a, double a, double a) {
      boolean var8 = Class326.Method1248();
      if (!this.Field1613.containsKey(a)) {
         this.Field1613.put(a, new Class322());
      }

      return this.Method998((Class322)this.Field1613.Method2665(a), a, a, a);
   }

   public double Method1002(int a, double a, double a, double a) {
      if (!this.Field1613.containsKey(a)) {
         this.Field1613.put(a, new Class322());
         return 0.0;
      } else {
         return this.Method999((Class322)this.Field1613.Method2665(a), a, a, a);
      }
   }

   public Class322 Method1003(int a) {
      Class322 var2 = new Class322();
      if (!this.Field1613.containsKey(a)) {
         this.Field1613.put(a, var2);
      } else {
         var2 = (Class322)this.Field1613.Method2665(a);
      }

      return var2;
   }

   public Class322 Method1004(int a) {
      Class322 var2 = null;
      if (!this.Field1613.containsKey(a)) {
         Class322 var3 = new Class322();
         this.Field1613.put(a, var3);
         var2 = var3;
      } else {
         var2 = (Class322)this.Field1613.Method2665(a);
      }

      return var2;
   }

   public static double Method1005(double a, double a, double a, double a, boolean a) {
      a *= (double)GlobalModule.Field3185 * 0.2;
      return MathHelper.clamp_double(a < a ? a + (a - a) * a : a, a, a);
   }

   public static double Method1006(double a, double a, double a) {
      boolean var6 = Class326.Method1248();
      boolean var7 = a > a;
      if (a < 0.0) {
         a = 0.0;
         a.trash(new String[3]);
      }

      if (a > 1.0) {
         a = 1.0;
      }

      double var8 = Math.max(a, a) - Math.min(a, a);
      double var10 = var8 * a;
      if (var10 < 0.1) {
         var10 = 0.1;
      }

      a += var10;
      a -= var10;
      return a;
   }
}
