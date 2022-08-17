package awsl;

import obfuscate.b;

public class Class782 implements Class797 {
   public static final Class782 Field3513 = new Class782((b)null);
   public static final Class782 Field3514;
   public static final Class782 Field3515;
   public static final Class782 Field3516;
   public static final Class782 Field3517;
   public static final Class782 Field3518;
   public static final Class782 Field3519;
   private final b Field3520;

   public Class782(b a) {
      this.Field3520 = a;
   }

   public b Method861() {
      return this.Field3520;
   }

   public int Method806() {
      return this.Field3520 != b.Field579 && this.Field3520 != b.Field580 ? 1 : 2;
   }

   public boolean Method862() {
      return this.Field3520 != null && (this.Field3520.Method3217() == 10 || this.Field3520.Method3217() == 9);
   }

   public boolean Method863(Object a) {
      if (a == this) {
         return true;
      } else if (a instanceof Class782) {
         if (this.Field3520 == null) {
            return ((Class782)a).Field3520 == null;
         } else {
            return this.Field3520.Method3235(((Class782)a).Field3520);
         }
      } else {
         return false;
      }
   }

   public int Method864() {
      return this.Field3520 == null ? 0 : this.Field3520.Method3236();
   }

   public String Method865() {
      if (this == Field3513) {
         return ".";
      } else if (this == Field3519) {
         return "A";
      } else {
         return this == Field3518 ? "R" : this.Field3520.Method3225();
      }
   }

   static {
      Field3514 = new Class782(b.Field577);
      Field3515 = new Class782(b.Field578);
      Field3516 = new Class782(b.Field579);
      Field3517 = new Class782(b.Field580);
      Field3518 = new Class782(b.Method3205("java/lang/Object"));
      Field3519 = new Class782(b.Field572);
   }
}
