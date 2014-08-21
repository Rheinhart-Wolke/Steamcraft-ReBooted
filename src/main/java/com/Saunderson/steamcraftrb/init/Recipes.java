package com.Saunderson.steamcraftrb.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.ItemFluidContainer;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.kettle), "  x", "xxx", "xx ", 'x', new ItemStack(ModItems.ingotCastIron));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.brassBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotBrass));
        GameRegistry.addSmelting(new ItemStack(ModBlocks.borniteOre), new ItemStack(ModItems.ingotBrass), 7F);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.kettleCold), new ItemStack(ModItems.kettle), new ItemStack(Items.water_bucket), new ItemStack(ModItems.teaLeaves));
        GameRegistry.addSmelting(new ItemStack(ModItems.kettleCold), new ItemStack(ModItems.kettleHot), 7F);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.teaCupFull), new ItemStack(ModItems.teaCupEmpty), new ItemStack(ModItems.kettleHot));

    }
}
