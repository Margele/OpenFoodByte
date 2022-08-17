package awsl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.util.Random;

public class Class878 extends Class193 {
   private float Field3822 = 0.5F;
   private float Field3823 = 0.5F;
   private float Field3824;
   private float Field3825;
   private float Field3826;
   private float Field3827;
   private float Field3828 = 1.0F;
   private float Field3829 = 1.0F;
   private int Field3830 = 5;
   private int Field3831;

   public void Method56(float a) {
      this.Field3825 = a;
   }

   public float Method57() {
      return this.Field3825;
   }

   public void Method58(float a) {
      this.Field3824 = a;
   }

   public float Method59() {
      return this.Field3824;
   }

   public void Method60(float a) {
      this.Field3826 = a;
   }

   public float Method61() {
      return this.Field3826;
   }

   public void Method164(float a) {
      this.Field3827 = a;
   }

   public float Method165() {
      return this.Field3827;
   }

   public void Method166(float a) {
      this.Field3828 = a;
   }

   public float Method167() {
      return this.Field3828;
   }

   public void Method168(float a) {
      this.Field3829 = a;
   }

   public float Method169() {
      return this.Field3829;
   }

   public void Method170(float a) {
      this.Field3822 = a;
   }

   public float Method171() {
      return this.Field3822;
   }

   public void Method172(float a) {
      this.Field3823 = a;
   }

   public float Method173() {
      return this.Field3823;
   }

   public void Method330(Point2D a) {
      this.Field3822 = (float)a.getX();
      this.Field3823 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3822, this.Field3823);
   }

   public void Method9(int a) {
      this.Field3830 = a;
   }

   public int Method10() {
      return this.Field3830;
   }

   public void Method11(int a) {
      this.Field3831 = a;
   }

   public int Method12() {
      return this.Field3831;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      boolean var3 = Class193.Method1269();
      a = this.Method1263(a, (ColorModel)null);
      float var4 = (float)a.getWidth();
      float var5 = (float)a.getHeight();
      float var6 = (float)a.getWidth() * this.Field3822;
      float var7 = (float)a.getHeight() * this.Field3823;
      float var8 = (float)Math.sqrt((double)(var6 * var6 + var7 * var7));
      int var9 = this.Field3830 * this.Field3830;
      Class700[] var10 = new Class700[var9];
      float[] var11 = new float[var9];
      float[] var12 = new float[var9];
      float[] var13 = new float[var9];
      Graphics2D var14 = a.createGraphics();
      Random var15 = new Random(0L);
      float var16 = 0.0F;
      float var17 = 0.0F;
      int var18 = 0;
      Rectangle var25;
      if (var18 < this.Field3830) {
         int var19 = (int)var5 * var18 / this.Field3830;
         int var20 = (int)var5 * (var18 + 1) / this.Field3830;
         int var21 = 0;
         if (var21 < this.Field3830) {
            int var22 = var18 * this.Field3830 + var21;
            int var23 = (int)var4 * var21 / this.Field3830;
            int var24 = (int)var4 * (var21 + 1) / this.Field3830;
            var11[var22] = (float)this.Field3831 * var15.nextFloat();
            var12[var22] = (float)this.Field3831 * var15.nextFloat();
            var11[var22] = 0.0F;
            var12[var22] = 0.0F;
            var13[var22] = (float)this.Field3831 * (2.0F * var15.nextFloat() - 1.0F);
            var25 = new Rectangle(var23, var19, var24 - var23, var20 - var19);
            var10[var22] = new Class700();
            var10[var22].Field3025 = var25;
            var10[var22].Field3018 = (float)(var23 + var24) * 0.5F;
            var10[var22].Field3019 = (float)(var19 + var20) * 0.5F;
            var10[var22].Field3020 = var4 - (var6 - (float)var21);
            var10[var22].Field3021 = var5 - (var7 - (float)var18);
            var10[var22].Field3022 = (float)(var24 - var23);
            var10[var22].Field3023 = (float)(var20 - var19);
            ++var21;
         }

         ++var18;
      }

      byte var28 = 0;
      if (var28 < var9) {
         float var29 = (float)var28 / (float)var9;
         double var30 = (double)(var29 * 2.0F) * Math.PI;
         float var31 = this.Field3825 * var4 * (float)Math.cos(var30);
         float var32 = this.Field3825 * var5 * (float)Math.sin(var30);
         Class700 var33 = var10[var28];
         var25 = var33.Field3025.getBounds();
         AffineTransform var26 = var14.getTransform();
         var31 = var33.Field3018 + this.Field3825 * var33.Field3020;
         var32 = var33.Field3019 + this.Field3825 * var33.Field3021;
         var14.translate((double)var31, (double)var32);
         var14.rotate((double)(this.Field3825 * var13[var28]));
         var14.setColor(Color.getHSBColor(var29, 1.0F, 1.0F));
         Shape var27 = var14.getClip();
         var14.clip(var33.Field3025);
         var14.drawImage(a, 0, 0, (ImageObserver)null);
         var14.setClip(var27);
         var14.setTransform(var26);
         var18 = var28 + 1;
      }

      var14.dispose();
      return a;
   }

   public String toString() {
      return "Transition/Shatter...";
   }
}
