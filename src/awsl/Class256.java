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

   public Class148 Method2114(String a, boolean a) {
      Class267.Method2862();
      Class138 var4 = new Class138();
      var4.Method487(this.Field1398.Method1506(a)).Method487(0);
      Class150 var5 = new Class150(this.Field1398, true, var4, var4, 2);
      var5.Field1016 = this.Field1404;
      this.Field1404 = var5;
      var5.Field1016 = this.Field1405;
      this.Field1405 = var5;
      return var5;
   }

   public Class148 Method2115(int a, Class31 a, String a, boolean a) {
      Class138 var6 = new Class138();
      Class150.Method1324(a, a, var6);
      Class267.Method2862();
      var6.Method487(this.Field1398.Method1506(a)).Method487(0);
      Class150 var7 = new Class150(this.Field1398, true, var6, var6, var6.Field991 - 2);
      var7.Field1016 = this.Field1406;
      this.Field1406 = var7;
      var7.Field1016 = this.Field1407;
      this.Field1407 = var7;
      return var7;
   }

   public void Method2120(Class136 a) {
      a.Field989 = this.Field1408;
      this.Field1408 = a;
   }

   public void Method2121() {
   }

   int Method2251() {
      int var1 = 8;
      if (this.Field1403 != 0) {
         this.Field1398.Method1506("ConstantValue");
         var1 += 8;
      }

      if ((this.Field1399 & 4096) != 0 && ((this.Field1398.Field1080 & '\uffff') < 49 || (this.Field1399 & 262144) != 0)) {
         this.Field1398.Method1506("Synthetic");
         var1 += 6;
      }

      if ((this.Field1399 & 131072) != 0) {
         this.Field1398.Method1506("Deprecated");
         var1 += 6;
      }

      if (this.Field1402 != 0) {
         this.Field1398.Method1506("Signature");
         var1 += 8;
      }

      if (this.Field1404 != null) {
         this.Field1398.Method1506("RuntimeVisibleAnnotations");
         var1 += 8 + this.Field1404.Method1321();
      }

      if (this.Field1405 != null) {
         this.Field1398.Method1506("RuntimeInvisibleAnnotations");
         var1 += 8 + this.Field1405.Method1321();
      }

      if (this.Field1406 != null) {
         this.Field1398.Method1506("RuntimeVisibleTypeAnnotations");
         var1 += 8 + this.Field1406.Method1321();
      }

      if (this.Field1407 != null) {
         this.Field1398.Method1506("RuntimeInvisibleTypeAnnotations");
         var1 += 8 + this.Field1407.Method1321();
      }

      if (this.Field1408 != null) {
         var1 += this.Field1408.Method474(this.Field1398, (byte[])null, 0, -1, -1);
      }

      return var1;
   }

   void Method2252(Class138 a) {
      boolean var3 = true;
      Class267.Method2862();
      int var4 = 393216 | (this.Field1399 & 262144) / 64;
      a.Method487(this.Field1399 & ~var4).Method487(this.Field1400).Method487(this.Field1401);
      int var5 = 0;
      if (this.Field1403 != 0) {
         ++var5;
      }

      if ((this.Field1399 & 4096) != 0 && ((this.Field1398.Field1080 & '\uffff') < 49 || (this.Field1399 & 262144) != 0)) {
         ++var5;
      }

      if ((this.Field1399 & 131072) != 0) {
         ++var5;
      }

      if (this.Field1402 != 0) {
         ++var5;
      }

      if (this.Field1404 != null) {
         ++var5;
      }

      if (this.Field1405 != null) {
         ++var5;
      }

      if (this.Field1406 != null) {
         ++var5;
      }

      if (this.Field1407 != null) {
         ++var5;
      }

      if (this.Field1408 != null) {
         var5 += this.Field1408.Method473();
      }

      a.Method487(var5);
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
