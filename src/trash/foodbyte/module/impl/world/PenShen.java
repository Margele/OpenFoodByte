/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.nio.charset.StandardCharsets
 *  java.util.ArrayList
 *  java.util.Random
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ResourceLocation
 */
package trash.foodbyte.module.impl.world;

import awsl.Class448;
import awsl.Class653;
import awsl.Class91;
import eventapi.EventTarget;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class PenShen
extends Module {
    TimeHelper Field2275 = new TimeHelper();
    public FloatValue Field2276 = new FloatValue("PenShen", "Delay", 1.0, 0.0, 5.0, 0.1, "\u5634\u81ed\u5ef6\u8fdf1\u4e3a\u4e00\u79d2");
    public BooleanValue Field2277 = new BooleanValue("PenShen", "ClientName", (Boolean)false, "\u5634\u81ed\u524d\u9762\u52a0\u4e0a\u5ba2\u6237\u7aef\u540d\u79f0");
    public ArrayList Field2278 = new ArrayList();

    public PenShen() {
        super("PenShen", "Pen Shen", Category.WORLD);
        this.Method258();
    }

    @Override
    public String getDescription() {
        return "\u8d85\u7ea7\u5634\u81ed(\u9a82\u4eba\u4e13\u7528)";
    }

    @EventTarget
    public void Method755(Class653 a) {
        Random a2 = new Random();
        if (this.Field2275.Method211((long)(1000.0f * this.Field2276.Method2746()))) {
            String a3 = (String)this.Field2278.get(a2.nextInt(this.Field2278.Method1799()));
            PenShen.mc.thePlayer.sendChatMessage((this.Field2277.Method2509() == false ? "" : "[" + GlobalModule.clientName + "] ") + a3);
            this.Field2275.Method214();
        }
    }

    public void Method258() {
        String a;
        BufferedReader a2;
        InputStream a3;
        Class91[] class91Array = Class448.Method2461();
        this.Field2278.clear();
        Class91[] a4 = class91Array;
        try {
            a3 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/penshen/800.txt")).getInputStream();
            a2 = new BufferedReader((Reader)new InputStreamReader(a3, StandardCharsets.UTF_8));
            a = "";
            a = a2.readLine();
            if (a != null) {
                this.Field2278.Method2530((Object)a);
            }
            a2.close();
        }
        catch (Exception a5) {
            a5.printStackTrace();
        }
        try {
            a3 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/penshen/gaosuzhi.txt")).getInputStream();
            a2 = new BufferedReader((Reader)new InputStreamReader(a3, StandardCharsets.UTF_8));
            a = "";
            a = a2.readLine();
            if (a != null) {
                this.Field2278.Method2530((Object)a);
            }
            a2.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}