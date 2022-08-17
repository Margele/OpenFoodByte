package trash.foodbyte.utils;

import net.minecraft.network.Packet;
import trash.foodbyte.module.impl.world.Disabler;

final class DelayedPacket {
   private final Packet packet;
   private final long delayTime;
   final Disabler disabler;

   public DelayedPacket(Disabler disabler, Packet packet) {
      this.disabler = disabler;
      this.packet = packet;
      this.delayTime = System.currentTimeMillis();
   }

   static Packet getPacket(DelayedPacket delayedPacket) {
      return delayedPacket.packet;
   }
}
