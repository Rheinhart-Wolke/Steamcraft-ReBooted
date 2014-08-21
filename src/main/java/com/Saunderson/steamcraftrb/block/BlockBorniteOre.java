package com.Saunderson.steamcraftrb.block;


import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBorniteOre extends BlockSCRB
{
    public BlockBorniteOre()
    {
        super();
        this.setHardness(3);
        this.setHarvestLevel("pickaxe", 1 , 0);
        this.setStepSound(soundTypeStone);
        this.setBlockName("borniteOre");
    }
}
