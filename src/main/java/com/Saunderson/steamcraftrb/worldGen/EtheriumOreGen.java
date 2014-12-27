package com.Saunderson.steamcraftrb.worldGen;

import java.util.Random;

import com.Saunderson.steamcraftrb.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class EtheriumOreGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
        }
    }

    private void generateSurface(World world, Random random, int BlockX, int BlockZ)
    {
        for (int p = 0; p<7; p++)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(16);
            (new WorldGenMinable(ModBlocks.etheriumOre, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

}