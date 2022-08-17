package awsl;

public class Class138 {
   byte[] Field990;
   int Field991;

   public Class138() {
      this.Field990 = new byte[64];
   }

   public Class138(int a) {
      this.Field990 = new byte[a];
   }

   public Class138 Method485(int a) {
      int a = this.Field991;
      if (a + 1 > this.Field990.length) {
         this.Method494(1);
      }

      this.Field990[a++] = (byte)a;
      this.Field991 = a;
      return this;
   }

   Class138 Method486(int a, int a) {
      int a = this.Field991;
      if (a + 2 > this.Field990.length) {
         this.Method494(2);
      }

      byte[] a = this.Field990;
      a[a++] = (byte)a;
      a[a++] = (byte)a;
      this.Field991 = a;
      return this;
   }

   public Class138 Method487(int a) {
      int a = this.Field991;
      if (a + 2 > this.Field990.length) {
         this.Method494(2);
      }

      byte[] a = this.Field990;
      a[a++] = (byte)(a >>> 8);
      a[a++] = (byte)a;
      this.Field991 = a;
      return this;
   }

   Class138 Method488(int a, int a) {
      int a = this.Field991;
      if (a + 3 > this.Field990.length) {
         this.Method494(3);
      }

      byte[] a = this.Field990;
      a[a++] = (byte)a;
      a[a++] = (byte)(a >>> 8);
      a[a++] = (byte)a;
      this.Field991 = a;
      return this;
   }

   public Class138 Method489(int a) {
      int a = this.Field991;
      if (a + 4 > this.Field990.length) {
         this.Method494(4);
      }

      byte[] a = this.Field990;
      a[a++] = (byte)(a >>> 24);
      a[a++] = (byte)(a >>> 16);
      a[a++] = (byte)(a >>> 8);
      a[a++] = (byte)a;
      this.Field991 = a;
      return this;
   }

   public Class138 Method490(long a) {
      int a = this.Field991;
      if (a + 8 > this.Field990.length) {
         this.Method494(8);
      }

      byte[] a = this.Field990;
      int a = (int)(a >>> 32);
      a[a++] = (byte)(a >>> 24);
      a[a++] = (byte)(a >>> 16);
      a[a++] = (byte)(a >>> 8);
      a[a++] = (byte)a;
      a = (int)a;
      a[a++] = (byte)(a >>> 24);
      a[a++] = (byte)(a >>> 16);
      a[a++] = (byte)(a >>> 8);
      a[a++] = (byte)a;
      this.Field991 = a;
      return this;
   }

   public Class138 Method491(String a) {
      int a = a.length();
      if (a > 65535) {
         throw new IllegalArgumentException();
      } else {
         int a = this.Field991;
         if (a + 2 + a > this.Field990.length) {
            this.Method494(2 + a);
         }

         byte[] a = this.Field990;
         a[a++] = (byte)(a >>> 8);
         a[a++] = (byte)a;

         for(int a = 0; a < a; ++a) {
            char a = a.charAt(a);
            if (a < 1 || a > 127) {
               this.Field991 = a;
               return this.Method492(a, a, 65535);
            }

            a[a++] = (byte)a;
         }

         this.Field991 = a;
         return this;
      }
   }

   Class138 Method492(String a, int a, int a) {
      int a = a.length();
      Class267.Method2862();
      int a = a;
      char a;
      int a;
      if (a < a) {
         a = a.charAt(a);
         if (a >= 1 && a <= 127) {
            a = a + 1;
         }

         if (a > 2047) {
            a += 3;
         }

         a += 2;
         a = a + 1;
      }

      if (a > a) {
         throw new IllegalArgumentException();
      } else {
         a = this.Field991 - a - 2;
         this.Field990[a] = (byte)(a >>> 8);
         this.Field990[a + 1] = (byte)a;
         if (this.Field991 + a - a > this.Field990.length) {
            this.Method494(a - a);
         }

         int a = this.Field991;
         if (a < a) {
            a = a.charAt(a);
            if (a >= 1 && a <= 127) {
               this.Field990[a++] = (byte)a;
            }

            if (a > 2047) {
               this.Field990[a++] = (byte)(224 | a >> 12 & 15);
               this.Field990[a++] = (byte)(128 | a >> 6 & 63);
               this.Field990[a++] = (byte)(128 | a & 63);
            }

            this.Field990[a++] = (byte)(192 | a >> 6 & 31);
            this.Field990[a++] = (byte)(128 | a & 63);
            int var10 = a + 1;
         }

         this.Field991 = a;
         return this;
      }
   }

   public Class138 Method493(byte[] a, int a, int a) {
      if (this.Field991 + a > this.Field990.length) {
         this.Method494(a);
      }

      System.arraycopy(a, a, this.Field990, this.Field991, a);
      this.Field991 += a;
      return this;
   }

   private void Method494(int a) {
      int a = 2 * this.Field990.length;
      int a = this.Field991 + a;
      byte[] a = new byte[a > a ? a : a];
      System.arraycopy(this.Field990, 0, a, 0, this.Field991);
      this.Field990 = a;
   }

   private static IllegalArgumentException Method495(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
