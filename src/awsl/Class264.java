package awsl;

public class Class264 {
   static final int Field1435 = 1;
   static final int Field1436 = 2;
   static final int Field1437 = 4;
   static final int Field1438 = 8;
   static final int Field1439 = 16;
   static final int Field1440 = 32;
   static final int Field1441 = 64;
   static final int Field1442 = 128;
   static final int Field1443 = 256;
   static final int Field1444 = 512;
   static final int Field1445 = 1024;
   static final int Field1446 = 2048;
   public Object Field1447;
   int Field1448;
   int Field1449;
   int Field1450;
   private int Field1451;
   private int[] Field1452;
   int Field1453;
   int Field1454;
   Class276 Field1455;
   Class264 Field1456;
   Class250 Field1457;
   Class264 Field1458;

   public int Method2850() {
      if ((this.Field1448 & 2) == 0) {
         throw new IllegalStateException("Label offset position has not been resolved yet");
      } else {
         return this.Field1450;
      }
   }

   void Method2851(Class9 a, Class138 a, int a, boolean a3) {
      if ((this.Field1448 & 2) == 0) {
         this.Method2852(-1 - a, a.Field991);
         a.Method489(-1);
      } else {
         a.Method489(this.Field1450 - a);
      }

   }

   private void Method2852(int a, int a) {
      if (this.Field1452 == null) {
         this.Field1452 = new int[6];
      }

      if (this.Field1451 >= this.Field1452.length) {
         int[] a = new int[this.Field1452.length + 6];
         System.arraycopy(this.Field1452, 0, a, 0, this.Field1452.length);
         this.Field1452 = a;
      }

      this.Field1452[this.Field1451++] = a;
      this.Field1452[this.Field1451++] = a;
   }

   boolean Method2853(Class9 a, int a, byte[] a) {
      boolean a = false;
      this.Field1448 |= 2;
      this.Field1450 = a;

      int a;
      int a;
      for(int a = 0; a < this.Field1451; a[a] = (byte)a) {
         int a = this.Field1452[a++];
         a = this.Field1452[a++];
         a = a - a;
         if (a < -32768 || a > 32767) {
            int a = a[a - 1] & 255;
            if (a <= 168) {
               a[a - 1] = (byte)(a + 49);
            } else {
               a[a - 1] = (byte)(a + 20);
            }

            a = true;
         }

         a[a++] = (byte)(a >>> 8);
      }

      return a;
   }

   Class264 Method2854() {
      return this.Field1455 == null ? this : this.Field1455.Field1504;
   }

   boolean Method2855(long a) {
      if ((this.Field1448 & 1024) != 0) {
         return (this.Field1452[(int)(a >>> 32)] & (int)a) != 0;
      } else {
         return false;
      }
   }

   boolean Method2856(Class264 a) {
      if ((this.Field1448 & 1024) != 0 && (a.Field1448 & 1024) != 0) {
         for(int a = 0; a < this.Field1452.length; ++a) {
            if ((this.Field1452[a] & a.Field1452[a]) != 0) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void Method2857(long a, int a) {
      if ((this.Field1448 & 1024) == 0) {
         this.Field1448 |= 1024;
         this.Field1452 = new int[a / 32 + 1];
      }

      int[] var10000 = this.Field1452;
      var10000[(int)(a >>> 32)] |= (int)a;
   }

   void Method2858(Class264 a, long a, int a) {
      String[] a = Class267.Method2862();
      Class264 a = this.Field1458;
      this.Field1458 = null;
      if ((this.Field1448 & 2048) != 0) {
         ;
      }

      this.Field1448 |= 2048;
      Class250 a;
      if ((this.Field1448 & 256) != 0 && !this.Method2856(a)) {
         a = new Class250();
         a.Field1384 = this.Field1453;
         a.Field1385 = a.Field1457.Field1385;
         a.Field1386 = this.Field1457;
         this.Field1457 = a;
         if (this.Method2855(a)) {
            ;
         }

         this.Method2857(a, a);
      }

      a = this.Field1457;
      if (((this.Field1448 & 128) == 0 || a != this.Field1457.Field1386) && a.Field1385.Field1458 == null) {
         a.Field1385.Field1458 = a;
         a = a.Field1385;
      }

      a = a.Field1386;
   }

   public String Method2859() {
      return "L" + System.identityHashCode(this);
   }

   private static IllegalStateException Method2860(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
