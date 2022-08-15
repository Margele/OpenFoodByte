/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.boss.EntityDragon
 *  net.minecraft.entity.monster.EntityGhast
 *  net.minecraft.entity.monster.EntityIronGolem
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.monster.EntitySnowman
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityBat
 *  net.minecraft.entity.passive.EntitySquid
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemTool
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumChatFormatting
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class393;
import awsl.Class492;
import awsl.Class606;
import eventapi.EventTarget;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.render.Perspective;
import trash.foodbyte.module.impl.world.MurderMystery;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class NameTag
extends Module {
    public BooleanValue Field2223 = new BooleanValue("NameTag", "RemoveTag", (Boolean)true, "\u5220\u9664mc\u81ea\u5e26\u7684Tag");
    public BooleanValue Field2224 = new BooleanValue("NameTag", "Health", (Boolean)true, "\u8840\u91cf");
    public BooleanValue Field2225 = new BooleanValue("NameTag", "Dis", (Boolean)false, "\u8ddd\u79bb");
    public BooleanValue Field2226 = new BooleanValue("NameTag", "Armor", (Boolean)true, "\u88c5\u5907");
    public BooleanValue Field2227 = new BooleanValue("NameTag", "Effect", (Boolean)false, "\u836f\u6c34\u6548\u679c");
    public BooleanValue Field2228 = new BooleanValue("Nametag", "Player", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue Field2229 = new BooleanValue("Nametag", "Animals", (Boolean)false, "\u52a8\u7269");
    public BooleanValue Field2230 = new BooleanValue("Nametag", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue Field2231 = new BooleanValue("Nametag", "Invisibles", (Boolean)true, "\u9690\u8eab");
    public BooleanValue Field2232 = new BooleanValue("NameTag", "Antibot", (Boolean)false, "\u673a\u5668\u4eba");
    public FloatValue Field2233 = new FloatValue("NameTag", "Size", 1.0, 1.0, 5.0, 0.1, "\u6807\u7b7e\u5927\u5c0f");

    public NameTag() {
        super("NameTag", "Name Tag", Category.RENDER);
        this.setDescription("\u73a9\u5bb6\u6807\u7b7e\u900f\u89c6");
    }

    @EventTarget(value=3)
    public void Method802(EventRender3D a) {
        List a2 = NameTag.mc.theWorld.getLoadedEntityList();
        a2.sort(Comparator.comparingDouble(NameTag::Method2246));
        Collections.reverse((List)a2);
        Iterator iterator = a2.Method1383();
        while (iterator.Method932()) {
            Entity a3 = (Entity)iterator.Method933();
            if (!(a3 instanceof EntityLivingBase) || a3 instanceof EntityPlayerSP) continue;
            EntityLivingBase a4 = (EntityLivingBase)a3;
            if (AntiBot.Field2577.contains((Object)a3) && !Class305.Method697((Entity)a4) && !this.Field2232.getValue() || !this.Method965(a4)) continue;
            double a5 = ReflectionUtils.Method2587();
            double a6 = a4.lastTickPosX + (a4.posX - a4.lastTickPosX) * a5 - ReflectionUtils.Method2591();
            double a7 = a4.lastTickPosY + (a4.posY - a4.lastTickPosY) * a5 - ReflectionUtils.Method2592();
            double a8 = a4.lastTickPosZ + (a4.posZ - a4.lastTickPosZ) * a5 - ReflectionUtils.Method2593();
            this.Method2282(a4, a4.getName(), a6, a7, a8);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void Method2282(EntityLivingBase a, String a2, double a3, double a4, double a5) {
        Collection a6;
        Iterator a7;
        Iterator iterator;
        int a82;
        void a9;
        String a10;
        Iterator iterator2;
        float a11;
        ScaledResolution a12 = new ScaledResolution(mc);
        FontRenderer fontRenderer = NameTag.mc.fontRendererObj;
        float f = NameTag.mc.thePlayer.getDistanceToEntity((Entity)a) / 6.0f;
        String a13 = Class492.Method2239();
        if (a11 < 1.0f) {
            a11 = 1.0f;
        }
        a4 += a.isSneaking() ? 0.5 : 0.7;
        float a14 = a11 * this.Field2233.Method2746();
        a14 /= 100.0f;
        String a15 = a2 = a.getDisplayName().getFormattedText();
        String a16 = "";
        if (AntiBot.Field2577.contains((Object)a)) {
            a16 = "\u00a78[BOT] ";
        }
        a16 = "";
        String a17 = "";
        if (Class305.Method704((Entity)a)) {
            a17 = "\u00a7a[T] ";
        }
        a17 = "";
        String a18 = "";
        if (Class305.Method697((Entity)a)) {
            a18 = "\u00a7b[F] ";
        }
        String a19 = "";
        if (MurderMystery.Field2300.contains((Object)a)) {
            a19 = EnumChatFormatting.RED + "[Murder] ";
        }
        if (MurderMystery.Field2301.contains((Object)a)) {
            a19 = EnumChatFormatting.BLUE + "[Good] ";
        }
        String a20 = "";
        if (Class305.Method700((Entity)a)) {
            a20 = EnumChatFormatting.RED + "[Target] ";
        }
        String a21 = "";
        if (mc.getNetHandler().getPlayerInfo(a.getUniqueID()) != null) {
            a21 = " Ping-" + mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime();
        }
        String a22 = "";
        if (!GlobalModule.INSTANCE.Field3186.Field2823.isEmpty() && PermissionManager.canUseFeature("nametag") && (iterator2 = GlobalModule.INSTANCE.Field3186.Field2823.Method1383()).Method932()) {
            Class606 a23 = (Class606)iterator2.Method933();
            if (a.getName().equals((Object)a23.Field2841)) {
                if (a23.Field2838.equalsIgnoreCase("FoodByte")) {
                    a22 = "\u00a77(\u00a7d" + a23.Field2840 + "\u00a77)\u00a7r";
                }
                if (a23.Field2838.equalsIgnoreCase("PowerX")) {
                    a22 = "\u00a77(\u00a7b" + a23.Field2840 + "\u00a77)\u00a7r";
                }
                a22 = "\u00a77(\u00a72" + a23.Field2840 + "\u00a77)\u00a7r";
                if (a23.Field2847) {
                    if (GlobalModule.INSTANCE.Field3186.Field2827.Method3740() >= 5) {
                        if (a23.Field2838.equalsIgnoreCase("FoodByte")) {
                            a22 = ("\u00a77[\u00a7d" + a23.Field2840 + "\u00a77]\u00a7r").replace((CharSequence)a23.Field2840, (CharSequence)("\u00a7o" + a23.Field2840));
                        }
                        if (a23.Field2838.equalsIgnoreCase("PowerX")) {
                            a22 = ("\u00a77[\u00a7b" + a23.Field2840 + "\u00a77]\u00a7r").replace((CharSequence)a23.Field2840, (CharSequence)("\u00a7o" + a23.Field2840));
                        }
                        a22 = ("\u00a77[\u00a72" + a23.Field2840 + "\u00a77]\u00a7r").replace((CharSequence)a23.Field2840, (CharSequence)("\u00a7o" + a23.Field2840));
                    }
                    a22 = "";
                }
            }
        }
        String a24 = a16 + a19 + a20 + (Class305.Method697((Entity)a) ? a15 : a2) + a22;
        double a25 = a.getHealth();
        BigDecimal a26 = BigDecimal.valueOf((double)a.getHealth());
        a26 = a26.setScale(1, RoundingMode.HALF_UP);
        double a27 = a26.doubleValue();
        double a28 = BigDecimal.valueOf((double)a.getAbsorptionAmount()).setScale(1, RoundingMode.HALF_UP).doubleValue();
        if (a27 > 20.0) {
            a10 = " \u00a7b";
        }
        if (a27 >= 10.0) {
            a10 = " \u00a7a";
        }
        if (a27 >= 3.0) {
            a10 = " \u00a7e";
        }
        a10 = " \u00a74";
        String a29 = "";
        if (this.Field2224.getValue()) {
            a29 = a10 + String.valueOf((double)a27) + (a28 > 0.0 ? " \u00a76" + a28 : "");
        }
        a29 = "";
        String a30 = "";
        if (this.Field2225.getValue()) {
            a30 = "\u00a7a[\u00a76" + (int)a.getDistanceToEntity((Entity)NameTag.mc.thePlayer) + "\u00a7a]\u00a7r ";
        }
        a30 = "";
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)a3), (float)((float)a4 + a.height / 1.25f), (float)((float)a5));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (ModuleManager.getModule(Perspective.class).getState()) {
            GL11.glRotatef((float)(-Perspective.Field2200), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)Perspective.Field2201, (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glRotatef((float)(-NameTag.mc.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(NameTag.mc.gameSettings.thirdPersonView == 2 ? -NameTag.mc.getRenderManager().playerViewX : NameTag.mc.getRenderManager().playerViewX), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-a14), (float)(-a14), (float)a14);
        GL11.glDisable((int)2929);
        int a31 = a12.getScaledHeight() / 2;
        int a32 = a12.getScaledHeight() / 2;
        GL11.glBlendFunc((int)770, (int)771);
        String a33 = a30 + a24 + a29;
        int a34 = (int)((float)a9.getStringWidth(a33) / 2.0f);
        int a35 = new Color(0, 0, 0, 0).getRGB();
        if (Class305.Method700((Entity)a)) {
            a35 = new Color(255, 0, 0, 150).getRGB();
        }
        if (Class305.Method697((Entity)a)) {
            a35 = new Color(0, 190, 255, 120).getRGB();
        }
        if (Class305.Method704((Entity)a)) {
            a35 = new Color(0, 255, 0, 120).getRGB();
        }
        RenderUtils.Method1108((double)(-a34) - 2.0, -15.0, a34 + 1, -4.0, 0.5, new Color(0, 0, 0, 80).getRGB(), a35);
        GL11.glDepthMask((boolean)false);
        a9.drawString(a33, (int)((float)(-a9.getStringWidth(a33)) / 2.0f), a9.FONT_HEIGHT - 22, 0xFFFFFF);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDepthMask((boolean)true);
        GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        int a36 = new Color(188, 0, 0).getRGB();
        if (a.getHealth() > 20.0f) {
            a36 = -65292;
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        int a37 = 0;
        if (this.Field2226.Method2509().booleanValue() && a instanceof EntityPlayer) {
            int a38 = 0;
            int n = 0;
            ItemStack[] itemStackArray = ((EntityPlayer)a).inventory.armorInventory;
            int n2 = itemStackArray.length;
            if (n < n2) {
                ItemStack a82 = itemStackArray[n];
                a38 -= 10;
                ++n;
            }
            if (a.getHeldItem() != null) {
                a38 -= 8;
                ItemStack a39 = a.getHeldItem().copy();
                if (a39.hasEffect() && (a39.getItem() instanceof ItemTool || a39.getItem() instanceof ItemArmor)) {
                    a39.stackSize = 1;
                }
                this.Method2283(a39, a38, -36);
                a38 += 20;
            }
            if ((a82 = 0) < (n = ((ItemStack[])(iterator = ((EntityPlayer)a).inventory.armorInventory)).length)) {
                a7 = iterator[a82];
                ItemStack a40 = a7.copy();
                if (a40.hasEffect() && (a40.getItem() instanceof ItemTool || a40.getItem() instanceof ItemArmor)) {
                    a40.stackSize = 1;
                }
                this.Method2283(a40, a38, -36);
                a38 += 20;
                ++a82;
            }
            a37 = 35;
        }
        if (!this.Field2226.Method2509().booleanValue() && a instanceof EntityPlayer) {
            a37 = 35;
        }
        if (this.Field2227.Method2509().booleanValue() && a instanceof EntityPlayer && !(a6 = a.getActivePotionEffects()).isEmpty()) {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
            int a41 = 0;
            iterator = a.getActivePotionEffects().Method1383();
            if (iterator.Method932()) {
                PotionEffect a42 = (PotionEffect)iterator.Method933();
                a41 -= 10;
            }
            if ((iterator = a.getActivePotionEffects().Method1383()).Method932()) {
                PotionEffect a43 = (PotionEffect)iterator.Method933();
                a82 = a43.getDuration();
                if (a82 >= 300) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.75f);
                }
                if (a82 >= 150) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.4f);
                }
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.2f);
                a7 = Potion.potionTypes[a43.getPotionID()];
                if (a7.hasStatusIcon()) {
                    int a44 = a7.getStatusIconIndex();
                    mc.getTextureManager().bindTexture(Class393.Field1947);
                    RenderUtils.Method1142(a41, -90 + a37, a44 % 8 * 18, 198 + a44 / 8 * 18, 18, 18);
                }
                a41 += 20;
            }
        }
        GL11.glEnable((int)2929);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    public boolean Method965(EntityLivingBase a) {
        block7: {
            block6: {
                boolean a2 = this.Field2228.Method2509();
                boolean a3 = this.Field2231.Method2509();
                boolean a4 = this.Field2229.Method2509();
                boolean a5 = this.Field2230.Method2509();
                if (a.isInvisible()) {
                    return false;
                }
                if (a == NameTag.mc.thePlayer.ridingEntity) {
                    return false;
                }
                if (a instanceof EntityPlayer) break block6;
                if (a instanceof EntityMob || a instanceof EntityDragon || a instanceof EntityGhast || a instanceof EntitySlime || a instanceof EntityIronGolem || a instanceof EntitySnowman) break block6;
                if (!(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) break block7;
            }
            if (a instanceof EntityPlayerSP) {
                return NameTag.mc.gameSettings.thirdPersonView != 0;
            }
            return true;
        }
        return false;
    }

    private void Method2283(ItemStack a, int a2, int a3) {
        GlStateManager.pushMatrix();
        GlStateManager.depthMask((boolean)true);
        GlStateManager.clear((int)256);
        RenderHelper.enableStandardItemLighting();
        NameTag.mc.getRenderItem().zLevel = -150.0f;
        GlStateManager.disableDepth();
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        mc.getRenderItem().renderItemAndEffectIntoGUI(a, a2, a3);
        mc.getRenderItem().renderItemOverlays(NameTag.mc.fontRendererObj, a, a2, a3);
        NameTag.mc.getRenderItem().zLevel = 0.0f;
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableCull();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        double a4 = 0.5;
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.disableDepth();
        this.Method2285(a, a2, a3 - 17);
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }

    public static void Method2284(float a, float a2, float a3, float a4, float a5, int a6, int a7) {
        NameTag.Method2109(a, a2, a3, a4, a7);
        float a8 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a9 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a10 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a11 = (float)(a6 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a9, (float)a10, (float)a11, (float)a8);
        GL11.glLineWidth((float)a5);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void Method2109(float a, float a2, float a3, float a4, int a5) {
        float a6 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a7 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a9 = (float)(a5 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a7, (float)a8, (float)a9, (float)a6);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    private void Method2285(ItemStack a, int a2, int a3) {
        NBTTagList a4 = a.getEnchantmentTagList();
        int a5 = a3;
        if (a4.tagCount() >= 6) {
            NameTag.mc.fontRendererObj.drawStringWithShadow("god", (float)(a2 * 2), (float)(a5 - 22), 0xFF0000);
            return;
        }
        for (int a6 = 0; a6 < a4.tagCount(); ++a6) {
            short a7 = a4.getCompoundTagAt(a6).getShort("id");
            short a8 = a4.getCompoundTagAt(a6).getShort("lvl");
            Enchantment a9 = Enchantment.getEnchantmentById((int)a7);
            String a10 = ((Enchantment)Objects.requireNonNull((Object)a9)).getTranslatedName((int)a8).substring(0, 1).toLowerCase();
            a10 = a10 + a8;
            NameTag.mc.fontRendererObj.drawStringWithShadow(a10, (float)(a2 * 2), (float)a5, 14537190);
            a5 -= 10;
        }
        if (a.getItem() == Items.golden_apple && a.getMetadata() == 1) {
            NameTag.mc.fontRendererObj.drawStringWithShadow("op", (float)(a2 * 2), (float)(a5 - 22), 0xFF0000);
        }
    }

    private static double Method2246(Entity a) {
        return NameTag.mc.thePlayer.getDistanceToEntity(a);
    }
}