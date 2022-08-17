package trash.foodbyte.module.impl.world;

import awsl.Class364;
import awsl.Class448;
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
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class LobbyGift extends Module {
   private Class364 Field2287 = new Class364(0);
   private Class364 Field2288 = new Class364(1);
   public BooleanValue Field2289 = new BooleanValue("LobbyGift", "Baskets", true, "主大厅万圣节篮子");
   public BooleanValue Field2290 = new BooleanValue("LobbyGift", "Xmas", true, "大厅圣诞节礼物");
   public static List Field2291 = new ArrayList();

   public LobbyGift() {
      super("LobbyGift", "Lobby Gift", Category.WORLD);
   }

   public String getDescription() {
      return "标记活动大厅礼包";
   }

   @EventTarget(0)
   public void Method802(EventRender3D a) {
      Class448.trash();
      Iterator var3 = mc.theWorld.loadedTileEntityList.Method1383();
      if (var3.Method932()) {
         TileEntity a = (TileEntity)var3.Method933();
         if (a instanceof TileEntitySkull && this.Field2289.getValue() && ((TileEntitySkull)a).getSkullType() == 3) {
            NBTTagCompound a = new NBTTagCompound();
            a.writeToNBT(a);
            String a = a.getCompoundTag("Owner").getString("Name");
            String a = a.getCompoundTag("Owner").getCompoundTag("Properties").toString();
            if (this.Method2256(a, a)) {
               BlockPos a = a.getPos();
               if (mc.objectMouseOver != null && mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK && a.getX() == mc.objectMouseOver.getBlockPos().getX() && a.getY() == mc.objectMouseOver.getBlockPos().getY() && a.getZ() == mc.objectMouseOver.getBlockPos().getZ() && (this.Field2287.Method582() || this.Field2288.Method582()) && !Field2291.contains(a)) {
                  Field2291.Method2530(a);
               }

               GL11.glPushMatrix();
               RenderUtils.Method1126(2.0F);
               GL11.glDisable(2848);
               TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
               RenderUtils.Method1129();
               TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
               RenderUtils.Method1130();
               TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
               if (!Field2291.contains(a)) {
                  if (a.equalsIgnoreCase("§item")) {
                     RenderUtils.Method1131((new Color(255, 0, 0)).getRGB());
                  }

                  RenderUtils.Method1131((new Color(255, 170, 0)).getRGB());
               }

               if (Field2291.contains(a)) {
                  RenderUtils.Method1131((new Color(0, 255, 0)).getRGB());
               }

               TileEntityRendererDispatcher.instance.renderTileEntity(a, a.Field2922, -1);
               RenderUtils.Method1132();
               RenderHelper.disableStandardItemLighting();
               GlStateManager.disableBlend();
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
            }
         }
      }

   }

   public void Method2245(Entity a, Color a) {
      float a = ReflectionUtils.getRenderPartialTicks();
      double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a - ReflectionUtils.getRenderPosX();
      double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a - ReflectionUtils.getRenderPosY();
      double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a - ReflectionUtils.getRenderPosZ();
      double a = (double)a.width / 1.5;
      double a = a.getEntityBoundingBox().maxY - a.getEntityBoundingBox().minY;
      GL11.glPushMatrix();
      RenderUtils.Method1126(2.0F);
      GL11.glDisable(2848);
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1129();
      Class448.trash();
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1130();
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1131(a.getRGB());
      RenderUtils.Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      RenderUtils.Method1132();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
      a.trash(new String[5]);
   }

   public boolean Method2256(String a, String a) {
      if (!this.Field2289.getValue() || !a.equalsIgnoreCase("§item") && !a.contains("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmYyNGVkNjg3NTMwNGZhNGExZjBjNzg1YjJjYjZhNmE3MjU2M2U5ZjNlMjRlYTU1ZTE4MTc4NDUyMTE5YWE2NiJ9fX0=") && !a.contains("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjZkNzljMDI2ODc0Nzk0MWRmOWEyYTQ1MTAzY2JkNzMxZmRlZGNiYTU4OGY2NDNiNjcwZmQ3N2FhMmJkOTE4YyJ9fX0=") && !a.contains("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFkN2M4MTZmYzhjNjM2ZDdmNTBhOTNhMGJhN2FhZWZmMDZjOTZhNTYxNjQ1ZTllYjFiZWYzOTE2NTVjNTMxIn19fQ==") && !a.contains("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmNlYTU5M2YyM2U0YjM5NWNjMWYzZmRjYjcwNjRiNjc2ZjI1ZjE1NTZjNWQ3ZDg0OGQzMTRhZGViNjc5NTQwNiJ9fX0=")) {
         return this.Field2290.getValue() && (a.equalsIgnoreCase("§item") || a.contains("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlZjlhYTE0ZTg4NDc3M2VhYzEzNGE0ZWU4OTcyMDYzZjQ2NmRlNjc4MzYzY2Y3YjFhMjFhODViNyJ9fX0=") || a.contains("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDA4Y2U3ZGViYTU2YjcyNmE4MzJiNjExMTVjYTE2MzM2MTM1OWMzMDQzNGY3ZDVlM2MzZmFhNmZlNDA1MiJ9fX0="));
      } else {
         return true;
      }
   }
}
