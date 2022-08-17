package trash.foodbyte.utils;

import awsl.Class305;
import awsl.Class352;
import awsl.Class372;
import awsl.Class379;
import awsl.Class606;
import eventapi.EventManager;
import eventapi.EventTarget;
import io.netty.buffer.Unpooled;
import java.math.BigDecimal;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.render.Inventory;
import trash.foodbyte.module.impl.render.Radar;
import trash.foodbyte.reflections.Wrapper;

public class ServerPacketHandler {
   Minecraft mc;
   public static Servers currentServer;
   private int Field2644;

   public ServerPacketHandler() {
      this.mc = Wrapper.INSTANCE.getMinecraft();
      this.Field2644 = 0;
      EventManager.register(this);
      Class372.Method405(this);
   }

   @EventTarget
   public void Method1257(EventTick a) {
      Iterator var2 = Class352.Field1690.Method1383();

      while(true) {
         while(true) {
            Class379 var3;
            do {
               if (!var2.Method932()) {
                  return;
               }

               var3 = (Class379)var2.Method933();
               if ("Radar".equals(var3.Field1813)) {
                  if (((Radar)ModuleManager.getModule2(Radar.class)).getState() && var3.Field1826) {
                     var3.Method462();
                  } else if (!((Radar)ModuleManager.getModule2(Radar.class)).getState() && !var3.Field1826) {
                     var3.Method461();
                  }
               }
            } while(!"PlayerInventory".equals(var3.Field1813));

            if (((Inventory)ModuleManager.getModule2(Inventory.class)).getState() && var3.Field1826) {
               var3.Method462();
            } else if (!((Inventory)ModuleManager.getModule2(Inventory.class)).getState() && !var3.Field1826) {
               var3.Method461();
            }
         }
      }
   }

   @EventTarget
   public void Method1258(EventRender3D a) {
   }

