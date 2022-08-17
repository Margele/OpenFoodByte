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
      String a = Class492.Method2239();
      if (this.Field2237.getBooleanValue()) {
         GL11.glEnable(32823);
         GL11.glPolygonOffset(1.0F, -1000000.0F);
      }

      Iterator var3 = mc.theWorld.loadedEntityList.Method1383();
      if (var3.Method932()) {
         Object a = var3.Method933();
         Entity a = (Entity)a;
         if (a instanceof EntityItem) {
            EntityItem a = (EntityItem)a;
            double a = (double)ReflectionUtils.getRenderPartialTicks();
            double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
            double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
            double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
            String a = this.Method2286(a.getEntityItem());
            String a = this.Field2235.getBooleanValue() ? " §rx" + a.getEntityItem().stackSize : "";
            if (this.Method237(a.getEntityItem())) {
               this.Method2287(a, a + a, a, a, a, this.Field2238.getFloatValue().intValue());
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
         Item a = a.getItem();
         int a = Item.getIdFromItem(a);
         if (!a.hasDisplayName() && a != Item.getIdFromItem(Items.golden_apple) && (a != Item.getIdFromItem(Items.skull) || a.getItemDamage() != 3) && a != Item.getIdFromItem(Items.enchanted_book) && a != Item.getIdFromItem(Items.diamond_sword) && a != Item.getIdFromItem(Items.diamond_helmet) && a != Item.getIdFromItem(Items.diamond_chestplate) && a != Item.getIdFromItem(Items.diamond_leggings) && a != Item.getIdFromItem(Items.diamond_boots) && a != Item.getIdFromItem(Items.tnt_minecart) && a != Item.getIdFromItem(Items.saddle) && a != Item.getIdFromItem(Items.ender_pearl) && a != Item.getIdFromItem(Items.ender_eye) && a != Item.getIdFromItem(Items.fire_charge) && a != Item.getIdFromItem(Items.slime_ball) && a != Item.getIdFromItem(Items.potionitem) && a != Item.getIdFromItem(Items.magma_cream) && a != Item.getIdFromItem(Items.golden_carrot) && a != Item.getIdFromItem(Items.diamond) && a != Item.getIdFromItem(Items.blaze_rod) && a != Item.getIdFromItem(Items.gold_ingot) && a != Item.getIdFromItem(Items.iron_ingot) && a != Item.getIdFromItem(Items.clock) && a != 338 && a != 145 && a != 84 && a != 111) {
            return false;
         }
      }

      return true;
   }

   private String Method2286(ItemStack a) {
      Class492.Method2239();
      Item a = a.getItem();
      int a = Item.getIdFromItem(a);
      String a = "";
      if (a == Item.getIdFromItem(Items.golden_apple) && a.getRarity() == EnumRarity.EPIC) {
         return "§6§lNotch";
      } else {
         if (a == Item.getIdFromItem(Items.diamond) || a == Item.getIdFromItem(Items.diamond_sword) || a == Item.getIdFromItem(Items.diamond_helmet) || a == Item.getIdFromItem(Items.diamond_chestplate) || a == Item.getIdFromItem(Items.diamond_leggings) || a == Item.getIdFromItem(Items.diamond_boots)) {
            a = "§b";
         }

         if (a == Item.getIdFromItem(Items.blaze_rod)) {
            a = "§6";
         }

         if (a == Item.getIdFromItem(Items.potionitem)) {
            a = "§7";
         }

         int a;
         int a;
         if (a.getItem() instanceof ItemEnchantedBook) {
            NBTTagList a = Items.enchanted_book.getEnchantments(a);
            a = 0;
            if (a < a.tagCount()) {
               a = a.getCompoundTagAt(a).getShort("id");
               int a = a.getCompoundTagAt(a).getShort("lvl");
               if (a == Enchantment.sharpness.effectId && a >= 1 || a == Enchantment.fireAspect.effectId || a == Enchantment.efficiency.effectId && a >= 3 || a == Enchantment.fortune.effectId || a == Enchantment.featherFalling.effectId && a >= 3 || a == Enchantment.protection.effectId || a == Enchantment.punch.effectId || a == Enchantment.flame.effectId || a == Enchantment.infinity.effectId || a == Enchantment.depthStrider.effectId) {
                  a = "§9";
               }

               ++a;
            }
         }

         if (a == Item.getIdFromItem(Items.diamond_sword)) {
            int a = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a);
            a = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a);
            a = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, a);
            if (a == 1) {
               a = "§7";
            }

            if (a == 2) {
               a = "§8";
            }

            if (a == 3) {
               a = "§e";
            }

            if (a >= 4) {
               a = "§c";
            }

            if (a >= 1) {
               a = "§4";
            }

            if (a >= 1 && a >= 3) {
               a = "§4§n";
            }
         }

         if (a == Item.getIdFromItem(Items.ender_pearl) || a == Item.getIdFromItem(Items.ender_eye) || a == Item.getIdFromItem(Items.magma_cream)) {
            a = "§c§l";
         }

         String a = Pattern.compile("(?i)§[0-9A-FK-OR]").matcher(a.getDisplayName()).replaceAll("");
         return a + a.getDisplayName();
      }
   }

   protected void Method2287(EntityItem a, String a, double a, double a, double a, int a) {
      Class492.Method2239();
      double a = a.getDistanceSqToEntity(mc.getRenderManager().livingPlayer);
      if (a <= (double)(a * a)) {
         FontRenderer a = mc.fontRendererObj;
         float a = 1.6F;
         float a = 0.016666668F * a;
         GlStateManager.pushMatrix();
         GlStateManager.translate((float)a + 0.0F, (float)a + a.height + 0.5F, (float)a);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         if (ModuleManager.getModule(Perspective.class).getState()) {
            GL11.glRotatef(-Perspective.Field2200, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(Perspective.Field2201, 1.0F, 0.0F, 0.0F);
         }

         GL11.glRotatef(-mc.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(mc.gameSettings.thirdPersonView == 2 ? -mc.getRenderManager().playerViewX : mc.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
         GlStateManager.scale(-a, -a, a);
         GlStateManager.depthMask(false);
         GlStateManager.disableDepth();
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         Tessellator a = Tessellator.getInstance();
         WorldRenderer a = a.getWorldRenderer();
         int a = -2;
         int a = a.getStringWidth(a) / 2;
         GlStateManager.disableTexture2D();
         a.begin(7, DefaultVertexFormats.POSITION_COLOR);
         a.pos((double)(-a - 1), (double)(-1 + a), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         a.pos((double)(-a - 1), (double)(8 + a), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         a.pos((double)(a + 1), (double)(8 + a), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         a.pos((double)(a + 1), (double)(-1 + a), 0.0).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
         a.draw();
         GlStateManager.enableTexture2D();
         a.drawString(a, -a.getStringWidth(a) / 2, a, 553648127);
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
         a.drawString(a, -a.getStringWidth(a) / 2, a, -1);
         GlStateManager.disableBlend();
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.popMatrix();
      }

   }
}
