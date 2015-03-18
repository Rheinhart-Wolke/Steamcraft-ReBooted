package com.Saunderson.steamcraftrb.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        // Weapons
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumSword), " x ", " x ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamSword), " x ", " y ", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ItemStack(ModItems.percussionMusket), " l ", " b ", " w ", 'l', new ItemStack(ModItems.percussionLock), 'b', new ItemStack(ModItems.smoothBarrel), 'w', new ItemStack(ModItems.woodenStock));
        GameRegistry.addRecipe(new ItemStack(ModItems.percussionRifle), " l ", " b ", " w ", 'l', new ItemStack(ModItems.percussionLock), 'b', new ItemStack(ModItems.rifledBarrel), 'w', new ItemStack(ModItems.woodenStock));
        

        // Armour

        // Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumPickaxe), "xxx", " s ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumAxe), " xx", " sx", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumHoe), " xx", " s ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.etheriumShovel), " x ", " s ", " s ", 'x', new ItemStack(ModItems.etherium), 's', "stickWood"));
        GameRegistry.addRecipe(new ItemStack(ModItems.etheriumDrill), " x ", "xyx ", " z ", 'x', new ItemStack(ModItems.etherium), 'y', new ItemStack(ModItems.ingotCastIron), 'z', new ItemStack(ModItems.drillBase));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamPickaxe), "xyx", " s ", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamShovel), " x ", " s ", " y ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamAxe), " x ", " xy", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steamHoe), "xy ", " s ", " s ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 's', "stickWood"));
        GameRegistry.addRecipe(new ItemStack(ModItems.steamDrill), " x ", "xyx ", " z ", 'x', new ItemStack(ModItems.ingotBrass), 'y', new ItemStack(ModBlocks.steamFurnace), 'z', new ItemStack(ModItems.drillBase));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chisel), " x ", " x ", " b ", 'b', new ItemStack(ModItems.ingotBrass), 'x', "ingotIron"));

        // Blocks <-> Ingots
        GameRegistry.addRecipe(new ItemStack(ModBlocks.brassBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotBrass));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBrass, 9), new ItemStack(ModBlocks.brassBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.castIronBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotCastIron));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCastIron, 9), new ItemStack(ModBlocks.castIronBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotCopper));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper, 9), new ItemStack(ModBlocks.copperBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.etheriumBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.etherium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.etherium, 9), new ItemStack(ModBlocks.etheriumBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.zincBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotZinc));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotZinc, 9), new ItemStack(ModBlocks.zincBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.steamFurnace), "xxx", "xbx", "xfx", 'x', new ItemStack(ModItems.ingotBrass), 'b', new ItemStack(Items.bucket), 'f', new ItemStack(Items.bucket));

        //Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.woodenStock), "x  ", " x ", "c x", 'c', new ItemStack(ModItems.chisel, 1, OreDictionary.WILDCARD_VALUE), 'x', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifledBarrel), "x  ", " x ", "c x", 'c', new ItemStack(ModItems.chisel, 1, OreDictionary.WILDCARD_VALUE), 'x', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.smoothBarrel), "   ", "xxx", " c ", 'c', new ItemStack(ModItems.chisel, 1, OreDictionary.WILDCARD_VALUE), 'x', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.percussionLock), "   ", "b  ", "xx ", 'b', new ItemStack(ModItems.ingotBrass), 'x', "ingotIron"));

        // Blocks
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 3), new ItemStack(ModItems.chisel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.stonebrick, 1, 0));

        // Machines / Furnaces

        // Containers
        GameRegistry.addRecipe(new ItemStack(ModItems.kettle), "  x", "xxx", "xx ", 'x', new ItemStack(ModItems.ingotCastIron));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.kettleCold), new ItemStack(ModItems.kettle), new ItemStack(Items.water_bucket), new ItemStack(ModItems.teaLeaves));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.teaCupFull), new ItemStack(ModItems.teaCupEmpty), new ItemStack(ModItems.kettleHot));

        // Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.kettleCold), new ItemStack(ModItems.kettleHot), 7F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.copperOre), new ItemStack(ModItems.ingotCopper), 4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.zincOre), new ItemStack(ModItems.ingotZinc), 4F);
    }
}
