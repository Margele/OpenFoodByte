package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
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
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Arrow extends Module {
   private FloatValue Field2388 = new FloatValue("Arrow", "Size", 10.0, 5.0, 10.0, 0.1, "箭头大小");
   private FloatValue Field2389 = new FloatValue("Arrow", "Radius", 45.0, 10.0, 200.0, 1.0, "半径");
   public BooleanValue Field2390 = new BooleanValue("Arrow", "Fade", true, "箭头透明度呼吸闪烁");
   public BooleanValue Field2391 = new BooleanValue("Arrow", "Player", true, "玩家");
   public BooleanValue Field2392 = new BooleanValue("Arrow", "Animals", false, "生物");
   public BooleanValue Field2393 = new BooleanValue("Arrow", "Mobs", false, "怪物");
   public BooleanValue Field2394 = new BooleanValue("Arrow", "Invisibles", true, "隐身");
   private Class492 Field2395 = new Class492(this);
   private int Field2396;
   private boolean Field2397;

   public Arrow() {
      super("Arrow", Category.RENDER);
      this.setDescription("箭头雷达(中间绘制箭头指向实体)");
   }

   public void onEnable() {
      this.Field2396 = 0;
      this.Field2397 = false;
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      try {
         Class492.Method2237(this.Field2395, a);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   @EventTarget(3)
   public void Method810(EventRender2D a) {
      String var2 = Class492.Method2239();
      if (this.Field2390.getValue()) {
         Minecraft var10001 = mc;
         float var3 = (float)(195 / Math.max(Minecraft.getDebugFPS() / 2, 1));
         if ((float)this.Field2396 <= 60.0F || (float)this.Field2396 >= 255.0F) {
            this.Field2397 = !this.Field2397;
         }

         if (this.Field2397) {
            this.Field2396 = (int)((float)this.Field2396 + var3);
         }

         this.Field2396 = (int)((float)this.Field2396 - var3);
         this.Field2396 = (int)MathUtils.clamp((float)this.Field2396, 255.0F, 60.0F);
      }

      this.Field2396 = 255;
      ScaledResolution var4 = new ScaledResolution(mc);
      mc.theWorld.loadedEntityList.forEach(this::Method1737);
   }

   private boolean Method1734(Vec3 a) {
      if (a.xCoord > -1.0 && a.zCoord < 1.0) {
         return a.xCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) >= 0.0 && a.xCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) <= (double)Display.getWidth() && a.yCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) >= 0.0 && a.yCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) <= (double)Display.getHeight();
      } else {
         return false;
      }
   }

   public boolean Method965(EntityLivingBase a) {
      boolean var2 = this.Field2391.getBooleanValue();
      boolean var3 = this.Field2394.getBooleanValue();
      boolean var4 = this.Field2392.getBooleanValue();
      boolean var5 = this.Field2393.getBooleanValue();
      if (a.isInvisible()) {
         return false;
      } else if (a == mc.thePlayer) {
         return false;
      } else if (AntiBot.botList.contains(a)) {
         return false;
      } else if (Class305.Method704(a) && GlobalModule.Field3142.getValue()) {
         return false;
      } else if (Class305.Method697(a)) {
         return false;
      } else if (!(a instanceof EntityPlayer) && !(a instanceof EntityMob) && !(a instanceof EntityDragon) && !(a instanceof EntityGhast) && !(a instanceof EntitySlime) && !(a instanceof EntityIronGolem) && !(a instanceof EntitySnowman) && !(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) {
         return false;
      } else if (a instanceof EntityPlayerSP) {
         return mc.gameSettings.thirdPersonView != 0;
      } else {
         return true;
      }
   }

   private float Method1735(EntityLivingBase a) {
      double var2 = a.posX - mc.thePlayer.posX;
      double var4 = a.posZ - mc.thePlayer.posZ;
      float var6 = (float)(-(Math.atan2(var2, var4) * 57.29577951308232));
      return var6;
   }

   private Color Method1736(EntityLivingBase a, int a) {
      float var3 = mc.thePlayer.getDistanceToEntity(a);
      float var4 = 40.0F;
      float var5 = Math.max(0.0F, Math.min(var3, var4) / var4);
      Color var6 = new Color(Color.HSBtoRGB(var5 / 3.0F, 1.0F, 1.0F) | -16777216);
      return new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), a);
   }

   private void Method1737(ScaledResolution a, Entity a) {
      if (a instanceof EntityLivingBase && this.Method965((EntityLivingBase)a)) {
         EntityLivingBase var3 = (EntityLivingBase)a;
         Vec3 var4 = (Vec3)this.Field2395.Method2236().Method2665(var3);
         if (!RenderUtils.Method1143(var3)) {
            int var5 = a.getScaledWidth() / 2;
            int var6 = a.getScaledHeight() / 2;
            float var7 = this.Method1735(var3) - mc.thePlayer.rotationYaw;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)var5, (float)var6, 0.0F);
            GL11.glRotatef(var7, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef((float)(-var5), (float)(-var6), 0.0F);
            GL11.glLineWidth(1.0F);
            RenderUtils.Method1137((float)var5, (float)var6 - this.Field2389.getFloatValue(), this.Field2388.getFloatValue(), 2.0F, 1.0F, this.Method1736(var3, this.Field2396).getRGB());
            GL11.glTranslatef((float)var5, (float)var6, 0.0F);
            GL11.glRotatef(-var7, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef((float)(-var5), (float)(-var6), 0.0F);
            GL11.glPopMatrix();
         }
      }

   }
}
