package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import obfuscate.a;

public class Class96 extends a {
   public Class104 Field817;
   public List Field818;
   public List Field819;

   public Class96(Class104 a, int[] a, Class104[] a) {
      super(171);
      Class15.Method1984();
      this.Field817 = a;
      this.Field818 = new ArrayList(0);
      this.Field819 = new ArrayList(0);
      int a = 0;
      if (a < a.length) {
         this.Field818.Method2530(new Integer(a[a]));
         ++a;
      }

      this.Field819.addAll(Arrays.asList(a));
   }

   public int Method0() {
      return 12;
   }

   public void Method1(Class267 a) {
      Class15.Method1984();
      int[] a = new int[this.Field818.Method1799()];
      int a = 0;
      if (a < a.length) {
         a[a] = (Integer)this.Field818.get(a);
         ++a;
      }

      Class264[] a = new Class264[this.Field819.Method1799()];
      int a = 0;
      if (a < a.length) {
         a[a] = ((Class104)this.Field819.get(a)).Method303();
         ++a;
      }

      a.Method1958(this.Field817.Method303(), a, a);
      this.Method3643(a);
   }

   public a Method2(Map a) {
      Class96 a = new Class96(Method3644(this.Field817, a), (int[])null, Method3645(this.Field819, a));
      a.Field818.addAll(this.Field818);
      return a.Method3646(this);
   }
}
