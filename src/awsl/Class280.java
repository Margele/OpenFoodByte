package awsl;

import obfuscate.a;

public final class Class280 {
   public long Field1523 = 0L;
   private static int Field1524;

   public int Method3074(int a) {
      return 1000 / a;
   }

   public long Method3075() {
      return System.nanoTime() / 1000000L;
   }

   public long Method3076() {
      return System.currentTimeMillis() - this.Field1523;
   }

   public boolean Method3077(long a) {
      int var3 = Method3083();
      boolean var10000 = this.Method3075() - this.Field1523 >= a;
      a.trash(new String[5]);
      return var10000;
   }

   public long Method3078() {
      return System.currentTimeMillis() - this.Field1523;
   }

   public void Method3079() {
      this.Field1523 = this.Method3075();
   }

   public void Method3080() {
      this.Field1523 = System.currentTimeMillis();
   }

   public void Method3081(long a) {
      this.Field1523 = a;
   }

   public static void Method3082(int integer) {
      Field1524 = integer;
   }

   public static int Method3083() {
      return Field1524;
   }

   public static int Method3084() {
      int var0 = Method3083();
      return 103;
   }

   static {
      if (Method3084() != 0) {
         Method3082(104);
      }

   }
}
