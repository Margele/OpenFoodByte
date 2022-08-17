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
      byte[] a = new byte[3];
      int a = 0;
      if (a < a.length) {
         if (!a.isReadable()) {
            a.resetReaderIndex();
            return;
         }

         a[a] = a.readByte();
         if (a[a] >= 0) {
            Class234 a = new Class234(Unpooled.wrappedBuffer(a));

            label74: {
               try {
                  int a = a.Method10();
                  if (a.readableBytes() >= a) {
                     a.Method2530(a.readBytes(a));
                     break label74;
                  }

                  a.resetReaderIndex();
               } finally {
                  a.release();
               }

               return;
            }

            if (a.trash() == null) {
               Class693.Method2535("x2OaV");
            }

            return;
         }

         ++a;
      }

      throw new RuntimeException("length wider than 21-bit");
   }

   private static RuntimeException Method2733(RuntimeException runtimeException) {
      return runtimeException;
   }
}
