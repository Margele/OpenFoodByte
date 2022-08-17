package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.WorldSettings.GameType;
import obfuscate.b;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class AntiBot extends Module {
   public static List botList = new ArrayList();
   public static List botList2 = new ArrayList();
   TimeHelper timer2 = new TimeHelper();
   public ModeValue mode = new ModeValue("AntiBot", "Mode", "Hypixel", new String[]{"Hypixel", "TabList"}, "反机器人模式");
   public BooleanValue remove = new BooleanValue("Antibot", "Remove", true, "删除bot实体");
   public BooleanValue info = new BooleanValue("Antibot", "Info", true, "聊天框提示bot检测");
   public TimeHelper timer = new TimeHelper();

   public AntiBot() {
      super("AntiBot", "Anti Bot", Category.COMBAT);
   }

   public String getDescription() {
      return "反机器人";
   }

   public void onDisable() {
      if (!botList.isEmpty()) {
         botList.clear();
      }

      super.onDisable();
   }

   @EventTarget(0)
   public void onUpdate(EventUpdate event) {
      this.setDisplayTag(this.mode.getMode());
      b.trash();
      boolean a = this.remove.getBooleanValue();
      if (!botList2.isEmpty() && this.timer2.isDelayComplete(1000.0)) {
         if (this.info.getValue()) {
            if (botList2.Method1799() == 1) {
               ChatUtils.addChatMessage(" Kill " + botList2.Method1799() + " Watchdog !!!");
            }

            ChatUtils.addChatMessage(" Kill " + botList2.Method1799() + " Bots!");
         }

         this.timer2.reset();
         botList2.clear();
      }

      if (!botList.isEmpty() && this.timer.isDelayComplete(1000.0)) {
         botList.clear();
         this.timer.reset();
      }

      Iterator var4;
      EntityPlayer a;
      String a;
      if (this.mode.isCurrentMode("Hypixel")) {
         var4 = mc.theWorld.getLoadedEntityList().Method1383();
         if (var4.Method932()) {
            Object a = var4.Method933();
            if (a instanceof EntityPlayer) {
               a = (EntityPlayer)a;
               if (a != mc.thePlayer && !botList.contains(a)) {
                  label202: {
                     a = a.getDisplayName().getFormattedText();
                     String a = a.getCustomNameTag();
                     String a = a.getName();
                     if (a.isInvisible() && a.startsWith("§r§c") && a.endsWith("§r")) {
                        double a = Math.abs(a.posX - mc.thePlayer.posX);
                        double a = Math.abs(a.posY - mc.thePlayer.posY);
                        double a = Math.abs(a.posZ - mc.thePlayer.posZ);
                        double a = Math.sqrt(a * a + a * a);
                        if (a < 13.0 && a > 10.0 && a < 3.0) {
                           List a = this.getTabPlayer();
                           if (!a.contains(a)) {
                              this.timer2.reset();
                              botList2.Method2530(a);
                              mc.theWorld.removeEntity(a);
                              botList.Method2530(a);
                           }
                        }
                     }

                     if (ServerUtils.isSinglePlayer(Servers.PRE) && a.isInvisible() && a.startsWith("§r") && a.getHealth() < 20.0F) {
                        this.timer2.reset();
                        botList2.Method2530(a);
                        mc.theWorld.removeEntity(a);
                        botList.Method2530(a);
                     }

                     if (!a.startsWith("§r§") && a.endsWith("§r") && (mc.getNetHandler().getPlayerInfo(a.getUniqueID()) == null || mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() == 0)) {
                        if (!ServerUtils.isSinglePlayer(Servers.UHC)) {
                           if (ServerUtils.isCleared() && a.getEyeHeight() <= 0.2F) {
                              botList.Method2530(a);
                           }

                           if (ServerUtils.isCleared()) {
                              break label202;
                           }

                           botList.Method2530(a);
                        }

                        if (mc.playerController.getCurrentGameType() != GameType.ADVENTURE) {
                           break label202;
                        }

                        botList.Method2530(a);
                     }

                     if (ServerUtils.isSinglePlayer(Servers.MM) && a.startsWith("§r§") && a.endsWith("§r") && a.getEyeHeight() <= 0.2F && Objects.isNull(mc.getNetHandler().getPlayerInfo(a.getUniqueID()))) {
                        botList.Method2530(a);
                     }

                     if (a.isInvisible() && a.startsWith("§r§c") && a.endsWith("§r") && (Objects.isNull(mc.getNetHandler().getPlayerInfo(a.getUniqueID())) || mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() == 0)) {
                        this.timer2.reset();
                        botList2.Method2530(a);
                        mc.theWorld.removeEntity(a);
                        botList.Method2530(a);
                     }

                     if (a.isInvisible() && a.startsWith("§c") && (Objects.isNull(mc.getNetHandler().getPlayerInfo(a.getUniqueID())) || mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() == 0)) {
                        this.timer2.reset();
                        botList2.Method2530(a);
                        mc.theWorld.removeEntity(a);
                        botList.Method2530(a);
                     }

                     if (a.contains("[NPC]")) {
                        botList.Method2530(a);
                     }

                     if (!a.contains("§c") && !a.equalsIgnoreCase("")) {
                        if (ServerUtils.isSinglePlayer(Servers.SB)) {
                           break label202;
                        }

                        botList.Method2530(a);
                     }

                     if (!a.isInvisible() && a.startsWith("§r§c") && a.endsWith("§r") && mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() > 20) {
                        ChatUtils.debug("名字: " + a);
                        ChatUtils.debug("全名: " + a);
                        ChatUtils.debug("隐身: " + a.isInvisible());
                        ChatUtils.debug("距离: " + mc.thePlayer.getDistanceToEntity(a));
                        ChatUtils.debug("ResponseTime:" + mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime());
                        if (a.posY > mc.thePlayer.posY && (double)mc.thePlayer.getDistanceToEntity(a) <= 6.0 && !a.startsWith("§r§c[§fYOUTUBE§c]") && !a.startsWith("§r§c[ADMIN]")) {
                           ChatUtils.addChatMessage("检测 " + a + " - GameMaster Bot!");
                           mc.theWorld.removeEntity(a);
                           ChatUtils.addChatMessage("已清除Bot!");
                           botList.Method2530(a);
                        }
                     }
                  }
               }
            }
         }
      }

      if (this.mode.isCurrentMode("MineLand")) {
         var4 = mc.theWorld.getLoadedEntityList().Method1383();

         while(var4.Method932()) {
            Entity a = (Entity)var4.Method933();
            if (a != mc.thePlayer) {
               if (a instanceof EntityPlayer) {
                  a = (EntityPlayer)a;
                  if (!botList.contains(a)) {
                     a = a.getDisplayName().getFormattedText();
                     if (a.isSprinting()) {
                        ChatUtils.debug(a.getEntityId() + "");
                        ChatUtils.debug(a.ticksExisted + "");
                        ChatUtils.debug(mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() + "");
                        if (this.info.getValue()) {
                           ChatUtils.addChatMessage(" Add " + a.getDisplayName().getFormattedText() + " Bot");
                        }

                        botList.Method2530(a);
                     }
                  }
               }
               break;
            }
         }
      }

   }

   @EventTarget
   public void onUpdate2(EventUpdate e) {
      if (this.mode.isCurrentMode("Hypixel2")) {
         this.setDisplayTag("Hypixel2");
         Iterator var2 = mc.theWorld.getLoadedEntityList().Method1383();

         while(var2.Method932()) {
            Entity a = (Entity)var2.Method933();
            if (a != mc.thePlayer && a instanceof EntityPlayer && mc.getNetHandler().getPlayerInfo(a.getUniqueID()).getResponseTime() > 20) {
               if (this.info.getValue()) {
                  ChatUtils.addChatMessage(" Kill " + a.getDisplayName().getFormattedText() + " Bot");
               }

               mc.theWorld.removeEntity(a);
            }
         }
      }

   }

   public List getTabPlayer() {
      Collection a = mc.thePlayer.sendQueue.getPlayerInfoMap();
      ArrayList a = new ArrayList();
      Iterator var3 = a.Method1383();

      while(var3.Method932()) {
         NetworkPlayerInfo a = (NetworkPlayerInfo)var3.Method933();
         a.Method2530(mc.theWorld.getPlayerEntityByName(a.getGameProfile().getName()));
      }

      return a;
   }
}
