package awsl;

import java.util.Map;
import obfuscate.a;

public class Class98 extends a {
   public String Field824;
   public String Field825;
   public String Field826;
   public boolean Field827;
   private static int[] Field828;

   /** @deprecated */
   @Deprecated
   public Class98(int a, String a, String a, String a) {
      this(a, a, a, a, a == 185);
   }

   public Class98(int a, String a, String a, String a, boolean a) {
      super(a);
      this.Field824 = a;
      this.Field825 = a;
      this.Field826 = a;
      this.Field827 = a;
   }

   public void Method68(int a) {
      this.Field796 = a;
   }

   public int Method0() {
      return 5;
   }

   public void Method1(Class267 a) {
      a.Method1954(this.Field796, this.Field824, this.Field825, this.Field826, this.Field827);
   }

   public a Method2(Map a) {
      return new Class98(this.Field796, this.Field824, this.Field825, this.Field826, this.Field827);
   }

   public static void Method3638(int[] arr) {
      Field828 = arr;
   }

   public static int[] Method3639() {
      return Field828;
   }

   static {
      if (Method3639() != null) {
         Method3638(new int[2]);
      }

   }
}
