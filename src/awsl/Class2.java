package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import obfuscate.b;

public class Class2 extends Class0 {
   private static final String Field18 = "Ljava/lang/Class;";
   private static final b Field19 = b.Method3205("java/lang/Byte");
   private static final b Field20 = b.Method3205("java/lang/Boolean");
   private static final b Field21 = b.Method3205("java/lang/Short");
   private static final b Field22 = b.Method3205("java/lang/Character");
   private static final b Field23 = b.Method3205("java/lang/Integer");
   private static final b Field24 = b.Method3205("java/lang/Float");
   private static final b Field25 = b.Method3205("java/lang/Long");
   private static final b Field26 = b.Method3205("java/lang/Double");
   private static final b Field27 = b.Method3205("java/lang/Number");
   private static final b Field28 = b.Method3205("java/lang/Object");
   private static final Class36 Field29 = Class36.Method3421("boolean booleanValue()");
   private static final Class36 Field30 = Class36.Method3421("char charValue()");
   private static final Class36 Field31 = Class36.Method3421("int intValue()");
   private static final Class36 Field32 = Class36.Method3421("float floatValue()");
   private static final Class36 Field33 = Class36.Method3421("long longValue()");
   private static final Class36 Field34 = Class36.Method3421("double doubleValue()");
   public static final int Field35 = 96;
   public static final int Field36 = 100;
   public static final int Field37 = 104;
   public static final int Field38 = 108;
   public static final int Field39 = 112;
   public static final int Field40 = 116;
   public static final int Field41 = 120;
   public static final int Field42 = 122;
   public static final int Field43 = 124;
   public static final int Field44 = 126;
   public static final int Field45 = 128;
   public static final int Field46 = 130;
   public static final int Field47 = 153;
   public static final int Field48 = 154;
   public static final int Field49 = 155;
   public static final int Field50 = 156;
   public static final int Field51 = 157;
   public static final int Field52 = 158;
   private final int Field53;
   private final b Field54;
   private final b[] Field55;
   private final List Field56;

   public Class2(Class267 a, int a, String a, String a) {
      this(327680, a, a, a, a);
      if (this.getClass() != Class2.class) {
         throw new IllegalStateException();
      }
   }

   protected Class2(int a, Class267 a, int a, String a3, String a) {
      super(a, a, a, a);
      this.Field56 = new ArrayList();
      this.Field53 = a;
      this.Field54 = b.Method3213(a);
      this.Field55 = b.Method3211(a);
   }

   public Class2(int a, Class36 a, Class267 a) {
      this(a, a, (String)null, a.Method3425());
   }

   public Class2(int a, Class36 a, String a, b[] a, Class167 a) {
      this(a, a, a.Method1451(a, a.Method3424(), a.Method3425(), a, Method1867(a)));
   }

   private static String[] Method1867(b[] a) {
      return null;
   }

   public void Method1868(boolean a) {
      this.Method1869(1);
   }

   public void Method1869(int a) {
      if (a >= -1 && a <= 5) {
         this.Field1460.Method1948(3 + a);
      } else if (a >= -128 && a <= 127) {
         this.Field1460.Method854(16, a);
      } else if (a >= -32768 && a <= 32767) {
         this.Field1460.Method854(17, a);
      } else {
         this.Field1460.Method1950(new Integer(a));
      }

   }

   public void Method1870(long a) {
      if (a != 0L && a != 1L) {
         this.Field1460.Method1950(new Long(a));
      } else {
         this.Field1460.Method1948(9 + (int)a);
      }

   }

   public void Method1871(float a) {
      int a = Float.floatToIntBits(a);
      if ((long)a != 0L && a != 1065353216 && a != 1073741824) {
         this.Field1460.Method1950(new Float(a));
      } else {
         this.Field1460.Method1948(11 + (int)a);
      }

   }

   public void Method1872(double a) {
      long a = Double.doubleToLongBits(a);
      if (a != 0L && a != 4607182418800017408L) {
         this.Field1460.Method1950(new Double(a));
      } else {
         this.Field1460.Method1948(14 + (int)a);
      }

   }

   public void Method1873(String a) {
      this.Field1460.Method1948(1);
   }

   public void Method1874(b a) {
      this.Field1460.Method1948(1);
   }

   public void Method1875(Class279 a) {
      this.Field1460.Method1950(a);
   }

