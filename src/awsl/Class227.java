package awsl;

import java.io.PrintWriter;

public final class Class227 extends Class167 {
   private final PrintWriter Field1275;
   public final Class801 Field1276;

   public Class227(PrintWriter a) {
      this((Class167)null, a);
   }

   public Class227(Class167 a, PrintWriter a) {
      this(a, new Class804(), a);
   }

   public Class227(Class167 a, Class801 a, PrintWriter a) {
      super(327680, a);
      this.Field1275 = a;
      this.Field1276 = a;
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      this.Field1276.Method3245(a, a, a, a, a, a);
      super.Method1447(a, a, a, a, a, a);
   }

   public void Method1458(String a, String a) {
      this.Field1276.Method3246(a, a);
      super.Method1458(a, a);
   }

   public void Method1453(String a, String a, String a) {
      this.Field1276.Method3247(a, a, a);
      super.Method1453(a, a, a);
   }

   public Class148 Method1448(String a, boolean a) {
      Class801 a = this.Field1276.Method3248(a, a);
      Class148 a = this.Field1035 == null ? null : this.Field1035.Method1448(a, a);
      return new Class132(a, a);
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      Class801 a = this.Field1276.Method3249(a, a, a, a);
      Class148 a = this.Field1035 == null ? null : this.Field1035.Method1449(a, a, a, a);
      return new Class132(a, a);
   }

   public void Method1459(Class136 a) {
      this.Field1276.Method3250(a);
      super.Method1459(a);
   }

   public void Method1452(String a, String a, String a, int a) {
      this.Field1276.Method3251(a, a, a, a);
      super.Method1452(a, a, a, a);
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      Class801 a = this.Field1276.Method3252(a, a, a, a, a);
      Class253 a = this.Field1035 == null ? null : this.Field1035.Method1450(a, a, a, a, a);
      return new Class270(a, a);
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      Class801 a = this.Field1276.Method3253(a, a, a, a, a);
      Class267 a = this.Field1035 == null ? null : this.Field1035.Method1451(a, a, a, a, a);
      return new Class41(a, a);
   }

   public void Method1460() {
      this.Field1276.Method3254();
      if (this.Field1275 != null) {
         this.Field1276.Method3296(this.Field1275);
         this.Field1275.flush();
      }

      super.Method1460();
   }
}
