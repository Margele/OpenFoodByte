package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class15 extends Class267 {
   public int Field194;
   public String Field195;
   public String Field196;
   public String Field197;
   public List Field198;
   public List Field199;
   public List Field200;
   public List Field201;
   public List Field202;
   public List Field203;
   public List Field204;
   public Object Field205;
   public List[] Field206;
   public List[] Field207;
   public Class116 Field208;
   public List Field209;
   public int Field210;
   public int Field211;
   public List Field212;
   public List Field213;
   public List Field214;
   private boolean Field215;
   private static int Field216;

   public Class15() {
      this(327680);
      if (this.getClass() != Class15.class) {
         throw new IllegalStateException();
      }
   }

   public Class15(int a) {
      super(a);
      this.Field208 = new Class116();
   }

   public Class15(int a, String a, String a, String a, String[] a) {
      this(327680, a, a, a, a, a);
      if (this.getClass() != Class15.class) {
         throw new IllegalStateException();
      }
   }

   public Class15(int a, int a, String a, String a, String a, String[] a) {
      super(a);
      this.Field194 = a;
      this.Field195 = a;
      this.Field196 = a;
      this.Field197 = a;
      this.Field198 = new ArrayList(0);
      boolean a = (a & 1024) != 0;
      this.Field212 = new ArrayList(5);
      this.Field209 = new ArrayList();
      this.Field198.addAll(Arrays.asList(a));
      this.Field208 = new Class116();
   }

   public void Method1979(String a, int a) {
      if (this.Field199 == null) {
         this.Field199 = new ArrayList(5);
      }

      this.Field199.Method2530(new Class792(a, a));
   }

   public Class148 Method1968() {
      return new Class124(new Class688(this, 0));
   }

   public Class148 Method1969(String a, boolean a1) {
      Class124 a = new Class124(a);
      if (this.Field200 == null) {
         this.Field200 = new ArrayList(1);
      }

      this.Field200.Method2530(a);
      return a;
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a3) {
      Class126 a = new Class126(a, a, a);
      if (this.Field202 == null) {
         this.Field202 = new ArrayList(1);
      }

      this.Field202.Method2530(a);
      return a;
   }

   public Class148 Method1971(int a, String a, boolean a2) {
      Class124 a = new Class124(a);
      if (this.Field206 == null) {
         int a = b.Method3211(this.Field196).length;
         this.Field206 = (List[])(new List[a]);
      }

      if (this.Field206[a] == null) {
         this.Field206[a] = new ArrayList(1);
      }

      this.Field206[a].Method2530(a);
      return a;
   }

   public void Method1980(Class136 a) {
      if (this.Field204 == null) {
         this.Field204 = new ArrayList(1);
      }

      this.Field204.Method2530(a);
   }

   public void Method1652() {
   }

   public void Method1845(int a, int a, Object[] a2, int a, Object[] a4) {
      this.Field208.Method194(new Class95(a, a, (Object[])null, a, (Object[])null));
   }

   public void Method1948(int a) {
      this.Field208.Method194(new Class83(a));
   }

   public void Method854(int a, int a) {
      this.Field208.Method194(new Class86(a, a));
   }

   public void Method1840(int a, int a) {
      this.Field208.Method194(new Class112(a, a));
   }

   public void Method1952(int a, String a) {
      this.Field208.Method194(new Class110(a, a));
   }

   public void Method1949(int a, String a, String a, String a) {
      this.Field208.Method194(new Class93(a, a, a, a));
   }

   /** @deprecated */
   @Deprecated
   public void Method1953(int a, String a, String a, String a) {
      if (this.Field1459 >= 327680) {
         super.Method1953(a, a, a, a);
      } else {
         this.Field208.Method194(new Class98(a, a, a, a));
      }
   }

   public void Method1954(int a, String a, String a, String a, boolean a) {
      if (this.Field1459 < 327680) {
         super.Method1954(a, a, a, a, a);
      } else {
         this.Field208.Method194(new Class98(a, a, a, a, a));
      }
   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      this.Field208.Method194(new Class88(a, a, a, a));
   }

   public void Method1957(int a, Class264 a) {
      this.Field208.Method194(new Class102(a, this.Method3440(a)));
   }

   public void Method1947(Class264 a) {
      this.Field208.Method194(this.Method3440(a));
   }

   public void Method1950(Object a) {
      this.Field208.Method194(new Class106(a));
   }

   public void Method1841(int a, int a) {
      this.Field208.Method194(new Class82(a, a));
   }

   public void Method1959(int a, int a, Class264 a, Class264[] a) {
      this.Field208.Method194(new Class122(a, a, this.Method3440(a), this.Method3441(a)));
   }

   public void Method1958(Class264 a, int[] a, Class264[] a) {
      this.Field208.Method194(new Class96(this.Method3440(a), a, this.Method3441(a)));
   }

   public void Method1951(String a, int a) {
      this.Field208.Method194(new Class120(a, a));
   }

   public Class148 Method1973(int a, Class31 a, String a, boolean a3) {
      a a;
      for(a = this.Field208.Method185(); a.Method3640() == -1; a = a.Method3641()) {
      }

      Class126 a = new Class126(a, a, a);
      if (a.Field797 == null) {
         a.Field797 = new ArrayList(1);
      }

      a.Field797.Method2530(a);
      return a;
   }

   public void Method1960(Class264 a, Class264 a, Class264 a, String a) {
      this.Field209.Method2530(new Class794(this.Method3440(a), this.Method3440(a), this.Method3440(a), a));
   }

   public Class148 Method1974(int a, Class31 a, String a, boolean a3) {
      Class794 a = (Class794)this.Field209.get((a & 16776960) >> 8);
      Class126 a = new Class126(a, a, a);
      if (a.Field3563 == null) {
         a.Field3563 = new ArrayList(1);
      }

      a.Field3563.Method2530(a);
      return a;
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      this.Field212.Method2530(new Class790(a, a, a, this.Method3440(a), this.Method3440(a), a));
   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a6) {
      Class128 a = new Class128(a, a, this.Method3441(a), this.Method3441(a), a, a);
      if (this.Field213 == null) {
         this.Field213 = new ArrayList(1);
      }

      this.Field213.Method2530(a);
      return a;
   }

   public void Method1981(int a, Class264 a) {
      this.Field208.Method194(new Class108(a, this.Method3440(a)));
   }

   public void Method1842(int a, int a) {
      this.Field210 = a;
      this.Field211 = a;
   }

   public void Method1653() {
   }

   protected Class104 Method3440(Class264 a) {
      if (!(a.Field1447 instanceof Class104)) {
         a.Field1447 = new Class104();
      }

      return (Class104)a.Field1447;
   }

   private Class104[] Method3441(Class264[] a) {
      Class104[] a = new Class104[a.length];

      for(int a = 0; a < a.length; ++a) {
         a[a] = this.Method3440(a[a]);
      }

      return a;
   }

   private Object[] Method3442(Object[] a) {
      Object[] a = new Object[a.length];

      for(int a = 0; a < a.length; ++a) {
         Object a = a[a];
         if (a instanceof Class264) {
            a = this.Method3440((Class264)a);
         }

         a[a] = a;
      }

      return a;
   }

   public void Method1869(int a) {
      if (a == 262144) {
         if (this.Field202 != null && this.Field202.Method1799() > 0) {
            throw new RuntimeException();
         }

         if (this.Field203 != null && this.Field203.Method1799() > 0) {
            throw new RuntimeException();
         }

         int a = this.Field209 == null ? 0 : this.Field209.Method1799();

         int a;
         for(a = 0; a < a; ++a) {
            Class794 a = (Class794)this.Field209.get(a);
            if (a.Field3563 != null && a.Field3563.Method1799() > 0) {
               throw new RuntimeException();
            }

            if (a.Field3564 != null && a.Field3564.Method1799() > 0) {
               throw new RuntimeException();
            }
         }

         for(a = 0; a < this.Field208.Method183(); ++a) {
            a a = this.Field208.Method186(a);
            if (a.Field797 != null && a.Field797.Method1799() > 0) {
               throw new RuntimeException();
            }

            if (a.Field798 != null && a.Field798.Method1799() > 0) {
               throw new RuntimeException();
            }

            if (a instanceof Class98) {
               boolean a = ((Class98)a).Field827;
               if (a != (a.Field796 == 185)) {
                  throw new RuntimeException();
               }
            }
         }

         if (this.Field213 != null && this.Field213.Method1799() > 0) {
            throw new RuntimeException();
         }

         if (this.Field214 != null && this.Field214.Method1799() > 0) {
            throw new RuntimeException();
         }
      }

   }

   public void Method3443(Class167 a) {
      String[] a = new String[this.Field198.Method1799()];
      this.Field198.toArray(a);
      Class267 a = a.Method1451(this.Field194, this.Field195, this.Field196, this.Field197, a);
      this.Method3444(a);
   }

   public void Method3444(Class267 a) {
      int a = Method1984();
      int a = this.Field199 == null ? 0 : this.Field199.Method1799();
      int a = 0;
      if (a < a) {
         Class792 a = (Class792)this.Field199.get(a);
         a.Method1979(a.Field3556, a.Field3557);
         ++a;
      }

      if (this.Field205 != null) {
         Class148 a = a.Method1968();
         Class124.Method647(a, (String)null, this.Field205);
         a.Method401();
      }

      a = this.Field200 == null ? 0 : this.Field200.Method1799();
      int a = 0;
      Class124 a;
      if (a < a) {
         a = (Class124)this.Field200.get(a);
         a.Method646(a.Method1969(a.Field973, true));
         a = a + 1;
      }

      a = this.Field201 == null ? 0 : this.Field201.Method1799();
      a = 0;
      if (a < a) {
         a = (Class124)this.Field201.get(a);
         a.Method646(a.Method1969(a.Field973, false));
         a = a + 1;
      }

      a = this.Field202 == null ? 0 : this.Field202.Method1799();
      a = 0;
      Class126 a;
      if (a < a) {
         a = (Class126)this.Field202.get(a);
         a.Method646(a.Method1970(a.Field975, a.Field976, a.Field973, true));
         a = a + 1;
      }

      a = this.Field203 == null ? 0 : this.Field203.Method1799();
      a = 0;
      if (a < a) {
         a = (Class126)this.Field203.get(a);
         a.Method646(a.Method1970(a.Field975, a.Field976, a.Field973, false));
         a = a + 1;
      }

      a = this.Field206 == null ? 0 : this.Field206.length;
      a = 0;
      int a;
      Class124 a;
      List a;
      if (a < a) {
         a = this.Field206[a];
         a = 0;
         if (a < a.Method1799()) {
            a = (Class124)a.get(a);
            a.Method646(a.Method1971(a, a.Field973, true));
            ++a;
         }

         a = a + 1;
      }

      a = this.Field207 == null ? 0 : this.Field207.length;
      a = 0;
      if (a < a) {
         a = this.Field207[a];
         byte a = 0;
         if (a < a.Method1799()) {
            a = (Class124)a.get(a);
            a.Method646(a.Method1971(a, a.Field973, false));
            a = a + 1;
         }

         a = a + 1;
      }

      if (this.Field215) {
         this.Field208.Method205();
      }

      a = this.Field204 == null ? 0 : this.Field204.Method1799();
      a = 0;
      if (a < a) {
         a.Method1980((Class136)this.Field204.get(a));
         a = a + 1;
      }

      if (this.Field208.Method183() > 0) {
         a.Method1652();
         a = this.Field209 == null ? 0 : this.Field209.Method1799();
         a = 0;
         if (a < a) {
            ((Class794)this.Field209.get(a)).Method795(a);
            ((Class794)this.Field209.get(a)).Method796(a);
            a = a + 1;
         }

         this.Field208.Method189(a);
         a = this.Field212 == null ? 0 : this.Field212.Method1799();
         a = 0;
         if (a < a) {
            ((Class790)this.Field212.get(a)).Method751(a);
            a = a + 1;
         }

         a = this.Field213 == null ? 0 : this.Field213.Method1799();
         a = 0;
         if (a < a) {
            ((Class128)this.Field213.get(a)).Method679(a, true);
            a = a + 1;
         }

         a = this.Field214 == null ? 0 : this.Field214.Method1799();
         a = 0;
         if (a < a) {
            ((Class128)this.Field214.get(a)).Method679(a, false);
            a = a + 1;
         }

         a.Method1842(this.Field210, this.Field211);
         this.Field215 = true;
      }

      a.Method1653();
      if (a.trash() == null) {
         ++a;
         Method1880(a);
      }

   }

   public static void Method1880(int integer) {
      Field216 = integer;
   }

   public static int Method1984() {
      return Field216;
   }

   public static int Method3445() {
      int var0 = Method1984();
      return 72;
   }

   private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
      return illegalStateException;
   }

   static {
      if (Method3445() == 0) {
         Method1880(25);
      }

   }
}
