package awsl;

public final class Class279 {
   final int Field1519;
   final String Field1520;
   final String Field1521;
   final String Field1522;

   public Class279(int a, String a, String a, String a) {
      this.Field1519 = a;
      this.Field1520 = a;
      this.Field1521 = a;
      this.Field1522 = a;
   }

   public int Method2820() {
      return this.Field1519;
   }

   public String Method2821() {
      return this.Field1520;
   }

   public String Method2822() {
      return this.Field1521;
   }

   public String Method2823() {
      return this.Field1522;
   }

   public boolean Method2824(Object a) {
      if (a == this) {
         return true;
      } else if (!(a instanceof Class279)) {
         return false;
      } else {
         Class279 var2 = (Class279)a;
         return this.Field1519 == var2.Field1519 && this.Field1520.equals(var2.Field1520) && this.Field1521.equals(var2.Field1521) && this.Field1522.equals(var2.Field1522);
      }
   }

   public int Method2825() {
      return this.Field1519 + this.Field1520.hashCode() * this.Field1521.hashCode() * this.Field1522.hashCode();
   }

   public String Method2826() {
      return this.Field1520 + '.' + this.Field1521 + this.Field1522 + " (" + this.Field1519 + ')';
   }
}
