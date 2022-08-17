package awsl;

import java.awt.image.BufferedImage;

class Class754 {
   private int Field3294;
   private int Field3295;
   private int Field3296;
   private int[] Field3297;

   public Class754(BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      this.Field3297 = Class779.Method842(a, 0, 0, a, a, (int[])null);
   }

   public int Method1630(float a, float a) {
      int a = (int)Math.floor((double)a);
      Class193.Method1270();
      int a = (int)Math.floor((double)a);
      float a = a - (float)a;
      float a = a - (float)a;
      if (a < this.Field3295 - 1 && a < this.Field3296 - 1) {
         int a = this.Field3295 * a + a;
         int var10000 = this.Field3297[a];
         var10000 = this.Field3297[a + 1];
         var10000 = this.Field3297[a + this.Field3295];
         var10000 = this.Field3297[a + this.Field3295 + 1];
      }

      int a = this.Method1631(this.Field3297, a, a, this.Field3295, this.Field3296);
      int a = this.Method1631(this.Field3297, a + 1, a, this.Field3295, this.Field3296);
      int a = this.Method1631(this.Field3297, a, a + 1, this.Field3295, this.Field3296);
      int a = this.Method1631(this.Field3297, a + 1, a + 1, this.Field3295, this.Field3296);
      return Class776.Method1720(a, a, a, a, a, a);
   }

   private final int Method1631(int[] a, int a, int a, int a, int a) {
      if (a < a && a < a) {
         return a[a * a + a];
      } else {
         switch (this.Field3294) {
            case 0:
            default:
               return 0;
            case 1:
               return a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)];
            case 2:
               return a[Class776.Method1715(a, a) * a + Class776.Method1715(a, a)];
         }
      }
   }
}
