package awsl;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import obfuscate.a;

final class Class788 implements ListIterator {
   a Field3545;
   a Field3546;
   a Field3547;
   final Class116 Field3548;

   Class788(Class116 class116, int a) {
      Class15.Method1984();
      this.Field3548 = class116;
      super();
      if (a == class116.Method183()) {
         this.Field3545 = null;
         this.Field3546 = class116.Method185();
      }

      this.Field3545 = class116.Method186(a);
      this.Field3546 = this.Field3545.Field799;
   }

   public boolean Method932() {
      return this.Field3545 != null;
   }

   public Object Method933() {
      if (this.Field3545 == null) {
         throw new NoSuchElementException();
      } else {
         a var1 = this.Field3545;
         this.Field3546 = var1;
         this.Field3545 = var1.Field800;
         this.Field3547 = var1;
         return var1;
      }
   }

   public void Method934() {
      int var1 = Class15.Method3445();
      if (this.Field3547 != null) {
         if (this.Field3547 == this.Field3545) {
            this.Field3545 = this.Field3545.Field800;
         }

         this.Field3546 = this.Field3546.Field799;
         this.Field3548.Method202(this.Field3547);
         this.Field3547 = null;
      }

      throw new IllegalStateException();
   }

   public boolean Method935() {
      return this.Field3546 != null;
   }

   public Object Method936() {
      a var1 = this.Field3546;
      this.Field3545 = var1;
      this.Field3546 = var1.Field799;
      this.Field3547 = var1;
      return var1;
   }

   public int Method937() {
      if (this.Field3545 == null) {
         return this.Field3548.Method183();
      } else {
         if (this.Field3548.Field915 == null) {
            this.Field3548.Field915 = this.Field3548.Method192();
         }

         return this.Field3545.Field801;
      }
   }

   public int Method938() {
      if (this.Field3546 == null) {
         return -1;
      } else {
         if (this.Field3548.Field915 == null) {
            this.Field3548.Field915 = this.Field3548.Method192();
         }

         return this.Field3546.Field801;
      }
   }

   public void Method939(Object a) {
      this.Field3548.Method200(this.Field3545, (a)a);
      this.Field3546 = (a)a;
      this.Field3547 = null;
   }

   public void Method940(Object a) {
      this.Field3548.Method193(this.Field3545.Field799, (a)a);
      this.Field3546 = (a)a;
   }

   private static NoSuchElementException Method941(NoSuchElementException noSuchElementException) {
      return noSuchElementException;
   }
}
