package awsl;

import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MoveUtils;

public class Class747 {
   private static Minecraft Field3270 = Minecraft.getMinecraft();

   public static int Method1561() {
      MoveUtils.trash();
      int var1 = 0;
      if (var1 < 8) {
         if (Field3270.thePlayer.inventory.mainInventory[var1] == null) {
            return var1;
         }

         ++var1;
      }

      return Field3270.thePlayer.inventory.currentItem + (Field3270.thePlayer.inventory.getCurrentItem() == null ? 0 : (Field3270.thePlayer.inventory.currentItem < 8 ? 4 : -1));
   }

   public static ItemStack Method1562() {
      return Field3270.thePlayer.getCurrentEquippedItem() == null ? new ItemStack(Blocks.air) : Field3270.thePlayer.getCurrentEquippedItem();
   }

   public static ItemStack Method1563(int a) {
      return Field3270.thePlayer.inventory.mainInventory[a] == null ? new ItemStack(Blocks.air) : Field3270.thePlayer.inventory.mainInventory[a];
   }

   public static void Method1564(int a) {
      Field3270.playerController.windowClick(Field3270.thePlayer.openContainer.windowId, a, 0, 0, Field3270.thePlayer);
   }

   public static void Method1565(int a) {
      short var1 = Field3270.thePlayer.openContainer.getNextTransactionID(Field3270.thePlayer.inventory);
      ItemStack var2 = Field3270.thePlayer.openContainer.getSlot(a).getStack();
      Wrapper.INSTANCE.sendPacket(new C0EPacketClickWindow(Field3270.thePlayer.openContainer.windowId, a, 0, 0, var2, var1));
   }

   public static void Method1566(int a, int a) {
      Field3270.playerController.windowClick(Field3270.thePlayer.openContainer.windowId, a, a, 2, Field3270.thePlayer);
   }

   public static void Method1567(int a, int a) {
      short var2 = Field3270.thePlayer.openContainer.getNextTransactionID(Field3270.thePlayer.inventory);
      ItemStack var3 = Field3270.thePlayer.openContainer.getSlot(a).getStack();
      Wrapper.INSTANCE.sendPacket(new C0EPacketClickWindow(Field3270.thePlayer.openContainer.windowId, a, a, 0, var3, var2));
   }

   public static void Method1568(int a) {
      Field3270.playerController.windowClick(Field3270.thePlayer.openContainer.windowId, a, 0, 1, Field3270.thePlayer);
   }

   public static void Method1569(int a) {
      short var1 = Field3270.thePlayer.openContainer.getNextTransactionID(Field3270.thePlayer.inventory);
      ItemStack var2 = Field3270.thePlayer.openContainer.getSlot(a).getStack();
      Wrapper.INSTANCE.sendPacket(new C0EPacketClickWindow(Field3270.thePlayer.openContainer.windowId, a, 0, 1, var2, var1));
   }

   public static boolean Method1570() {
      return !Arrays.asList(Field3270.thePlayer.inventory.mainInventory).contains((Object)null);
   }
}
