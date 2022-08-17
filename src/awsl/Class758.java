package awsl;

import java.awt.Color;

public class Class758 extends Class759 implements Cloneable {
   public static final int Field3318 = 0;
   public static final int Field3319 = 1;
   public static final int Field3320 = 2;
   public static final int Field3321 = 16;
   public static final int Field3322 = 32;
   public static final int Field3323 = 48;
   public static final int Field3324 = 64;
   public static final int Field3325 = 80;
   private static final int Field3326 = 3;
   private static final int Field3327 = 112;
   private int Field3328;
   private int[] Field3329;
   private int[] Field3330;
   private byte[] Field3331;

   public Class758() {
      this.Field3328 = 4;
      this.Field3329 = new int[]{-1, 0, 255, 256};
      this.Field3330 = new int[]{-16777216, -16777216, -1, -1};
      this.Field3331 = new byte[]{32, 32, 32, 32};
      this.Method89();
   }

   public Class758(int[] a) {
      this((int[])null, a, (byte[])null);
   }

   public Class758(int[] a, int[] a) {
      this(a, a, (byte[])null);
   }

   public Class758(int[] a, int[] a, byte[] a) {
      this.Field3328 = 4;
      this.Field3329 = new int[]{-1, 0, 255, 256};
      this.Field3330 = new int[]{-16777216, -16777216, -1, -1};
      this.Field3331 = new byte[]{32, 32, 32, 32};
      this.Method1751(a, a, a);
   }

   public Object Method878() {
      Class758 var1 = (Class758)super.Method878();
      var1.Field3332 = (int[])((int[])this.Field3332.clone());
      var1.Field3329 = (int[])((int[])this.Field3329.clone());
      var1.Field3330 = (int[])((int[])this.Field3330.clone());
      var1.Field3331 = (byte[])((byte[])this.Field3331.clone());
      return var1;
   }

   public void Method1748(Class758 a) {
      a.Field3328 = this.Field3328;
      a.Field3332 = (int[])((int[])this.Field3332.clone());
      a.Field3329 = (int[])((int[])this.Field3329.clone());
      a.Field3330 = (int[])((int[])this.Field3330.clone());
      a.Field3331 = (byte[])((byte[])this.Field3331.clone());
   }

   public void Method17(int a, int a) {
      int var3 = this.Field3332[0];
      int var4 = this.Field3332[255];

      int var5;
      for(var5 = 0; var5 < a; ++var5) {
         this.Field3332[var5] = Class776.Method1719((float)var5 / (float)a, var3, a);
      }

      if (a < 255) {
         for(var5 = a; var5 < 256; ++var5) {
            this.Field3332[var5] = Class776.Method1719((float)(var5 - a) / (float)(256 - a), a, var4);
         }
      }

   }

   public int Method10() {
      return this.Field3328;
   }

   public void Method1619(int a, int a) {
      this.Field3330[a] = a;
      this.Method89();
   }

   public int Method1612(int a) {
      return this.Field3330[a];
   }

   public void Method1620(int a, int a) {
      this.Field3331[a] = (byte)(this.Field3331[a] & -4 | a);
      this.Method89();
   }

   public int Method1613(int a) {
      return (byte)(this.Field3331[a] & 3);
   }

   public void Method1621(int a, int a) {
      this.Field3331[a] = (byte)(this.Field3331[a] & -113 | a);
      this.Method89();
   }

   public byte Method1749(int a) {
      return (byte)(this.Field3331[a] & 112);
   }

   public void Method1750(int a, int a, int a) {
      int[] var4 = new int[this.Field3328 + 1];
      int[] var5 = new int[this.Field3328 + 1];
      byte[] var6 = new byte[this.Field3328 + 1];
      System.arraycopy(this.Field3329, 0, var4, 0, this.Field3328);
      System.arraycopy(this.Field3330, 0, var5, 0, this.Field3328);
      System.arraycopy(this.Field3331, 0, var6, 0, this.Field3328);
      this.Field3329 = var4;
      this.Field3330 = var5;
      this.Field3331 = var6;
      this.Field3329[this.Field3328] = this.Field3329[this.Field3328 - 1];
      this.Field3330[this.Field3328] = this.Field3330[this.Field3328 - 1];
      this.Field3331[this.Field3328] = this.Field3331[this.Field3328 - 1];
      this.Field3329[this.Field3328 - 1] = a;
      this.Field3330[this.Field3328 - 1] = a;
      this.Field3331[this.Field3328 - 1] = (byte)a;
      ++this.Field3328;
      this.Method1622();
      this.Method89();
   }

