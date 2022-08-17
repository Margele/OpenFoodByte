package awsl;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.util.Hashtable;

public class Class191 extends Class193 {
   private int Field1155;
   private int Field1156;

   public Class191() {
      this(32, 32);
   }

   public Class191(int a, int a) {
      this.Field1155 = a;
      this.Field1156 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      ColorModel var5 = a.getColorModel();
      a = new BufferedImage(var5, var5.createCompatibleWritableRaster(this.Field1155, this.Field1156), var5.isAlphaPremultiplied(), (Hashtable)null);
      Graphics2D var6 = a.createGraphics();
      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      var6.drawImage(a, 0, 0, this.Field1155, this.Field1156, (ImageObserver)null);
      var6.dispose();
      return a;
   }

   public String toString() {
      return "Distort/Bicubic Scale";
   }
}
