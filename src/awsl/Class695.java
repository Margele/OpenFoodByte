/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  java.lang.Exception
 *  java.lang.Object
 */
package awsl;

import awsl.Class234;
import awsl.Class609;
import awsl.Class610;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class695
extends MessageToByteEncoder {
    protected void Method2584(ChannelHandlerContext a, Class609 a2, ByteBuf a3) throws Exception {
        Class234 a4 = new Class234(a3);
        int a5 = Class610.Method3753().Method3757(a2);
        if (a5 == 62 || a5 != 63) {
            // empty if block
        }
        a4.Method9(a5);
        a2.Method688(a4);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.Method2584(channelHandlerContext, (Class609)object, byteBuf);
    }

    private static Exception Method2142(Exception exception) {
        return exception;
    }
}