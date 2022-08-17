package awsl;

public class Class753 extends Class759 {
   private int Field3291 = 4;
   private int[] Field3292 = new int[]{0, 0, 255, 255};
   private int[] Field3293 = new int[]{-16777216, -16777216, -1, -1};

   public Class753() {
      this.Method89();
   }

   public Class753(int[] a, int[] a) {
      this.Field3292 = a;
      this.Field3293 = a;
      this.Field3291 = a.length;
      this.Method89();
   }

   public void Method1619(int a, int a) {
      this.Field3293[a] = a;
      this.Method89();
   }

   public int Method1612(int a) {
      return this.Field3293[a];
   }

   public void Method1620(int a, int a) {
      int[] var3 = new int[this.Field3291 + 1];
      int[] var4 = new int[this.Field3291 + 1];
      System.arraycopy(this.Field3292, 0, var3, 0, this.Field3291);
      System.arraycopy(this.Field3293, 0, var4, 0, this.Field3291);
      this.Field3292 = var3;
      this.Field3293 = var4;
      this.Field3292[this.Field3291] = a;
      this.Field3293[this.Field3291] = a;
      ++this.Field3291;
      this.Method1622();
      this.Method89();
   }

   public void Method9(int a) {
      if (this.Field3291 > 4) {
         if (a < this.Field3291 - 1) {
            System.arraycopy(this.Field3292, a + 1, this.Field3292, a, this.Field3291 - a - 1);
            System.arraycopy(this.Field3293, a + 1, this.Field3293, a, this.Field3291 - a - 1);
         }

         --this.Field3291;
         this.Method89();
      }
   }

   public void Method1621(int a, int a) {
      this.Field3292[a] = Class767.Method1687(a);
      this.Method1622();
      this.Method89();
   }

   private void Method89() {
      Class193.Method1270();
      this.Field3292[0] = -1;
      this.Field3292[this.Field3291 - 1] = 256;
      this.Field3293[0] = this.Field3293[1];
      this.Field3293[this.Field3291 - 1] = this.Field3293[this.Field3291 - 2];
      int var2 = 0;
      if (var2 < 256) {
         this.Field3332[var2] = Class776.Method1725(var2, this.Field3291, this.Field3292, this.Field3293);
         ++var2;
      }

   }

   private void Method1622() {
      Class193.Method1269();
      int var2 = 1;
      if (var2 < this.Field3291) {
         int var3 = 1;
         if (var3 < var2) {
            if (this.Field3292[var2] < this.Field3292[var3]) {
               int var4 = this.Field3292[var2];
               this.Field3292[var2] = this.Field3292[var3];
               this.Field3292[var3] = var4;
               var4 = this.Field3293[var2];
               this.Field3293[var2] = this.Field3293[var3];
               this.Field3293[var3] = var4;
            }

            ++var3;
         }

         ++var2;
      }

   }
}
