package awsl;

import obfuscate.a;

public class Class69 extends Class63 {
   public static final int Field664 = 0;
   public static final int Field665 = 1;
   public static final int Field666 = 2;
   private static final int Field667 = 1;
   private static final int Field668 = 2;
   private static final int Field669 = 4;
   private static final int Field670 = 8;
   private static final int Field671 = 16;
   private static final int Field672 = 32;
   private static final int Field673 = 64;
   private static final int Field674 = 128;
   private static final int Field675 = 256;
   private final int Field676;
   private int Field677;
   private boolean Field678;
   private final Class63 Field679;

   public Class69(int a, Class63 a) {
      this(327680, a, a);
   }

   protected Class69(int a, int a, Class63 a) {
      super(a);
      this.Field676 = a;
      this.Field677 = 1;
      this.Field679 = a;
   }

   public void Method3610(String a) {
      if (this.Field676 == 2 || this.Field677 != 1 && this.Field677 != 2 && this.Field677 != 4) {
         throw new IllegalStateException();
      } else {
         Class39.Method3390(a, "formal type parameter");
         this.Field677 = 2;
         if (this.Field679 != null) {
            this.Field679.Method3610(a);
         }

      }
   }

   public Class63 Method3611() {
      if (this.Field677 != 2) {
         throw new IllegalStateException();
      } else {
         this.Field677 = 4;
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3611();
         return new Class69(2, var1);
      }
   }

   public Class63 Method3612() {
      if (this.Field677 != 2 && this.Field677 != 4) {
         throw new IllegalArgumentException();
      } else {
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3612();
         return new Class69(2, var1);
      }
   }

   public Class63 Method3613() {
      if (this.Field676 == 0 && (this.Field677 & 7) != 0) {
         this.Field677 = 8;
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3613();
         return new Class69(2, var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Class63 Method3614() {
      if (this.Field677 != 8) {
         throw new IllegalStateException();
      } else {
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3614();
         return new Class69(2, var1);
      }
   }

   public Class63 Method3615() {
      if (this.Field676 == 1 && (this.Field677 & 23) != 0) {
         this.Field677 = 16;
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3615();
         return new Class69(2, var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Class63 Method3616() {
      a[] var1 = Class801.Method3300();
      if (this.Field676 == 1 && (this.Field677 & 23) != 0) {
         this.Field677 = 32;
         Class63 var2 = this.Field679 == null ? null : this.Field679.Method3616();
         Class69 var3 = new Class69(2, var2);
         var3.Field678 = true;
         if (a.trash() == null) {
            Class801.Method3299(new a[5]);
         }

         return var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Class63 Method3617() {
      if (this.Field677 != 32) {
         throw new IllegalStateException();
      } else {
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3617();
         return new Class69(2, var1);
      }
   }

   public void Method3618(char a) {
      if (this.Field676 == 2 && this.Field677 == 1) {
         if (a == 'V') {
            if (!this.Field678) {
               throw new IllegalArgumentException();
            }
         } else if ("ZCBSIFJD".indexOf(a) == -1) {
            throw new IllegalArgumentException();
         }

         this.Field677 = 64;
         if (this.Field679 != null) {
            this.Field679.Method3618(a);
         }

      } else {
         throw new IllegalStateException();
      }
   }

   public void Method3619(String a) {
      if (this.Field676 == 2 && this.Field677 == 1) {
         Class39.Method3390(a, "type variable");
         this.Field677 = 64;
         if (this.Field679 != null) {
            this.Field679.Method3619(a);
         }

      } else {
         throw new IllegalStateException();
      }
   }

   public Class63 Method3620() {
      if (this.Field676 == 2 && this.Field677 == 1) {
         this.Field677 = 64;
         Class63 var1 = this.Field679 == null ? null : this.Field679.Method3620();
         return new Class69(2, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   public void Method3621(String a) {
      if (this.Field676 == 2 && this.Field677 == 1) {
         Class39.Method3393(a, "class name");
         this.Field677 = 128;
         if (this.Field679 != null) {
            this.Field679.Method3621(a);
         }

      } else {
         throw new IllegalStateException();
      }
   }

   public void Method3622(String a) {
      if (this.Field677 != 128) {
         throw new IllegalStateException();
      } else {
         Class39.Method3390(a, "inner class name");
         if (this.Field679 != null) {
            this.Field679.Method3622(a);
         }

      }
   }

   public void Method3623() {
      if (this.Field677 != 128) {
         throw new IllegalStateException();
      } else {
         if (this.Field679 != null) {
            this.Field679.Method3623();
         }

      }
   }

   public Class63 Method3624(char a) {
      if (this.Field677 != 128) {
         throw new IllegalStateException();
      } else if ("+-=".indexOf(a) == -1) {
         throw new IllegalArgumentException();
      } else {
         Class63 var2 = this.Field679 == null ? null : this.Field679.Method3624(a);
         return new Class69(2, var2);
      }
   }

   public void Method3625() {
      if (this.Field677 != 128) {
         throw new IllegalStateException();
      } else {
         this.Field677 = 256;
         if (this.Field679 != null) {
            this.Field679.Method3625();
         }

      }
   }

   private static IllegalStateException Method3781(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
