package awsl;

public class Class698 {
   private static int Method2615(float a, float a, float a) {
      return (double)a == 0.0 ? 0 : (int)Math.round(255.0 * Math.pow((double)(a * a), (double)a));
   }

   public static int Method2616(float a) {
      Class193.Method1269();
      float a = 0.8F;
      int a = (int)a;
      float a;
      float a;
      float a;
      if (a < 380) {
         a = 0.0F;
         a = 0.0F;
         a = 0.0F;
      }

      if (a < 440) {
         a = -(a - 440.0F) / 60.0F;
         a = 0.0F;
         a = 1.0F;
      }

      if (a < 490) {
         a = 0.0F;
         a = (a - 440.0F) / 50.0F;
         a = 1.0F;
      }

      if (a < 510) {
         a = 0.0F;
         a = 1.0F;
         a = -(a - 510.0F) / 20.0F;
      }

      if (a < 580) {
         a = (a - 510.0F) / 70.0F;
         a = 1.0F;
         a = 0.0F;
      }

      if (a < 645) {
         a = 1.0F;
         a = -(a - 645.0F) / 65.0F;
         a = 0.0F;
      }

      if (a <= 780) {
         a = 1.0F;
         a = 0.0F;
         a = 0.0F;
      }

      a = 0.0F;
      a = 0.0F;
      a = 0.0F;
      float a;
      if (380 <= a && a <= 419) {
         a = 0.3F + 0.7F * (a - 380.0F) / 40.0F;
      }

      if (420 <= a && a <= 700) {
         a = 1.0F;
      }

      if (701 <= a && a <= 780) {
         a = 0.3F + 0.7F * (780.0F - a) / 80.0F;
      }

      a = 0.0F;
      int a = Method2615(a, a, a);
      int a = Method2615(a, a, a);
      int a = Method2615(a, a, a);
      return -16777216 | a << 16 | a << 8 | a;
   }
}
