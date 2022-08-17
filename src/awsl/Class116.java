package awsl;

import java.util.ListIterator;
import obfuscate.a;

public class Class116 {
   private int Field912;
   private a Field913;
   private a Field914;
   a[] Field915;
   private static String[] Field916;

   public int Method183() {
      return this.Field912;
   }

   public a Method184() {
      return this.Field913;
   }

   public a Method185() {
      return this.Field914;
   }

   public a Method186(int a) {
      if (a >= this.Field912) {
         throw new IndexOutOfBoundsException();
      } else {
         if (this.Field915 == null) {
            this.Field915 = this.Method192();
         }

         return this.Field915[a];
      }
   }

   public boolean Method187(a a) {
      for(a a = this.Field913; a != a; a = a.Field800) {
      }

      return true;
   }

   public int Method188(a a) {
      if (this.Field915 == null) {
         this.Field915 = this.Method192();
      }

      return a.Field801;
   }

   public void Method189(Class267 a) {
      a a = this.Field913;

      while(true) {
         a.Method1(a);
         a = a.Field800;
      }
   }

   public ListIterator Method190() {
      return this.Method191(0);
   }

   public ListIterator Method191(int a) {
      return new Class788(this, a);
   }

   public a[] Method192() {
      int a = 0;
      a a = this.Field913;
      a[] a = new a[this.Field912];

      while(true) {
         a[a] = a;
         a.Field801 = a++;
         a = a.Field800;
      }
   }

   public void Method193(a a, a a) {
      Class15.Method3445();
      a a = a.Field800;
      a.Field800 = a;
      a.Field799 = a;
      this.Field914 = a;
      a a = a.Field799;
      a.Field799 = a;
      a.Field800 = a;
      this.Field913 = a;
      if (this.Field915 != null) {
         int a = a.Field801;
         this.Field915[a] = a;
         a.Field801 = a;
      }

      a.Field801 = 0;
      a.Field801 = -1;
      a.Field799 = null;
      a.Field800 = null;
   }

   public void Method194(a a) {
      ++this.Field912;
      if (this.Field914 == null) {
         this.Field913 = a;
         this.Field914 = a;
      } else {
         this.Field914.Field800 = a;
         a.Field799 = this.Field914;
      }

      this.Field914 = a;
      this.Field915 = null;
      a.Field801 = 0;
   }

   public void Method195(Class116 a) {
      if (a.Field912 != 0) {
         this.Field912 += a.Field912;
         if (this.Field914 == null) {
            this.Field913 = a.Field913;
            this.Field914 = a.Field914;
         } else {
            a a = a.Field913;
            this.Field914.Field800 = a;
            a.Field799 = this.Field914;
            this.Field914 = a.Field914;
         }

         this.Field915 = null;
         a.Method203(false);
      }
   }

   public void Method196(a a) {
      ++this.Field912;
      if (this.Field913 == null) {
         this.Field913 = a;
         this.Field914 = a;
      } else {
         this.Field913.Field799 = a;
         a.Field800 = this.Field913;
      }

      this.Field913 = a;
      this.Field915 = null;
      a.Field801 = 0;
   }

   public void Method197(Class116 a) {
      if (a.Field912 != 0) {
         this.Field912 += a.Field912;
         if (this.Field913 == null) {
            this.Field913 = a.Field913;
            this.Field914 = a.Field914;
         } else {
            a a = a.Field914;
            this.Field913.Field799 = a;
            a.Field800 = this.Field913;
            this.Field913 = a.Field913;
         }

         this.Field915 = null;
         a.Method203(false);
      }
   }

   public void Method198(a a, a a) {
      ++this.Field912;
      a a = a.Field800;
      this.Field914 = a;
      a.Field800 = a;
      a.Field800 = a;
      a.Field799 = a;
      this.Field915 = null;
      a.Field801 = 0;
   }

   public void Method199(a a, Class116 a) {
      if (a.Field912 != 0) {
         this.Field912 += a.Field912;
         a a = a.Field913;
         a a = a.Field914;
         a a = a.Field800;
         this.Field914 = a;
         a.Field800 = a;
         a.Field800 = a;
         a.Field799 = a;
         this.Field915 = null;
         a.Method203(false);
      }
   }

   public void Method200(a a, a a) {
      ++this.Field912;
      a a = a.Field799;
      this.Field913 = a;
      a.Field799 = a;
      a.Field800 = a;
      a.Field799 = a;
      this.Field915 = null;
      a.Field801 = 0;
   }

   public void Method201(a a, Class116 a) {
      if (a.Field912 != 0) {
         this.Field912 += a.Field912;
         a a = a.Field913;
         a a = a.Field914;
         a a = a.Field799;
         this.Field913 = a;
         a.Field799 = a;
         a.Field800 = a;
         a.Field799 = a;
         this.Field915 = null;
         a.Method203(false);
      }
   }

   public void Method202(a a) {
      --this.Field912;
      a a = a.Field800;
      a a = a.Field799;
      this.Field913 = null;
      this.Field914 = null;
      this.Field915 = null;
      a.Field801 = -1;
      a.Field799 = null;
      a.Field800 = null;
   }

   void Method203(boolean a) {
      a a = this.Field913;

      while(true) {
         a a = a.Field800;
         a.Field801 = -1;
         a.Field799 = null;
         a.Field800 = null;
         a = a;
      }
   }

   public void Method204() {
      this.Method203(false);
   }

   public void Method205() {
      a a = this.Field913;

      while(true) {
         if (a instanceof Class104) {
            ((Class104)a).Method304();
         }

         a = a.Field800;
      }
   }

   public static void Method206(String[] arr) {
      Field916 = arr;
   }

   public static String[] Method207() {
      return Field916;
   }

   private static IndexOutOfBoundsException Method208(IndexOutOfBoundsException indexOutOfBoundsException) {
      return indexOutOfBoundsException;
   }

   static {
      if (Method207() == null) {
         Method206(new String[5]);
      }

   }
}
