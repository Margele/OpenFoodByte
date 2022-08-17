package awsl;

import java.util.List;
import obfuscate.a;
import obfuscate.b;

public abstract class Class786 {
   protected final int Field3540;
   private static int[] Field3541;

   protected Class786(int a) {
      this.Field3540 = a;
   }

   public abstract Class797 Method907(b class46);

   public abstract Class797 Method908(a class91) throws Class731;

   public abstract Class797 Method909(a class91, Class797 class797) throws Class731;

   public abstract Class797 Method910(a class91, Class797 class797) throws Class731;

   public abstract Class797 Method911(a class91, Class797 class7972, Class797 class7973) throws Class731;

   public abstract Class797 Method912(a class91, Class797 class7972, Class797 class7973, Class797 class7974) throws Class731;

   public abstract Class797 Method913(a class91, List list) throws Class731;

   public abstract void Method914(a class91, Class797 class7972, Class797 class7973) throws Class731;

   public abstract Class797 Method915(Class797 class7971, Class797 class7972);

   public static void Method916(int[] arr) {
      Field3541 = arr;
   }

   public static int[] Method917() {
      return Field3541;
   }

   static {
      if (Method917() != null) {
         Method916(new int[1]);
      }

   }
}
