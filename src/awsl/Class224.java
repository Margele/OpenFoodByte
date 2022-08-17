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

   public Class148 Method1448(String a, boolean a1) {
      Class124 a = new Class124(a);
      if (this.Field1253 == null) {
         this.Field1253 = new ArrayList(1);
      }

      this.Field1253.Method2530(a);
      return a;
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a3) {
      Class126 a = new Class126(a, a, a);
      if (this.Field1255 == null) {
         this.Field1255 = new ArrayList(1);
      }

      this.Field1255.Method2530(a);
      return a;
   }

   public void Method1459(Class136 a) {
      if (this.Field1257 == null) {
         this.Field1257 = new ArrayList(1);
      }

      this.Field1257.Method2530(a);
   }

   public void Method1452(String a, String a, String a, int a) {
      Class114 a = new Class114(a, a, a, a);
      this.Field1258.Method2530(a);
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      Class241 a = new Class241(a, a, a, a, a);
      this.Field1259.Method2530(a);
      return a;
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      Class15 a = new Class15(a, a, a, a, a);
      this.Field1260.Method2530(a);
      return a;
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
            Class241 a = (Class241)var2.Method933();
            a.Method2279(a);
         }

         var2 = this.Field1260.Method1383();

         while(var2.Method932()) {
            Class15 a = (Class15)var2.Method933();
            a.Method1869(a);
         }
      }

   }

   public void Method2213(Class167 a) {
      Class15.Method3445();
      String[] a = new String[this.Field1247.Method1799()];
      this.Field1247.toArray(a);
      a.Method1447(this.Field1242, this.Field1243, this.Field1244, this.Field1245, this.Field1246, a);
      if (this.Field1248 != null || this.Field1249 != null) {
         a.Method1458(this.Field1248, this.Field1249);
      }

      if (this.Field1250 != null) {
         a.Method1453(this.Field1250, this.Field1251, this.Field1252);
      }

      int a = this.Field1253 == null ? 0 : this.Field1253.Method1799();
      int a = 0;
      Class124 a;
      if (a < a) {
         a = (Class124)this.Field1253.get(a);
         a.Method646(a.Method1448(a.Field973, true));
         ++a;
         a.trash(new String[1]);
      }

      a = this.Field1254 == null ? 0 : this.Field1254.Method1799();
      int a = 0;
      if (a < a) {
         a = (Class124)this.Field1254.get(a);
         a.Method646(a.Method1448(a.Field973, false));
         a = a + 1;
      }

      a = this.Field1255 == null ? 0 : this.Field1255.Method1799();
      a = 0;
      Class126 a;
      if (a < a) {
         a = (Class126)this.Field1255.get(a);
         a.Method646(a.Method1449(a.Field975, a.Field976, a.Field973, true));
         a = a + 1;
      }

      a = this.Field1256 == null ? 0 : this.Field1256.Method1799();
      a = 0;
      if (a < a) {
         a = (Class126)this.Field1256.get(a);
         a.Method646(a.Method1449(a.Field975, a.Field976, a.Field973, false));
         a = a + 1;
      }

      a = this.Field1257 == null ? 0 : this.Field1257.Method1799();
      a = 0;
      if (a < a) {
         a.Method1459((Class136)this.Field1257.get(a));
         a = a + 1;
      }

      a = 0;
      if (a < this.Field1258.Method1799()) {
         ((Class114)this.Field1258.get(a)).Method130(a);
         a = a + 1;
      }

      a = 0;
      if (a < this.Field1259.Method1799()) {
         ((Class241)this.Field1259.get(a)).Method2280(a);
         a = a + 1;
      }

      a = 0;
      if (a < this.Field1260.Method1799()) {
         ((Class15)this.Field1260.get(a)).Method3443(a);
         a = a + 1;
      }

      a.Method1460();
   }

   private static IllegalStateException Method2214(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
