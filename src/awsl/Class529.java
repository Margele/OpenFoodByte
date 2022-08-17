package awsl;

public class Class529 implements Class609 {
   private String Field2456;
   private String Field2457;
   private String Field2458;
   private long Field2459;

   public Class529() {
   }

   public Class529(String a, String a, String a, long a) {
      this.Field2457 = a;
      this.Field2458 = a;
      this.Field2459 = a;
      this.Field2456 = a;
   }

   public void Method687(Class234 a) {
      this.Field2457 = a.Method497();
      this.Field2458 = a.Method497();
      this.Field2456 = a.Method497();
      this.Field2459 = a.readLong();
   }

   public void Method688(Class234 a) {
      a.Method496(this.Field2457);
      a.Method496(this.Field2458);
      a.Method496(this.Field2456);
      a.writeLong(this.Field2459);
   }

   public void Method794(Class611 a) {
      a.Method3722(this);
   }

   public String Method692() {
      return this.Field2457;
   }

   public String Method860() {
      return this.Field2458;
   }

   public String Method883() {
      return this.Field2456;
   }

   public long Method691() {
      return this.Field2459;
   }

   public void Method694(Class608 class608) {
      this.Method794((Class611)class608);
   }
}
