/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 *  net.minecraft.client.gui.ScaledResolution
 */
package trash.foodbyte.notification;

import awsl.Class91;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.ScaledResolution;
import trash.foodbyte.notification.Notification;

public final class NotificationManager {
    protected List Field2090 = new ArrayList();

    /*
     * WARNING - void declaration
     */
    public void Method2730(ScaledResolution a, boolean a2, int a3) {
        void a4;
        List list = this.Method2732();
        Class91[] a5 = Notification.Method2742();
        Notification a6 = null;
        int a7 = 0;
        if (a7 < a4.Method1799()) {
            Notification a8 = (Notification)a4.get(a7);
            if (a8.Method2739()) {
                a6 = a8;
            }
            a8.Method2734(a, a7 + 1, a3);
            ++a7;
        }
        this.Method2732().remove(a6);
    }

    public void addNotification(Notification a) {
        this.Method2732().Method2530((Object)a);
    }

    public List Method2732() {
        return this.Field2090;
    }
}