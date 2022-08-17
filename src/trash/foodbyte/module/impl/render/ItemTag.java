package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.util.Iterator;
import java.util.regex.Pattern;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class ItemTag extends Module {
   public BooleanValue Field2235 = new BooleanValue("ItemTag", "Quantity", true, "显示掉落物数量多少个");
   public BooleanValue Field2236 = new BooleanValue("ItemTag", "UHC", false, "忽略在UHC中的垃圾物品");
   public BooleanValue Field2237 = new BooleanValue("ItemTag", "ThroughWalls", true, "标签是否透过墙体能看见");
   public FloatValue Field2238 = new FloatValue("ItemTag", "Range", 50.0, 5.0, 80.0, 1.0, "显示多少范围内的物品标签");

   public ItemTag() {
      super("ItemTag", "Item Tag", Category.RENDER);
   }

   public String getDescription() {
      return "掉落物标签";
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      String var2 = Class492.Method2239();
      if (this.Field2237.getBooleanValue()) {
         GL11.glEnable(32823);
         GL11.glPolygonOffset(1.0F, -1000000.0F);
      }

      Iterator var3 = mc.theWorld.loadedEntityList.Method1383();
      if (var3.Method932()) {
         Object var4 = var3.Method933();
         Entity var5 = (Entity)var4;
         if (var5 instanceof EntityItem) {
            EntityItem var6 = (EntityItem)var5;
            double var7 = (double)ReflectionUtils.getRenderPartialTicks();
            double var9 = var6.lastTickPosX + (var6.posX - var6.lastTickPosX) * var7 - ReflectionUtils.getRenderPosX();
            double var11 = var6.lastTickPosY + (var6.posY - var6.lastTickPosY) * var7 - ReflectionUtils.getRenderPosY();
            double var13 = var6.lastTickPosZ + (var6.posZ - var6.lastTickPosZ) * var7 - ReflectionUtils.getRenderPosZ();
            String var15 = this.Method2286(var6.getEntityItem());
            String var16 = this.Field2235.getBooleanValue() ? " §rx" + var6.getEntityItem().stackSize : "";
            if (this.Method237(var6.getEntityItem())) {
               this.Method2287(var6, var15 + var16, var9, var11, var13, this.Field2238.getFloatValue().intValue());
            }
         }
      }

      if (this.Field2237.getBooleanValue()) {
         GL11.glPolygonOffset(1.0F, 1000000.0F);
         GL11.glDisable(32823);
      }

   }

   private boolean Method237(ItemStack a) {
      if (this.Field2236.getBooleanValue()) {
         Item var2 = a.getItem();
         int var3 = Item.getIdFromItem(var2);
         if (!a.hasDisplayName() && var3 != Item.getIdFromItem(Items.golden_apple) && (var3 != Item.getIdFromItem(Items.skull) || a.getItemDamage() != 3) && var3 != Item.getIdFromItem(Items.enchanted_book) && var3 != Item.getIdFromItem(Items.diamond_sword) && var3 != Item.getIdFromItem(Items.diamond_helmet) && var3 != Item.getIdFromItem(Items.diamond_chestplate) && var3 != Item.getIdFromItem(Items.diamond_leggings) && var3 != Item.getIdFromItem(Items.diamond_boots) && var3 != Item.getIdFromItem(Items.tnt_minecart) && var3 != Item.getIdFromItem(Items.saddle) && var3 != Item.getIdFromItem(Items.ender_pearl) && var3 != Item.getIdFromItem(Items.ender_eye) && var3 != Item.getIdFromItem(Items.fire_charge) && var3 != Item.getIdFromItem(Items.slime_ball) && var3 != Item.getIdFromItem(Items.potionitem) && var3 != Item.getIdFromItem(Items.magma_cream) && var3 != Item.getIdFromItem(Items.golden_carrot) && var3 != Item.getIdFromItem(Items.diamond) && var3 != Item.getIdFromItem(Items.blaze_rod) && var3 != Item.getIdFromItem(Items.gold_ingot) && var3 != Item.getIdFromItem(Items.iron_ingot) && var3 != Item.getIdFromItem(Items.clock) && var3 != 338 && var3 != 145 && var3 != 84 && var3 != 111) {
            return false;
         }
      }

      return true;
   }

   private String Method2286(ItemStack a) {
      Class492.Method2239();
      Item var3 = a.getItem();
      int var4 = Item.getIdFromItem(var3);
      String var5 = "";
      if (var4 == Item.getIdFromItem(Items.golden_apple) && a.getRarity() == EnumRarity.EPIC) {
         return "§6§lNotch";
      } else {
         if (var4 == Item.getIdFromItem(Items.diamond) || var4 == Item.getIdFromItem(Items.diamond_sword) || var4 == Item.getIdFromItem(Items.diamond_helmet) || var4 == Item.getIdFromItem(Items.diamond_chestplate) || var4 == Item.getIdFromItem(Items.diamond_leggings) || var4 == Item.getIdFromItem(Items.diamond_boots)) {
            var5 = "§b";
         }

         if (var4 == Item.getIdFromItem(Items.blaze_rod)) {
            var5 = "§6";
         }

         if (var4 == Item.getIdFromItem(Items.potionitem)) {
            var5 = "§7";
         }

         int var7;
         int var8;
         if (a.getItem() instanceof ItemEnchantedBook) {
            NBTTagList var6 = Items.enchanted_book.getEnchantments(a);
            var7 = 0;
            if (var7 < var6.tagCount()) {
               var8 = var6.getCompoundTagAt(var7).getShort("id");
               short var9 = var6.getCompoundTagAt(var7).getShort("lvl");
               if (var8 == Enchantment.sharpness.effectId && var9 >= 1 || var8 == Enchantment.fireAspect.effectId || var8 == Enchantment.efficiency.effectId && var9 >= 3 || var8 == Enchantment.fortune.effectId || var8 == Enchantment.featherFalling.effectId && var9 >= 3 || var8 == Enchantment.protection.effectId || var8 == Enchantment.punch.effectId || var8 == Enchantment.flame.effectId || var8 == Enchantment.infinity.effectId || var8 == Enchantment.depthStrider.effectId) {
                  var5 = "§9";
               }

               ++var7;
            }
         }

         if (var4 == Item.getIdFromItem(Items.diamond_sword)) {
            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a);
            var7 = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a);
            var8 = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a);
            if (var10 == 1) {
               var5 = "§7";
            }

            if (var10 == 2) {
               var5 = "§8";
            }

            if (var10 == 3) {
               var5 = "§e";
            }

            if (var10 >= 4) {
               var5 = "§c";
            }

            if (var7 >= 1) {
               var5 = "§4";
            }

            if (var7 >= 1 && var10 >= 3) {
               var5 = "§4§n";
            }
         }

         if (var4 == Item.getIdFromItem(Items.ender_pearl) || var4 == Item.getIdFromItem(Items.ender_eye) || var4 == Item.getIdFromItem(Items.magma_cream)) {
            var5 = "§c§l";
         }

         String var11 = Pattern.compile("(?i)§[0-9A-FK-OR]").matcher(a.getDisplayName()).replaceAll("");
         return var5 + a.getDisplayName();
      }
   }

   protected void Method2287(EntityItem a, String a, double a, double a, double a, int a) {
      Class492.Method2239();
      double var11 = a.getDistanceSqToEntity(mc.getRenderManager().livingPlayer);
      if (var11 <= (double)(a * a)) {
         FontRenderer var13 = mc.fontRendererObj;
         float var14 = 1.6F;
         float var15 = 0.016666668F * var14;
         GlStateManager.pushMatrix();
         GlStateManager.translate((float)a + 0.0F, (float)a + a.height + 0.5F, (float)a);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         if (ModuleManager.getModule(Perspective.class).getState()) {
            GL11.glRotatef(-Perspective.Field2200, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(Perspective.Field2201, 1.0F, 0.0F, 0.0F);
         }

         GL11.glRotatef(-mc.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(mc.gameSettings.thirdPersonView == 2 ? -mc.getRenderManager().playerViewX : mc.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
         GlStateManager.scale(-var15, -var15, var15);
         GlStateManager.depthMask(false);
         GlStateManager.disableDepth();
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         Tessellator var16 = Tessellator.getInstance();
         WorldRenderer var17 = var16.getWorldRenderer();
         byte var18 = -2;
         int var19 = var13.getStringWidth(a) / 2;
         GlStateManager.disableTexture2D();
         var17.begin(7, DefaultVertexFormats.POSITION_COLOR);
         var17.pos((double)(-var19 - 1), (double)(-1 + var18), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         var17.pos((double)(-var19 - 1), (double)(8 + var18), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         var17.pos((double)(var19 + 1), (double)(8 + var18), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         var17.pos((double)(var19 + 1), (double)(-1 + var18), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         var16.draw();
         GlStateManager.enableTexture2D();
         var13.drawString(a, -var13.getStringWidth(a) / 2, var18, 553648127);
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
         var13.drawString(a, -var13.getStringWidth(a) / 2, var18, -1);
         GlStateManager.disableBlend();
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.popMatrix();
      }

   }
}
