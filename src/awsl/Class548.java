package awsl;

import obfuscate.a;

public class Class548 implements Class609 {
   private String Field2536;
   private long Field2537;
   private long Field2538;
   private double Field2539;

   public Class548(String a, long a, double a, long a) {
      this.Field2536 = a;
      this.Field2538 = a;
      this.Field2539 = a;
      this.Field2537 = a;
   }

   public Class548() {
   }

   public void Method687(Class234 a) {
      this.Field2536 = a.Method497();
      Class550.Method758();
      this.Field2538 = a.readLong();
      this.Field2539 = a.readDouble();
      this.Field2537 = a.readLong();
      if (a.trash() == null) {
         Class550.Method757(new int[2]);
      }

   }

   public void Method688(Class234 a) {
      Class550.Method758();
      a.Method496(this.Field2536);
      a.writeLong(this.Field2538);
      a.writeDouble(this.Field2539);
      a.writeLong(this.Field2537);
      a.trash(new String[4]);
   }

   public void Method689(Class612 a) {
      a.Method3763(this);
   }

   public double Method690() {
      return this.Field2539;
   }

   public long Method691() {
      return this.Field2538;
   }

   public String Method692() {
      return this.Field2536;
   }

   public long Method693() {
      return this.Field2537;
   }

   public void Method694(Class608 class608) {
      this.Method689((Class612)class608);
   }
}
