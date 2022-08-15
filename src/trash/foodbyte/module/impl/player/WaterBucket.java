/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Objects
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EntitySelectors
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldProviderHell
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class627;
import awsl.Class654;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import eventapi.EventTarget;
import java.util.List;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;
import trash.foodbyte.command.impl.TeleportCommand;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class WaterBucket
extends Module {
    public FloatValue fallCheck = new FloatValue("WaterBucket", "Fall Check", 4.0, 2.0, 20.0, 0.1, "\u6389\u4e0b\u591a\u5c11\u8ddd\u79bb\u624d\u6267\u884c\u843d\u5730\u6c34");
    public BooleanValue swap = new BooleanValue("WaterBucket", "Swap", (Boolean)false, "\u843d\u5730\u6c34\u540e\u518d\u5207\u56de\u4f60\u539f\u672c\u7684\u683c\u5b50");
    public BooleanValue recycle = new BooleanValue("WaterBucket", "Recycle", (Boolean)true, "\u653e\u6c34\u540e\u6536\u56de\u6c34");
    private MovingObjectPosition position;
    private int originItem = 0;
    private boolean placed;

    public WaterBucket() {
        super("WaterBucket", "Water Bucket", Category.PLAYER);
        this.setDescription("\u843d\u5730\u6c34(\u9700\u8981\u7784\u51c6\u5730\u9762\u4f1a\u81ea\u52a8\u5207\u6362\u6c34\u6876\u81ea\u52a8\u653e\u6c34)");
    }

    @EventTarget(value=4)
    public void Method801(Class654 a) {
        if (Objects.isNull((Object)WaterBucket.mc.thePlayer) && Objects.isNull((Object)WaterBucket.mc.theWorld) || WaterBucket.mc.thePlayer.worldObj.provider instanceof WorldProviderHell || mc.isGamePaused()) {
            return;
        }
        if (this.canPlace() && this.backWater()) {
            this.placed = true;
        }
        if (this.placed && TeleportCommand.Field3196 == Class627.WAIT) {
            this.useItem();
            if (WaterBucket.mc.theWorld.getBlockState(new BlockPos(WaterBucket.mc.thePlayer.posX, WaterBucket.mc.thePlayer.posY + 0.5, WaterBucket.mc.thePlayer.posZ)) != null) {
                // empty if block
            }
            if (WaterBucket.mc.thePlayer.onGround || WaterBucket.mc.thePlayer.motionY > 0.0) {
                this.placeWater();
                ReflectionUtils.setTimerSpeed(1.0f);
            }
        }
    }

    @EventTarget(value=0)
    public void Method802(EventRender3D a) {
        this.position = this.getPosition();
    }

    private boolean canPlace() {
        if (WaterBucket.mc.thePlayer.fallDistance > this.fallCheck.Method2744().floatValue() && !WaterBucket.mc.thePlayer.onGround && WaterBucket.mc.thePlayer.rotationPitch >= 70.0f && this.position.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.position.sideHit == EnumFacing.UP && !WaterBucket.mc.thePlayer.capabilities.isFlying && !WaterBucket.mc.thePlayer.capabilities.isCreativeMode && !this.placed) {
            Block a = WaterBucket.mc.theWorld.getBlockState(this.position.getBlockPos().up()).getBlock();
            return a != Blocks.water;
        }
        return false;
    }

    private boolean backWater() {
        int a = Class148.Method1444();
        if (this.isHeldingItem(WaterBucket.mc.thePlayer.getHeldItem(), Items.water_bucket)) {
            this.originItem = WaterBucket.mc.thePlayer.inventory.currentItem;
            return true;
        }
        int a2 = 0;
        if (a2 < InventoryPlayer.getHotbarSize()) {
            if (this.isHeldingItem(WaterBucket.mc.thePlayer.inventory.mainInventory[a2], Items.water_bucket)) {
                this.originItem = WaterBucket.mc.thePlayer.inventory.currentItem;
                WaterBucket.mc.thePlayer.inventory.currentItem = a2;
                return true;
            }
            ++a2;
        }
        return false;
    }

    private void useItem() {
        ItemStack a = WaterBucket.mc.thePlayer.getHeldItem();
        if (this.isHeldingItem(a, Items.water_bucket) && WaterBucket.mc.thePlayer.rotationPitch >= 70.0f && this.position.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.position.sideHit == EnumFacing.UP) {
            WaterBucket.mc.playerController.sendUseItem((EntityPlayer)WaterBucket.mc.thePlayer, (World)WaterBucket.mc.theWorld, a);
        }
    }

    private void placeWater() {
        ItemStack a = WaterBucket.mc.thePlayer.getHeldItem();
        if (this.isHeldingItem(a, Items.bucket) && this.recycle.getValue()) {
            WaterBucket.mc.playerController.sendUseItem((EntityPlayer)WaterBucket.mc.thePlayer, (World)WaterBucket.mc.theWorld, a);
        }
        if (this.swap.getValue() && this.originItem != WaterBucket.mc.thePlayer.inventory.currentItem) {
            WaterBucket.mc.thePlayer.inventory.currentItem = this.originItem;
        }
        this.placed = false;
    }

    private boolean isHeldingItem(ItemStack stack, Item item) {
        return stack.getItem() == item;
    }

    public MovingObjectPosition getPosition() {
        Entity a = mc.getRenderViewEntity();
        int a2 = Class148.Method1445();
        if (WaterBucket.mc.theWorld != null) {
            WaterBucket.mc.mcProfiler.startSection("pick");
            float a3 = ReflectionUtils.Method2587();
            double a4 = WaterBucket.mc.playerController.getBlockReachDistance();
            MovingObjectPosition a5 = a.rayTrace(a4, a3);
            double a6 = a4;
            Vec3 a7 = a.getPositionEyes(a3);
            boolean a8 = false;
            boolean a9 = true;
            if (WaterBucket.mc.playerController.extendedReach()) {
                a4 = 6.0;
                a6 = 6.0;
            }
            if (a4 > 3.0) {
                a8 = true;
            }
            a6 = a5.hitVec.distanceTo(a7);
            Vec3 a10 = a.getLook(a3);
            Vec3 a11 = a7.addVector(a10.xCoord * a4, a10.yCoord * a4, a10.zCoord * a4);
            Entity a12 = null;
            Vec3 a13 = null;
            float a14 = 1.0f;
            List a15 = WaterBucket.mc.theWorld.getEntitiesInAABBexcluding(a, a.getEntityBoundingBox().addCoord(a10.xCoord * a4, a10.yCoord * a4, a10.zCoord * a4).expand((double)a14, (double)a14, (double)a14), Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, Entity::func_70067_L));
            double a16 = a6;
            if (a7.distanceTo(a13) > 3.0) {
                a12 = null;
                a5 = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, a13, null, new BlockPos(a13));
            }
            if (!(a16 < a6)) {
            }
            a5 = new MovingObjectPosition(a12, a13);
            if (a12 instanceof EntityLivingBase || a12 instanceof EntityItemFrame) {
                // empty if block
            }
            WaterBucket.mc.mcProfiler.endSection();
            return a5;
        }
        return null;
    }

    @Override
    public void onEnable() {
        this.placed = false;
    }

    @Override
    public void Method279() {
        this.placed = false;
    }
}