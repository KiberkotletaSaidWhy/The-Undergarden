package quek.undergarden.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;

import net.minecraft.block.AbstractBlock.Properties;

public class UGWallTorchBlock extends WallTorchBlock {

    public UGWallTorchBlock() {
        super(Properties.create(Material.MISCELLANEOUS)
                .doesNotBlockMovement()
                .hardnessAndResistance(0F, 0F)
                .setLightLevel((state) -> 14)
                .sound(SoundType.WOOD),
                ParticleTypes.FLAME
        );
    }

}