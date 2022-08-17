package awsl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;

public class Class686 extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext a, ByteBuf a, List a) throws Exception {
      Class234 var4 = new Class234(a);
      if (var4.readableBytes() != 0) {
         int var5 = var4.Method10();
         Class609 var6 = Class610.Method3753().Method3756(var5);
         if (var5 != 62 && var5 != 63) {
         }

         var6.Method687(var4);
         if (var4.readableBytes() > 0) {
            throw new IOException("Packet  (" + var6.getClass().getSimpleName() + ") was larger than I expected, found " + var4.readableBytes() + " bytes extra whilst reading packet " + var6);
         }

         a.Method2530(var6);
      }

   }

   private static Exception Method2142(Exception exception) {
      return exception;
   }
}
