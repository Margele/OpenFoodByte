package trash.foodbyte.module.impl.render;

import awsl.Class492;
import awsl.Class681;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class ArmorHud extends Module {
   public ArmorHud() {
      super("ArmorHud", "Armor Hud", Category.RENDER);
   }

   public String getDescription() {
      return "装备显示(显示在物品栏上方)";
   }

   @EventTarget
   public void Method810(EventRender2D a) {
      ScaledResolution var2 = new ScaledResolution(mc);
      this.Method1558(var2);
   }

   private void Method1558(ScaledResolution a) {
      GL11.glPushMatrix();
      Class492.Method2239();
      ArrayList var3 = new ArrayList();
      boolean var4 = mc.thePlayer.isEntityAlive() && mc.thePlayer.isInsideOfMaterial(Material.water);
      int var5 = a.getScaledWidth() / 2 - 6;
      int var6 = a.getScaledHeight();
      int var7 = 3;
      ItemStack var8 = mc.thePlayer.inventory.armorInventory[var7];
      var3.Method2530(var8);
      --var7;
      if (mc.thePlayer.getCurrentEquippedItem() != null) {
         var3.Method2530(mc.thePlayer.getCurrentEquippedItem());
      }

      Iterator var18 = var3.Method1383();
      if (var18.Method932()) {
         var8 = (ItemStack)var18.Method933();
         if (mc.theWorld != null) {
            var5 += 16;
            RenderHelper.enableGUIStandardItemLighting();
            mc.getRenderItem().renderItemAndEffectIntoGUI(var8, var5, var6 - 65);
            mc.getRenderItem().renderItemOverlays(mc.fontRendererObj, var8, var5, var6 - 65);
            RenderHelper.disableStandardItemLighting();
            int var9 = 1;
            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, var8);
            int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, var8);
            int var12 = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, var8);
            Method1760("Sh" + this.Method1761(var10) + var10, var5, var9 + var6 - 65);
            var9 += 4;
            Method1760("Fir" + this.Method1761(var11) + var11, var5, var9 + var6 - 65);
            var9 += 4;
            Method1760("Kb" + this.Method1761(var12) + var12, var5, var9 + var6 - 65);
            if (!(var8.getItem() instanceof ItemBook)) {
               int var13;
               int var14;
               int var15;
               int var16;
               if (var8.getItem() instanceof ItemTool) {
                  var13 = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, var8);
                  var14 = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, var8);
                  var15 = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, var8);
                  var16 = EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, var8);
                  Method1760("Ef" + this.Method1761(var13) + var13, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("For" + this.Method1761(var14) + var14, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Tou" + this.Method1761(var16) + var16, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Unb" + this.Method1761(var15) + var15, var5, var9 + var6 - 65);
               }

               if (var8.getItem() instanceof ItemArmor) {
                  var13 = EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, var8);
                  var14 = EnchantmentHelper.getEnchantmentLevel(Enchantment.thorns.effectId, var8);
                  var15 = EnchantmentHelper.getEnchantmentLevel(Enchantment.featherFalling.effectId, var8);
                  var16 = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, var8);
                  int var17 = EnchantmentHelper.getEnchantmentLevel(Enchantment.depthStrider.effectId, var8);
                  Method1760("Pr" + this.Method1761(var13) + var13, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Th" + this.Method1761(var14) + var14, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Dep" + this.Method1761(var17) + var17, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Fea" + this.Method1761(var15) + var15, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Unb" + this.Method1761(var16) + var16, var5, var9 + var6 - 65);
               }

               if (var8.getItem() instanceof ItemBow) {
                  var13 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var8);
                  var14 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var8);
                  var15 = EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var8);
                  var16 = EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var8);
                  Method1760("Pow" + this.Method1761(var13) + var13, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Pun" + this.Method1761(var14) + var14, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Fla" + this.Method1761(var15) + var15, var5, var9 + var6 - 65);
                  var9 += 4;
                  Method1760("Inf" + this.Method1761(var16) + var16, var5, var9 + var6 - 65);
               }

               if (var8.getRarity() == EnumRarity.EPIC) {
                  Method1760("§6§nGod", var5, var9 + var6 - 65);
               }
            }
         }
      }

      GL11.glPopMatrix();
   }

   private static void Method1759(String a, int a, int a) {
      GlStateManager.pushMatrix();
      GlStateManager.disableDepth();
      a *= 2;
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(a, (float)a, (float)(a * 2), Class681.Method1612(255));
      GlStateManager.enableDepth();
      GlStateManager.popMatrix();
   }

   private static void Method1760(String a, int a, int a) {
      String var3 = a;
      String[] var4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"};
      String[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String var8 = var5[var7];
         a = a.replaceAll("§" + var8, "");
      }

      GlStateManager.pushMatrix();
      GlStateManager.disableDepth();
      a *= 2;
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a + 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a - 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 + 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 - 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(var3, a, a * 2, Class681.Method1612(255));
      GlStateManager.enableDepth();
      GlStateManager.popMatrix();
   }

   private String Method1761(int a) {
      if (a != 1) {
         if (a == 2) {
            return "§a";
         }

         if (a == 3) {
            return "§3";
         }

         if (a == 4) {
            return "§4";
         }

         if (a >= 5) {
            return "§6";
         }
      }

      return "§8";
   }
}
