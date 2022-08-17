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
import trash.foodbyte.module.impl.world.MurderMystery;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class NameTag extends Module {
   public BooleanValue Field2223 = new BooleanValue("NameTag", "RemoveTag", true, "删除mc自带的Tag");
   public BooleanValue Field2224 = new BooleanValue("NameTag", "Health", true, "血量");
   public BooleanValue Field2225 = new BooleanValue("NameTag", "Dis", false, "距离");
   public BooleanValue Field2226 = new BooleanValue("NameTag", "Armor", true, "装备");
   public BooleanValue Field2227 = new BooleanValue("NameTag", "Effect", false, "药水效果");
   public BooleanValue Field2228 = new BooleanValue("Nametag", "Player", true, "玩家");
   public BooleanValue Field2229 = new BooleanValue("Nametag", "Animals", false, "动物");
   public BooleanValue Field2230 = new BooleanValue("Nametag", "Mobs", false, "怪物");
   public BooleanValue Field2231 = new BooleanValue("Nametag", "Invisibles", true, "隐身");
   public BooleanValue Field2232 = new BooleanValue("NameTag", "Antibot", false, "机器人");
   public FloatValue Field2233 = new FloatValue("NameTag", "Size", 1.0, 1.0, 5.0, 0.1, "标签大小");

   public NameTag() {
      super("NameTag", "Name Tag", Category.RENDER);
      this.setDescription("玩家标签透视");
   }

   @EventTarget(3)
   public void Method802(EventRender3D a) {
      List a = mc.theWorld.getLoadedEntityList();
      a.sort(Comparator.comparingDouble(NameTag::Method2246));
      Collections.reverse(a);
      Iterator var3 = a.Method1383();

      while(true) {
         Entity a;
         EntityLivingBase a;
         do {
            do {
               do {
                  if (!var3.Method932()) {
                     return;
                  }

                  a = (Entity)var3.Method933();
               } while(!(a instanceof EntityLivingBase));
            } while(a instanceof EntityPlayerSP);

            a = (EntityLivingBase)a;
         } while(AntiBot.botList.contains(a) && !Class305.Method697(a) && !this.Field2232.getValue());

         if (this.Method965(a)) {
            double a = (double)ReflectionUtils.getRenderPartialTicks();
            double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
            double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
            double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
            this.Method2282(a, a.getName(), a, a, a);
         }
      }
   }

   private void Method2282(EntityLivingBase a, String a, double a, double a, double a) {
      ScaledResolution a = new ScaledResolution(mc);
      FontRenderer a = mc.fontRendererObj;
      Class492.Method2239();
      float a = mc.thePlayer.getDistanceToEntity(a) / 6.0F;
      if (a < 1.0F) {
         a = 1.0F;
      }

      a += a.isSneaking() ? 0.5 : 0.7;
      float a = a * this.Field2233.getFloatValueCast();
      a /= 100.0F;
      a = a.getDisplayName().getFormattedText();
      String a = "";
      if (AntiBot.botList.contains(a)) {
         a = "§8[BOT] ";
      }

      a = "";
      String a = "";
      if (Class305.Method704(a)) {
         a = "§a[T] ";
      }

      a = "";
      String a = "";
      if (Class305.Method697(a)) {
         a = "§b[F] ";
      }

      String a = "";
      if (MurderMystery.Field2300.contains(a)) {
         a = EnumChatFormatting.RED + "[Murder] ";
      }

      if (MurderMystery.Field2301.contains(a)) {
         a = EnumChatFormatting.BLUE + "[Good] ";
      }

      String a = "";
      if (Class305.Method700(a)) {
         a = EnumChatFormatting.RED + "[Target] ";
      }

      String a = "";
      if (mc.getNetHandler().getPlayerInfo(a.getUniqueID()) != null) {
         a = " Ping-" + mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime();
      }

      String a = "";
      if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty() && PermissionManager.canUseFeature("nametag")) {
         Iterator var22 = GlobalModule.INSTANCE.balant.Field2823.Method1383();
         if (var22.Method932()) {
            Class606 a = (Class606)var22.Method933();
            if (a.getName().equals(a.Field2841)) {
               if (a.Field2838.equalsIgnoreCase("FoodByte")) {
                  a = "§7(§d" + a.Field2840 + "§7)§r";
               }

               if (a.Field2838.equalsIgnoreCase("PowerX")) {
                  a = "§7(§b" + a.Field2840 + "§7)§r";
               }

               a = "§7(§2" + a.Field2840 + "§7)§r";
               if (a.Field2847) {
                  if (GlobalModule.INSTANCE.balant.Field2827.Method3740() >= 5) {
                     if (a.Field2838.equalsIgnoreCase("FoodByte")) {
                        a = ("§7[§d" + a.Field2840 + "§7]§r").replace(a.Field2840, "§o" + a.Field2840);
                     }

                     if (a.Field2838.equalsIgnoreCase("PowerX")) {
                        a = ("§7[§b" + a.Field2840 + "§7]§r").replace(a.Field2840, "§o" + a.Field2840);
                     }

                     a = ("§7[§2" + a.Field2840 + "§7]§r").replace(a.Field2840, "§o" + a.Field2840);
                  }

                  a = "";
               }
            }
         }
      }

      String a = a + a + a + (Class305.Method697(a) ? a : a) + a;
      double a = (double)a.getHealth();
      BigDecimal a = BigDecimal.valueOf((double)a.getHealth());
      a = a.setScale(1, RoundingMode.HALF_UP);
      double a = a.doubleValue();
      double a = BigDecimal.valueOf((double)a.getAbsorptionAmount()).setScale(1, RoundingMode.HALF_UP).doubleValue();
      String a;
      if (a > 20.0) {
         a = " §b";
      }

      if (a >= 10.0) {
         a = " §a";
      }

      if (a >= 3.0) {
         a = " §e";
      }

      a = " §4";
      String a = "";
      if (this.Field2224.getValue()) {
         a = a + String.valueOf(a) + (a > 0.0 ? " §6" + a : "");
      }

      a = "";
      String a = "";
      if (this.Field2225.getValue()) {
         a = "§a[§6" + (int)a.getDistanceToEntity(mc.thePlayer) + "§a]§r ";
      }

      a = "";
      GL11.glPushMatrix();
      GL11.glTranslatef((float)a, (float)a + a.height / 1.25F, (float)a);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      if (ModuleManager.getModule(Perspective.class).getState()) {
         GL11.glRotatef(-Perspective.Field2200, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(Perspective.Field2201, 1.0F, 0.0F, 0.0F);
      }

      GL11.glRotatef(-mc.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(mc.gameSettings.thirdPersonView == 2 ? -mc.getRenderManager().playerViewX : mc.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(-a, -a, a);
      GL11.glDisable(2929);
      int a = a.getScaledHeight() / 2;
      int a = a.getScaledHeight() / 2;
      GL11.glBlendFunc(770, 771);
      String a = a + a + a;
      int a = (int)((float)a.getStringWidth(a) / 2.0F);
      int a = (new Color(0, 0, 0, 0)).getRGB();
      if (Class305.Method700(a)) {
         a = (new Color(255, 0, 0, 150)).getRGB();
      }

      if (Class305.Method697(a)) {
         a = (new Color(0, 190, 255, 120)).getRGB();
      }

      if (Class305.Method704(a)) {
         a = (new Color(0, 255, 0, 120)).getRGB();
      }

      RenderUtils.Method1108((double)(-a) - 2.0, -15.0, (double)(a + 1), -4.0, 0.5, (new Color(0, 0, 0, 80)).getRGB(), a);
      GL11.glDepthMask(false);
      a.drawString(a, (int)((float)(-a.getStringWidth(a)) / 2.0F), a.FONT_HEIGHT - 22, 16777215);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDepthMask(true);
      GL11.glScaled(0.6000000238418579, 0.6000000238418579, 0.6000000238418579);
      GL11.glScaled(1.0, 1.0, 1.0);
      int a = (new Color(188, 0, 0)).getRGB();
      if (a.getHealth() > 20.0F) {
         a = -65292;
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glScaled(1.5, 1.5, 1.5);
      int a = 0;
      int a;
      if (this.Field2226.getBooleanValue() && a instanceof EntityPlayer) {
         int a = 0;
         ItemStack[] var41 = ((EntityPlayer)a).inventory.armorInventory;
         int var42 = var41.length;
         int var43 = 0;
         if (var43 < var42) {
            ItemStack a = var41[var43];
            a -= 10;
            ++var43;
         }

         if (a.getHeldItem() != null) {
            a -= 8;
            ItemStack a = a.getHeldItem().copy();
            if (a.hasEffect() && (a.getItem() instanceof ItemTool || a.getItem() instanceof ItemArmor)) {
               a.stackSize = 1;
            }

            this.Method2283(a, a, -36);
            a += 20;
         }

         ItemStack[] var51 = ((EntityPlayer)a).inventory.armorInventory;
         var43 = var51.length;
         a = 0;
         if (a < var43) {
            ItemStack a = var51[a];
            ItemStack a = a.copy();
            if (a.hasEffect() && (a.getItem() instanceof ItemTool || a.getItem() instanceof ItemArmor)) {
               a.stackSize = 1;
            }

            this.Method2283(a, a, -36);
            a += 20;
            ++a;
         }

         a = 35;
      }

      if (!this.Field2226.getBooleanValue() && a instanceof EntityPlayer) {
         a = 35;
      }

      if (this.Field2227.getBooleanValue() && a instanceof EntityPlayer) {
         Collection a = a.getActivePotionEffects();
         if (!a.isEmpty()) {
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
            int a = 0;
            Iterator var53 = a.getActivePotionEffects().Method1383();
            PotionEffect a;
            if (var53.Method932()) {
               a = (PotionEffect)var53.Method933();
               a -= 10;
            }

            var53 = a.getActivePotionEffects().Method1383();
            if (var53.Method932()) {
               a = (PotionEffect)var53.Method933();
               a = a.getDuration();
               if (a >= 300) {
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
               }

               if (a >= 150) {
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
               }

               GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.2F);
               Potion a = Potion.potionTypes[a.getPotionID()];
               if (a.hasStatusIcon()) {
                  int a = a.getStatusIconIndex();
                  mc.getTextureManager().bindTexture(Class393.Field1947);
                  RenderUtils.Method1142(a, -90 + a, a % 8 * 18, 198 + a / 8 * 18, 18, 18);
               }

               a += 20;
            }
         }
      }

      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   public boolean Method965(EntityLivingBase a) {
      boolean a = this.Field2228.getBooleanValue();
      boolean a = this.Field2231.getBooleanValue();
      boolean a = this.Field2229.getBooleanValue();
      boolean a = this.Field2230.getBooleanValue();
      if (a.isInvisible()) {
         return false;
      } else if (a == mc.thePlayer.ridingEntity) {
         return false;
      } else if (!(a instanceof EntityPlayer) && !(a instanceof EntityMob) && !(a instanceof EntityDragon) && !(a instanceof EntityGhast) && !(a instanceof EntitySlime) && !(a instanceof EntityIronGolem) && !(a instanceof EntitySnowman) && !(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) {
         return false;
      } else if (a instanceof EntityPlayerSP) {
         return mc.gameSettings.thirdPersonView != 0;
      } else {
         return true;
      }
   }

   private void Method2283(ItemStack a, int a, int a) {
      GlStateManager.pushMatrix();
      GlStateManager.depthMask(true);
      GlStateManager.clear(256);
      RenderHelper.enableStandardItemLighting();
      mc.getRenderItem().zLevel = -150.0F;
      GlStateManager.disableDepth();
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
      GlStateManager.enableLighting();
      GlStateManager.enableDepth();
      mc.getRenderItem().renderItemAndEffectIntoGUI(a, a, a);
      mc.getRenderItem().renderItemOverlays(mc.fontRendererObj, a, a, a);
      mc.getRenderItem().zLevel = 0.0F;
      RenderHelper.disableStandardItemLighting();
      GlStateManager.disableCull();
      GlStateManager.enableAlpha();
      GlStateManager.disableBlend();
      GlStateManager.disableLighting();
      double a = 0.5;
      GlStateManager.scale(0.5, 0.5, 0.5);
      GlStateManager.disableDepth();
      this.Method2285(a, a, a - 17);
      GlStateManager.enableDepth();
      GlStateManager.scale(2.0F, 2.0F, 2.0F);
      GlStateManager.enableCull();
      GlStateManager.popMatrix();
   }

   public static void Method2284(float a, float a, float a, float a, float a, int a, int a) {
      Method2109(a, a, a, a, a);
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      GL11.glColor4f(a, a, a, a);
      GL11.glLineWidth(a);
      GL11.glBegin(1);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
   }

   public static void Method2109(float a, float a, float a, float a, int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      GL11.glColor4f(a, a, a, a);
      GL11.glBegin(7);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
   }

   private void Method2285(ItemStack a, int a, int a) {
      NBTTagList a = a.getEnchantmentTagList();
      int a = a;
      if (a.tagCount() >= 6) {
         mc.fontRendererObj.drawStringWithShadow("god", (float)(a * 2), (float)(a - 22), 16711680);
      } else {
         for(int a = 0; a < a.tagCount(); ++a) {
            short a = a.getCompoundTagAt(a).getShort("id");
            short a = a.getCompoundTagAt(a).getShort("lvl");
            Enchantment a = Enchantment.getEnchantmentById(a);
            String a = ((Enchantment)Objects.requireNonNull(a)).getTranslatedName(a).substring(0, 1).toLowerCase();
            a = a + a;
            mc.fontRendererObj.drawStringWithShadow(a, (float)(a * 2), (float)a, 14537190);
            a -= 10;
         }

         if (a.getItem() == Items.golden_apple && a.getMetadata() == 1) {
            mc.fontRendererObj.drawStringWithShadow("op", (float)(a * 2), (float)(a - 22), 16711680);
         }

      }
   }

   private static double Method2246(Entity a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }
}
