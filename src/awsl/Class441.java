package awsl;

import net.minecraft.launchwrapper.Launch;
import obfuscate.a;

public class Class441 {
   private static boolean Field2087;
   private static boolean Field2088;
   private static int Field2089;

   static void Method2700() {
      Field2087 = false;
      Field2087 = (Boolean)Launch.blackboard.Method2665("fml.deobfuscatedEnvironment");
      int var10000 = Method2707();
      Field2088 = Field2087;
      int var0 = var10000;
      if (a.trash() == null) {
         ++var0;
         Method2705(var0);
      }

   }

   public static boolean Method2701() {
      return Field2087;
   }

   public static boolean Method2702() {
      return Field2088;
   }

   public static void Method2703(Boolean a) {
      Field2087 = a;
   }

   public static void Method2704(Boolean a) {
      Field2088 = a;
   }

   public static void Method2705(int integer) {
      Field2089 = integer;
   }

   public static int Method2706() {
      return Field2089;
   }

   public static int Method2707() {
      int var0 = Method2706();
      return 72;
   }

   static {
      if (Method2707() == 0) {
         Method2705(18);
      }

   }
}
