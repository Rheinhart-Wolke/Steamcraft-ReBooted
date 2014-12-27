package com.Saunderson.steamcraftrb.block;


import com.Saunderson.steamcraftrb.init.ModBlocks;
import com.Saunderson.steamcraftrb.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCopperOre extends BlockSCRB
{
    public BlockCopperOre()
    {
        super();
        this.setHardness(3);
        this.setHarvestLevel("pickaxe", 1 , 0);
        this.setStepSound(soundTypeStone);
        this.setBlockName("copperOre");
    }

}
