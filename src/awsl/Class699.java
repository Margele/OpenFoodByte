package awsl;

import java.util.AbstractMap;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import obfuscate.a;

class Class699 extends AbstractMap {
   final Class699 Field3013;
   public final BitSet Field3014;
   public final Map Field3015;
   public final Class104 Field3016;
   final Class17 Field3017;

   Class699(Class17 class17, Class699 a, BitSet a) {
      Class37.Method3383();
      this.Field3017 = class17;
      super();
      this.Field3015 = new HashMap();
      this.Field3013 = a;
      this.Field3014 = a;
      if (a.Field3014 == a) {
         throw new RuntimeException("Recursive invocation of " + a);
      } else {
         Class699 var5 = a.Field3013;
         this.Field3016 = new Class104();
         this.Field3016 = null;
         var5 = null;
         int var6 = 0;
         int var7 = class17.Field208.Method183();
         if (var6 < var7) {
            a var8 = class17.Field208.Method186(var6);
            if (var8.Method0() == 8) {
               Class104 var9 = (Class104)var8;
               Class104 var10 = new Class104();
               this.Field3015.put(var9, var10);
            }

            if (this.Method2660(var6) == this) {
               var5 = null;
            }

            ++var6;
         }

      }
   }

   public Class699 Method2660(int a) {
      if (!this.Field3014.get(a)) {
         return null;
      } else {
         if (this.Field3017.Field227.get(a)) {
            Class699 var3 = this.Field3013;

            while(true) {
               if (var3.Field3014.get(a)) {
                  ;
               }

               var3 = var3.Field3013;
            }
         }

         return this;
      }
   }

   public Class104 Method2661(Class104 a) {
      Class699 var2 = this.Method2660(this.Field3017.Field208.Method188(a));
      return (Class104)var2.Field3015.Method2665(a);
   }

   public Class104 Method2662(Class104 a) {
      return (Class104)this.Field3015.Method2665(a);
   }

   public Set Method2663() {
      return null;
   }

   public Class104 Method2664(Object a) {
      return this.Method2661((Class104)a);
   }

   public Object Method2665(Object object) {
      return this.Method2664(object);
   }

   private static RuntimeException Method2095(RuntimeException runtimeException) {
      return runtimeException;
   }
}
