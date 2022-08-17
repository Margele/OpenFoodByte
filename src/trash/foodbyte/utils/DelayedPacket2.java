package trash.foodbyte.utils;

import net.minecraft.network.Packet;

public class DelayedPacket2 {
   private final Packet packet;
   private final long time;

   public DelayedPacket2(Packet packet, long time) {
      this.packet = packet;
      this.time = time;
   }

   public Packet getPacket() {
      return this.packet;
   }

   public long getTime() {
      return this.time;
   }
}
