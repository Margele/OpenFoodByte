package awsl;

import java.awt.image.BufferedImage;

public class Class8 extends Class119 {
   private float Field111;
   private float Field112;
   private float Field113;
   private float Field114;
   private float Field115;
   private int Field116;
   private int Field117;

   public Class8() {
      this(0.5F);
   }

   public Class8(float a) {
      this.Field112 = 0.0F;
      this.Field113 = 5.0F;
      this.Field116 = -1;
      this.Field117 = -16777216;
      this.Method58(a);
   }

   public void Method56(float a) {
      this.Field113 = a;
   }

   public float Method57() {
      return this.Field113;
   }

   public void Method58(float a) {
      this.Field111 = a;
   }

   public float Method59() {
      return this.Field111;
   }

   public void Method60(float a) {
      this.Field112 = a;
   }

   public float Method61() {
      return this.Field112;
   }

   public void Method9(int a) {
      this.Field116 = a;
   }

   public int Method10() {
      return this.Field116;
   }

   public void Method11(int a) {
      this.Field117 = a;
   }

   public int Method12() {
      return this.Field117;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      a = (new Class187((float)((int)this.Field113))).Method62(a, (BufferedImage)null);
      this.Field114 = 765.0F * (this.Field111 - this.Field112 * 0.5F);
      this.Field115 = 765.0F * (this.Field111 + this.Field112 * 0.5F);
      return super.Method62(a, a);
   }

   public int Method3(int a, int a1, int a) {
      int a = a & -16777216;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a + a + a;
      float a = Class776.Method1708(this.Field114, this.Field115, (float)a);
      return Class776.Method1719(a, this.Field117, this.Field116);
   }

   public String toString() {
      return "Stylize/Stamp...";
   }
}
