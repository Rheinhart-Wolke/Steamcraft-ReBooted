package com.Saunderson.steamcraftrb.block;

import net.minecraft.block.material.Material;

public class BlockZincBlock extends BlockSCRB
{
    public BlockZincBlock(Material iron)
    {
        super(iron);
        this.setHardness(1.5F);
        this.setResistance(30);
        this.setBlockName("zincBlock");
    }

}
