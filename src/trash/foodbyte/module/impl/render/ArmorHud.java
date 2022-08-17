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
      ScaledResolution a = new ScaledResolution(mc);
      this.Method1558(a);
   }

   private void Method1558(ScaledResolution a) {
      GL11.glPushMatrix();
      Class492.Method2239();
      ArrayList a = new ArrayList();
      boolean a = mc.thePlayer.isEntityAlive() && mc.thePlayer.isInsideOfMaterial(Material.water);
      int a = a.getScaledWidth() / 2 - 6;
      int a = a.getScaledHeight();
      int a = 3;
      ItemStack a = mc.thePlayer.inventory.armorInventory[a];
      a.Method2530(a);
      --a;
      if (mc.thePlayer.getCurrentEquippedItem() != null) {
         a.Method2530(mc.thePlayer.getCurrentEquippedItem());
      }

      Iterator var18 = a.Method1383();
      if (var18.Method932()) {
         a = (ItemStack)var18.Method933();
         if (mc.theWorld != null) {
            a += 16;
            RenderHelper.enableGUIStandardItemLighting();
            mc.getRenderItem().renderItemAndEffectIntoGUI(a, a, a - 65);
            mc.getRenderItem().renderItemOverlays(mc.fontRendererObj, a, a, a - 65);
            RenderHelper.disableStandardItemLighting();
            int a = 1;
            int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a);
            int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a);
            int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a);
            Method1760("Sh" + this.Method1761(a) + a, a, a + a - 65);
            a += 4;
            Method1760("Fir" + this.Method1761(a) + a, a, a + a - 65);
            a += 4;
            Method1760("Kb" + this.Method1761(a) + a, a, a + a - 65);
            if (!(a.getItem() instanceof ItemBook)) {
               int a;
               int a;
               int a;
               int a;
               if (a.getItem() instanceof ItemTool) {
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, a);
                  Method1760("Ef" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("For" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Tou" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Unb" + this.Method1761(a) + a, a, a + a - 65);
               }

               if (a.getItem() instanceof ItemArmor) {
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.thorns.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.featherFalling.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, a);
                  int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.depthStrider.effectId, a);
                  Method1760("Pr" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Th" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Dep" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Fea" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Unb" + this.Method1761(a) + a, a, a + a - 65);
               }

               if (a.getItem() instanceof ItemBow) {
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, a);
                  a = EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, a);
                  Method1760("Pow" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Pun" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Fla" + this.Method1761(a) + a, a, a + a - 65);
                  a += 4;
                  Method1760("Inf" + this.Method1761(a) + a, a, a + a - 65);
               }

               if (a.getRarity() == EnumRarity.EPIC) {
                  Method1760("§6§nGod", a, a + a - 65);
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
      String a = a;
      String[] a = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"};
      String[] var5 = a;
      int var6 = a.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String a = var5[var7];
         a = a.replaceAll("§" + a, "");
      }

      GlStateManager.pushMatrix();
      GlStateManager.disableDepth();
      a *= 2;
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a + 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a - 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 + 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 - 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2, Class681.Method1612(255));
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
