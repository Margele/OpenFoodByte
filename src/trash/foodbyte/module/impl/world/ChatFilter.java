/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.concurrent.ThreadLocalRandom
 *  java.util.stream.Stream
 *  net.minecraft.network.play.client.C01PacketChatMessage
 */
package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import net.minecraft.network.play.client.C01PacketChatMessage;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflection.ReflectionsHelper;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.value.ModeValue;

public class ChatFilter
extends Module {
    public ModeValue Field2183 = new ModeValue("ChatFilter", "Filter Mode", "Insert", new String[]{"Insert"}, "\u6a21\u5f0f{Insert}");
    private int Field2184 = 0;

    public ChatFilter() {
        super("ChatFilter", "Chat Filter", Category.WORLD);
    }

    @Override
    public String getDescription() {
        return "\u804a\u5929\u7ed5\u8fc7(\u652f\u6301\u5237\u5c4f+\u9a82\u4eba)";
    }

    @EventTarget
    public void Method755(EventTick a) {
        this.setDisplayTag(this.Field2183.getMode());
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        a[] a3 = Class448.Method2461();
        if (a2.getPacket() instanceof C01PacketChatMessage) {
            C01PacketChatMessage a4 = (C01PacketChatMessage)a2.getPacket();
            String a5 = a4.getMessage();
            Object[] a6 = a5.split(" ");
            String a7 = a6[0];
            if (a5.startsWith("/") && Stream.of((Object[])new String[]{"/r", "/shout", "/msg", "/m", "/tell", "/whisper", "/w", "/ac", "/pc", "/gc"}).anyMatch(arg_0 -> ((String)a7).equalsIgnoreCase(arg_0))) {
                if (Stream.of((Object[])new String[]{"/r", "/shout", "/ac", "/pc", "/gc"}).anyMatch(arg_0 -> ((String)a7).equalsIgnoreCase(arg_0))) {
                    ReflectionsHelper.setFinalField(a4, ObfuscatedField.chatmessage.getObfuscatedName(), a6[0] + " " + this.Method2083(String.join((CharSequence)" ", (CharSequence[])((CharSequence[])Arrays.copyOfRange((Object[])a6, (int)1, (int)a6.length)))), false);
                }
                if (a6.length > 1) {
                    ReflectionsHelper.setFinalField(a4, ObfuscatedField.chatmessage.getObfuscatedName(), a6[0] + " " + (String)a6[1] + " " + this.Method2083(String.join((CharSequence)" ", (CharSequence[])((CharSequence[])Arrays.copyOfRange((Object[])a6, (int)2, (int)a6.length)))), false);
                }
            }
            if (!(a4.getMessage().startsWith("/") || a4.getMessage().startsWith(".") || a4.getMessage().startsWith("http") || a5.equalsIgnoreCase("gg") || a5.equalsIgnoreCase("good game"))) {
                ReflectionsHelper.setFinalField(a4, ObfuscatedField.chatmessage.getObfuscatedName(), this.Method2083(a5), false);
            }
        }
    }

    private String Method2082(String a2) {
        char[] a3;
        StringBuilder a4 = new StringBuilder();
        for (char a5 : a3 = a2.toCharArray()) {
            a4.append(a5).append('\u05fc');
        }
        return a4.toString();
    }

    private String Method2083(String a2) {
        StringBuilder a3 = new StringBuilder();
        a[] a4 = Class448.Method2461();
        int n = 0;
        char[] cArray = a2.toCharArray();
        int n2 = cArray.length;
        if (n < n2) {
            char a5 = cArray[n];
            if (a5 >= '!') {
                ++this.Field2184;
                a3.append(a5).append(this.Method2084());
            }
            a3.append(a5);
            ++n;
        }
        return a3.toString();
    }

    private String Method2084() {
        this.Field2184 = ThreadLocalRandom.current().nextInt(10);
        switch (this.Field2184) {
            case 0: {
                return "\u0379";
            }
            case 1: {
                return "\u0378";
            }
            case 2: {
                return "\u0381";
            }
            case 3: {
                return "\u0379";
            }
            case 4: {
                return "\u0382";
            }
            case 5: {
                return "\u0882";
            }
            case 6: {
                return "\u0887";
            }
            case 7: {
                return "\u0895";
            }
            case 8: {
                return "\u0898";
            }
            case 9: {
                return "\u0899";
            }
            case 10: {
                return "\u0383";
            }
        }
        if (this.Field2184 > 11) {
            this.Field2184 = 0;
        }
        return "\u0897";
    }
}