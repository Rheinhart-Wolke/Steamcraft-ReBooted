package com.Saunderson.steamcraftrb.block;


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

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.copperDust;
    }

    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(2);
    }
}
