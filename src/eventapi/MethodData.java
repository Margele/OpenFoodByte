/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package eventapi;

import eventapi.EventManager;
import java.lang.reflect.Method;
import obfuscate.a;

final class MethodData {
    private final Object source;
    private final Method target;
    private final byte priority;

    public MethodData(Object source, Method target, byte priority) {
        boolean bl = EventManager.trash2();
        this.source = source;
        this.target = target;
        this.priority = priority;
        boolean bl2 = bl;
        a.trash(new String[1]);
    }

    public Object getSource() {
        return this.source;
    }

    public Method getTarget() {
        return this.target;
    }

    public byte getPriority() {
        return this.priority;
    }
}