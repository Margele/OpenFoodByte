/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.net.Proxy
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.Session
 */
package awsl;

import awsl.Class706;
import awsl.Class91;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import trash.foodbyte.utils.ReflectionUtils;

public final class Class697
extends Thread {
    private final String Field3009;
    private String Field3010;
    private final String Field3011;
    private Minecraft Field3012 = Minecraft.getMinecraft();

    public Class697(String a, String a2) {
        super("Alt Login Thread");
        this.Field3011 = a;
        this.Field3009 = a2;
        Class706.Field3049 = this.Field3010 = "Waiting...";
    }

    private Session Method2636(String a, String a2) {
        YggdrasilAuthenticationService a3 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
        YggdrasilUserAuthentication a4 = (YggdrasilUserAuthentication)a3.createUserAuthentication(Agent.MINECRAFT);
        a4.setUsername(a);
        a4.setPassword(a2);
        try {
            a4.logIn();
            return new Session(a4.getSelectedProfile().getName(), a4.getSelectedProfile().getId().toString(), a4.getAuthenticatedToken(), "mojang");
        }
        catch (AuthenticationException a5) {
            a5.printStackTrace();
            return null;
        }
    }

    public String Method1341() {
        return this.Field3010;
    }

    public void Method1339() {
        String a = Class706.Method1809();
        if (this.Field3009.equals((Object)"")) {
            ReflectionUtils.Method2585(this.Field3011);
            Class706.Field3049 = this.Field3010 = "Logged in. (\u00a7a" + this.Field3011 + "\u00a7r - cracked name)";
            return;
        }
        Class706.Field3049 = this.Field3010 = "Logging in...";
        Session a2 = this.Method2636(this.Field3011, this.Field3009);
        Class706.Field3049 = this.Field3010 = "\u00a7cLogin failed!";
        Class706.Field3049 = this.Field3010 = "Logged in. (\u00a7a" + a2.getUsername() + "\u00a7r - Premium Account)";
        ReflectionUtils.Method2586(a2);
        if (Class91.Method3648() == null) {
            Class706.Method1808("EHLwQ");
        }
    }

    public void Method1342(String a) {
        this.Field3010 = a;
    }
}