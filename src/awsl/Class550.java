package awsl;

public class Class550 implements Class609 {
   private String Field2540;
   private static int[] Field2541;

   public Class550() {
   }

   public Class550(String a) {
      this.Field2540 = a;
   }

   public void Method687(Class234 a) {
      this.Field2540 = a.Method497();
   }

   public void Method688(Class234 a) {
      a.Method496(this.Field2540);
   }

   public String Method692() {
      return this.Field2540;
   }

   public void Method689(Class612 a) {
      a.Method3766(this);
   }

   public void Method694(Class608 class608) {
      this.Method689((Class612)class608);
   }

   public static void Method757(int[] arr) {
      Field2541 = arr;
   }

   public static int[] Method758() {
      return Field2541;
   }

   static {
      if (Method758() == null) {
         Method757(new int[4]);
      }

   }
}
