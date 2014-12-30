package com.Saunderson.steamcraftrb.block;



public class BlockZincOre extends BlockSCRB {
    public BlockZincOre() {
        super();
        this.setHardness(3);
        this.setHarvestLevel("pickaxe", 1, 0);
        this.setStepSound(soundTypeStone);
        this.setBlockName("zincOre");
    }
}