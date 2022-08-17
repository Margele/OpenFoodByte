package awsl;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class827 extends Class798 {
   public float Field3668 = 1.0F;
   private float Field3669 = 0.0F;
   private Class755 Field3670 = new Class771();
   private Random Field3671 = new Random();
   private long Field3672 = 567L;
   private boolean Field3673 = false;
   private boolean Field3674 = false;

   public void Method56(float a) {
      this.Field3668 = a;
   }

   public float Method57() {
      return this.Field3668;
   }

   public void Method58(float a) {
      this.Field3669 = a;
   }

   public float Method59() {
      return this.Field3669;
   }

   public void Method176(Class755 a) {
      this.Field3670 = a;
   }

   public Class755 Method177() {
      return this.Field3670;
   }

   public void Method87(boolean a) {
      this.Field3673 = a;
   }

   public boolean Method88() {
      return this.Field3673;
   }

   public void Method1282(boolean a) {
      this.Field3674 = a;
   }

   public boolean Method1283() {
      return this.Field3674;
   }

   public void Method9(int a) {
      this.Field3672 = (long)a;
   }

   public int Method10() {
      return (int)this.Field3672;
   }

   public void Method89() {
      this.Field3672 = (new Date()).getTime();
   }

   private int Method1772(int[] a, int a, int a) {
      if (this.Field3674) {
         return a[a * this.Field3569.width + a];
      } else {
         int var4 = (int)(255.0F * this.Field3671.nextFloat());
         int var5 = (int)(255.0F * this.Field3671.nextFloat());
         int var6 = (int)(255.0F * this.Field3671.nextFloat());
         return -16777216 | var4 << 16 | var5 << 8 | var6;
      }
   }

   private int Method900(int a, float a) {
      int var3 = a >> 16 & 255;
      int var4 = a >> 8 & 255;
      int var5 = a & 255;
      var3 = Class767.Method1687(var3 + (int)((double)a * ((double)this.Field3671.nextFloat() - 0.5)));
      var4 = Class767.Method1687(var4 + (int)((double)a * ((double)this.Field3671.nextFloat() - 0.5)));
      var5 = Class767.Method1687(var5 + (int)((double)a * ((double)this.Field3671.nextFloat() - 0.5)));
      return -16777216 | var3 << 16 | var4 << 8 | var5;
   }

   private int Method1614(int a, int a) {
      return Class767.Method1691(a, a, 13);
   }

   private int Method3633(int a, int a, int[] a, int a) {
      return a[a * a + a];
   }

   private void Method3634(int a, int a, int a, int[] a, int a) {
      a[a * a + a] = a;
   }

   private boolean Method3635(int a, int a, int a, int a, int[] a, int a, int a, int a) {
      int var17 = this.Method3633(a, a, a, a);
      int var18 = this.Method3633(a, a, a, a);
      int var19 = this.Method3633(a, a, a, a);
      int var20 = this.Method3633(a, a, a, a);
      float var21 = 256.0F / (2.0F * (float)a) * this.Field3668;
      int var9 = (a + a) / 2;
      int var10 = (a + a) / 2;
      if (var9 == a && var9 == a && var10 == a && var10 == a) {
         return true;
      } else {
         if (var9 != a || var9 != a) {
            int var11 = this.Method1614(var17, var18);
            var11 = this.Method900(var11, var21);
            this.Method3634(a, var10, var11, a, a);
            if (a != a) {
               int var12 = this.Method1614(var19, var20);
               var12 = this.Method900(var12, var21);
               this.Method3634(a, var10, var12, a, a);
            }
         }

         if (var10 != a || var10 != a) {
            if (a != var9 || var10 != a) {
               int var14 = this.Method1614(var18, var20);
               var14 = this.Method900(var14, var21);
               this.Method3634(var9, a, var14, a, a);
            }

            if (a != a) {
               int var13 = this.Method1614(var17, var19);
               var13 = this.Method900(var13, var21);
               this.Method3634(var9, a, var13, a, a);
            }
         }

         if (a != a || a != a) {
            int var15 = this.Method1614(var17, var20);
            int var16 = this.Method1614(var18, var19);
            var15 = this.Method1614(var15, var16);
            var15 = this.Method900(var15, var21);
            this.Method3634(var9, var10, var15, a, a);
         }

         return a - a >= 3 || a - a >= 3;
      }
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int[] var6 = new int[a * a];
      Class193.Method1269();
      this.Field3671.setSeed(this.Field3672);
      int var7 = a - 1;
      int var8 = a - 1;
      this.Method3634(0, 0, this.Method1772(a, 0, 0), var6, a);
      this.Method3634(var7, 0, this.Method1772(a, var7, 0), var6, a);
      this.Method3634(0, var8, this.Method1772(a, 0, var8), var6, a);
      this.Method3634(var7, var8, this.Method1772(a, var7, var8), var6, a);
      this.Method3634(var7 / 2, var8 / 2, this.Method1772(a, var7 / 2, var8 / 2), var6, a);
      this.Method3634(0, var8 / 2, this.Method1772(a, 0, var8 / 2), var6, a);
      this.Method3634(var7, var8 / 2, this.Method1772(a, var7, var8 / 2), var6, a);
      this.Method3634(var7 / 2, 0, this.Method1772(a, var7 / 2, 0), var6, a);
      this.Method3634(var7 / 2, var8, this.Method1772(a, var7 / 2, var8), var6, a);
      int var9 = 1;
      if (this.Method3635(0, 0, a - 1, a - 1, var6, a, var9, 0)) {
         ++var9;
      }

      if (this.Field3673 && this.Field3670 != null) {
         int var10 = 0;
         int var11 = 0;
         if (var11 < a) {
            int var12 = 0;
            if (var12 < a) {
               var6[var10] = this.Field3670.Method283((float)(var6[var10] & 255) / 255.0F);
               ++var10;
               ++var12;
            }

            ++var11;
         }
      }

      return var6;
   }

   public String toString() {
      return "Texture/Plasma...";
   }
}
