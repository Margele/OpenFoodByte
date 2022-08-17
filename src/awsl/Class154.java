package awsl;

import obfuscate.b;

public class Class154 extends Class148 {
   private final Class690 Field1019;

   public Class154(Class148 a, Class690 a) {
      super(327680, a);
      this.Field1019 = a;
   }

   public void Method397(String a, Object a) {
      String[] a = Class690.Method2342();
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

      int a;
      if (a instanceof byte[]) {
         byte[] a = (byte[])((byte[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2492(a[a]);
            ++a;
         }
      }

      byte a;
      if (a instanceof boolean[]) {
         boolean[] a = (boolean[])((boolean[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2492(a[a] ? 1 : 0);
            a = a + 1;
         }
      }

      if (a instanceof short[]) {
         short[] a = (short[])((short[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2492(a[a]);
            a = a + 1;
         }
      }

      if (a instanceof char[]) {
         char[] a = (char[])((char[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2492(a[a]);
            a = a + 1;
         }
      }

      if (a instanceof int[]) {
         int[] a = (int[])((int[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2492(a[a]);
            a = a + 1;
         }
      }

      if (a instanceof long[]) {
         long[] a = (long[])((long[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2494(a[a]);
            a = a + 1;
         }
      }

      if (a instanceof float[]) {
         float[] a = (float[])((float[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2493(a[a]);
            a = a + 1;
         }
      }

      if (a instanceof double[]) {
         double[] a = (double[])((double[])a);
         a = 0;
         if (a < a.length) {
            this.Field1019.Method2495(a[a]);
            a = a + 1;
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
