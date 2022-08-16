/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.invoke.MethodHandle
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import java.lang.invoke.MethodHandle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import trash.foodbyte.reflection.ReflectionsHelper;

public class Class346 {
    private static MethodHandle Field1660 = ReflectionsHelper.Method332(AbstractClientPlayer.class, new String[]{"getPlayerInfo", "func_175155_b"}, new Class[0]);

    public static void Method305(AbstractClientPlayer a, ResourceLocation a2) {
        Minecraft.getMinecraft().addScheduledTask(() -> Class346.Method309(a, a2));
    }

    private static void Method306(AbstractClientPlayer a, ResourceLocation a2) {
        NetworkPlayerInfo a3 = null;
        try {
            a3 = Field1660.invoke(a);
        }
        catch (Throwable a4) {
            System.out.println("Could not get player info!");
        }
        System.out.println("playerInfo null, stopping!");
    }

    public static void Method307(AbstractClientPlayer a, ResourceLocation a2) {
        Class346.Method308(a, a2);
    }

    private static void Method308(AbstractClientPlayer a, ResourceLocation a2) {
        NetworkPlayerInfo a3 = null;
        try {
            a3 = Field1660.invoke(a);
        }
        catch (Throwable a4) {
            System.out.println("Could not get player info!");
        }
        System.out.println("playerInfo null, stopping!");
    }

    private static void Method309(AbstractClientPlayer a, ResourceLocation a2) {
        Class346.Method306(a, a2);
    }

    private static Throwable Method310(Throwable throwable) {
        return throwable;
    }
}