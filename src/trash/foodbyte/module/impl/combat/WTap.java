/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C02PacketUseEntity
 *  net.minecraft.network.play.client.C0BPacketEntityAction
 *  net.minecraft.network.play.client.C0BPacketEntityAction$Action
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class46;
import awsl.Class91;
import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class WTap
extends Module {
    public BooleanValue Field1623 = new BooleanValue("WTap", "Packet", (Boolean)false, "\u4f7f\u7528\u53d1\u5305(\u53ef\u80fd\u4f1a\u72d7\u5efa\u5efa\u8bae\u9ed8\u8ba4\u6216\u9ed1\u5361\u6d4b\u8bd5\u540e\u4f7f\u7528)");
    public int Field1624;

    public WTap() {
        super("WTap", Category.COMBAT);
        this.setDescription("\u6253\u51fa\u66f4\u8fdc\u7684\u51fb\u9000\u6548\u679c");
    }

    @EventTarget
    public void Method1186(EventPacket a) {
        if (a.isSend() && a.getPacket() instanceof C02PacketUseEntity) {
            this.Field1624 = 0;
        }
    }

    @EventTarget
    public void Method752(EventMotion a) {
        block5: {
            block6: {
                Class91[] class91Array = Class46.Method3239();
                if (!a.isPre()) break block5;
                ++this.Field1624;
                if (!WTap.mc.thePlayer.isSprinting()) break block5;
                if (this.Field1623.Method2509().booleanValue()) break block6;
                if (this.Field1624 == 2) {
                    WTap.mc.thePlayer.setSprinting(false);
                }
                if (this.Field1624 != 3) break block5;
                WTap.mc.thePlayer.setSprinting(true);
            }
            if (this.Field1624 < 10) {
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)WTap.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)WTap.mc.thePlayer, C0BPacketEntityAction.Action.START_SPRINTING));
            }
        }
    }
}