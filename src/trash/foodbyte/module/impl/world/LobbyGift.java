/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntitySkull
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.world;

import awsl.Class364;
import awsl.Class448;
import awsl.Class91;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class LobbyGift
extends Module {
    private Class364 Field2287 = new Class364(0);
    private Class364 Field2288 = new Class364(1);
    public BooleanValue Field2289 = new BooleanValue("LobbyGift", "Baskets", (Boolean)true, "\u4e3b\u5927\u5385\u4e07\u5723\u8282\u7bee\u5b50");
    public BooleanValue Field2290 = new BooleanValue("LobbyGift", "Xmas", (Boolean)true, "\u5927\u5385\u5723\u8bde\u8282\u793c\u7269");
    public static List Field2291 = new ArrayList();

    public LobbyGift() {
        super("LobbyGift", "Lobby Gift", Category.WORLD);
    }

    @Override
    public String getDescription() {
        return "\u6807\u8bb0\u6d3b\u52a8\u5927\u5385\u793c\u5305";
    }

    @EventTarget(value=0)
    public void Method802(EventRender3D a) {
        Iterator iterator = LobbyGift.mc.theWorld.loadedTileEntityList.Method1383();
        Class91[] a2 = Class448.Method2461();
        if (iterator.Method932()) {
            TileEntity a3 = (TileEntity)iterator.Method933();
            if (a3 instanceof TileEntitySkull && this.Field2289.getValue() && ((TileEntitySkull)a3).getSkullType() == 3) {
                NBTTagCompound a4 = new NBTTagCompound();
                a3.writeToNBT(a4);
                String a5 = a4.getCompoundTag("Owner").getString("Name");
                String a6 = a4.getCompoundTag("Owner").getCompoundTag("Properties").toString();
                if (this.Method2256(a5, a6)) {
                    BlockPos a7 = a3.getPos();
                    if (LobbyGift.mc.objectMouseOver != null && LobbyGift.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && a7.getX() == LobbyGift.mc.objectMouseOver.getBlockPos().getX() && a7.getY() == LobbyGift.mc.objectMouseOver.getBlockPos().getY() && a7.getZ() == LobbyGift.mc.objectMouseOver.getBlockPos().getZ() && (this.Field2287.Method582() || this.Field2288.Method582()) && !Field2291.contains((Object)a7)) {
                        Field2291.Method2530((Object)a7);
                    }
                    GL11.glPushMatrix();
                    RenderUtils.Method1126(2.0f);
                    GL11.glDisable((int)2848);
                    TileEntityRendererDispatcher.instance.renderTileEntity(a3, a.Field2922, -1);
                    RenderUtils.Method1129();
                    TileEntityRendererDispatcher.instance.renderTileEntity(a3, a.Field2922, -1);
                    RenderUtils.Method1130();
                    TileEntityRendererDispatcher.instance.renderTileEntity(a3, a.Field2922, -1);
                    if (!Field2291.contains((Object)a7)) {
                        if (a5.equalsIgnoreCase("\u00a7item")) {
                            RenderUtils.Method1131(new Color(255, 0, 0).getRGB());
                        }
                        RenderUtils.Method1131(new Color(255, 170, 0).getRGB());
                    }
                    if (Field2291.contains((Object)a7)) {
                        RenderUtils.Method1131(new Color(0, 255, 0).getRGB());
                    }
                    TileEntityRendererDispatcher.instance.renderTileEntity(a3, a.Field2922, -1);
                    RenderUtils.Method1132();
                    RenderHelper.disableStandardItemLighting();
                    GlStateManager.disableBlend();
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glPopMatrix();
                }
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
        Class91[] class91Array = Class448.Method2461();
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        Class91[] a9 = class91Array;
        RenderUtils.Method1130();
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        RenderUtils.Method1131(a2.getRGB());
        RenderUtils.Method1124(new AxisAlignedBB(a4 - a7, a5, a6 - a7, a4 + a7, a5 + a8, a6 + a7));
        RenderUtils.Method1132();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        Class91.Method3647(new String[5]);
    }

    public boolean Method2256(String a, String a2) {
        if (this.Field2289.getValue() && (a.equalsIgnoreCase("\u00a7item") || a2.contains((CharSequence)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmYyNGVkNjg3NTMwNGZhNGExZjBjNzg1YjJjYjZhNmE3MjU2M2U5ZjNlMjRlYTU1ZTE4MTc4NDUyMTE5YWE2NiJ9fX0=") || a2.contains((CharSequence)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjZkNzljMDI2ODc0Nzk0MWRmOWEyYTQ1MTAzY2JkNzMxZmRlZGNiYTU4OGY2NDNiNjcwZmQ3N2FhMmJkOTE4YyJ9fX0=") || a2.contains((CharSequence)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFkN2M4MTZmYzhjNjM2ZDdmNTBhOTNhMGJhN2FhZWZmMDZjOTZhNTYxNjQ1ZTllYjFiZWYzOTE2NTVjNTMxIn19fQ==") || a2.contains((CharSequence)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmNlYTU5M2YyM2U0YjM5NWNjMWYzZmRjYjcwNjRiNjc2ZjI1ZjE1NTZjNWQ3ZDg0OGQzMTRhZGViNjc5NTQwNiJ9fX0="))) {
            return true;
        }
        return this.Field2290.getValue() && (a.equalsIgnoreCase("\u00a7item") || a2.contains((CharSequence)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlZjlhYTE0ZTg4NDc3M2VhYzEzNGE0ZWU4OTcyMDYzZjQ2NmRlNjc4MzYzY2Y3YjFhMjFhODViNyJ9fX0=") || a2.contains((CharSequence)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDA4Y2U3ZGViYTU2YjcyNmE4MzJiNjExMTVjYTE2MzM2MTM1OWMzMDQzNGY3ZDVlM2MzZmFhNmZlNDA1MiJ9fX0="));
    }
}