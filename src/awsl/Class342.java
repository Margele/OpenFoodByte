package awsl;

import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class342 {
   public static float Field1649 = 0.0F;
   public static boolean Field1650 = false;

   public static float Method280(float a, float a, float a) {
      RenderUtils.trash();
      float var4 = GlobalModule.Field3185 * (a / 1000.0F);
      float var10000;
      if (a < a) {
         if (a + var4 < a) {
            var10000 = a + var4;
         }

         a = a;
      }

      if (a - var4 > a) {
         var10000 = a - var4;
      }

      return a;
   }

   public static float Method281(float a, float a, float a, float a) {
      return Method280(a, a, Math.max(10.0F, Math.abs(a - a) * a) * a);
   }

   public static float Method282() {
      Field1649 += GlobalModule.Field3185;
      if (Field1649 > 360.0F) {
         Field1649 = 0.0F;
      }

      return Field1649;
   }
}
