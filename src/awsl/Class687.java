/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  java.lang.Exception
 *  java.lang.Object
 */
package awsl;

import awsl.Class607;
import awsl.Class608;
import awsl.Class609;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public abstract class Class687
extends SimpleChannelInboundHandler {
    private Class608 Field2974 = new Class607();

    protected void Method2743(ChannelHandlerContext a, Class609 a2) throws Exception {
        a2.Method694(this.Field2974);
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.Method2743(channelHandlerContext, (Class609)object);
    }
}