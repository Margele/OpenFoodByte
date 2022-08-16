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
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import obfuscate.a;

public class Class684
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    protected void decode(ChannelHandlerContext a2, ByteBuf a3, List a4) {
        void a5;
        a3.markReaderIndex();
        byte[] a6 = new byte[3];
        boolean bl = false;
        String a7 = Class693.Method2536();
        if (a5 < a6.length) {
            if (!a3.isReadable()) {
                a3.resetReaderIndex();
                return;
            }
            a6[a5] = a3.readByte();
            if (a6[a5] >= 0) {
                Class234 a8 = new Class234(Unpooled.wrappedBuffer((byte[])a6));
                try {
                    int a9 = a8.Method10();
                    if (a3.readableBytes() < a9) {
                        a3.resetReaderIndex();
                        return;
                    }
                    a4.Method2530((Object)a3.readBytes(a9));
                }
                finally {
                    a8.release();
                }
                if (a.trash() == null) {
                    Class693.Method2535("x2OaV");
                }
                return;
            }
            ++a5;
        }
        throw new RuntimeException("length wider than 21-bit");
    }

    private static RuntimeException Method2733(RuntimeException runtimeException) {
        return runtimeException;
    }
}