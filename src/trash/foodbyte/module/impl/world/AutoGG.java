/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Arrays
 *  net.minecraft.network.play.server.S02PacketChat
 *  net.minecraft.util.EnumChatFormatting
 */
package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.util.Arrays;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class AutoGG
extends Module {
    private final String[] Field2172;
    private final String[] Field2173;
    private int Field2174;

    public AutoGG() {
        a[] aArray = Class448.Method2461();
        super("AutoGG", "Auto GG", Category.WORLD);
        this.Field2172 = new String[]{"1st Killer - ", "1st Place - ", "Winner: ", " - Melee Accuracy - ", "1st - ", "Winning Team - ", "Winners: ", "Winner: ", "Winning Team: ", " win the game!", "Top Seeker: ", "1st Place: ", "Last team standing!", "Winner #1 (", "Top Survivors", "Winners - ", "\u80dc\u5229\u8005\uff1a", "\u51fb\u6740\u6570\u7b2c\u4e00\u540d - ", "\u80dc\u8005 - ", " - \u8fd1\u6218\u547d\u4e2d\u7387 - ", "\u51a0\u519b\uff1a ", "\u7b2c\u4e00\u540d- "};
        this.Field2173 = new String[]{"gg", "GG", "good game", "Good Game"};
        this.Method1033(true);
        a[] aArray2 = aArray;
        if (a.trash() == null) {
            Class448.Method2460(new a[4]);
        }
    }

    @Override
    public String getDescription() {
        return "\u6e38\u620f\u7ed3\u675f\u81ea\u52a8\u6253GG";
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        if (a2.getPacket() instanceof S02PacketChat) {
            S02PacketChat a3 = (S02PacketChat)a2.getPacket();
            if (Arrays.stream((Object[])this.Field2172).anyMatch(arg_0 -> AutoGG.Method2075(a3, arg_0)) && EnumChatFormatting.getTextWithoutFormattingCodes((String)a3.getChatComponent().getUnformattedText()).startsWith(" ")) {
                ++this.Field2174;
                if (this.Field2174 > 3) {
                    this.Field2174 = 0;
                }
                AutoGG.mc.thePlayer.sendChatMessage("/ac " + this.Field2173[this.Field2174]);
            }
        }
    }

    private static boolean Method2075(S02PacketChat a2, String a3) {
        return EnumChatFormatting.getTextWithoutFormattingCodes((String)a2.getChatComponent().getUnformattedText()).contains((CharSequence)a3.toString());
    }
}