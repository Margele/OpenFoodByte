package awsl;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.util.Hashtable;

public class Class883 extends Class193 {
   private int Field3857;
   private int Field3858;

   public Class883() {
      this(32, 32);
   }

   public Class883(int a, int a) {
      this.Field3857 = a;
      this.Field3858 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      ColorModel a = a.getColorModel();
      a = new BufferedImage(a, a.createCompatibleWritableRaster(this.Field3857, this.Field3858), a.isAlphaPremultiplied(), (Hashtable)null);
      Image a = a.getScaledInstance(this.Field3857, this.Field3858, 16);
      Graphics2D a = a.createGraphics();
      a.drawImage(a, 0, 0, this.Field3857, this.Field3858, (ImageObserver)null);
      a.dispose();
      return a;
   }

   public String toString() {
      return "Distort/Scale";
   }
}
