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
import trash.foodbyte.reflections.ReflectionUtils;
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
    public void Method802(EventRender3D a2) {
        List a3 = NameTag.mc.theWorld.getLoadedEntityList();
        a3.sort(Comparator.comparingDouble(NameTag::Method2246));
        Collections.reverse((List)a3);
        Iterator iterator = a3.Method1383();
        while (iterator.Method932()) {
            Entity a4 = (Entity)iterator.Method933();
            if (!(a4 instanceof EntityLivingBase) || a4 instanceof EntityPlayerSP) continue;
            EntityLivingBase a5 = (EntityLivingBase)a4;
            if (AntiBot.botList.contains((Object)a4) && !Class305.Method697((Entity)a5) && !this.Field2232.getValue() || !this.Method965(a5)) continue;
            double a6 = ReflectionUtils.getRenderPartialTicks();
            double a7 = a5.lastTickPosX + (a5.posX - a5.lastTickPosX) * a6 - ReflectionUtils.getRenderPosX();
            double a8 = a5.lastTickPosY + (a5.posY - a5.lastTickPosY) * a6 - ReflectionUtils.getRenderPosY();
            double a9 = a5.lastTickPosZ + (a5.posZ - a5.lastTickPosZ) * a6 - ReflectionUtils.getRenderPosZ();
            this.Method2282(a5, a5.getName(), a7, a8, a9);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void Method2282(EntityLivingBase a2, String a3, double a4, double a5, double a6) {
        Collection a7;
        Iterator a8;
        Iterator iterator;
        int a92;
        void a10;
        String a11;
        Iterator iterator2;
        float a12;
        ScaledResolution a13 = new ScaledResolution(mc);
        FontRenderer fontRenderer = NameTag.mc.fontRendererObj;
        float f = NameTag.mc.thePlayer.getDistanceToEntity((Entity)a2) / 6.0f;
        String a14 = Class492.Method2239();
        if (a12 < 1.0f) {
            a12 = 1.0f;
        }
        a5 += a2.isSneaking() ? 0.5 : 0.7;
        float a15 = a12 * this.Field2233.getFloatValueCast();
        a15 /= 100.0f;
        String a16 = a3 = a2.getDisplayName().getFormattedText();
        String a17 = "";
        if (AntiBot.botList.contains((Object)a2)) {
            a17 = "\u00a78[BOT] ";
        }
        a17 = "";
        String a18 = "";
        if (Class305.Method704((Entity)a2)) {
            a18 = "\u00a7a[T] ";
        }
        a18 = "";
        String a19 = "";
        if (Class305.Method697((Entity)a2)) {
            a19 = "\u00a7b[F] ";
        }
        String a20 = "";
        if (MurderMystery.Field2300.contains((Object)a2)) {
            a20 = EnumChatFormatting.RED + "[Murder] ";
        }
        if (MurderMystery.Field2301.contains((Object)a2)) {
            a20 = EnumChatFormatting.BLUE + "[Good] ";
        }
        String a21 = "";
        if (Class305.Method700((Entity)a2)) {
            a21 = EnumChatFormatting.RED + "[Target] ";
        }
        String a22 = "";
        if (mc.getNetHandler().getPlayerInfo(a2.getUniqueID()) != null) {
            a22 = " Ping-" + mc.getNetHandler().getPlayerInfo(a2.getUniqueID()).getResponseTime();
        }
        String a23 = "";
        if (!GlobalModule.INSTANCE.Field3186.Field2823.isEmpty() && PermissionManager.canUseFeature("nametag") && (iterator2 = GlobalModule.INSTANCE.Field3186.Field2823.Method1383()).Method932()) {
            Class606 a24 = (Class606)iterator2.Method933();
            if (a2.getName().equals((Object)a24.Field2841)) {
                if (a24.Field2838.equalsIgnoreCase("FoodByte")) {
                    a23 = "\u00a77(\u00a7d" + a24.Field2840 + "\u00a77)\u00a7r";
                }
                if (a24.Field2838.equalsIgnoreCase("PowerX")) {
                    a23 = "\u00a77(\u00a7b" + a24.Field2840 + "\u00a77)\u00a7r";
                }
                a23 = "\u00a77(\u00a72" + a24.Field2840 + "\u00a77)\u00a7r";
                if (a24.Field2847) {
                    if (GlobalModule.INSTANCE.Field3186.Field2827.Method3740() >= 5) {
                        if (a24.Field2838.equalsIgnoreCase("FoodByte")) {
                            a23 = ("\u00a77[\u00a7d" + a24.Field2840 + "\u00a77]\u00a7r").replace((CharSequence)a24.Field2840, (CharSequence)("\u00a7o" + a24.Field2840));
                        }
                        if (a24.Field2838.equalsIgnoreCase("PowerX")) {
                            a23 = ("\u00a77[\u00a7b" + a24.Field2840 + "\u00a77]\u00a7r").replace((CharSequence)a24.Field2840, (CharSequence)("\u00a7o" + a24.Field2840));
                        }
                        a23 = ("\u00a77[\u00a72" + a24.Field2840 + "\u00a77]\u00a7r").replace((CharSequence)a24.Field2840, (CharSequence)("\u00a7o" + a24.Field2840));
                    }
                    a23 = "";
                }
            }
        }
        String a25 = a17 + a20 + a21 + (Class305.Method697((Entity)a2) ? a16 : a3) + a23;
        double a26 = a2.getHealth();
        BigDecimal a27 = BigDecimal.valueOf((double)a2.getHealth());
        a27 = a27.setScale(1, RoundingMode.HALF_UP);
        double a28 = a27.doubleValue();
        double a29 = BigDecimal.valueOf((double)a2.getAbsorptionAmount()).setScale(1, RoundingMode.HALF_UP).doubleValue();
        if (a28 > 20.0) {
            a11 = " \u00a7b";
        }
        if (a28 >= 10.0) {
            a11 = " \u00a7a";
        }
        if (a28 >= 3.0) {
            a11 = " \u00a7e";
        }
        a11 = " \u00a74";
        String a30 = "";
        if (this.Field2224.getValue()) {
            a30 = a11 + String.valueOf((double)a28) + (a29 > 0.0 ? " \u00a76" + a29 : "");
        }
        a30 = "";
        String a31 = "";
        if (this.Field2225.getValue()) {
            a31 = "\u00a7a[\u00a76" + (int)a2.getDistanceToEntity((Entity)NameTag.mc.thePlayer) + "\u00a7a]\u00a7r ";
        }
        a31 = "";
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)a4), (float)((float)a5 + a2.height / 1.25f), (float)((float)a6));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (ModuleManager.getModule(Perspective.class).getState()) {
            GL11.glRotatef((float)(-Perspective.Field2200), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)Perspective.Field2201, (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glRotatef((float)(-NameTag.mc.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(NameTag.mc.gameSettings.thirdPersonView == 2 ? -NameTag.mc.getRenderManager().playerViewX : NameTag.mc.getRenderManager().playerViewX), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-a15), (float)(-a15), (float)a15);
        GL11.glDisable((int)2929);
        int a32 = a13.getScaledHeight() / 2;
        int a33 = a13.getScaledHeight() / 2;
        GL11.glBlendFunc((int)770, (int)771);
        String a34 = a31 + a25 + a30;
        int a35 = (int)((float)a10.getStringWidth(a34) / 2.0f);
        int a36 = new Color(0, 0, 0, 0).getRGB();
        if (Class305.Method700((Entity)a2)) {
            a36 = new Color(255, 0, 0, 150).getRGB();
        }
        if (Class305.Method697((Entity)a2)) {
            a36 = new Color(0, 190, 255, 120).getRGB();
        }
        if (Class305.Method704((Entity)a2)) {
            a36 = new Color(0, 255, 0, 120).getRGB();
        }
        RenderUtils.Method1108((double)(-a35) - 2.0, -15.0, a35 + 1, -4.0, 0.5, new Color(0, 0, 0, 80).getRGB(), a36);
        GL11.glDepthMask((boolean)false);
        a10.drawString(a34, (int)((float)(-a10.getStringWidth(a34)) / 2.0f), a10.FONT_HEIGHT - 22, 0xFFFFFF);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDepthMask((boolean)true);
        GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
        GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        int a37 = new Color(188, 0, 0).getRGB();
        if (a2.getHealth() > 20.0f) {
            a37 = -65292;
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        int a38 = 0;
        if (this.Field2226.getBooleanValue().booleanValue() && a2 instanceof EntityPlayer) {
            int a39 = 0;
            int n = 0;
            ItemStack[] itemStackArray = ((EntityPlayer)a2).inventory.armorInventory;
            int n2 = itemStackArray.length;
            if (n < n2) {
                ItemStack a92 = itemStackArray[n];
                a39 -= 10;
                ++n;
            }
            if (a2.getHeldItem() != null) {
                a39 -= 8;
                ItemStack a40 = a2.getHeldItem().copy();
                if (a40.hasEffect() && (a40.getItem() instanceof ItemTool || a40.getItem() instanceof ItemArmor)) {
                    a40.stackSize = 1;
                }
                this.Method2283(a40, a39, -36);
                a39 += 20;
            }
            if ((a92 = 0) < (n = ((ItemStack[])(iterator = ((EntityPlayer)a2).inventory.armorInventory)).length)) {
                a8 = iterator[a92];
                ItemStack a41 = a8.copy();
                if (a41.hasEffect() && (a41.getItem() instanceof ItemTool || a41.getItem() instanceof ItemArmor)) {
                    a41.stackSize = 1;
                }
                this.Method2283(a41, a39, -36);
                a39 += 20;
                ++a92;
            }
            a38 = 35;
        }
        if (!this.Field2226.getBooleanValue().booleanValue() && a2 instanceof EntityPlayer) {
            a38 = 35;
        }
        if (this.Field2227.getBooleanValue().booleanValue() && a2 instanceof EntityPlayer && !(a7 = a2.getActivePotionEffects()).isEmpty()) {
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
            int a42 = 0;
            iterator = a2.getActivePotionEffects().Method1383();
            if (iterator.Method932()) {
                PotionEffect a43 = (PotionEffect)iterator.Method933();
                a42 -= 10;
            }
            if ((iterator = a2.getActivePotionEffects().Method1383()).Method932()) {
                PotionEffect a44 = (PotionEffect)iterator.Method933();
                a92 = a44.getDuration();
                if (a92 >= 300) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.75f);
                }
                if (a92 >= 150) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.4f);
                }
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.2f);
                a8 = Potion.potionTypes[a44.getPotionID()];
                if (a8.hasStatusIcon()) {
                    int a45 = a8.getStatusIconIndex();
                    mc.getTextureManager().bindTexture(Class393.Field1947);
                    RenderUtils.Method1142(a42, -90 + a38, a45 % 8 * 18, 198 + a45 / 8 * 18, 18, 18);
                }
                a42 += 20;
            }
        }
        GL11.glEnable((int)2929);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    public boolean Method965(EntityLivingBase a2) {
        block7: {
            block6: {
                boolean a3 = this.Field2228.getBooleanValue();
                boolean a4 = this.Field2231.getBooleanValue();
                boolean a5 = this.Field2229.getBooleanValue();
                boolean a6 = this.Field2230.getBooleanValue();
                if (a2.isInvisible()) {
                    return false;
                }
                if (a2 == NameTag.mc.thePlayer.ridingEntity) {
                    return false;
                }
                if (a2 instanceof EntityPlayer) break block6;
                if (a2 instanceof EntityMob || a2 instanceof EntityDragon || a2 instanceof EntityGhast || a2 instanceof EntitySlime || a2 instanceof EntityIronGolem || a2 instanceof EntitySnowman) break block6;
                if (!(a2 instanceof EntityAnimal) && !(a2 instanceof EntitySquid) && !(a2 instanceof EntityVillager) && !(a2 instanceof EntityBat)) break block7;
            }
            if (a2 instanceof EntityPlayerSP) {
                return NameTag.mc.gameSettings.thirdPersonView != 0;
            }
            return true;
        }
        return false;
    }

    private void Method2283(ItemStack a2, int a3, int a4) {
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
        mc.getRenderItem().renderItemAndEffectIntoGUI(a2, a3, a4);
        mc.getRenderItem().renderItemOverlays(NameTag.mc.fontRendererObj, a2, a3, a4);
        NameTag.mc.getRenderItem().zLevel = 0.0f;
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableCull();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        double a5 = 0.5;
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.disableDepth();
        this.Method2285(a2, a3, a4 - 17);
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }

    public static void Method2284(float a2, float a3, float a4, float a5, float a6, int a7, int a8) {
        NameTag.Method2109(a2, a3, a4, a5, a8);
        float a9 = (float)(a7 >> 24 & 0xFF) / 255.0f;
        float a10 = (float)(a7 >> 16 & 0xFF) / 255.0f;
        float a11 = (float)(a7 >> 8 & 0xFF) / 255.0f;
        float a12 = (float)(a7 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a10, (float)a11, (float)a12, (float)a9);
        GL11.glLineWidth((float)a6);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void Method2109(float a2, float a3, float a4, float a5, int a6) {
        float a7 = (float)(a6 >> 24 & 0xFF) / 255.0f;
        float a8 = (float)(a6 >> 16 & 0xFF) / 255.0f;
        float a9 = (float)(a6 >> 8 & 0xFF) / 255.0f;
        float a10 = (float)(a6 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)a8, (float)a9, (float)a10, (float)a7);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    private void Method2285(ItemStack a2, int a3, int a4) {
        NBTTagList a5 = a2.getEnchantmentTagList();
        int a6 = a4;
        if (a5.tagCount() >= 6) {
            NameTag.mc.fontRendererObj.drawStringWithShadow("god", (float)(a3 * 2), (float)(a6 - 22), 0xFF0000);
            return;
        }
        for (int a7 = 0; a7 < a5.tagCount(); ++a7) {
            short a8 = a5.getCompoundTagAt(a7).getShort("id");
            short a9 = a5.getCompoundTagAt(a7).getShort("lvl");
            Enchantment a10 = Enchantment.getEnchantmentById((int)a8);
            String a11 = ((Enchantment)Objects.requireNonNull((Object)a10)).getTranslatedName((int)a9).substring(0, 1).toLowerCase();
            a11 = a11 + a9;
            NameTag.mc.fontRendererObj.drawStringWithShadow(a11, (float)(a3 * 2), (float)a6, 14537190);
            a6 -= 10;
        }
        if (a2.getItem() == Items.golden_apple && a2.getMetadata() == 1) {
            NameTag.mc.fontRendererObj.drawStringWithShadow("op", (float)(a3 * 2), (float)(a6 - 22), 0xFF0000);
        }
    }

    private static double Method2246(Entity a2) {
        return NameTag.mc.thePlayer.getDistanceToEntity(a2);
    }
}