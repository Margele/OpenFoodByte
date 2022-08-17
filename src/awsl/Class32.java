package awsl;

public class Class32 extends Class119 {
   private float Field258 = 16.0F;
   private float Field259 = 16.0F;
   private float Field260 = 6.0F;
   private float Field261 = 6.0F;
   private int Field262 = 4;
   private int Field263 = 4;
   private int Field264 = -32640;
   private int Field265 = -8355585;
   private boolean Field266 = true;
   private boolean Field267 = false;
   private boolean Field268 = true;
   public int[][] Field269 = new int[][]{{0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}};

   public void Method56(float a) {
      this.Field260 = a;
   }

   public void Method58(float a) {
      this.Field258 = a;
   }

   public float Method57() {
      return this.Field258;
   }

   public void Method60(float a) {
      this.Field259 = a;
   }

   public float Method59() {
      return this.Field259;
   }

   public float Method61() {
      return this.Field260;
   }

   public void Method164(float a) {
      this.Field261 = a;
   }

   public float Method165() {
      return this.Field261;
   }

   public void Method3437(int[][] a) {
      this.Field269 = a;
   }

   public int[][] Method3438() {
      return this.Field269;
   }

   public void Method87(boolean a) {
      this.Field266 = a;
   }

   public boolean Method88() {
      return this.Field266;
   }

   public void Method1282(boolean a) {
      this.Field267 = a;
   }

   public boolean Method1283() {
      return this.Field267;
   }

   public void Method1770(boolean a) {
      this.Field268 = a;
   }

   public boolean Method1771() {
      return this.Field268;
   }

   public int Method3(int a, int a, int a) {
      Class193.Method1269();
      a = (int)((float)a + this.Field258 + this.Field260 / 2.0F);
      a = (int)((float)a + this.Field259 + this.Field261 / 2.0F);
      float var5 = Class776.Method1714((float)a, this.Field258 + this.Field260);
      float var6 = Class776.Method1714((float)a, this.Field259 + this.Field261);
      int var7 = (int)((float)a / (this.Field258 + this.Field260));
      int var8 = (int)((float)a / (this.Field259 + this.Field261));
      boolean var9 = var5 < this.Field258;
      boolean var10 = var6 < this.Field259;
      float var11;
      float var12;
      if (this.Field267) {
         var11 = Math.abs(this.Field258 / 2.0F - var5) / this.Field258 / 2.0F;
         var12 = Math.abs(this.Field259 / 2.0F - var6) / this.Field259 / 2.0F;
      }

      var12 = 0.0F;
      var11 = 0.0F;
      float var13;
      float var14;
      if (this.Field268) {
         var13 = Class776.Method1708(this.Field258 / 2.0F, this.Field258 / 2.0F + this.Field260, Math.abs(this.Field258 / 2.0F - var5));
         var14 = Class776.Method1708(this.Field259 / 2.0F, this.Field259 / 2.0F + this.Field261, Math.abs(this.Field259 / 2.0F - var6));
      }

      var14 = 0.0F;
      var13 = 0.0F;
      if (this.Field266) {
         ;
      }

      int var15 = this.Field264;
      int var16 = this.Field265;
      int var18 = var7 % this.Field263;
      int var19 = var8 % this.Field262;
      int var20 = this.Field269[var19][var18];
      int var17 = var20 == 1 ? var15 : var16;
      var17 = Class776.Method1719(2.0F * (var20 == 1 ? var11 : var12), var17, -16777216);
      if (this.Field268) {
         if (var20 != this.Field269[(var8 + 1) % this.Field262][var18]) {
            var14 = 1.0F - var14;
            var14 *= 0.5F;
            var15 = Class776.Method1719(var14, var15, -16777216);
         }

         var15 = Class776.Method1719(0.5F, var15, -16777216);
      }

      var17 = Class776.Method1719(2.0F * var11, var15, -16777216);
      if (this.Field268) {
         if (var20 != this.Field269[var19][(var7 + 1) % this.Field263]) {
            if (var20 == 1) {
               var13 = 1.0F - var13;
            }

            var13 *= 0.5F;
            var16 = Class776.Method1719(var13, var16, -16777216);
         }

         if (var20 == 1) {
            var16 = Class776.Method1719(0.5F, var16, -16777216);
         }
      }

      var17 = Class776.Method1719(2.0F * var12, var16, -16777216);
      byte var21 = 0;
      return var21;
   }

   public String toString() {
      return "Texture/Weave...";
   }
}
