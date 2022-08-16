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
import trash.foodbyte.reflections.ReflectionUtils;
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
    public void Method802(EventRender3D a2) {
        Iterator iterator;
        String a3 = Class492.Method2239();
        if (this.Field2237.getBooleanValue().booleanValue()) {
            GL11.glEnable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)-1000000.0f);
        }
        if ((iterator = ItemTag.mc.theWorld.loadedEntityList.Method1383()).Method932()) {
            Object a4 = iterator.Method933();
            Entity a5 = (Entity)a4;
            if (a5 instanceof EntityItem) {
                String a6;
                EntityItem a7 = (EntityItem)a5;
                double a8 = ReflectionUtils.getRenderPartialTicks();
                double a9 = a7.lastTickPosX + (a7.posX - a7.lastTickPosX) * a8 - ReflectionUtils.getRenderPosX();
                double a10 = a7.lastTickPosY + (a7.posY - a7.lastTickPosY) * a8 - ReflectionUtils.getRenderPosY();
                double a11 = a7.lastTickPosZ + (a7.posZ - a7.lastTickPosZ) * a8 - ReflectionUtils.getRenderPosZ();
                String a12 = this.Method2286(a7.getEntityItem());
                String string = a6 = this.Field2235.getBooleanValue() != false ? " \u00a7rx" + a7.getEntityItem().stackSize : "";
                if (this.Method237(a7.getEntityItem())) {
                    this.Method2287(a7, a12 + a6, a9, a10, a11, this.Field2238.getFloatValue().intValue());
                }
            }
        }
        if (this.Field2237.getBooleanValue().booleanValue()) {
            GL11.glPolygonOffset((float)1.0f, (float)1000000.0f);
            GL11.glDisable((int)32823);
        }
    }

    private boolean Method237(ItemStack a2) {
        if (this.Field2236.getBooleanValue().booleanValue()) {
            Item a3 = a2.getItem();
            int a4 = Item.getIdFromItem((Item)a3);
            if (!(a2.hasDisplayName() || a4 == Item.getIdFromItem((Item)Items.golden_apple) || a4 == Item.getIdFromItem((Item)Items.skull) && a2.getItemDamage() == 3 || a4 == Item.getIdFromItem((Item)Items.enchanted_book) || a4 == Item.getIdFromItem((Item)Items.diamond_sword) || a4 == Item.getIdFromItem((Item)Items.diamond_helmet) || a4 == Item.getIdFromItem((Item)Items.diamond_chestplate) || a4 == Item.getIdFromItem((Item)Items.diamond_leggings) || a4 == Item.getIdFromItem((Item)Items.diamond_boots) || a4 == Item.getIdFromItem((Item)Items.tnt_minecart) || a4 == Item.getIdFromItem((Item)Items.saddle) || a4 == Item.getIdFromItem((Item)Items.ender_pearl) || a4 == Item.getIdFromItem((Item)Items.ender_eye) || a4 == Item.getIdFromItem((Item)Items.fire_charge) || a4 == Item.getIdFromItem((Item)Items.slime_ball) || a4 == Item.getIdFromItem((Item)Items.potionitem) || a4 == Item.getIdFromItem((Item)Items.magma_cream) || a4 == Item.getIdFromItem((Item)Items.golden_carrot) || a4 == Item.getIdFromItem((Item)Items.diamond) || a4 == Item.getIdFromItem((Item)Items.blaze_rod) || a4 == Item.getIdFromItem((Item)Items.gold_ingot) || a4 == Item.getIdFromItem((Item)Items.iron_ingot) || a4 == Item.getIdFromItem((Item)Items.clock) || a4 == 338 || a4 == 145 || a4 == 84 || a4 == 111)) {
                return false;
            }
        }
        return true;
    }

    private String Method2286(ItemStack a2) {
        int a3;
        Object a4;
        int a5;
        String a6;
        Item a7 = a2.getItem();
        int a8 = Item.getIdFromItem((Item)a7);
        String string = "";
        String a9 = Class492.Method2239();
        if (a8 == Item.getIdFromItem((Item)Items.golden_apple) && a2.getRarity() == EnumRarity.EPIC) {
            return "\u00a76\u00a7lNotch";
        }
        if (a8 == Item.getIdFromItem((Item)Items.diamond) || a8 == Item.getIdFromItem((Item)Items.diamond_sword) || a8 == Item.getIdFromItem((Item)Items.diamond_helmet) || a8 == Item.getIdFromItem((Item)Items.diamond_chestplate) || a8 == Item.getIdFromItem((Item)Items.diamond_leggings) || a8 == Item.getIdFromItem((Item)Items.diamond_boots)) {
            a6 = "\u00a7b";
        }
        if (a8 == Item.getIdFromItem((Item)Items.blaze_rod)) {
            a6 = "\u00a76";
        }
        if (a8 == Item.getIdFromItem((Item)Items.potionitem)) {
            a6 = "\u00a77";
        }
        if (a2.getItem() instanceof ItemEnchantedBook && (a5 = 0) < (a4 = Items.enchanted_book.getEnchantments(a2)).tagCount()) {
            a3 = a4.getCompoundTagAt(a5).getShort("id");
            short a10 = a4.getCompoundTagAt(a5).getShort("lvl");
            if (a3 == Enchantment.sharpness.effectId && a10 >= 1 || a3 == Enchantment.fireAspect.effectId || a3 == Enchantment.efficiency.effectId && a10 >= 3 || a3 == Enchantment.fortune.effectId || a3 == Enchantment.featherFalling.effectId && a10 >= 3 || a3 == Enchantment.protection.effectId || a3 == Enchantment.punch.effectId || a3 == Enchantment.flame.effectId || a3 == Enchantment.infinity.effectId || a3 == Enchantment.depthStrider.effectId) {
                a6 = "\u00a79";
            }
            ++a5;
        }
        if (a8 == Item.getIdFromItem((Item)Items.diamond_sword)) {
            int a11 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a2);
            a5 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a2);
            a3 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.knockback.effectId, (ItemStack)a2);
            if (a11 == 1) {
                a6 = "\u00a77";
            }
            if (a11 == 2) {
                a6 = "\u00a78";
            }
            if (a11 == 3) {
                a6 = "\u00a7e";
            }
            if (a11 >= 4) {
                a6 = "\u00a7c";
            }
            if (a5 >= 1) {
                a6 = "\u00a74";
            }
            if (a5 >= 1 && a11 >= 3) {
                a6 = "\u00a74\u00a7n";
            }
        }
        if (a8 == Item.getIdFromItem((Item)Items.ender_pearl) || a8 == Item.getIdFromItem((Item)Items.ender_eye) || a8 == Item.getIdFromItem((Item)Items.magma_cream)) {
            a6 = "\u00a7c\u00a7l";
        }
        a4 = Pattern.compile((String)"(?i)\u00a7[0-9A-FK-OR]").matcher((CharSequence)a2.getDisplayName()).replaceAll("");
        return a6 + a2.getDisplayName();
    }

    /*
     * WARNING - void declaration
     */
    protected void Method2287(EntityItem a2, String a3, double a4, double a5, double a6, int a7) {
        void a8;
        double d = a2.getDistanceSqToEntity(ItemTag.mc.getRenderManager().livingPlayer);
        String a9 = Class492.Method2239();
        if (a8 <= (double)(a7 * a7)) {
            FontRenderer a10 = ItemTag.mc.fontRendererObj;
            float a11 = 1.6f;
            float a12 = 0.016666668f * a11;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)((float)a4 + 0.0f), (float)((float)a5 + a2.height + 0.5f), (float)((float)a6));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            if (ModuleManager.getModule(Perspective.class).getState()) {
                GL11.glRotatef((float)(-Perspective.Field2200), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)Perspective.Field2201, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glRotatef((float)(-ItemTag.mc.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(ItemTag.mc.gameSettings.thirdPersonView == 2 ? -ItemTag.mc.getRenderManager().playerViewX : ItemTag.mc.getRenderManager().playerViewX), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.scale((float)(-a12), (float)(-a12), (float)a12);
            GlStateManager.depthMask((boolean)false);
            GlStateManager.disableDepth();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            Tessellator a13 = Tessellator.getInstance();
            WorldRenderer a14 = a13.getWorldRenderer();
            int a15 = -2;
            int a16 = a10.getStringWidth(a3) / 2;
            GlStateManager.disableTexture2D();
            a14.begin(7, DefaultVertexFormats.POSITION_COLOR);
            a14.pos((double)(-a16 - 1), (double)(-1 + a15), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a14.pos((double)(-a16 - 1), (double)(8 + a15), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a14.pos((double)(a16 + 1), (double)(8 + a15), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a14.pos((double)(a16 + 1), (double)(-1 + a15), 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            a13.draw();
            GlStateManager.enableTexture2D();
            a10.drawString(a3, -a10.getStringWidth(a3) / 2, a15, 0x20FFFFFF);
            GlStateManager.enableDepth();
            GlStateManager.depthMask((boolean)true);
            a10.drawString(a3, -a10.getStringWidth(a3) / 2, a15, -1);
            GlStateManager.disableBlend();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.popMatrix();
        }
    }
}