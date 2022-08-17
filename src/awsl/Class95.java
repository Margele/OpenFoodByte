package awsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import obfuscate.a;

public class Class95 extends a {
   public int Field814;
   public List Field815;
   public List Field816;

   private Class95() {
      super(-1);
   }

   public Class95(int a, int a, Object[] a, int a, Object[] a) {
      super(-1);
      this.Field814 = a;
      switch (a) {
         case -1:
         case 0:
            this.Field815 = Method3636(a, a);
            this.Field816 = Method3636(a, a);
            break;
         case 1:
            this.Field815 = Method3636(a, a);
            break;
         case 2:
            this.Field815 = Arrays.asList();
         case 3:
         default:
            break;
         case 4:
            this.Field816 = Method3636(1, a);
      }

   }

   public int Method0() {
      return 14;
   }

   public void Method1(Class267 a) {
      int var2 = Class15.Method1984();
      switch (this.Field814) {
         case -1:
         case 0:
            a.Method1845(this.Field814, this.Field815.Method1799(), Method3637(this.Field815), this.Field816.Method1799(), Method3637(this.Field816));
         case 1:
            a.Method1845(this.Field814, this.Field815.Method1799(), Method3637(this.Field815), 0, (Object[])null);
         case 2:
            a.Method1845(this.Field814, this.Field815.Method1799(), (Object[])null, 0, (Object[])null);
         case 3:
            a.Method1845(this.Field814, 0, (Object[])null, 0, (Object[])null);
         case 4:
            a.Method1845(this.Field814, 0, (Object[])null, 1, Method3637(this.Field816));
         default:
      }
   }

   public a Method2(Map a) {
      Class15.Method3445();
      Class95 var3 = new Class95();
      var3.Field814 = this.Field814;
      int var4;
      Object var5;
      if (this.Field815 != null) {
         var3.Field815 = new ArrayList();
         var4 = 0;
         if (var4 < this.Field815.Method1799()) {
            var5 = this.Field815.get(var4);
            if (var5 instanceof Class104) {
               var5 = a.Method2665(var5);
            }

            var3.Field815.Method2530(var5);
            ++var4;
         }
      }

      if (this.Field816 != null) {
         var3.Field816 = new ArrayList();
         byte var6 = 0;
         if (var6 < this.Field816.Method1799()) {
            var5 = this.Field816.get(var6);
            if (var5 instanceof Class104) {
               var5 = a.Method2665(var5);
            }

            var3.Field816.Method2530(var5);
            var4 = var6 + 1;
         }
      }

      return var3;
   }

   private static List Method3636(int a, Object[] a) {
      return Arrays.asList(a).subList(0, a);
   }

   private static Object[] Method3637(List a) {
      Object[] var1 = new Object[a.Method1799()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Object var3 = a.get(var2);
         if (var3 instanceof Class104) {
            var3 = ((Class104)var3).Method303();
         }

         var1[var2] = var3;
      }

      return var1;
   }
}
