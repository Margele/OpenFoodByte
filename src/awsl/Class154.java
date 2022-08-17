package awsl;

import obfuscate.b;

public class Class154 extends Class148 {
   private final Class690 Field1019;

   public Class154(Class148 a, Class690 a) {
      super(327680, a);
      this.Field1019 = a;
   }

   public void Method397(String a, Object a) {
      String[] var3 = Class690.Method2342();
      this.Field1019.Method2496(a);
      if (a instanceof Byte) {
         this.Field1019.Method2492((Byte)a);
      }

      if (a instanceof Boolean) {
         this.Field1019.Method2492((Boolean)a ? 1 : 0);
      }

      if (a instanceof Character) {
         this.Field1019.Method2492((Character)a);
      }

      if (a instanceof Short) {
         this.Field1019.Method2492((Short)a);
      }

      if (a instanceof b) {
         this.Field1019.Method2496(((b)a).Method3225());
      }

      int var5;
      if (a instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])a);
         var5 = 0;
         if (var5 < var4.length) {
            this.Field1019.Method2492(var4[var5]);
            ++var5;
         }
      }

      byte var10;
      if (a instanceof boolean[]) {
         boolean[] var6 = (boolean[])((boolean[])a);
         var10 = 0;
         if (var10 < var6.length) {
            this.Field1019.Method2492(var6[var10] ? 1 : 0);
            var5 = var10 + 1;
         }
      }

      if (a instanceof short[]) {
         short[] var7 = (short[])((short[])a);
         var10 = 0;
         if (var10 < var7.length) {
            this.Field1019.Method2492(var7[var10]);
            var5 = var10 + 1;
         }
      }

      if (a instanceof char[]) {
         char[] var8 = (char[])((char[])a);
         var10 = 0;
         if (var10 < var8.length) {
            this.Field1019.Method2492(var8[var10]);
            var5 = var10 + 1;
         }
      }

      if (a instanceof int[]) {
         int[] var9 = (int[])((int[])a);
         var10 = 0;
         if (var10 < var9.length) {
            this.Field1019.Method2492(var9[var10]);
            var5 = var10 + 1;
         }
      }

      if (a instanceof long[]) {
         long[] var11 = (long[])((long[])a);
         var10 = 0;
         if (var10 < var11.length) {
            this.Field1019.Method2494(var11[var10]);
            var5 = var10 + 1;
         }
      }

      if (a instanceof float[]) {
         float[] var12 = (float[])((float[])a);
         var10 = 0;
         if (var10 < var12.length) {
            this.Field1019.Method2493(var12[var10]);
            var5 = var10 + 1;
         }
      }

      if (a instanceof double[]) {
         double[] var13 = (double[])((double[])a);
         var10 = 0;
         if (var10 < var13.length) {
            this.Field1019.Method2495(var13[var10]);
            var5 = var10 + 1;
         }
      }

      this.Field1019.Method2501(a);
      this.Field1006.Method397(a, a);
   }

   public void Method398(String a, String a, String a) {
      this.Field1019.Method2496(a);
      this.Field1019.Method2496(a);
      this.Field1019.Method2496(a);
      this.Field1006.Method398(a, a, a);
   }

   public Class148 Method399(String a, String a) {
      this.Field1019.Method2496(a);
      this.Field1019.Method2496(a);
      return new Class154(this.Field1006.Method399(a, a), this.Field1019);
   }

   public Class148 Method400(String a) {
      this.Field1019.Method2496(a);
      return new Class154(this.Field1006.Method400(a), this.Field1019);
   }

   public void Method401() {
      this.Field1006.Method401();
   }
}
