package com.Saunderson.steamcraftrb.block;

import net.minecraft.block.material.Material;

public class BlockBrassBlock extends BlockSCRB
{
    public BlockBrassBlock(Material iron)
    {
        super(iron);
        this.setHardness(1.5F);
        this.setResistance(30);
        this.setBlockName("brassBlock");
    }

}
