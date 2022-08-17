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

   public int Method3(int a, int a, int a2) {
      Class193.Method1269();
      a = (int)((float)a + this.Field258 + this.Field260 / 2.0F);
      a = (int)((float)a + this.Field259 + this.Field261 / 2.0F);
      float a = Class776.Method1714((float)a, this.Field258 + this.Field260);
      float a = Class776.Method1714((float)a, this.Field259 + this.Field261);
      int a = (int)((float)a / (this.Field258 + this.Field260));
      int a = (int)((float)a / (this.Field259 + this.Field261));
      boolean a = a < this.Field258;
      boolean a = a < this.Field259;
      float a;
      float a;
      if (this.Field267) {
         a = Math.abs(this.Field258 / 2.0F - a) / this.Field258 / 2.0F;
         a = Math.abs(this.Field259 / 2.0F - a) / this.Field259 / 2.0F;
      }

      a = 0.0F;
      a = 0.0F;
      float a;
      float a;
      if (this.Field268) {
         a = Class776.Method1708(this.Field258 / 2.0F, this.Field258 / 2.0F + this.Field260, Math.abs(this.Field258 / 2.0F - a));
         a = Class776.Method1708(this.Field259 / 2.0F, this.Field259 / 2.0F + this.Field261, Math.abs(this.Field259 / 2.0F - a));
      }

      a = 0.0F;
      a = 0.0F;
      if (this.Field266) {
         ;
      }

      int a = this.Field264;
      int a = this.Field265;
      int a = a % this.Field263;
      int a = a % this.Field262;
      int a = this.Field269[a][a];
      int a = a == 1 ? a : a;
      a = Class776.Method1719(2.0F * (a == 1 ? a : a), a, -16777216);
      if (this.Field268) {
         if (a != this.Field269[(a + 1) % this.Field262][a]) {
            a = 1.0F - a;
            a *= 0.5F;
            a = Class776.Method1719(a, a, -16777216);
         }

         a = Class776.Method1719(0.5F, a, -16777216);
      }

      a = Class776.Method1719(2.0F * a, a, -16777216);
      if (this.Field268) {
         if (a != this.Field269[a][(a + 1) % this.Field263]) {
            if (a == 1) {
               a = 1.0F - a;
            }

            a *= 0.5F;
            a = Class776.Method1719(a, a, -16777216);
         }

         if (a == 1) {
            a = Class776.Method1719(0.5F, a, -16777216);
         }
      }

      a = Class776.Method1719(2.0F * a, a, -16777216);
      int a = 0;
      return a;
   }

   public String toString() {
      return "Texture/Weave...";
   }
}
