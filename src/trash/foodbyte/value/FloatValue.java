package trash.foodbyte.value;

import awsl.Class333;
import awsl.Class446;
import awsl.Class447;

public class FloatValue extends Class447 {
   Class333 Field2093;
   private float Field2094;
   private float Field2095;
   private float Field2096;
   private String Field2097;
   public boolean Field2098;
   private static int Field2099;

   public FloatValue(String a, String a, float a, float a, float a, float a, boolean a) {
      this.Field2093 = new Class333(1.0F);
      this.Field2117 = a;
      this.Field2118 = a;
      this.Field2120 = a;
      this.Field2094 = a;
      this.Field2095 = a;
      this.Field2096 = a;
      this.Field2098 = false;
      Class446.Method2762(this);
   }

   public FloatValue(String a, String a, float a, float a, float a, float a) {
      this(a, a, a, a, a, a, false);
   }

   public FloatValue(String a, String a, float a, float a, float a, float a, String a) {
      this(a, a, a, a, a, a);
      this.Field2119 = a;
   }

   public FloatValue(String a, String a, String a, float a, float a, float a, float a) {
      this(a, a, a, a, a, a);
      this.Field2097 = a;
   }

   public FloatValue(String a, String a, float a, float a, float a, float a, String a, String a) {
      this(a, a, a, a, a, a);
      this.Field2097 = a;
      this.Field2119 = a;
   }

   public FloatValue(String a, String a, double a, double a, double a, double a, boolean a) {
      this.Field2093 = new Class333(1.0F);
      this.Field2117 = a;
      this.Field2118 = a;
      this.Field2120 = (float)a;
      this.Field2094 = (float)a;
      this.Field2095 = (float)a;
      this.Field2096 = (float)a;
      this.Field2098 = false;
      Class446.Method2762(this);
   }

   public FloatValue(String a, String a, double a, double a, double a, double a) {
      this(a, a, a, a, a, a, false);
   }

   public FloatValue(String a, String a, double a, double a, double a, double a, String a) {
      this(a, a, a, a, a, a);
      this.Field2119 = a;
   }

   public FloatValue(String a, String a, String a, double a, double a, double a, double a) {
      this(a, a, a, a, a, a);
      this.Field2097 = a;
   }

   public FloatValue(String a, String a, double a, double a, double a, double a, String a, String a) {
      this(a, a, a, a, a, a);
      this.Field2097 = a;
      this.Field2119 = a;
   }

   public Float getFloatValue() {
      return (Float)this.Field2120;
   }

   public void Method2745(float a) {
      if (a < this.Field2094) {
         a = this.Field2094;
      }

      if (a > this.Field2095) {
         a = this.Field2095;
      }

      this.Field2120 = a;
   }

   public float getFloatValueCast() {
      return this.getFloatValue();
   }

   public void Method2747(float a) {
      this.Method2745(a);
   }

   public double Method2435() {
      return (double)this.Field2094;
   }

   public double Method2748() {
      return (double)this.Field2095;
   }

   public double Method2749() {
      return (double)this.Field2096;
   }

   public Class333 Method2727() {
      return this.Field2093;
   }

   public float Method2750() {
      return this.Field2094;
   }

   public float Method2751() {
      return this.Field2095;
   }

   public String Method2719() {
      return this.Field2097;
   }

   public float Method2752() {
      return this.Field2096;
   }

   public Object Method2454() {
      return this.getFloatValue();
   }

   public static void Method2440(int integer) {
      Field2099 = integer;
   }

   public static int Method2442() {
      return Field2099;
   }

   public static int Method2450() {
      int var0 = Method2442();
      return 108;
   }

   static {
      if (Method2442() != 0) {
         Method2440(121);
      }

   }
}
