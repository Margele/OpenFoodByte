/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  net.minecraft.client.Minecraft
 */
package trash.foodbyte.command;

import awsl.Class91;
import net.minecraft.client.Minecraft;

public class Command {
    public Minecraft mc = Minecraft.getMinecraft();
    private String[] commands;
    private String help;
    private static int Field3239;

    public Command(String[] a) {
        this.commands = a;
    }

    public String[] getCommands() {
        return this.commands;
    }

    public String getName() {
        return this.commands[0];
    }

    public void onCommand(String[] commands) {
    }

    public void setHelp(String a) {
        this.help = a;
    }

    public String getHelp() {
        return this.help;
    }

    public static String Method1663(String[] a, String a2, int a3, int a4) {
        int a5 = Command.Method1665();
        a3 = 0;
        if (a4 > a.length) {
            a4 = a.length;
        }
        StringBuilder a6 = new StringBuilder();
        int a7 = a3;
        if (a7 < a4) {
            a6.append(a[a7]).append(a2);
            ++a7;
        }
        String string = a6.substring(0, a6.toString().length() - 1);
        if (Class91.Method3648() == null) {
            Command.Method1664(++a5);
        }
        return string;
    }

    public static void Method1664(int n) {
        Field3239 = n;
    }

    public static int Method1665() {
        return Field3239;
    }

    public static int Method1666() {
        int n = Command.Method1665();
        return 117;
    }

    static {
        if (Command.Method1665() != 0) {
            Command.Method1664(9);
        }
    }
}