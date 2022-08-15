/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 */
package trash.foodbyte.command.impl;

import net.minecraft.client.Minecraft;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.utils.ChatUtils;

public class WDRCommand
extends Command {
    public WDRCommand() {
        super(new String[]{"wdr"});
        this.setHelp("wdr <Playername>");
    }

    @Override
    public void onCommand(String[] commands) {
        int a = GetDmgCommand.Method3598();
        if (commands.length < 2) {
            ChatUtils.addChatMessage(this.getHelp());
        }
        if (commands.length == 2) {
            ChatUtils.addChatMessage("\u00a7cReported \u00a76" + commands[1]);
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + commands[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
        }
        if (commands.length == 3) {
            int a2 = Integer.parseInt((String)commands[2]);
            ChatUtils.addChatMessage("\u00a7cReported \u00a76" + commands[1] + " x" + a2);
            int a3 = 0;
            if (a3 <= a2) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + commands[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
                ++a3;
            }
        }
    }
}