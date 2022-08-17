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
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      ColorModel var6 = a.getColorModel();
      a = new BufferedImage(var6, var6.createCompatibleWritableRaster(this.Field3804, this.Field3805), var6.isAlphaPremultiplied(), (Hashtable)null);
      Graphics2D var9 = a.createGraphics();
      byte var7 = 0;
      if (var7 < this.Field3805) {
         byte var8 = 0;
         int var10000;
         if (var8 < this.Field3804) {
            var9.drawImage(a, (BufferedImageOp)null, var8, var7);
            var10000 = var8 + var4;
         }

         var10000 = var7 + var5;
      }

      var9.dispose();
      return a;
   }

   public String toString() {
      return "Tile";
   }
}
