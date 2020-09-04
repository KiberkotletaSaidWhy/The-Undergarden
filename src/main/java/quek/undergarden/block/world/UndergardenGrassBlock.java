package quek.undergarden.block.world;

import net.minecraft.block.*;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import quek.undergarden.registry.UndergardenBlocks;

import java.util.Random;

public class UndergardenGrassBlock extends SpreadableSnowyDirtBlock implements IGrowable {

    public UndergardenGrassBlock(Properties builder) {
        super(builder);
    }

    private static boolean func_220257_b(BlockState state, IWorldReader world, BlockPos pos) {
        BlockPos blockpos = pos.up();
        BlockState blockstate = world.getBlockState(blockpos);
        if (blockstate.getBlock() == Blocks.SNOW && blockstate.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else {
            int i = LightEngine.func_215613_a(world, state, pos, blockstate, blockpos, Direction.UP, blockstate.getOpacity(world, blockpos));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean func_220256_c(BlockState state, IWorldReader world, BlockPos pos) {
        BlockPos blockpos = pos.up();
        return func_220257_b(state, world, pos) && !world.getFluidState(blockpos).isTagged(FluidTags.WATER);
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return worldIn.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {

    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (!func_220257_b(state, worldIn, pos)) {
            if (!worldIn.isAreaLoaded(pos, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            worldIn.setBlockState(pos, UndergardenBlocks.deepsoil.get().getDefaultState());
        }
        else {
            BlockState blockstate = this.getDefaultState();

            for (int i = 0; i < 4; ++i) {
                BlockPos blockpos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (worldIn.getBlockState(blockpos).isIn(UndergardenBlocks.deepsoil.get()) && func_220256_c(blockstate, worldIn, blockpos)) {
                    worldIn.setBlockState(blockpos, blockstate.with(SNOWY, worldIn.getBlockState(blockpos.up()).isIn(Blocks.SNOW)));
                }
            }
        }
    }
}
