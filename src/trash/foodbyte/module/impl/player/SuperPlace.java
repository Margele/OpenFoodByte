/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 *  java.util.Objects
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.world.World
 *  org.lwjgl.input.Mouse
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class362;
import awsl.Class642;
import awsl.Class653;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.player.FastPlace;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class SuperPlace
extends Module {
    public FloatValue Field2407;
    public FloatValue Field2408;
    public BooleanValue Field2409;
    public BooleanValue Field2410;
    public BooleanValue Field2411;
    public BooleanValue Field2412;
    private long Field2413;
    private int Field2414;
    private MovingObjectPosition Field2415;
    private BlockPos Field2416;
    private boolean Field2417;

    public SuperPlace() {
        super("SuperPlace", "Super Place", Category.PLAYER);
        int n = Class148.Method1445();
        this.Field2407 = new FloatValue("SuperPlace", "Delay", 0.0, 0.0, 30.0, 1.0, "\u653e\u7f6e\u5ef6\u8fdf");
        this.Field2408 = new FloatValue("SuperPlace", "Y", 0.0, 0.0, 200.0, 1.0, "\u5c4f\u5e55\u663e\u793a\u65b9\u5757\u7684\u4e0a\u4e0b\u4f4d\u7f6e\u8c03\u6574");
        this.Field2409 = new BooleanValue("SuperPlace", "Shake slightly", (Boolean)true, "\u975e\u5e38\u5c0f\u7684\u8f7b\u5fae\u79fb\u52a8\u5934\u9632\u6b62\u56de\u5f39");
        this.Field2410 = new BooleanValue("SuperPlace", "Anti Fake Block", (Boolean)true, "\u9632\u6b62\u5ef6\u8fdf\u9ad8\u80cc\u5305\u6700\u540e\u51e0\u4e2a\u5047\u65b9\u5757");
        this.Field2411 = new BooleanValue("SuperPlace", "Show Blocks", (Boolean)true, "\u5f00\u542f\u540e\u5c4f\u5e55\u4e2d\u95f4\u663e\u793a\u65b9\u5757\u8fd8\u5269\u591a\u5c11");
        this.Field2412 = new BooleanValue("SuperPlace", "Only Right", (Boolean)true, "\u53ea\u6709\u6309\u4f4f\u53f3\u952e\u624d\u6267\u884c");
        this.setDescription("\u8d85\u7ea7\u653e\u65b9\u5757\u8f7b\u8f7b\u677e\u677e\u8d70\u642d(\u5fc5\u987b\u8981fps\u9ad8)");
        this.Field2413 = 0L;
        this.Field2414 = 0;
        int n2 = n;
        this.Field2415 = null;
        this.Field2416 = null;
        if (Class91.Method3648() == null) {
            Class148.Method1443(++n2);
        }
    }

    @EventTarget
    public void Method712(EventMotion a) {
        int a2 = Class148.Method1444();
        if (a.isPre() && this.Field2409.getValue()) {
            MovingObjectPosition a3 = SuperPlace.mc.objectMouseOver;
            if (Mouse.isButtonDown((int)1)) {
                if (a3.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && a3.sideHit != EnumFacing.DOWN) {
                    ItemStack a4 = SuperPlace.mc.thePlayer.getHeldItem();
                    if (a4.getItem() instanceof ItemBlock) {
                        if (this.Field2417) {
                            this.Field2417 = false;
                            a.setYaw(SuperPlace.mc.thePlayer.rotationYaw + (float)MathUtils.Method572(0.0, 1.0) / 10.0f);
                        }
                        this.Field2417 = true;
                        a.setYaw(SuperPlace.mc.thePlayer.rotationYaw - (float)MathUtils.Method572(0.0, 1.0) / 10.0f);
                    }
                }
            }
        }
    }

    @EventTarget
    public void Method755(Class653 a) {
        if (Mouse.isButtonDown((int)1) && !SuperPlace.mc.thePlayer.capabilities.isFlying && !ModuleManager.getModule(FastPlace.class).getState()) {
            ItemStack a2 = SuperPlace.mc.thePlayer.getHeldItem();
            if (!(a2.getItem() instanceof ItemBlock)) {
                if (ReflectionUtils.Method2594() > 4) {
                    ReflectionUtils.Method2595(0);
                }
                return;
            }
            ReflectionUtils.Method2595(SuperPlace.mc.thePlayer.motionY > 0.0 ? 1 : 1000);
        }
    }

    @EventTarget
    public void Method1743(Class642 a) {
        if (Objects.nonNull((Object)SuperPlace.mc.thePlayer) && Objects.nonNull((Object)SuperPlace.mc.theWorld)) {
            ItemBlock a2;
            if (SuperPlace.mc.currentScreen != null || SuperPlace.mc.thePlayer.capabilities.isFlying) {
                return;
            }
            ItemStack a3 = SuperPlace.mc.thePlayer.getHeldItem();
            if (!(a3.getItem() instanceof ItemBlock)) {
                return;
            }
            MovingObjectPosition a4 = SuperPlace.mc.objectMouseOver;
            if (a4.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK || a4.sideHit == EnumFacing.UP || a4.sideHit == EnumFacing.DOWN) {
                return;
            }
            if (this.Field2415 != null && (float)this.Field2414 < this.Field2407.Method2746()) {
                ++this.Field2414;
                return;
            }
            this.Field2415 = a4;
            BlockPos a5 = a4.getBlockPos();
            if (this.Field2416 != null && a5.getX() == this.Field2416.getX() && a5.getY() == this.Field2416.getY() && a5.getZ() == this.Field2416.getZ()) {
                return;
            }
            Block a6 = SuperPlace.mc.theWorld.getBlockState(a5).getBlock();
            if (a6 == Blocks.air || a6 instanceof BlockLiquid) {
                return;
            }
            if (this.Field2412.Method2509().booleanValue() && !Mouse.isButtonDown((int)1)) {
                return;
            }
            long a7 = System.currentTimeMillis();
            if (a7 - this.Field2413 < 25L) {
                return;
            }
            this.Field2413 = a7;
            if (this.Field2410.Method2509().booleanValue() && (a2 = (ItemBlock)a3.getItem()).canPlaceBlockOnSide((World)SuperPlace.mc.theWorld, a5, a4.sideHit, (EntityPlayer)SuperPlace.mc.thePlayer, a3)) {
                if (SuperPlace.mc.thePlayer.inventory.mainInventory[SuperPlace.mc.thePlayer.inventory.currentItem].stackSize > 1) {
                    --SuperPlace.mc.thePlayer.inventory.mainInventory[SuperPlace.mc.thePlayer.inventory.currentItem].stackSize;
                }
            }
            if (SuperPlace.mc.playerController.onPlayerRightClick(SuperPlace.mc.thePlayer, SuperPlace.mc.theWorld, a3, a5, a4.sideHit, a4.hitVec)) {
                Class362.Method541(1, true);
                SuperPlace.mc.thePlayer.swingItem();
                mc.getItemRenderer().resetEquippedProgress();
                Class362.Method541(1, false);
                this.Field2416 = a5;
                this.Field2414 = 0;
            }
        }
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void Method279() {
        if (this.Field2412.getValue()) {
            ReflectionUtils.Method2595(4);
        }
        this.Method258();
    }

    private void Method258() {
        this.Field2416 = null;
        this.Field2415 = null;
        this.Field2414 = 0;
    }
}