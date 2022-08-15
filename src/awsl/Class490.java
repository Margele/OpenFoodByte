/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package awsl;

import awsl.Class533;
import awsl.Class91;
import eventapi.EventManager;
import java.util.concurrent.CopyOnWriteArrayList;

final class Class490
extends CopyOnWriteArrayList {
    private static final long Field2267 = 666L;
    final Class533 Field2268;

    Class490(Class533 class533) {
        boolean bl = EventManager.Method2692();
        this.Field2268 = class533;
        this.Method2530(this.Field2268);
        boolean bl2 = bl;
        if (Class91.Method3648() == null) {
            EventManager.Method2690(false);
        }
    }
}