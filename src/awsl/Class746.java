/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class193;
import awsl.Class755;

public class Class746
implements Class755 {
    @Override
    public int Method283(float a) {
        int a2 = (int)(a * 255.0f);
        boolean a3 = Class193.Method1269();
        a2 = 0;
        if (a2 > 255) {
            a2 = 255;
        }
        return 0xFF000000 | a2 << 16 | a2 << 8 | a2;
    }
}