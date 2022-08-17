package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
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
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;

public class ESP extends Module {
   public ColorValue Field2378 = new ColorValue("ESP", "Color", new Color(0, 153, 255), "透视绘制颜色");
   public BooleanValue Field2379 = new BooleanValue("ESP", "Player", true, "玩家");
   public BooleanValue Field2380 = new BooleanValue("ESP", "Animals", false, "生物");
   public BooleanValue Field2381 = new BooleanValue("ESP", "Mobs", false, "怪物");
   public BooleanValue Field2382 = new BooleanValue("ESP", "Invisibles", true, "隐身");

   public ESP() {
      super("ESP", Category.RENDER);
      this.setDescription("绘制实体透视");
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      Class492.Method2239();
      Iterator var3 = mc.theWorld.loadedEntityList.Method1383();

      while(var3.Method932()) {
         Object a = var3.Method933();
         if (a instanceof EntityLivingBase) {
            Minecraft var10001 = mc;
            if (a != Minecraft.getMinecraft().thePlayer && !AntiBot.botList.contains(a)) {
               EntityLivingBase a = (EntityLivingBase)a;
               if (this.Method965(a)) {
                  double a = (double)ReflectionUtils.getRenderPartialTicks();
                  double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
                  double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
                  double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
                  Color a = this.Field2378.Method2444();
                  if (Class305.Method704(a)) {
                     a = new Color(0, 255, 0);
                  }

                  if (a.hurtTime > 0) {
                     a = new Color(255, 0, 0);
                  }

                  if (a.isInvisible()) {
                     a = new Color(255, 255, 0);
                  }

                  RenderUtils.Method1121(a, a, a, (double)a.width / 1.5, (double)a.height + 0.2, (float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, (float)a.getAlpha() / 255.0F);
                  break;
               }
            }
         }
      }

   }

   public boolean Method965(EntityLivingBase a) {
      boolean a = this.Field2379.getBooleanValue();
      boolean a = this.Field2382.getBooleanValue();
      boolean a = this.Field2380.getBooleanValue();
      boolean a = this.Field2381.getBooleanValue();
      if (a.isInvisible()) {
         return false;
      } else if (!(a instanceof EntityPlayer) && !(a instanceof EntityMob) && !(a instanceof EntityDragon) && !(a instanceof EntityGhast) && !(a instanceof EntitySlime) && !(a instanceof EntityIronGolem) && !(a instanceof EntitySnowman) && !(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) {
         return false;
      } else if (a instanceof EntityPlayerSP) {
         return mc.gameSettings.thirdPersonView != 0;
      } else {
         return true;
      }
   }
}
