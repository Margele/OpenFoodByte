package awsl;

public class Class666 extends RuntimeException {
   private static final long Field2939 = 0L;
   private static int[] Field2940;

   public Class666(String a) {
      super(a);
   }

   public Class666(String a, Throwable a) {
      super(a, a);
   }

   public Class666(Throwable a) {
      super(a.getMessage(), a);
   }

   public static void Method85(int[] arr) {
      Field2940 = arr;
   }

   public static int[] Method3438() {
      return Field2940;
   }

   static {
      if (Method3438() != null) {
         Method85(new int[3]);
      }

   }
}
