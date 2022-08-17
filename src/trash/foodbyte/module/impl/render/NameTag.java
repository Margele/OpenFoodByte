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
      List var2 = mc.theWorld.getLoadedEntityList();
      var2.sort(Comparator.comparingDouble(NameTag::Method2246));
      Collections.reverse(var2);
      Iterator var3 = var2.Method1383();

      while(true) {
         Entity var4;
         EntityLivingBase var5;
         do {
            do {
               do {
                  if (!var3.Method932()) {
                     return;
                  }

                  var4 = (Entity)var3.Method933();
               } while(!(var4 instanceof EntityLivingBase));
            } while(var4 instanceof EntityPlayerSP);

            var5 = (EntityLivingBase)var4;
         } while(AntiBot.botList.contains(var4) && !Class305.Method697(var5) && !this.Field2232.getValue());

         if (this.Method965(var5)) {
            double var6 = (double)ReflectionUtils.getRenderPartialTicks();
            double var8 = var5.lastTickPosX + (var5.posX - var5.lastTickPosX) * var6 - ReflectionUtils.getRenderPosX();
            double var10 = var5.lastTickPosY + (var5.posY - var5.lastTickPosY) * var6 - ReflectionUtils.getRenderPosY();
            double var12 = var5.lastTickPosZ + (var5.posZ - var5.lastTickPosZ) * var6 - ReflectionUtils.getRenderPosZ();
            this.Method2282(var5, var5.getName(), var8, var10, var12);
         }
      }
   }

   private void Method2282(EntityLivingBase a, String a, double a, double a, double a) {
      ScaledResolution var10 = new ScaledResolution(mc);
      FontRenderer var11 = mc.fontRendererObj;
      Class492.Method2239();
      float var12 = mc.thePlayer.getDistanceToEntity(a) / 6.0F;
      if (var12 < 1.0F) {
         var12 = 1.0F;
      }

      a += a.isSneaking() ? 0.5 : 0.7;
      float var13 = var12 * this.Field2233.getFloatValueCast();
      var13 /= 100.0F;
      a = a.getDisplayName().getFormattedText();
      String var15 = "";
      if (AntiBot.botList.contains(a)) {
         var15 = "§8[BOT] ";
      }

      var15 = "";
      String var16 = "";
      if (Class305.Method704(a)) {
         var16 = "§a[T] ";
      }

      var16 = "";
      String var17 = "";
      if (Class305.Method697(a)) {
         var17 = "§b[F] ";
      }

      String var18 = "";
      if (MurderMystery.Field2300.contains(a)) {
         var18 = EnumChatFormatting.RED + "[Murder] ";
      }

      if (MurderMystery.Field2301.contains(a)) {
         var18 = EnumChatFormatting.BLUE + "[Good] ";
      }

      String var19 = "";
      if (Class305.Method700(a)) {
         var19 = EnumChatFormatting.RED + "[Target] ";
      }

      String var20 = "";
      if (mc.getNetHandler().getPlayerInfo(a.getUniqueID()) != null) {
         var20 = " Ping-" + mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime();
      }

      String var21 = "";
      if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty() && PermissionManager.canUseFeature("nametag")) {
         Iterator var22 = GlobalModule.INSTANCE.balant.Field2823.Method1383();
         if (var22.Method932()) {
            Class606 var23 = (Class606)var22.Method933();
            if (a.getName().equals(var23.Field2841)) {
               if (var23.Field2838.equalsIgnoreCase("FoodByte")) {
                  var21 = "§7(§d" + var23.Field2840 + "§7)§r";
               }

               if (var23.Field2838.equalsIgnoreCase("PowerX")) {
                  var21 = "§7(§b" + var23.Field2840 + "§7)§r";
               }

               var21 = "§7(§2" + var23.Field2840 + "§7)§r";
               if (var23.Field2847) {
                  if (GlobalModule.INSTANCE.balant.Field2827.Method3740() >= 5) {
                     if (var23.Field2838.equalsIgnoreCase("FoodByte")) {
                        var21 = ("§7[§d" + var23.Field2840 + "§7]§r").replace(var23.Field2840, "§o" + var23.Field2840);
                     }

                     if (var23.Field2838.equalsIgnoreCase("PowerX")) {
                        var21 = ("§7[§b" + var23.Field2840 + "§7]§r").replace(var23.Field2840, "§o" + var23.Field2840);
                     }

                     var21 = ("§7[§2" + var23.Field2840 + "§7]§r").replace(var23.Field2840, "§o" + var23.Field2840);
                  }

                  var21 = "";
               }
            }
         }
      }

      String var47 = var15 + var18 + var19 + (Class305.Method697(a) ? a : a) + var21;
      double var48 = (double)a.getHealth();
      BigDecimal var25 = BigDecimal.valueOf((double)a.getHealth());
      var25 = var25.setScale(1, RoundingMode.HALF_UP);
      double var26 = var25.doubleValue();
      double var28 = BigDecimal.valueOf((double)a.getAbsorptionAmount()).setScale(1, RoundingMode.HALF_UP).doubleValue();
      String var30;
      if (var26 > 20.0) {
         var30 = " §b";
      }

      if (var26 >= 10.0) {
         var30 = " §a";
      }

      if (var26 >= 3.0) {
         var30 = " §e";
      }

      var30 = " §4";
      String var31 = "";
      if (this.Field2224.getValue()) {
         var31 = var30 + String.valueOf(var26) + (var28 > 0.0 ? " §6" + var28 : "");
      }

      var31 = "";
      String var32 = "";
      if (this.Field2225.getValue()) {
         var32 = "§a[§6" + (int)a.getDistanceToEntity(mc.thePlayer) + "§a]§r ";
      }

      var32 = "";
      GL11.glPushMatrix();
      GL11.glTranslatef((float)a, (float)a + a.height / 1.25F, (float)a);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      if (ModuleManager.getModule(Perspective.class).getState()) {
         GL11.glRotatef(-Perspective.Field2200, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(Perspective.Field2201, 1.0F, 0.0F, 0.0F);
      }

      GL11.glRotatef(-mc.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(mc.gameSettings.thirdPersonView == 2 ? -mc.getRenderManager().playerViewX : mc.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(-var13, -var13, var13);
      GL11.glDisable(2929);
      int var33 = var10.getScaledHeight() / 2;
      int var34 = var10.getScaledHeight() / 2;
      GL11.glBlendFunc(770, 771);
      String var35 = var32 + var47 + var31;
      int var36 = (int)((float)var11.getStringWidth(var35) / 2.0F);
      int var37 = (new Color(0, 0, 0, 0)).getRGB();
      if (Class305.Method700(a)) {
         var37 = (new Color(255, 0, 0, 150)).getRGB();
      }

      if (Class305.Method697(a)) {
         var37 = (new Color(0, 190, 255, 120)).getRGB();
      }

      if (Class305.Method704(a)) {
         var37 = (new Color(0, 255, 0, 120)).getRGB();
      }

      RenderUtils.Method1108((double)(-var36) - 2.0, -15.0, (double)(var36 + 1), -4.0, 0.5, (new Color(0, 0, 0, 80)).getRGB(), var37);
      GL11.glDepthMask(false);
      var11.drawString(var35, (int)((float)(-var11.getStringWidth(var35)) / 2.0F), var11.FONT_HEIGHT - 22, 16777215);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDepthMask(true);
      GL11.glScaled(0.6000000238418579, 0.6000000238418579, 0.6000000238418579);
      GL11.glScaled(1.0, 1.0, 1.0);
      int var38 = (new Color(188, 0, 0)).getRGB();
      if (a.getHealth() > 20.0F) {
         var38 = -65292;
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glScaled(1.5, 1.5, 1.5);
      byte var39 = 0;
      int var55;
      if (this.Field2226.getBooleanValue() && a instanceof EntityPlayer) {
         int var40 = 0;
         ItemStack[] var41 = ((EntityPlayer)a).inventory.armorInventory;
         int var42 = var41.length;
         int var43 = 0;
         if (var43 < var42) {
            ItemStack var44 = var41[var43];
            var40 -= 10;
            ++var43;
         }

         if (a.getHeldItem() != null) {
            var40 -= 8;
            ItemStack var49 = a.getHeldItem().copy();
            if (var49.hasEffect() && (var49.getItem() instanceof ItemTool || var49.getItem() instanceof ItemArmor)) {
               var49.stackSize = 1;
            }

            this.Method2283(var49, var40, -36);
            var40 += 20;
         }

         ItemStack[] var51 = ((EntityPlayer)a).inventory.armorInventory;
         var43 = var51.length;
         var55 = 0;
         if (var55 < var43) {
            ItemStack var45 = var51[var55];
            ItemStack var46 = var45.copy();
            if (var46.hasEffect() && (var46.getItem() instanceof ItemTool || var46.getItem() instanceof ItemArmor)) {
               var46.stackSize = 1;
            }

            this.Method2283(var46, var40, -36);
            var40 += 20;
            ++var55;
         }

         var39 = 35;
      }

      if (!this.Field2226.getBooleanValue() && a instanceof EntityPlayer) {
         var39 = 35;
      }

      if (this.Field2227.getBooleanValue() && a instanceof EntityPlayer) {
         Collection var52 = a.getActivePotionEffects();
         if (!var52.isEmpty()) {
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
            int var50 = 0;
            Iterator var53 = a.getActivePotionEffects().Method1383();
            PotionEffect var54;
            if (var53.Method932()) {
               var54 = (PotionEffect)var53.Method933();
               var50 -= 10;
            }

            var53 = a.getActivePotionEffects().Method1383();
            if (var53.Method932()) {
               var54 = (PotionEffect)var53.Method933();
               var55 = var54.getDuration();
               if (var55 >= 300) {
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
               }

               if (var55 >= 150) {
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
               }

               GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.2F);
               Potion var56 = Potion.potionTypes[var54.getPotionID()];
               if (var56.hasStatusIcon()) {
                  int var57 = var56.getStatusIconIndex();
                  mc.getTextureManager().bindTexture(Class393.Field1947);
                  RenderUtils.Method1142(var50, -90 + var39, var57 % 8 * 18, 198 + var57 / 8 * 18, 18, 18);
               }

               var50 += 20;
            }
         }
      }

      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   public boolean Method965(EntityLivingBase a) {
      boolean var2 = this.Field2228.getBooleanValue();
      boolean var3 = this.Field2231.getBooleanValue();
      boolean var4 = this.Field2229.getBooleanValue();
      boolean var5 = this.Field2230.getBooleanValue();
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
      double var4 = 0.5;
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
      float var7 = (float)(a >> 24 & 255) / 255.0F;
      float var8 = (float)(a >> 16 & 255) / 255.0F;
      float var9 = (float)(a >> 8 & 255) / 255.0F;
      float var10 = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      GL11.glColor4f(var8, var9, var10, var7);
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
      float var5 = (float)(a >> 24 & 255) / 255.0F;
      float var6 = (float)(a >> 16 & 255) / 255.0F;
      float var7 = (float)(a >> 8 & 255) / 255.0F;
      float var8 = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      GL11.glColor4f(var6, var7, var8, var5);
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
      NBTTagList var4 = a.getEnchantmentTagList();
      int var5 = a;
      if (var4.tagCount() >= 6) {
         mc.fontRendererObj.drawStringWithShadow("god", (float)(a * 2), (float)(a - 22), 16711680);
      } else {
         for(int var6 = 0; var6 < var4.tagCount(); ++var6) {
            short var7 = var4.getCompoundTagAt(var6).getShort("id");
            short var8 = var4.getCompoundTagAt(var6).getShort("lvl");
            Enchantment var9 = Enchantment.getEnchantmentById(var7);
            String var10 = ((Enchantment)Objects.requireNonNull(var9)).getTranslatedName(var8).substring(0, 1).toLowerCase();
            var10 = var10 + var8;
            mc.fontRendererObj.drawStringWithShadow(var10, (float)(a * 2), (float)var5, 14537190);
            var5 -= 10;
         }

         if (a.getItem() == Items.golden_apple && a.getMetadata() == 1) {
            mc.fontRendererObj.drawStringWithShadow("op", (float)(a * 2), (float)(var5 - 22), 16711680);
         }

      }
   }

   private static double Method2246(Entity a) {
      return (double)mc.thePlayer.getDistanceToEntity(a);
   }
}
