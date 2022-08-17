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
      Class758 a = (Class758)super.Method878();
      a.Field3332 = (int[])((int[])this.Field3332.clone());
      a.Field3329 = (int[])((int[])this.Field3329.clone());
      a.Field3330 = (int[])((int[])this.Field3330.clone());
      a.Field3331 = (byte[])((byte[])this.Field3331.clone());
      return a;
   }

   public void Method1748(Class758 a) {
      a.Field3328 = this.Field3328;
      a.Field3332 = (int[])((int[])this.Field3332.clone());
      a.Field3329 = (int[])((int[])this.Field3329.clone());
      a.Field3330 = (int[])((int[])this.Field3330.clone());
      a.Field3331 = (byte[])((byte[])this.Field3331.clone());
   }

   public void Method17(int a, int a) {
      int a = this.Field3332[0];
      int a = this.Field3332[255];

      int a;
      for(a = 0; a < a; ++a) {
         this.Field3332[a] = Class776.Method1719((float)a / (float)a, a, a);
      }

      if (a < 255) {
         for(a = a; a < 256; ++a) {
            this.Field3332[a] = Class776.Method1719((float)(a - a) / (float)(256 - a), a, a);
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
      int[] a = new int[this.Field3328 + 1];
      int[] a = new int[this.Field3328 + 1];
      byte[] a = new byte[this.Field3328 + 1];
      System.arraycopy(this.Field3329, 0, a, 0, this.Field3328);
      System.arraycopy(this.Field3330, 0, a, 0, this.Field3328);
      System.arraycopy(this.Field3331, 0, a, 0, this.Field3328);
      this.Field3329 = a;
      this.Field3330 = a;
      this.Field3331 = a;
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
      int a = (this.Field3329[a] + this.Field3329[a + 1]) / 2;
      this.Method1750(a, this.Method283((float)a / 256.0F), this.Field3331[a]);
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
      for(int a = 1; a < this.Field3328 - 1; ++a) {
         if (this.Field3329[a + 1] > a) {
            return a;
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
      int a = false;
      int a = 1;
      if (a < this.Field3328 - 1) {
         float a = (float)(this.Field3329[a + 1] - this.Field3329[a]);
         int a = this.Field3329[a + 1];
         if (a == this.Field3328 - 2) {
            ++a;
         }

         int a = this.Field3329[a];
         if (a < a) {
            int a = this.Field3330[a];
            int a = this.Field3330[a + 1];
            float[] a = Color.RGBtoHSB(a >> 16 & 255, a >> 8 & 255, a & 255, (float[])null);
            float[] a = Color.RGBtoHSB(a >> 16 & 255, a >> 8 & 255, a & 255, (float[])null);
            float a = (float)(a - this.Field3329[a]) / a;
            int a = this.Method1613(a);
            int a = this.Method1749(a);
            if (a <= 255) {
               switch (a) {
                  case 80:
                     a = 0.0F;
                  case 16:
                  case 32:
                     a = Class776.Method1708(0.15F, 0.85F, a);
                  case 48:
                     --a;
                     a = (float)Math.sqrt((double)(1.0F - a * a));
                  case 64:
                     a = 1.0F - (float)Math.sqrt((double)(1.0F - a * a));
               }

               switch (a) {
                  case 0:
                     this.Field3332[a] = Class776.Method1719(a, a, a);
                  case 1:
                  case 2:
                     label37: {
                        int var10002;
                        if (a == 1) {
                           if (!(a[0] <= a[0])) {
                              break label37;
                           }

                           var10002 = a[0]++;
                        }

                        if (a[0] <= a[1]) {
                           var10002 = a[0]++;
                        }
                     }

                     float a = Class776.Method1717(a, a[0], a[0]) % 6.2831855F;
                     float a = Class776.Method1717(a, a[1], a[1]);
                     float a = Class776.Method1717(a, a[2], a[2]);
                     this.Field3332[a] = -16777216 | Color.HSBtoRGB(a, a, a);
               }
            }

            ++a;
         }

         ++a;
      }

   }

   private void Method1622() {
      for(int a = 1; a < this.Field3328 - 1; ++a) {
         for(int a = 1; a < a; ++a) {
            if (this.Field3329[a] < this.Field3329[a]) {
               int a = this.Field3329[a];
               this.Field3329[a] = this.Field3329[a];
               this.Field3329[a] = a;
               a = this.Field3330[a];
               this.Field3330[a] = this.Field3330[a];
               this.Field3330[a] = a;
               byte a = this.Field3331[a];
               this.Field3331[a] = this.Field3331[a];
               this.Field3331[a] = a;
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

      for(int a = 0; a < this.Field3328; ++a) {
         this.Field3329[a] = (int)(255.0 * Math.random());
         this.Field3330[a] = -16777216 | (int)(255.0 * Math.random()) << 16 | (int)(255.0 * Math.random()) << 8 | (int)(255.0 * Math.random());
         this.Field3331[a] = 32;
      }

      this.Field3329[0] = -1;
      this.Field3329[1] = 0;
      this.Field3329[this.Field3328 - 2] = 255;
      this.Field3329[this.Field3328 - 1] = 256;
      this.Method1622();
      this.Method89();
   }

   public void Method56(float a) {
      for(int a = 0; a < this.Field3328; ++a) {
         int a = this.Field3330[a];
         int a = a >> 16 & 255;
         int a = a >> 8 & 255;
         int a = a & 255;
         a = Class767.Method1687((int)((double)a + (double)(a * 255.0F) * (Math.random() - 0.5)));
         a = Class767.Method1687((int)((double)a + (double)(a * 255.0F) * (Math.random() - 0.5)));
         a = Class767.Method1687((int)((double)a + (double)(a * 255.0F) * (Math.random() - 0.5)));
         this.Field3330[a] = -16777216 | a << 16 | a << 8 | a;
         this.Field3331[a] = 32;
      }

      this.Method1622();
      this.Method89();
   }

   public static Class758 Method1758() {
      Class758 a = new Class758();
      a.Method1757();
      return a;
   }
}
