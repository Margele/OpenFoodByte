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

import eventapi.EventTarget;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.WorldSettings;
import obfuscate.a;
import obfuscate.b;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class AutoClicker
extends Module {
    public FloatValue startDelay = new FloatValue("AutoClicker", "StartDelay", 3.0, 0.0, 10.0, 1.0, "\u6309\u4e0b\u5de6\u952e\u5ef6\u8fdf\u51e0tick\u5f00\u59cb\u653b\u51fb");
    public FloatValue maxCps = new FloatValue("AutoClicker", "MaxCPS", 12.0, 1.0, 20.0, 1.0, "\u6700\u5927CPS");
    public FloatValue minCps = new FloatValue("AutoClicker", "MinCPS", 8.0, 1.0, 20.0, 1.0, "\u6700\u5c0fCPS");
    public FloatValue jitter = new FloatValue("AutoClicker", "Jitter", 1.0, 0.0, 2.0, 0.1, "\u6296\u52a8\u5e45\u5ea6");
    public BooleanValue blockHit = new BooleanValue("AutoClicker", "BlockHit", (Boolean)true, "\u683c\u6321\u4e5f\u80fd\u653b\u51fb");
    public BooleanValue fakeAutoBlock = new BooleanValue("AutoClicker", "FakeAutoBlock", (Boolean)true, "\u5047\u683c\u6321\u53ea\u6709\u683c\u6321\u7684\u52a8\u753b");
    public BooleanValue autoBlock = new BooleanValue("AutoClicker", "AutoBlock", (Boolean)true, "\u81ea\u52a8\u683c\u6321");
    private double cps;
    private double delay = 0.0;
    private TimeHelper timer1 = new TimeHelper();
    private TimeHelper timer2 = new TimeHelper();
    Random random = new Random();

    public AutoClicker() {
        super("AutoClicker", "Auto Clicker", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u81ea\u52a8\u8fde\u70b9";
    }

    @EventTarget
    private void onTickUpdate(EventTickUpdate e) {
        if (AutoClicker.mc.currentScreen != null) {
            return;
        }
        if (this.timer2.isDelayComplete(100.0) && Mouse.isButtonDown((int)0)) {
            this.cps += 1.0;
            this.timer2.reset();
            return;
        }
        if (Mouse.isButtonDown((int)0)) {
            return;
        }
        this.cps = 0.0;
    }

    @EventTarget
    private void onMotion(EventMotion e) {
        a[] a2 = b.trash();
        if (e.isPre()) {
            boolean a3;
            boolean bl = a3 = AutoClicker.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && AutoClicker.mc.theWorld.getBlockState(AutoClicker.mc.objectMouseOver.getBlockPos()).getBlock() != Blocks.air && AutoClicker.mc.objectMouseOver.typeOfHit != MovingObjectPosition.MovingObjectType.ENTITY;
            if (!AutoClicker.mc.gameSettings.keyBindAttack.isKeyDown()) {
                return;
            }
            if (AutoClicker.mc.currentScreen != null) {
                return;
            }
            if (this.cps < (double)this.startDelay.getFloatValueCast()) {
                return;
            }
            if (AutoClicker.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE) {
                return;
            }
            if (!this.blockHit.getBooleanValue().booleanValue() && AutoClicker.mc.thePlayer.isBlocking()) {
                return;
            }
            if (this.jitter.getFloatValue().floatValue() > 0.0f) {
                float a4 = (float)((double)this.jitter.getFloatValue().floatValue() * 0.5);
                if (this.random.nextBoolean()) {
                    AutoClicker.mc.thePlayer.rotationYaw += this.random.nextFloat() * a4;
                }
                AutoClicker.mc.thePlayer.rotationYaw -= this.random.nextFloat() * a4;
                if (this.random.nextBoolean()) {
                    AutoClicker.mc.thePlayer.rotationPitch += (float)((double)this.random.nextFloat() * ((double)a4 * 0.75));
                }
                AutoClicker.mc.thePlayer.rotationPitch -= (float)((double)this.random.nextFloat() * ((double)a4 * 0.75));
            }
        }
    }

    @EventTarget
    public void onUpdate(EventUpdate e) {
        boolean a2 = AutoClicker.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && AutoClicker.mc.theWorld.getBlockState(AutoClicker.mc.objectMouseOver.getBlockPos()).getBlock() != Blocks.air && AutoClicker.mc.objectMouseOver.typeOfHit != MovingObjectPosition.MovingObjectType.ENTITY;
        this.setDisplayTag("CPS:" + this.minCps.getFloatValue() + "-" + this.maxCps.getFloatValue());
        if (AutoClicker.mc.currentScreen != null) {
            return;
        }
        if (!Mouse.isButtonDown((int)0)) {
            return;
        }
        if (!this.timer1.isDelayComplete(this.delay)) {
            return;
        }
        if (this.cps < (double)this.startDelay.getFloatValueCast()) {
            return;
        }
        if (AutoClicker.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE) {
            return;
        }
        if (!this.blockHit.getBooleanValue().booleanValue() && AutoClicker.mc.thePlayer.isBlocking()) {
            return;
        }
        if (KillAura.target != null) {
            return;
        }
        PlayerUtils.rightClickEntity(AutoClicker.mc.objectMouseOver.entityHit, this.fakeAutoBlock.getBooleanValue(), this.autoBlock.getValue());
        ReflectionUtils.postForgeMouseInputEvent(0, true);
        ReflectionUtils.clickMouse();
        ReflectionUtils.setLeftClickCounter(0);
        ReflectionUtils.postForgeMouseInputEvent(0, false);
        this.resetDelay();
        this.timer1.reset();
    }

    private void resetDelay() {
        int a2 = this.maxCps.getFloatValue().intValue();
        int a3 = this.minCps.getFloatValue().intValue();
        this.delay = MathUtils.getRandomDouble(a3, a2);
    }
}