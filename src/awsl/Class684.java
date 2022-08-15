/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package awsl;

import awsl.Class234;
import awsl.Class693;
import awsl.Class91;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

public class Class684
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    protected void decode(ChannelHandlerContext a, ByteBuf a2, List a3) {
        void a4;
        a2.markReaderIndex();
        byte[] a5 = new byte[3];
        boolean bl = false;
        String a6 = Class693.Method2536();
        if (a4 < a5.length) {
            if (!a2.isReadable()) {
                a2.resetReaderIndex();
                return;
            }
            a5[a4] = a2.readByte();
            if (a5[a4] >= 0) {
                Class234 a7 = new Class234(Unpooled.wrappedBuffer((byte[])a5));
                try {
                    int a8 = a7.Method10();
                    if (a2.readableBytes() < a8) {
                        a2.resetReaderIndex();
                        return;
                    }
                    a3.Method2530((Object)a2.readBytes(a8));
                }
                finally {
                    a7.release();
                }
                if (Class91.Method3648() == null) {
                    Class693.Method2535("x2OaV");
                }
                return;
            }
            ++a4;
        }
        throw new RuntimeException("length wider than 21-bit");
    }

    private static RuntimeException Method2733(RuntimeException runtimeException) {
        return runtimeException;
    }
}