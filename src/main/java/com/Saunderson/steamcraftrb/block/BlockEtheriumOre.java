package com.Saunderson.steamcraftrb.block;

import com.Saunderson.steamcraftrb.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class BlockEtheriumOre extends BlockSCRB
{
    public BlockEtheriumOre()
    {
        super();
        this.setHardness(3);
        this.setHarvestLevel("pickaxe", 3 , 0);
        this.setStepSound(soundTypeStone);
        this.setBlockName("etheriumOre");
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.etherium;
    }
}
