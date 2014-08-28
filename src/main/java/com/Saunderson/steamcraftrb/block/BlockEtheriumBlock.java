package com.Saunderson.steamcraftrb.block;


import net.minecraft.block.material.Material;

public class BlockEtheriumBlock extends BlockSCRB
{
    public BlockEtheriumBlock(Material glass)
    {
        super(glass);
        this.setHardness(1.5F);
        this.setResistance(30);
        this.setBlockName("etheriumBlock");
    }
}
