package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import obfuscate.a;

public class Class122 extends a {
   public int Field959;
   public int Field960;
   public Class104 Field961;
   public List Field962;

   public Class122(int a, int a, Class104 a, Class104[] a) {
      super(170);
      this.Field959 = a;
      this.Field960 = a;
      this.Field961 = a;
      this.Field962 = new ArrayList();
      this.Field962.addAll(Arrays.asList(a));
   }

   public int Method0() {
      return 11;
   }

   public void Method1(Class267 a) {
      Class15.Method3445();
      Class264[] var3 = new Class264[this.Field962.Method1799()];
      int var4 = 0;
      if (var4 < var3.length) {
         var3[var4] = ((Class104)this.Field962.get(var4)).Method303();
         ++var4;
      }

      a.Method1959(this.Field959, this.Field960, this.Field961.Method303(), var3);
      this.Method3643(a);
   }

   public a Method2(Map a) {
      return (new Class122(this.Field959, this.Field960, Method3644(this.Field961, a), Method3645(this.Field962, a))).Method3646(this);
   }
}