   private int Method1876(int a) {
      int a = (this.Field53 & 8) == 0 ? 1 : 0;

      for(int a = 0; a < a; ++a) {
         a += this.Field55[a].Method3233();
      }

      return a;
   }

   private void Method1877(b a, int a) {
      this.Field1460.Method1840(a.Method3234(21), a);
   }

   private void Method1878(b a, int a) {
      this.Field1460.Method1840(a.Method3234(54), a);
   }

   public void Method1879() {
      if ((this.Field53 & 8) != 0) {
         throw new IllegalStateException("no 'this' pointer within static method");
      } else {
         this.Field1460.Method1840(25, 0);
      }
   }

   public void Method1880(int a) {
      this.Method1877(this.Field55[a], this.Method1876(a));
   }

   public void Method1881(int a, int a) {
      int a = this.Method1876(a);

      for(int a = 0; a < a; ++a) {
         b a = this.Field55[a + a];
         this.Method1877(a, a);
         a += a.Method3233();
      }

   }

   public void Method1882() {
      this.Method1881(0, this.Field55.length);
   }

   public void Method1883() {
      this.Method1869(this.Field55.length);
      this.Method1936(Field28);

      for(int a = 0; a < this.Field55.length; ++a) {
         this.Method1894();
         this.Method1869(a);
         this.Method1880(a);
         this.Method1907(this.Field55[a]);
         this.Method1891(Field28);
      }

   }

   public void Method1884(int a) {
      this.Method1878(this.Field55[a], this.Method1876(a));
   }

   public b Method1885(int a) {
      return (b)this.Field56.get(a - this.Field3);
   }

   protected void Method1848(int a, b a) {
      int a = a - this.Field3;

      while(this.Field56.Method1799() < a + 1) {
         this.Field56.Method2530((Object)null);
      }

      this.Field56.set(a, a);
   }

   public void Method1886(int a) {
      this.Method1877(this.Method1885(a), a);
   }

   public void Method1887(int a, b a) {
      this.Method1848(a, a);
      this.Method1877(a, a);
   }

   public void Method1888(int a) {
      this.Method1878(this.Method1885(a), a);
   }

   public void Method1889(int a, b a) {
      this.Method1848(a, a);
      this.Method1878(a, a);
   }

   public void Method1890(b a) {
      this.Field1460.Method1948(a.Method3234(46));
   }

   public void Method1891(b a) {
      this.Field1460.Method1948(a.Method3234(79));
   }

   public void Method1892() {
      this.Field1460.Method1948(87);
   }

   public void Method1893() {
      this.Field1460.Method1948(88);
   }

   public void Method1894() {
      this.Field1460.Method1948(89);
   }

   public void Method1895() {
      this.Field1460.Method1948(92);
   }

   public void Method1896() {
      this.Field1460.Method1948(90);
   }

   public void Method1897() {
      this.Field1460.Method1948(91);
   }

   public void Method1898() {
      this.Field1460.Method1948(93);
   }

   public void Method1899() {
      this.Field1460.Method1948(94);
   }

   public void Method1900() {
      this.Field1460.Method1948(95);
   }

   public void Method1901(b a, b a) {
      if (a.Method3233() == 1) {
         if (a.Method3233() == 1) {
            this.Method1900();
         } else {
            this.Method1897();
            this.Method1892();
         }
      } else if (a.Method3233() == 1) {
         this.Method1898();
         this.Method1893();
      } else {
         this.Method1899();
         this.Method1893();
      }

   }

   public void Method1902(int a, b a) {
      this.Field1460.Method1948(a.Method3234(a));
   }

   public void Method1903() {
      this.Field1460.Method1948(4);
      this.Field1460.Method1948(130);
   }

   public void Method1904(int a, int a) {
      this.Field1460.Method1841(a, a);
   }

   public void Method1905(b a, b a) {
      boolean var3 = Class37.Method3382();
      if (a != a) {
         if (a == b.Field580) {
            if (a == b.Field578) {
               this.Field1460.Method1948(144);
            }

            if (a == b.Field579) {
               this.Field1460.Method1948(143);
            }

            this.Field1460.Method1948(142);
            this.Method1905(b.Field577, a);
         }

         if (a == b.Field578) {
            if (a == b.Field580) {
               this.Field1460.Method1948(141);
            }

            if (a == b.Field579) {
               this.Field1460.Method1948(140);
            }

            this.Field1460.Method1948(139);
            this.Method1905(b.Field577, a);
         }

         if (a == b.Field579) {
            if (a == b.Field580) {
               this.Field1460.Method1948(138);
            }

            if (a == b.Field578) {
               this.Field1460.Method1948(137);
            }

            this.Field1460.Method1948(136);
            this.Method1905(b.Field577, a);
         }

         if (a == b.Field575) {
            this.Field1460.Method1948(145);
         }

         if (a == b.Field574) {
            this.Field1460.Method1948(146);
         }

         if (a == b.Field580) {
            this.Field1460.Method1948(135);
         }

         if (a == b.Field578) {
            this.Field1460.Method1948(134);
         }

         if (a == b.Field579) {
            this.Field1460.Method1948(133);
         }

         if (a == b.Field576) {
            this.Field1460.Method1948(147);
         }
      }

   }

