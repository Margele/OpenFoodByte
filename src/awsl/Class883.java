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
      ColorModel var3 = a.getColorModel();
      a = new BufferedImage(var3, var3.createCompatibleWritableRaster(this.Field3857, this.Field3858), var3.isAlphaPremultiplied(), (Hashtable)null);
      Image var5 = a.getScaledInstance(this.Field3857, this.Field3858, 16);
      Graphics2D var4 = a.createGraphics();
      var4.drawImage(var5, 0, 0, this.Field3857, this.Field3858, (ImageObserver)null);
      var4.dispose();
      return a;
   }

   public String toString() {
      return "Distort/Scale";
   }
}
