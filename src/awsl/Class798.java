package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public abstract class Class798 extends Class193 {
   protected Rectangle Field3568;
   protected Rectangle Field3569;

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      int var5 = a.getType();
      WritableRaster var6 = a.getRaster();
      this.Field3569 = new Rectangle(0, 0, var3, var4);
      this.Field3568 = new Rectangle(0, 0, var3, var4);
      this.Method834(this.Field3568);
      ColorModel var7 = a.getColorModel();
      a = new BufferedImage(var7, var7.createCompatibleWritableRaster(this.Field3568.width, this.Field3568.height), var7.isAlphaPremultiplied(), (Hashtable)null);
      WritableRaster var9 = a.getRaster();
      int[] var8 = this.Method104(a, 0, 0, var3, var4, (int[])null);
      var8 = this.Method714(var3, var4, var8, this.Field3568);
      this.Method1267(a, 0, 0, this.Field3568.width, this.Field3568.height, var8);
      return a;
   }

   protected void Method834(Rectangle a) {
   }

   protected abstract int[] Method714(int integer1, int integer2, int[] arr, Rectangle rectangle);
}
