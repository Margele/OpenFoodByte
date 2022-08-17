package awsl;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import obfuscate.a;
import org.apache.commons.lang3.Validate;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class Class625 extends SimpleChannelInboundHandler {
   public Class608 Field2877 = new Class607();

   protected void Method2743(ChannelHandlerContext a, Class609 a) throws Exception {
      a.Method694(this.Field2877);
   }

   public void channelActive(ChannelHandlerContext a) throws Exception {
      System.err.println("连接");
   }

   public void channelInactive(ChannelHandlerContext a) throws Exception {
      System.err.println("断开连接");
      ChatUtils.addChatMessageNoPrefix("IRC to disconnect.....");
      GlobalModule.INSTANCE.balant.Field2823.clear();
   }

   public void exceptionCaught(ChannelHandlerContext a, Throwable a) throws Exception {
      int var10000 = Class604.Method3707();
      ChatUtils.addChatMessageNoPrefix(a.getMessage());
      int var3 = var10000;
      a.channel().close();
      GlobalModule.INSTANCE.balant.Field2823.clear();
      a.printStackTrace();
      if (a.trash() == null) {
         ++var3;
         Class604.Method3706(var3);
      }

   }

   public void Method3493(Class608 a) {
      Validate.notNull(a, "packetListener", new Object[0]);
      this.Field2877 = a;
   }

   protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
      this.Method2743(channelHandlerContext, (Class609)object);
   }

   private static Exception Method2142(Exception exception) {
      return exception;
   }
}
