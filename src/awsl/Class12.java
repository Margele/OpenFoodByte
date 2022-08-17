package awsl;

public class Class12 extends Class267 implements Class45 {
   private int Field188;
   private int Field189;

   public Class12(Class267 a) {
      this(327680, a);
   }

   protected Class12(int a, Class267 a) {
      super(a, a);
   }

   public int Method1984() {
      return this.Field188;
   }

   public int Method3445() {
      return this.Field189;
   }

   public void Method1948(int a) {
      ++this.Field188;
      ++this.Field189;
      if (this.Field1460 != null) {
         this.Field1460.Method1948(a);
      }

   }

   public void Method854(int a, int a) {
      if (a == 17) {
         this.Field188 += 3;
         this.Field189 += 3;
      } else {
         this.Field188 += 2;
         this.Field189 += 2;
      }

      if (this.Field1460 != null) {
         this.Field1460.Method854(a, a);
      }

   }

   public void Method1840(int a, int a) {
      boolean var3 = Class37.Method3382();
      if (a < 4 && a != 169) {
         ++this.Field188;
         ++this.Field189;
      }

      if (a >= 256) {
         this.Field188 += 4;
         this.Field189 += 4;
      }

      this.Field188 += 2;
      this.Field189 += 2;
      if (this.Field1460 != null) {
         this.Field1460.Method1840(a, a);
      }

   }

   public void Method1952(int a, String a) {
      this.Field188 += 3;
      this.Field189 += 3;
      if (this.Field1460 != null) {
         this.Field1460.Method1952(a, a);
      }

   }

   public void Method1949(int a, String a, String a, String a) {
      this.Field188 += 3;
      this.Field189 += 3;
      if (this.Field1460 != null) {
         this.Field1460.Method1949(a, a, a, a);
      }

   }

   /** @deprecated */
   @Deprecated
   public void Method1953(int a, String a, String a, String a) {
      if (this.Field1459 >= 327680) {
         super.Method1953(a, a, a, a);
      } else {
         this.Method1955(a, a, a, a, a == 185);
      }
   }

   public void Method1954(int a, String a, String a, String a, boolean a) {
      if (this.Field1459 < 327680) {
         super.Method1954(a, a, a, a, a);
      } else {
         this.Method1955(a, a, a, a, a);
      }
   }

   private void Method1955(int a, String a, String a, String a, boolean a) {
      if (a == 185) {
         this.Field188 += 5;
         this.Field189 += 5;
      } else {
         this.Field188 += 3;
         this.Field189 += 3;
      }

      if (this.Field1460 != null) {
         this.Field1460.Method1954(a, a, a, a, a);
      }

   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      this.Field188 += 5;
      this.Field189 += 5;
      if (this.Field1460 != null) {
         this.Field1460.Method1956(a, a, a, a);
      }

   }

   public void Method1957(int a, Class264 a) {
      this.Field188 += 3;
      if (a != 167 && a != 168) {
         this.Field189 += 8;
      } else {
         this.Field189 += 5;
      }

      if (this.Field1460 != null) {
         this.Field1460.Method1957(a, a);
      }

   }

   public void Method1950(Object a) {
      if (!(a instanceof Long) && !(a instanceof Double)) {
         this.Field188 += 2;
         this.Field189 += 3;
      } else {
         this.Field188 += 3;
         this.Field189 += 3;
      }

      if (this.Field1460 != null) {
         this.Field1460.Method1950(a);
      }

   }

   public void Method1841(int a, int a) {
      boolean var3 = Class37.Method3382();
      if (a > 255 || a > 127 || a < -128) {
         this.Field188 += 6;
         this.Field189 += 6;
      }

      this.Field188 += 3;
      this.Field189 += 3;
      if (this.Field1460 != null) {
         this.Field1460.Method1841(a, a);
      }

   }

   public void Method1959(int a, int a, Class264 a, Class264[] a) {
      this.Field188 += 13 + a.length * 4;
      this.Field189 += 16 + a.length * 4;
      if (this.Field1460 != null) {
         this.Field1460.Method1959(a, a, a, a);
      }

   }

   public void Method1958(Class264 a, int[] a, Class264[] a) {
      this.Field188 += 9 + a.length * 8;
      this.Field189 += 12 + a.length * 8;
      if (this.Field1460 != null) {
         this.Field1460.Method1958(a, a, a);
      }

   }

   public void Method1951(String a, int a) {
      this.Field188 += 4;
      this.Field189 += 4;
      if (this.Field1460 != null) {
         this.Field1460.Method1951(a, a);
      }

   }
}
