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
      int[] var2 = Class98.Method3639();
      if (Wrapper.INSTANCE.getThePlayer() != null) {
         boolean var3 = Keyboard.isKeyDown(15);
         if (!this.Field3137) {
            this.Field3137 = true;
            if (mc.currentScreen instanceof GuiContainer) {
               GuiContainer var4 = (GuiContainer)mc.currentScreen;
               ItemStack var5 = null;
               if (this.Method1993(var4) != null) {
                  var5 = this.Method1993(var4).getStack();
               }

               if (var5.getTagCompound() != null) {
                  ChatUtils.addChatMessageNoPrefix(var5.getDisplayName());
                  NBTTagCompound var6 = var5.getTagCompound();
                  NBTTagList var7 = Class356.Method139(var5);
                  int var8 = 0;
                  if (var8 < var7.tagCount()) {
                     System.err.println(var7.get(var8));
                     ++var8;
                  }

                  byte var10 = 0;
                  if (var10 < var7.tagCount()) {
                     if (var7.get(var10).toString().contains("Category") || var7.get(var10).toString().contains("Max Crafts")) {
                        var7.removeTag(var10);
                     }

                     var8 = var10 + 1;
                  }

                  var10 = 0;
                  if (var10 < var7.tagCount()) {
                     if (var7.get(var10).toString().contains("Category") || var7.get(var10).toString().contains("Max Crafts")) {
                        var7.removeTag(var10);
                     }

                     var8 = var10 + 1;
                  }

                  var10 = 0;
                  int var9 = 0;
                  if (var9 < var7.tagCount()) {
                     if (var7.get(var9).toString().equals("\"\"")) {
                        var8 = var10 + 1;
                        if (var8 >= 2) {
                           var7.removeTag(var9);
                        }
                     }

                     ++var9;
                  }

                  String var11 = this.Method1992(var5.getItem()) + " " + var5.stackSize + " " + var5.getItemDamage() + " " + var5.getTagCompound().toString();
                  var11 = var11.replace("§aClick to view recipe!", "§dClick to craft!");
                  Wrapper.INSTANCE.setClipboard(var11);
               }
            }
         }

         this.Field3137 = var3;
      }

   }

   public String Method1992(Item a) {
      return a.delegate.getResourceName() != null ? a.delegate.getResourceName().toString() : "";
   }

   public Slot Method1993(GuiContainer a) {
      Slot var2 = null;

      try {
         var2 = (Slot)ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.theSlot.getObfuscatedName()}).get(a);
      } catch (Exception var4) {
      }

      return var2;
   }
}
