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
      boolean var3 = this.remove.getBooleanValue();
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
      EntityPlayer var6;
      String var7;
      if (this.mode.isCurrentMode("Hypixel")) {
         var4 = mc.theWorld.getLoadedEntityList().Method1383();
         if (var4.Method932()) {
            Object var5 = var4.Method933();
            if (var5 instanceof EntityPlayer) {
               var6 = (EntityPlayer)var5;
               if (var6 != mc.thePlayer && !botList.contains(var6)) {
                  label202: {
                     var7 = var6.getDisplayName().getFormattedText();
                     String var8 = var6.getCustomNameTag();
                     String var9 = var6.getName();
                     if (var6.isInvisible() && var7.startsWith("§r§c") && var7.endsWith("§r")) {
                        double var10 = Math.abs(var6.posX - mc.thePlayer.posX);
                        double var12 = Math.abs(var6.posY - mc.thePlayer.posY);
                        double var14 = Math.abs(var6.posZ - mc.thePlayer.posZ);
                        double var16 = Math.sqrt(var10 * var10 + var14 * var14);
                        if (var12 < 13.0 && var12 > 10.0 && var16 < 3.0) {
                           List var18 = this.getTabPlayer();
                           if (!var18.contains(var6)) {
                              this.timer2.reset();
                              botList2.Method2530(var6);
                              mc.theWorld.removeEntity(var6);
                              botList.Method2530(var6);
                           }
                        }
                     }

                     if (ServerUtils.isSinglePlayer(Servers.PRE) && var6.isInvisible() && var7.startsWith("§r") && var6.getHealth() < 20.0F) {
                        this.timer2.reset();
                        botList2.Method2530(var6);
                        mc.theWorld.removeEntity(var6);
                        botList.Method2530(var6);
                     }

                     if (!var7.startsWith("§r§") && var7.endsWith("§r") && (mc.getNetHandler().getPlayerInfo(var6.getUniqueID()) == null || mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() == 0)) {
                        if (!ServerUtils.isSinglePlayer(Servers.UHC)) {
                           if (ServerUtils.isCleared() && var6.getEyeHeight() <= 0.2F) {
                              botList.Method2530(var6);
                           }

                           if (ServerUtils.isCleared()) {
                              break label202;
                           }

                           botList.Method2530(var6);
                        }

                        if (mc.playerController.getCurrentGameType() != GameType.ADVENTURE) {
                           break label202;
                        }

                        botList.Method2530(var6);
                     }

                     if (ServerUtils.isSinglePlayer(Servers.MM) && var7.startsWith("§r§") && var7.endsWith("§r") && var6.getEyeHeight() <= 0.2F && Objects.isNull(mc.getNetHandler().getPlayerInfo(var6.getUniqueID()))) {
                        botList.Method2530(var6);
                     }

                     if (var6.isInvisible() && var7.startsWith("§r§c") && var7.endsWith("§r") && (Objects.isNull(mc.getNetHandler().getPlayerInfo(var6.getUniqueID())) || mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() == 0)) {
                        this.timer2.reset();
                        botList2.Method2530(var6);
                        mc.theWorld.removeEntity(var6);
                        botList.Method2530(var6);
                     }

                     if (var6.isInvisible() && var9.startsWith("§c") && (Objects.isNull(mc.getNetHandler().getPlayerInfo(var6.getUniqueID())) || mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() > 20 || mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() == 0)) {
                        this.timer2.reset();
                        botList2.Method2530(var6);
                        mc.theWorld.removeEntity(var6);
                        botList.Method2530(var6);
                     }

                     if (var7.contains("[NPC]")) {
                        botList.Method2530(var6);
                     }

                     if (!var7.contains("§c") && !var8.equalsIgnoreCase("")) {
                        if (ServerUtils.isSinglePlayer(Servers.SB)) {
                           break label202;
                        }

                        botList.Method2530(var6);
                     }

                     if (!var6.isInvisible() && var7.startsWith("§r§c") && var7.endsWith("§r") && mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() > 20) {
                        ChatUtils.debug("名字: " + var9);
                        ChatUtils.debug("全名: " + var7);
                        ChatUtils.debug("隐身: " + var6.isInvisible());
                        ChatUtils.debug("距离: " + mc.thePlayer.getDistanceToEntity(var6));
                        ChatUtils.debug("ResponseTime:" + mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime());
                        if (var6.posY > mc.thePlayer.posY && (double)mc.thePlayer.getDistanceToEntity(var6) <= 6.0 && !var7.startsWith("§r§c[§fYOUTUBE§c]") && !var7.startsWith("§r§c[ADMIN]")) {
                           ChatUtils.addChatMessage("检测 " + var7 + " - GameMaster Bot!");
                           mc.theWorld.removeEntity(var6);
                           ChatUtils.addChatMessage("已清除Bot!");
                           botList.Method2530(var6);
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
            Entity var19 = (Entity)var4.Method933();
            if (var19 != mc.thePlayer) {
               if (var19 instanceof EntityPlayer) {
                  var6 = (EntityPlayer)var19;
                  if (!botList.contains(var6)) {
                     var7 = var6.getDisplayName().getFormattedText();
                     if (var6.isSprinting()) {
                        ChatUtils.debug(var19.getEntityId() + "");
                        ChatUtils.debug(var19.ticksExisted + "");
                        ChatUtils.debug(mc.getNetHandler().getPlayerInfo(var6.getUniqueID()).getResponseTime() + "");
                        if (this.info.getValue()) {
                           ChatUtils.addChatMessage(" Add " + var19.getDisplayName().getFormattedText() + " Bot");
                        }

                        botList.Method2530(var6);
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
            Entity var3 = (Entity)var2.Method933();
            if (var3 != mc.thePlayer && var3 instanceof EntityPlayer && mc.getNetHandler().getPlayerInfo(var3.getUniqueID()).getResponseTime() > 20) {
               if (this.info.getValue()) {
                  ChatUtils.addChatMessage(" Kill " + var3.getDisplayName().getFormattedText() + " Bot");
               }

               mc.theWorld.removeEntity(var3);
            }
         }
      }

   }

   public List getTabPlayer() {
      Collection var1 = mc.thePlayer.sendQueue.getPlayerInfoMap();
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.Method1383();

      while(var3.Method932()) {
         NetworkPlayerInfo var4 = (NetworkPlayerInfo)var3.Method933();
         var2.Method2530(mc.theWorld.getPlayerEntityByName(var4.getGameProfile().getName()));
      }

      return var2;
   }
}
