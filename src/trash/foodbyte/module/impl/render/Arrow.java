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
      String a = Class492.Method2239();
      if (this.Field2390.getValue()) {
         Minecraft var10001 = mc;
         float a = (float)(195 / Math.max(Minecraft.getDebugFPS() / 2, 1));
         if ((float)this.Field2396 <= 60.0F || (float)this.Field2396 >= 255.0F) {
            this.Field2397 = !this.Field2397;
         }

         if (this.Field2397) {
            this.Field2396 = (int)((float)this.Field2396 + a);
         }

         this.Field2396 = (int)((float)this.Field2396 - a);
         this.Field2396 = (int)MathUtils.clamp((float)this.Field2396, 255.0F, 60.0F);
      }

      this.Field2396 = 255;
      ScaledResolution a = new ScaledResolution(mc);
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
      boolean a = this.Field2391.getBooleanValue();
      boolean a = this.Field2394.getBooleanValue();
      boolean a = this.Field2392.getBooleanValue();
      boolean a = this.Field2393.getBooleanValue();
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
      double a = a.posX - mc.thePlayer.posX;
      double a = a.posZ - mc.thePlayer.posZ;
      float a = (float)(-(Math.atan2(a, a) * 57.29577951308232));
      return a;
   }

   private Color Method1736(EntityLivingBase a, int a) {
      float a = mc.thePlayer.getDistanceToEntity(a);
      float a = 40.0F;
      float a = Math.max(0.0F, Math.min(a, a) / a);
      Color a = new Color(Color.HSBtoRGB(a / 3.0F, 1.0F, 1.0F) | -16777216);
      return new Color(a.getRed(), a.getGreen(), a.getBlue(), a);
   }

   private void Method1737(ScaledResolution a, Entity a) {
      if (a instanceof EntityLivingBase && this.Method965((EntityLivingBase)a)) {
         EntityLivingBase a = (EntityLivingBase)a;
         Vec3 a = (Vec3)this.Field2395.Method2236().Method2665(a);
         if (!RenderUtils.Method1143(a)) {
            int a = a.getScaledWidth() / 2;
            int a = a.getScaledHeight() / 2;
            float a = this.Method1735(a) - mc.thePlayer.rotationYaw;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)a, (float)a, 0.0F);
            GL11.glRotatef(a, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef((float)(-a), (float)(-a), 0.0F);
            GL11.glLineWidth(1.0F);
            RenderUtils.Method1137((float)a, (float)a - this.Field2389.getFloatValue(), this.Field2388.getFloatValue(), 2.0F, 1.0F, this.Method1736(a, this.Field2396).getRGB());
            GL11.glTranslatef((float)a, (float)a, 0.0F);
            GL11.glRotatef(-a, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef((float)(-a), (float)(-a), 0.0F);
            GL11.glPopMatrix();
         }
      }

   }
}
