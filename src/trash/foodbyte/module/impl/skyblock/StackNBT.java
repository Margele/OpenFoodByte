package trash.foodbyte.module.impl.skyblock;

import awsl.Class356;
import awsl.Class98;
import eventapi.EventTarget;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ChatUtils;

public class StackNBT extends Module {
   public boolean Field3137 = false;

   public StackNBT() {
      super("StackNBT", Category.SKYBLOCK);
      this.setDescription("瞄准物品按下TAB读取物品nbt\n自动复制到剪切板");
   }

   public boolean canUse() {
      return GlobalModule.INSTANCE.balant == null || !PermissionManager.canUseFeature("stacknbt");
   }

   @EventTarget
   public void Method1626(EventTickUpdate a) {
      int[] a = Class98.Method3639();
      if (Wrapper.INSTANCE.getThePlayer() != null) {
         boolean a = Keyboard.isKeyDown(15);
         if (!this.Field3137) {
            this.Field3137 = true;
            if (mc.currentScreen instanceof GuiContainer) {
               GuiContainer a = (GuiContainer)mc.currentScreen;
               ItemStack a = null;
               if (this.Method1993(a) != null) {
                  a = this.Method1993(a).getStack();
               }

               if (a.getTagCompound() != null) {
                  ChatUtils.addChatMessageNoPrefix(a.getDisplayName());
                  NBTTagCompound a = a.getTagCompound();
                  NBTTagList a = Class356.Method139(a);
                  int a = 0;
                  if (a < a.tagCount()) {
                     System.err.println(a.get(a));
                     ++a;
                  }

                  int a = 0;
                  if (a < a.tagCount()) {
                     if (a.get(a).toString().contains("Category") || a.get(a).toString().contains("Max Crafts")) {
                        a.removeTag(a);
                     }

                     a = a + 1;
                  }

                  a = 0;
                  if (a < a.tagCount()) {
                     if (a.get(a).toString().contains("Category") || a.get(a).toString().contains("Max Crafts")) {
                        a.removeTag(a);
                     }

                     a = a + 1;
                  }

                  a = 0;
                  int a = 0;
                  if (a < a.tagCount()) {
                     if (a.get(a).toString().equals("\"\"")) {
                        a = a + 1;
                        if (a >= 2) {
                           a.removeTag(a);
                        }
                     }

                     ++a;
                  }

                  String a = this.Method1992(a.getItem()) + " " + a.stackSize + " " + a.getItemDamage() + " " + a.getTagCompound().toString();
                  a = a.replace("§aClick to view recipe!", "§dClick to craft!");
                  Wrapper.INSTANCE.setClipboard(a);
               }
            }
         }

         this.Field3137 = a;
      }

   }

   public String Method1992(Item a) {
      return a.delegate.getResourceName() != null ? a.delegate.getResourceName().toString() : "";
   }

   public Slot Method1993(GuiContainer a) {
      Slot a = null;

      try {
         a = (Slot)ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.theSlot.getObfuscatedName()}).get(a);
      } catch (Exception var4) {
      }

      return a;
   }
}
