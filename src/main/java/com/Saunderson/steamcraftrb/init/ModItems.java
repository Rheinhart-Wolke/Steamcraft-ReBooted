package com.Saunderson.steamcraftrb.init;

import com.Saunderson.steamcraftrb.Item.*;
import com.Saunderson.steamcraftrb.reference.Names;
import com.Saunderson.steamcraftrb.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSCRB copperDust = new ItemCopperDust();
    public static final ItemSCRB copperWire = new ItemCopperWire();
    public static final ItemSCRB drillBase = new ItemDrillBase();
    public static final ItemSCRB electricLamp = new ItemElectricLamp();
    public static final ItemSCRB etherium = new ItemEtherium();
    public static final ItemSCRB ingotBrass = new ItemIngotBrass();
    public static final ItemSCRB ingotCastIron = new ItemIngotCastIron();
    public static final ItemSCRB kettle = new ItemKettle();
    public static final ItemSCRB lightBulb = new ItemLightBulb();
    public static final ItemSCRB musketCartridge = new ItemMusketCartridge();
    public static final ItemSCRB obsidianSlate = new ItemObsidianSlate();
    public static final ItemSCRB percussionCap = new ItemPercussionCap();
    public static final ItemSCRB percussionLock = new ItemPercussionLock();
    public static final ItemSCRB phosphorus = new ItemPhosphorus();
    public static final ItemSCRB reactorCore = new ItemReactorCore();
    public static final ItemSCRB rifledBarrel = new ItemRifledBarrel();
    public static final ItemSCRB smoothBarrel = new ItemSmoothBarrel();
    public static final ItemSCRB sulphur = new ItemSulphur();
    public static final ItemSCRB teaCupEmpty = new ItemTeaCupEmpty();
    public static final ItemSCRB teaCupFull = new ItemTeaCupFull();
    public static final ItemSCRB teaLeaves = new ItemTeaLeaves();
    public static final ItemSCRB teaSeeds = new ItemTeaSeeds();
    public static final ItemSCRB uraniumPellet = new ItemUraniumPellet();
    public static final ItemSCRB uraniumStone = new ItemUraniumStone();
    public static final ItemSCRB wirelessLamp = new ItemWirelessLamp();
    public static final ItemSCRB woodenStock = new ItemWoodenStock();
    public static final ItemSCRB kettleCold = new ItemKettleCold();
    public static final ItemSCRB kettleHot = new ItemKettleHot();

    public static final ItemSCRB tier = new ItemTier();

    public static final ItemSteamSword steamSword = new ItemSteamSword();
    public static final ItemSteamPickaxe steamPickaxe = new ItemSteamPickaxe();
    public static final ItemSteamShovel steamShovel = new ItemSteamShovel();
    public static final ItemSteamAxe steamAxe =  new ItemSteamAxe();
    public static final ItemSteamHoe steamHoe = new ItemSteamHoe();
    public static final ItemSteamDrill steamDrill = new ItemSteamDrill();
    public static final ItemEtheriumSword etheriumSword = new ItemEtheriumSword();
    public static final ItemEtheriumPickaxe etheriumPickaxe = new ItemEtheriumPickaxe();
    public static final ItemEtheriumHoe etheriumHoe = new ItemEtheriumHoe();
    public static final ItemEtheriumAxe etheriumAxe = new ItemEtheriumAxe();
    public static final ItemEtheriumShovel etheriumShovel = new ItemEtheriumShovel();
    public static final ItemEtheriumDrill etheriumDrill = new ItemEtheriumDrill();

    public static void init()
    {
        GameRegistry.registerItem(copperDust, "copperDust");
        GameRegistry.registerItem(copperWire, "copperWire");
        GameRegistry.registerItem(drillBase, "drillBase");
        GameRegistry.registerItem(electricLamp, "electricLamp");
        GameRegistry.registerItem(etherium, "etherium");
        GameRegistry.registerItem(ingotBrass, "ingotBrass");
        GameRegistry.registerItem(ingotCastIron, "ingotCastIron");
        GameRegistry.registerItem(kettle, "kettle");
        GameRegistry.registerItem(lightBulb, "lightBulb");
        GameRegistry.registerItem(musketCartridge, "musketCartridge");
        GameRegistry.registerItem(obsidianSlate, "obsidianSlate");
        GameRegistry.registerItem(percussionCap, "percussionCap");
        GameRegistry.registerItem(percussionLock,  "percussionLock");
        GameRegistry.registerItem(phosphorus, "phosphorus");
        GameRegistry.registerItem(reactorCore, "reactorCore");
        GameRegistry.registerItem(rifledBarrel, "rifledBarrel");
        GameRegistry.registerItem(smoothBarrel, "smoothBarrel");
        GameRegistry.registerItem(sulphur, "sulphur");
        GameRegistry.registerItem(teaCupEmpty, "teaCupEmpty");
        GameRegistry.registerItem(teaCupFull, "teaCupFull");
        GameRegistry.registerItem(teaLeaves, "teaLeaves");
        GameRegistry.registerItem(teaSeeds, "teaSeeds");
        GameRegistry.registerItem(uraniumPellet, "uraniumPellet");
        GameRegistry.registerItem(uraniumStone, "uraniumStone");
        GameRegistry.registerItem(wirelessLamp, "wirelessLamp");
        GameRegistry.registerItem(woodenStock, "woodenStock");
        GameRegistry.registerItem(kettleCold, "kettleCold");
        GameRegistry.registerItem(kettleHot, "kettleHot");

        GameRegistry.registerItem(tier, Names.Items.TIER);

        GameRegistry.registerItem(etheriumSword, "etheriumSword");
        GameRegistry.registerItem(etheriumPickaxe, "etheriumPickaxe");
        GameRegistry.registerItem(etheriumAxe, "etheriumAxe");
        GameRegistry.registerItem(etheriumHoe, "etheriumHoe");
        GameRegistry.registerItem(etheriumShovel, "etheriumShovel");
        GameRegistry.registerItem(etheriumDrill, "etheriumDrill");
        GameRegistry.registerItem(steamSword, "steamSword");
        GameRegistry.registerItem(steamPickaxe, "steamPickaxe");
        GameRegistry.registerItem(steamShovel, "steamShovel");
        GameRegistry.registerItem(steamAxe, "steamAxe");
        GameRegistry.registerItem(steamHoe, "steamHoe");
        GameRegistry.registerItem(steamDrill, "steamDrill");
    }
}
