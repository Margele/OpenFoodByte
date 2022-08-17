package awsl;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import obfuscate.a;

public class Class684 extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext a, ByteBuf a, List a) {
      a.markReaderIndex();
      Class693.Method2536();
      byte[] var5 = new byte[3];
      int var6 = 0;
      if (var6 < var5.length) {
         if (!a.isReadable()) {
            a.resetReaderIndex();
            return;
         }

         var5[var6] = a.readByte();
         if (var5[var6] >= 0) {
            Class234 var7 = new Class234(Unpooled.wrappedBuffer(var5));

            label74: {
               try {
                  int var8 = var7.Method10();
                  if (a.readableBytes() >= var8) {
                     a.Method2530(a.readBytes(var8));
                     break label74;
                  }

                  a.resetReaderIndex();
               } finally {
                  var7.release();
               }

               return;
            }

            if (a.trash() == null) {
               Class693.Method2535("x2OaV");
            }

            return;
         }

         ++var6;
      }

      throw new RuntimeException("length wider than 21-bit");
   }

   private static RuntimeException Method2733(RuntimeException runtimeException) {
      return runtimeException;
   }
}
