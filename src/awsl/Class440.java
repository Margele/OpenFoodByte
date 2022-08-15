/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import trash.foodbyte.notification.Notification;

public final class Class440 {
    private long Field2085;
    final Notification Field2086;

    public Class440(Notification a) {
        this.Field2086 = a;
        this.Method2718();
    }

    public long Method2715() {
        return this.Field2085;
    }

    public boolean Method2716(long a) {
        return this.Method2717() > a;
    }

    public long Method2717() {
        return System.currentTimeMillis() - this.Field2085;
    }

    public void Method2718() {
        this.Field2085 = System.currentTimeMillis();
    }
}