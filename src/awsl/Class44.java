package awsl;

import java.awt.image.BufferedImage;

public class Class44 extends Class119 {
   private int Field339 = -16777216;
   private int Field340 = -7829368;
   private int Field341 = -1;
   private int[] Field342;

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      this.Field342 = new int[256];
      int var4 = 0;
      float var5;
      if (var4 < 128) {
         var5 = (float)var4 / 127.0F;
         this.Field342[var4] = Class776.Method1719(var5, this.Field339, this.Field340);
         ++var4;
      }

      short var6 = 128;
      if (var6 < 256) {
         var5 = (float)(var6 - 127) / 128.0F;
         this.Field342[var6] = Class776.Method1719(var5, this.Field340, this.Field341);
         var4 = var6 + 1;
      }

      a = super.Method62(a, a);
      this.Field342 = null;
      return a;
   }

   public int Method3(int a, int a, int a) {
      return this.Field342[Class767.Method1689(a)];
   }

   public void Method9(int a) {
      this.Field339 = a;
   }

   public int Method10() {
      return this.Field339;
   }

   public void Method11(int a) {
      this.Field340 = a;
   }

   public int Method12() {
      return this.Field340;
   }

   public void Method13(int a) {
      this.Field341 = a;
   }

   public int Method14() {
      return this.Field341;
   }

   public String toString() {
      return "Colors/Tritone...";
   }
}
