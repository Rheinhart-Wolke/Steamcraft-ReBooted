package com.Saunderson.steamcraftrb.init;

import com.Saunderson.steamcraftrb.Item.*;
import com.Saunderson.steamcraftrb.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSCRB copperDust = new ItemCopperDust();
    public static final ItemSCRB copperWire = new ItemCopperWire();
    public static final ItemSCRB coreDrill = new ItemCoreDrill();
    public static final ItemSCRB coreDrillBase = new ItemCoreDrillBase();
    public static final ItemSCRB diode = new ItemDiode();
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

    public static final ItemSteamSword steamSword = new ItemSteamSword();

    public static void init()
    {
        GameRegistry.registerItem(steamSword, "steamSword");
        GameRegistry.registerItem(copperDust, "copperDust");
        GameRegistry.registerItem(copperWire, "copperWire");
        GameRegistry.registerItem(coreDrill, "coreDrill");
        GameRegistry.registerItem(coreDrillBase, "coreDrillBase");
        GameRegistry.registerItem(diode, "diode");
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
    }
}
