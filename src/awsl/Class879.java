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
      Rectangle a = new Rectangle(0, 0, a.getWidth(), a.getHeight());
      if (this.Field3836) {
         float a = this.Field3834 * (float)Math.cos((double)this.Field3833);
         float a = -this.Field3834 * (float)Math.sin((double)this.Field3833);
         a.width += (int)(Math.abs(a) + 2.0F * this.Field3832);
         a.height += (int)(Math.abs(a) + 2.0F * this.Field3832);
      }

      return a;
   }

   public Point2D Method1265(Point2D a, Point2D a1) {
      int a = Class193.Method1270();
      Point2D a = new Point2D.Double();
      if (this.Field3836) {
         float a = this.Field3834 * (float)Math.cos((double)this.Field3833);
         float a = -this.Field3834 * (float)Math.sin((double)this.Field3833);
         float a = Math.max(0.0F, this.Field3832 - a);
         float a = Math.max(0.0F, this.Field3832 - a);
         a.setLocation(a.getX() + (double)a, a.getY() + (double)a);
      }

      a.setLocation(a.getX(), a.getY());
      return a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      float a = this.Field3834 * (float)Math.cos((double)this.Field3833);
      float a = -this.Field3834 * (float)Math.sin((double)this.Field3833);
      if (this.Field3836) {
         ColorModel a = a.getColorModel();
         new BufferedImage(a, a.createCompatibleWritableRaster(a.getWidth() + (int)(Math.abs(a) + this.Field3832), a.getHeight() + (int)(Math.abs(a) + this.Field3832)), a.isAlphaPremultiplied(), (Hashtable)null);
      }

      a = this.Method1263(a, (ColorModel)null);
      float a = (float)(this.Field3838 >> 16 & 255) / 255.0F;
      float a = (float)(this.Field3838 >> 8 & 255) / 255.0F;
      float a = (float)(this.Field3838 & 255) / 255.0F;
      float[][] a = new float[][]{{0.0F, 0.0F, 0.0F, a}, {0.0F, 0.0F, 0.0F, a}, {0.0F, 0.0F, 0.0F, a}, {0.0F, 0.0F, 0.0F, this.Field3835}};
      BufferedImage a = new BufferedImage(a, a, 2);
      (new BandCombineOp(a, (RenderingHints)null)).filter(a.getRaster(), a.getRaster());
      a = (new Class187(this.Field3832)).Method62(a, (BufferedImage)null);
      Graphics2D a = a.createGraphics();
      a.setComposite(AlphaComposite.getInstance(3, this.Field3835));
      if (this.Field3836) {
         float a = this.Field3832 / 2.0F;
         float a = Math.max(0.0F, this.Field3832 - a);
         float a = Math.max(0.0F, this.Field3832 - a);
         a.translate((double)a, (double)a);
      }

      a.drawRenderedImage(a, AffineTransform.getTranslateInstance((double)a, (double)a));
      if (!this.Field3837) {
         a.setComposite(AlphaComposite.SrcOver);
         a.drawRenderedImage(a, (AffineTransform)null);
      }

      a.dispose();
      if (a.trash() == null) {
         Class193.Method1268(false);
      }

      return a;
   }

   public String toString() {
      return "Stylize/Drop Shadow...";
   }
}
