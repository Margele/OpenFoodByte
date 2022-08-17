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
      int var5 = 0;
      if (var5 < a.length) {
         this.Field818.Method2530(new Integer(a[var5]));
         ++var5;
      }

      this.Field819.addAll(Arrays.asList(a));
   }

   public int Method0() {
      return 12;
   }

   public void Method1(Class267 a) {
      Class15.Method1984();
      int[] var3 = new int[this.Field818.Method1799()];
      int var4 = 0;
      if (var4 < var3.length) {
         var3[var4] = (Integer)this.Field818.get(var4);
         ++var4;
      }

      Class264[] var6 = new Class264[this.Field819.Method1799()];
      int var5 = 0;
      if (var5 < var6.length) {
         var6[var5] = ((Class104)this.Field819.get(var5)).Method303();
         ++var5;
      }

      a.Method1958(this.Field817.Method303(), var3, var6);
      this.Method3643(a);
   }

   public a Method2(Map a) {
      Class96 var2 = new Class96(Method3644(this.Field817, a), (int[])null, Method3645(this.Field819, a));
      var2.Field818.addAll(this.Field818);
      return var2.Method3646(this);
   }
}
