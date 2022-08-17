package awsl;

import net.minecraft.util.Vec3;

public class Class216 {
   public double Field1207;
   public double Field1208;
   public double Field1209;
   private static String Field1210;

   public Class216(double a, double a, double a) {
      this.Field1207 = a;
      this.Field1208 = a;
      this.Field1209 = a;
   }

   public double Method2637() {
      return this.Field1207;
   }

   public double Method2638() {
      return this.Field1208;
   }

   public double Method2639() {
      return this.Field1209;
   }

   public Class216 Method2640(double a, double a, double a) {
      return new Class216(this.Field1207 + a, this.Field1208 + a, this.Field1209 + a);
   }

   public Class216 Method2641() {
      return new Class216(Math.floor(this.Field1207), Math.floor(this.Field1208), Math.floor(this.Field1209));
   }

   public double Method2642(Class216 a) {
      return Math.pow(a.Field1207 - this.Field1207, 2.0) + Math.pow(a.Field1208 - this.Field1208, 2.0) + Math.pow(a.Field1209 - this.Field1209, 2.0);
   }

   public Class216 Method2643(Class216 a) {
      return this.Method2640(a.Method2637(), a.Method2638(), a.Method2639());
   }

   public Vec3 Method2644() {
      return new Vec3(this.Field1207, this.Field1208, this.Field1209);
   }

   public String Method2645() {
      return "[" + this.Field1207 + ";" + this.Field1208 + ";" + this.Field1209 + "]";
   }

   public static void Method2646(String string) {
      Field1210 = string;
   }

   public static String Method2647() {
      return Field1210;
   }

   static {
      if (Method2647() != null) {
         Method2646("kZYyI");
      }

   }
}
