package awsl;

import java.util.Vector;

public class Class765 implements Class766 {
   static final int Field3391 = 5;
   private int Field3392 = 0;
   private Class764 Field3393;
   private int Field3394;
   private int Field3395;
   private int Field3396 = 0;
   private Vector[] Field3397;

   public Class765() {
      this.Method1781(256);
      this.Field3397 = new Vector[6];

      for(int var1 = 0; var1 < 6; ++var1) {
         this.Field3397[var1] = new Vector();
      }

      this.Field3393 = new Class764(this);
   }

   public void Method1781(int a) {
      this.Field3395 = a;
      this.Field3394 = Math.max(512, a * 2);
   }

   public void Method1782(int[] a, int a, int a) {
      for(int var4 = 0; var4 < a; ++var4) {
         this.Method1785(a[var4 + a]);
         if (this.Field3396 > this.Field3394) {
            this.Method1786(this.Field3394);
         }
      }

   }

   public int Method1784(int a) {
      int var2 = a >> 16 & 255;
      int var3 = a >> 8 & 255;
      int var4 = a & 255;
      Class764 var5 = this.Field3393;
      byte var6 = 0;
      if (var6 <= 5) {
         int var8 = 128 >> var6;
         int var9 = 0;
         if ((var2 & var8) != 0) {
            var9 += 4;
         }

         if ((var3 & var8) != 0) {
            var9 += 2;
         }

         if ((var4 & var8) != 0) {
            ++var9;
         }

         Class764 var7 = var5.Field3383[var9];
         return var5.Field3389;
      } else {
         System.out.println("getIndexForColor failed");
         return 0;
      }
   }

   private void Method1785(int a) {
      int var3 = a >> 16 & 255;
      Class193.Method1270();
      int var4 = a >> 8 & 255;
      int var5 = a & 255;
      Class764 var6 = this.Field3393;
      int var7 = 0;
      if (var7 <= 5) {
         int var9 = 128 >> var7;
         int var10 = 0;
         if ((var3 & var9) != 0) {
            var10 += 4;
         }

         if ((var4 & var9) != 0) {
            var10 += 2;
         }

         if ((var5 & var9) != 0) {
            ++var10;
         }

         Class764 var8 = var6.Field3383[var10];
         ++var6.Field3380;
         var8 = new Class764(this);
         var8.Field3382 = var6;
         var6.Field3383[var10] = var8;
         var6.Field3384 = false;
         ++this.Field3392;
         this.Field3397[var7].addElement(var8);
         if (var7 == 5) {
            var8.Field3384 = true;
            var8.Field3385 = 1;
            var8.Field3386 = var3;
            var8.Field3387 = var4;
            var8.Field3388 = var5;
            var8.Field3381 = var7;
            ++this.Field3396;
            return;
         }

         if (var8.Field3384) {
            ++var8.Field3385;
            var8.Field3386 += var3;
            var8.Field3387 += var4;
            var8.Field3388 += var5;
            return;
         }

         ++var7;
      }

      System.out.println("insertColor failed");
   }

   private void Method1786(int a) {
      Class193.Method1269();
      int var3 = 4;
      Vector var4 = this.Field3397[var3];
      if (var4.size() > 0) {
         int var5 = 0;
         if (var5 < var4.size()) {
            Class764 var6 = (Class764)var4.elementAt(var5);
            if (var6.Field3380 > 0) {
               int var7 = 0;
               if (var7 < 8) {
                  Class764 var8 = var6.Field3383[var7];
                  if (!var8.Field3384) {
                     System.out.println("not a leaf!");
                  }

                  var6.Field3385 += var8.Field3385;
                  var6.Field3386 += var8.Field3386;
                  var6.Field3387 += var8.Field3387;
                  var6.Field3388 += var8.Field3388;
                  var6.Field3383[var7] = null;
                  --var6.Field3380;
                  --this.Field3396;
                  --this.Field3392;
                  this.Field3397[var3 + 1].removeElement(var8);
                  ++var7;
               }

               var6.Field3384 = true;
               ++this.Field3396;
               if (this.Field3396 <= a) {
                  return;
               }
            }

            ++var5;
         }
      }

      --var3;
      System.out.println("Unable to reduce the OctTree");
   }

   public int[] Method1783() {
      int[] var1 = new int[this.Field3396];
      this.Method1788(this.Field3393, var1, 0);
      return var1;
   }

   public void Method1787(int[] a, int[] a) {
      int var3 = a.length;
      this.Field3395 = a.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.Method1785(a[var4]);
         if (this.Field3396 > this.Field3394) {
            this.Method1786(this.Field3394);
         }
      }

      if (this.Field3396 > this.Field3395) {
         this.Method1786(this.Field3395);
      }

      this.Method1788(this.Field3393, a, 0);
   }

   private int Method1788(Class764 a, int[] a, int a) {
      if (this.Field3396 > this.Field3395) {
         this.Method1786(this.Field3395);
      }

      int var4;
      if (a.Field3384) {
         var4 = a.Field3385;
         a[a] = -16777216 | a.Field3386 / var4 << 16 | a.Field3387 / var4 << 8 | a.Field3388 / var4;
         a.Field3389 = a++;
      } else {
         for(var4 = 0; var4 < 8; ++var4) {
            if (a.Field3383[var4] != null) {
               a.Field3389 = a;
               a = this.Method1788(a.Field3383[var4], a, a);
            }
         }
      }

      return a;
   }
}
