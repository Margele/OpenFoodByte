/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.regex.Pattern
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.init.Items
 *  net.minecraft.item.EnumRarity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemEnchantedBook
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.opengl.GL11
 */
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
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.render.Perspective;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class ItemTag
extends Module {
    public BooleanValue Field2235 = new BooleanValue("ItemTag", "Quantity", (Boolean)true, "\u663e\u793a\u6389\u843d\u7269\u6570\u91cf\u591a\u5c11\u4e2a");
    public BooleanValue Field2236 = new BooleanValue("ItemTag", "UHC", (Boolean)false, "\u5ffd\u7565\u5728UHC\u4e2d\u7684\u5783\u573e\u7269\u54c1");
    public BooleanValue Field2237 = new BooleanValue("ItemTag", "ThroughWalls", (Boolean)true, "\u6807\u7b7e\u662f\u5426\u900f\u8fc7\u5899\u4f53\u80fd\u770b\u89c1");
    public FloatValue Field2238 = new FloatValue("ItemTag", "Range", 50.0, 5.0, 80.0, 1.0, "\u663e\u793a\u591a\u5c11\u8303\u56f4\u5185\u7684\u7269\u54c1\u6807\u7b7e");

    public ItemTag() {
        super("ItemTag", "Item Tag", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u6389\u843d\u7269\u6807\u7b7e";
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        Iterator iterator;
        String a2 = Class492.Method2239();
        if (this.Field2237.Method2509().booleanValue()) {
            GL11.glEnable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)-1000000.0f);
        }
        if ((iterator = ItemTag.mc.theWorld.loadedEntityList.Method1383()).Method932()) {
            Object a3 = iterator.Method933();
            Entity a4 = (Entity)a3;
            if (a4 instanceof EntityItem) {
                String a5;
                EntityItem a6 = (EntityItem)a4;
                double a7 = ReflectionUtils.Method2587();
                double a8 = a6.lastTickPosX + (a6.posX - a6.lastTickPosX) * a7 - ReflectionUtils.Method2591();
                double a9 = a6.lastTickPosY + (a6.posY - a6.lastTickPosY) * a7 - ReflectionUtils.Method2592();
                double a10 = a6.lastTickPosZ + (a6.posZ - a6.lastTickPosZ) * a7 - ReflectionUtils.Method2593();
                String a11 = this.Method2286(a6.getEntityItem());
                String string = a5 = this.Field2235.Method2509() != false ? " \u00a7rx" + a6.getEntityItem().stackSize : "";
                if (this.Method237(a6.getEntityItem())) {
                    this.Method2287(a6, a11 + a5, a8, a9, a10, this.Field2238.Method2744().intValue());
                }
            }
        }
        if (this.Field2237.Method2509().booleanValue()) {
            GL11.glPolygonOffset((float)1.0f, (float)1000000.0f);
            GL11.glDisable((int)32823);
        }
    }

    private boolean Method237(ItemStack a) {
        if (this.Field2236.Method2509().booleanValue()) {
            Item a2 = a.getItem();
            int a3 = Item.getIdFromItem((Item)a2);
            if (!(a.hasDisplayName() || a3 == Item.getIdFromItem((Item)Items.golden_apple) || a3 == Item.getIdFromItem((Item)Items.skull) && a.getItemDamage() == 3 || a3 == Item.getIdFromItem((Item)Items.enchanted_book) || a3 == Item.getIdFromItem((Item)Items.diamond_sword) || a3 == Item.getIdFromItem((Item)Items.diamond_helmet) || a3 == Item.getIdFromItem((Item)Items.diamond_chestplate) || a3 == Item.getIdFromItem((Item)Items.diamond_leggings) || a3 == Item.getIdFromItem((Item)Items.diamond_boots) || a3 == Item.getIdFromItem((Item)Items.tnt_minecart) || a3 == Item.getIdFromItem((Item)Items.saddle) || a3 == Item.getIdFromItem((Item)Items.ender_pearl) || a3 == Item.getIdFromItem((Item)Items.ender_eye) || a3 == Item.getIdFromItem((Item)Items.fire_charge) || a3 == Item.getIdFromItem((Item)Items.slime_ball) || a3 == Item.getIdFromItem((Item)Items.potionitem) || a3 == Item.getIdFromItem((Item)Items.magma_cream) || a3 == Item.getIdFromItem((Item)Items.golden_carrot) || a3 == Item.getIdFromItem((Item)Items.diamond) || a3 == Item.getIdFromItem((Item)Items.blaze_rod) || a3 == Item.getIdFromItem((Item)Items.gold_ingot) || a3 == Item.getIdFromItem((Item)Items.iron_ingot) || a3 == Item.getIdFromItem((Item)Items.clock) || a3 == 338 || a3 == 145 || a3 == 84 || a3 == 111)) {
                return false;
            }
        }
        return true;
    }

    private String Method2286(ItemStack a) {
        int a2;
        Object a3;
        int a4;
        String a5;
        Item a6 = a.getItem();
        int a7 = Item.getIdFromItem((Item)a6);
        String string = "";
        String a8 = Class492.Method2239();
        if (a7 == Item.getIdFromItem((Item)Items.golden_apple) && a.getRarity() == EnumRarity.EPIC) {
            return "\u00a76\u00a7lNotch";
        }
        if (a7 == Item.getIdFromItem((Item)Items.diamond) || a7 == Item.getIdFromItem((Item)Items.diamond_sword) || a7 == Item.getIdFromItem((Item)Items.diamond_helmet) || a7 == Item.getIdFromItem((Item)Items.diamond_chestplate) || a7 == Item.getIdFromItem((Item)Items.diamond_leggings) || a7 == Item.getIdFromItem((Item)Items.diamond_boots)) {
            a5 = "\u00a7b";
        }
        if (a7 == Item.getIdFromItem((Item)Items.blaze_rod)) {
            a5 = "\u00a76";
        }
        if (a7 == Item.getIdFromItem((Item)Items.potionitem)) {
            a5 = "\u00a77";
        }
        if (a.getItem() instanceof ItemEnchantedBook && (a4 = 0) < (a3 = Items.enchanted_book.getEnchantments(a)).tagCount()) {
            a2 = a3.getCompoundTagAt(a4).getShort("id");
            short a9 = a3.getCompoundTagAt(a4).getShort("lvl");
            if (a2 == Enchantment.sharpness.effectId && a9 >= 1 || a2 == Enchantment.fireAspect.effectId || a2 == Enchantment.efficiency.effectId && a9 >= 3 || a2 == Enchantment.fortune.effectId || a2 == Enchantment.featherFalling.effectId && a9 >= 3 || a2 == Enchantment.protection.effectId || a2 == Enchantment.punch.effectId || a2 == Enchantment.flame.effectId || a2 == Enchantment.infinity.effectId || a2 == Enchantment.depthStrider.effectId) {
                a5 = "\u00a79";
            }
            ++a4;
        }
        if (a7 == Item.getIdFromItem((Item)Items.diamond_sword)) {
            int a10 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a);
            a4 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a);
            a2 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.knockback.effectId, (ItemStack)a);
            if (a10 == 1) {
                a5 = "\u00a77";
            }
            if (a10 == 2) {
                a5 = "\u00a78";
            }
            if (a10 == 3) {
                a5 = "\u00a7e";
            }
            if (a10 >= 4) {
                a5 = "\u00a7c";
            }
            if (a4 >= 1) {
                a5 = "\u00a74";
            }
            if (a4 >= 1 && a10 >= 3) {
                a5 = "\u00a74\u00a7n";
            }
        }
        if (a7 == Item.getIdFromItem((Item)Items.ender_pearl) || a7 == Item.getIdFromItem((Item)Items.ender_eye) || a7 == Item.getIdFromItem((Item)Items.magma_cream)) {
            a5 = "\u00a7c\u00a7l";
        }
        a3 = Pattern.compile((String)"(?i)\u00a7[0-9A-FK-OR]").matcher((CharSequence)a.getDisplayName()).replaceAll("");
        return a5 + a.getDisplayName();
    }

    /*
     * WARNING - void declaration
     */
    protected void Method2287(EntityItem a, String a2, double a3, double a4, double a5, int a6) {
        void a7;
        double d = a.getDistanceSqToEntity(ItemTag.mc.getRenderManager().livingPlayer);
        String a8 = Class492.Method2239();
        if (a7 <= (double)(a6 * a6)) {
            FontRenderer a9 = ItemTag.mc.fontRendererObj;
            float a10 = 1.6f;
            float a11 = 0.016666668f * a10;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)((float)a3 + 0.0f), (float)((float)a4 + a.height + 0.5f), (float)((float)a5));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            if (ModuleManager.getModule(Perspective.class).getState()) {
                GL11.glRotatef((float)(-Perspective.Field2200), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)Perspective.Field2201, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glRotatef((float)(-ItemTag.mc.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(ItemTag.mc.gameSettings.thirdPersonView == 2 ? -ItemTag.mc.getRenderManager().playerViewX : ItemTag.mc.getRenderManager().playerViewX), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.scale((float)(-a11), (float)(-a11), (float)a11);
            GlStateManager.depthMask((boolean)false);
            GlStateManager.disableDepth();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            Tessellator a12 = Tessellator.getInstance();
            WorldRenderer a13 = a12.getWorldRenderer();
            int a14 = -2;
            int a15 = a9.getStringWidth(a2) / 2;
            GlStateManager.disableTexture2D();
            a13.begin(7, DefaultVertexFormats.POSITION_COLOR);
            a13.pos((double)(-a15 - 1), (double)(-1 + a14), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a13.pos((double)(-a15 - 1), (double)(8 + a14), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a13.pos((double)(a15 + 1), (double)(8 + a14), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a13.pos((double)(a15 + 1), (double)(-1 + a14), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a12.draw();
            GlStateManager.enableTexture2D();
            a9.drawString(a2, -a9.getStringWidth(a2) / 2, a14, 0x20FFFFFF);
            GlStateManager.enableDepth();
            GlStateManager.depthMask((boolean)true);
            a9.drawString(a2, -a9.getStringWidth(a2) / 2, a14, -1);
            GlStateManager.disableBlend();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.popMatrix();
        }
    }
}