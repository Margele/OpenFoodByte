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
      int a = a.getWidth();
      int a = a.getHeight();
      ColorModel a = a.getColorModel();
      a = new BufferedImage(a, a.createCompatibleWritableRaster(this.Field1155, this.Field1156), a.isAlphaPremultiplied(), (Hashtable)null);
      Graphics2D a = a.createGraphics();
      a.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      a.drawImage(a, 0, 0, this.Field1155, this.Field1156, (ImageObserver)null);
      a.dispose();
      return a;
   }

   public String toString() {
      return "Distort/Bicubic Scale";
   }
}
