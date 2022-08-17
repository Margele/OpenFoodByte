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

   public int Method3(int a, int a, int a) {
      int var4 = a & -16777216;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      int var8 = Class767.Method1687((this.Field947 * (this.Field944 * var6 + (255 - this.Field944) * var7) / 255 + (255 - this.Field947) * var5) / 255);
      int var9 = Class767.Method1687((this.Field948 * (this.Field945 * var7 + (255 - this.Field945) * var5) / 255 + (255 - this.Field948) * var6) / 255);
      int var10 = Class767.Method1687((this.Field949 * (this.Field946 * var5 + (255 - this.Field946) * var6) / 255 + (255 - this.Field949) * var7) / 255);
      return var4 | var8 << 16 | var9 << 8 | var10;
   }

   public String toString() {
      return "Colors/Mix Channels...";
   }
}
