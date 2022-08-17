package obfuscate;

import awsl.Class104;
import awsl.Class126;
import awsl.Class15;
import awsl.Class267;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class a {
   public static final int Field780 = 0;
   public static final int Field781 = 1;
   public static final int Field782 = 2;
   public static final int Field783 = 3;
   public static final int Field784 = 4;
   public static final int Field785 = 5;
   public static final int Field786 = 6;
   public static final int Field787 = 7;
   public static final int Field788 = 8;
   public static final int Field789 = 9;
   public static final int Field790 = 10;
   public static final int Field791 = 11;
   public static final int Field792 = 12;
   public static final int Field793 = 13;
   public static final int Field794 = 14;
   public static final int Field795 = 15;
   protected int Field796;
   public List Field797;
   public List Field798;
   a Field799;
   a Field800;
   int Field801;
   private static String[] trash;

   protected a(int a) {
      this.Field796 = a;
      this.Field801 = -1;
   }

   public int Method3640() {
      return this.Field796;
   }

   public abstract int Method0();

   public a Method3641() {
      return this.Field799;
   }

   public a Method3642() {
      return this.Field800;
   }

   public abstract void Method1(Class267 class267);

   protected final void Method3643(Class267 a) {
      int var2 = Class15.Method1984();
      int var3 = this.Field797 == null ? 0 : this.Field797.Method1799();
      int var4 = 0;
      Class126 var5;
      if (var4 < var3) {
         var5 = (Class126)this.Field797.get(var4);
         var5.Method646(a.Method1973(var5.Field975, var5.Field976, var5.Field973, true));
         ++var4;
      }

      var3 = this.Field798 == null ? 0 : this.Field798.Method1799();
      byte var6 = 0;
      if (var6 < var3) {
         var5 = (Class126)this.Field798.get(var6);
         var5.Method646(a.Method1973(var5.Field975, var5.Field976, var5.Field973, false));
         var4 = var6 + 1;
      }

   }

   public abstract a Method2(Map map);

   static Class104 Method3644(Class104 a, Map a) {
      return (Class104)a.Method2665(a);
   }

   static Class104[] Method3645(List a, Map a) {
      Class104[] var2 = new Class104[a.Method1799()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = (Class104)a.Method2665(a.get(var3));
      }

      return var2;
   }

   protected final a Method3646(a a) {
      int var2 = Class15.Method3445();
      int var3;
      Class126 var4;
      Class126 var5;
      if (a.Field797 != null) {
         this.Field797 = new ArrayList();
         var3 = 0;
         if (var3 < a.Field797.Method1799()) {
            var4 = (Class126)a.Field797.get(var3);
            var5 = new Class126(var4.Field975, var4.Field976, var4.Field973);
            var4.Method646(var5);
            this.Field797.Method2530(var5);
            ++var3;
         }
      }

      if (a.Field798 != null) {
         this.Field798 = new ArrayList();
         byte var6 = 0;
         if (var6 < a.Field798.Method1799()) {
            var4 = (Class126)a.Field798.get(var6);
            var5 = new Class126(var4.Field975, var4.Field976, var4.Field973);
            var4.Method646(var5);
            this.Field798.Method2530(var5);
            var3 = var6 + 1;
         }
      }

      return this;
   }

   public static void trash(String[] trash) {
      trash = trash;
   }

   public static String[] trash() {
      return trash;
   }

   static {
      if (trash() == null) {
         trash(new String[3]);
      }

   }
}
