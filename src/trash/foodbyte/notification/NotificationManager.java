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

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.ScaledResolution;
import obfuscate.a;
import trash.foodbyte.notification.Notification;

public final class NotificationManager {
    protected List Field2090 = new ArrayList();

    /*
     * WARNING - void declaration
     */
    public void Method2730(ScaledResolution a2, boolean a3, int a4) {
        void a5;
        List list = this.Method2732();
        a[] a6 = Notification.Method2742();
        Notification a7 = null;
        int a8 = 0;
        if (a8 < a5.Method1799()) {
            Notification a9 = (Notification)a5.get(a8);
            if (a9.Method2739()) {
                a7 = a9;
            }
            a9.Method2734(a2, a8 + 1, a4);
            ++a8;
        }
        this.Method2732().remove(a7);
    }

    public void addNotification(Notification a2) {
        this.Method2732().Method2530((Object)a2);
    }

    public List Method2732() {
        return this.Field2090;
    }
}