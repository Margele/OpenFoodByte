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
      YggdrasilAuthenticationService a = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
      YggdrasilUserAuthentication a = (YggdrasilUserAuthentication)a.createUserAuthentication(Agent.MINECRAFT);
      a.setUsername(a);
      a.setPassword(a);

      try {
         a.logIn();
         return new Session(a.getSelectedProfile().getName(), a.getSelectedProfile().getId().toString(), a.getAuthenticatedToken(), "mojang");
      } catch (AuthenticationException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public String Method1341() {
      return this.Field3010;
   }

   public void Method1339() {
      String a = AltLogin.Method1809();
      if (this.Field3009.equals("")) {
         ReflectionUtils.setUsername(this.Field3011);
         this.Field3010 = "Logged in. (§a" + this.Field3011 + "§r - cracked name)";
         AltLogin.Field3049 = this.Field3010;
      } else {
         this.Field3010 = "Logging in...";
         AltLogin.Field3049 = this.Field3010;
         Session a = this.Method2636(this.Field3011, this.Field3009);
         this.Field3010 = "§cLogin failed!";
         AltLogin.Field3049 = this.Field3010;
         this.Field3010 = "Logged in. (§a" + a.getUsername() + "§r - Premium Account)";
         AltLogin.Field3049 = this.Field3010;
         ReflectionUtils.setSession(a);
         if (a.trash() == null) {
            AltLogin.Method1808("EHLwQ");
         }

      }
   }

   public void Method1342(String a) {
      this.Field3010 = a;
   }
}
