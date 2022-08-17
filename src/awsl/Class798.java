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
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      this.Field3569 = new Rectangle(0, 0, a, a);
      this.Field3568 = new Rectangle(0, 0, a, a);
      this.Method834(this.Field3568);
      ColorModel a = a.getColorModel();
      a = new BufferedImage(a, a.createCompatibleWritableRaster(this.Field3568.width, this.Field3568.height), a.isAlphaPremultiplied(), (Hashtable)null);
      WritableRaster a = a.getRaster();
      int[] a = this.Method104(a, 0, 0, a, a, (int[])null);
      a = this.Method714(a, a, a, this.Field3568);
      this.Method1267(a, 0, 0, this.Field3568.width, this.Field3568.height, a);
      return a;
   }

   protected void Method834(Rectangle a) {
   }

   protected abstract int[] Method714(int integer1, int integer2, int[] arr, Rectangle rectangle);
}
