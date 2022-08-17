package awsl;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class882 extends Class193 {
   private float Field3849 = 5.0F;
   private float Field3850 = 5.4977875F;
   private float Field3851 = 5.0F;
   private float Field3852 = 0.5F;
   private boolean Field3853 = false;
   private int Field3854 = -1;
   private float Field3855 = 0.2F;
   private float Field3856 = 0.0F;

   public void Method56(float a) {
      this.Field3850 = a;
   }

   public float Method57() {
      return this.Field3850;
   }

   public void Method58(float a) {
      this.Field3851 = a;
   }

   public float Method59() {
      return this.Field3851;
   }

   public void Method60(float a) {
      this.Field3849 = a;
   }

   public float Method61() {
      return this.Field3849;
   }

   public void Method164(float a) {
      this.Field3852 = a;
   }

   public float Method165() {
      return this.Field3852;
   }

   public void Method9(int a) {
      this.Field3854 = a;
   }

   public int Method10() {
      return this.Field3854;
   }

   public void Method87(boolean a) {
      this.Field3853 = a;
   }

   public boolean Method88() {
      return this.Field3853;
   }

   public void Method166(float a) {
      this.Field3855 = a;
   }

   public float Method167() {
      return this.Field3855;
   }

   public void Method168(float a) {
      this.Field3856 = a;
   }

   public float Method169() {
      return this.Field3856;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      float var5 = this.Field3851 * (float)Math.cos((double)this.Field3850);
      float var6 = -this.Field3851 * (float)Math.sin((double)this.Field3850);
      new BufferedImage(var3, var4, 2);
      Class111 var8 = new Class111(this.Field3852 * 10.0F, 0.75F, 0.1F);
      BufferedImage var7 = var8.Method62(a, (BufferedImage)null);
      BufferedImage var9 = new BufferedImage(var3, var4, 2);
      Graphics2D var10 = var9.createGraphics();
      var10.setColor(new Color(this.Field3854));
      var10.fillRect(0, 0, var3, var4);
      var10.setComposite(AlphaComposite.DstIn);
      var10.drawRenderedImage(var7, (AffineTransform)null);
      var10.setComposite(AlphaComposite.DstOut);
      var10.translate((double)var5, (double)var6);
      var10.drawRenderedImage(var7, (AffineTransform)null);
      var10.dispose();
      var9 = (new Class187(this.Field3849)).Method62(var9, (BufferedImage)null);
      var9 = (new Class40(3.0F * this.Field3855)).Method62(var9, var9);
      var10 = a.createGraphics();
      var10.drawRenderedImage(a, (AffineTransform)null);
      var10.setComposite(new Class246(1.0F));
      var10.drawRenderedImage(var9, (AffineTransform)null);
      var10.dispose();
      return a;
   }

   public String toString() {
      return "Stylize/Shine...";
   }
}
