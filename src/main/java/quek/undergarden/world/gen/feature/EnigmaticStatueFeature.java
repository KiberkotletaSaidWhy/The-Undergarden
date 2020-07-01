package quek.undergarden.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.*;
import net.minecraft.world.server.ServerWorld;
import quek.undergarden.UndergardenMod;
import quek.undergarden.registry.UndergardenBlocks;

import java.util.Random;

public class EnigmaticStatueFeature extends Feature<NoFeatureConfig> {

    private static final ResourceLocation statue1 = new ResourceLocation(UndergardenMod.MODID,"enigmatic_statue/enigmatic_statue_1");
    private static final ResourceLocation statue2 = new ResourceLocation(UndergardenMod.MODID,"enigmatic_statue/enigmatic_statue_2");
    private static final ResourceLocation statue3 = new ResourceLocation(UndergardenMod.MODID,"enigmatic_statue/enigmatic_statue_3");

    private static final ResourceLocation[] statues = new ResourceLocation[]{statue1, statue2, statue3};

    public EnigmaticStatueFeature(Codec<NoFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean func_230362_a_(ISeedReader worldIn, StructureManager p_230362_2_, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if(worldIn.isAirBlock(pos.up()) && worldIn.getBlockState(pos).getBlock() == UndergardenBlocks.deepturf_block.get()) {
            Random random = worldIn.getRandom();

            Rotation[] arotation = Rotation.values();
            Rotation rotation = arotation[random.nextInt(arotation.length)];

            int statue = random.nextInt(statues.length);

            TemplateManager templatemanager = ((ServerWorld)worldIn.getWorld()).getServer().func_240792_aT_();
            Template template = templatemanager.getTemplateDefaulted(statues[statue]);

            ChunkPos chunkpos = new ChunkPos(pos);
            MutableBoundingBox mutableboundingbox = new MutableBoundingBox(chunkpos.getXStart(), 0, chunkpos.getZStart(), chunkpos.getXEnd(), 256, chunkpos.getZEnd());
            PlacementSettings placementsettings = (new PlacementSettings()).setRotation(rotation).setBoundingBox(mutableboundingbox).setRandom(random).addProcessor(BlockIgnoreStructureProcessor.AIR_AND_STRUCTURE_BLOCK);
            BlockPos size = template.transformedSize(rotation);

            int x = random.nextInt(16);
            int z = random.nextInt(16);
            
            int deepturfY = 0;

            for(int y = 256; y > 0; y--) {
                if(worldIn.getBlockState(pos).getBlock() != UndergardenBlocks.deepturf_block.get()) {
                    pos.down(1);
                }
                else deepturfY = y - 1;
            }

            BlockPos blockpos1 = template.getZeroPositionWithTransform(pos.add(x, deepturfY, z), Mirror.NONE, rotation);
            IntegrityProcessor integrityprocessor = new IntegrityProcessor(0.9F);
            placementsettings.clearProcessors().addProcessor(integrityprocessor);
            template.func_237144_a_(worldIn, blockpos1, placementsettings, rand);
            placementsettings.removeProcessor(integrityprocessor);
            return true;
        }
        else return false;
    }
}