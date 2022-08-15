/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.network.Packet
 */
package trash.foodbyte.event;

import eventapi.Event;
import net.minecraft.network.Packet;
import trash.foodbyte.event.Type;

public class EventPacket
implements Event {
    private Type type = Type.SEND;
    private boolean cancelled;
    public Packet packet;
    private static String[] Field2907;

    public EventPacket(boolean shit, Object packet) {
        this.packet = (Packet)packet;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isSend() {
        return this.getType().equals((Object)Type.SEND);
    }

    public boolean isRecieve() {
        return this.getType().equals((Object)Type.RECIEVE);
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

    public static void Method2242(String[] stringArray) {
        Field2907 = stringArray;
    }

    public static String[] Method2243() {
        return Field2907;
    }

    static {
        if (EventPacket.Method2243() == null) {
            EventPacket.Method2242(new String[5]);
        }
    }
}