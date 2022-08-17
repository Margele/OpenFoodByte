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
      b[] var5 = b.Method3211(a);
      this.Field4 = (8 & a) == 0 ? 1 : 0;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         this.Field4 += var5[var6].Method3233();
      }

      this.Field3 = this.Field4;
   }

   public void Method1840(int a, int a) {
      b var3;
      switch (a) {
         case 21:
         case 54:
            var3 = b.Field577;
            break;
         case 22:
         case 55:
            var3 = b.Field579;
            break;
         case 23:
         case 56:
            var3 = b.Field578;
            break;
         case 24:
         case 57:
            var3 = b.Field580;
            break;
         default:
            var3 = Field0;
      }

      this.Field1460.Method1840(a, this.Method1850(a, var3));
   }

   public void Method1841(int a, int a) {
      this.Field1460.Method1841(this.Method1850(a, b.Field577), a);
   }

   public void Method1842(int a, int a) {
      this.Field1460.Method1842(a, this.Field4);
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      int var7 = this.Method1850(a, b.Method3204(a));
      this.Field1460.Method1843(a, a, a, a, a, var7);
   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a) {
      b var8 = b.Method3204(a);
      int[] var9 = new int[a.length];

      for(int var10 = 0; var10 < var9.length; ++var10) {
         var9[var10] = this.Method1850(a[var10], var8);
      }

      return this.Field1460.Method1844(a, a, a, a, var9, a, a);
   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      boolean var6 = Class37.Method3383();
      if (a != -1) {
         throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
      } else if (!this.Field5) {
         this.Field1460.Method1845(a, a, a, a, a);
      } else {
         Object[] var7 = new Object[this.Field2.length];
         System.arraycopy(this.Field2, 0, var7, 0, var7.length);
         this.Method1847(this.Field2);
         int var8 = 0;
         int var9 = 0;
         if (var9 < a) {
            Object var10 = a[var9];
            int var11 = var10 != Class45.Field400 && var10 != Class45.Field399 ? 1 : 2;
            if (var10 != Class45.Field396) {
               b var12 = Field0;
               if (var10 == Class45.Field397) {
                  var12 = b.Field577;
               }

               if (var10 == Class45.Field398) {
                  var12 = b.Field578;
               }

               if (var10 == Class45.Field400) {
                  var12 = b.Field579;
               }

               if (var10 == Class45.Field399) {
                  var12 = b.Field580;
               }

               if (var10 instanceof String) {
                  var12 = b.Method3205((String)var10);
               }

               this.Method1849(this.Method1850(var8, var12), var10);
            }

            int var10000 = var8 + var11;
            ++var9;
         }

         var8 = 0;
         var9 = 0;
         int var13 = 0;
         if (var8 < this.Field2.length) {
            label71: {
               Object var14 = this.Field2[var8++];
               if (var14 != Class45.Field396) {
                  this.Field2[var13] = var14;
                  var9 = var13 + 1;
                  if (var14 != Class45.Field400 && var14 != Class45.Field399) {
                     break label71;
                  }

                  ++var8;
               }

               this.Field2[var13] = Class45.Field396;
            }

            ++var13;
         }

         this.Field1460.Method1845(a, var9, this.Field2, a, a);
         this.Field2 = var7;
      }
   }

   public int Method1846(b a) {
      Object var2;
      switch (a.Method3217()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            var2 = Class45.Field397;
            break;
         case 6:
            var2 = Class45.Field398;
            break;
         case 7:
            var2 = Class45.Field400;
            break;
         case 8:
            var2 = Class45.Field399;
            break;
         case 9:
            var2 = a.Method3225();
            break;
         default:
            var2 = a.Method3221();
      }

      int var3 = this.Method1851(a);
      this.Method1848(var3, a);
      this.Method1849(var3, var2);
      this.Field5 = true;
      return var3;
   }

   protected void Method1847(Object[] a) {
   }

   protected void Method1848(int a, b a) {
   }

   private void Method1849(int a, Object a) {
      int var3 = this.Field2.length;
      if (a >= var3) {
         Object[] var4 = new Object[Math.max(2 * var3, a + 1)];
         System.arraycopy(this.Field2, 0, var4, 0, var3);
         this.Field2 = var4;
      }

      this.Field2[a] = a;
   }

   private int Method1850(int a, b a) {
      if (a + a.Method3233() <= this.Field3) {
         return a;
      } else {
         int var3 = 2 * a + a.Method3233() - 1;
         int var4 = this.Field1.length;
         if (var3 >= var4) {
            int[] var5 = new int[Math.max(2 * var4, var3 + 1)];
            System.arraycopy(this.Field1, 0, var5, 0, var4);
            this.Field1 = var5;
         }

         int var6 = this.Field1[var3];
         var6 = this.Method1851(a);
         this.Method1848(var6, a);
         this.Field1[var3] = var6 + 1;
         if (var6 != a) {
            this.Field5 = true;
         }

         return var6;
      }
   }

   protected int Method1851(b a) {
      int var2 = this.Field4;
      this.Field4 += a.Method3233();
      return var2;
   }

   private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
