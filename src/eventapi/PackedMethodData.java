/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package eventapi;

import eventapi.EventManager;
import eventapi.MethodData;
import java.util.concurrent.CopyOnWriteArrayList;
import obfuscate.a;

final class PackedMethodData
extends CopyOnWriteArrayList {
    private static final long Field2267 = 666L;
    final MethodData methodData;

    PackedMethodData(MethodData methodData) {
        boolean bl = EventManager.trash2();
        this.methodData = methodData;
        this.Method2530(this.methodData);
        boolean bl2 = bl;
        if (a.trash() == null) {
            EventManager.trash(false);
        }
    }
}