   private static b Method1906(b a) {
      switch (a.Method3217()) {
         case 1:
            return Field20;
         case 2:
            return Field22;
         case 3:
            return Field19;
         case 4:
            return Field21;
         case 5:
            return Field23;
         case 6:
            return Field24;
         case 7:
            return Field25;
         case 8:
            return Field26;
         default:
            return a;
      }
   }

   public void Method1907(b a) {
      if (a.Method3217() != 10 && a.Method3217() != 9) {
         if (a == b.Field572) {
            this.Method1873((String)null);
         } else {
            b a = Method1906(a);
            this.Method1935(a);
            if (a.Method3233() == 2) {
               this.Method1897();
               this.Method1897();
               this.Method1892();
            } else {
               this.Method1896();
               this.Method1900();
            }

            this.Method1930(a, new Class36("<init>", b.Field572, new b[]{a}));
         }

      }
   }

   public void Method1908(b a) {
      if (a.Method3217() != 10 && a.Method3217() != 9) {
         if (a == b.Field572) {
            this.Method1873((String)null);
         } else {
            b a = Method1906(a);
            this.Method1931(a, new Class36("valueOf", a, new b[]{a}));
         }

      }
   }

   public void Method1909(b a) {
      b a = Field27;
      Class36 a = null;
      switch (a.Method3217()) {
         case 0:
            return;
         case 1:
            a = Field20;
            a = Field29;
            break;
         case 2:
            a = Field22;
            a = Field30;
            break;
         case 3:
         case 4:
         case 5:
            a = Field31;
            break;
         case 6:
            a = Field32;
            break;
         case 7:
            a = Field33;
            break;
         case 8:
            a = Field34;
      }

      this.Method1940(a);
   }

   public Class264 Method1910() {
      return new Class264();
   }

   public void Method1911(Class264 a) {
      this.Field1460.Method1947(a);
   }

   public Class264 Method1912() {
      Class264 a = new Class264();
      this.Field1460.Method1947(a);
      return a;
   }

   public void Method1913(b a, int a, Class264 a) {
      switch (a.Method3217()) {
         case 6:
            this.Field1460.Method1948(a != 156 && a != 157 ? 150 : 149);
            break;
         case 7:
            this.Field1460.Method1948(148);
            break;
         case 8:
            this.Field1460.Method1948(a != 156 && a != 157 ? 152 : 151);
            break;
         case 9:
         case 10:
            switch (a) {
               case 153:
                  this.Field1460.Method1957(165, a);
                  return;
               case 154:
                  this.Field1460.Method1957(166, a);
                  return;
               default:
                  throw new IllegalArgumentException("Bad comparison for type " + a);
            }
         default:
            int a = -1;
            switch (a) {
               case 153:
                  a = 159;
                  break;
               case 154:
                  a = 160;
                  break;
               case 155:
                  a = 161;
                  break;
               case 156:
                  a = 162;
                  break;
               case 157:
                  a = 163;
                  break;
               case 158:
                  a = 164;
            }

            this.Field1460.Method1957(a, a);
            return;
      }

      this.Field1460.Method1957(a, a);
   }

   public void Method1914(int a, Class264 a) {
      this.Method1913(b.Field577, a, a);
   }

   public void Method1915(int a, Class264 a) {
      this.Field1460.Method1957(a, a);
   }

   public void Method1916(Class264 a) {
      this.Field1460.Method1957(198, a);
   }

   public void Method1917(Class264 a) {
      this.Field1460.Method1957(199, a);
   }

   public void Method1918(Class264 a) {
      this.Field1460.Method1957(167, a);
   }

   public void Method1919(int a) {
      this.Field1460.Method1840(169, a);
   }