   @EventTarget
   public void onPacket(EventPacket event) {
      String[] var2 = EventPacket.trash();
      if (event.isSend()) {
         if (GlobalModule.Field3140.getValue() && !this.mc.isSingleplayer()) {
            if (event.getPacket() instanceof FMLProxyPacket) {
               FMLProxyPacket var3 = (FMLProxyPacket)event.getPacket();
               event.setCancelled(true);
            }

            if (event.getPacket() instanceof C17PacketCustomPayload) {
               C17PacketCustomPayload var9 = (C17PacketCustomPayload)event.getPacket();
               if (var9.getChannelName().equalsIgnoreCase("MC|Brand")) {
                  event.setCancelled(true);
                  Wrapper.INSTANCE.sendPacketNoEvent(new C17PacketCustomPayload("MC|Brand", (new PacketBuffer(Unpooled.buffer())).writeString("vanilla")));
               }
            }
         }

         C02PacketUseEntity var10;
         if (event.getPacket() instanceof C02PacketUseEntity) {
            var10 = (C02PacketUseEntity)event.getPacket();
            if (var10.getAction() == Action.INTERACT && var10.getEntityFromWorld(this.mc.theWorld) instanceof EntityHorse && this.mc.thePlayer.getHeldItem() == null) {
               EntityHorse var4 = (EntityHorse)var10.getEntityFromWorld(this.mc.theWorld);
               double var5 = var4.getHorseJumpStrength();
               double var7 = var4.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();
               ChatUtils.addChatMessage("Horse JumpStrength = §c" + (new BigDecimal(var5)).setScale(2, 4).doubleValue() + " §7- §fSpeed = §c" + (new BigDecimal(var7)).setScale(2, 4).doubleValue());
            }
         }

         if (event.getPacket() instanceof C02PacketUseEntity) {
            var10 = (C02PacketUseEntity)event.getPacket();
            if (var10.getAction() == Action.ATTACK && var10.getEntityFromWorld(this.mc.theWorld) instanceof EntityPlayer) {
               EntityPlayer var12 = (EntityPlayer)var10.getEntityFromWorld(this.mc.theWorld);
               if (Class305.Method705(var12) && Method1260(var12)) {
                  event.setCancelled(true);
               }

               if (Method1261(var12) && var12.isSneaking() && this.mc.thePlayer.getHeldItem() != null) {
                  event.setCancelled(true);
               }
            }
         }
      }

      if (event.isRecieve()) {
         if (event.getPacket() instanceof S07PacketRespawn || event.getPacket() instanceof S02PacketLoginSuccess) {
            if (this.mc.isSingleplayer() && !currentServer.equals(Servers.NONE)) {
               currentServer = Servers.NONE;
            }

            GlobalModule.INSTANCE.balant.Field2826.Method216(86399500);
            if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty()) {
               GlobalModule.INSTANCE.balant.Field2823.forEach(ServerPacketHandler::Method1262);
            }
         }

         if (event.getPacket() instanceof S3DPacketDisplayScoreboard) {
            S3DPacketDisplayScoreboard var11 = (S3DPacketDisplayScoreboard)event.getPacket();
            String var13 = var11.func_149370_d();
            int var14 = var11.func_149371_c();
            if (var14 == 1) {
               ChatUtils.debug("计分板:" + var13);
               if (var13.equalsIgnoreCase("SBScoreboard")) {
                  currentServer = Servers.SB;
               }

               if (var13.equalsIgnoreCase("Mw")) {
                  currentServer = Servers.MW;
               }

               if (var13.equalsIgnoreCase("§e§lHYPIXEL")) {
                  currentServer = Servers.UHC;
               }

               if (var13.equalsIgnoreCase("SForeboard")) {
                  currentServer = Servers.SW;
               }

               if (var13.equalsIgnoreCase("BForeboard")) {
                  currentServer = Servers.BW;
               }

               if (var13.equalsIgnoreCase("PreScoreboard")) {
                  currentServer = Servers.PRE;
               }

               if (var13.equalsIgnoreCase("Duels")) {
                  currentServer = Servers.DUELS;
               }

               if (var13.equalsIgnoreCase("Pit")) {
                  currentServer = Servers.PIT;
               }

               if (var13.equalsIgnoreCase("Blitz SG")) {
                  currentServer = Servers.SG;
               }

               if (var13.equalsIgnoreCase("MurderMystery")) {
                  currentServer = Servers.MM;
               }

               currentServer = Servers.NONE;
               GlobalModule.INSTANCE.balant.Field2826.Method216(86399500);
            }

            ChatUtils.debug("当前模式:" + currentServer.name());
         }
      }

   }

   public static boolean Method1260(Entity a) {
      if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty()) {
         Iterator var1 = GlobalModule.INSTANCE.balant.Field2823.Method1383();

         while(var1.Method932()) {
            Class606 var2 = (Class606)var1.Method933();
            if (a.getName().equals(var2.Field2841)) {
               return var2.Method3740() >= 5;
            }
         }
      }

      return false;
   }

   public static boolean Method1261(Entity a) {
      if (GlobalModule.INSTANCE.balant.Field2827.Method3740() >= 5) {
         return false;
      } else {
         if (!GlobalModule.INSTANCE.balant.Field2823.isEmpty()) {
            Iterator var1 = GlobalModule.INSTANCE.balant.Field2823.Method1383();

            while(var1.Method932()) {
               Class606 var2 = (Class606)var1.Method933();
               if (a.getName().equals(var2.Field2841)) {
                  if (var2.Field2848) {
                     ++var2.Field2852;
                     if (var2.Field2852 >= 100) {
                        return false;
                     }
                  }

                  return var2.Field2848;
               }
            }
         }

         return false;
      }
   }

   private static void Method1262(Class606 a) {
      a.Field2852 = 0;
   }

   static {
      currentServer = Servers.NONE;
   }
}
