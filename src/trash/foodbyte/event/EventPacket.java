package trash.foodbyte.event;

import eventapi.Event;
import net.minecraft.network.Packet;

public class EventPacket implements Event {
   private Type type;
   private boolean cancelled;
   public Packet packet;
   private static String[] Field2907;

   public EventPacket(boolean shit, Object packet) {
      this.type = Type.SEND;
      this.packet = (Packet)packet;
   }

   public Type getType() {
      return this.type;
   }

   public void setType(Type type) {
      this.type = type;
   }

   public boolean isSend() {
      return this.getType().equals(Type.SEND);
   }

   public boolean isRecieve() {
      return this.getType().equals(Type.RECIEVE);
   }

   public boolean isCancelled() {
      return this.cancelled;
   }

   public void setCancelled(boolean cancelled) {
      this.cancelled = cancelled;
   }

   public Packet getPacket() {
      return this.packet;
   }

   public void setPacket(Packet packet) {
      this.packet = packet;
   }

   public static void trash(String[] arr) {
      Field2907 = arr;
   }

   public static String[] trash() {
      return Field2907;
   }

   static {
      if (trash() == null) {
         trash(new String[5]);
      }

   }
}
