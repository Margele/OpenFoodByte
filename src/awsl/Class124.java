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

      Class124 var3 = new Class124(a);
      this.Field974.Method2530(var3);
      return var3;
   }

   public Class148 Method400(String a) {
      if (this.Field974 == null) {
         this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
      }

      if (this.Field973 != null) {
         this.Field974.Method2530(a);
      }

      ArrayList var2 = new ArrayList();
      this.Field974.Method2530(var2);
      return new Class124(var2);
   }

   public void Method401() {
   }

   public void Method645(int a) {
   }

   public void Method646(Class148 a) {
      if (this.Field974 != null) {
         for(int var2 = 0; var2 < this.Field974.Method1799(); var2 += 2) {
            String var3 = (String)this.Field974.get(var2);
            Object var4 = this.Field974.get(var2 + 1);
            Method647(a, var3, var4);
         }
      }

      a.Method401();
   }

   static void Method647(Class148 a, String a, Object a) {
      int var3 = Class15.Method3445();
      if (a instanceof String[]) {
         String[] var4 = (String[])((String[])a);
         a.Method398(a, var4[0], var4[1]);
      }

      if (a instanceof Class124) {
         Class124 var7 = (Class124)a;
         var7.Method646(a.Method399(a, var7.Field973));
      }

      if (a instanceof List) {
         Class148 var8 = a.Method400(a);
         List var5 = (List)a;
         int var6 = 0;
         if (var6 < var5.Method1799()) {
            Method647(var8, (String)null, var5.get(var6));
            ++var6;
         }

         var8.Method401();
      }

      a.Method397(a, a);
   }

   private static IllegalStateException Method648(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
