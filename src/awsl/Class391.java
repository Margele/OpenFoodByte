package awsl;

import obfuscate.a;

public class Class391 {
   private float Field1925;
   private float Field1926;
   private float Field1927;
   private float Field1928;
   private static String[] Field1929;

   public Class391() {
   }

   public Class391(float a, float a, float a, float a) {
      this.Field1925 = a;
      this.Field1926 = a;
      this.Field1927 = a;
      this.Field1928 = a;
   }

   public float Method1295() {
      return this.Field1925;
   }

   public float Method1296() {
      return this.Field1926;
   }

   public float Method1297() {
      return this.Field1927;
   }

   public float Method1298() {
      return this.Field1928;
   }

   public void Method1299(float a) {
      this.Field1925 = a;
   }

   public void Method1300(float a) {
      this.Field1926 = a;
   }

   public void Method1301(float a) {
      this.Field1927 = a;
   }

   public void Method1302(float a) {
      this.Field1928 = a;
   }

   public boolean Method1303(Object a) {
      if (a == this) {
         return true;
      } else if (!(a instanceof Class391)) {
         return false;
      } else {
         Class391 a = (Class391)a;
         if (!a.Method1304(this)) {
            return false;
         } else if (Float.compare(this.Method1295(), a.Method1295()) != 0) {
            return false;
         } else if (Float.compare(this.Method1296(), a.Method1296()) != 0) {
            return false;
         } else if (Float.compare(this.Method1297(), a.Method1297()) != 0) {
            return false;
         } else {
            return Float.compare(this.Method1298(), a.Method1298()) == 0;
         }
      }
   }

   protected boolean Method1304(Object a) {
      return a instanceof Class391;
   }

   public int Method1305() {
      int a = true;
      int a = 1;
      a = a * 59 + Float.floatToIntBits(this.Method1295());
      a = a * 59 + Float.floatToIntBits(this.Method1296());
      Method1308();
      a = a * 59 + Float.floatToIntBits(this.Method1297());
      a = a * 59 + Float.floatToIntBits(this.Method1298());
      a.trash(new String[2]);
      return a;
   }

   public String Method1306() {
      String[] var1 = Method1308();
      String var10000 = "Rect(x=" + this.Method1295() + ", y=" + this.Method1296() + ", width=" + this.Method1297() + ", height=" + this.Method1298() + ")";
      if (a.trash() == null) {
         Method1307(new String[2]);
      }

      return var10000;
   }

   public static void Method1307(String[] arr) {
      Field1929 = arr;
   }

   public static String[] Method1308() {
      return Field1929;
   }

   static {
      Method1307(new String[4]);
   }
}