   public void Method9(int a) {
      if (this.Field3328 > 4) {
         if (a < this.Field3328 - 1) {
            System.arraycopy(this.Field3329, a + 1, this.Field3329, a, this.Field3328 - a - 1);
            System.arraycopy(this.Field3330, a + 1, this.Field3330, a, this.Field3328 - a - 1);
            System.arraycopy(this.Field3331, a + 1, this.Field3331, a, this.Field3328 - a - 1);
         }

         --this.Field3328;
         if (this.Field3329[1] > 0) {
            this.Field3329[1] = 0;
         }

         this.Method89();
      }
   }

   public void Method1751(int[] a, int[] a, byte[] a) {
      this.Field3328 = a.length + 2;
      this.Field3329 = new int[this.Field3328];
      this.Field3330 = new int[this.Field3328];
      this.Field3331 = new byte[this.Field3328];
      System.arraycopy(a, 0, this.Field3329, 1, this.Field3328 - 2);
      System.arraycopy(a, 0, this.Field3330, 1, this.Field3328 - 2);
      System.arraycopy(a, 0, this.Field3331, 1, this.Field3328 - 2);
      this.Method1622();
      this.Method89();
   }

   public void Method1752(int[] a, int[] a, byte[] a, int a, int a) {
      this.Field3328 = a;
      this.Field3329 = new int[this.Field3328];
      this.Field3330 = new int[this.Field3328];
      this.Field3331 = new byte[this.Field3328];
      System.arraycopy(a, a, this.Field3329, 0, this.Field3328);
      System.arraycopy(a, a, this.Field3330, 0, this.Field3328);
      System.arraycopy(a, a, this.Field3331, 0, this.Field3328);
      this.Method1622();
      this.Method89();
   }

   public void Method11(int a) {
      int var2 = (this.Field3329[a] + this.Field3329[a + 1]) / 2;
      this.Method1750(var2, this.Method283((float)var2 / 256.0F), this.Field3331[a]);
      this.Method89();
   }

   public void Method1753(int a, int a) {
      this.Field3329[a] = Class776.Method1712(a, 0, 255);
      this.Method1622();
      this.Method89();
   }

   public int Method1754(int a) {
      return this.Field3329[a];
   }

   public int Method1755(int a) {
      for(int var2 = 1; var2 < this.Field3328 - 1; ++var2) {
         if (this.Field3329[var2 + 1] > a) {
            return var2;
         }
      }

      return 1;
   }

