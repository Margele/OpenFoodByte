/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class441;

public final class Class673
extends Enum {
    public static final Class673 Minecraft;
    public static final Class673 Timer;
    public static final Class673 EntityItem;
    public static final Class673 Gui;
    public static final Class673 GuiChest;
    public static final Class673 IInventory;
    public static final Class673 FontRenderer;
    public static final Class673 GuiScreen;
    public static final Class673 GuiContainer;
    public static final Class673 GuiMainMenu;
    public static final Class673 GuiPlayerTabOverlay;
    public static final Class673 ItemStack;
    public static final Class673 GlStateManager;
    public static final Class673 Container;
    public static final Class673 Slot;
    public static final Class673 RenderItem;
    public static final Class673 RenderPlayer;
    public static final Class673 GuiInventory;
    public static final Class673 IChatComponent;
    public static final Class673 IReloadableResourceManager;
    public static final Class673 S2FPacketSetSlot;
    public static final Class673 S30PacketWindowItems;
    public static final Class673 BlockPos;
    public static final Class673 EntityPlayer;
    public static final Class673 EnumPlayerModelParts;
    public static final Class673 Entity;
    public static final Class673 SoundManager;
    public static final Class673 ISound;
    public static final Class673 SoundPoolEntry;
    public static final Class673 SoundCategory;
    public static final Class673 TileEntityEnderChestRenderer;
    public static final Class673 ResourceLocation;
    public static final Class673 ModelChest;
    public static final Class673 EntityPlayerSP;
    public static final Class673 EntityRenderer;
    public static final Class673 GuiNewChat;
    public static final Class673 Item;
    public static final Class673 MouseHelper;
    public static final Class673 NetHandlerPlayClient;
    public static final Class673 PlayerControllerMP;
    public static final Class673 RendererLivingEntity;
    public static final Class673 RenderManager;
    public static final Class673 ActiveRenderInfo;
    public static final Class673 EntityLivingBase;
    public static final Class673 EnumFacing;
    public static final Class673 ICamera;
    public static final Class673 RenderEntityItem;
    public static final Class673 TileEntityEnderChest;
    public static final Class673 GuiDisconnected;
    public static final Class673 GuiConnecting;
    public static final Class673 GuiButton;
    public static final Class673 GuiChat;
    public static final Class673 GuiIngame;
    public static final Class673 GuiIngameForge;
    public static final Class673 GuiIngameMenu;
    public static final Class673 ItemCameraTransforms$TransformType;
    public static final Class673 IBakedModel;
    public static final Class673 IBlockAccess;
    public static final Class673 InventoryPlayer;
    public static final Class673 Potion;
    public static final Class673 RenderEnderman;
    public static final Class673 EntityEnderman;
    public static final Class673 ModelBase;
    public static final Class673 ModelBiped;
    public static final Class673 ModelEnderman;
    public static final Class673 RenderGlobal;
    public static final Class673 EffectRenderer;
    public static final Class673 EntityFX;
    public static final Class673 PotionEffect;
    public static final Class673 WorldClient;
    public static final Class673 Packet;
    public static final Class673 NetworkManager;
    public static final Class673 Profiler;
    public static final Class673 Block;
    public static final Class673 BlockRendererDispatcher;
    public static final Class673 BlockModelRenderer;
    public static final Class673 World;
    public static final Class673 WorldRenderer;
    public static final Class673 BlockGlass;
    public static final Class673 BlockBush;
    public static final Class673 BlockGrass;
    public static final Class673 VisGraph;
    public static final Class673 SetVisibility;
    public static final Class673 AbstractClientPlayer;
    public static final Class673 Vec3;
    public static final Class673 DynamicTexture;
    public static final Class673 AbstractResourcePack;
    private String Field2949;
    private String Field2950;
    private String Field2951;
    private static final /* synthetic */ Class673[] Field2952;
    private static String[] Field2953;

    public static Class673[] Method2338() {
        return (Class673[])Field2952.clone();
    }

    public static Class673 Method2339(String a) {
        return (Class673)Enum.valueOf(Class673.class, (String)a);
    }

    /*
     * WARNING - void declaration
     */
    private Class673() {
        void a;
        void a2;
        void var2_-1;
        void var1_-1;
        this.Field2950 = a2;
        this.Field2951 = a;
        this.Field2949 = Class441.Method2701() || !Class441.Method2702() ? a2 : a;
    }

    public String Method497() {
        return this.Field2949;
    }

    public String Method2027() {
        return "L" + this.Field2949 + ";";
    }

    public String Method2340() {
        return this.Field2950.replaceAll("/", ".");
    }

    static {
        Class673.Method2341(new String[5]);
        Minecraft = new Class673("Minecraft", 0, "net/minecraft/client/Minecraft", "ave");
        Timer = new Class673("Timer", 1, "net/minecraft/util/Timer", "avl");
        EntityItem = new Class673("EntityItem", 2, "net/minecraft/entity/item/EntityItem", "uz");
        Gui = new Class673("Gui", 3, "net/minecraft/client/gui/Gui", "avp");
        GuiChest = new Class673("GuiChest", 4, "net/minecraft/client/gui/inventory/GuiChest", "ayr");
        IInventory = new Class673("IInventory", 5, "net/minecraft/inventory/IInventory", "og");
        FontRenderer = new Class673("FontRenderer", 6, "net/minecraft/client/gui/FontRenderer", "avn");
        GuiScreen = new Class673("GuiScreen", 7, "net/minecraft/client/gui/GuiScreen", "axu");
        GuiContainer = new Class673("GuiContainer", 8, "net/minecraft/client/gui/inventory/GuiContainer", "ayl");
        GuiMainMenu = new Class673("GuiMainMenu", 9, "net/minecraft/client/gui/GuiMainMenu", "aya");
        GuiPlayerTabOverlay = new Class673("GuiPlayerTabOverlay", 10, "net/minecraft/client/gui/GuiPlayerTabOverlay", "awh");
        ItemStack = new Class673("ItemStack", 11, "net/minecraft/item/ItemStack", "zx");
        GlStateManager = new Class673("GlStateManager", 12, "net/minecraft/client/renderer/GlStateManager", "bfl");
        Container = new Class673("Container", 13, "net/minecraft/inventory/Container", "xi");
        Slot = new Class673("Slot", 14, "net/minecraft/inventory/Slot", "yg");
        RenderItem = new Class673("RenderItem", 15, "net/minecraft/client/renderer/entity/RenderItem", "bjh");
        RenderPlayer = new Class673("RenderPlayer", 16, "net/minecraft/client/renderer/entity/RenderPlayer", "bln");
        GuiInventory = new Class673("GuiInventory", 17, "net/minecraft/client/gui/inventory/GuiInventory", "azc");
        IChatComponent = new Class673("IChatComponent", 18, "net/minecraft/util/IChatComponent", "eu");
        IReloadableResourceManager = new Class673("IReloadableResourceManager", 19, "net/minecraft/client/resources/IReloadableResourceManager", "bng");
        S2FPacketSetSlot = new Class673("S2FPacketSetSlot", 20, "net/minecraft/network/play/server/S2FPacketSetSlot", "gf");
        S30PacketWindowItems = new Class673("S30PacketWindowItems", 21, "net/minecraft/network/play/server/S30PacketWindowItems", "gd");
        BlockPos = new Class673("BlockPos", 22, "net/minecraft/util/BlockPos", "cj");
        EntityPlayer = new Class673("EntityPlayer", 23, "net/minecraft/entity/player/EntityPlayer", "wn");
        EnumPlayerModelParts = new Class673("EnumPlayerModelParts", 24, "net/minecraft/entity/player/EnumPlayerModelParts", "wo");
        Entity = new Class673("Entity", 25, "net/minecraft/entity/Entity", "pk");
        SoundManager = new Class673("SoundManager", 26, "net/minecraft/client/audio/SoundManager", "bpx");
        ISound = new Class673("ISound", 27, "net/minecraft/client/audio/ISound", "bpj");
        SoundPoolEntry = new Class673("SoundPoolEntry", 28, "net/minecraft/client/audio/SoundPoolEntry", "bpw");
        SoundCategory = new Class673("SoundCategory", 29, "net/minecraft/client/audio/SoundCategory", "bpg");
        TileEntityEnderChestRenderer = new Class673("TileEntityEnderChestRenderer", 30, "net/minecraft/client/renderer/tileentity/TileEntityEnderChestRenderer", "bhg");
        ResourceLocation = new Class673("ResourceLocation", 31, "net/minecraft/util/ResourceLocation", "jy");
        ModelChest = new Class673("ModelChest", 32, "net/minecraft/client/model/ModelChest", "baz");
        EntityPlayerSP = new Class673("EntityPlayerSP", 33, "net/minecraft/client/entity/EntityPlayerSP", "bew");
        EntityRenderer = new Class673("EntityRenderer", 34, "net/minecraft/client/renderer/EntityRenderer", "bfk");
        GuiNewChat = new Class673("GuiNewChat", 35, "net/minecraft/client/gui/GuiNewChat", "avt");
        Item = new Class673("Item", 36, "net/minecraft/item/Item", "zw");
        MouseHelper = new Class673("MouseHelper", 37, "net/minecraft/util/MouseHelper", "avf");
        NetHandlerPlayClient = new Class673("NetHandlerPlayClient", 38, "net/minecraft/client/network/NetHandlerPlayClient", "bcy");
        PlayerControllerMP = new Class673("PlayerControllerMP", 39, "net/minecraft/client/multiplayer/PlayerControllerMP", "bda");
        RendererLivingEntity = new Class673("RendererLivingEntity", 40, "net/minecraft/client/renderer/entity/RendererLivingEntity", "bjl");
        RenderManager = new Class673("RenderManager", 41, "net/minecraft/client/renderer/entity/RenderManager", "biu");
        ActiveRenderInfo = new Class673("ActiveRenderInfo", 42, "net/minecraft/client/renderer/ActiveRenderInfo", "auz");
        EntityLivingBase = new Class673("EntityLivingBase", 43, "net/minecraft/entity/EntityLivingBase", "pr");
        EnumFacing = new Class673("EnumFacing", 44, "net/minecraft/util/EnumFacing", "cq");
        ICamera = new Class673("ICamera", 45, "net/minecraft/client/renderer/culling/ICamera", "bia");
        RenderEntityItem = new Class673("RenderEntityItem", 46, "net/minecraft/client/renderer/entity/RenderEntityItem", "bjf");
        TileEntityEnderChest = new Class673("TileEntityEnderChest", 47, "net/minecraft/tileentity/TileEntityEnderChest", "alf");
        GuiDisconnected = new Class673("GuiDisconnected", 48, "net/minecraft/client/gui/GuiDisconnected", "axh");
        GuiConnecting = new Class673("GuiConnecting", 49, "net/minecraft/client/multiplayer/GuiConnecting", "awz");
        GuiButton = new Class673("GuiButton", 50, "net/minecraft/client/gui/GuiButton", "avs");
        GuiChat = new Class673("GuiChat", 51, "net/minecraft/client/gui/GuiChat", "awv");
        GuiIngame = new Class673("GuiIngame", 52, "net/minecraft/client/gui/GuiIngame", "avo");
        GuiIngameForge = new Class673("GuiIngameForge", 53, "net/minecraftforge/client/GuiIngameForge", "GuiIngameForge");
        GuiIngameMenu = new Class673("GuiIngameMenu", 54, "net/minecraft/client/gui/GuiIngameMenu", "axp");
        ItemCameraTransforms$TransformType = new Class673("ItemCameraTransforms$TransformType", 55, "net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType", "bgr$b");
        IBakedModel = new Class673("IBakedModel", 56, "net/minecraft/client/resources/model/IBakedModel", "boq");
        IBlockAccess = new Class673("IBlockAccess", 57, "net/minecraft/world/IBlockAccess", "adq");
        InventoryPlayer = new Class673("InventoryPlayer", 58, "net/minecraft/entity/player/InventoryPlayer", "wm");
        Potion = new Class673("Potion", 59, "net/minecraft/potion/Potion", "pe");
        RenderEnderman = new Class673("RenderEnderman", 60, "net/minecraft/client/renderer/entity/RenderEnderman", "bis");
        EntityEnderman = new Class673("EntityEnderman", 61, "net/minecraft/entity/monster/EntityEnderman", "vo");
        ModelBase = new Class673("ModelBase", 62, "net/minecraft/client/model/ModelBase", "bbo");
        ModelBiped = new Class673("ModelBiped", 63, "net/minecraft/client/model/ModelBiped", "bbj");
        ModelEnderman = new Class673("ModelEnderman", 64, "net/minecraft/client/model/ModelEnderman", "bbd");
        RenderGlobal = new Class673("RenderGlobal", 65, "net/minecraft/client/renderer/RenderGlobal", "bfr");
        EffectRenderer = new Class673("EffectRenderer", 66, "net/minecraft/client/particle/EffectRenderer", "bec");
        EntityFX = new Class673("EntityFX", 67, "net/minecraft/client/particle/EntityFX", "beb");
        PotionEffect = new Class673("PotionEffect", 68, "net/minecraft/potion/PotionEffect", "pf");
        WorldClient = new Class673("WorldClient", 69, "net/minecraft/client/multiplayer/WorldClient", "bdb");
        Packet = new Class673("Packet", 70, "net/minecraft/network/Packet", "ff");
        NetworkManager = new Class673("NetworkManager", 71, "net/minecraft/network/NetworkManager", "ek");
        Profiler = new Class673("Profiler", 72, "net/minecraft/profiler/Profiler", "nt");
        Block = new Class673("Block", 73, "net/minecraft/block/Block", "afh");
        BlockRendererDispatcher = new Class673("BlockRendererDispatcher", 74, "net/minecraft/client/renderer/BlockRendererDispatcher", "bgd");
        BlockModelRenderer = new Class673("BlockModelRenderer", 75, "net/minecraft/client/renderer/BlockModelRenderer", "bgf");
        World = new Class673("World", 76, "net/minecraft/world/World", "adm");
        WorldRenderer = new Class673("WorldRenderer", 77, "net/minecraft/client/renderer/WorldRenderer", "bfd");
        BlockGlass = new Class673("BlockGlass", 78, "net/minecraft/block/BlockGlass", "ahc");
        BlockBush = new Class673("BlockBush", 79, "net/minecraft/block/BlockBush", "afm");
        BlockGrass = new Class673("BlockGrass", 80, "net/minecraft/block/BlockGrass", "ahe");
        VisGraph = new Class673("VisGraph", 81, "net/minecraft/client/renderer/chunk/VisGraph", "bhw");
        SetVisibility = new Class673("SetVisibility", 82, "net/minecraft/client/renderer/chunk/SetVisibility", "bhx");
        AbstractClientPlayer = new Class673("AbstractClientPlayer", 83, "net/minecraft/client/entity/AbstractClientPlayer", "bet");
        Vec3 = new Class673("Vec3", 84, "net/minecraft/util/Vec3", "aui");
        DynamicTexture = new Class673("DynamicTexture", 85, "net/minecraft/client/renderer/texture/DynamicTexture", "blz");
        AbstractResourcePack = new Class673("AbstractResourcePack", 86, "net/minecraft/client/resources/AbstractResourcePack", "bmx");
        Field2952 = new Class673[]{Minecraft, Timer, EntityItem, Gui, GuiChest, IInventory, FontRenderer, GuiScreen, GuiContainer, GuiMainMenu, GuiPlayerTabOverlay, ItemStack, GlStateManager, Container, Slot, RenderItem, RenderPlayer, GuiInventory, IChatComponent, IReloadableResourceManager, S2FPacketSetSlot, S30PacketWindowItems, BlockPos, EntityPlayer, EnumPlayerModelParts, Entity, SoundManager, ISound, SoundPoolEntry, SoundCategory, TileEntityEnderChestRenderer, ResourceLocation, ModelChest, EntityPlayerSP, EntityRenderer, GuiNewChat, Item, MouseHelper, NetHandlerPlayClient, PlayerControllerMP, RendererLivingEntity, RenderManager, ActiveRenderInfo, EntityLivingBase, EnumFacing, ICamera, RenderEntityItem, TileEntityEnderChest, GuiDisconnected, GuiConnecting, GuiButton, GuiChat, GuiIngame, GuiIngameForge, GuiIngameMenu, ItemCameraTransforms$TransformType, IBakedModel, IBlockAccess, InventoryPlayer, Potion, RenderEnderman, EntityEnderman, ModelBase, ModelBiped, ModelEnderman, RenderGlobal, EffectRenderer, EntityFX, PotionEffect, WorldClient, Packet, NetworkManager, Profiler, Block, BlockRendererDispatcher, BlockModelRenderer, World, WorldRenderer, BlockGlass, BlockBush, BlockGrass, VisGraph, SetVisibility, AbstractClientPlayer, Vec3, DynamicTexture, AbstractResourcePack};
    }

    public static void Method2341(String[] stringArray) {
        Field2953 = stringArray;
    }

    public static String[] Method2342() {
        return Field2953;
    }
}