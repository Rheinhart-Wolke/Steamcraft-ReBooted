package com.Saunderson.steamcraftrb.block;



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
