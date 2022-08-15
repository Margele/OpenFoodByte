/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityBlaze
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityMagmaCube
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.monster.EntityZombie
 *  net.minecraft.init.Items
 *  net.minecraft.network.play.server.S0FPacketSpawnMob
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityMobSpawner
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.world;

import awsl.Class281;
import awsl.Class448;
import awsl.Class667;
import awsl.Class91;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.network.play.server.S0FPacketSpawnMob;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class UHCFind
extends Module {
    public BooleanValue Field2280 = new BooleanValue("UHCFind", "Mob Spawner", (Boolean)true, "\u5237\u602a\u7b3c-\u6df1\u84dd\u8272");
    public BooleanValue Field2281 = new BooleanValue("UHCFind", "Player Zombie", (Boolean)true, "\u9000\u6e38\u620f\u7684\u73a9\u5bb6-\u6df1\u7ea2\u8272");
    public BooleanValue Field2282 = new BooleanValue("UHCFind", "Enderman", (Boolean)true, "\u672b\u5f71\u4eba-\u7d2b\u8272");
    public BooleanValue Field2283 = new BooleanValue("UHCFind", "Creeper", (Boolean)true, "\u82e6\u529b\u6015-\u6df1\u7eff\u8272");
    public BooleanValue Field2284 = new BooleanValue("UHCFind", "Blaze", (Boolean)true, "\u70c8\u7130\u4eba-\u6a58\u9ec4\u8272");
    public BooleanValue Field2285 = new BooleanValue("UHCFind", "Slime", (Boolean)true, "\u53f2\u83b1\u59c6-\u7eff\u8272");
    public BooleanValue Field2286 = new BooleanValue("UHCFind", "Magma Cube", (Boolean)true, "\u5ca9\u6d46\u602a-\u6d45\u7ea2\u8272");

    public UHCFind() {
        super("UHCFind", "UHC Find", Category.WORLD);
        this.setDescription("Hypixel UHC \u914d\u65b9\u6750\u6599\u63a2\u7d22\u5e76\u6807\u8bb0!");
    }

    @EventTarget(value=0)
    public void Method802(EventRender3D a) {
        Entity a2;
        Class91[] a3 = Class448.Method2461();
        if (!Class281.Method3049(Class667.UHC)) {
            return;
        }
        List a4 = UHCFind.mc.theWorld.getLoadedEntityList();
        a4.sort(Comparator.comparingDouble(UHCFind::Method2246));
        int a5 = 0;
        Iterator iterator = a4.Method1383();
        if (iterator.Method932()) {
            a2 = (Entity)iterator.Method933();
            if (this.Field2282.getValue() && a2 instanceof EntityEnderman) {
                this.Method2245(a2, new Color(143, 0, 226));
            }
            if (this.Field2284.getValue() && a2 instanceof EntityBlaze) {
                this.Method2245(a2, new Color(239, 128, 2));
            }
            if (this.Field2285.getValue() && a2 instanceof EntitySlime) {
                this.Method2245(a2, new Color(41, 255, 0));
            }
            if (this.Field2286.getValue() && a2 instanceof EntityMagmaCube) {
                this.Method2245(a2, new Color(177, 22, 53));
            }
            if (this.Field2283.getValue() && a2 instanceof EntityCreeper && a5 < 2) {
                this.Method2245(a2, new Color(29, 156, 7));
                ++a5;
            }
            if (this.Field2281.getValue() && a2 instanceof EntityZombie && !(a2 instanceof EntityPigZombie) && a2.getDisplayName() != null && Objects.nonNull((Object)((EntityZombie)a2).getEquipmentInSlot(4)) && ((EntityZombie)a2).getEquipmentInSlot(4).getItem() == Items.skull) {
                this.Method2245(a2, new Color(255, 0, 0, 255));
            }
        }
        if (this.Field2280.getValue() && (iterator = UHCFind.mc.theWorld.loadedTileEntityList.Method1383()).Method932()) {
            a2 = (TileEntity)iterator.Method933();
            if (a2 instanceof TileEntityMobSpawner) {
                GL11.glPushMatrix();
                RenderUtils.Method1126(2.0f);
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a2, a.Field2922, -1);
                RenderUtils.Method1129();
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a2, a.Field2922, -1);
                RenderUtils.Method1130();
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a2, a.Field2922, -1);
                RenderUtils.Method1131(new Color(0, 86, 255).getRGB());
                TileEntityRendererDispatcher.instance.renderTileEntity((TileEntity)a2, a.Field2922, -1);
                RenderUtils.Method1132();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
            }
        }
    }

    @EventTarget
    public void Method273(EventPacket a) {
        Class91[] a2 = Class448.Method2461();
        if (a.isSend() && !Class281.Method3049(Class667.UHC)) {
            return;
        }
        if (a.getPacket() instanceof S0FPacketSpawnMob) {
            S0FPacketSpawnMob a3 = (S0FPacketSpawnMob)a.getPacket();
            EntityLivingBase a4 = (EntityLivingBase)EntityList.createEntityByID((int)a3.getEntityType(), (World)UHCFind.mc.theWorld);
            double a5 = (double)a3.getX() / 32.0;
            double a6 = (double)a3.getY() / 32.0;
            double a7 = (double)a3.getZ() / 32.0;
            float a8 = (float)(a3.getYaw() * 360) / 256.0f;
            float a9 = (float)(a3.getPitch() * 360) / 256.0f;
            a4.serverPosX = a3.getX();
            a4.serverPosY = a3.getY();
            a4.serverPosZ = a3.getZ();
            a4.renderYawOffset = a4.rotationYawHead = (float)(a3.getHeadPitch() * 360) / 256.0f;
            Entity[] a10 = a4.getParts();
            int a11 = a3.getEntityID() - a4.getEntityId();
            int a12 = 0;
            if (a12 < a10.length) {
                a10[a12].setEntityId(a10[a12].getEntityId() + a11);
                ++a12;
            }
            a4.setEntityId(a3.getEntityID());
            a4.setPositionAndRotation(a5, a6, a7, a8, a9);
            a4.motionX = (float)a3.getVelocityX() / 8000.0f;
            a4.motionY = (float)a3.getVelocityY() / 8000.0f;
            a4.motionZ = (float)a3.getVelocityZ() / 8000.0f;
            List a22 = a3.func_149027_c();
            a4.getDataWatcher().updateWatchedObjectsFromList(a22);
            a12 = a3.getX() / 32;
            int a13 = a3.getY() / 32;
            int a14 = a3.getZ() / 32;
            float a15 = (float)(UHCFind.mc.thePlayer.posX - (double)a12);
            float a16 = (float)(UHCFind.mc.thePlayer.posY - (double)a13);
            float a17 = (float)(UHCFind.mc.thePlayer.posZ - (double)a14);
            float a18 = MathHelper.sqrt_float((float)(a15 * a15 + a16 * a16 + a17 * a17));
            if (this.Field2282.Method2509().booleanValue() && a4 instanceof EntityEnderman) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a4.getName() + "\u00a7e " + (int)a18 + "\u00a77m \u00a7BX: \u00a7r" + a12 + " \u00a7BY: \u00a7r" + a13 + " \u00a7BZ: \u00a7r" + a14);
            }
            if (this.Field2286.Method2509().booleanValue() && a4 instanceof EntityMagmaCube) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a4.getName() + "\u00a7e " + (int)a18 + "\u00a77m \u00a7BX: \u00a7r" + a12 + " \u00a7BY: \u00a7r" + a13 + " \u00a7BZ: \u00a7r" + a14);
            }
            if (this.Field2284.Method2509().booleanValue() && a4 instanceof EntityBlaze) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a4.getName() + "\u00a7e " + (int)a18 + "\u00a77m \u00a7BX: \u00a7r" + a12 + " \u00a7BY: \u00a7r" + a13 + " \u00a7BZ: \u00a7r" + a14);
            }
            if (this.Field2281.Method2509().booleanValue() && a4 instanceof EntityZombie && !(a4 instanceof EntityPigZombie) && a4.getDisplayName() != null && !a4.getDisplayName().getUnformattedText().equalsIgnoreCase("Zombie") && !a4.getDisplayName().getUnformattedText().equalsIgnoreCase("\u50f5\u5c38") && !a4.getDisplayName().getFormattedText().startsWith("\u00a7")) {
                ChatUtils.addChatMessage("\u00a73Find \u00a79" + a4.getDisplayName().getFormattedText() + " Exit! \u00a7e " + (int)a18 + "\u00a77m \u00a7BX: \u00a7r" + a12 + " \u00a7BY: \u00a7r" + a13 + " \u00a7BZ: \u00a7r" + a14);
            }
        }
    }

    public void Method2245(Entity a, Color a2) {
        float a3 = ReflectionUtils.Method2587();
        double a4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a3 - ReflectionUtils.Method2591();
        double a5 = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a3 - ReflectionUtils.Method2592();
        double a6 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a3 - ReflectionUtils.Method2593();
        double a7 = (double)a.width / 1.5;
        double a8 = a.getEntityBoundingBox().maxY - a.getEntityBoundingBox().minY;
        GL11.glPushMatrix();
        RenderUtils.Method1126(2.0f);
        GL11.glDisable((int)2848);
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        RenderUtils.Method1129();
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        RenderUtils.Method1130();
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        RenderUtils.Method1131(a2.getRGB());
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        RenderUtils.Method1132();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    private static double Method2246(Entity a) {
        return UHCFind.mc.thePlayer.getDistanceToEntity(a);
    }
}