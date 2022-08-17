package awsl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class695 extends MessageToByteEncoder {
   protected void Method2584(ChannelHandlerContext a, Class609 a, ByteBuf a) throws Exception {
      Class234 var4 = new Class234(a);
      int var5 = Class610.Method3753().Method3757(a);
      if (var5 != 62 && var5 != 63) {
      }

      var4.Method9(var5);
      a.Method688(var4);
   }

   protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
      this.Method2584(channelHandlerContext, (Class609)object, byteBuf);
   }

   private static Exception Method2142(Exception exception) {
      return exception;
   }
}
