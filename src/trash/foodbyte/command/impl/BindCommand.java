/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 *  org.lwjgl.input.Keyboard
 */
package trash.foodbyte.command.impl;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;

public class BindCommand
extends Command {
    public BindCommand() {
        super(new String[]{"bind"});
        this.setHelp(".bind <mod> <key>");
    }

    @Override
    public void onCommand(String[] commands) {
        int a = GetDmgCommand.Method3598();
        if (commands.length < 3) {
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText(this.getHelp()));
        }
        String a2 = commands[1];
        int a3 = Keyboard.getKeyIndex((String)commands[2].toUpperCase());
        GlobalModule globalModule = GlobalModule.INSTANCE;
        Iterator iterator = globalModule.Field3172.getAllModules().Method1383();
        while (iterator.Method932()) {
            Module a4 = (Module)iterator.Method933();
            if (!a4.getName().equalsIgnoreCase(a2)) continue;
            a4.Method1021(a3);
            GlobalModule.INSTANCE.fileManager.saveKeys();
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText(String.valueOf((Object)a4.getName()) + " was bound to " + Keyboard.getKeyName((int)a3)));
            return;
        }
        Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText("Cannot find Module : " + a2));
    }
}