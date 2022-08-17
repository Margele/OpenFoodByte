package awsl;

public class Class6 extends Class119 {
   private int[] Field109 = new int[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0};

   public void Method85(int[] a) {
      this.Field109 = a;
   }

   public int[] Method3438() {
      return this.Field109;
   }

   public int Method3(int a, int a, int a) {
      int var4 = a >> 24 & 255;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      var4 = this.Field109[0] * var4 + this.Field109[1] * var5 + this.Field109[2] * var6 + this.Field109[3] * var7 + this.Field109[4] * 255;
      var5 = this.Field109[5] * var4 + this.Field109[6] * var5 + this.Field109[7] * var6 + this.Field109[8] * var7 + this.Field109[9] * 255;
      var6 = this.Field109[10] * var4 + this.Field109[11] * var5 + this.Field109[12] * var6 + this.Field109[13] * var7 + this.Field109[14] * 255;
      var7 = this.Field109[15] * var4 + this.Field109[16] * var5 + this.Field109[17] * var6 + this.Field109[18] * var7 + this.Field109[19] * 255;
      var4 = Class767.Method1687(var4);
      var5 = Class767.Method1687(var5);
      var6 = Class767.Method1687(var6);
      var7 = Class767.Method1687(var7);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   public String toString() {
      return "Channels/Swizzle...";
   }
}