   public void Method1920(int[] a, Class48 a) {
      float a;
      if (a.length == 0) {
         a = 0.0F;
      } else {
         a = (float)a.length / (float)(a[a.length - 1] - a[0] + 1);
      }

      this.Method1921(a, a, a >= 0.5F);
   }

   public void Method1921(int[] a, Class48 a, boolean a2) {
      for(int a = 1; a < a.length; ++a) {
         if (a[a] < a[a - 1]) {
            throw new IllegalArgumentException("keys must be sorted ascending");
         }
      }

      Class264 a = this.Method1910();
      Class264 a = this.Method1910();
      if (a.length > 0) {
         int a = a.length;
         int a = a[0];
         int a = a[a - 1];
         int a = a - a + 1;
         Class264[] a = new Class264[a];
         Arrays.fill(a, a);

         int a;
         for(a = 0; a < a; ++a) {
            a[a[a] - a] = this.Method1910();
         }

         this.Field1460.Method1959(a, a, a, a);

         for(a = 0; a < a; ++a) {
            Class264 a = a[a];
            if (a != a) {
               this.Method1911(a);
               a.Method3199(a + a, a);
            }
         }
      }

      this.Method1911(a);
      a.Method3200();
      this.Method1911(a);
   }

   public void Method1922() {
      this.Field1460.Method1948(this.Field54.Method3234(172));
   }

   private void Method1923(int a, b a, String a, b a) {
      this.Field1460.Method1949(a, a.Method3221(), a, a.Method3225());
   }

   public void Method1924(b a, String a, b a) {
      this.Method1923(178, a, a, a);
   }

   public void Method1925(b a, String a, b a) {
      this.Method1923(179, a, a, a);
   }

   public void Method1926(b a, String a, b a) {
      this.Method1923(180, a, a, a);
   }

   public void Method1927(b a, String a, b a) {
      this.Method1923(181, a, a, a);
   }

   private void Method1928(int a, b a, Class36 a, boolean a) {
      String a = a.Method3217() == 9 ? a.Method3225() : a.Method3221();
      this.Field1460.Method1954(a, a, a.Method3424(), a.Method3425(), a);
   }

   public void Method1929(b a, Class36 a) {
      this.Method1928(182, a, a, false);
   }

   public void Method1930(b a, Class36 a) {
      this.Method1928(183, a, a, false);
   }

   public void Method1931(b a, Class36 a) {
      this.Method1928(184, a, a, false);
   }

   public void Method1932(b a, Class36 a) {
      this.Method1928(185, a, a, true);
   }

   public void Method1933(String a, String a, Class279 a, Object[] a) {
      this.Field1460.Method1956(a, a, a, a);
   }

   private void Method1934(int a, b a) {
      this.Field1460.Method1952(a, a.Method3221());
   }

   public void Method1935(b a) {
      this.Method1934(187, a);
   }

   public void Method1936(b a) {
      byte a;
      switch (a.Method3217()) {
         case 1:
            a = 4;
            break;
         case 2:
            a = 5;
            break;
         case 3:
            a = 8;
            break;
         case 4:
            a = 9;
            break;
         case 5:
            a = 10;
            break;
         case 6:
            a = 6;
            break;
         case 7:
            a = 11;
            break;
         case 8:
            a = 7;
            break;
         default:
            this.Method1934(189, a);
            return;
      }

      this.Field1460.Method854(188, a);
   }

   public void Method1937() {
      this.Field1460.Method1948(190);
   }

   public void Method1938() {
      this.Field1460.Method1948(191);
   }

   public void Method1939(b a, String a) {
      this.Method1935(a);
      this.Method1894();
      this.Method1873(a);
      this.Method1930(a, Class36.Method3421("void <init> (String)"));
      this.Method1938();
   }

   public void Method1940(b a) {
      if (!a.Method3235(Field28)) {
         this.Method1934(192, a);
      }

   }

   public void Method1941(b a) {
      this.Method1934(193, a);
   }

   public void Method1942() {
      this.Field1460.Method1948(194);
   }

   public void Method1943() {
      this.Field1460.Method1948(195);
   }

   public void Method1944() {
      if ((this.Field53 & 1024) == 0) {
         this.Field1460.Method1842(0, 0);
      }

      this.Field1460.Method1653();
   }

   public void Method1945(Class264 a, Class264 a, b a2) {
      this.Field1460.Method1960(a, a, this.Method1912(), (String)null);
   }

   private static IllegalStateException Method1946(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
