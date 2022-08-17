package awsl;

public class Class118 extends Class119 {
   private int Field944;
   private int Field945;
   private int Field946;
   private int Field947;
   private int Field948;
   private int Field949;

   public Class118() {
      this.Field950 = true;
   }

   public void Method9(int a) {
      this.Field944 = a;
   }

   public int Method10() {
      return this.Field944;
   }

   public void Method11(int a) {
      this.Field945 = a;
   }

   public int Method12() {
      return this.Field945;
   }

   public void Method13(int a) {
      this.Field946 = a;
   }

   public int Method14() {
      return this.Field946;
   }

   public void Method15(int a) {
      this.Field947 = a;
   }

   public int Method16() {
      return this.Field947;
   }

   public void Method498(int a) {
      this.Field948 = a;
   }

   public int Method499() {
      return this.Field948;
   }

   public void Method500(int a) {
      this.Field949 = a;
   }

   public int Method501() {
      return this.Field949;
   }

   public int Method3(int a, int a1, int a) {
      int a = a & -16777216;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = Class767.Method1687((this.Field947 * (this.Field944 * a + (255 - this.Field944) * a) / 255 + (255 - this.Field947) * a) / 255);
      int a = Class767.Method1687((this.Field948 * (this.Field945 * a + (255 - this.Field945) * a) / 255 + (255 - this.Field948) * a) / 255);
      int a = Class767.Method1687((this.Field949 * (this.Field946 * a + (255 - this.Field946) * a) / 255 + (255 - this.Field949) * a) / 255);
      return a | a << 16 | a << 8 | a;
   }

   public String toString() {
      return "Colors/Mix Channels...";
   }
}
