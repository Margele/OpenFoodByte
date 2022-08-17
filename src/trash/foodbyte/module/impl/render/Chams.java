package trash.foodbyte.module.impl.render;

import awsl.Class492;
import awsl.Class645;
import eventapi.EventTarget;
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
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.value.BooleanValue;

public class Chams extends Module {
   public BooleanValue Field2398 = new BooleanValue("Chams", "Player", true, "玩家");
   public BooleanValue Field2399 = new BooleanValue("Chams", "Animals", false, "生物");
   public BooleanValue Field2400 = new BooleanValue("Chams", "Mobs", false, "怪物");
   public BooleanValue Field2401 = new BooleanValue("Chams", "Invisibles", true, "隐身");

   public Chams() {
      super("Chams", Category.RENDER);
   }

   public String getDescription() {
      return "实体透视";
   }

   @EventTarget
   public void Method1733(Class645 a) {
      Class492.Method2239();
      EntityLivingBase var3 = a.Method3605();
      if (a.Method2241()) {
         if (!this.Method965(var3)) {
            return;
         }

         GL11.glEnable(32823);
         GL11.glPolygonOffset(1.0F, -1000000.0F);
      }

      if (a.Method3515() && this.Method965(var3)) {
         GL11.glPolygonOffset(1.0F, 1000000.0F);
         GL11.glDisable(32823);
      }

   }

   public boolean Method965(EntityLivingBase a) {
      boolean var2 = this.Field2398.getBooleanValue();
      boolean var3 = this.Field2401.getBooleanValue();
      boolean var4 = this.Field2399.getBooleanValue();
      boolean var5 = this.Field2400.getBooleanValue();
      if (a.isInvisible()) {
         return false;
      } else if (a == mc.thePlayer) {
         return false;
      } else if ((!(a instanceof EntityPlayer) || AntiBot.botList.contains(a)) && !(a instanceof EntityMob) && !(a instanceof EntityDragon) && !(a instanceof EntityGhast) && !(a instanceof EntitySlime) && !(a instanceof EntityIronGolem) && !(a instanceof EntitySnowman) && !(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) {
         return false;
      } else if (a instanceof EntityPlayerSP) {
         return mc.gameSettings.thirdPersonView != 0;
      } else {
         return true;
      }
   }
}
