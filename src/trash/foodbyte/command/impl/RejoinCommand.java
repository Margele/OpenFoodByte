/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.play.server.S01PacketJoinGame
 */
package trash.foodbyte.command.impl;

import eventapi.EventManager;
import eventapi.EventTarget;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.S01PacketJoinGame;
import obfuscate.a;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.event.EventPacket;

public class RejoinCommand
extends Command {
    public final Minecraft mc2;

    public RejoinCommand() {
        super(new String[]{"rejoin", "r"});
        int n = GetDmgCommand.Method3599();
        this.mc2 = Minecraft.getMinecraft();
        this.setHelp("Rejoin");
        int n2 = n;
        a.trash(new String[4]);
    }

    @Override
    public void onCommand(String[] commands) {
        this.mc2.thePlayer.sendChatMessage("/l");
        EventManager.register(this);
    }

    @EventTarget
    public void Method3573(EventPacket packet) {
        if (packet.getPacket() instanceof S01PacketJoinGame) {
            this.mc2.thePlayer.sendChatMessage("/rejoin");
            EventManager.unregister(this);
        }
    }
}