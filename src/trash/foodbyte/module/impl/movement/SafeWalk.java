/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockTallGrass
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.MathHelper
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import eventapi.EventTarget;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class SafeWalk
extends Module {
    private BlockPos Field2442;
    private EnumFacing Field2443;
    private boolean Field2444 = false;
    private boolean Field2445 = false;
    private boolean Field2446 = false;
    private long Field2447;
    private final int Field2448;
    public ModeValue Field2449 = new ModeValue("SafeWalk", "Mode", "Vanilla", new String[]{"Vanilla", "Sneak", "Insane"}, "{\u9760\u8fd1\u8fb9\u7f18\u4e0d\u8e72\u4e5f\u4e0d\u6389\u4e0b\u53bb,\u8fb9\u7f18\u81ea\u52a8\u8e72\u4e0b}");
    public FloatValue Field2450 = new FloatValue("SafeWalk", "Walk High", 4.0, 1.0, 10.0, 1.0, "");
    public BooleanValue Field2451 = new BooleanValue("SafeWalk", "AutoClick", (Boolean)false, "\u7784\u51c6\u65b9\u5757\u81ea\u52a8\u53f3\u952e\u653e\u65b9\u5757");
    public BooleanValue Field2452 = new BooleanValue("SafeWalk", "FallToggle", (Boolean)false, "\u6389\u843d\u81ea\u52a8\u5173\u95ed\u529f\u80fd");
    public BooleanValue Field2453 = new BooleanValue("SafeWalk", "JumpToggle", (Boolean)false, "\u8df3\u8dc3\u81ea\u52a8\u5173\u95ed\u529f\u80fd");

    public SafeWalk() {
        super("SafeWalk", "Safe Walk", Category.MOVEMENT);
        this.Field2447 = System.currentTimeMillis();
        this.Field2448 = 290;
    }

    @Override
    public String getDescription() {
        return "\u5b89\u5168\u6b65\u884c(\u65b9\u5757\u8fb9\u7f18\u4e0d\u6389\u843d)";
    }

    @EventTarget
    public void Method273(EventPacket a) {
        if (a.getPacket() instanceof S07PacketRespawn) {
            this.Method1028();
        }
    }

    @EventTarget
    public void Method747(EventEntityTick a) {
        this.setDisplayTag(this.Field2449.getMode());
        if (a.getEntity().equals((Object)SafeWalk.mc.thePlayer) && this.Field2449.isCurrentMode("Sneak")) {
            if (SafeWalk.mc.thePlayer.prevPosY - SafeWalk.mc.thePlayer.posY > 0.4 && this.Field2452.getValue()) {
                this.Method1028();
            }
            if (!SafeWalk.mc.thePlayer.onGround && SafeWalk.mc.gameSettings.keyBindJump.isPressed() && this.Field2453.getValue()) {
                this.Method1028();
            }
            double a2 = SafeWalk.mc.thePlayer.posX;
            double a3 = SafeWalk.mc.thePlayer.posY - 1.0;
            double a4 = SafeWalk.mc.thePlayer.posZ;
            BlockPos a5 = new BlockPos(MathHelper.floor_double((double)a2), MathHelper.floor_double((double)a3), MathHelper.floor_double((double)a4));
            if (this.Field2442 == null || !this.Method1679(a5, this.Field2442)) {
                this.Field2442 = a5;
            }
            this.Method1677(SafeWalk.mc.theWorld.isAirBlock(this.Field2442) || SafeWalk.mc.theWorld.getBlockState(this.Field2442).getBlock() instanceof BlockTallGrass);
            this.Method258();
        }
    }

    private void Method258() {
        if (!this.Field2446) {
            if (SafeWalk.mc.thePlayer.onGround) {
                this.Field2444 = this.Field2445;
                this.Method814();
            } else {
                KeyBinding.setKeyBindState((int)SafeWalk.mc.gameSettings.keyBindSneak.getKeyCode(), (boolean)false);
            }
        } else {
            KeyBinding.setKeyBindState((int)SafeWalk.mc.gameSettings.keyBindSneak.getKeyCode(), (boolean)true);
        }
    }

    private void Method814() {
        if (this.Method713() != SafeWalk.mc.thePlayer.isSneaking()) {
            KeyBinding.setKeyBindState((int)SafeWalk.mc.gameSettings.keyBindSneak.getKeyCode(), (boolean)this.Method713());
        }
        if (this.Field2451.getValue()) {
            this.Method815();
        }
    }

    private void Method815() {
        if (SafeWalk.mc.objectMouseOver != null && SafeWalk.mc.objectMouseOver.getBlockPos() != null && SafeWalk.mc.thePlayer.getCurrentEquippedItem() != null && SafeWalk.mc.thePlayer.getCurrentEquippedItem().getItem() != null && this.Method1680(SafeWalk.mc.objectMouseOver.sideHit) && this.Method1679(SafeWalk.mc.objectMouseOver.getBlockPos(), this.Method1681(this.Field2442, SafeWalk.mc.objectMouseOver.sideHit)) && System.currentTimeMillis() - this.Field2447 > (long)this.Field2448 && SafeWalk.mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemBlock) {
            this.Field2447 = System.currentTimeMillis();
            SafeWalk.mc.playerController.onPlayerRightClick(SafeWalk.mc.thePlayer, SafeWalk.mc.theWorld, SafeWalk.mc.thePlayer.getCurrentEquippedItem(), SafeWalk.mc.objectMouseOver.getBlockPos(), SafeWalk.mc.objectMouseOver.sideHit, SafeWalk.mc.objectMouseOver.hitVec);
            SafeWalk.mc.thePlayer.swingItem();
        }
    }

    public void Method1677(boolean a) {
        this.Field2445 = a;
    }

    public void Method1678(boolean a) {
        this.Field2446 = a;
    }

    private boolean Method713() {
        return this.Field2444;
    }

    private boolean Method1679(BlockPos a, BlockPos a2) {
        return a.getX() == a2.getX() && a.getY() == a2.getY() && a.getZ() == a2.getZ();
    }

    private boolean Method1680(EnumFacing a) {
        return a != EnumFacing.UP && a != EnumFacing.DOWN;
    }

    private BlockPos Method1681(BlockPos a, EnumFacing a2) {
        if (a2 == EnumFacing.NORTH) {
            return new BlockPos(a.getX(), a.getY(), a.getZ() + 1);
        }
        if (a2 == EnumFacing.SOUTH) {
            return new BlockPos(a.getX(), a.getY(), a.getZ() - 1);
        }
        if (a2 == EnumFacing.EAST) {
            return new BlockPos(a.getX() - 1, a.getY(), a.getZ());
        }
        if (a2 == EnumFacing.WEST) {
            return new BlockPos(a.getX() + 1, a.getY(), a.getZ());
        }
        if (a2 == EnumFacing.UP) {
            return new BlockPos(a.getX(), a.getY() + 1, a.getZ());
        }
        return a;
    }

    @EventTarget
    public void Method274(EventMove a) {
        double a2;
        double a3;
        double a4;
        double a5;
        boolean a6 = Class167.Method1500();
        if (!a.getEntity().equals((Object)SafeWalk.mc.thePlayer)) {
            return;
        }
        if (this.Field2449.isCurrentMode("Vanilla")) {
            a5 = a.getX();
            a4 = a.getY();
            a3 = a.getZ();
            if (SafeWalk.mc.thePlayer.onGround) {
                a2 = 0.05;
                if (a5 != 0.0) {
                    if (!SafeWalk.mc.theWorld.getCollidingBoundingBoxes((Entity)SafeWalk.mc.thePlayer, SafeWalk.mc.thePlayer.getEntityBoundingBox().offset(a5, -1.0, 0.0)).isEmpty()) {
                    }
                    if (a5 < a2 && a5 >= -a2) {
                        a5 = 0.0;
                    }
                    if (a5 > 0.0) {
                        a5 -= a2;
                    }
                    a5 += a2;
                }
                if (a3 != 0.0) {
                    if (!SafeWalk.mc.theWorld.getCollidingBoundingBoxes((Entity)SafeWalk.mc.thePlayer, SafeWalk.mc.thePlayer.getEntityBoundingBox().offset(0.0, -1.0, a3)).isEmpty()) {
                    }
                    if (a3 < a2 && a3 >= -a2) {
                        a3 = 0.0;
                    }
                    if (a3 > 0.0) {
                        a3 -= a2;
                    }
                    a3 += a2;
                }
                if (a5 != 0.0 && a3 != 0.0 && SafeWalk.mc.theWorld.getCollidingBoundingBoxes((Entity)SafeWalk.mc.thePlayer, SafeWalk.mc.thePlayer.getEntityBoundingBox().offset(a5, -1.0, a3)).isEmpty()) {
                    if (a5 < a2 && a5 >= -a2) {
                        a5 = 0.0;
                    }
                    if (a5 > 0.0) {
                        a5 -= a2;
                    }
                    a5 += a2;
                    if (a3 < a2 && a3 >= -a2) {
                        a3 = 0.0;
                    }
                    if (a3 > 0.0) {
                        a3 -= a2;
                    }
                    a3 += a2;
                }
            }
            a.setX(a5);
            a.setZ(a3);
        }
        if (this.Field2449.isCurrentMode("Insane")) {
            a5 = a.getX();
            a4 = 1.0;
            a3 = a.getZ();
            a2 = 0.05;
            if (a5 != 0.0) {
                if (this.Method1682(a5, -a4, 0.0)) {
                }
                if (a5 < a2 && a5 >= -a2) {
                    a5 = 0.0;
                }
                if (a5 > 0.0) {
                    a5 -= a2;
                }
                a5 += a2;
            }
            if (a3 != 0.0) {
                if (this.Method1682(0.0, -a4, a3)) {
                }
                if (a3 < a2 && a3 >= -a2) {
                    a3 = 0.0;
                }
                if (a3 > 0.0) {
                    a3 -= a2;
                }
                a3 += a2;
            }
            if (a5 != 0.0 && a3 != 0.0 && !this.Method1682(a5, -1.0, a3)) {
                if (a5 < a2 && a5 >= -a2) {
                    a5 = 0.0;
                }
                if (a5 > 0.0) {
                    a5 -= a2;
                }
                a5 += a2;
                if (a3 < a2 && a3 >= -a2) {
                    a3 = 0.0;
                }
                if (a3 > 0.0) {
                    a3 -= a2;
                }
                a3 += a2;
            }
            a.setX(a5);
            a.setZ(a3);
        }
    }

    public boolean Method1682(double a, double a2, double a3) {
        int a4 = this.Field2450.getFloatValue().intValue();
        while (true) {
            if (!SafeWalk.mc.theWorld.getCollidingBoundingBoxes((Entity)SafeWalk.mc.thePlayer, SafeWalk.mc.thePlayer.getEntityBoundingBox().offset(a, (double)(-a4), a3)).isEmpty()) {
                return true;
            }
            --a4;
        }
    }

    private boolean Method805() {
        int a = (int)SafeWalk.mc.thePlayer.posY;
        while (true) {
            BlockPos a2 = new BlockPos(SafeWalk.mc.thePlayer.posX, (double)a, SafeWalk.mc.thePlayer.posZ);
            if (!(SafeWalk.mc.theWorld.getBlockState(a2).getBlock() instanceof BlockAir)) {
                return true;
            }
            --a;
        }
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
        if (this.Field2449.isCurrentMode("Sneak")) {
            KeyBinding.setKeyBindState((int)SafeWalk.mc.gameSettings.keyBindSneak.getKeyCode(), (boolean)false);
        }
    }
}