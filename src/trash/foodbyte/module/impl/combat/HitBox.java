package trash.foodbyte.module.impl.combat;

import awsl.Class305;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
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
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class HitBox extends Module {
   public BooleanValue Field2603 = new BooleanValue("Hitbox", "Player", true, "玩家");
   public BooleanValue Field2604 = new BooleanValue("Hitbox", "Animals", false, "生物");
   public BooleanValue Field2605 = new BooleanValue("Hitbox", "Mobs", false, "怪物");
   public BooleanValue Field2606 = new BooleanValue("Hitbox", "Invisibles", true, "隐身");
   public FloatValue Field2607 = new FloatValue("Hitbox", "Size", 0.5, 0.1, 1.0, 0.01, "碰撞箱(0.1为默认)");

   public HitBox() {
      super("HitBox", "Hit Box", Category.COMBAT);
   }

   public String getDescription() {
      return "实体碰撞箱修改(增加实体被攻击的范围)";
   }

   @EventTarget
   private void Method755(EventTick a) {
      this.setDisplayTag(this.Field2607.getFloatValue().toString());
   }

   public boolean Method1187(Entity a) {
      boolean var2 = this.Field2603.getBooleanValue();
      boolean var3 = this.Field2606.getBooleanValue();
      boolean var4 = this.Field2604.getBooleanValue();
      boolean var5 = this.Field2605.getBooleanValue();
      if (a.isInvisible()) {
         return false;
      } else if (a == mc.thePlayer) {
         return false;
      } else if (!(a instanceof EntityPlayer) && !(a instanceof EntityMob) && !(a instanceof EntityDragon) && !(a instanceof EntityGhast) && !(a instanceof EntitySlime) && !(a instanceof EntityIronGolem) && !(a instanceof EntitySnowman) && !(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) {
         return false;
      } else if (a instanceof EntityPlayer && Class305.Method698(a.getName())) {
         return false;
      } else if (a instanceof EntityPlayer && AntiBot.botList.contains(a)) {
         return false;
      } else if (a instanceof EntityPlayer && Class305.Method704(a)) {
         return false;
      } else if (a instanceof EntityPlayerSP) {
         return mc.gameSettings.thirdPersonView != 0;
      } else {
         return true;
      }
   }
}
