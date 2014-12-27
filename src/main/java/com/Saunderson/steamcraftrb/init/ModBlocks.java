package com.Saunderson.steamcraftrb.init;


import com.Saunderson.steamcraftrb.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final BlockSCRB copperOre = new BlockCopperOre();
    public static final BlockSCRB etheriumOre = new BlockEtheriumOre();
    public static final BlockSCRB phosphate = new BlockPhosphorus();

    public static final BlockSCRB steamFurnace = new BlockSteamFurnace(Material.iron);

    public static final BlockSCRB brassBlock = new BlockBrassBlock(Material.iron);
    public static final BlockSCRB castIronBlock = new BlockCastIronBlock(Material.iron);
    public static final BlockSCRB etheriumBlock = new BlockEtheriumBlock(Material.glass);

    public static void init()
    {
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(etheriumOre, "etheriumOre");
        GameRegistry.registerBlock(phosphate, "phosphate");

        GameRegistry.registerBlock(steamFurnace, "steamFurnace");

        GameRegistry.registerBlock(brassBlock, "brassBlock");
        GameRegistry.registerBlock(castIronBlock, "castIronBlock");
        GameRegistry.registerBlock(etheriumBlock, "etheriumBlock");
    }
}
