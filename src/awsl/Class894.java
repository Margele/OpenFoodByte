package awsl;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Class894 extends Class877 {
   private float Field3926;
   private float Field3927;
   private float Field3928;
   private float Field3929;
   private float Field3930;
   private float Field3931;
   private float Field3932;
   private float Field3933;
   private float Field3934;
   private float Field3935;
   private float Field3936;
   private float Field3937;
   private float Field3938;
   private float Field3939;
   private float Field3940;
   private float Field3941;
   private float Field3942;
   private float Field3943;
   private float Field3944;
   private float Field3945;
   private float Field3946;
   private float Field3947;
   private float Field3948;
   private float Field3949;
   private float Field3950;
   private float Field3951;
   private float Field3952;
   private float Field3953;
   private float Field3954;
   private float Field3955;
   private float Field3956;
   private float Field3957;
   private boolean Field3958;
   private boolean Field3959;

   public Class894() {
      this(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F);
   }

   public Class894(float a, float a, float a, float a, float a, float a, float a, float a) {
      this.Field3959 = false;
      this.Method3561(a, a, a, a, a, a, a, a);
   }

   public void Method87(boolean a) {
      this.Field3959 = a;
   }

   public boolean Method88() {
      return this.Field3959;
   }

   public void Method3560(float a, float a, float a, float a, float a, float a, float a, float a) {
      this.Method3561(a, a, a, a, a, a, a, a);
      this.Field3958 = true;
   }

   public void Method3561(float a, float a, float a, float a, float a, float a, float a, float a) {
      this.Field3926 = a;
      this.Field3927 = a;
      this.Field3928 = a;
      Class193.Method1269();
      this.Field3929 = a;
      this.Field3930 = a;
      this.Field3931 = a;
      this.Field3932 = a;
      this.Field3933 = a;
      this.Field3934 = a - a;
      this.Field3935 = a - a;
      this.Field3936 = a - a;
      this.Field3937 = a - a;
      this.Field3938 = a - a + a - a;
      this.Field3939 = a - a + a - a;
      if (this.Field3938 == 0.0F && this.Field3939 == 0.0F) {
         this.Field3949 = a - a;
         this.Field3952 = a - a;
         this.Field3955 = a;
         this.Field3950 = a - a;
         this.Field3953 = a - a;
         this.Field3956 = a;
         this.Field3951 = this.Field3954 = 0.0F;
      }

      this.Field3951 = (this.Field3938 * this.Field3937 - this.Field3936 * this.Field3939) / (this.Field3934 * this.Field3937 - this.Field3935 * this.Field3936);
      this.Field3954 = (this.Field3934 * this.Field3939 - this.Field3935 * this.Field3938) / (this.Field3934 * this.Field3937 - this.Field3935 * this.Field3936);
      this.Field3949 = a - a + this.Field3951 * a;
      this.Field3952 = a - a + this.Field3954 * a;
      this.Field3955 = a;
      this.Field3950 = a - a + this.Field3951 * a;
      this.Field3953 = a - a + this.Field3954 * a;
      this.Field3956 = a;
      this.Field3957 = 1.0F;
      this.Field3958 = false;
   }

   public void Method3562(float a, float a, float a, float a, float a, float a, float a, float a) {
      this.Method3561(a, a, a, a, a, a, a, a);
      float var9 = this.Field3953 * this.Field3957 - this.Field3956 * this.Field3954;
      float var10 = this.Field3956 * this.Field3951 - this.Field3950 * this.Field3957;
      float var11 = this.Field3950 * this.Field3954 - this.Field3953 * this.Field3951;
      float var12 = this.Field3955 * this.Field3954 - this.Field3952 * this.Field3957;
      float var13 = this.Field3949 * this.Field3957 - this.Field3955 * this.Field3951;
      float var14 = this.Field3952 * this.Field3951 - this.Field3949 * this.Field3954;
      float var15 = this.Field3952 * this.Field3956 - this.Field3955 * this.Field3953;
      float var16 = this.Field3955 * this.Field3950 - this.Field3949 * this.Field3956;
      float var17 = this.Field3949 * this.Field3953 - this.Field3952 * this.Field3950;
      float var18 = 1.0F / var17;
      this.Field3949 = var9 * var18;
      this.Field3952 = var12 * var18;
      this.Field3955 = var15 * var18;
      this.Field3950 = var10 * var18;
      this.Field3953 = var13 * var18;
      this.Field3956 = var16 * var18;
      this.Field3951 = var11 * var18;
      this.Field3954 = var14 * var18;
      this.Field3957 = 1.0F;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3940 = this.Field3953 * this.Field3957 - this.Field3956 * this.Field3954;
      this.Field3941 = this.Field3955 * this.Field3954 - this.Field3952 * this.Field3957;
      this.Field3942 = this.Field3952 * this.Field3956 - this.Field3955 * this.Field3953;
      this.Field3943 = this.Field3956 * this.Field3951 - this.Field3950 * this.Field3957;
      this.Field3944 = this.Field3949 * this.Field3957 - this.Field3955 * this.Field3951;
      this.Field3945 = this.Field3955 * this.Field3950 - this.Field3949 * this.Field3956;
      this.Field3946 = this.Field3950 * this.Field3954 - this.Field3953 * this.Field3951;
      this.Field3947 = this.Field3952 * this.Field3951 - this.Field3949 * this.Field3954;
      this.Field3948 = this.Field3949 * this.Field3953 - this.Field3952 * this.Field3950;
      if (!this.Field3958) {
         int var3 = a.getWidth();
         int var4 = a.getHeight();
         float var5 = 1.0F / (float)var3;
         float var6 = 1.0F / (float)var4;
         this.Field3940 *= var5;
         this.Field3943 *= var5;
         this.Field3946 *= var5;
         this.Field3941 *= var6;
         this.Field3944 *= var6;
         this.Field3947 *= var6;
      }

      return super.Method62(a, a);
   }

   protected void Method834(Rectangle a) {
      if (this.Field3958) {
         a.x = (int)Math.min(Math.min(this.Field3926, this.Field3928), Math.min(this.Field3930, this.Field3932));
         a.y = (int)Math.min(Math.min(this.Field3927, this.Field3929), Math.min(this.Field3931, this.Field3933));
         a.width = (int)Math.max(Math.max(this.Field3926, this.Field3928), Math.max(this.Field3930, this.Field3932)) - a.x;
         a.height = (int)Math.max(Math.max(this.Field3927, this.Field3929), Math.max(this.Field3931, this.Field3933)) - a.y;
      } else {
         if (!this.Field3959) {
            float var2 = (float)a.getWidth();
            float var3 = (float)a.getHeight();
            Rectangle var4 = new Rectangle();
            var4.add(this.Method1265(new Point2D.Float(0.0F, 0.0F), (Point2D)null));
            var4.add(this.Method1265(new Point2D.Float(var2, 0.0F), (Point2D)null));
            var4.add(this.Method1265(new Point2D.Float(0.0F, var3), (Point2D)null));
            var4.add(this.Method1265(new Point2D.Float(var2, var3), (Point2D)null));
            a.setRect(var4);
         }

      }
   }

   public float Method57() {
      return this.Field3926 - (float)((int)Math.min(Math.min(this.Field3926, this.Field3928), Math.min(this.Field3930, this.Field3932)));
   }

   public float Method59() {
      return this.Field3927 - (float)((int)Math.min(Math.min(this.Field3927, this.Field3929), Math.min(this.Field3931, this.Field3933)));
   }

   public Rectangle2D Method1264(BufferedImage a) {
      if (this.Field3959) {
         return new Rectangle(0, 0, a.getWidth(), a.getHeight());
      } else {
         float var2 = (float)a.getWidth();
         float var3 = (float)a.getHeight();
         Rectangle2D.Float var4 = new Rectangle2D.Float();
         var4.add(this.Method1265(new Point2D.Float(0.0F, 0.0F), (Point2D)null));
         var4.add(this.Method1265(new Point2D.Float(var2, 0.0F), (Point2D)null));
         var4.add(this.Method1265(new Point2D.Float(0.0F, var3), (Point2D)null));
         var4.add(this.Method1265(new Point2D.Float(var2, var3), (Point2D)null));
         return var4;
      }
   }

   public Point2D Method1265(Point2D a, Point2D a) {
      Point2D.Float var6 = new Point2D.Float();
      float var3 = (float)a.getX();
      float var4 = (float)a.getY();
      float var5 = 1.0F / (var3 * this.Field3951 + var4 * this.Field3954 + this.Field3957);
      var6.setLocation((double)((var3 * this.Field3949 + var4 * this.Field3952 + this.Field3955) * var5), (double)((var3 * this.Field3950 + var4 * this.Field3953 + this.Field3956) * var5));
      return var6;
   }

   protected void Method3439(int a, int a, float[] a) {
      a[0] = (float)this.Field3821.width * (this.Field3940 * (float)a + this.Field3941 * (float)a + this.Field3942) / (this.Field3946 * (float)a + this.Field3947 * (float)a + this.Field3948);
      a[1] = (float)this.Field3821.height * (this.Field3943 * (float)a + this.Field3944 * (float)a + this.Field3945) / (this.Field3946 * (float)a + this.Field3947 * (float)a + this.Field3948);
   }

   public String toString() {
      return "Distort/Perspective...";
   }
}
