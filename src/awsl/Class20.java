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
         int a = 0;
         if (a < 256) {
            this.Field230[a] = 255 * (this.Field229 * a / 256) / (this.Field229 - 1);
            ++a;
         }
      }

   }

   public int Method3(int a, int a1, int a) {
      if (!this.Field231) {
         this.Field231 = true;
         this.Method89();
      }

      int a = a & -16777216;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = this.Field230[a];
      a = this.Field230[a];
      a = this.Field230[a];
      return a | a << 16 | a << 8 | a;
   }

   public String toString() {
      return "Colors/Posterize...";
   }
}
