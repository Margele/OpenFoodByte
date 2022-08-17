package awsl;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;

public class Class85 extends Class193 {
   private float Field725 = 0.5F;
   private float Field726 = 0.5F;
   private float Field727;
   private float Field728;
   private float Field729;
   private float Field730;
   private float Field731 = 1.0F;
   private float Field732 = 1.0F;
   private int Field733;

   public Class85() {
   }

   public Class85(float a, float a, float a, float a) {
      this.Field727 = a;
      this.Field728 = a;
      this.Field729 = a;
      this.Field730 = a;
   }

   public void Method56(float a) {
      this.Field728 = a;
   }

   public float Method57() {
      return this.Field728;
   }

   public void Method58(float a) {
      this.Field727 = a;
   }

   public float Method59() {
      return this.Field727;
   }

   public void Method60(float a) {
      this.Field729 = a;
   }

   public float Method61() {
      return this.Field729;
   }

   public void Method164(float a) {
      this.Field730 = a;
   }

   public float Method165() {
      return this.Field730;
   }

   public void Method166(float a) {
      this.Field731 = a;
   }

   public float Method167() {
      return this.Field731;
   }

   public void Method168(float a) {
      this.Field732 = a;
   }

   public float Method169() {
      return this.Field732;
   }

   public void Method170(float a) {
      this.Field725 = a;
   }

   public float Method171() {
      return this.Field725;
   }

   public void Method172(float a) {
      this.Field726 = a;
   }

   public float Method173() {
      return this.Field726;
   }

   public void Method330(Point2D a) {
      this.Field725 = (float)a.getX();
      this.Field726 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field725, this.Field726);
   }

   public void Method9(int a) {
      this.Field733 = a;
   }

   public int Method10() {
      return this.Field733;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      boolean var3 = Class193.Method1269();
      a = this.Method1263(a, (ColorModel)null);
      float var4 = (float)a.getWidth() * this.Field725;
      float var5 = (float)a.getHeight() * this.Field726;
      float var6 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
      float var7 = (float)((double)this.Field727 * Math.cos((double)this.Field728));
      float var8 = (float)((double)this.Field727 * -Math.sin((double)this.Field728));
      float var9 = (float)Math.exp((double)this.Field730);
      float var10 = this.Field729;
      Graphics2D var11;
      if (this.Field733 == 0) {
         var11 = a.createGraphics();
         var11.drawRenderedImage(a, (AffineTransform)null);
         var11.dispose();
         return a;
      } else {
         var11 = a.createGraphics();
         var11.drawImage(a, (AffineTransform)null, (ImageObserver)null);
         int var12 = 0;
         if (var12 < this.Field733) {
            var11.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            var11.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var11.setComposite(AlphaComposite.getInstance(3, Class776.Method1717((float)var12 / (float)(this.Field733 - 1), this.Field731, this.Field732)));
            var11.translate((double)(var4 + var7), (double)(var5 + var8));
            var11.scale((double)var9, (double)var9);
            if (this.Field729 != 0.0F) {
               var11.rotate((double)var10);
            }

            var11.translate((double)(-var4), (double)(-var5));
            var11.drawImage(a, (AffineTransform)null, (ImageObserver)null);
            ++var12;
         }

         var11.dispose();
         return a;
      }
   }

   public String toString() {
      return "Effects/Feedback...";
   }
}
