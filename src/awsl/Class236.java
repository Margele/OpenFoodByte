package awsl;

import java.awt.Composite;

public abstract class Class236 implements Composite {
   protected float Field1299;
   private static String[] Field1300;

   public Class236() {
      this(1.0F);
   }

   public Class236(float a) {
      if (!(a < 0.0F) && !(a > 1.0F)) {
         this.Field1299 = a;
      } else {
         throw new IllegalArgumentException("RGBComposite: alpha must be between 0 and 1");
      }
   }

   public float Method2102() {
      return this.Field1299;
   }

   public int Method2103() {
      return Float.floatToIntBits(this.Field1299);
   }

   public boolean Method2104(Object a) {
      if (!(a instanceof Class236)) {
         return false;
      } else {
         Class236 a = (Class236)a;
         return this.Field1299 == a.Field1299;
      }
   }

   public static void Method2105(String[] arr) {
      Field1300 = arr;
   }

   public static String[] Method2106() {
      return Field1300;
   }

   private static IllegalArgumentException Method2107(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      if (Method2106() != null) {
         Method2105(new String[5]);
      }

   }
}
