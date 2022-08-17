package awsl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Hashtable;

public class Class872 extends Class193 {
   private int Field3804;
   private int Field3805;
   private int Field3806;
   private int Field3807;

   public Class872() {
      this(32, 32);
   }

   public Class872(int a, int a) {
      this.Field3804 = a;
      this.Field3805 = a;
   }

   public void Method9(int a) {
      this.Field3804 = a;
   }

   public int Method10() {
      return this.Field3804;
   }

   public void Method11(int a) {
      this.Field3805 = a;
   }

   public int Method12() {
      return this.Field3805;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      ColorModel a = a.getColorModel();
      a = new BufferedImage(a, a.createCompatibleWritableRaster(this.Field3804, this.Field3805), a.isAlphaPremultiplied(), (Hashtable)null);
      Graphics2D a = a.createGraphics();
      int a = 0;
      if (a < this.Field3805) {
         int a = 0;
         int var10000;
         if (a < this.Field3804) {
            a.drawImage(a, (BufferedImageOp)null, a, a);
            var10000 = a + a;
         }

         var10000 = a + a;
      }

      a.dispose();
      return a;
   }

   public String toString() {
      return "Tile";
   }
}
