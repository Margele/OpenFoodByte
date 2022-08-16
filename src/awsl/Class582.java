/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.network.Packet
 *  net.minecraft.network.login.server.S02PacketLoginSuccess
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.network.play.server.S3EPacketTeams
 *  net.minecraft.util.StringUtils
 */
package awsl;

import awsl.Class372;
import awsl.Class484;
import awsl.Class615;
import eventapi.EventManager;
import eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.util.StringUtils;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.utils.ChatUtils;

public class Class582 {
    public Class582() {
        EventManager.register(this);
        Class372.Method405(this);
    }

    @EventTarget
    public void Method270(EventPacket a) {
        Packet a2 = a.packet;
        if (a.isSend()) {
            // empty if block
        }
        if (a.isRecieve()) {
            if (a2 instanceof S02PacketLoginSuccess || a2 instanceof S07PacketRespawn) {
                Class484.Field2234 = Class615.NONE;
            }
            if (a2 instanceof S3EPacketTeams) {
                S3EPacketTeams a3 = (S3EPacketTeams)a2;
                if (a3.getPrefix().startsWith(" \u00a77\u23e3") && a3.getSuffix().isEmpty()) {
                    this.Method271(a3.getPrefix());
                } else if (a3.getPrefix().startsWith(" \u00a77\u23e3")) {
                    this.Method271(a3.getPrefix() + a3.getSuffix());
                }
                if (a3.getPrefix().startsWith("Cleared:")) {
                    this.Method271(a3.getPrefix());
                }
            }
        }
    }

    public void Method271(String a2) {
        a2 = StringUtils.stripControlCodes((String)a2).replace((CharSequence)" \u23e3 ", (CharSequence)"");
        int[] nArray = Class615.Method3534();
        ChatUtils.debug(a2);
        String string = a2;
        int n = -1;
        int[] a3 = nArray;
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals((Object)"None")) break;
                n = 0;
                a.trash(new String[3]);
            }
            case -725141854: {
                if (!string.equals((Object)"Your Island")) break;
                n = 1;
            }
            case 312628332: {
                if (!string.equals((Object)"The End")) break;
                n = 2;
            }
            case 1036208985: {
                if (!string.equals((Object)"Dragon's Nest")) break;
                n = 3;
            }
            case 641884637: {
                if (!string.equals((Object)"Void Sepulture")) break;
                n = 4;
            }
            case 1652006616: {
                if (!string.equals((Object)"Jungle Island")) break;
                n = 5;
            }
            case 197251312: {
                if (!string.equals((Object)"Savanna Woodland")) break;
                n = 6;
            }
            case 1965349768: {
                if (!string.equals((Object)"Spruce Woods")) break;
                n = 7;
            }
            case 1178975842: {
                if (!string.equals((Object)"Dark Thicket")) break;
                n = 8;
            }
            case 900751258: {
                if (!string.equals((Object)"Birch Park")) break;
                n = 9;
            }
            case 1437466191: {
                if (!string.equals((Object)"Dungeon Hub")) break;
                n = 10;
            }
        }
        switch (n) {
            case 0: {
                Class484.Field2234 = Class615.NONE;
            }
            case 1: {
                Class484.Field2234 = Class615.ISLAND;
            }
            case 2: {
                Class484.Field2234 = Class615.END;
            }
            case 3: {
                Class484.Field2234 = Class615.DRAGON_NEST;
            }
            case 4: {
                Class484.Field2234 = Class615.VOID_SEPULTURE;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                Class484.Field2234 = Class615.WOODS;
            }
            case 10: {
                break;
            }
        }
        if (a2.startsWith("The Catacombs")) {
            Class484.Field2234 = Class615.DUNGEON;
        }
        if (a2.startsWith("Cleared:")) {
            Class484.Field2234 = Class615.DUNGEONING;
        }
    }
}