package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Class72 extends Class193 {
   private BufferedImageOp Field688;
   private int Field689;

   public Class72(BufferedImageOp a, int a) {
      this.Field688 = a;
      this.Field689 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      BufferedImage var4 = a;
      int var5 = 0;
      if (var5 < this.Field689) {
         var4 = this.Field688.Method62(a, a);
         ++var5;
      }

      return var4;
   }
}
