package awsl;

public class Class343 {
   private long Field1651;
   final Class344 Field1652;

   public Class343(Class344 a) {
      this.Field1652 = a;
      this.Method299();
   }

   public Class343(Class344 a, long a) {
      this.Field1652 = a;
      this.Field1651 = System.currentTimeMillis() - a;
   }

   public boolean Method298(double a) {
      return (double)(System.currentTimeMillis() - this.Field1651) >= a;
   }

   public void Method299() {
      this.Field1651 = System.currentTimeMillis();
   }

   public long Method300() {
      return System.currentTimeMillis() - this.Field1651;
   }

   public void Method301(long a) {
      this.Field1651 = System.currentTimeMillis() - a;
   }

   public boolean Method302(double a) {
      return this.Method298(a);
   }
}
