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
         int a = (Boolean)a ? 1 : 0;
         this.Field1013.Method488(90, this.Field1010.Method1519(a).Field1426);
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

      int a;
      if (a instanceof byte[]) {
         byte[] a = (byte[])((byte[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(66, this.Field1010.Method1519(a[a]).Field1426);
            ++a;
         }
      }

      byte a;
      if (a instanceof boolean[]) {
         boolean[] a = (boolean[])((boolean[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(90, this.Field1010.Method1519(a[a] ? 1 : 0).Field1426);
            a = a + 1;
         }
      }

      if (a instanceof short[]) {
         short[] a = (short[])((short[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(83, this.Field1010.Method1519(a[a]).Field1426);
            a = a + 1;
         }
      }

      if (a instanceof char[]) {
         char[] a = (char[])((char[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(67, this.Field1010.Method1519(a[a]).Field1426);
            a = a + 1;
         }
      }

      if (a instanceof int[]) {
         int[] a = (int[])((int[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(73, this.Field1010.Method1519(a[a]).Field1426);
            a = a + 1;
         }
      }

      if (a instanceof long[]) {
         long[] a = (long[])((long[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(74, this.Field1010.Method1521(a[a]).Field1426);
            a = a + 1;
         }
      }

      if (a instanceof float[]) {
         float[] a = (float[])((float[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(70, this.Field1010.Method1520(a[a]).Field1426);
            a = a + 1;
         }
      }

      if (a instanceof double[]) {
         double[] a = (double[])((double[])a);
         this.Field1013.Method488(91, a.length);
         a = 0;
         if (a < a.length) {
            this.Field1013.Method488(68, this.Field1010.Method1522(a[a]).Field1426);
            a = a + 1;
         }
      }

      Class261 a = this.Field1010.Method1504(a);
      this.Field1013.Method488(".s.IFJDCS".charAt(a.Field1427), a.Field1426);
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
         byte[] a = this.Field1014.Field990;
         a[this.Field1015] = (byte)(this.Field1011 >>> 8);
         a[this.Field1015 + 1] = (byte)this.Field1011;
      }

   }

   int Method1321() {
      int a = 0;
      Class150 a = this;

      while(true) {
         a += a.Field1013.Field991;
         a = a.Field1016;
      }
   }

   void Method1322(Class138 a) {
      int a = 0;
      int a = 2;
      Class150 a = this;
      Class150 a = null;

      while(true) {
         ++a;
         a += a.Field1013.Field991;
         a.Method401();
         a.Field1017 = a;
         a = a;
         a = a.Field1016;
      }
   }

   static void Method1323(Class150[] a, int a, Class138 a) {
      int a = 1 + 2 * (a.length - a);

      for(int a = a; a < a.length; ++a) {
         a += a[a] == null ? 0 : a[a].Method1321();
      }

      a.Method489(a).Method485(a.length - a);
      if (a < a.length) {
         Class150 a = a[a];
         Class150 a = null;
         int a = 0;

         while(true) {
            ++a;
            a.Method401();
            a.Field1017 = a;
            a = a;
            a = a.Field1016;
         }
      }

   }

   static void Method1324(int a, Class31 a1, Class138 a) {
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
