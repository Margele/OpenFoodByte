/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.List
 */
package awsl;

import awsl.Class234;
import awsl.Class609;
import awsl.Class610;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;

public class Class686
extends ByteToMessageDecoder {
    protected void decode(ChannelHandlerContext a, ByteBuf a2, List a3) throws Exception {
        Class234 a4 = new Class234(a2);
        if (a4.readableBytes() != 0) {
            int a5 = a4.Method10();
            Class609 a6 = Class610.Method3753().Method3756(a5);
            if (a5 == 62 || a5 != 63) {
                // empty if block
            }
            a6.Method687(a4);
            if (a4.readableBytes() > 0) {
                throw new IOException("Packet  (" + a6.getClass().getSimpleName() + ") was larger than I expected, found " + a4.readableBytes() + " bytes extra whilst reading packet " + a6);
            }
            a3.Method2530((Object)a6);
        }
    }

    private static Exception Method2142(Exception exception) {
        return exception;
    }
}