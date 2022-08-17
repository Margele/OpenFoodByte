package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class655;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiEnchantment;
import net.minecraft.client.gui.GuiRepair;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus.EnumState;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class InvWalk extends Module {
   private boolean Field2718;
   public BooleanValue Field2719 = new BooleanValue("InvWalk", "Hypixel", true, "自动阻止不合法的操作");

   public InvWalk() {
      super("InvWalk", "Inv Walk", Category.PLAYER);
   }

   public String getDescription() {
      return "背包行走";
   }

   @EventTarget
   public void Method1066(Class655 a) {
      if (this.Field2719.getValue() && (a.Method3582() instanceof GuiChat || a.Method3582() instanceof GuiChest || a.Field2925 instanceof GuiCrafting || a.Field2925 instanceof GuiFurnace || a.Field2925 instanceof GuiRepair || a.Field2925 instanceof GuiEditSign || a.Field2925 instanceof GuiEnchantment)) {
         this.Field2718 = true;
      }

   }

   @EventTarget
   public void Method232(EventUpdate a) {
      Class148.Method1444();
      KeyBinding[] var3 = new KeyBinding[]{mc.gameSettings.keyBindForward, mc.gameSettings.keyBindBack, mc.gameSettings.keyBindLeft, mc.gameSettings.keyBindRight, mc.gameSettings.keyBindSprint, mc.gameSettings.keyBindJump};
      int var5;
      int var6;
      KeyBinding var7;
      byte var8;
      if (!this.Field2719.getValue()) {
         if (mc.currentScreen != null && !(mc.currentScreen instanceof GuiChat)) {
            var5 = var3.length;
            var6 = 0;
            if (var6 < var5) {
               var7 = var3[var6];
               KeyBinding.setKeyBindState(var7.getKeyCode(), Keyboard.isKeyDown(var7.getKeyCode()));
               ++var6;
            }
         }

         if (!Objects.isNull(mc.currentScreen)) {
            return;
         }

         var5 = var3.length;
         var8 = 0;
         if (var8 < var5) {
            var7 = var3[var8];
            if (!Keyboard.isKeyDown(var7.getKeyCode())) {
               KeyBinding.setKeyBindState(var7.getKeyCode(), false);
            }

            var6 = var8 + 1;
         }
      }

      if (this.Field2718 && Objects.nonNull(mc.currentScreen)) {
         var5 = var3.length;
         var8 = 0;
         if (var8 < var5) {
            var7 = var3[var8];
            KeyBinding.setKeyBindState(var7.getKeyCode(), false);
            var6 = var8 + 1;
         }

      } else {
         if (mc.currentScreen != null && !(mc.currentScreen instanceof GuiChat) && !(mc.currentScreen instanceof GuiChest) && !(mc.currentScreen instanceof GuiCrafting) && !(mc.currentScreen instanceof GuiFurnace) && !(mc.currentScreen instanceof GuiRepair) && !(mc.currentScreen instanceof GuiEditSign) && !(mc.currentScreen instanceof GuiEnchantment)) {
            var5 = var3.length;
            var8 = 0;
            if (var8 < var5) {
               var7 = var3[var8];
               KeyBinding.setKeyBindState(var7.getKeyCode(), Keyboard.isKeyDown(var7.getKeyCode()));
               var6 = var8 + 1;
            }
         }

         if (Objects.isNull(mc.currentScreen)) {
            this.Field2718 = false;
            var5 = var3.length;
            var8 = 0;
            if (var8 < var5) {
               var7 = var3[var8];
               if (!Keyboard.isKeyDown(var7.getKeyCode())) {
                  KeyBinding.setKeyBindState(var7.getKeyCode(), false);
               }

               var6 = var8 + 1;
            }

            var5 = var3.length;
            var8 = 0;
            if (var8 < var5) {
               var7 = var3[var8];
               KeyBinding.setKeyBindState(var7.getKeyCode(), Keyboard.isKeyDown(var7.getKeyCode()));
               var6 = var8 + 1;
            }
         }

      }
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (this.Field2719.getValue()) {
         Packet var2 = a.getPacket();
         if (a.isSend()) {
            if (var2 instanceof C0DPacketCloseWindow) {
               C0DPacketCloseWindow var3 = (C0DPacketCloseWindow)a.getPacket();
               if (mc.currentScreen instanceof GuiInventory && !this.Field2718) {
                  boolean var4 = true;

                  try {
                     int var9 = ReflectionHelper.findField(var3.getClass(), new String[]{ObfuscatedField.windowId.getObfuscatedName()}).getInt(var3);
                     a.setCancelled(true);
                  } catch (IllegalAccessException var6) {
                  }
               }

               this.Field2718 = false;
            }

            if (var2 instanceof C16PacketClientStatus) {
               C16PacketClientStatus var7 = (C16PacketClientStatus)var2;
               if (var7.getStatus() == EnumState.OPEN_INVENTORY_ACHIEVEMENT) {
                  a.setCancelled(true);
               }
            }

            if (var2 instanceof C0EPacketClickWindow) {
               C0EPacketClickWindow var8 = (C0EPacketClickWindow)a.getPacket();
               if (mc.currentScreen instanceof GuiInventory) {
                  if ((var8.getMode() == 4 || var8.getMode() == 3) && var8.getSlotId() == -999) {
                     a.setCancelled(true);
                  } else {
                     Wrapper.INSTANCE.sendPacketNoEvent(new C16PacketClientStatus(EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                     this.Field2718 = true;
                  }
               }
            }
         }

         if (a.isRecieve()) {
         }
      }

   }

   public void onDisable() {
      if (mc.currentScreen != null || Wrapper.INSTANCE.isVaildWorldAndPlayer()) {
         KeyBinding[] var1 = new KeyBinding[]{mc.gameSettings.keyBindForward, mc.gameSettings.keyBindBack, mc.gameSettings.keyBindLeft, mc.gameSettings.keyBindRight, mc.gameSettings.keyBindSprint, mc.gameSettings.keyBindJump};
         KeyBinding[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            KeyBinding var5 = var2[var4];
            KeyBinding.setKeyBindState(var5.getKeyCode(), false);
         }

      }
   }

   private static IllegalAccessException Method1185(IllegalAccessException illegalAccessException) {
      return illegalAccessException;
   }
}
