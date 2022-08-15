/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class15;
import awsl.Class224;
import awsl.Class422;
import awsl.Class45;
import awsl.Class628;
import awsl.Class673;
import native0.Class614;

public class Class407
implements Class422,
Class45 {
    @Override
    public void Method1361(Class224 a, String a2) {
    }

    static {
        Class614.Method2232(28, Class407.class);
        Class407.Method2659();
    }

    @Class628
    public native void Method1362(Class15 var1, String var2);

    @Override
    public String[] Method1360() {
        return new String[]{Class673.GuiChat.Method2340()};
    }

    @Override
    public void Method1359(Class15 a, String a2) {
        this.Method1362(a, a2);
    }

    private static native /* synthetic */ void Method2659();
}