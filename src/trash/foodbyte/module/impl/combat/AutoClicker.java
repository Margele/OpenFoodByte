/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.world.WorldSettings$GameType
 *  org.lwjgl.input.Mouse
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class46;
import awsl.Class634;
import awsl.Class654;
import awsl.Class749;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.WorldSettings;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class AutoClicker
extends Module {
    public FloatValue Field2553 = new FloatValue("AutoClicker", "StartDelay", 3.0, 0.0, 10.0, 1.0, "\u6309\u4e0b\u5de6\u952e\u5ef6\u8fdf\u51e0tick\u5f00\u59cb\u653b\u51fb");
    public FloatValue Field2554 = new FloatValue("AutoClicker", "MaxCPS", 12.0, 1.0, 20.0, 1.0, "\u6700\u5927CPS");
    public FloatValue Field2555 = new FloatValue("AutoClicker", "MinCPS", 8.0, 1.0, 20.0, 1.0, "\u6700\u5c0fCPS");
    public FloatValue Field2556 = new FloatValue("AutoClicker", "Jitter", 1.0, 0.0, 2.0, 0.1, "\u6296\u52a8\u5e45\u5ea6");
    public BooleanValue Field2557 = new BooleanValue("AutoClicker", "BlockHit", (Boolean)true, "\u683c\u6321\u4e5f\u80fd\u653b\u51fb");
    public BooleanValue Field2558 = new BooleanValue("AutoClicker", "FakeAutoBlock", (Boolean)true, "\u5047\u683c\u6321\u53ea\u6709\u683c\u6321\u7684\u52a8\u753b");
    public BooleanValue Field2559 = new BooleanValue("AutoClicker", "AutoBlock", (Boolean)true, "\u81ea\u52a8\u683c\u6321");
    private double Field2560;
    private double Field2561 = 0.0;
    private TimeHelper Field2562 = new TimeHelper();
    private TimeHelper Field2563 = new TimeHelper();
    Random Field2564 = new Random();

    public AutoClicker() {
        super("AutoClicker", "Auto Clicker", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u81ea\u52a8\u8fde\u70b9";
    }

    @EventTarget
    private void Method801(Class654 a) {
        if (AutoClicker.mc.currentScreen != null) {
            return;
        }
        if (this.Field2563.Method219(100.0) && Mouse.isButtonDown((int)0)) {
            this.Field2560 += 1.0;
            this.Field2563.Method214();
            return;
        }
        if (Mouse.isButtonDown((int)0)) {
            return;
        }
        this.Field2560 = 0.0;
    }

    @EventTarget
    private void Method712(EventMotion a) {
        Class91[] a2 = Class46.Method3239();
        if (a.isPre()) {
            boolean a3;
            boolean bl = a3 = AutoClicker.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && AutoClicker.mc.theWorld.getBlockState(AutoClicker.mc.objectMouseOver.getBlockPos()).getBlock() != Blocks.air && AutoClicker.mc.objectMouseOver.typeOfHit != MovingObjectPosition.MovingObjectType.ENTITY;
            if (!AutoClicker.mc.gameSettings.keyBindAttack.isKeyDown()) {
                return;
            }
            if (AutoClicker.mc.currentScreen != null) {
                return;
            }
            if (this.Field2560 < (double)this.Field2553.Method2746()) {
                return;
            }
            if (AutoClicker.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE) {
                return;
            }
            if (!this.Field2557.Method2509().booleanValue() && AutoClicker.mc.thePlayer.isBlocking()) {
                return;
            }
            if (this.Field2556.Method2744().floatValue() > 0.0f) {
                float a4 = (float)((double)this.Field2556.Method2744().floatValue() * 0.5);
                if (this.Field2564.nextBoolean()) {
                    AutoClicker.mc.thePlayer.rotationYaw += this.Field2564.nextFloat() * a4;
                }
                AutoClicker.mc.thePlayer.rotationYaw -= this.Field2564.nextFloat() * a4;
                if (this.Field2564.nextBoolean()) {
                    AutoClicker.mc.thePlayer.rotationPitch += (float)((double)this.Field2564.nextFloat() * ((double)a4 * 0.75));
                }
                AutoClicker.mc.thePlayer.rotationPitch -= (float)((double)this.Field2564.nextFloat() * ((double)a4 * 0.75));
            }
        }
    }

    @EventTarget
    public void Method232(Class634 a) {
        boolean a2 = AutoClicker.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && AutoClicker.mc.theWorld.getBlockState(AutoClicker.mc.objectMouseOver.getBlockPos()).getBlock() != Blocks.air && AutoClicker.mc.objectMouseOver.typeOfHit != MovingObjectPosition.MovingObjectType.ENTITY;
        this.setDisplayTag("CPS:" + this.Field2555.Method2744() + "-" + this.Field2554.Method2744());
        if (AutoClicker.mc.currentScreen != null) {
            return;
        }
        if (!Mouse.isButtonDown((int)0)) {
            return;
        }
        if (!this.Field2562.Method219(this.Field2561)) {
            return;
        }
        if (this.Field2560 < (double)this.Field2553.Method2746()) {
            return;
        }
        if (AutoClicker.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE) {
            return;
        }
        if (!this.Field2557.Method2509().booleanValue() && AutoClicker.mc.thePlayer.isBlocking()) {
            return;
        }
        if (KillAura.Field2524 != null) {
            return;
        }
        Class749.Method1588(AutoClicker.mc.objectMouseOver.entityHit, this.Field2558.Method2509(), this.Field2559.getValue());
        ReflectionUtils.Method2610(0, true);
        ReflectionUtils.Method2599();
        ReflectionUtils.Method2596(0);
        ReflectionUtils.Method2610(0, false);
        this.Method258();
        this.Field2562.Method214();
    }

    private void Method258() {
        int a = this.Field2554.Method2744().intValue();
        int a2 = this.Field2555.Method2744().intValue();
        this.Field2561 = MathUtils.Method577(a2, a);
    }
}