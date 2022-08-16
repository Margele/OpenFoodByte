/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package eventapi;

import eventapi.Event;

public abstract class StoppableEvent
implements Event {
    private boolean Field1387;
    private static String[] Field1388;

    protected StoppableEvent() {
    }

    public void Method2240() {
        this.Field1387 = true;
    }

    public boolean isStopped() {
        return this.Field1387;
    }

    public static void Method2242(String[] stringArray) {
        Field1388 = stringArray;
    }

    public static String[] Method2243() {
        return Field1388;
    }

    static {
        if (StoppableEvent.Method2243() != null) {
            StoppableEvent.Method2242(new String[1]);
        }
    }
}