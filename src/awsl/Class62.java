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

   public int Method3(int a, int a, int a) {
      int var4 = a & -16777216;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      var5 = this.Field630[var5];
      var6 = this.Field631[var6];
      var7 = this.Field632[var7];
      return var4 | var5 << 16 | var6 << 8 | var7;
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
      int[] var2 = new int[256];
      int var3 = 0;
      if (var3 < 256) {
         var2[var3] = Class767.Method1687((int)(255.0F * this.Method29((float)var3 / 255.0F)));
         ++var3;
      }

      return var2;
   }

   protected float Method29(float a) {
      return 0.0F;
   }

   public int[] Method3782() {
      boolean var1 = Class193.Method1269();
      if (!this.Field633) {
         this.Method89();
      }

      int[] var2 = new int[256];
      int var3 = 0;
      if (var3 < 256) {
         var2[var3] = this.Method3(0, 0, var3 << 24 | var3 << 16 | var3 << 8 | var3);
         ++var3;
      }

      return var2;
   }
}
