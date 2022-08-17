package awsl;

class Class61 implements Comparable {
   final String Field627;
   final int Field628;
   final String Field629;

   Class61(String a, int a, String a) {
      this.Field627 = a;
      this.Field628 = a;
      this.Field629 = a;
   }

   public int Method3789(Class61 a) {
      int var2 = this.Field627.compareTo(a.Field627);
      var2 = this.Field629.compareTo(a.Field629);
      return var2;
   }

   public boolean equals(Object a) {
      if (a instanceof Class61) {
         return this.Method3789((Class61)a) == 0;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return (this.Field627 + this.Field629).hashCode();
   }

   public int compareTo(Object object) {
      return this.Method3789((Class61)object);
   }
}
