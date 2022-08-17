package awsl;

public class Class42 extends Class62 {
   private float Field332;
   private float Field333;
   private float Field334;

   public Class42() {
      this(1.0F);
   }

   public Class42(float a) {
      this(a, a, a);
   }

   public Class42(float a, float a, float a) {
      this.Method3240(a, a, a);
   }

   public void Method3240(float a, float a, float a) {
      this.Field332 = a;
      this.Field333 = a;
      this.Field334 = a;
      this.Field633 = false;
   }

   public void Method56(float a) {
      this.Method3240(a, a, a);
   }

   public float Method57() {
      return this.Field332;
   }

   protected void Method89() {
      Class193.Method1270();
      this.Field630 = this.Method3241(this.Field332);
      if (this.Field333 == this.Field332) {
         this.Field631 = this.Field630;
      }

      this.Field631 = this.Method3241(this.Field333);
      if (this.Field334 == this.Field332) {
         this.Field632 = this.Field630;
      }

      if (this.Field334 == this.Field333) {
         this.Field632 = this.Field631;
      }

      this.Field632 = this.Method3241(this.Field334);
   }

   private int[] Method3241(float a) {
      int[] var2 = new int[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         int var4 = (int)(255.0 * Math.pow((double)var3 / 255.0, 1.0 / (double)a) + 0.5);
         if (var4 > 255) {
            var4 = 255;
         }

         var2[var3] = var4;
      }

      return var2;
   }

   public String toString() {
      return "Colors/Gamma...";
   }
}
