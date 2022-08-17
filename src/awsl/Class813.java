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
      int[] a = Class786.Method917();
      return Class782.Field3513;
   }

   protected boolean Method3660(Class782 a) {
      b a = a.Method861();
      return "Lnull;".equals(a.Method3225()) || a.Method3217() == 9;
   }

   protected Class782 Method3661(Class782 a) throws Class731 {
      b a = a.Method861();
      if (a.Method3217() == 9) {
         return this.Method3360(b.Method3204(a.Method3225().substring(1)));
      } else if ("Lnull;".equals(a.Method3225())) {
         return a;
      } else {
         throw new Error("Internal error");
      }
   }

   protected boolean Method3662(Class782 a, Class782 a) {
      b a = a.Method861();
      b a = a.Method861();
      switch (a.Method3217()) {
         case 5:
         case 6:
         case 7:
         case 8:
            return a.Method3235(a);
         case 9:
         case 10:
            if ("Lnull;".equals(a.Method3225())) {
               return true;
            } else {
               if (a.Method3217() != 10 && a.Method3217() != 9) {
                  return false;
               }

               return this.Method3674(a, a);
            }
         default:
            throw new Error("Internal error");
      }
   }

   public Class782 Method3368(Class782 a, Class782 a) {
      if (a.Method863(a)) {
         return a;
      } else {
         b a = a.Method861();
         b a = a.Method861();
         if ((a.Method3217() == 10 || a.Method3217() == 9) && (a.Method3217() == 10 || a.Method3217() == 9)) {
            if ("Lnull;".equals(a.Method3225())) {
               return a;
            } else if ("Lnull;".equals(a.Method3225())) {
               return a;
            } else if (this.Method3674(a, a)) {
               return a;
            } else if (this.Method3674(a, a)) {
               return a;
            } else {
               while(!this.Method3673(a)) {
                  a = this.Method1906(a);
                  if (this.Method3674(a, a)) {
                     return this.Method3360(a);
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
         Class a = this.Method3675(a).getSuperclass();
         return null;
      }
   }

   protected boolean Method3674(b a, b a) {
      int[] a = Class786.Method917();
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
               int a = 0;
               if (a < this.Field3640.Method1799()) {
                  b a = (b)this.Field3640.get(a);
                  if (this.Method3674(a, a)) {
                     return true;
                  }

                  ++a;
               }
            }

            return false;
         }
      } else {
         Class a = this.Method3675(a);
         if (a.isInterface()) {
            a = Object.class;
         }

         return a.isAssignableFrom(this.Method3675(a));
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
