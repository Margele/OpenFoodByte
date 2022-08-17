package awsl;

import obfuscate.a;

public class Class278 {
   private Number Field1515;
   private Number Field1516;
   private Number Field1517;
   private static int Field1518;

   public Class278(Number a, Number a, Number a) {
      Method2815();
      this.Field1515 = a;
      this.Field1516 = a;
      this.Field1517 = a;
      a.trash(new String[4]);
   }

   public Class278 Method2808(Number a) {
      this.Field1515 = a;
      return this;
   }

   public Class278 Method2809(Number a) {
      this.Field1516 = a;
      return this;
   }

   public Class278 Method2810(Number a) {
      this.Field1517 = a;
      return this;
   }

   public Number Method2811() {
      return this.Field1515;
   }

   public Number Method2812() {
      return this.Field1516;
   }

   public Number Method2813() {
      return this.Field1517;
   }

   public static void Method2814(int integer) {
      Field1518 = integer;
   }

   public static int Method2815() {
      return Field1518;
   }

   public static int Method2816() {
      int var0 = Method2815();
      return 44;
   }

   static {
      if (Method2815() != 0) {
         Method2814(4);
      }

   }
}
