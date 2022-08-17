package awsl;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public abstract class Class687 extends SimpleChannelInboundHandler {
   private Class608 Field2974 = new Class607();

   protected void Method2743(ChannelHandlerContext a, Class609 a) throws Exception {
      a.Method694(this.Field2974);
   }

   protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
      this.Method2743(channelHandlerContext, (Class609)object);
   }
}
