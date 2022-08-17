package awsl;

import obfuscate.a;

public abstract class Class321 {
   public Class341 Field1604;
   protected int Field1605;
   protected double Field1606;
   protected Class661 Field1607;
   private static String[] Field1608;

   public Class321(int a, double a) {
      this.Field1604 = new Class341(this);
      this.Field1605 = a;
      this.Field1606 = a;
      this.Field1607 = Class661.FORWARDS;
   }

   public Class321(int a, double a, Class661 a) {
      Method1215();
      super();
      this.Field1604 = new Class341(this);
      this.Field1605 = a;
      this.Field1606 = a;
      this.Field1607 = a;
      a.trash(new String[3]);
   }

   public boolean Method1203(Class661 a) {
      return this.Method1208() && this.Field1607.equals(a);
   }

   public double Method1204() {
      String[] var1 = Method1215();
      double var10000 = 1.0 - (double)this.Field1604.Method288() / (double)this.Field1605 * this.Field1606;
      if (a.trash() == null) {
         Method1214(new String[1]);
      }

      return var10000;
   }

   public double Method1205() {
      return this.Field1606;
   }

   public void Method1206(double a) {
      this.Field1606 = a;
   }

   public void Method1207() {
      this.Field1604.Method285();
   }

   public boolean Method1208() {
      return this.Field1604.Method287((long)this.Field1605);
   }

   public void Method1209() {
      this.Method1211(this.Field1607.Method2384());
   }

   public Class661 Method1210() {
      return this.Field1607;
   }

   public void Method1211(Class661 a) {
      if (this.Field1607 != a) {
         this.Field1607 = a;
         this.Field1604.Method289(System.currentTimeMillis() - ((long)this.Field1605 - Math.min((long)this.Field1605, this.Field1604.Method288())));
      }

   }

   public void Method1212(int a) {
      this.Field1605 = a;
   }

   protected boolean Method831() {
      return false;
   }

   public double Method1213() {
      if (this.Field1607 == Class661.FORWARDS) {
         return this.Method1208() ? this.Field1606 : this.Method797((double)this.Field1604.Method288()) * this.Field1606;
      } else if (this.Method1208()) {
         return 0.0;
      } else if (this.Method831()) {
         double a = (double)Math.min((long)this.Field1605, Math.max(0L, (long)this.Field1605 - this.Field1604.Method288()));
         return this.Method797(a) * this.Field1606;
      } else {
         return (1.0 - this.Method797((double)this.Field1604.Method288())) * this.Field1606;
      }
   }

   protected abstract double Method797(double double1);

   public static void Method1214(String[] arr) {
      Field1608 = arr;
   }

   public static String[] Method1215() {
      return Field1608;
   }

   static {
      if (Method1215() != null) {
         Method1214(new String[3]);
      }

   }
}
