package awsl;

public class Class20 extends Class119 {
   private int Field229;
   private int[] Field230;
   private boolean Field231 = false;

   public Class20() {
      this.Method9(6);
   }

   public void Method9(int a) {
      this.Field229 = a;
      this.Field231 = false;
   }

   public int Method10() {
      return this.Field229;
   }

   protected void Method89() {
      Class193.Method1269();
      this.Field230 = new int[256];
      if (this.Field229 != 1) {
         int var2 = 0;
         if (var2 < 256) {
            this.Field230[var2] = 255 * (this.Field229 * var2 / 256) / (this.Field229 - 1);
            ++var2;
         }
      }

   }

   public int Method3(int a, int a, int a) {
      if (!this.Field231) {
         this.Field231 = true;
         this.Method89();
      }

      int var4 = a & -16777216;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      var5 = this.Field230[var5];
      var6 = this.Field230[var6];
      var7 = this.Field230[var7];
      return var4 | var5 << 16 | var6 << 8 | var7;
   }

   public String toString() {
      return "Colors/Posterize...";
   }
}
