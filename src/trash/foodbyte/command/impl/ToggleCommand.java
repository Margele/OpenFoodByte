/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 */
package trash.foodbyte.command.impl;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;

public class ToggleCommand
extends Command {
    public ToggleCommand() {
        super(new String[]{"toggle", "t"});
        this.setHelp("toggle <mod>");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onCommand(String[] commands) {
        int a = GetDmgCommand.Method3598();
        if (commands.length != 2) {
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText(this.getHelp()));
        }
        boolean a2 = false;
        Iterator iterator = ModuleManager.getAllModules().Method1383();
        while (iterator.Method932()) {
            Module a3;
            block5: {
                boolean bl;
                Module module;
                a3 = (Module)iterator.Method933();
                if (!commands[1].equalsIgnoreCase(a3.getName())) continue;
                try {
                    module = a3;
                    bl = !a3.getState();
                }
                catch (Exception a4) {
                    a4.printStackTrace();
                    break block5;
                }
                {
                    module.setState(bl);
                }
            }
            a2 = true;
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText(a3.getName() + " was toggled"));
            break;
        }
        Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText("Cannot find Module : " + commands[1]));
    }

    private static Exception Method1641(Exception exception) {
        return exception;
    }
}