package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class128 extends Class126 {
   public List Field977;
   public List Field978;
   public List Field979;

   public Class128(int a, Class31 a, Class104[] a, Class104[] a, int[] a, String a) {
      this(327680, a, a, a, a, a, a);
   }

   public Class128(int a, int a, Class31 a, Class104[] a, Class104[] a, int[] a, String a) {
      super(a, a, a, a);
      this.Field977 = new ArrayList(a.length);
      Class15.Method1984();
      this.Field977.addAll(Arrays.asList(a));
      this.Field978 = new ArrayList(a.length);
      this.Field978.addAll(Arrays.asList(a));
      this.Field979 = new ArrayList(a.length);
      int var10 = a.length;
      int var11 = 0;
      if (var11 < var10) {
         int a = a[var11];
         this.Field979.Method2530(a);
         ++var11;
      }

   }

   public void Method679(Class267 a, boolean a1) {
      Class15.Method3445();
      Class264[] a = new Class264[this.Field977.Method1799()];
      Class264[] a = new Class264[this.Field978.Method1799()];
      int[] a = new int[this.Field979.Method1799()];
      int a = 0;
      if (a < a.length) {
         a[a] = ((Class104)this.Field977.get(a)).Method303();
         a[a] = ((Class104)this.Field978.get(a)).Method303();
         a[a] = (Integer)this.Field979.get(a);
         ++a;
      }

      this.Method646(a.Method1844(this.Field975, this.Field976, a, a, a, this.Field973, true));
   }
}
