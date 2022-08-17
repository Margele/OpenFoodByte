package awsl;

import obfuscate.b;

public class Class0 extends Class267 {
   private static final b Field0 = b.Method3205("java/lang/Object");
   private int[] Field1;
   private Object[] Field2;
   protected final int Field3;
   protected int Field4;
   private boolean Field5;

   public Class0(int a, String a, Class267 a) {
      this(327680, a, a, a);
      if (this.getClass() != Class0.class) {
         throw new IllegalStateException();
      }
   }

   protected Class0(int a, int a, String a, Class267 a) {
      super(a, a);
      this.Field1 = new int[40];
      this.Field2 = new Object[20];
      b[] a = b.Method3211(a);
      this.Field4 = (8 & a) == 0 ? 1 : 0;

      for(int a = 0; a < a.length; ++a) {
         this.Field4 += a[a].Method3233();
      }

      this.Field3 = this.Field4;
   }

   public void Method1840(int a, int a) {
      b a;
      switch (a) {
         case 21:
         case 54:
            a = b.Field577;
            break;
         case 22:
         case 55:
            a = b.Field579;
            break;
         case 23:
         case 56:
            a = b.Field578;
            break;
         case 24:
         case 57:
            a = b.Field580;
            break;
         default:
            a = Field0;
      }

      this.Field1460.Method1840(a, this.Method1850(a, a));
   }

   public void Method1841(int a, int a) {
      this.Field1460.Method1841(this.Method1850(a, b.Field577), a);
   }

   public void Method1842(int a, int a1) {
      this.Field1460.Method1842(a, this.Field4);
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      int a = this.Method1850(a, b.Method3204(a));
      this.Field1460.Method1843(a, a, a, a, a, a);
   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a) {
      b a = b.Method3204(a);
      int[] a = new int[a.length];

      for(int a = 0; a < a.length; ++a) {
         a[a] = this.Method1850(a[a], a);
      }

      return this.Field1460.Method1844(a, a, a, a, a, a, a);
   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      int a = Class37.Method3383();
      if (a != -1) {
         throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
      } else if (!this.Field5) {
         this.Field1460.Method1845(a, a, a, a, a);
      } else {
         Object[] a = new Object[this.Field2.length];
         System.arraycopy(this.Field2, 0, a, 0, a.length);
         this.Method1847(this.Field2);
         int a = 0;
         int a = 0;
         if (a < a) {
            Object a = a[a];
            int a = a != Class45.Field400 && a != Class45.Field399 ? 1 : 2;
            if (a != Class45.Field396) {
               b a = Field0;
               if (a == Class45.Field397) {
                  a = b.Field577;
               }

               if (a == Class45.Field398) {
                  a = b.Field578;
               }

               if (a == Class45.Field400) {
                  a = b.Field579;
               }

               if (a == Class45.Field399) {
                  a = b.Field580;
               }

               if (a instanceof String) {
                  a = b.Method3205((String)a);
               }

               this.Method1849(this.Method1850(a, a), a);
            }

            int var10000 = a + a;
            ++a;
         }

         a = 0;
         a = 0;
         int a = 0;
         if (a < this.Field2.length) {
            label71: {
               Object a = this.Field2[a++];
               if (a != Class45.Field396) {
                  this.Field2[a] = a;
                  a = a + 1;
                  if (a != Class45.Field400 && a != Class45.Field399) {
                     break label71;
                  }

                  ++a;
               }

               this.Field2[a] = Class45.Field396;
            }

            ++a;
         }

         this.Field1460.Method1845(a, a, this.Field2, a, a);
         this.Field2 = a;
      }
   }

   public int Method1846(b a) {
      Object a;
      switch (a.Method3217()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            a = Class45.Field397;
            break;
         case 6:
            a = Class45.Field398;
            break;
         case 7:
            a = Class45.Field400;
            break;
         case 8:
            a = Class45.Field399;
            break;
         case 9:
            a = a.Method3225();
            break;
         default:
            a = a.Method3221();
      }

      int a = this.Method1851(a);
      this.Method1848(a, a);
      this.Method1849(a, a);
      this.Field5 = true;
      return a;
   }

   protected void Method1847(Object[] a) {
   }

   protected void Method1848(int a, b a1) {
   }

   private void Method1849(int a, Object a) {
      int a = this.Field2.length;
      if (a >= a) {
         Object[] a = new Object[Math.max(2 * a, a + 1)];
         System.arraycopy(this.Field2, 0, a, 0, a);
         this.Field2 = a;
      }

      this.Field2[a] = a;
   }

   private int Method1850(int a, b a) {
      if (a + a.Method3233() <= this.Field3) {
         return a;
      } else {
         int a = 2 * a + a.Method3233() - 1;
         int a = this.Field1.length;
         if (a >= a) {
            int[] a = new int[Math.max(2 * a, a + 1)];
            System.arraycopy(this.Field1, 0, a, 0, a);
            this.Field1 = a;
         }

         int a = this.Field1[a];
         a = this.Method1851(a);
         this.Method1848(a, a);
         this.Field1[a] = a + 1;
         if (a != a) {
            this.Field5 = true;
         }

         return a;
      }
   }

   protected int Method1851(b a) {
      int a = this.Field4;
      this.Field4 += a.Method3233();
      return a;
   }

   private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
