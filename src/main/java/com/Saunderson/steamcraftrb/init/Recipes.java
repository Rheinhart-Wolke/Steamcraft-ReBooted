package com.Saunderson.steamcraftrb.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockFurnace;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.ItemFluidContainer;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumSword), " x ", " x ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumPickaxe), "xxx", " s ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumAxe), " xx", " sx", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumHoe), " xx", " s ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumShovel), " x ", " s ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ItemStack(ModItems.etheriumDrill), " x ", "xyx ", " z ", 'x', new ItemStack(ModItems.etherium), 'y', new ItemStack(ModItems.ingotCastIron), 'z', new ItemStack(ModItems.drillBase));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamSword), " x ", " y ", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamPickaxe), "xyx", " s ", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamShovel), " x ", " s ", " y ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamAxe), " x ", " xy", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamHoe), "xy ", " s ", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ItemStack(ModItems.steamDrill), " x ", "xyx ", " z ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 'z', new ItemStack(ModItems.drillBase));

        GameRegistry.addRecipe(new ItemStack(ModItems.kettle), "  x", "xxx", "xx ", 'x', new ItemStack(ModItems.ingotCastIron));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.kettleCold), new ItemStack(ModItems.kettle), new ItemStack(Items.water_bucket), new ItemStack(ModItems.teaLeaves));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.teaCupFull), new ItemStack(ModItems.teaCupEmpty), new ItemStack(ModItems.kettleHot));

        GameRegistry.addRecipe(new ItemStack(ModBlocks.brassBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotBrass));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBrass, 9), new ItemStack(ModBlocks.brassBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.castIronBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotCastIron));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCastIron, 9), new ItemStack(ModBlocks.castIronBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.etheriumBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.etherium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.etherium, 9), new ItemStack(ModBlocks.etheriumBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.steamFurnace), "xxx", "xbx", "xfx", 'x', new ItemStack(ModItems.ingotBrass), 'b', new ItemStack(Items.bucket), 'f', new ItemStack(Items.bucket));

        GameRegistry.addSmelting(new ItemStack(ModItems.kettleCold), new ItemStack(ModItems.kettleHot), 7F);
    }
}
