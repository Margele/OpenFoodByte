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
      Class95 a = new Class95();
      a.Field814 = this.Field814;
      int a;
      Object a;
      if (this.Field815 != null) {
         a.Field815 = new ArrayList();
         a = 0;
         if (a < this.Field815.Method1799()) {
            a = this.Field815.get(a);
            if (a instanceof Class104) {
               a = a.Method2665(a);
            }

            a.Field815.Method2530(a);
            ++a;
         }
      }

      if (this.Field816 != null) {
         a.Field816 = new ArrayList();
         int a = 0;
         if (a < this.Field816.Method1799()) {
            a = this.Field816.get(a);
            if (a instanceof Class104) {
               a = a.Method2665(a);
            }

            a.Field816.Method2530(a);
            a = a + 1;
         }
      }

      return a;
   }

   private static List Method3636(int a, Object[] a) {
      return Arrays.asList(a).subList(0, a);
   }

   private static Object[] Method3637(List a) {
      Object[] a = new Object[a.Method1799()];

      for(int a = 0; a < a.length; ++a) {
         Object a = a.get(a);
         if (a instanceof Class104) {
            a = ((Class104)a).Method303();
         }

         a[a] = a;
      }

      return a;
   }
}
