package awsl;

import java.util.ArrayList;
import java.util.List;

public class Class124 extends Class148 {
   public String Field973;
   public List Field974;

   public Class124(String a) {
      this(327680, a);
      if (this.getClass() != Class124.class) {
         throw new IllegalStateException();
      }
   }

   public Class124(int a, String a) {
      super(a);
      this.Field973 = a;
   }

   Class124(List a) {
      super(327680);
      this.Field974 = a;
   }

   public void Method397(String a, Object a) {
      if (this.Field974 == null) {
         this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
      }

      if (this.Field973 != null) {
         this.Field974.Method2530(a);
      }

      this.Field974.Method2530(a);
   }

   public void Method398(String a, String a, String a) {
      if (this.Field974 == null) {
         this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
      }

      if (this.Field973 != null) {
         this.Field974.Method2530(a);
      }

      this.Field974.Method2530(new String[]{a, a});
   }

   public Class148 Method399(String a, String a) {
      if (this.Field974 == null) {
         this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
      }

      if (this.Field973 != null) {
         this.Field974.Method2530(a);
      }

      Class124 a = new Class124(a);
      this.Field974.Method2530(a);
      return a;
   }

   public Class148 Method400(String a) {
      if (this.Field974 == null) {
         this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
      }

      if (this.Field973 != null) {
         this.Field974.Method2530(a);
      }

      List a = new ArrayList();
      this.Field974.Method2530(a);
      return new Class124(a);
   }

   public void Method401() {
   }

   public void Method645(int a) {
   }

   public void Method646(Class148 a) {
      if (this.Field974 != null) {
         for(int a = 0; a < this.Field974.Method1799(); a += 2) {
            String a = (String)this.Field974.get(a);
            Object a = this.Field974.get(a + 1);
            Method647(a, a, a);
         }
      }

      a.Method401();
   }

   static void Method647(Class148 a, String a, Object a) {
      int a = Class15.Method3445();
      if (a instanceof String[]) {
         String[] a = (String[])((String[])a);
         a.Method398(a, a[0], a[1]);
      }

      if (a instanceof Class124) {
         Class124 a = (Class124)a;
         a.Method646(a.Method399(a, a.Field973));
      }

      if (a instanceof List) {
         Class148 a = a.Method400(a);
         List a = (List)a;
         int a = 0;
         if (a < a.Method1799()) {
            Method647(a, (String)null, a.get(a));
            ++a;
         }

         a.Method401();
      }

      a.Method397(a, a);
   }

   private static IllegalStateException Method648(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
