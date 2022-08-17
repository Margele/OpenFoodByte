package awsl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import obfuscate.a;

public class Class693 extends MessageToByteEncoder {
   private static String Field2988;

   protected void Method2534(ChannelHandlerContext a, ByteBuf a, ByteBuf a) {
      Method2536();
      int a = a.readableBytes();
      int a = Class234.Method1612(a);
      if (a > 3) {
         throw new IllegalArgumentException("unable to fit " + a + " into " + 3);
      } else {
         Class234 a = new Class234(a);
         a.ensureWritable(a + a);
         a.Method9(a);
         a.writeBytes(a, a.readerIndex(), a);
         a.trash(new String[1]);
      }
   }

   protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
      this.Method2534(channelHandlerContext, (ByteBuf)object, byteBuf);
   }

   public static void Method2535(String string) {
      Field2988 = string;
   }

   public static String Method2536() {
      return Field2988;
   }

   private static IllegalArgumentException Method2537(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      Method2535((String)null);
   }
}
