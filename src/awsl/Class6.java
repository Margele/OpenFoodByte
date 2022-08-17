package awsl;

public class Class6 extends Class119 {
   private int[] Field109 = new int[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0};

   public void Method85(int[] a) {
      this.Field109 = a;
   }

   public int[] Method3438() {
      return this.Field109;
   }

   public int Method3(int a, int a1, int a) {
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = this.Field109[0] * a + this.Field109[1] * a + this.Field109[2] * a + this.Field109[3] * a + this.Field109[4] * 255;
      a = this.Field109[5] * a + this.Field109[6] * a + this.Field109[7] * a + this.Field109[8] * a + this.Field109[9] * 255;
      a = this.Field109[10] * a + this.Field109[11] * a + this.Field109[12] * a + this.Field109[13] * a + this.Field109[14] * 255;
      a = this.Field109[15] * a + this.Field109[16] * a + this.Field109[17] * a + this.Field109[18] * a + this.Field109[19] * 255;
      a = Class767.Method1687(a);
      a = Class767.Method1687(a);
      a = Class767.Method1687(a);
      a = Class767.Method1687(a);
      return a << 24 | a << 16 | a << 8 | a;
   }

   public String toString() {
      return "Channels/Swizzle...";
   }
}
