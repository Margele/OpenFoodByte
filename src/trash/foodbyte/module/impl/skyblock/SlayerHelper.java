package trash.foodbyte.module.impl.skyblock;

import awsl.Class98;
import eventapi.EventTarget;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
import obfuscate.a;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class SlayerHelper extends Module {
   public static BooleanValue Field3134 = new BooleanValue("SlayerHelper", "Auto Senak", true, "当你刷末影人Slayer时\n每一次攻击自动帮你发包Senak蹲下\n触发套装被动\n§e注: 只对Void Sepulture里的末影人生效");
   public boolean Field3135;
   public int Field3136;

   public SlayerHelper() {
      super("SlayerHelper", "Slayer Helper", Category.SKYBLOCK);
      this.setDescription("暂时无用");
   }

   @EventTarget
   public void Method1655(EventTick a) {
      Class98.Method3639();
      ++this.Field3136;
      if (this.Field3135 && this.Field3136 > 5) {
         this.Field3135 = !this.Field3135;
         Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SNEAKING));
         a.trash(new String[1]);
      }

      if (this.Field3135) {
      }

   }

   @EventTarget
   public void Method1994(EventMove a) {
      if (this.Field3135) {
         a.x *= 0.5;
         a.z *= 0.5;
      }

   }

   @EventTarget
   public void Method1186(EventPacket a) {
      int[] a = Class98.Method3639();
      if (a.isSend() && Field3134.getBooleanValue()) {
         if (a.getPacket() instanceof C02PacketUseEntity) {
            C02PacketUseEntity a = (C02PacketUseEntity)a.getPacket();
            if (a.getAction() == net.minecraft.network.play.client.C02PacketUseEntity.Action.ATTACK && a.getEntityFromWorld(mc.theWorld) instanceof EntityEnderman) {
               EntityEnderman a = (EntityEnderman)a.getEntityFromWorld(mc.theWorld);
               this.Field3136 = 0;
               if (!this.Field3135 && a.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() >= 750000.0) {
                  this.Field3135 = !this.Field3135;
                  Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.START_SNEAKING));
               }

               if (this.Field3135 && mc.currentScreen != null) {
                  mc.thePlayer.closeScreen();
               }
            }
         }

         if (a.getPacket() instanceof C0BPacketEntityAction) {
            C0BPacketEntityAction a = (C0BPacketEntityAction)a.getPacket();
            if (this.Field3135 && (a.getAction().equals(Action.START_SNEAKING) || a.getAction().equals(Action.STOP_SNEAKING))) {
               a.setCancelled(true);
            }
         }
      }

   }
}
