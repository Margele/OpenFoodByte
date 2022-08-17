package awsl;

import obfuscate.a;
import trash.foodbyte.module.impl.world.XRay;

public final class Class448 {
   private long Field2123;
   final XRay Field2124;
   private static a[] Field2125;

   public Class448(XRay a) {
      this.Field2124 = a;
      this.Field2123 = System.nanoTime() / 1000000L;
   }

   public boolean Method2455(long a) {
      return this.Method2459() >= a;
   }

   public void Method2456() {
      this.Field2123 = System.nanoTime() / 1000000L;
   }

   public void Method2457(long a) {
      this.Field2123 = System.nanoTime() / 1000000L - a;
   }

   public boolean Method2458(long a) {
      if (this.Method2459() >= a) {
         this.Method2456();
         return true;
      } else {
         return false;
      }
   }

   public long Method2459() {
      return System.nanoTime() / 1000000L - this.Field2123;
   }

   public static void Method2460(a[] arr) {
      Field2125 = arr;
   }

   public static a[] trash() {
      return Field2125;
   }

   static {
      if (trash() == null) {
         Method2460(new a[5]);
      }

   }
}
