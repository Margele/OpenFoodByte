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

import net.minecraft.client.Minecraft;
import obfuscate.a;

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

    public static String Method1663(String[] a2, String a3, int a4, int a5) {
        int a6 = Command.Method1665();
        a4 = 0;
        if (a5 > a2.length) {
            a5 = a2.length;
        }
        StringBuilder a7 = new StringBuilder();
        int a8 = a4;
        if (a8 < a5) {
            a7.append(a2[a8]).append(a3);
            ++a8;
        }
        String string = a7.substring(0, a7.toString().length() - 1);
        if (a.trash() == null) {
            Command.Method1664(++a6);
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