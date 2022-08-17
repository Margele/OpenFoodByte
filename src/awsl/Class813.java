package awsl;

import java.util.List;
import obfuscate.b;

public class Class813 extends Class811 {
   private final b Field3638;
   private final b Field3639;
   private final List Field3640;
   private final boolean Field3641;
   private ClassLoader Field3642;

   public Class813() {
      this((b)null, (b)null, false);
   }

   public Class813(b a, b a, boolean a) {
      this(a, a, (List)null, a);
   }

   public Class813(b a, b a, List a, boolean a) {
      this(327680, a, a, a, a);
   }

   protected Class813(int a, b a, b a, List a, boolean a) {
      super(a);
      this.Field3642 = this.getClass().getClassLoader();
      this.Field3638 = a;
      this.Field3639 = a;
      this.Field3640 = a;
      this.Field3641 = a;
   }

   public void Method3672(ClassLoader a) {
      this.Field3642 = a;
   }

   public Class782 Method3360(b a) {
      int[] var2 = Class786.Method917();
      return Class782.Field3513;
   }

   protected boolean Method3660(Class782 a) {
      b var2 = a.Method861();
      return "Lnull;".equals(var2.Method3225()) || var2.Method3217() == 9;
   }

   protected Class782 Method3661(Class782 a) throws Class731 {
      b var2 = a.Method861();
      if (var2.Method3217() == 9) {
         return this.Method3360(b.Method3204(var2.Method3225().substring(1)));
      } else if ("Lnull;".equals(var2.Method3225())) {
         return a;
      } else {
         throw new Error("Internal error");
      }
   }

   protected boolean Method3662(Class782 a, Class782 a) {
      b var3 = a.Method861();
      b var4 = a.Method861();
      switch (var3.Method3217()) {
         case 5:
         case 6:
         case 7:
         case 8:
            return var4.Method3235(var3);
         case 9:
         case 10:
            if ("Lnull;".equals(var4.Method3225())) {
               return true;
            } else {
               if (var4.Method3217() != 10 && var4.Method3217() != 9) {
                  return false;
               }

               return this.Method3674(var3, var4);
            }
         default:
            throw new Error("Internal error");
      }
   }

   public Class782 Method3368(Class782 a, Class782 a) {
      if (a.Method863(a)) {
         return a;
      } else {
         b var3 = a.Method861();
         b var4 = a.Method861();
         if ((var3.Method3217() == 10 || var3.Method3217() == 9) && (var4.Method3217() == 10 || var4.Method3217() == 9)) {
            if ("Lnull;".equals(var3.Method3225())) {
               return a;
            } else if ("Lnull;".equals(var4.Method3225())) {
               return a;
            } else if (this.Method3674(var3, var4)) {
               return a;
            } else if (this.Method3674(var4, var3)) {
               return a;
            } else {
               while(!this.Method3673(var3)) {
                  var3 = this.Method1906(var3);
                  if (this.Method3674(var3, var4)) {
                     return this.Method3360(var3);
                  }
               }

               return Class782.Field3518;
            }
         } else {
            return Class782.Field3513;
         }
      }
   }

   protected boolean Method3673(b a) {
      return this.Field3638 != null && a.Method3235(this.Field3638) ? this.Field3641 : this.Method3675(a).isInterface();
   }

   protected b Method1906(b a) {
      if (this.Field3638 != null && a.Method3235(this.Field3638)) {
         return this.Field3639;
      } else {
         Class var2 = this.Method3675(a).getSuperclass();
         return null;
      }
   }

   protected boolean Method3674(b a, b a) {
      int[] var3 = Class786.Method917();
      if (a.Method3235(a)) {
         return true;
      } else if (this.Field3638 != null && a.Method3235(this.Field3638)) {
         if (this.Method1906(a) == null) {
            return false;
         } else if (!this.Field3641) {
            return this.Method3674(a, this.Method1906(a));
         } else {
            return a.Method3217() == 10 || a.Method3217() == 9;
         }
      } else if (this.Field3638 != null && a.Method3235(this.Field3638)) {
         if (this.Method3674(a, this.Field3639)) {
            return true;
         } else {
            if (this.Field3640 != null) {
               int var6 = 0;
               if (var6 < this.Field3640.Method1799()) {
                  b var5 = (b)this.Field3640.get(var6);
                  if (this.Method3674(a, var5)) {
                     return true;
                  }

                  ++var6;
               }
            }

            return false;
         }
      } else {
         Class var4 = this.Method3675(a);
         if (var4.isInterface()) {
            var4 = Object.class;
         }

         return var4.isAssignableFrom(this.Method3675(a));
      }
   }

   protected Class Method3675(b a) {
      try {
         return a.Method3217() == 9 ? Class.forName(a.Method3225().replace('/', '.'), false, this.Field3642) : Class.forName(a.Method3220(), false, this.Field3642);
      } catch (ClassNotFoundException var3) {
         throw new RuntimeException(var3.toString());
      }
   }

   public Class797 Method915(Class797 class7971, Class797 class7972) {
      return this.Method3368((Class782)class7971, (Class782)class7972);
   }

   public Class797 Method907(b class46) {
      return this.Method3360(class46);
   }

   private static Exception Method1642(Exception exception) {
      return exception;
   }
}
