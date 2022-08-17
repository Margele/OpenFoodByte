package awsl;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.Hashtable;
import obfuscate.a;

public class Class879 extends Class193 {
   private float Field3832 = 5.0F;
   private float Field3833 = 4.712389F;
   private float Field3834 = 5.0F;
   private float Field3835 = 0.5F;
   private boolean Field3836 = false;
   private boolean Field3837 = false;
   private int Field3838 = -16777216;

   public Class879() {
   }

   public Class879(float a, float a, float a, float a) {
      this.Field3832 = a;
      this.Field3833 = (float)Math.atan2((double)a, (double)a);
      this.Field3834 = (float)Math.sqrt((double)(a * a + a * a));
      this.Field3835 = a;
   }

   public void Method56(float a) {
      this.Field3833 = a;
   }

   public float Method57() {
      return this.Field3833;
   }

   public void Method58(float a) {
      this.Field3834 = a;
   }

   public float Method59() {
      return this.Field3834;
   }

   public void Method60(float a) {
      this.Field3832 = a;
   }

   public float Method61() {
      return this.Field3832;
   }

   public void Method164(float a) {
      this.Field3835 = a;
   }

   public float Method165() {
      return this.Field3835;
   }

   public void Method9(int a) {
      this.Field3838 = a;
   }

   public int Method10() {
      return this.Field3838;
   }

   public void Method87(boolean a) {
      this.Field3836 = a;
   }

   public boolean Method88() {
      return this.Field3836;
   }

   public void Method1282(boolean a) {
      this.Field3837 = a;
   }

   public boolean Method1283() {
      return this.Field3837;
   }

   public Rectangle2D Method1264(BufferedImage a) {
      Rectangle var2 = new Rectangle(0, 0, a.getWidth(), a.getHeight());
      if (this.Field3836) {
         float var3 = this.Field3834 * (float)Math.cos((double)this.Field3833);
         float var4 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
         var2.width += (int)(Math.abs(var3) + 2.0F * this.Field3832);
         var2.height += (int)(Math.abs(var4) + 2.0F * this.Field3832);
      }

      return var2;
   }

   public Point2D Method1265(Point2D a, Point2D a) {
      boolean var3 = Class193.Method1270();
      Point2D.Double var8 = new Point2D.Double();
      if (this.Field3836) {
         float var4 = this.Field3834 * (float)Math.cos((double)this.Field3833);
         float var5 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
         float var6 = Math.max(0.0F, this.Field3832 - var5);
         float var7 = Math.max(0.0F, this.Field3832 - var4);
         var8.setLocation(a.getX() + (double)var7, a.getY() + (double)var6);
      }

      var8.setLocation(a.getX(), a.getY());
      return var8;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      float var6 = this.Field3834 * (float)Math.cos((double)this.Field3833);
      float var7 = -this.Field3834 * (float)Math.sin((double)this.Field3833);
      if (this.Field3836) {
         ColorModel var8 = a.getColorModel();
         new BufferedImage(var8, var8.createCompatibleWritableRaster(a.getWidth() + (int)(Math.abs(var6) + this.Field3832), a.getHeight() + (int)(Math.abs(var7) + this.Field3832)), var8.isAlphaPremultiplied(), (Hashtable)null);
      }

      a = this.Method1263(a, (ColorModel)null);
      float var17 = (float)(this.Field3838 >> 16 & 255) / 255.0F;
      float var9 = (float)(this.Field3838 >> 8 & 255) / 255.0F;
      float var10 = (float)(this.Field3838 & 255) / 255.0F;
      float[][] var11 = new float[][]{{0.0F, 0.0F, 0.0F, var17}, {0.0F, 0.0F, 0.0F, var9}, {0.0F, 0.0F, 0.0F, var10}, {0.0F, 0.0F, 0.0F, this.Field3835}};
      BufferedImage var12 = new BufferedImage(var4, var5, 2);
      (new BandCombineOp(var11, (RenderingHints)null)).filter(a.getRaster(), var12.getRaster());
      var12 = (new Class187(this.Field3832)).Method62(var12, (BufferedImage)null);
      Graphics2D var13 = a.createGraphics();
      var13.setComposite(AlphaComposite.getInstance(3, this.Field3835));
      if (this.Field3836) {
         float var14 = this.Field3832 / 2.0F;
         float var15 = Math.max(0.0F, this.Field3832 - var7);
         float var16 = Math.max(0.0F, this.Field3832 - var6);
         var13.translate((double)var16, (double)var15);
      }

      var13.drawRenderedImage(var12, AffineTransform.getTranslateInstance((double)var6, (double)var7));
      if (!this.Field3837) {
         var13.setComposite(AlphaComposite.SrcOver);
         var13.drawRenderedImage(a, (AffineTransform)null);
      }

      var13.dispose();
      if (a.trash() == null) {
         Class193.Method1268(false);
      }

      return a;
   }

   public String toString() {
      return "Stylize/Drop Shadow...";
   }
}
