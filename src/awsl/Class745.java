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
      int a = false;
      int a = 0;
      int a;
      if (a < a) {
         int a = a + a * a;
         a = 0;
         if (a < a) {
            int a = a[a++];
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            int var10002 = this.Field3262[0][a]++;
            var10002 = this.Field3262[1][a]++;
            var10002 = this.Field3262[2][a]++;
            ++a;
         }

         ++a;
      }

      int a = 0;
      if (a < 256) {
         if (this.Field3262[0][a] != this.Field3262[1][a] || this.Field3262[1][a] != this.Field3262[2][a]) {
            this.Field3269 = false;
         }

         a = a + 1;
      }

      a = 0;
      if (a < 3) {
         int a = 0;
         if (a < 256) {
            if (this.Field3262[a][a] > 0) {
               this.Field3264[a] = a;
            }

            a = a + 1;
         }

         a = 255;
         if (this.Field3262[a][a] > 0) {
            this.Field3265[a] = a;
         }

         a = a - 1;
         this.Field3266[a] = Integer.MAX_VALUE;
         this.Field3267[a] = 0;
         int a = 0;
         float[] var10000;
         if (a < 256) {
            this.Field3266[a] = Math.min(this.Field3266[a], this.Field3262[a][a]);
            this.Field3267[a] = Math.max(this.Field3267[a], this.Field3262[a][a]);
            var10000 = this.Field3268;
            var10000[a] += (float)(a * this.Field3262[a][a]);
            a = a + 1;
         }

         var10000 = this.Field3268;
         var10000[a] /= (float)this.Field3263;
         a = a + 1;
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
