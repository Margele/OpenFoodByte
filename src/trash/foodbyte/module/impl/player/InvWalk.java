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
      KeyBinding[] a = new KeyBinding[]{mc.gameSettings.keyBindForward, mc.gameSettings.keyBindBack, mc.gameSettings.keyBindLeft, mc.gameSettings.keyBindRight, mc.gameSettings.keyBindSprint, mc.gameSettings.keyBindJump};
      int a;
      int a;
      KeyBinding a;
      byte a;
      if (!this.Field2719.getValue()) {
         if (mc.currentScreen != null && !(mc.currentScreen instanceof GuiChat)) {
            a = a.length;
            a = 0;
            if (a < a) {
               a = a[a];
               KeyBinding.setKeyBindState(a.getKeyCode(), Keyboard.isKeyDown(a.getKeyCode()));
               ++a;
            }
         }

         if (!Objects.isNull(mc.currentScreen)) {
            return;
         }

         a = a.length;
         a = 0;
         if (a < a) {
            a = a[a];
            if (!Keyboard.isKeyDown(a.getKeyCode())) {
               KeyBinding.setKeyBindState(a.getKeyCode(), false);
            }

            a = a + 1;
         }
      }

      if (this.Field2718 && Objects.nonNull(mc.currentScreen)) {
         a = a.length;
         a = 0;
         if (a < a) {
            a = a[a];
            KeyBinding.setKeyBindState(a.getKeyCode(), false);
            a = a + 1;
         }

      } else {
         if (mc.currentScreen != null && !(mc.currentScreen instanceof GuiChat) && !(mc.currentScreen instanceof GuiChest) && !(mc.currentScreen instanceof GuiCrafting) && !(mc.currentScreen instanceof GuiFurnace) && !(mc.currentScreen instanceof GuiRepair) && !(mc.currentScreen instanceof GuiEditSign) && !(mc.currentScreen instanceof GuiEnchantment)) {
            a = a.length;
            a = 0;
            if (a < a) {
               a = a[a];
               KeyBinding.setKeyBindState(a.getKeyCode(), Keyboard.isKeyDown(a.getKeyCode()));
               a = a + 1;
            }
         }

         if (Objects.isNull(mc.currentScreen)) {
            this.Field2718 = false;
            a = a.length;
            a = 0;
            if (a < a) {
               a = a[a];
               if (!Keyboard.isKeyDown(a.getKeyCode())) {
                  KeyBinding.setKeyBindState(a.getKeyCode(), false);
               }

               a = a + 1;
            }

            a = a.length;
            a = 0;
            if (a < a) {
               a = a[a];
               KeyBinding.setKeyBindState(a.getKeyCode(), Keyboard.isKeyDown(a.getKeyCode()));
               a = a + 1;
            }
         }

      }
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (this.Field2719.getValue()) {
         Packet a = a.getPacket();
         if (a.isSend()) {
            if (a instanceof C0DPacketCloseWindow) {
               C0DPacketCloseWindow a = (C0DPacketCloseWindow)a.getPacket();
               if (mc.currentScreen instanceof GuiInventory && !this.Field2718) {
                  int a = true;

                  try {
                     int a = ReflectionHelper.findField(a.getClass(), new String[]{ObfuscatedField.windowId.getObfuscatedName()}).getInt(a);
                     a.setCancelled(true);
                  } catch (IllegalAccessException var6) {
                  }
               }

               this.Field2718 = false;
            }

            if (a instanceof C16PacketClientStatus) {
               C16PacketClientStatus a = (C16PacketClientStatus)a;
               if (a.getStatus() == EnumState.OPEN_INVENTORY_ACHIEVEMENT) {
                  a.setCancelled(true);
               }
            }

            if (a instanceof C0EPacketClickWindow) {
               C0EPacketClickWindow a = (C0EPacketClickWindow)a.getPacket();
               if (mc.currentScreen instanceof GuiInventory) {
                  if ((a.getMode() == 4 || a.getMode() == 3) && a.getSlotId() == -999) {
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
         KeyBinding[] a = new KeyBinding[]{mc.gameSettings.keyBindForward, mc.gameSettings.keyBindBack, mc.gameSettings.keyBindLeft, mc.gameSettings.keyBindRight, mc.gameSettings.keyBindSprint, mc.gameSettings.keyBindJump};
         KeyBinding[] a = a;
         int a = a.length;

         for(int a = 0; a < a; ++a) {
            KeyBinding a = a[a];
            KeyBinding.setKeyBindState(a.getKeyCode(), false);
         }

      }
   }

   private static IllegalAccessException Method1185(IllegalAccessException illegalAccessException) {
      return illegalAccessException;
   }
}
