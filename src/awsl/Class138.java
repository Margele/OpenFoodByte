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
      int var2 = this.Field991;
      if (var2 + 1 > this.Field990.length) {
         this.Method494(1);
      }

      this.Field990[var2++] = (byte)a;
      this.Field991 = var2;
      return this;
   }

   Class138 Method486(int a, int a) {
      int var3 = this.Field991;
      if (var3 + 2 > this.Field990.length) {
         this.Method494(2);
      }

      byte[] var4 = this.Field990;
      var4[var3++] = (byte)a;
      var4[var3++] = (byte)a;
      this.Field991 = var3;
      return this;
   }

   public Class138 Method487(int a) {
      int var2 = this.Field991;
      if (var2 + 2 > this.Field990.length) {
         this.Method494(2);
      }

      byte[] var3 = this.Field990;
      var3[var2++] = (byte)(a >>> 8);
      var3[var2++] = (byte)a;
      this.Field991 = var2;
      return this;
   }

   Class138 Method488(int a, int a) {
      int var3 = this.Field991;
      if (var3 + 3 > this.Field990.length) {
         this.Method494(3);
      }

      byte[] var4 = this.Field990;
      var4[var3++] = (byte)a;
      var4[var3++] = (byte)(a >>> 8);
      var4[var3++] = (byte)a;
      this.Field991 = var3;
      return this;
   }

   public Class138 Method489(int a) {
      int var2 = this.Field991;
      if (var2 + 4 > this.Field990.length) {
         this.Method494(4);
      }

      byte[] var3 = this.Field990;
      var3[var2++] = (byte)(a >>> 24);
      var3[var2++] = (byte)(a >>> 16);
      var3[var2++] = (byte)(a >>> 8);
      var3[var2++] = (byte)a;
      this.Field991 = var2;
      return this;
   }

   public Class138 Method490(long a) {
      int var3 = this.Field991;
      if (var3 + 8 > this.Field990.length) {
         this.Method494(8);
      }

      byte[] var4 = this.Field990;
      int var5 = (int)(a >>> 32);
      var4[var3++] = (byte)(var5 >>> 24);
      var4[var3++] = (byte)(var5 >>> 16);
      var4[var3++] = (byte)(var5 >>> 8);
      var4[var3++] = (byte)var5;
      var5 = (int)a;
      var4[var3++] = (byte)(var5 >>> 24);
      var4[var3++] = (byte)(var5 >>> 16);
      var4[var3++] = (byte)(var5 >>> 8);
      var4[var3++] = (byte)var5;
      this.Field991 = var3;
      return this;
   }

   public Class138 Method491(String a) {
      int var2 = a.length();
      if (var2 > 65535) {
         throw new IllegalArgumentException();
      } else {
         int var3 = this.Field991;
         if (var3 + 2 + var2 > this.Field990.length) {
            this.Method494(2 + var2);
         }

         byte[] var4 = this.Field990;
         var4[var3++] = (byte)(var2 >>> 8);
         var4[var3++] = (byte)var2;

         for(int var5 = 0; var5 < var2; ++var5) {
            char var6 = a.charAt(var5);
            if (var6 < 1 || var6 > 127) {
               this.Field991 = var3;
               return this.Method492(a, var5, 65535);
            }

            var4[var3++] = (byte)var6;
         }

         this.Field991 = var3;
         return this;
      }
   }

   Class138 Method492(String a, int a, int a) {
      int var5 = a.length();
      Class267.Method2862();
      int var6 = a;
      char var7;
      int var8;
      if (a < var5) {
         var7 = a.charAt(a);
         if (var7 >= 1 && var7 <= 127) {
            var6 = a + 1;
         }

         if (var7 > 2047) {
            var6 += 3;
         }

         var6 += 2;
         var8 = a + 1;
      }

      if (var6 > a) {
         throw new IllegalArgumentException();
      } else {
         var8 = this.Field991 - a - 2;
         this.Field990[var8] = (byte)(var6 >>> 8);
         this.Field990[var8 + 1] = (byte)var6;
         if (this.Field991 + var6 - a > this.Field990.length) {
            this.Method494(var6 - a);
         }

         int var9 = this.Field991;
         if (a < var5) {
            var7 = a.charAt(a);
            if (var7 >= 1 && var7 <= 127) {
               this.Field990[var9++] = (byte)var7;
            }

            if (var7 > 2047) {
               this.Field990[var9++] = (byte)(224 | var7 >> 12 & 15);
               this.Field990[var9++] = (byte)(128 | var7 >> 6 & 63);
               this.Field990[var9++] = (byte)(128 | var7 & 63);
            }

            this.Field990[var9++] = (byte)(192 | var7 >> 6 & 31);
            this.Field990[var9++] = (byte)(128 | var7 & 63);
            int var10 = a + 1;
         }

         this.Field991 = var9;
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
      int var2 = 2 * this.Field990.length;
      int var3 = this.Field991 + a;
      byte[] var4 = new byte[var2 > var3 ? var2 : var3];
      System.arraycopy(this.Field990, 0, var4, 0, this.Field991);
      this.Field990 = var4;
   }

   private static IllegalArgumentException Method495(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
