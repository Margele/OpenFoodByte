/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package trash.foodbyte.irc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PermissionManager {
    public static List permissions;
    private static int[] Field2837;

    public static boolean hasPermission(String permission) {
        int[] a = PermissionManager.Method3697();
        if (permissions.contains((Object)"*.*")) {
            return true;
        }
        int a2 = 0;
        if (a2 < permissions.Method1799()) {
            String a3 = (String)permissions.get(a2);
            if (a3.equalsIgnoreCase(permission)) {
                return true;
            }
            ++a2;
        }
        return false;
    }

    public static boolean canUseModule(String name) {
        if (permissions.contains((Object)"*.*") || permissions.contains((Object)"module.*")) {
            return true;
        }
        return PermissionManager.hasPermission("module." + name);
    }

    public static boolean canUseFeature(String name) {
        if (permissions.contains((Object)"*.*") || permissions.contains((Object)"client.*")) {
            return true;
        }
        return PermissionManager.hasPermission("client." + name);
    }

    static {
        PermissionManager.Method3696(new int[4]);
        permissions = new CopyOnWriteArrayList();
    }

    public static void Method3696(int[] nArray) {
        Field2837 = nArray;
    }

    public static int[] Method3697() {
        return Field2837;
    }
}