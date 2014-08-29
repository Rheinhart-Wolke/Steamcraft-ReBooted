package com.Saunderson.steamcraftrb.block;

import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;

public class BlockSteamFurnace extends BlockSCRB
{
    public BlockSteamFurnace(Material iron)
    {
        super(iron);
        this.setHardness(1.5F);
        this.setResistance(30);
        this.setBlockName("steamFurnace");
    }


}
