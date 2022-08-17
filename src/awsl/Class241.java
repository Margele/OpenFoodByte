package awsl;

import java.util.ArrayList;
import java.util.List;

public class Class241 extends Class253 {
   public int Field1341;
   public String Field1342;
   public String Field1343;
   public String Field1344;
   public Object Field1345;
   public List Field1346;
   public List Field1347;
   public List Field1348;
   public List Field1349;
   public List Field1350;

   public Class241(int a, String a, String a, String a, Object a) {
      this(327680, a, a, a, a, a);
      if (this.getClass() != Class241.class) {
         throw new IllegalStateException();
      }
   }

   public Class241(int a, int a, String a, String a, String a, Object a) {
      super(a);
      this.Field1341 = a;
      this.Field1342 = a;
      this.Field1343 = a;
      this.Field1344 = a;
      this.Field1345 = a;
   }

   public Class148 Method2114(String a, boolean a) {
      Class124 var3 = new Class124(a);
      if (this.Field1346 == null) {
         this.Field1346 = new ArrayList(1);
      }

      this.Field1346.Method2530(var3);
      return var3;
   }

   public Class148 Method2115(int a, Class31 a, String a, boolean a) {
      Class126 var5 = new Class126(a, a, a);
      if (this.Field1348 == null) {
         this.Field1348 = new ArrayList(1);
      }

      this.Field1348.Method2530(var5);
      return var5;
   }

   public void Method2120(Class136 a) {
      if (this.Field1350 == null) {
         this.Field1350 = new ArrayList(1);
      }

      this.Field1350.Method2530(a);
   }

   public void Method2121() {
   }

   public void Method2279(int a) {
      if (a == 262144) {
         if (this.Field1348 != null && this.Field1348.Method1799() > 0) {
            throw new RuntimeException();
         }

         if (this.Field1349 != null && this.Field1349.Method1799() > 0) {
            throw new RuntimeException();
         }
      }

   }

   public void Method2280(Class167 a) {
      Class15.Method1984();
      Class253 var3 = a.Method1450(this.Field1341, this.Field1342, this.Field1343, this.Field1344, this.Field1345);
   }

   private static IllegalStateException Method2281(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
