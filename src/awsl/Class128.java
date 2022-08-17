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
         int var12 = a[var11];
         this.Field979.Method2530(var12);
         ++var11;
      }

   }

   public void Method679(Class267 a, boolean a) {
      Class15.Method3445();
      Class264[] var4 = new Class264[this.Field977.Method1799()];
      Class264[] var5 = new Class264[this.Field978.Method1799()];
      int[] var6 = new int[this.Field979.Method1799()];
      int var7 = 0;
      if (var7 < var4.length) {
         var4[var7] = ((Class104)this.Field977.get(var7)).Method303();
         var5[var7] = ((Class104)this.Field978.get(var7)).Method303();
         var6[var7] = (Integer)this.Field979.get(var7);
         ++var7;
      }

      this.Method646(a.Method1844(this.Field975, this.Field976, var4, var5, var6, this.Field973, true));
   }
}
