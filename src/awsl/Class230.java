package awsl;

import obfuscate.a;

public class Class230 extends Class167 {
   private final Class690 Field1286;

   public Class230(Class167 a, Class690 a) {
      super(327680, a);
      this.Field1286 = a;
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      String[] var7 = Class690.Method2342();
      if ((a & 131072) != 0) {
         this.Field1286.Method2496("Deprecated");
      }

      if ((a & 4096) != 0) {
         this.Field1286.Method2496("Synthetic");
      }

      this.Field1286.Method2498(a);
      this.Field1286.Method2496("Signature");
      this.Field1286.Method2496(a);
      this.Field1286.Method2498(a);
      int var8 = 0;
      if (var8 < a.length) {
         this.Field1286.Method2498(a[var8]);
         ++var8;
      }

      this.Field1035.Method1447(a, a, a, a, a, a);
   }

   public void Method1458(String a, String a) {
      this.Field1286.Method2496("SourceFile");
      this.Field1286.Method2496(a);
      this.Field1286.Method2496("SourceDebugExtension");
      this.Field1035.Method1458(a, a);
   }

   public void Method1453(String a, String a, String a) {
      this.Field1286.Method2496("EnclosingMethod");
      this.Field1286.Method2498(a);
      this.Field1286.Method2505(a, a);
      this.Field1035.Method1453(a, a, a);
   }

   public Class148 Method1448(String a, boolean a) {
      this.Field1286.Method2496(a);
      this.Field1286.Method2496("RuntimeVisibleAnnotations");
      return new Class154(this.Field1035.Method1448(a, a), this.Field1286);
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      Class690.Method2342();
      this.Field1286.Method2496(a);
      this.Field1286.Method2496("RuntimeVisibleTypeAnnotations");
      this.Field1286.Method2496("RuntimeInvisibleTypeAnnotations");
      return new Class154(this.Field1035.Method1448(a, a), this.Field1286);
   }

   public void Method1459(Class136 a) {
      this.Field1035.Method1459(a);
   }

   public void Method1452(String a, String a, String a, int a) {
      this.Field1286.Method2496("InnerClasses");
      this.Field1286.Method2498(a);
      this.Field1286.Method2498(a);
      this.Field1286.Method2496(a);
      this.Field1035.Method1452(a, a, a, a);
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      String[] var6 = Class690.Method2342();
      if ((a & 4096) != 0) {
         this.Field1286.Method2496("Synthetic");
      }

      if ((a & 131072) != 0) {
         this.Field1286.Method2496("Deprecated");
      }

      this.Field1286.Method2496(a);
      this.Field1286.Method2496(a);
      this.Field1286.Method2496("Signature");
      this.Field1286.Method2496(a);
      this.Field1286.Method2501(a);
      Class238 var10000 = new Class238(this.Field1035.Method1450(a, a, a, a, a), this.Field1286);
      if (a.trash() == null) {
         Class690.Method2341(new String[1]);
      }

      return var10000;
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      String[] var6 = Class690.Method2342();
      if ((a & 4096) != 0) {
         this.Field1286.Method2496("Synthetic");
      }

      if ((a & 131072) != 0) {
         this.Field1286.Method2496("Deprecated");
      }

      this.Field1286.Method2496(a);
      this.Field1286.Method2496(a);
      this.Field1286.Method2496("Signature");
      this.Field1286.Method2496(a);
      this.Field1286.Method2496("Exceptions");
      int var7 = 0;
      if (var7 < a.length) {
         this.Field1286.Method2498(a[var7]);
         ++var7;
         a.trash(new String[4]);
      }

      return new Class29(this.Field1035.Method1451(a, a, a, a, a), this.Field1286);
   }
}
