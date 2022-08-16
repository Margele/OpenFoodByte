/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package awsl;

import awsl.Class604;
import awsl.Class625;
import awsl.Class684;
import awsl.Class686;
import awsl.Class693;
import awsl.Class695;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.util.concurrent.TimeUnit;
import obfuscate.a;

public class Class461
extends ChannelInitializer {
    protected void initChannel(Channel a2) throws Exception {
        int n = Class604.Method3707();
        a2.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(120L, TimeUnit.SECONDS)).addLast("splitter", (ChannelHandler)new Class684()).addLast("decoder", (ChannelHandler)new Class686()).addLast("prepender", (ChannelHandler)new Class693()).addLast("encoder", (ChannelHandler)new Class695()).addLast(new ChannelHandler[]{new Class625()});
        int n2 = n;
        a.trash(new String[3]);
    }

    private static Exception Method2142(Exception exception) {
        return exception;
    }
}