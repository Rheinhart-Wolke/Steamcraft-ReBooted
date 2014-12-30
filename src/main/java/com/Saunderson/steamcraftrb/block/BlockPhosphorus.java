package com.Saunderson.steamcraftrb.block;

import com.Saunderson.steamcraftrb.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockPhosphorus extends BlockSCRB
{
    public BlockPhosphorus()
    {
        super();
        this.setHardness(3);
        this.setHarvestLevel("pickaxe", 2 , 0);
        this.setStepSound(soundTypeStone);
        this.setBlockName("phosphate");
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.phosphorus;
    }
}
