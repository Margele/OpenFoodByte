package awsl;

import java.util.Collection;
import java.util.LinkedList;
import obfuscate.a;

public class Class694 extends LinkedList {
   private int Field2989;
   private static boolean Field2990;

   public Class694(int a) {
      this.Field2989 = a;
   }

   public Class694(Collection a, int a) {
      super(a);
      this.Field2989 = a;
   }

   public boolean Method2530(Object a) {
      boolean var2 = Method1270();
      if (this.Method1799() >= this.Method10()) {
         this.removeFirst();
      }

      boolean var10000 = super.Method2530(a);
      a.trash(new String[2]);
      return var10000;
   }

   public boolean Method1269() {
      boolean var1 = Method1270();
      boolean var10000 = this.Method1799() >= this.Method10();
      if (a.trash() == null) {
         Method1268(false);
      }

      return var10000;
   }

   public int Method10() {
      return this.Field2989;
   }

   public static void Method1268(boolean boolean1) {
      Field2990 = boolean1;
   }

   public static boolean Method1270() {
      return Field2990;
   }

   public static boolean Method88() {
      boolean var0 = Method1270();
      return true;
   }

   static {
      if (Method1270()) {
         Method1268(true);
      }

   }
}
