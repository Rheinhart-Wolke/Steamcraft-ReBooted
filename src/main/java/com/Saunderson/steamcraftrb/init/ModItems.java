package com.Saunderson.steamcraftrb.init;

import com.Saunderson.steamcraftrb.Item.*;
import com.Saunderson.steamcraftrb.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSCRB woodenStock = new ItemWoodenStock();
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

    public static final ItemSteamSword steamSword = new ItemSteamSword();

    public static void init()
    {
        GameRegistry.registerItem(woodenStock, "woodenStock");
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
    }
}
