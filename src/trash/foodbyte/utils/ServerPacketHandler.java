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
            Class379 a;
            do {
               if (!var2.Method932()) {
                  return;
               }

               a = (Class379)var2.Method933();
               if ("Radar".equals(a.Field1813)) {
                  if (((Radar)ModuleManager.getModule2(Radar.class)).getState() && a.Field1826) {
                     a.Method462();
                  } else if (!((Radar)ModuleManager.getModule2(Radar.class)).getState() && !a.Field1826) {
                     a.Method461();
                  }
               }
            } while(!"PlayerInventory".equals(a.Field1813));

            if (((Inventory)ModuleManager.getModule2(Inventory.class)).getState() && a.Field1826) {
               a.Method462();
            } else if (!((Inventory)ModuleManager.getModule2(Inventory.class)).getState() && !a.Field1826) {
               a.Method461();
            }
         }
      }
   }

   @EventTarget
   public void Method1258(EventRender3D a) {
   }

   @EventTarget
   public void onPacket(EventPacket event) {
      String[] a = EventPacket.trash();
      if (event.isSend()) {
         if (GlobalModule.Field3140.getValue() && !this.mc.isSingleplayer()) {
            if (event.getPacket() instanceof FMLProxyPacket) {
               FMLProxyPacket a = (FMLProxyPacket)event.getPacket();
               event.setCancelled(true);
            }

            if (event.getPacket() instanceof C17PacketCustomPayload) {
               C17PacketCustomPayload a = (C17PacketCustomPayload)event.getPacket();
               if (a.getChannelName().equalsIgnoreCase("MC|Brand")) {
                  event.setCancelled(true);
                  Wrapper.INSTANCE.sendPacketNoEvent(new C17PacketCustomPayload("MC|Brand", (new PacketBuffer(Unpooled.buffer())).writeString("vanilla")));
               }
            }
         }

         C02PacketUseEntity a;
         if (event.getPacket() instanceof C02PacketUseEntity) {
            a = (C02PacketUseEntity)event.getPacket();
            if (a.getAction() == Action.INTERACT && a.getEntityFromWorld(this.mc.theWorld) instanceof EntityHorse && this.mc.thePlayer.getHeldItem() == null) {
               EntityHorse a = (EntityHorse)a.getEntityFromWorld(this.mc.theWorld);
               double a = a.getHorseJumpStrength();
               double a = a.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();
               ChatUtils.addChatMessage("Horse JumpStrength = §c" + (new BigDecimal(a)).setScale(2, 4).doubleValue() + " §7- §fSpeed = §c" + (new BigDecimal(a)).setScale(2, 4).doubleValue());
            }
         }

         if (event.getPacket() instanceof C02PacketUseEntity) {
            a = (C02PacketUseEntity)event.getPacket();
            if (a.getAction() == Action.ATTACK && a.getEntityFromWorld(this.mc.theWorld) instanceof EntityPlayer) {
               EntityPlayer a = (EntityPlayer)a.getEntityFromWorld(this.mc.theWorld);
               if (Class305.Method705(a) && Method1260(a)) {
                  event.setCancelled(true);
               }

               if (Method1261(a) && a.isSneaking() && this.mc.thePlayer.getHeldItem() != null) {
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
            S3DPacketDisplayScoreboard a = (S3DPacketDisplayScoreboard)event.getPacket();
            String a = a.func_149370_d();
            int a = a.func_149371_c();
            if (a == 1) {
               ChatUtils.debug("计分板:" + a);
               if (a.equalsIgnoreCase("SBScoreboard")) {
                  currentServer = Servers.SB;
               }

               if (a.equalsIgnoreCase("Mw")) {
                  currentServer = Servers.MW;
               }

               if (a.equalsIgnoreCase("§e§lHYPIXEL")) {
                  currentServer = Servers.UHC;
               }

               if (a.equalsIgnoreCase("SForeboard")) {
                  currentServer = Servers.SW;
               }

               if (a.equalsIgnoreCase("BForeboard")) {
                  currentServer = Servers.BW;
               }

               if (a.equalsIgnoreCase("PreScoreboard")) {
                  currentServer = Servers.PRE;
               }

               if (a.equalsIgnoreCase("Duels")) {
                  currentServer = Servers.DUELS;
               }

               if (a.equalsIgnoreCase("Pit")) {
                  currentServer = Servers.PIT;
               }

               if (a.equalsIgnoreCase("Blitz SG")) {
                  currentServer = Servers.SG;
               }

               if (a.equalsIgnoreCase("MurderMystery")) {
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
            Class606 a = (Class606)var1.Method933();
            if (a.getName().equals(a.Field2841)) {
               return a.Method3740() >= 5;
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
               Class606 a = (Class606)var1.Method933();
               if (a.getName().equals(a.Field2841)) {
                  if (a.Field2848) {
                     ++a.Field2852;
                     if (a.Field2852 >= 100) {
                        return false;
                     }
                  }

                  return a.Field2848;
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
