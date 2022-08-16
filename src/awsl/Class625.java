/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  org.apache.commons.lang3.Validate
 */
package awsl;

import awsl.Class604;
import awsl.Class607;
import awsl.Class608;
import awsl.Class609;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import obfuscate.a;
import org.apache.commons.lang3.Validate;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class Class625
extends SimpleChannelInboundHandler {
    public Class608 Field2877 = new Class607();

    protected void Method2743(ChannelHandlerContext a, Class609 a2) throws Exception {
        a2.Method694(this.Field2877);
    }

    public void channelActive(ChannelHandlerContext a) throws Exception {
        System.err.println("\u8fde\u63a5");
    }

    public void channelInactive(ChannelHandlerContext a) throws Exception {
        System.err.println("\u65ad\u5f00\u8fde\u63a5");
        ChatUtils.addChatMessageNoPrefix("IRC to disconnect.....");
        GlobalModule.INSTANCE.Field3186.Field2823.clear();
    }

    public void exceptionCaught(ChannelHandlerContext a2, Throwable a3) throws Exception {
        block0: {
            int n = Class604.Method3707();
            ChatUtils.addChatMessageNoPrefix(a3.getMessage());
            int n2 = n;
            a2.channel().close();
            GlobalModule.INSTANCE.Field3186.Field2823.clear();
            a3.printStackTrace();
            if (a.trash() != null) break block0;
            Class604.Method3706(++n2);
        }
    }

    public void Method3493(Class608 a2) {
        Validate.notNull((Object)a2, (String)"packetListener", (Object[])new Object[0]);
        this.Field2877 = a2;
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.Method2743(channelHandlerContext, (Class609)object);
    }

    private static Exception Method2142(Exception exception) {
        return exception;
    }
}