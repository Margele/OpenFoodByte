/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 */
package awsl;

import awsl.Class381;
import awsl.Class521;
import awsl.Class523;
import awsl.Class525;
import awsl.Class527;
import awsl.Class529;
import awsl.Class531;
import awsl.Class534;
import awsl.Class536;
import awsl.Class552;
import awsl.Class562;
import awsl.Class606;
import awsl.Class611;
import awsl.Class91;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.ChatUtils;

public class Class607
implements Class611 {
    private static boolean Field2853;

    @Override
    public void Method3714(Class552 a) {
        String a2 = a.Method692();
        ChatUtils.addChatMessageNoPrefix(a2);
    }

    @Override
    public void Method3715(Class534 a) {
        ChatUtils.addChatMessageNoPrefix(a.Method692());
        GlobalModule.INSTANCE.Field3186.Method3701();
    }

    @Override
    public void Method3716(Class521 a) {
        if (Minecraft.getMinecraft().theWorld != null && Minecraft.getMinecraft().thePlayer != null) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage(a.Method692());
        }
    }

    @Override
    public void Method3717(Class531 a) {
    }

    @Override
    public void Method3718(Class562 a) {
        GlobalModule.INSTANCE.Field3186.Field2823 = (ArrayList)a.Method845();
    }

    @Override
    public void Method3719(Class523 a) {
        String a2 = a.Method692();
        boolean a3 = Class607.Method3733();
        String string = a2;
        int n = -1;
        switch (string.hashCode()) {
            case 1513939: {
                if (!string.equals((Object)"/set")) break;
                n = 0;
                Class91.Method3647(new String[2]);
            }
            case 1496594: {
                if (!string.equals((Object)"/add")) break;
                n = 1;
            }
            case 2123356531: {
                if (!string.equals((Object)"/remove")) break;
                n = 2;
            }
            case 46481497: {
                if (!string.equals((Object)"/data")) break;
                n = 3;
            }
            case 46607857: {
                if (!string.equals((Object)"/hide")) break;
                n = 4;
            }
        }
        switch (n) {
            case 0: {
                int a4;
                if (a.Method846().Field2840.equals((Object)GlobalModule.INSTANCE.Field3186.Field2827.Field2840) && a.Method846().Field2846 == GlobalModule.INSTANCE.Field3186.Field2827.Field2846) {
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2838 = a.Method846().Field2838;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2839 = a.Method846().Field2839;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2843 = a.Method846().Field2843;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2840 = a.Method846().Field2840;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2841 = a.Method846().Field2841;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2842 = a.Method846().Field2842;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2847 = a.Method846().Field2847;
                    GlobalModule.INSTANCE.Field3186.Field2827.Field2848 = a.Method846().Field2848;
                }
                if ((a4 = 0) < GlobalModule.INSTANCE.Field3186.Field2823.Method1799()) {
                    Class606 a5 = (Class606)GlobalModule.INSTANCE.Field3186.Field2823.get(a4);
                    if (a.Method846().Field2840.equals((Object)a5.Field2840) && a.Method846().Field2846 == a5.Field2846) {
                        a5.Field2838 = a.Method846().Field2838;
                        a5.Field2839 = a.Method846().Field2839;
                        a5.Field2843 = a.Method846().Field2843;
                        a5.Field2840 = a.Method846().Field2840;
                        a5.Field2841 = a.Method846().Field2841;
                        a5.Field2842 = a.Method846().Field2842;
                        a5.Field2847 = a.Method846().Field2847;
                        a5.Field2848 = a.Method846().Field2848;
                    }
                    ++a4;
                }
            }
            case 1: {
                GlobalModule.INSTANCE.Field3186.Field2823.Method2530((Object)a.Method846());
            }
            case 2: {
                GlobalModule.INSTANCE.Field3186.Field2823.removeIf(arg_0 -> Class607.Method3730(a, arg_0));
            }
            case 3: {
                GlobalModule.INSTANCE.Field3186.Field2823.forEach(arg_0 -> Class607.Method3729(a, arg_0));
            }
            case 4: {
                GlobalModule.INSTANCE.Field3186.Field2823.forEach(arg_0 -> Class607.Method3728(a, arg_0));
            }
        }
        GlobalModule.INSTANCE.Field3186.Field2823.forEach(arg_0 -> Class607.Method3727(a, a2, arg_0));
    }

    @Override
    public void Method3720(Class527 a) {
        if (a.Method692().equalsIgnoreCase("kick")) {
            Minecraft.getMinecraft().shutdown();
        } else if (Double.parseDouble((String)"5.6") < Double.parseDouble((String)a.Method692())) {
            Minecraft.getMinecraft().shutdown();
        }
    }

    @Override
    public void Method3721(Class525 a) {
        if (Minecraft.getMinecraft().getCurrentServerData() != null) {
            Minecraft.getMinecraft().getNetHandler().getNetworkManager().closeChannel((IChatComponent)new ChatComponentText(a.Method692()));
        }
    }

    @Override
    public void Method3722(Class529 a) {
        GlobalModule.INSTANCE.Field3186.Field2823.forEach(arg_0 -> Class607.Method3726(a, arg_0));
    }

    @Override
    public void Method3723(Class536 a) {
        if (a.Method845() != null) {
            PermissionManager.permissions = a.Method845();
        }
        if (PermissionManager.canUseFeature("multi")) {
            ((KillAura)ModuleManager.getModule2(KillAura.class)).Field2504.Method2721("Multi");
        } else {
            ((KillAura)ModuleManager.getModule2(KillAura.class)).Field2504.Method2722("Multi");
        }
        if (PermissionManager.canUseFeature("irclist")) {
            GlobalModule.INSTANCE.Field3190.Field3056.forEach(Class607::Method3725);
        } else {
            GlobalModule.INSTANCE.Field3190.Field3056.forEach(Class607::Method3724);
        }
        Iterator iterator = ModuleManager.getAllModules().Method1383();
        while (iterator.Method932()) {
            Module a2 = (Module)iterator.Method933();
            if (!a2.canUse() || !a2.getState()) continue;
            a2.setState(!a2.getState());
        }
    }

    private static void Method3724(Class381 a) {
        if (a.Method1395().equalsIgnoreCase("IRC")) {
            a.Method1407(false);
        }
    }

    private static void Method3725(Class381 a) {
        if (a.Method1395().equalsIgnoreCase("IRC")) {
            a.Method1407(true);
        }
    }

    private static void Method3726(Class529 a, Class606 a2) {
        if (a.Method883().equals((Object)a2.Field2840) && a.Method691() == a2.Field2846) {
            a2.Field2849 = a.Method692();
            a2.Field2850 = a.Method860();
            a2.Field2851 = System.currentTimeMillis();
        }
    }

    private static void Method3727(Class523 a, String a2, Class606 a3) {
        if (a.Method846().Field2840.equals((Object)a3.Field2840) && a.Method846().Field2846 == a3.Field2846) {
            a3.Field2841 = a2;
        }
    }

    private static void Method3728(Class523 a, Class606 a2) {
        if (a.Method846().Field2840.equals((Object)a2.Field2840) && a.Method846().Field2846 == a2.Field2846) {
            a2.Field2847 = a.Method846().Field2847;
        }
    }

    private static void Method3729(Class523 a, Class606 a2) {
        if (a.Method846().Field2840.equals((Object)a2.Field2840) && a.Method846().Field2846 == a2.Field2846) {
            GlobalModule.INSTANCE.Field3186.Field2827 = a.Method846();
        }
    }

    private static boolean Method3730(Class523 a, Class606 a2) {
        return a.Method846().Field2840.equals((Object)a2.Field2840) && a.Method846().Field2846 == a2.Field2846;
    }

    public static void Method3731(boolean bl) {
        Field2853 = bl;
    }

    public static boolean Method3732() {
        return Field2853;
    }

    public static boolean Method3733() {
        boolean bl = Class607.Method3732();
        return true;
    }

    static {
        Class607.Method3731(false);
    }
}