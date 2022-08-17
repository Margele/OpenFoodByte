package awsl;

import java.awt.image.BufferedImage;

public abstract class Class62 extends Class119 {
   protected int[] Field630;
   protected int[] Field631;
   protected int[] Field632;
   protected boolean Field633 = false;

   public Class62() {
      this.Field950 = true;
   }

   public int Method3(int a, int a1, int a) {
      int a = a & -16777216;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = this.Field630[a];
      a = this.Field631[a];
      a = this.Field632[a];
      return a | a << 16 | a << 8 | a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      if (!this.Field633) {
         this.Method89();
      }

      return super.Method62(a, a);
   }

   protected void Method89() {
      this.Field633 = true;
      this.Field630 = this.Field631 = this.Field632 = this.Method86();
   }

   protected int[] Method86() {
      Class193.Method1270();
      int[] a = new int[256];
      int a = 0;
      if (a < 256) {
         a[a] = Class767.Method1687((int)(255.0F * this.Method29((float)a / 255.0F)));
         ++a;
      }

      return a;
   }

   protected float Method29(float a) {
      return 0.0F;
   }

   public int[] Method3782() {
      int a = Class193.Method1269();
      if (!this.Field633) {
         this.Method89();
      }

      int[] a = new int[256];
      int a = 0;
      if (a < 256) {
         a[a] = this.Method3(0, 0, a << 24 | a << 16 | a << 8 | a);
         ++a;
      }

      return a;
   }
}
