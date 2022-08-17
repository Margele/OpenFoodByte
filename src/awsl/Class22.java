package awsl;

public class Class22 extends Class119 {
   private int Field233;
   private int Field234;

   public Class22() {
      this(136);
   }

   public Class22(int a) {
      this.Method9(a);
   }

   public void Method9(int a) {
      this.Field233 = a;
      this.Field234 = a << 24;
   }

   public int Method10() {
      return this.Field233;
   }

   public int Method3(int a, int a1, int a) {
      return (a & -16777216) != 0 ? a & 16777215 | this.Field234 : a;
   }

   public String toString() {
      return "Colors/Transparency...";
   }
}
