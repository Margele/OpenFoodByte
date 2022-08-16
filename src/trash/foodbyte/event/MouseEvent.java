/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.lwjgl.input.Mouse
 */
package trash.foodbyte.event;

import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.UnknownEvent;

public class MouseEvent
extends UnknownEvent {
    public final int eventX = Mouse.getEventX();
    public int eventY = Mouse.getEventY();
    public int eventDX = Mouse.getEventDX();
    public int eventDY = Mouse.getEventDY();
    public int eventDWheel;
    public int eventButton;
    public boolean eventButtonState;
    public long eventNanosecounds;

    public MouseEvent() {
        String[] stringArray = EventPacket.trash();
        this.eventDWheel = Mouse.getEventDWheel();
        this.eventButton = Mouse.getEventButton();
        this.eventButtonState = Mouse.getEventButtonState();
        this.eventNanosecounds = Mouse.getEventNanoseconds();
        if (a.trash() == null) {
            EventPacket.trash(new String[4]);
        }
    }
}