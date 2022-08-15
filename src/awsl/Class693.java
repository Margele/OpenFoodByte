/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class234;
import awsl.Class91;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class693
extends MessageToByteEncoder {
    private static String Field2988;

    /*
     * WARNING - void declaration
     */
    protected void Method2534(ChannelHandlerContext a, ByteBuf a2, ByteBuf a3) {
        void a4;
        int a5 = a2.readableBytes();
        int n = Class234.Method1612(a5);
        String a6 = Class693.Method2536();
        if (a4 > 3) {
            throw new IllegalArgumentException("unable to fit " + a5 + " into " + 3);
        }
        Class234 a7 = new Class234(a3);
        a7.ensureWritable((int)(a4 + a5));
        a7.Method9(a5);
        a7.writeBytes(a2, a2.readerIndex(), a5);
        Class91.Method3647(new String[1]);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.Method2534(channelHandlerContext, (ByteBuf)object, byteBuf);
    }

    public static void Method2535(String string) {
        Field2988 = string;
    }

    public static String Method2536() {
        return Field2988;
    }

    private static IllegalArgumentException Method2537(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        Class693.Method2535(null);
    }
}