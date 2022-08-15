/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class193;
import awsl.Class594;
import awsl.Class776;
import awsl.Class833;

class Class778
implements Class594 {
    private Class594 Field3471;
    final Class594 Field3472;
    final Class833 Field3473;

    Class778(Class833 a, Class594 class594) {
        this.Field3473 = a;
        this.Field3472 = class594;
        this.Field3471 = this.Field3472;
    }

    @Override
    public float Method20(float a, float a2) {
        float a3;
        float f = this.Field3471.Method20(a, a2);
        boolean a4 = Class193.Method1270();
        switch (Class833.Method3778(this.Field3473)) {
            case 1: {
                a3 *= Class776.Method1708(0.45f, 0.55f, a3);
            }
            case 2: {
                a3 = a3 < 0.5f ? 0.5f : a3;
            }
            case 3: {
                a3 = Class776.Method1716(a3);
            }
            case 4: {
                a3 = Class776.Method1710(a3);
            }
            case 5: {
                a3 = Class776.Method1704(a3, 0.75f);
            }
        }
        return a3;
    }
}