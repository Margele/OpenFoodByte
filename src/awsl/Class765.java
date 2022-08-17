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

      for(int a = 0; a < 6; ++a) {
         this.Field3397[a] = new Vector();
      }

      this.Field3393 = new Class764(this);
   }

   public void Method1781(int a) {
      this.Field3395 = a;
      this.Field3394 = Math.max(512, a * 2);
   }

   public void Method1782(int[] a, int a, int a) {
      for(int a = 0; a < a; ++a) {
         this.Method1785(a[a + a]);
         if (this.Field3396 > this.Field3394) {
            this.Method1786(this.Field3394);
         }
      }

   }

   public int Method1784(int a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      Class764 a = this.Field3393;
      int a = 0;
      if (a <= 5) {
         int a = 128 >> a;
         int a = 0;
         if ((a & a) != 0) {
            a += 4;
         }

         if ((a & a) != 0) {
            a += 2;
         }

         if ((a & a) != 0) {
            ++a;
         }

         Class764 a = a.Field3383[a];
         return a.Field3389;
      } else {
         System.out.println("getIndexForColor failed");
         return 0;
      }
   }

   private void Method1785(int a) {
      int a = a >> 16 & 255;
      Class193.Method1270();
      int a = a >> 8 & 255;
      int a = a & 255;
      Class764 a = this.Field3393;
      int a = 0;
      if (a <= 5) {
         int a = 128 >> a;
         int a = 0;
         if ((a & a) != 0) {
            a += 4;
         }

         if ((a & a) != 0) {
            a += 2;
         }

         if ((a & a) != 0) {
            ++a;
         }

         Class764 a = a.Field3383[a];
         ++a.Field3380;
         a = new Class764(this);
         a.Field3382 = a;
         a.Field3383[a] = a;
         a.Field3384 = false;
         ++this.Field3392;
         this.Field3397[a].addElement(a);
         if (a == 5) {
            a.Field3384 = true;
            a.Field3385 = 1;
            a.Field3386 = a;
            a.Field3387 = a;
            a.Field3388 = a;
            a.Field3381 = a;
            ++this.Field3396;
            return;
         }

         if (a.Field3384) {
            ++a.Field3385;
            a.Field3386 += a;
            a.Field3387 += a;
            a.Field3388 += a;
            return;
         }

         ++a;
      }

      System.out.println("insertColor failed");
   }

   private void Method1786(int a) {
      Class193.Method1269();
      int a = 4;
      Vector a = this.Field3397[a];
      if (a.size() > 0) {
         int a = 0;
         if (a < a.size()) {
            Class764 a = (Class764)a.elementAt(a);
            if (a.Field3380 > 0) {
               int a = 0;
               if (a < 8) {
                  Class764 a = a.Field3383[a];
                  if (!a.Field3384) {
                     System.out.println("not a leaf!");
                  }

                  a.Field3385 += a.Field3385;
                  a.Field3386 += a.Field3386;
                  a.Field3387 += a.Field3387;
                  a.Field3388 += a.Field3388;
                  a.Field3383[a] = null;
                  --a.Field3380;
                  --this.Field3396;
                  --this.Field3392;
                  this.Field3397[a + 1].removeElement(a);
                  ++a;
               }

               a.Field3384 = true;
               ++this.Field3396;
               if (this.Field3396 <= a) {
                  return;
               }
            }

            ++a;
         }
      }

      --a;
      System.out.println("Unable to reduce the OctTree");
   }

   public int[] Method1783() {
      int[] a = new int[this.Field3396];
      this.Method1788(this.Field3393, a, 0);
      return a;
   }

   public void Method1787(int[] a, int[] a) {
      int a = a.length;
      this.Field3395 = a.length;

      for(int a = 0; a < a; ++a) {
         this.Method1785(a[a]);
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

      int a;
      if (a.Field3384) {
         a = a.Field3385;
         a[a] = -16777216 | a.Field3386 / a << 16 | a.Field3387 / a << 8 | a.Field3388 / a;
         a.Field3389 = a++;
      } else {
         for(a = 0; a < 8; ++a) {
            if (a.Field3383[a] != null) {
               a.Field3389 = a;
               a = this.Method1788(a.Field3383[a], a, a);
            }
         }
      }

      return a;
   }
}
