package trash.foodbyte.value;

import awsl.Class446;
import awsl.Class447;

public class BooleanValue extends Class447 {
   private static int[] Field2129;

   public BooleanValue(String a, String a, Boolean a, boolean a) {
      this.Field2117 = a;
      this.Field2118 = a;
      this.Field2120 = a;
      Class446.Method2762(this);
   }

   public BooleanValue(String a, String a, Boolean a, String a) {
      this(a, a, a, false);
      this.Field2119 = a;
   }

   public BooleanValue(String a, String a, Boolean a) {
      this(a, a, a, false);
   }

   public Boolean getBooleanValue() {
      return (Boolean)this.Field2120;
   }

   public void Method2510(Object a) {
      super.Method2510(a);
   }

   public boolean getValue() {
      return this.getBooleanValue();
   }

   public Object Method2454() {
      return this.getBooleanValue();
   }

   public static void Method2511(int[] arr) {
      Field2129 = arr;
   }

   public static int[] Method2512() {
      return Field2129;
   }

   static {
      if (Method2512() != null) {
         Method2511(new int[2]);
      }

   }
}
