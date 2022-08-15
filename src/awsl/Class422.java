/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class15;
import awsl.Class224;

public interface Class422 {
    public String[] Method1360();

    public void Method1361(Class224 var1, String var2);

    public void Method1359(Class15 var1, String var2);

    default public boolean Method2413(String a, String[] a2) {
        String[] stringArray = a2;
        int n = stringArray.length;
        int n2 = 0;
        String a3 = Class119.Method497();
        if (n2 < n) {
            String a4 = stringArray[n2];
            if (a.equals((Object)a4)) {
                return true;
            }
            ++n2;
        }
        return false;
    }
}