   private void Method89() {
      Class193.Method1269();
      this.Field3329[0] = -1;
      this.Field3329[this.Field3328 - 1] = 256;
      this.Field3330[0] = this.Field3330[1];
      this.Field3330[this.Field3328 - 1] = this.Field3330[this.Field3328 - 2];
      boolean var2 = false;
      int var3 = 1;
      if (var3 < this.Field3328 - 1) {
         float var4 = (float)(this.Field3329[var3 + 1] - this.Field3329[var3]);
         int var5 = this.Field3329[var3 + 1];
         if (var3 == this.Field3328 - 2) {
            ++var5;
         }

         int var6 = this.Field3329[var3];
         if (var6 < var5) {
            int var7 = this.Field3330[var3];
            int var8 = this.Field3330[var3 + 1];
            float[] var9 = Color.RGBtoHSB(var7 >> 16 & 255, var7 >> 8 & 255, var7 & 255, (float[])null);
            float[] var10 = Color.RGBtoHSB(var8 >> 16 & 255, var8 >> 8 & 255, var8 & 255, (float[])null);
            float var11 = (float)(var6 - this.Field3329[var3]) / var4;
            int var12 = this.Method1613(var3);
            byte var13 = this.Method1749(var3);
            if (var6 <= 255) {
               switch (var13) {
                  case 80:
                     var11 = 0.0F;
                  case 16:
                  case 32:
                     var11 = Class776.Method1708(0.15F, 0.85F, var11);
                  case 48:
                     --var11;
                     var11 = (float)Math.sqrt((double)(1.0F - var11 * var11));
                  case 64:
                     var11 = 1.0F - (float)Math.sqrt((double)(1.0F - var11 * var11));
               }

               switch (var12) {
                  case 0:
                     this.Field3332[var6] = Class776.Method1719(var11, var7, var8);
                  case 1:
                  case 2:
                     label37: {
                        int var10002;
                        if (var12 == 1) {
                           if (!(var10[0] <= var9[0])) {
                              break label37;
                           }

                           var10002 = var10[0]++;
                        }

                        if (var9[0] <= var10[1]) {
                           var10002 = var9[0]++;
                        }
                     }

                     float var14 = Class776.Method1717(var11, var9[0], var10[0]) % 6.2831855F;
                     float var15 = Class776.Method1717(var11, var9[1], var10[1]);
                     float var16 = Class776.Method1717(var11, var9[2], var10[2]);
                     this.Field3332[var6] = -16777216 | Color.HSBtoRGB(var14, var15, var16);
               }
            }

            ++var6;
         }

         ++var3;
      }

   }

   private void Method1622() {
      for(int var1 = 1; var1 < this.Field3328 - 1; ++var1) {
         for(int var2 = 1; var2 < var1; ++var2) {
            if (this.Field3329[var1] < this.Field3329[var2]) {
               int var3 = this.Field3329[var1];
               this.Field3329[var1] = this.Field3329[var2];
               this.Field3329[var2] = var3;
               var3 = this.Field3330[var1];
               this.Field3330[var1] = this.Field3330[var2];
               this.Field3330[var2] = var3;
               byte var4 = this.Field3331[var1];
               this.Field3331[var1] = this.Field3331[var2];
               this.Field3331[var2] = var4;
            }
         }
      }

   }

   private void Method1756() {
      this.Method1622();
      this.Method89();
   }

   public void Method1757() {
      this.Field3328 = 4 + (int)(6.0 * Math.random());
      this.Field3329 = new int[this.Field3328];
      this.Field3330 = new int[this.Field3328];
      this.Field3331 = new byte[this.Field3328];

      for(int var1 = 0; var1 < this.Field3328; ++var1) {
         this.Field3329[var1] = (int)(255.0 * Math.random());
         this.Field3330[var1] = -16777216 | (int)(255.0 * Math.random()) << 16 | (int)(255.0 * Math.random()) << 8 | (int)(255.0 * Math.random());
         this.Field3331[var1] = 32;
      }

      this.Field3329[0] = -1;
      this.Field3329[1] = 0;
      this.Field3329[this.Field3328 - 2] = 255;
      this.Field3329[this.Field3328 - 1] = 256;
      this.Method1622();
      this.Method89();
   }

   public void Method56(float a) {
      for(int var2 = 0; var2 < this.Field3328; ++var2) {
         int var3 = this.Field3330[var2];
         int var4 = var3 >> 16 & 255;
         int var5 = var3 >> 8 & 255;
         int var6 = var3 & 255;
         var4 = Class767.Method1687((int)((double)var4 + (double)(a * 255.0F) * (Math.random() - 0.5)));
         var5 = Class767.Method1687((int)((double)var5 + (double)(a * 255.0F) * (Math.random() - 0.5)));
         var6 = Class767.Method1687((int)((double)var6 + (double)(a * 255.0F) * (Math.random() - 0.5)));
         this.Field3330[var2] = -16777216 | var4 << 16 | var5 << 8 | var6;
         this.Field3331[var2] = 32;
      }

      this.Method1622();
      this.Method89();
   }

   public static Class758 Method1758() {
      Class758 var0 = new Class758();
      var0.Method1757();
      return var0;
   }
}
