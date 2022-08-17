package trash.foodbyte.module.impl.world;

import awsl.Class378;
import awsl.Class492;
import awsl.Class643;
import awsl.Class681;
import awsl.Class707;
import eventapi.EventTarget;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.value.BooleanValue;

public class UHCFastCraft extends Module {
   public BooleanValue Field2188 = new BooleanValue("UHCFastCraft", "Keep InvGui", true, "保持窗口在背包右边");
   public Class378 Field2189;
   private int Field2190;
   private int Field2191;

   public UHCFastCraft() {
      super("UHCFastCraft", "UHC Fast Craft", Category.WORLD);
      this.Method1033(true);
   }

   public String getDescription() {
      return "UHC快速合成";
   }

   @EventTarget
   public void Method2116(Class643 a) {
      if (ServerPacketHandler.currentServer == Servers.UHC) {
         this.Method258();
      }

   }

   @EventTarget
   public void Method801(EventTickUpdate a) {
      if (ServerPacketHandler.currentServer == Servers.UHC && this.Field2189 != null && mc.thePlayer != null && (mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChest)) {
         this.Field2189.Method479(this.Field2190, this.Field2191, Mouse.isButtonDown(0));
      }

   }

   public void Method258() {
      String a = Class492.Method2239();
      if (mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChest) {
         GuiContainer a = (GuiContainer)mc.currentScreen;
         int a = false;
         int a = false;
         int a = 0;
         int a = 0;

         try {
            a = ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.guiLeft.getObfuscatedName()}).getInt(a);
            a = ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.guiTop.getObfuscatedName()}).getInt(a);
         } catch (Exception var10) {
         }

         int a = false;
         if (mc.currentScreen instanceof GuiInventory) {
            try {
               InventoryEffectRenderer a = (InventoryEffectRenderer)mc.currentScreen;
               if (a == ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.guiLeft.getObfuscatedName()}).getInt(a)) {
                  a = true;
               }
            } catch (Exception var9) {
            }
         }

         if (mc.thePlayer.getActivePotionEffects().isEmpty() || mc.currentScreen instanceof GuiChest) {
            int var10000 = a.width - a;
         }

         int a = a + 176;
         if (this.Field2189 == null) {
            this.Field2189 = new Class378(this, (float)(a.width - a), (float)(a + 3), 100.0F, 100.0F, 12.0F, 1.0F, 0.5F);
         }

         if (this.Field2188.getBooleanValue()) {
            this.Field2189.Field1806 = (float)a;
            this.Field2189.Field1807 = (float)(a + 3);
         }
      }

      if (this.Field2189 != null && mc.thePlayer != null && (mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChest)) {
         this.Method814();
         this.Method815();
         if (this.Field2189.Field1794 != null) {
            ItemStack a = this.Field2189.Field1794;
            List a = a.getTooltip(mc.thePlayer, mc.gameSettings.advancedItemTooltips);
            int a = 0;
            if (a < a.Method1799()) {
               a.set(a, a.getRarity().rarityColor + (String)a.get(a));
               a.set(a, EnumChatFormatting.GRAY + (String)a.get(a));
               ++a;
            }

            GlStateManager.disableDepth();
            this.Method2117(a, this.Field2190, this.Field2191);
            GlStateManager.enableDepth();
         }
      }

   }

   public void Method814() {
      this.Field2190 = (int)MathUtils.Method547((float)Mouse.getX(), 0.0F, (float)Display.getWidth(), 0.0F, (float)RenderUtils.Method1076());
      this.Field2191 = (int)MathUtils.Method547((float)(Display.getHeight() - Mouse.getY()), 0.0F, (float)Display.getHeight(), 0.0F, (float)RenderUtils.Method1077());
      this.Field2189.Method64(this.Field2190, this.Field2191);
      this.Field2189.Method456(this.Field2190, this.Field2191, Mouse.isButtonDown(0) || Mouse.isButtonDown(2));
   }

   public void Method815() {
      this.Field2189.Method63();
   }

   public void Method2117(List a, int a, int a) {
      if (!a.isEmpty()) {
         int a = 0;
         Iterator var5 = a.Method1383();

         int a;
         while(var5.Method932()) {
            String a = (String)var5.Method933();
            a = mc.fontRendererObj.getStringWidth(a);
            if (a > a) {
               a = a;
            }
         }

         int a = a + 12;
         int a = a - 12;
         a = 8;
         if (a.Method1799() > 1) {
            a += 2 + (a.Method1799() - 1) * 10;
         }

         if (a + a > RenderUtils.Method1076()) {
            a -= 28 + a;
         }

         if (a + a + 6 > RenderUtils.Method1077()) {
            a = RenderUtils.Method1077() - a - 6;
         }

         RenderUtils.Method1104((float)(a - 4), (float)(a - 4), (float)(a + a + 4), (float)(a + a + 4), Class681.Method2699(Class707.Method1828(), 50));
         RenderUtils.Method1104((float)(a - 3), (float)(a - 3), (float)(a + a + 3), (float)(a + a + 3), Integer.MIN_VALUE);

         for(int a = 0; a < a.Method1799(); ++a) {
            String a = (String)a.get(a);
            mc.fontRendererObj.drawStringWithShadow(a, (float)a, (float)a, -1);
            a += 2;
            a += 10;
         }
      }

   }

   static int Method2118(UHCFastCraft a) {
      return a.Field2190;
   }

   static int Method2119(UHCFastCraft a) {
      return a.Field2191;
   }

   private static Exception Method263(Exception exception) {
      return exception;
   }
}
