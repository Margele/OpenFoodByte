package awsl;

import obfuscate.a;

final class Class256 extends Class253 {
   private final Class169 Field1398;
   private final int Field1399;
   private final int Field1400;
   private final int Field1401;
   private int Field1402;
   private int Field1403;
   private Class150 Field1404;
   private Class150 Field1405;
   private Class150 Field1406;
   private Class150 Field1407;
   private Class136 Field1408;

   Class256(Class169 a, int a, String a, String a, String a, Object a) {
      Class267.Method2862();
      super(327680);
      if (a.Field1111 == null) {
         a.Field1111 = this;
      }

      a.Field1112.Field1390 = this;
      a.Field1112 = this;
      this.Field1398 = a;
      this.Field1399 = a;
      this.Field1400 = a.Method1506(a);
      this.Field1401 = a.Method1506(a);
      this.Field1402 = a.Method1506(a);
      this.Field1403 = a.Method1504(a).Field1426;
   }

   public Class148 Method2114(String a, boolean a1) {
      Class267.Method2862();
      Class138 a = new Class138();
      a.Method487(this.Field1398.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field1398, true, a, a, 2);
      a.Field1016 = this.Field1404;
      this.Field1404 = a;
      a.Field1016 = this.Field1405;
      this.Field1405 = a;
      return a;
   }

   public Class148 Method2115(int a, Class31 a, String a, boolean a3) {
      Class138 a = new Class138();
      Class150.Method1324(a, a, a);
      Class267.Method2862();
      a.Method487(this.Field1398.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field1398, true, a, a, a.Field991 - 2);
      a.Field1016 = this.Field1406;
      this.Field1406 = a;
      a.Field1016 = this.Field1407;
      this.Field1407 = a;
      return a;
   }

   public void Method2120(Class136 a) {
      a.Field989 = this.Field1408;
      this.Field1408 = a;
   }

   public void Method2121() {
   }

   int Method2251() {
      int a = 8;
      if (this.Field1403 != 0) {
         this.Field1398.Method1506("ConstantValue");
         a += 8;
      }

      if ((this.Field1399 & 4096) != 0 && ((this.Field1398.Field1080 & '\uffff') < 49 || (this.Field1399 & 262144) != 0)) {
         this.Field1398.Method1506("Synthetic");
         a += 6;
      }

      if ((this.Field1399 & 131072) != 0) {
         this.Field1398.Method1506("Deprecated");
         a += 6;
      }

      if (this.Field1402 != 0) {
         this.Field1398.Method1506("Signature");
         a += 8;
      }

      if (this.Field1404 != null) {
         this.Field1398.Method1506("RuntimeVisibleAnnotations");
         a += 8 + this.Field1404.Method1321();
      }

      if (this.Field1405 != null) {
         this.Field1398.Method1506("RuntimeInvisibleAnnotations");
         a += 8 + this.Field1405.Method1321();
      }

      if (this.Field1406 != null) {
         this.Field1398.Method1506("RuntimeVisibleTypeAnnotations");
         a += 8 + this.Field1406.Method1321();
      }

      if (this.Field1407 != null) {
         this.Field1398.Method1506("RuntimeInvisibleTypeAnnotations");
         a += 8 + this.Field1407.Method1321();
      }

      if (this.Field1408 != null) {
         a += this.Field1408.Method474(this.Field1398, (byte[])null, 0, -1, -1);
      }

      return a;
   }

   void Method2252(Class138 a) {
      boolean var3 = true;
      Class267.Method2862();
      int a = 393216 | (this.Field1399 & 262144) / 64;
      a.Method487(this.Field1399 & ~a).Method487(this.Field1400).Method487(this.Field1401);
      int a = 0;
      if (this.Field1403 != 0) {
         ++a;
      }

      if ((this.Field1399 & 4096) != 0 && ((this.Field1398.Field1080 & '\uffff') < 49 || (this.Field1399 & 262144) != 0)) {
         ++a;
      }

      if ((this.Field1399 & 131072) != 0) {
         ++a;
      }

      if (this.Field1402 != 0) {
         ++a;
      }

      if (this.Field1404 != null) {
         ++a;
      }

      if (this.Field1405 != null) {
         ++a;
      }

      if (this.Field1406 != null) {
         ++a;
      }

      if (this.Field1407 != null) {
         ++a;
      }

      if (this.Field1408 != null) {
         a += this.Field1408.Method473();
      }

      a.Method487(a);
      if (this.Field1403 != 0) {
         a.Method487(this.Field1398.Method1506("ConstantValue"));
         a.Method489(2).Method487(this.Field1403);
      }

      if ((this.Field1399 & 4096) != 0 && ((this.Field1398.Field1080 & '\uffff') < 49 || (this.Field1399 & 262144) != 0)) {
         a.Method487(this.Field1398.Method1506("Synthetic")).Method489(0);
      }

      if ((this.Field1399 & 131072) != 0) {
         a.Method487(this.Field1398.Method1506("Deprecated")).Method489(0);
      }

      if (this.Field1402 != 0) {
         a.Method487(this.Field1398.Method1506("Signature"));
         a.Method489(2).Method487(this.Field1402);
      }

      if (this.Field1404 != null) {
         a.Method487(this.Field1398.Method1506("RuntimeVisibleAnnotations"));
         this.Field1404.Method1322(a);
      }

      if (this.Field1405 != null) {
         a.Method487(this.Field1398.Method1506("RuntimeInvisibleAnnotations"));
         this.Field1405.Method1322(a);
      }

      if (this.Field1406 != null) {
         a.Method487(this.Field1398.Method1506("RuntimeVisibleTypeAnnotations"));
         this.Field1406.Method1322(a);
      }

      if (this.Field1407 != null) {
         a.Method487(this.Field1398.Method1506("RuntimeInvisibleTypeAnnotations"));
         this.Field1407.Method1322(a);
      }

      if (this.Field1408 != null) {
         this.Field1408.Method475(this.Field1398, (byte[])null, 0, -1, -1, a);
      }

      if (a.trash() == null) {
         Class267.Method2861(new String[2]);
      }

   }
}
