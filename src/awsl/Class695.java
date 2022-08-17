package awsl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class695 extends MessageToByteEncoder {
   protected void Method2584(ChannelHandlerContext a, Class609 a, ByteBuf a) throws Exception {
      Class234 a = new Class234(a);
      int a = Class610.Method3753().Method3757(a);
      if (a != 62 && a != 63) {
      }

      a.Method9(a);
      a.Method688(a);
   }

   protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
      this.Method2584(channelHandlerContext, (Class609)object, byteBuf);
   }

   private static Exception Method2142(Exception exception) {
      return exception;
   }
}
