package awsl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;

public class Class686 extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext a, ByteBuf a, List a) throws Exception {
      Class234 a = new Class234(a);
      if (a.readableBytes() != 0) {
         int a = a.Method10();
         Class609 a = Class610.Method3753().Method3756(a);
         if (a != 62 && a != 63) {
         }

         a.Method687(a);
         if (a.readableBytes() > 0) {
            throw new IOException("Packet  (" + a.getClass().getSimpleName() + ") was larger than I expected, found " + a.readableBytes() + " bytes extra whilst reading packet " + a);
         }

         a.Method2530(a);
      }

   }

   private static Exception Method2142(Exception exception) {
      return exception;
   }
}
