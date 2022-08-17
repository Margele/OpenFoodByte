package awsl;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.util.concurrent.TimeUnit;
import obfuscate.a;

public class Class461 extends ChannelInitializer {
   protected void initChannel(Channel a) throws Exception {
      Class604.Method3707();
      a.pipeline().addLast("timeout", new ReadTimeoutHandler(120L, TimeUnit.SECONDS)).addLast("splitter", new Class684()).addLast("decoder", new Class686()).addLast("prepender", new Class693()).addLast("encoder", new Class695()).addLast(new ChannelHandler[]{new Class625()});
      a.trash(new String[3]);
   }

   private static Exception Method2142(Exception exception) {
      return exception;
   }
}
