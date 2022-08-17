package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class WTap extends Module {
   public BooleanValue Field1623 = new BooleanValue("WTap", "Packet", false, "使用发包(可能会狗建建议默认或黑卡测试后使用)");
   public int Field1624;

   public WTap() {
      super("WTap", Category.COMBAT);
      this.setDescription("打出更远的击退效果");
   }

   @EventTarget
   public void Method1186(EventPacket a) {
      if (a.isSend() && a.getPacket() instanceof C02PacketUseEntity) {
         this.Field1624 = 0;
      }

   }

   @EventTarget
   public void Method752(EventMotion a) {
      a[] var2 = b.trash();
      if (a.isPre()) {
         ++this.Field1624;
         if (mc.thePlayer.isSprinting()) {
            if (!this.Field1623.getBooleanValue()) {
               if (this.Field1624 == 2) {
                  mc.thePlayer.setSprinting(false);
               }

               if (this.Field1624 != 3) {
                  return;
               }

               mc.thePlayer.setSprinting(true);
            }

            if (this.Field1624 < 10) {
               Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.STOP_SPRINTING));
               Wrapper.INSTANCE.sendPacketNoEvent(new C0BPacketEntityAction(mc.thePlayer, Action.START_SPRINTING));
            }
         }
      }

   }
}
