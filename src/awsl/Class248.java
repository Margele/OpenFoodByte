/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class249;
import awsl.Class91;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventPacket;

public class Class248
extends Class249 {
    public final int Field1372 = Mouse.getEventX();
    public int Field1373 = Mouse.getEventY();
    public int Field1374 = Mouse.getEventDX();
    public int Field1375 = Mouse.getEventDY();
    public int Field1376;
    public int Field1377;
    public boolean Field1378;
    public long Field1379;

    public Class248() {
        String[] stringArray = EventPacket.Method2243();
        this.Field1376 = Mouse.getEventDWheel();
        this.Field1377 = Mouse.getEventButton();
        this.Field1378 = Mouse.getEventButtonState();
        this.Field1379 = Mouse.getEventNanoseconds();
        if (Class91.Method3648() == null) {
            EventPacket.Method2242(new String[4]);
        }
    }
}