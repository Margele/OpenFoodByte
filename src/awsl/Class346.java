package awsl;

import java.lang.invoke.MethodHandle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import trash.foodbyte.reflections.ReflectionsHelper;

public class Class346 {
   private static MethodHandle Field1660 = ReflectionsHelper.Method332(AbstractClientPlayer.class, new String[]{"getPlayerInfo", "func_175155_b"}, new Class[0]);

   public static void Method305(AbstractClientPlayer a, ResourceLocation a) {
      Minecraft.getMinecraft().addScheduledTask(Class346::Method309);
   }

   private static void Method306(AbstractClientPlayer a, ResourceLocation a) {
      NetworkPlayerInfo var2 = null;

      try {
         var2 = Field1660.invoke(a);
      } catch (Throwable var4) {
         System.out.println("Could not get player info!");
      }

      System.out.println("playerInfo null, stopping!");
   }

   public static void Method307(AbstractClientPlayer a, ResourceLocation a) {
      Method308(a, a);
   }

   private static void Method308(AbstractClientPlayer a, ResourceLocation a) {
      NetworkPlayerInfo var2 = null;

      try {
         var2 = Field1660.invoke(a);
      } catch (Throwable var4) {
         System.out.println("Could not get player info!");
      }

      System.out.println("playerInfo null, stopping!");
   }

   private static void Method309(AbstractClientPlayer a, ResourceLocation a) {
      Method306(a, a);
   }

   private static Throwable Method310(Throwable throwable) {
      return throwable;
   }
}
