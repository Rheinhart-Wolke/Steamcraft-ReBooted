package com.Saunderson.steamcraftrb.block;

import net.minecraft.block.material.Material;

public class BlockCastIronBlock extends BlockSCRB
{
    public BlockCastIronBlock(Material iron)
    {
        super(iron);
        this.setHardness(1.5F);
        this.setResistance(30);
        this.setBlockName("castIronBlock");
    }

}