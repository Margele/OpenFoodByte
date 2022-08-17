package awsl;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class Class701 extends AbstractSet implements Iterator {
   Object Field3026;
   Object Field3027;

   static final Set Method1798() {
      return new Class701((Object)null, (Object)null);
   }

   Class701(Object a, Object a) {
      this.Field3026 = a;
      this.Field3027 = a;
   }

   public Iterator Method1383() {
      return new Class701(this.Field3026, this.Field3027);
   }

   public int Method1799() {
      return this.Field3026 == null ? 0 : (this.Field3027 == null ? 1 : 2);
   }

   public boolean Method932() {
      return this.Field3026 != null;
   }

   public Object Method933() {
      if (this.Field3026 == null) {
         throw new NoSuchElementException();
      } else {
         Object a = this.Field3026;
         this.Field3026 = this.Field3027;
         this.Field3027 = null;
         return a;
      }
   }

   public void Method934() {
   }

   Set Method1800(Class701 a) {
      if ((a.Field3026 != this.Field3026 || a.Field3027 != this.Field3027) && (a.Field3026 != this.Field3027 || a.Field3027 != this.Field3026)) {
         if (a.Field3026 == null) {
            return this;
         } else if (this.Field3026 == null) {
            return a;
         } else {
            if (a.Field3027 == null) {
               if (this.Field3027 == null) {
                  return new Class701(this.Field3026, a.Field3026);
               }

               if (a.Field3026 == this.Field3026 || a.Field3026 == this.Field3027) {
                  return this;
               }
            }

            if (this.Field3027 == null && (this.Field3026 == a.Field3026 || this.Field3026 == a.Field3027)) {
               return a;
            } else {
               HashSet a = new HashSet(4);
               a.add(this.Field3026);
               if (this.Field3027 != null) {
                  a.add(this.Field3027);
               }

               a.add(a.Field3026);
               if (a.Field3027 != null) {
                  a.add(a.Field3027);
               }

               return a;
            }
         }
      } else {
         return this;
      }
   }

   private static NoSuchElementException Method941(NoSuchElementException noSuchElementException) {
      return noSuchElementException;
   }
}
