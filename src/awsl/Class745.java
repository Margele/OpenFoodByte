package awsl;

public class Class745 {
   public static final int Field3258 = 0;
   public static final int Field3259 = 1;
   public static final int Field3260 = 2;
   public static final int Field3261 = 3;
   protected int[][] Field3262;
   protected int Field3263;
   protected int[] Field3264;
   protected int[] Field3265;
   protected int[] Field3266;
   protected int[] Field3267;
   protected float[] Field3268;
   protected boolean Field3269;

   public Class745() {
      this.Field3262 = (int[][])null;
      this.Field3263 = 0;
      this.Field3269 = true;
      this.Field3264 = null;
      this.Field3265 = null;
      this.Field3266 = null;
      this.Field3267 = null;
      this.Field3268 = null;
   }

   public Class745(int[] a, int a, int a, int a, int a) {
      this.Field3262 = new int[3][256];
      this.Field3264 = new int[4];
      this.Field3265 = new int[4];
      this.Field3266 = new int[3];
      Class193.Method1270();
      this.Field3267 = new int[3];
      this.Field3268 = new float[3];
      this.Field3263 = a * a;
      this.Field3269 = true;
      boolean var7 = false;
      int var8 = 0;
      int var9;
      if (var8 < a) {
         int var14 = a + var8 * a;
         var9 = 0;
         if (var9 < a) {
            int var10 = a[var14++];
            int var11 = var10 >> 16 & 255;
            int var12 = var10 >> 8 & 255;
            int var13 = var10 & 255;
            int var10002 = this.Field3262[0][var11]++;
            var10002 = this.Field3262[1][var12]++;
            var10002 = this.Field3262[2][var13]++;
            ++var9;
         }

         ++var8;
      }

      byte var15 = 0;
      if (var15 < 256) {
         if (this.Field3262[0][var15] != this.Field3262[1][var15] || this.Field3262[1][var15] != this.Field3262[2][var15]) {
            this.Field3269 = false;
         }

         var8 = var15 + 1;
      }

      var15 = 0;
      if (var15 < 3) {
         short var16 = 0;
         if (var16 < 256) {
            if (this.Field3262[var15][var16] > 0) {
               this.Field3264[var15] = var16;
            }

            var9 = var16 + 1;
         }

         var16 = 255;
         if (this.Field3262[var15][var16] > 0) {
            this.Field3265[var15] = var16;
         }

         var9 = var16 - 1;
         this.Field3266[var15] = Integer.MAX_VALUE;
         this.Field3267[var15] = 0;
         byte var17 = 0;
         float[] var10000;
         if (var17 < 256) {
            this.Field3266[var15] = Math.min(this.Field3266[var15], this.Field3262[var15][var17]);
            this.Field3267[var15] = Math.max(this.Field3267[var15], this.Field3262[var15][var17]);
            var10000 = this.Field3268;
            var10000[var15] += (float)(var17 * this.Field3262[var15][var17]);
            var9 = var17 + 1;
         }

         var10000 = this.Field3268;
         var10000[var15] /= (float)this.Field3263;
         var8 = var15 + 1;
      }

      this.Field3264[3] = Math.min(Math.min(this.Field3264[0], this.Field3264[1]), this.Field3264[2]);
      this.Field3265[3] = Math.max(Math.max(this.Field3265[0], this.Field3265[1]), this.Field3265[2]);
   }

   public boolean Method1544() {
      return this.Field3269;
   }

   public int Method1545() {
      return this.Field3263;
   }

   public int Method1546(int a) {
      return this.Field3263 > 0 && this.Field3269 && a <= 255 ? this.Field3262[0][a] : -1;
   }

   public int Method1547(int a, int a) {
      return this.Field3263 >= 1 && a <= 2 && a <= 255 ? this.Field3262[a][a] : -1;
   }

   public int Method1548() {
      return this.Field3263 > 0 && this.Field3269 ? this.Field3266[0] : -1;
   }

   public int Method1549(int a) {
      return this.Field3263 >= 1 && a <= 2 ? this.Field3266[a] : -1;
   }

   public int Method1550() {
      return this.Field3263 > 0 && this.Field3269 ? this.Field3267[0] : -1;
   }

   public int Method1551(int a) {
      return this.Field3263 >= 1 && a <= 2 ? this.Field3267[a] : -1;
   }

   public int Method1552() {
      return this.Field3263 > 0 && this.Field3269 ? this.Field3264[0] : -1;
   }

   public int Method1553(int a) {
      return this.Field3264[a];
   }

   public int Method1554() {
      return this.Field3263 > 0 && this.Field3269 ? this.Field3265[0] : -1;
   }

   public int Method1555(int a) {
      return this.Field3265[a];
   }

   public float Method1556() {
      return this.Field3263 > 0 && this.Field3269 ? this.Field3268[0] : -1.0F;
   }

   public float Method1557(int a) {
      return this.Field3263 > 0 && 0 <= a && a <= 2 ? this.Field3268[a] : -1.0F;
   }
}
