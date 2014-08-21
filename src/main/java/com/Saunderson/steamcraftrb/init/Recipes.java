package com.Saunderson.steamcraftrb.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.kettle), "  x", "xxx", "xx ", 'x', new ItemStack(ModItems.ingotCastIron));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.brassBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotBrass));
        GameRegistry.addSmelting(new ItemStack(ModBlocks.borniteOre), new ItemStack(ModItems.ingotBrass), 7F);

    }
}
