package awsl;

public class Class698 {
   private static int Method2615(float a, float a, float a) {
      return (double)a == 0.0 ? 0 : (int)Math.round(255.0 * Math.pow((double)(a * a), (double)a));
   }

   public static int Method2616(float a) {
      Class193.Method1269();
      float var2 = 0.8F;
      int var7 = (int)a;
      float var3;
      float var4;
      float var5;
      if (var7 < 380) {
         var3 = 0.0F;
         var4 = 0.0F;
         var5 = 0.0F;
      }

      if (var7 < 440) {
         var3 = -(a - 440.0F) / 60.0F;
         var4 = 0.0F;
         var5 = 1.0F;
      }

      if (var7 < 490) {
         var3 = 0.0F;
         var4 = (a - 440.0F) / 50.0F;
         var5 = 1.0F;
      }

      if (var7 < 510) {
         var3 = 0.0F;
         var4 = 1.0F;
         var5 = -(a - 510.0F) / 20.0F;
      }

      if (var7 < 580) {
         var3 = (a - 510.0F) / 70.0F;
         var4 = 1.0F;
         var5 = 0.0F;
      }

      if (var7 < 645) {
         var3 = 1.0F;
         var4 = -(a - 645.0F) / 65.0F;
         var5 = 0.0F;
      }

      if (var7 <= 780) {
         var3 = 1.0F;
         var4 = 0.0F;
         var5 = 0.0F;
      }

      var3 = 0.0F;
      var4 = 0.0F;
      var5 = 0.0F;
      float var6;
      if (380 <= var7 && var7 <= 419) {
         var6 = 0.3F + 0.7F * (a - 380.0F) / 40.0F;
      }

      if (420 <= var7 && var7 <= 700) {
         var6 = 1.0F;
      }

      if (701 <= var7 && var7 <= 780) {
         var6 = 0.3F + 0.7F * (780.0F - a) / 80.0F;
      }

      var6 = 0.0F;
      int var8 = Method2615(var3, var6, var2);
      int var9 = Method2615(var4, var6, var2);
      int var10 = Method2615(var5, var6, var2);
      return -16777216 | var8 << 16 | var9 << 8 | var10;
   }
}
