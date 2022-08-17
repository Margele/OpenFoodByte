package awsl;

import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import obfuscate.a;
import trash.foodbyte.gui.AltLogin;
import trash.foodbyte.reflections.ReflectionUtils;

public final class Class697 extends Thread {
   private final String Field3009;
   private String Field3010;
   private final String Field3011;
   private Minecraft Field3012 = Minecraft.getMinecraft();

   public Class697(String a, String a) {
      super("Alt Login Thread");
      this.Field3011 = a;
      this.Field3009 = a;
      this.Field3010 = "Waiting...";
      AltLogin.Field3049 = this.Field3010;
   }

   private Session Method2636(String a, String a) {
      YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
      YggdrasilUserAuthentication var4 = (YggdrasilUserAuthentication)var3.createUserAuthentication(Agent.MINECRAFT);
      var4.setUsername(a);
      var4.setPassword(a);

      try {
         var4.logIn();
         return new Session(var4.getSelectedProfile().getName(), var4.getSelectedProfile().getId().toString(), var4.getAuthenticatedToken(), "mojang");
      } catch (AuthenticationException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public String Method1341() {
      return this.Field3010;
   }

   public void Method1339() {
      String var1 = AltLogin.Method1809();
      if (this.Field3009.equals("")) {
         ReflectionUtils.setUsername(this.Field3011);
         this.Field3010 = "Logged in. (§a" + this.Field3011 + "§r - cracked name)";
         AltLogin.Field3049 = this.Field3010;
      } else {
         this.Field3010 = "Logging in...";
         AltLogin.Field3049 = this.Field3010;
         Session var2 = this.Method2636(this.Field3011, this.Field3009);
         this.Field3010 = "§cLogin failed!";
         AltLogin.Field3049 = this.Field3010;
         this.Field3010 = "Logged in. (§a" + var2.getUsername() + "§r - Premium Account)";
         AltLogin.Field3049 = this.Field3010;
         ReflectionUtils.setSession(var2);
         if (a.trash() == null) {
            AltLogin.Method1808("EHLwQ");
         }

      }
   }

   public void Method1342(String a) {
      this.Field3010 = a;
   }
}
