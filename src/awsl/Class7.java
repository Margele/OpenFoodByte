package awsl;

public class Class7 extends Class0 {
   protected final Class37 Field110;

   public Class7(int a, String a, Class267 a, Class37 a) {
      this(327680, a, a, a, a);
   }

   protected Class7(int a, int a, String a, Class267 a, Class37 a) {
      super(a, a, a, a);
      this.Field110 = a;
   }

   public Class148 Method1968() {
      Class148 a = super.Method1968();
      return a;
   }

   public Class148 Method1969(String a, boolean a) {
      Class148 a = super.Method1969(this.Field110.Method3372(a), a);
      return a;
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a) {
      Class148 a = super.Method1970(a, a, this.Field110.Method3372(a), a);
      return a;
   }

   public Class148 Method1971(int a, String a, boolean a) {
      Class148 a = super.Method1971(a, this.Field110.Method3372(a), a);
      return a;
   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      super.Method1845(a, a, this.Method1972(a, a), a, this.Method1972(a, a));
   }

   private Object[] Method1972(int a, Object[] a) {
      Class37.Method3382();
      int a = 0;
      if (a < a) {
         if (a[a] instanceof String) {
            Object[] a = new Object[a];
            System.arraycopy(a, 0, a, 0, a);

            do {
               Object a = a[a];
               a[a++] = a instanceof String ? this.Field110.Method3374((String)a) : a;
            } while(a < a);

            return a;
         }

         ++a;
      }

      return a;
   }

   public void Method1949(int a, String a, String a, String a) {
      super.Method1949(a, this.Field110.Method3374(a), this.Field110.Method3185(a, a, a), this.Field110.Method3372(a));
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
      if (this.Field1460 != null) {
         this.Field1460.Method1954(a, this.Field110.Method3374(a), this.Field110.Method3184(a, a, a), this.Field110.Method3376(a), a);
      }

   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      Class37.Method3383();
      int a = 0;
      if (a < a.length) {
         a[a] = this.Field110.Method3377(a[a]);
         ++a;
      }

      super.Method1956(this.Field110.Method3380(a, a), this.Field110.Method3376(a), (Class279)this.Field110.Method3377(a), a);
   }

   public void Method1952(int a, String a) {
      super.Method1952(a, this.Field110.Method3374(a));
   }

   public void Method1950(Object a) {
      super.Method1950(this.Field110.Method3377(a));
   }

   public void Method1951(String a, int a) {
      super.Method1951(this.Field110.Method3372(a), a);
   }

   public Class148 Method1973(int a, Class31 a, String a, boolean a) {
      Class148 a = super.Method1973(a, a, this.Field110.Method3372(a), a);
      return a;
   }

   public void Method1960(Class264 a, Class264 a, Class264 a, String a3) {
      super.Method1960(a, a, a, (String)null);
   }

   public Class148 Method1974(int a, Class31 a, String a, boolean a) {
      Class148 a = super.Method1974(a, a, this.Field110.Method3372(a), a);
      return a;
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      super.Method1843(a, this.Field110.Method3372(a), this.Field110.Method3378(a, true), a, a, a);
   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a) {
      Class148 a = super.Method1844(a, a, a, a, a, this.Field110.Method3372(a), a);
      return a;
   }
}
