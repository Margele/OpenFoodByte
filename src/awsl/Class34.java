package awsl;

public class Class34 extends Class119 {
   public int Method3(int a, int a, int a) {
      int var4 = a >> 24 & 255;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      if (var4 == 255) {
         return a;
      } else {
         float var8 = 255.0F / (float)var4;
         var5 = (int)((float)var5 * var8);
         var6 = (int)((float)var6 * var8);
         var7 = (int)((float)var7 * var8);
         if (var5 > 255) {
            var5 = 255;
         }

         if (var6 > 255) {
            var6 = 255;
         }

         if (var7 > 255) {
            var7 = 255;
         }

         return var4 << 24 | var5 << 16 | var6 << 8 | var7;
      }
   }

   public String toString() {
      return "Alpha/Unpremultiply";
   }
}
