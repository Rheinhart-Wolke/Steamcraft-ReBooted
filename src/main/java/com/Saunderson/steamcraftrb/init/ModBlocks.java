package com.Saunderson.steamcraftrb.init;


import com.Saunderson.steamcraftrb.block.BlockBorniteOre;
import com.Saunderson.steamcraftrb.block.BlockBrassBlock;
import com.Saunderson.steamcraftrb.block.BlockCastIronBlock;
import com.Saunderson.steamcraftrb.block.BlockSCRB;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final BlockSCRB brassBlock = new BlockBrassBlock(Material.iron);
    public static final BlockSCRB borniteOre = new BlockBorniteOre();
    public static final BlockSCRB castIronBlock = new BlockCastIronBlock(Material.iron);

    public static void init()
    {
        GameRegistry.registerBlock(brassBlock, "brassBlock");
        GameRegistry.registerBlock(borniteOre, "borniteOre");
        GameRegistry.registerBlock(castIronBlock, "castIronBlock");
    }
}
