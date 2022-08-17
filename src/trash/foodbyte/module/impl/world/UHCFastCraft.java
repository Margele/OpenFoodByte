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
      String var1 = Class492.Method2239();
      if (mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChest) {
         GuiContainer var2 = (GuiContainer)mc.currentScreen;
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = 0;

         try {
            var5 = ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.guiLeft.getObfuscatedName()}).getInt(var2);
            var6 = ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.guiTop.getObfuscatedName()}).getInt(var2);
         } catch (Exception var10) {
         }

         boolean var7 = false;
         if (mc.currentScreen instanceof GuiInventory) {
            try {
               InventoryEffectRenderer var8 = (InventoryEffectRenderer)mc.currentScreen;
               if (var5 == ReflectionHelper.findField(GuiContainer.class, new String[]{ObfuscatedField.guiLeft.getObfuscatedName()}).getInt(var8)) {
                  var7 = true;
               }
            } catch (Exception var9) {
            }
         }

         if (mc.thePlayer.getActivePotionEffects().isEmpty() || mc.currentScreen instanceof GuiChest) {
            int var10000 = var2.width - var5;
         }

         int var12 = var5 + 176;
         if (this.Field2189 == null) {
            this.Field2189 = new Class378(this, (float)(var2.width - var5), (float)(var6 + 3), 100.0F, 100.0F, 12.0F, 1.0F, 0.5F);
         }

         if (this.Field2188.getBooleanValue()) {
            this.Field2189.Field1806 = (float)var12;
            this.Field2189.Field1807 = (float)(var6 + 3);
         }
      }

      if (this.Field2189 != null && mc.thePlayer != null && (mc.currentScreen instanceof GuiInventory || mc.currentScreen instanceof GuiChest)) {
         this.Method814();
         this.Method815();
         if (this.Field2189.Field1794 != null) {
            ItemStack var11 = this.Field2189.Field1794;
            List var13 = var11.getTooltip(mc.thePlayer, mc.gameSettings.advancedItemTooltips);
            int var14 = 0;
            if (var14 < var13.Method1799()) {
               var13.set(var14, var11.getRarity().rarityColor + (String)var13.get(var14));
               var13.set(var14, EnumChatFormatting.GRAY + (String)var13.get(var14));
               ++var14;
            }

            GlStateManager.disableDepth();
            this.Method2117(var13, this.Field2190, this.Field2191);
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
         int var4 = 0;
         Iterator var5 = a.Method1383();

         int var7;
         while(var5.Method932()) {
            String var6 = (String)var5.Method933();
            var7 = mc.fontRendererObj.getStringWidth(var6);
            if (var7 > var4) {
               var4 = var7;
            }
         }

         int var10 = a + 12;
         int var11 = a - 12;
         var7 = 8;
         if (a.Method1799() > 1) {
            var7 += 2 + (a.Method1799() - 1) * 10;
         }

         if (var10 + var4 > RenderUtils.Method1076()) {
            var10 -= 28 + var4;
         }

         if (var11 + var7 + 6 > RenderUtils.Method1077()) {
            var11 = RenderUtils.Method1077() - var7 - 6;
         }

         RenderUtils.Method1104((float)(var10 - 4), (float)(var11 - 4), (float)(var10 + var4 + 4), (float)(var11 + var7 + 4), Class681.Method2699(Class707.Method1828(), 50));
         RenderUtils.Method1104((float)(var10 - 3), (float)(var11 - 3), (float)(var10 + var4 + 3), (float)(var11 + var7 + 3), Integer.MIN_VALUE);

         for(int var8 = 0; var8 < a.Method1799(); ++var8) {
            String var9 = (String)a.get(var8);
            mc.fontRendererObj.drawStringWithShadow(var9, (float)var10, (float)var11, -1);
            var11 += 2;
            var11 += 10;
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
