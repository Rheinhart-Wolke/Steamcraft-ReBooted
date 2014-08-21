package com.Saunderson.steamcraftrb.block;


import com.Saunderson.steamcraftrb.creativetab.CreativeTabSCRB;
import com.Saunderson.steamcraftrb.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSCRB extends Block
{
    public BlockSCRB(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabSCRB.SCRB_TAB);
    }

    public BlockSCRB()
    {
        this(Material.rock);
        this.setResistance(15);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 0 , 0);
        this.setCreativeTab(CreativeTabSCRB.SCRB_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
