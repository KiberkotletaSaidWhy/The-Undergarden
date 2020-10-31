package quek.undergarden.registry;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import quek.undergarden.UGMod;

public class UGPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, UGMod.MODID);

    public static final RegistryObject<Potion> brittleness = POTIONS.register("brittleness", () -> new Potion("brittleness", new EffectInstance(UGEffects.brittleness.get(), 900)));
    public static final RegistryObject<Potion> long_brittleness = POTIONS.register("long_brittleness", () -> new Potion("brittleness", new EffectInstance(UGEffects.brittleness.get(), 1800)));
    public static final RegistryObject<Potion> strong_brittleness = POTIONS.register("strong_brittleness", () -> new Potion("brittleness", new EffectInstance(UGEffects.brittleness.get(), 450, 1)));
}
