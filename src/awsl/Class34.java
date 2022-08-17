package awsl;

public class Class34 extends Class119 {
   public int Method3(int a, int a1, int a) {
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      if (a == 255) {
         return a;
      } else {
         float a = 255.0F / (float)a;
         a = (int)((float)a * a);
         a = (int)((float)a * a);
         a = (int)((float)a * a);
         if (a > 255) {
            a = 255;
         }

         if (a > 255) {
            a = 255;
         }

         if (a > 255) {
            a = 255;
         }

         return a << 24 | a << 16 | a << 8 | a;
      }
   }

   public String toString() {
      return "Alpha/Unpremultiply";
   }
}
