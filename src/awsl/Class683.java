/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class15;
import awsl.Class441;
import awsl.Class673;
import awsl.Class91;
import awsl.Class98;

public final class Class683
extends Enum {
    public static final Class683 drawRect = new Class683("drawRect", 0, "drawRect", "func_73734_a", "a", "(IIIII)V");
    public static final Class683 updateScreen = new Class683("updateScreen", 1, "updateScreen", "func_73876_c", "e", "()V");
    public static final Class683 onGuiClosed = new Class683("onGuiClosed", 2, "onGuiClosed", "func_146281_b", "m", "()V");
    public static final Class683 drawScreen = new Class683("drawScreen", 3, "drawScreen", "func_73863_a", "a", "(IIF)V");
    public static final Class683 initGui = new Class683("initGui", 4, "initGui", "func_73866_w_", "b", "()V");
    public static final Class683 keyTyped = new Class683("keyTyped", 5, "keyTyped", "func_73869_a", "a", "(CI)V", true);
    public static final Class683 handleKeyboardInput = new Class683("handleKeyboardInput", 6, "handleKeyboardInput", "func_146282_l", "l", "()V", true);
    public static final Class683 handleMouseClick = new Class683("handleMouseClick", 7, "handleMouseClick", "func_146984_a", "a", "(Lnet/minecraft/inventory/Slot;III)V", "(" + Class673.Slot.Method2027() + "III)V");
    public static final Class683 mouseClicked = new Class683("mouseClicked", 8, "mouseClicked", "func_73864_a", "a", "(III)V", true);
    public static final Class683 drawGradientRect = new Class683("drawGradientRect", 9, "drawGradientRect", "func_73733_a", "a", "(IIIIII)V");
    public static final Class683 drawSlot = new Class683("drawSlot", 10, "drawSlot", "func_146977_a", "a", "(Lnet/minecraft/inventory/Slot;)V", "(" + Class673.Slot.Method2027() + ")V");
    public static final Class683 checkHotbarKeys = new Class683("checkHotbarKeys", 11, "checkHotbarKeys", "func_146983_a", "b", "(I)Z");
    public static final Class683 actionPerformed = new Class683("actionPerformed", 12, "actionPerformed", "func_146284_a", "a", "(Lnet/minecraft/client/gui/GuiButton;)V", "(" + Class673.GuiButton.Method2027() + ")V");
    public static final Class683 handleMouseInput = new Class683("handleMouseInput", 13, "handleMouseInput", "func_178039_p", "p", "()V", true);
    public static final Class683 mouseClickMove = new Class683("mouseClickMove", 14, "mouseClickMove", "func_146273_a", "a", "(IIIJ)V");
    public static final Class683 mouseReleased = new Class683("mouseReleased", 15, "mouseReleased", "func_146286_b", "b", "(III)V");
    public static final Class683 drawGuiContainerBackgroundLayer = new Class683("drawGuiContainerBackgroundLayer", 16, "drawGuiContainerBackgroundLayer", "func_146976_a", "a", "(FII)V");
    public static final Class683 renderToolTip = new Class683("renderToolTip", 17, "renderToolTip", "func_146285_a", "a", "(Lnet/minecraft/item/ItemStack;II)V", "(" + Class673.ItemStack.Method2027() + "II)V");
    public static final Class683 handleComponentClick = new Class683("handleComponentClick", 18, "handleComponentClick", "func_175276_a", "a", "(Lnet/minecraft/util/IChatComponent;)Z", "(" + Class673.IChatComponent.Method2027() + ")Z");
    public static final Class683 sendPacket = new Class683("sendPacket", 19, "sendPacket", "func_179290_a", "a", "(" + Class673.Packet.Method2027() + ")V");
    public static final Class683 channelRead0 = new Class683("channelRead0", 20, "channelRead0", "channelRead0", "a", "(Lio/netty/channel/ChannelHandlerContext;" + Class673.Packet.Method2027() + ")V");
    public static final Class683 sendChatMessage = new Class683("sendChatMessage", 21, "sendChatMessage", "func_71165_d", "e", "(Ljava/lang/String;)V");
    public static final Class683 onUpdate = new Class683("onUpdate", 22, "onUpdate", "func_70071_h_", "t_", "()V");
    public static final Class683 onLivingUpdate = new Class683("onLivingUpdate", 23, "onLivingUpdate", "func_70636_d", "m", "()V");
    public static final Class683 isRiding = new Class683("isRiding", 24, "isRiding", "func_70115_ae", "au", "()Z");
    public static final Class683 onUpdateWalkingPlayer = new Class683("onUpdateWalkingPlayer", 25, "onUpdateWalkingPlayer", "func_175161_p", "p", "()V");
    public static final Class683 attackTargetEntityWithCurrentItem = new Class683("attackTargetEntityWithCurrentItem", 26, "attackTargetEntityWithCurrentItem", "func_71059_n", "f", "(" + Class673.Entity.Method2027() + ")V");
    public static final Class683 moveEntity = new Class683("moveEntity", 27, "moveEntity", "func_70091_d", "d", "(DDD)V");
    public static final Class683 onEntityUpdate = new Class683("onEntityUpdate", 28, "onEntityUpdate", "func_70030_z", "K", "()V");
    public static final Class683 spawnRunningParticles = new Class683("spawnRunningParticles", 29, "spawnRunningParticles", "func_174830_Y", "Y", "()V");
    public static final Class683 handleWaterMovement = new Class683("handleWaterMovement", 30, "handleWaterMovement", "func_70072_I", "W", "()Z");
    public static final Class683 getCollisionBorderSize = new Class683("getCollisionBorderSize", 31, "getCollisionBorderSize", "func_70111_Y", "ao", "()F");
    public static final Class683 addSingleplayerMultiplayerButtons = new Class683("addSingleplayerMultiplayerButtons", 32, "addSingleplayerMultiplayerButtons", "func_73969_a", "b", "(II)V");
    public static final Class683 renderGameOverlay = new Class683("renderGameOverlay", 33, "renderGameOverlay", "func_175180_a", "a", "(F)V");
    public static final Class683 updatePlayerList = new Class683("updatePlayerList", 34, "updatePlayerList", "func_175246_a", "a", "(Z)V");
    public static final Class683 getPlayerName = new Class683("getPlayerName", 35, "getPlayerName", "func_175243_a", "a", "(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;");
    public static final Class683 transformModelCount = new Class683("transformModelCount", 36, "func_177077_a", "func_177077_a", "a", "(Lnet/minecraft/entity/item/EntityItem;DDDFLnet/minecraft/client/resources/model/IBakedModel;)I", "(" + Class673.EntityItem.Method2027() + "DDDF" + Class673.IBakedModel.Method2027() + ")I");
    public static final Class683 renderItemAndEffectIntoGUI = new Class683("renderItemAndEffectIntoGUI", 37, "renderItemAndEffectIntoGUI", "func_180450_b", "b", "(Lnet/minecraft/item/ItemStack;II)V", "(" + Class673.ItemStack.Method2027() + "II)V");
    public static final Class683 drawGuiContainerForegroundLayer = new Class683("drawGuiContainerForegroundLayer", 38, "drawGuiContainerForegroundLayer", "func_146979_b", "b", "(II)V");
    public static final Class683 renderItemModelTransform = new Class683("renderItemModelTransform", 39, "renderItemModelTransform", "func_175040_a", "a", "(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V", "(" + Class673.ItemStack.Method2027() + Class673.IBakedModel.Method2027() + Class673.ItemCameraTransforms$TransformType.Method2027() + ")V");
    public static final Class683 renderItem = new Class683("renderItem", 40, "renderItem", "func_180454_a", "a", "(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V", "(" + Class673.ItemStack.Method2027() + Class673.IBakedModel.Method2027() + ")V");
    public static final Class683 renderModel_RenderItem = new Class683("renderModel_RenderItem", 41, "renderModel", "func_175036_a", "a", "(Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/item/ItemStack;)V", "(" + Class673.IBakedModel.Method2027() + Class673.ItemStack.Method2027() + ")V");
    public static final Class683 color = new Class683("color", 42, "color", "func_179131_c", "c", "(FFFF)V");
    public static final Class683 rotate = new Class683("rotate", 43, "rotate", "func_179114_b", "b", "(FFFF)V");
    public static final Class683 drawString = new Class683("drawString", 44, "drawString", "func_78276_b", "a", "(Ljava/lang/String;III)I");
    public static final Class683 getUnformattedText = new Class683("getUnformattedText", 45, "getUnformattedText", "func_150260_c", "c", "()Ljava/lang/String;");
    public static final Class683 isItemDamaged = new Class683("isItemDamaged", 46, "isItemDamaged", "func_77951_h", "g", "()Z");
    public static final Class683 getNormalizedVolume = new Class683("getNormalizedVolume", 47, "getNormalizedVolume", "func_148594_a", "a", "(Lnet/minecraft/client/audio/ISound;Lnet/minecraft/client/audio/SoundPoolEntry;Lnet/minecraft/client/audio/SoundCategory;)F", "(" + Class673.ISound.Method2027() + Class673.SoundPoolEntry.Method2027() + Class673.SoundCategory.Method2027() + ")F");
    public static final Class683 bindTexture = new Class683("bindTexture", 48, "bindTexture", "func_147499_a", "a", "(Lnet/minecraft/util/ResourceLocation;)V", "(" + Class673.ResourceLocation.Method2027() + ")V");
    public static final Class683 renderAll = new Class683("renderAll", 49, "renderAll", "func_78231_a", "a", "()V");
    public static final Class683 isPotionActive = new Class683("isPotionActive", 50, "isPotionActive", "func_70644_a", "a", "(Lnet/minecraft/potion/Potion;)Z", "(" + Class673.Potion.Method2027() + ")Z");
    public static final Class683 dropOneItem = new Class683("dropOneItem", 51, "dropOneItem", "func_71040_bB", "a", "(Z)Lnet/minecraft/entity/item/EntityItem;", "(Z)" + Class673.EntityItem.Method2027());
    public static final Class683 setPlayerSPHealth = new Class683("setPlayerSPHealth", 52, "setPlayerSPHealth", "func_71150_b", "n", "(F)V");
    public static final Class683 getMouseOver = new Class683("getMouseOver", 53, "getMouseOver", "func_78473_a", "a", "(F)V");
    public static final Class683 orientCamera = new Class683("orientCamera", 54, "orientCamera", "func_78467_g", "f", "(F)V");
    public static final Class683 updateCameraAndRender = new Class683("updateCameraAndRender", 55, "updateCameraAndRender", "func_181560_a", "a", "(FJ)V");
    public static final Class683 distanceTo = new Class683("distanceTo", 56, "distanceTo", "func_72438_d", "a", "(" + Class673.Vec3.Method2027() + ")D");
    public static final Class683 addVelocity = new Class683("addVelocity", 57, "addVelocity", "func_70024_g", "g", "(DDD)V");
    public static final Class683 hurtCameraEffect = new Class683("hurtCameraEffect", 58, "hurtCameraEffect", "func_78482_e", "d", "(F)V");
    public static final Class683 updateLightmap = new Class683("updateLightmap", 59, "updateLightmap", "func_78472_g", "g", "(F)V");
    public static final Class683 clickMouse = new Class683("clickMouse", 60, "clickMouse", "func_147116_af", "aw", "()V");
    public static final Class683 setupFog = new Class683("setupFog", 61, "setupFog", "func_78468_a", "a", "(IF)V");
    public static final Class683 setFog = new Class683("setFog", 62, "setFog", "func_179093_d", "d", "(I)V");
    public static final Class683 setupCameraTransform = new Class683("setupCameraTransform", 63, "setupCameraTransform", "func_78479_a", "a", "(FI)V");
    public static final Class683 renderWorldPass = new Class683("renderWorldPass", 64, "renderWorldPass", "func_175068_a", "a", "(IFJ)V");
    public static final Class683 setupViewBobbing = new Class683("setupViewBobbing", 65, "setupViewBobbing", "func_78475_f", "e", "(F)V");
    public static final Class683 getNightVisionBrightness = new Class683("getNightVisionBrightness", 66, "getNightVisionBrightness", "func_180438_a", "a", "(Lnet/minecraft/entity/EntityLivingBase;F)F", "(" + Class673.EntityLivingBase.Method2027() + "F)F");
    public static final Class683 renderBlock = new Class683("renderBlock", 67, "renderBlock", "func_175018_a", "a", "(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/WorldRenderer;)Z");
    public static final Class683 printChatMessageWithOptionalDeletion = new Class683("printChatMessageWithOptionalDeletion", 68, "printChatMessageWithOptionalDeletion", "func_146234_a", "a", "(Lnet/minecraft/util/IChatComponent;I)V", "(" + Class673.IChatComponent.Method2027() + "I)V");
    public static final Class683 refreshResources = new Class683("refreshResources", 69, "refreshResources", "func_110436_a", "e", "()V");
    public static final Class683 rightClickMouse = new Class683("rightClickMouse", 70, "rightClickMouse", "func_147121_ag", "ax", "()V");
    public static final Class683 middleClickMouse = new Class683("middleClickMouse", 71, "middleClickMouse", "func_147112_ai", "az", "()V");
    public static final Class683 isIntegratedServerRunning = new Class683("isIntegratedServerRunning", 72, "isIntegratedServerRunning", "func_71387_A", "E", "()Z");
    public static final Class683 runTick = new Class683("runTick", 73, "runTick", "func_71407_l", "s", "()V");
    public static final Class683 startGame = new Class683("startGame", 74, "startGame", "func_71384_a", "am", "()V", true);
    public static final Class683 shutdownMinecraftApplet = new Class683("shutdownMinecraftApplet", 75, "shutdownMinecraftApplet", "func_71405_e", "g", "()V");
    public static final Class683 dispatchKeypresses = new Class683("dispatchKeypresses", 76, "dispatchKeypresses", "func_152348_aa", "Z", "()V");
    public static final Class683 displayGuiScreen = new Class683("displayGuiScreen", 77, "displayGuiScreen", "func_147108_a", "a", "(Lnet/minecraft/client/gui/GuiScreen;)V");
    public static final Class683 sendClickBlockToController = new Class683("sendClickBlockToController", 78, "sendClickBlockToController", "func_147115_a", "b", "(Z)V");
    public static final Class683 isUsingItem = new Class683("isUsingItem", 79, "isUsingItem", "func_71039_bw", "bS", "()Z");
    public static final Class683 getIsHittingBlock = new Class683("getIsHittingBlock", 80, "getIsHittingBlock", "func_181040_m", "m", "()Z");
    public static final Class683 updateFramebufferSize = new Class683("updateFramebufferSize", 81, "updateFramebufferSize", "func_147119_ah", "ay", "()V");
    public static final Class683 runGameLoop = new Class683("runGameLoop", 82, "runGameLoop", "func_71411_J", "av", "()V", true);
    public static final Class683 ungrabMouseCursor = new Class683("ungrabMouseCursor", 83, "ungrabMouseCursor", "func_74373_b", "b", "()V");
    public static final Class683 handleSetSlot = new Class683("handleSetSlot", 84, "handleSetSlot", "func_147266_a", "a", "(Lnet/minecraft/network/play/server/S2FPacketSetSlot;)V", "(" + Class673.S2FPacketSetSlot.Method2027() + ")V");
    public static final Class683 handleWindowItems = new Class683("handleWindowItems", 85, "handleWindowItems", "func_147241_a", "a", "(Lnet/minecraft/network/play/server/S30PacketWindowItems;)V", "(" + Class673.S30PacketWindowItems.Method2027() + ")V");
    public static final Class683 clickBlock = new Class683("clickBlock", 86, "clickBlock", "func_180511_b", "b", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;)Z", "(" + Class673.BlockPos.Method2027() + Class673.EnumFacing.Method2027() + ")Z");
    public static final Class683 onPlayerDestroyBlock = new Class683("onPlayerDestroyBlock", 87, "onPlayerDestroyBlock", "func_178888_a", "a", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;)Z", "(" + Class673.BlockPos.Method2027() + Class673.EnumFacing.Method2027() + ")Z");
    public static final Class683 onPlayerDamageBlock = new Class683("onPlayerDamageBlock", 88, "onPlayerDamageBlock", "func_180512_c", "c", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;)Z", "(" + Class673.BlockPos.Method2027() + Class673.EnumFacing.Method2027() + ")Z");
    public static final Class683 windowClick = new Class683("windowClick", 89, "windowClick", "func_78753_a", "a", "(IIIILnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;", "(IIII" + Class673.EntityPlayer.Method2027() + ")" + Class673.ItemStack.Method2027());
    public static final Class683 AbstractdoRender = new Class683("AbstractdoRender", 90, "doRender", "func_76986_a", "a", "(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDFF)V", "(" + Class673.AbstractClientPlayer.Method2027() + "DDDFF)V");
    public static final Class683 doRender = new Class683("doRender", 91, "doRender", "func_76986_a", "a", "(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V", "(" + Class673.EntityLivingBase.Method2027() + "DDDFF)V");
    public static final Class683 renderName = new Class683("renderName", 92, "renderName", "func_177067_a", "b", "(Lnet/minecraft/entity/EntityLivingBase;DDD)V", "(" + Class673.EntityLivingBase.Method2027() + "DDD)V");
    public static final Class683 rotateCorpse = new Class683("rotateCorpse", 93, "rotateCorpse", "func_77043_a", "a", "(Lnet/minecraft/entity/EntityLivingBase;FFF)V", "(" + Class673.EntityLivingBase.Method2027() + "FFF)V");
    public static final Class683 isWearing = new Class683("isWearing", 94, "isWearing", "func_175148_a", "a", "(Lnet/minecraft/entity/player/EnumPlayerModelParts;)Z", "(" + Class673.EnumPlayerModelParts.Method2027() + ")Z");
    public static final Class683 renderModel_RendererLivingEntity = new Class683("renderModel_RendererLivingEntity", 95, "renderModel", "func_77036_a", "a", "(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V", "(" + Class673.EntityLivingBase.Method2027() + "FFFFFF)V");
    public static final Class683 renderLivingAt = new Class683("renderLivingAt", 96, "renderLivingAt", "func_77039_a", "a", "(Lnet/minecraft/entity/EntityLivingBase;DDD)V", "(" + Class673.EntityLivingBase.Method2027() + "DDD)V");
    public static final Class683 shouldRender = new Class683("shouldRender", 97, "shouldRender", "func_178635_a", "a", "(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z", "(" + Class673.Entity.Method2027() + Class673.ICamera.Method2027() + "DDD)Z");
    public static final Class683 cacheActiveRenderInfo = new Class683("cacheActiveRenderInfo", 98, "cacheActiveRenderInfo", "func_180597_a", "a", "(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V");
    public static final Class683 updateRenderInfo = new Class683("updateRenderInfo", 99, "updateRenderInfo", "func_74583_a", "a", "(Lnet/minecraft/entity/player/EntityPlayer;Z)V");
    public static final Class683 playSound = new Class683("playSound", 100, "playSound", "func_148611_c", "c", "(Lnet/minecraft/client/audio/ISound;)V", "(" + Class673.ISound.Method2027() + ")V");
    public static final Class683 renderTileEntityAt = new Class683("renderTileEntityAt", 101, "renderTileEntityAt", "func_180535_a", "a", "(Lnet/minecraft/tileentity/TileEntityEnderChest;DDDFI)V", "(" + Class673.TileEntityEnderChest.Method2027() + "DDDFI)V");
    public static final Class683 renderChar = new Class683("renderChar", 102, "renderChar", "func_181559_a", "a", "(CZ)F");
    public static final Class683 renderString = new Class683("renderString", 103, "renderString", "func_180455_b", "b", "(Ljava/lang/String;FFIZ)I");
    public static final Class683 getStringWidth = new Class683("getStringWidth", 104, "getStringWidth", "func_78256_a", "a", "(Ljava/lang/String;)I");
    public static final Class683 renderStringAtPos = new Class683("renderStringAtPos", 105, "renderStringAtPos", "func_78255_a", "a", "(Ljava/lang/String;Z)V");
    public static final Class683 jump = new Class683("jump", 106, "jump", "func_70664_aZ", "bF", "()V");
    public static final Class683 getLook = new Class683("getLook", 107, "getLook", "func_70676_i", "d", "(F)Lnet/minecraft/util/Vec3;");
    public static final Class683 handleStatusUpdate = new Class683("handleStatusUpdate", 108, "handleStatusUpdate", "func_70103_a", "a", "(B)V");
    public static final Class683 removePotionEffectClient = new Class683("removePotionEffectClient", 109, "removePotionEffectClient", "func_70618_n", "l", "(I)V");
    public static final Class683 addPotionEffect = new Class683("addPotionEffect", 110, "addPotionEffect", "func_70690_d", "c", "(Lnet/minecraft/potion/PotionEffect;)V", "(" + Class673.PotionEffect.Method2027() + ")V");
    public static final Class683 init = new Class683("init", 111, "<init>", "<init>", "<init>", "()V");
    public static final Class683 changeCurrentItem = new Class683("changeCurrentItem", 112, "changeCurrentItem", "func_70453_c", "d", "(I)V");
    public static final Class683 getEntityTexture_RenderEnderman = new Class683("getEntityTexture_RenderEnderman", 113, "getEntityTexture", "func_110775_a", "a", "(Lnet/minecraft/entity/monster/EntityEnderman;)Lnet/minecraft/util/ResourceLocation;", "(" + Class673.EntityEnderman.Method2027() + ")" + Class673.ResourceLocation.Method2027());
    public static final Class683 render = new Class683("render", 114, "render", "func_78088_a", "a", "(Lnet/minecraft/entity/Entity;FFFFFF)V", "(" + Class673.Entity.Method2027() + "FFFFFF)V");
    public static final Class683 onEntityRemoved = new Class683("onEntityRemoved", 115, "onEntityRemoved", "func_72847_b", "b", "(Lnet/minecraft/entity/Entity;)V", "(" + Class673.Entity.Method2027() + ")V");
    public static final Class683 startSection = new Class683("startSection", 116, "startSection", "func_76320_a", "a", "(Ljava/lang/String;)V");
    public static final Class683 shouldSideBeRendered = new Class683("shouldSideBeRendered", 117, "shouldSideBeRendered", "func_176225_a", "a", "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;)Z");
    public static final Class683 getBlockLayer = new Class683("getBlockLayer", 118, "getBlockLayer", "func_180664_k", "m", "()Lnet/minecraft/util/EnumWorldBlockLayer;");
    public static final Class683 getAmbientOcclusionLightValue = new Class683("getAmbientOcclusionLightValue", 119, "getAmbientOcclusionLightValue", "func_149685_I", "h", "()F");
    public static final Class683 putColorMultiplier = new Class683("putColorMultiplier", 120, "putColorMultiplier", "func_178978_a", "a", "(FFFI)V");
    public static final Class683 renderModel = new Class683("renderModel", 121, "renderModel", "func_178267_a", "a", "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/client/renderer/WorldRenderer;Z)Z");
    public static final Class683 renderModelAmbientOcclusion = new Class683("renderModelAmbientOcclusion", 122, "renderModelAmbientOcclusion", "renderModelAmbientOcclusion", "a", "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/block/Block;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/client/renderer/WorldRenderer;Z)Z");
    public static final Class683 renderModelAmbientOcclusionQuads = new Class683("renderModelAmbientOcclusionQuads", 123, "renderModelAmbientOcclusionQuads", "renderModelAmbientOcclusionQuads", "a", "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/Block;Lnet/minecraft/util/BlockPos;Lnet/minecraft/client/renderer/WorldRenderer;Ljava/util/List;[FLjava/util/BitSet;Lnet/minecraft/client/renderer/BlockModelRenderer$AmbientOcclusionFace;)V");
    public static final Class683 renderModelSmooth = new Class683("renderModelSmooth", 124, "renderModelSmooth", "renderModelSmooth", "a", "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/client/renderer/WorldRenderer;Z)Z");
    public static final Class683 renderQuadsSmooth = new Class683("renderQuadsSmooth", 125, "renderQuadsSmooth", "renderQuadsSmooth", "a", "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/client/renderer/WorldRenderer;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V");
    public static final Class683 invalidateRegionAndSetBlock = new Class683("invalidateRegionAndSetBlock", 126, "invalidateRegionAndSetBlock", "func_180503_b", "b", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z");
    public static final Class683 func_178606_a = new Class683("func_178606_a", 127, "func_178606_a", "func_178606_a", "a", "(Lnet/minecraft/util/BlockPos;)V");
    public static final Class683 computeVisibility = new Class683("computeVisibility", 128, "computeVisibility", "func_178607_a", "a", "()Lnet/minecraft/client/renderer/chunk/SetVisibility;");
    public static final Class683 setAllVisible = new Class683("setAllVisible", 129, "setAllVisible", "func_178618_a", "a", "(Z)V");
    public static final Class683 getFovModifier = new Class683("getFovModifier", 130, "getFovModifier", "func_175156_o", "o", "()F");
    public static final Class683 getLocationSkin = new Class683("getLocationSkin", 131, "getLocationSkin", "func_110306_p", "p", "()" + Class673.ResourceLocation.Method2027());
    public static final Class683 drawSelectionBox = new Class683("drawSelectionBox", 132, "drawSelectionBox", "func_72731_b", "a", "(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/MovingObjectPosition;IF)V");
    public static final Class683 addBlockDestroyEffects = new Class683("addBlockDestroyEffects", 133, "addBlockDestroyEffects", "func_180533_a", "a", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/state/IBlockState;)V");
    public static final Class683 getSunBrightness = new Class683("getSunBrightness", 134, "getSunBrightness", "func_72971_b", "b", "(F)F");
    public static final Class683 updateDynamicTexture = new Class683("updateDynamicTexture", 135, "updateDynamicTexture", "func_110564_a", "d", "()V");
    public static final Class683 endSection = new Class683("endSection", 136, "endSection", "func_76319_b", "b", "()V");
    public static final Class683 getPackImage = new Class683("getPackImage", 137, "endSection", "func_110586_a", "a", "()Ljava/awt/image/BufferedImage;");
    public static final Class683 connect = new Class683("connect", 138, "connect", "func_146367_a", "a", "(Ljava/lang/String;I)V");
    public static final Class683 NULL = new Class683("NULL", 139, null, null, null, null, false);
    private String Field2967;
    private String Field2968;
    private String[] Field2969 = null;
    private String Field2970;
    private String Field2971;
    private static final /* synthetic */ Class683[] Field2972;

    public static Class683[] Method2708() {
        return (Class683[])Field2972.clone();
    }

    public static Class683 Method2709(String a) {
        return (Class683)Enum.valueOf(Class683.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class683(String a, String a2) {
        this((String)var1_-1, (int)var2_-1, a, a2, (String)a4, (String)a3, (String)a3, false);
        void a3;
        void a4;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class683(String a, String a2, String a3) {
        this((String)var1_-1, (int)var2_-1, a, a2, a3, (String)a5, (String)a4, false);
        void a4;
        void a5;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class683(String a, String a2, boolean a3) {
        this((String)var1_-1, (int)var2_-1, a, a2, (String)a3, (String)a5, (String)a5, (boolean)a4);
        void a4;
        void a5;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class683(String a, String a2, String a3, boolean a4) {
        void var2_-1;
        void var1_-1;
        this.Field2970 = a;
        this.Field2971 = a2;
        if (Class441.Method2701()) {
            this.Field2967 = a;
            this.Field2968 = (String)a4;
        } else if (Class441.Method2702()) {
            void a5;
            this.Field2967 = a3;
            this.Field2968 = a5;
        } else {
            this.Field2967 = a2;
            this.Field2968 = (String)a4;
        }
        this.Field2969 = new String[]{"java/io/IOException"};
    }

    public String Method497() {
        return this.Field2967;
    }

    public String Method2027() {
        return this.Field2968;
    }

    public Class15 Method2710() {
        return new Class15(1, this.Field2967, this.Field2968, null, this.Field2969);
    }

    public boolean Method2711(Class98 a) {
        return this.Field2967.equals((Object)a.Field825) && this.Field2968.equals((Object)a.Field826);
    }

    public boolean Method2712(Class15 a) {
        return this.Field2967.equals((Object)a.Field195) && (this.Field2968.equals((Object)a.Field196) || this == init);
    }

    public boolean Method2713(Class98 a) {
        String[] stringArray = Class673.Method2342();
        boolean bl = (this.Field2970.equals((Object)a.Field825) || this.Field2971.equals((Object)a.Field825)) && this.Field2968.equals((Object)a.Field826);
        if (Class91.Method3648() == null) {
            Class673.Method2341(new String[1]);
        }
        return bl;
    }

    public boolean Method2714(Class15 a) {
        String[] stringArray = Class673.Method2342();
        boolean bl = !(!this.Field2970.equals((Object)a.Field195) && !this.Field2971.equals((Object)a.Field195) || !this.Field2968.equals((Object)a.Field196) && this != init);
        Class91.Method3647(new String[1]);
        return bl;
    }

    static {
        Field2972 = new Class683[]{drawRect, updateScreen, onGuiClosed, drawScreen, initGui, keyTyped, handleKeyboardInput, handleMouseClick, mouseClicked, drawGradientRect, drawSlot, checkHotbarKeys, actionPerformed, handleMouseInput, mouseClickMove, mouseReleased, drawGuiContainerBackgroundLayer, renderToolTip, handleComponentClick, sendPacket, channelRead0, sendChatMessage, onUpdate, onLivingUpdate, isRiding, onUpdateWalkingPlayer, attackTargetEntityWithCurrentItem, moveEntity, onEntityUpdate, spawnRunningParticles, handleWaterMovement, getCollisionBorderSize, addSingleplayerMultiplayerButtons, renderGameOverlay, updatePlayerList, getPlayerName, transformModelCount, renderItemAndEffectIntoGUI, drawGuiContainerForegroundLayer, renderItemModelTransform, renderItem, renderModel_RenderItem, color, rotate, drawString, getUnformattedText, isItemDamaged, getNormalizedVolume, bindTexture, renderAll, isPotionActive, dropOneItem, setPlayerSPHealth, getMouseOver, orientCamera, updateCameraAndRender, distanceTo, addVelocity, hurtCameraEffect, updateLightmap, clickMouse, setupFog, setFog, setupCameraTransform, renderWorldPass, setupViewBobbing, getNightVisionBrightness, renderBlock, printChatMessageWithOptionalDeletion, refreshResources, rightClickMouse, middleClickMouse, isIntegratedServerRunning, runTick, startGame, shutdownMinecraftApplet, dispatchKeypresses, displayGuiScreen, sendClickBlockToController, isUsingItem, getIsHittingBlock, updateFramebufferSize, runGameLoop, ungrabMouseCursor, handleSetSlot, handleWindowItems, clickBlock, onPlayerDestroyBlock, onPlayerDamageBlock, windowClick, AbstractdoRender, doRender, renderName, rotateCorpse, isWearing, renderModel_RendererLivingEntity, renderLivingAt, shouldRender, cacheActiveRenderInfo, updateRenderInfo, playSound, renderTileEntityAt, renderChar, renderString, getStringWidth, renderStringAtPos, jump, getLook, handleStatusUpdate, removePotionEffectClient, addPotionEffect, init, changeCurrentItem, getEntityTexture_RenderEnderman, render, onEntityRemoved, startSection, shouldSideBeRendered, getBlockLayer, getAmbientOcclusionLightValue, putColorMultiplier, renderModel, renderModelAmbientOcclusion, renderModelAmbientOcclusionQuads, renderModelSmooth, renderQuadsSmooth, invalidateRegionAndSetBlock, func_178606_a, computeVisibility, setAllVisible, getFovModifier, getLocationSkin, drawSelectionBox, addBlockDestroyEffects, getSunBrightness, updateDynamicTexture, endSection, getPackImage, connect, NULL};
    }
}