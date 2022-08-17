package awsl;

public class Class10 extends Class119 {
   public int Method3(int a, int a, int a) {
      int var4 = a >> 24 & 255;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      float var8 = (float)var4 * 0.003921569F;
      var5 = (int)((float)var5 * var8);
      var6 = (int)((float)var6 * var8);
      var7 = (int)((float)var7 * var8);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   public String toString() {
      return "Alpha/Premultiply";
   }
}
