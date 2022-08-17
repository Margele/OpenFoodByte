package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import obfuscate.a;

public class Class224 extends Class167 {
   public int Field1242;
   public int Field1243;
   public String Field1244;
   public String Field1245;
   public String Field1246;
   public List Field1247;
   public String Field1248;
   public String Field1249;
   public String Field1250;
   public String Field1251;
   public String Field1252;
   public List Field1253;
   public List Field1254;
   public List Field1255;
   public List Field1256;
   public List Field1257;
   public List Field1258;
   public List Field1259;
   public List Field1260;

   public Class224() {
      this(327680);
      if (this.getClass() != Class224.class) {
         throw new IllegalStateException();
      }
   }

   public Class224(int a) {
      super(a);
      this.Field1247 = new ArrayList();
      this.Field1258 = new ArrayList();
      this.Field1259 = new ArrayList();
      this.Field1260 = new ArrayList();
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      this.Field1242 = a;
      this.Field1243 = a;
      this.Field1244 = a;
      this.Field1245 = a;
      this.Field1246 = a;
      this.Field1247.addAll(Arrays.asList(a));
   }

   public void Method1458(String a, String a) {
      this.Field1248 = a;
      this.Field1249 = a;
   }

   public void Method1453(String a, String a, String a) {
      this.Field1250 = a;
      this.Field1251 = a;
      this.Field1252 = a;
   }

   public Class148 Method1448(String a, boolean a) {
      Class124 var3 = new Class124(a);
      if (this.Field1253 == null) {
         this.Field1253 = new ArrayList(1);
      }

      this.Field1253.Method2530(var3);
      return var3;
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      Class126 var5 = new Class126(a, a, a);
      if (this.Field1255 == null) {
         this.Field1255 = new ArrayList(1);
      }

      this.Field1255.Method2530(var5);
      return var5;
   }

   public void Method1459(Class136 a) {
      if (this.Field1257 == null) {
         this.Field1257 = new ArrayList(1);
      }

      this.Field1257.Method2530(a);
   }

   public void Method1452(String a, String a, String a, int a) {
      Class114 var5 = new Class114(a, a, a, a);
      this.Field1258.Method2530(var5);
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      Class241 var6 = new Class241(a, a, a, a, a);
      this.Field1259.Method2530(var6);
      return var6;
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      Class15 var6 = new Class15(a, a, a, a, a);
      this.Field1260.Method2530(var6);
      return var6;
   }

   public void Method1460() {
   }

   public void Method2212(int a) {
      if (a == 262144) {
         if (this.Field1255 != null && this.Field1255.Method1799() > 0) {
            throw new RuntimeException();
         }

         if (this.Field1256 != null && this.Field1256.Method1799() > 0) {
            throw new RuntimeException();
         }

         Iterator var2 = this.Field1259.Method1383();

         while(var2.Method932()) {
            Class241 var3 = (Class241)var2.Method933();
            var3.Method2279(a);
         }

         var2 = this.Field1260.Method1383();

         while(var2.Method932()) {
            Class15 var4 = (Class15)var2.Method933();
            var4.Method1869(a);
         }
      }

   }

   public void Method2213(Class167 a) {
      Class15.Method3445();
      String[] var3 = new String[this.Field1247.Method1799()];
      this.Field1247.toArray(var3);
      a.Method1447(this.Field1242, this.Field1243, this.Field1244, this.Field1245, this.Field1246, var3);
      if (this.Field1248 != null || this.Field1249 != null) {
         a.Method1458(this.Field1248, this.Field1249);
      }

      if (this.Field1250 != null) {
         a.Method1453(this.Field1250, this.Field1251, this.Field1252);
      }

      int var5 = this.Field1253 == null ? 0 : this.Field1253.Method1799();
      int var4 = 0;
      Class124 var6;
      if (var4 < var5) {
         var6 = (Class124)this.Field1253.get(var4);
         var6.Method646(a.Method1448(var6.Field973, true));
         ++var4;
         a.trash(new String[1]);
      }

      var5 = this.Field1254 == null ? 0 : this.Field1254.Method1799();
      byte var7 = 0;
      if (var7 < var5) {
         var6 = (Class124)this.Field1254.get(var7);
         var6.Method646(a.Method1448(var6.Field973, false));
         var4 = var7 + 1;
      }

      var5 = this.Field1255 == null ? 0 : this.Field1255.Method1799();
      var7 = 0;
      Class126 var8;
      if (var7 < var5) {
         var8 = (Class126)this.Field1255.get(var7);
         var8.Method646(a.Method1449(var8.Field975, var8.Field976, var8.Field973, true));
         var4 = var7 + 1;
      }

      var5 = this.Field1256 == null ? 0 : this.Field1256.Method1799();
      var7 = 0;
      if (var7 < var5) {
         var8 = (Class126)this.Field1256.get(var7);
         var8.Method646(a.Method1449(var8.Field975, var8.Field976, var8.Field973, false));
         var4 = var7 + 1;
      }

      var5 = this.Field1257 == null ? 0 : this.Field1257.Method1799();
      var7 = 0;
      if (var7 < var5) {
         a.Method1459((Class136)this.Field1257.get(var7));
         var4 = var7 + 1;
      }

      var7 = 0;
      if (var7 < this.Field1258.Method1799()) {
         ((Class114)this.Field1258.get(var7)).Method130(a);
         var4 = var7 + 1;
      }

      var7 = 0;
      if (var7 < this.Field1259.Method1799()) {
         ((Class241)this.Field1259.get(var7)).Method2280(a);
         var4 = var7 + 1;
      }

      var7 = 0;
      if (var7 < this.Field1260.Method1799()) {
         ((Class15)this.Field1260.get(var7)).Method3443(a);
         var4 = var7 + 1;
      }

      a.Method1460();
   }

   private static IllegalStateException Method2214(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
