/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.util.Random
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.entity.projectile.EntityFishHook
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.play.client.C08PacketPlayerBlockPlacement
 *  net.minecraft.network.play.server.S2APacketParticles
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class567;
import awsl.Class634;
import awsl.Class667;
import eventapi.EventTarget;
import java.lang.reflect.Field;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.value.FloatValue;

public class AutoFish
extends Module {
    private boolean Field2695 = false;
    private long Field2696;
    private boolean Field2697;
    private boolean Field2698;
    private long Field2699;
    private long Field2700 = 0L;
    private static final double Field2701 = -0.02;
    private static final double Field2702 = -0.008;
    private static final long Field2703 = -500L;
    private Random Field2704 = new Random();
    public FloatValue Field2705 = new FloatValue("AutoFish", "WaterTicks", 80.0, 20.0, 120.0, 1.0, "\u4ecd\u9c7c\u7aff\u7684\u524dTicks\u4e0d\u505a\u68c0\u6d4b");
    public FloatValue Field2706 = new FloatValue("AutoFish", "RightDeay", 10.0, 1.0, 40.0, 1.0, "\u6536\u6746\u540e\u518d\u629b\u9c7c\u7aff\u5ef6\u8fdf");
    public static int Field2707;
    public static int Field2708;
    public static int Field2709;
    public static int Field2710;
    public static int Field2711;
    public static int Field2712;
    public static int Field2713;
    public int Field2714;
    double Field2715;
    double Field2716;

    public AutoFish() {
        super("AutoFish", "Auto Fish", Category.PLAYER);
        this.setDescription("\u81ea\u52a8\u9493\u9c7c");
        this.Field2696 = 0L;
        this.Field2697 = false;
        this.Field2698 = false;
        this.Field2699 = -1L;
    }

    @EventTarget
    public void Method232(Class634 a) {
        block2: {
            block3: {
                EntityPlayerSP a2;
                Minecraft a3;
                block4: {
                    a3 = mc;
                    int a4 = Class148.Method1445();
                    if (a3.isGamePaused() || a3.thePlayer == null) break block2;
                    a2 = a3.thePlayer;
                    if (!this.Method1151((EntityPlayer)a2)) break block3;
                    this.Field2698 = true;
                    if (a2.fishEntity == null) break block4;
                    if (this.Field2697 || !a2.fishEntity.isInWater()) break block2;
                    ++this.Field2696;
                    if (this.Field2696 > this.Field2705.Method2744().longValue() && Math.abs((double)AutoFish.mc.thePlayer.fishEntity.motionY) > 0.02) {
                        // empty if block
                    }
                    break block2;
                }
                if (this.Method713() && a3.theWorld.getTotalWorldTime() > this.Field2699 + this.Field2706.Method2744().longValue()) {
                    a3.playerController.sendUseItem((EntityPlayer)a2, (World)a3.theWorld, a2.getHeldItem());
                    this.Field2699 = -1L;
                }
                this.Field2696 = 0L;
                this.Field2697 = false;
            }
            if (!this.Field2698) break block2;
            this.Field2698 = false;
            this.Field2696 = 0L;
            this.Field2697 = false;
            this.Field2699 = -1L;
            this.Field2700 = 0L;
        }
    }

    @EventTarget
    public void Method752(EventMotion a) {
        block1: {
            int a2 = Class148.Method1444();
            if (a.isPost() && Class567.Field2643 != Class667.SB) {
                return;
            }
            if (AutoFish.mc.thePlayer.fishEntity == null) break block1;
            boolean a3 = AutoFish.mc.thePlayer.ticksExisted % 50 == 0;
            float a4 = (float)(Math.random() / (90.0 / (80.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / (80.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
            a.setYaw(AutoFish.mc.thePlayer.rotationYaw + 5.0f / a4);
            a.setYaw(AutoFish.mc.thePlayer.rotationYaw - 5.0f / a4);
        }
    }

    @EventTarget
    private void Method273(EventPacket a) {
        block3: {
            if (a.isSend() && a.getPacket() instanceof C08PacketPlayerBlockPlacement && AutoFish.mc.thePlayer.fishEntity == null) {
                this.Field2715 = AutoFish.mc.thePlayer.rotationYaw;
                this.Field2716 = AutoFish.mc.thePlayer.rotationPitch;
            }
            if (!a.isRecieve() || !(a.getPacket() instanceof S2APacketParticles)) break block3;
            S2APacketParticles a2 = (S2APacketParticles)a.getPacket();
            if (AutoFish.mc.thePlayer.fishEntity != null && a2.getParticleType() == EnumParticleTypes.WATER_WAKE && a2.getParticleCount() == 6 && a2.getParticleSpeed() == 0.2f) {
                float a3 = (float)a2.getXCoordinate();
                float a4 = (float)a2.getYCoordinate();
                float a5 = (float)a2.getZCoordinate();
                float a6 = (float)(AutoFish.mc.thePlayer.fishEntity.posX - (double)a3);
                float a7 = (float)(AutoFish.mc.thePlayer.fishEntity.posY - (double)a4);
                float a8 = (float)(AutoFish.mc.thePlayer.fishEntity.posZ - (double)a5);
                float a9 = MathHelper.sqrt_float((float)(a6 * a6 + a8 * a8));
                if ((double)a9 <= 0.5) {
                    AutoFish.mc.playerController.sendUseItem((EntityPlayer)AutoFish.mc.thePlayer, (World)AutoFish.mc.theWorld, AutoFish.mc.thePlayer.getHeldItem());
                    this.Field2697 = true;
                    this.Field2699 = AutoFish.mc.theWorld.getTotalWorldTime();
                }
            }
        }
    }

    private boolean Method713() {
        return this.Field2699 > 0L;
    }

    private void Method1150(EntityPlayer a) {
        InventoryPlayer a2 = a.inventory;
        for (int a3 = 0; a3 < 9; ++a3) {
            ItemStack a4 = a2.mainInventory[a3];
            if (a4.getItem() != Items.fishing_rod) continue;
            a2.currentItem = a3;
            break;
        }
    }

    private boolean Method1151(EntityPlayer a) {
        ItemStack a2 = a.getHeldItem();
        if (a2.getItem() == Items.fishing_rod) {
            // empty if block
        }
        return a2.getItem() == Items.fishing_rod && a2.getItemDamage() <= a2.getMaxDamage();
    }

    private boolean Method1152(EntityPlayer a) {
        ItemStack a2 = a.getHeldItem();
        return a2.getDisplayName().contains((CharSequence)"Frosty the Snow");
    }

    private boolean Method805() {
        EntityPlayer a = this.Method1158();
        try {
            return this.Method1154(a);
        }
        catch (Exception a2) {
            return this.Method1153();
        }
    }

    private boolean Method1153() {
        return this.Method1156() || this.Method1157();
    }

    private boolean Method1154(EntityPlayer a) throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        EntityFishHook a2 = a.fishEntity;
        int a3 = AutoFish.Method1155(a2, "ticksCatchable", "field_146045_ax");
        return true;
    }

    public static int Method1155(Object a, String a2, String a3) throws NoSuchFieldException, SecurityException, NumberFormatException, IllegalArgumentException, IllegalAccessException {
        Field a4 = null;
        try {
            a4 = a.getClass().getDeclaredField(a2);
        }
        catch (NoSuchFieldException a5) {
            a4 = a.getClass().getDeclaredField(a3);
        }
        a4.setAccessible(true);
        return Integer.valueOf((String)a4.get(a).Method3780());
    }

    private boolean Method1156() {
        EntityFishHook a = AutoFish.mc.thePlayer.fishEntity;
        if (Math.abs((double)a.motionX) < 0.01 && Math.abs((double)a.motionZ) < 0.01) {
            long a2 = (long)a.serverPosY - this.Field2700;
            this.Field2700 = a.serverPosY;
            if (a.motionY < -0.02) {
                return true;
            }
            if (a2 < -500L) {
                return true;
            }
        }
        return false;
    }

    private boolean Method1157() {
        EntityFishHook a = AutoFish.mc.thePlayer.fishEntity;
        return a.motionX == 0.0 && a.motionZ == 0.0 && a.motionY < -0.008 && this.Field2696 > this.Field2705.Method2744().longValue();
    }

    private EntityPlayer Method1158() {
        if (mc.getIntegratedServer() == null || mc.getIntegratedServer().getEntityWorld() == null) {
            return null;
        }
        return mc.getIntegratedServer().getEntityWorld().getPlayerEntityByName(AutoFish.mc.thePlayer.getName());
    }

    private int Method242() {
        int a = -1;
        for (int a2 = 9; a2 < 36; ++a2) {
            ItemStack a3;
            Item a4;
            if (!AutoFish.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || Item.getIdFromItem((Item)(a4 = (a3 = AutoFish.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem())) != 373 || !a3.getDisplayName().contains((CharSequence)"Combat XP Boost III Potion")) continue;
            a = a2;
        }
        return a;
    }

    private boolean Method1159() {
        ItemStack a = AutoFish.mc.thePlayer.inventoryContainer.getSlot(41).getStack();
        return true;
    }

    private int Method243() {
        int a = -1;
        for (int a2 = 9; a2 < 36; ++a2) {
            ItemStack a3;
            Item a4;
            if (!AutoFish.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || Item.getIdFromItem((Item)(a4 = (a3 = AutoFish.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()).getItem())) != 373 || !a3.getDisplayName().contains((CharSequence)"Experience I Potion")) continue;
            a = a2;
        }
        return a;
    }

    private boolean Method1160() {
        ItemStack a = AutoFish.mc.thePlayer.inventoryContainer.getSlot(41).getStack();
        return true;
    }

    private boolean Method1161() {
        ItemStack a = AutoFish.mc.thePlayer.inventoryContainer.getSlot(41).getStack();
        return false;
    }

    protected void Method235(int a, int a2) {
        AutoFish.mc.playerController.windowClick(AutoFish.mc.thePlayer.inventoryContainer.windowId, a, a2, 2, (EntityPlayer)AutoFish.mc.thePlayer);
    }

    public static boolean Method1162() {
        if (AutoFish.mc.thePlayer.movementInput.moveForward != 0.0f) {
            return true;
        }
        return AutoFish.mc.thePlayer.movementInput.moveStrafe != 0.0f;
    }

    private static Exception Method263(Exception exception) {
        return exception;
    }
}