package awsl;

import obfuscate.b;

final class Class150 extends Class148 {
   private final Class169 Field1010;
   private int Field1011;
   private final boolean Field1012;
   private final Class138 Field1013;
   private final Class138 Field1014;
   private final int Field1015;
   Class150 Field1016;
   Class150 Field1017;

   Class150(Class169 a, boolean a, Class138 a, Class138 a, int a) {
      super(327680);
      this.Field1010 = a;
      this.Field1012 = a;
      this.Field1013 = a;
      this.Field1014 = a;
      this.Field1015 = a;
   }

   public void Method397(String a, Object a) {
      Class267.Method2862();
      ++this.Field1011;
      if (this.Field1012) {
         this.Field1013.Method487(this.Field1010.Method1506(a));
      }

      if (a instanceof String) {
         this.Field1013.Method488(115, this.Field1010.Method1506((String)a));
      }

      if (a instanceof Byte) {
         this.Field1013.Method488(66, this.Field1010.Method1519((Byte)a).Field1426);
      }

      if (a instanceof Boolean) {
         int var4 = (Boolean)a ? 1 : 0;
         this.Field1013.Method488(90, this.Field1010.Method1519(var4).Field1426);
      }

      if (a instanceof Character) {
         this.Field1013.Method488(67, this.Field1010.Method1519((Character)a).Field1426);
      }

      if (a instanceof Short) {
         this.Field1013.Method488(83, this.Field1010.Method1519((Short)a).Field1426);
      }

      if (a instanceof b) {
         this.Field1013.Method488(99, this.Field1010.Method1506(((b)a).Method3225()));
      }

      int var5;
      if (a instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])a);
         this.Field1013.Method488(91, var6.length);
         var5 = 0;
         if (var5 < var6.length) {
            this.Field1013.Method488(66, this.Field1010.Method1519(var6[var5]).Field1426);
            ++var5;
         }
      }

      byte var10;
      if (a instanceof boolean[]) {
         boolean[] var7 = (boolean[])((boolean[])a);
         this.Field1013.Method488(91, var7.length);
         var10 = 0;
         if (var10 < var7.length) {
            this.Field1013.Method488(90, this.Field1010.Method1519(var7[var10] ? 1 : 0).Field1426);
            var5 = var10 + 1;
         }
      }

      if (a instanceof short[]) {
         short[] var8 = (short[])((short[])a);
         this.Field1013.Method488(91, var8.length);
         var10 = 0;
         if (var10 < var8.length) {
            this.Field1013.Method488(83, this.Field1010.Method1519(var8[var10]).Field1426);
            var5 = var10 + 1;
         }
      }

      if (a instanceof char[]) {
         char[] var9 = (char[])((char[])a);
         this.Field1013.Method488(91, var9.length);
         var10 = 0;
         if (var10 < var9.length) {
            this.Field1013.Method488(67, this.Field1010.Method1519(var9[var10]).Field1426);
            var5 = var10 + 1;
         }
      }

      if (a instanceof int[]) {
         int[] var11 = (int[])((int[])a);
         this.Field1013.Method488(91, var11.length);
         var10 = 0;
         if (var10 < var11.length) {
            this.Field1013.Method488(73, this.Field1010.Method1519(var11[var10]).Field1426);
            var5 = var10 + 1;
         }
      }

      if (a instanceof long[]) {
         long[] var12 = (long[])((long[])a);
         this.Field1013.Method488(91, var12.length);
         var10 = 0;
         if (var10 < var12.length) {
            this.Field1013.Method488(74, this.Field1010.Method1521(var12[var10]).Field1426);
            var5 = var10 + 1;
         }
      }

      if (a instanceof float[]) {
         float[] var13 = (float[])((float[])a);
         this.Field1013.Method488(91, var13.length);
         var10 = 0;
         if (var10 < var13.length) {
            this.Field1013.Method488(70, this.Field1010.Method1520(var13[var10]).Field1426);
            var5 = var10 + 1;
         }
      }

      if (a instanceof double[]) {
         double[] var14 = (double[])((double[])a);
         this.Field1013.Method488(91, var14.length);
         var10 = 0;
         if (var10 < var14.length) {
            this.Field1013.Method488(68, this.Field1010.Method1522(var14[var10]).Field1426);
            var5 = var10 + 1;
         }
      }

      Class261 var15 = this.Field1010.Method1504(a);
      this.Field1013.Method488(".s.IFJDCS".charAt(var15.Field1427), var15.Field1426);
   }

   public void Method398(String a, String a, String a) {
      ++this.Field1011;
      if (this.Field1012) {
         this.Field1013.Method487(this.Field1010.Method1506(a));
      }

      this.Field1013.Method488(101, this.Field1010.Method1506(a)).Method487(this.Field1010.Method1506(a));
   }

   public Class148 Method399(String a, String a) {
      ++this.Field1011;
      if (this.Field1012) {
         this.Field1013.Method487(this.Field1010.Method1506(a));
      }

      this.Field1013.Method488(64, this.Field1010.Method1506(a)).Method487(0);
      return new Class150(this.Field1010, true, this.Field1013, this.Field1013, this.Field1013.Field991 - 2);
   }

   public Class148 Method400(String a) {
      ++this.Field1011;
      if (this.Field1012) {
         this.Field1013.Method487(this.Field1010.Method1506(a));
      }

      this.Field1013.Method488(91, 0);
      return new Class150(this.Field1010, false, this.Field1013, this.Field1013, this.Field1013.Field991 - 2);
   }

   public void Method401() {
      if (this.Field1014 != null) {
         byte[] var1 = this.Field1014.Field990;
         var1[this.Field1015] = (byte)(this.Field1011 >>> 8);
         var1[this.Field1015 + 1] = (byte)this.Field1011;
      }

   }

   int Method1321() {
      int var1 = 0;
      Class150 var2 = this;

      while(true) {
         var1 += var2.Field1013.Field991;
         var2 = var2.Field1016;
      }
   }

   void Method1322(Class138 a) {
      int var2 = 0;
      int var3 = 2;
      Class150 var4 = this;
      Class150 var5 = null;

      while(true) {
         ++var2;
         var3 += var4.Field1013.Field991;
         var4.Method401();
         var4.Field1017 = var5;
         var5 = var4;
         var4 = var4.Field1016;
      }
   }

   static void Method1323(Class150[] a, int a, Class138 a) {
      int var3 = 1 + 2 * (a.length - a);

      for(int var4 = a; var4 < a.length; ++var4) {
         var3 += a[var4] == null ? 0 : a[var4].Method1321();
      }

      a.Method489(var3).Method485(a.length - a);
      if (a < a.length) {
         Class150 var5 = a[a];
         Class150 var6 = null;
         int var7 = 0;

         while(true) {
            ++var7;
            var5.Method401();
            var5.Field1017 = var6;
            var6 = var5;
            var5 = var5.Field1016;
         }
      }

   }

   static void Method1324(int a, Class31 a, Class138 a) {
      switch (a >>> 24) {
         case 0:
         case 1:
         case 22:
            a.Method487(a >>> 16);
            break;
         case 19:
         case 20:
         case 21:
            a.Method485(a >>> 24);
            break;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            a.Method489(a);
            break;
         default:
            a.Method488(a >>> 24, (a & 16776960) >> 8);
      }

      a.Method485(0);
   }
}
