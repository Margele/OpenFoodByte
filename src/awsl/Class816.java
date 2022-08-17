package awsl;

import java.util.Set;
import obfuscate.a;

public class Class816 implements Class797 {
   public final int Field3652;
   public final Set Field3653;

   public Class816(int a) {
      this(a, Class701.Method1798());
   }

   public Class816(int a, a a) {
      this.Field3652 = a;
      this.Field3653 = new Class701(a, (Object)null);
   }

   public Class816(int a, Set a) {
      this.Field3652 = a;
      this.Field3653 = a;
   }

   public int Method806() {
      return this.Field3652;
   }

   public boolean Method863(Object a) {
      if (!(a instanceof Class816)) {
         return false;
      } else {
         Class816 a = (Class816)a;
         return this.Field3652 == a.Field3652 && this.Field3653.equals(a.Field3653);
      }
   }

   public int Method864() {
      return this.Field3653.hashCode();
   }
}
