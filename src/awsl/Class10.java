package awsl;

public class Class10 extends Class119 {
   public int Method3(int a, int a1, int a) {
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      float a = (float)a * 0.003921569F;
      a = (int)((float)a * a);
      a = (int)((float)a * a);
      a = (int)((float)a * a);
      return a << 24 | a << 16 | a << 8 | a;
   }

   public String toString() {
      return "Alpha/Premultiply";
   }
}
