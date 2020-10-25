package quek.undergarden.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.data.LanguageProvider;
import quek.undergarden.UGMod;
import quek.undergarden.registry.*;

public class UGLang extends LanguageProvider {

    public UGLang(DataGenerator gen) {
        super(gen, UGMod.MODID, "en_us");
    }

    protected void addItemGroup(ItemGroup group, String name) {
        add(group.getGroupName().getString(), name);
    }

    protected void addAdvTitle(String advancementTitle, String name) {
        add("advancement." + advancementTitle + ".title", name);
    }

    protected void addAdvDesc(String advancementTitle, String name) {
        add("advancement." + advancementTitle + ".desc", name);
    }

    protected void addSubtitle(String category, String subtitleName, String name) {
        add("subtitles." + category + "." + subtitleName, name);
    }

    protected void addBiome(RegistryKey<Biome> biomeKey, String name) {
        add("biome.undergarden." + biomeKey.getLocation().getPath(), name);
    }

    @Override
    protected void addTranslations() {
        addBlock(UGBlocks.undergarden_portal, "Undergarden Portal");
        addBlock(UGBlocks.deepsoil, "Deepsoil");
        addBlock(UGBlocks.deepsoil_farmland, "Deepsoil Farmland");
        addBlock(UGBlocks.coarse_deepsoil, "Coarse Deepsoil");
        addBlock(UGBlocks.deepturf_block, "Deepturf Block");
        addBlock(UGBlocks.ashen_deepturf, "Ashen Deepturf Block");
        addBlock(UGBlocks.depthrock, "Depthrock");
        addBlock(UGBlocks.smogstem_planks, "Smogstem Planks");
        addBlock(UGBlocks.wigglewood_planks, "Wigglewood Planks");
        addBlock(UGBlocks.grongle_planks, "Grongle Planks");
        addBlock(UGBlocks.depthrock_bricks, "Depthrock Bricks");
        addBlock(UGBlocks.cracked_depthrock_bricks, "Cracked Depthrock Bricks");
        addBlock(UGBlocks.shiverstone, "Shiverstone");
        addBlock(UGBlocks.shiverstone_bricks, "Shiverstone Bricks");
        addBlock(UGBlocks.goo, "Scintling Goo");
        addBlock(UGBlocks.smog_vent, "Smog Vent");

        addBlock(UGBlocks.tremblecrust, "Tremblecrust");
        addBlock(UGBlocks.loose_tremblecrust, "Loose Tremblecrust");
        addBlock(UGBlocks.tremblecrust_bricks, "Tremblecrust Bricks");

        addBlock(UGBlocks.underbean_bush, "Underbean Bush");
        addBlock(UGBlocks.blisterberry_bush, "Blisterberry Bush");
        addBlock(UGBlocks.smogstem_sapling, "Smogstem Sapling");
        addBlock(UGBlocks.smogstem_log, "Smogstem Log");
        addBlock(UGBlocks.stripped_smogstem_log, "Stripped Smogstem Log");
        addBlock(UGBlocks.smogstem_wood, "Smogstem Wood");
        addBlock(UGBlocks.smogstem_leaves, "Smogstem Leaves");
        addBlock(UGBlocks.wigglewood_sapling, "Wigglewood Sapling");
        addBlock(UGBlocks.wigglewood_log, "Wigglewood Log");
        addBlock(UGBlocks.stripped_wigglewood_log, "Stripped Wigglewood Log");
        addBlock(UGBlocks.wigglewood_wood, "Wigglewood.. Wood");
        addBlock(UGBlocks.wigglewood_leaves, "Wigglewood Leaves");
        addBlock(UGBlocks.gronglet, "Gronglet");
        addBlock(UGBlocks.grongle_stem, "Grongle Stem");
        addBlock(UGBlocks.stripped_grongle_stem, "Stripped Grongle Stem");
        addBlock(UGBlocks.grongle_hyphae, "Grongle Hyphae");
        addBlock(UGBlocks.grongle_cap, "Grongle Cap");
        addBlock(UGBlocks.tall_deepturf, "Deepturf");
        addBlock(UGBlocks.ashen_tall_deepturf, "Ashen Deepturf");
        addBlock(UGBlocks.double_deepturf, "Tall Deepturf");
        addBlock(UGBlocks.shimmerweed, "Shimmerweed");
        addBlock(UGBlocks.double_shimmerweed, "Tall Shimmerweed");
        addBlock(UGBlocks.ditchbulb_plant, "Ditchbulb Plant");
        addBlock(UGBlocks.indigo_mushroom, "Indigo Mushroom");
        addBlock(UGBlocks.veil_mushroom, "Veiled Mushroom");
        addBlock(UGBlocks.ink_mushroom, "Ink Mushroom");
        addBlock(UGBlocks.blood_mushroom, "Blood Mushroom");
        addBlock(UGBlocks.gloomgourd, "Gloomgourd");
        addBlock(UGBlocks.carved_gloomgourd, "Carved Gloomgourd");
        addBlock(UGBlocks.gloomgourd_stem, "Gloomgourd Stem");
        addBlock(UGBlocks.depthrock_pebbles, "Depthrock Pebbles");
        addBlock(UGBlocks.glowing_kelp, "Glitterkelp");
        addBlock(UGBlocks.glowing_kelp_plant, "Glitterkelp");
        addBlock(UGBlocks.glowing_sea_grass, "Glowing Seagrass");
        addBlock(UGBlocks.droopvine_top, "Droopvine");
        //addBlock(UndergardenBlocks.droopvine, "Droopvine");

        addBlock(UGBlocks.coal_ore, "Undergarden Coal Ore");
        addBlock(UGBlocks.iron_ore, "Undergarden Iron Ore");
        addBlock(UGBlocks.gold_ore, "Undergarden Gold Ore");
        addBlock(UGBlocks.diamond_ore, "Undergarden Diamond Ore");
        addBlock(UGBlocks.cloggrum_ore, "Cloggrum Ore");
        addBlock(UGBlocks.froststeel_ore, "Froststeel Ore");
        addBlock(UGBlocks.utherium_ore, "Utherium Ore");
        addBlock(UGBlocks.otherside_utherium_ore, "Utherium Ore");
        addBlock(UGBlocks.regalium_ore, "Regalium Ore");

        addBlock(UGBlocks.cloggrum_block, "Cloggrum Block");
        addBlock(UGBlocks.froststeel_block, "Froststeel Block");
        addBlock(UGBlocks.utherium_block, "Utherium Block");
        addBlock(UGBlocks.regalium_block, "Regalium Block");
        addBlock(UGBlocks.gloom_o_lantern, "Gloom o'Lantern");
        addBlock(UGBlocks.cloggrum_bars, "Cloggrum Bars");

        addBlock(UGBlocks.depthrock_stairs, "Depthrock Stairs");
        addBlock(UGBlocks.depthrock_brick_stairs, "Depthrock Brick Stairs");
        addBlock(UGBlocks.smogstem_stairs, "Smogstem Stairs");
        addBlock(UGBlocks.wigglewood_stairs, "Wigglewood Stairs");
        addBlock(UGBlocks.grongle_stairs, "Grongle Stairs");
        addBlock(UGBlocks.shiverstone_stairs, "Shiverstone Stairs");
        addBlock(UGBlocks.shiverstone_brick_stairs, "Shiverstone Brick Stairs");

        addBlock(UGBlocks.depthrock_slab, "Depthrock Slab");
        addBlock(UGBlocks.depthrock_brick_slab, "Depthrock Brick Slab");
        addBlock(UGBlocks.smogstem_slab, "Smogstem Slab");
        addBlock(UGBlocks.wigglewood_slab, "Wigglewood Slab");
        addBlock(UGBlocks.grongle_slab, "Grongle Slab");
        addBlock(UGBlocks.shiverstone_slab, "Shiverstone Slab");
        addBlock(UGBlocks.shiverstone_brick_slab, "Shiverstone Brick Slab");

        addBlock(UGBlocks.depthrock_brick_wall, "Depthrock Brick Wall");
        addBlock(UGBlocks.shiverstone_brick_wall, "Shiverstone Brick Wall");

        addBlock(UGBlocks.smogstem_fence, "Smogstem Fence");
        addBlock(UGBlocks.wigglewood_fence, "Wigglewood Fence");
        addBlock(UGBlocks.grongle_fence, "Grongle Fence");

        addBlock(UGBlocks.smogstem_fence_gate, "Smogstem Fence Gate");
        addBlock(UGBlocks.wigglewood_fence_gate, "Wigglewood Fence Gate");
        addBlock(UGBlocks.grongle_fence_gate, "Grongle Fence Gate");

        addBlock(UGBlocks.smogstem_door, "Smogstem Door");
        addBlock(UGBlocks.wigglewood_door, "Wigglewood Door");
        addBlock(UGBlocks.grongle_door, "Grongle Door");

        addBlock(UGBlocks.smogstem_trapdoor, "Smogstem Trapdoor");
        addBlock(UGBlocks.wigglewood_trapdoor, "Wigglewood Trapdoor");
        addBlock(UGBlocks.grongle_trapdoor, "Grongle Trapdoor");

        addBlock(UGBlocks.smogstem_button, "Smogstem Button");
        addBlock(UGBlocks.wigglewood_button, "Wigglewood Button");
        addBlock(UGBlocks.grongle_button, "Grongle Button");
        addBlock(UGBlocks.depthrock_button, "Depthrock Button");
        addBlock(UGBlocks.shiverstone_button, "Shiverstone Button");

        addBlock(UGBlocks.smogstem_pressure_plate, "Smogstem Pressure Plate");
        addBlock(UGBlocks.wigglewood_pressure_plate, "Wigglewood Pressure Plate");
        addBlock(UGBlocks.grongle_pressure_plate, "Grongle Pressure Plate");
        addBlock(UGBlocks.depthrock_pressure_plate, "Depthrock Pressure Plate");
        addBlock(UGBlocks.shiverstone_pressure_plate, "Shiverstone Pressure Plate");

        addItem(UGItems.catalyst_item, "Catalyst");
        addItem(UGItems.depthrock_pebble, "Depthrock Pebble");
        addItem(UGItems.smogstem_stick, "Smogstem Stick");
        addItem(UGItems.twistytwig, "Twistytwig");
        addItem(UGItems.cloggrum_ingot, "Cloggrum Ingot");
        addItem(UGItems.cloggrum_nugget, "Cloggrum Nugget");
        addItem(UGItems.froststeel_ingot, "Froststeel Ingot");
        addItem(UGItems.froststeel_nugget, "Froststeel Nugget");
        addItem(UGItems.utheric_shard, "Utheric Shard");
        addItem(UGItems.utherium_ingot, "Utherium Ingot");
        addItem(UGItems.utherium_chunk, "Utherium Chunk");
        addItem(UGItems.regalium_ingot, "Regalium Ingot");
        addItem(UGItems.regalium_nugget, "Regalium Nugget");
        addItem(UGItems.smogstem_torch, "Smogstem Torch");
        addItem(UGItems.shard_torch, "Shard Torch");
        addItem(UGItems.gloomgourd_seeds, "Gloomgourd Seeds");
        addItem(UGItems.ditchbulb, "Ditchbulb");
        addItem(UGItems.brute_tusk, "Brute Tusk");
        addItem(UGItems.goo_ball, "Scintling Goo Ball");
        addItem(UGItems.rotten_blisterberry, "Rotten Blisterberry");
        addItem(UGItems.blisterbomb, "Blisterbomb");
        //addItem(UndergardenItems.droopvine_item, "Droopvine");

        addItem(UGItems.masticator_scales, "Masticator Scales");
        addItem(UGItems.masticated_chestplate, "Masticated Chestplate");
        addItem(UGItems.cloggrum_battleaxe, "Cloggrum Battle Axe");

        addItem(UGItems.smogstem_sword, "Smogstem Sword");
        addItem(UGItems.smogstem_pickaxe, "Smogstem Pickaxe");
        addItem(UGItems.smogstem_axe, "Smogstem Axe");
        addItem(UGItems.smogstem_shovel, "Smogstem Shovel");
        addItem(UGItems.smogstem_hoe, "Smogstem Hoe");

        addItem(UGItems.cloggrum_sword, "Cloggrum Sword");
        addItem(UGItems.cloggrum_pickaxe, "Cloggrum Pickaxe");
        addItem(UGItems.cloggrum_axe, "Cloggrum Axe");
        addItem(UGItems.cloggrum_shovel, "Cloggrum Shovel");
        addItem(UGItems.cloggrum_hoe, "Cloggrum Hoe");
        addItem(UGItems.cloggrum_shield, "Cloggrum Shield");

        addItem(UGItems.froststeel_sword, "Froststeel Sword");
        addItem(UGItems.froststeel_pickaxe, "Froststeel Pickaxe");
        addItem(UGItems.froststeel_axe, "Froststeel Axe");
        addItem(UGItems.froststeel_shovel, "Froststeel Shovel");
        addItem(UGItems.froststeel_hoe, "Froststeel Hoe");

        addItem(UGItems.utheric_sword, "Utherium Sword");
        addItem(UGItems.utheric_pickaxe, "Utherium Pickaxe");
        addItem(UGItems.utheric_axe, "Utherium Axe");
        addItem(UGItems.utheric_shovel, "Utherium Shovel");
        addItem(UGItems.utheric_hoe, "Utheric Hoe");

        addItem(UGItems.slingshot, "Slingshot");

        addItem(UGItems.virulent_mix_bucket, "Virulent Mix Bucket");

        addItem(UGItems.gwibling_bucket, "Bucket of Gwibling");

        addItem(UGItems.cloggrum_helmet, "Cloggrum Helmet");
        addItem(UGItems.cloggrum_chestplate, "Cloggrum Chestplate");
        addItem(UGItems.cloggrum_leggings, "Cloggrum Leggings");
        addItem(UGItems.cloggrum_boots, "Cloggrum Boots");

        addItem(UGItems.froststeel_helmet, "Froststeel Helmet");
        addItem(UGItems.froststeel_chestplate, "Froststeel Chestplate");
        addItem(UGItems.froststeel_leggings, "Froststeel Leggings");
        addItem(UGItems.froststeel_boots, "Froststeel Boots");

        addItem(UGItems.utheric_helmet, "Utherium Helmet");
        addItem(UGItems.utheric_chestplate, "Utherium Chestplate");
        addItem(UGItems.utheric_leggings, "Utherium Leggings");
        addItem(UGItems.utheric_boots, "Utherium Boots");

        addItem(UGItems.underbeans, "Underbeans");
        addItem(UGItems.blisterberry, "Blisterberry");
        addItem(UGItems.gloomgourd_pie, "Gloomgourd Pie");
        addItem(UGItems.raw_dweller_meat, "Raw Dweller Meat");
        addItem(UGItems.dweller_steak, "Dweller Steak");
        addItem(UGItems.raw_gwibling, "Raw Gwibling");
        addItem(UGItems.cooked_gwibling, "Cooked Gwibling");

        addItem(UGItems.dweller_spawn_egg, "Dweller Spawn Egg");
        addItem(UGItems.gwibling_spawn_egg, "Gwibling Spawn Egg");
        addItem(UGItems.rotdweller_spawn_egg, "Rotdweller Spawn Egg");
        addItem(UGItems.rotling_spawn_egg, "Rotling Spawn Egg");
        addItem(UGItems.rotwalker_spawn_egg, "Rotwalker Spawn Egg");
        addItem(UGItems.rotbeast_spawn_egg, "Rotbeast Spawn Egg");
        addItem(UGItems.brute_spawn_egg, "Brute Spawn Egg");
        addItem(UGItems.scintling_spawn_egg, "Scintling Spawn Egg");
        addItem(UGItems.gloomper_spawn_egg, "Gloomper Spawn Egg");
        addItem(UGItems.stoneborn_spawn_egg, "Stoneborn Spawn Egg");

        addItem(UGItems.masticator_spawn_egg, "Masticator Spawn Egg");

        addBiome(UGBiomes.barren_abyss, "Barren Abyss");
        addBiome(UGBiomes.dense_forest, "Dense Forest");
        addBiome(UGBiomes.forgotten_field, "Forgotten Field");
        addBiome(UGBiomes.gronglegrowth, "Gronglegrowth");
        addBiome(UGBiomes.smog_spires, "Smog Spires");
        addBiome(UGBiomes.smogstem_forest, "Smogstem Forest");
        addBiome(UGBiomes.wigglewood_forest, "Wigglewood Forest");

        addEntityType(UGEntityTypes.DWELLER, "Dweller");
        addEntityType(UGEntityTypes.ROTDWELLER, "Rotdweller");
        addEntityType(UGEntityTypes.GWIBLING, "Gwibling");
        addEntityType(UGEntityTypes.ROTLING, "Rotling");
        addEntityType(UGEntityTypes.ROTWALKER, "Rotwalker");
        addEntityType(UGEntityTypes.ROTBEAST, "Rotbeast");
        addEntityType(UGEntityTypes.BRUTE, "Brute");
        addEntityType(UGEntityTypes.SCINTLING, "Scintling");
        addEntityType(UGEntityTypes.GLOOMPER, "Gloomper");
        addEntityType(UGEntityTypes.STONEBORN, "Stoneborn");

        addEntityType(UGEntityTypes.MASTICATOR, "Masticator");

        addItemGroup(UGItemGroups.GROUP, "The Undergarden");

        addEffect(UGEffects.gooey, "Gooey");

        addAdvTitle("undergarden", "The Undergarden");
        addAdvDesc("undergarden", "Enter The Undergarden. The forgotten land awaits...");

        addAdvTitle("gourd_lord", "Gourd Lord");
        addAdvDesc("gourd_lord", "Acquire a stack of Gloomgourds.");

        addAdvTitle("slingshot", "Your New Best Friend");
        addAdvDesc("slingshot", "Craft a Slingshot.");

        addAdvTitle("slay_rotling", "Slay Rotling");
        addAdvDesc("slay_rotling", "Slay the weakest of the Rotspawn, the Rotling.");

        addAdvTitle("shard_torch", "Warding Device");
        addAdvDesc("shard_torch", "Craft a Shard Torch, a torch that can damage Rotspawn in its vicinity.");

        addAdvTitle("rotbane", "Rotbane");
        addAdvDesc("rotbane", "Slay all kinds of Rotspawn.");

        addAdvTitle("subterranean_cartographer", "Subterranean Cartographer");
        addAdvDesc("subterranean_cartographer", "Discover every Undergarden biome.");

        addAdvTitle("deep_extraction", "Deep Extraction");
        addAdvDesc("deep_extraction", "Acquire a Cloggrum Ingot.");

        addAdvTitle("glorious_beans", "Glorious Beans!");
        addAdvDesc("glorious_beans", "Find and pick an Underbean Bush.");

        addAdvTitle("slay_masticator", "Sprankton");
        addAdvDesc("slay_masticator", "Slay the Masticator.");

        addAdvTitle("masticated_armory", "Masticated Armory");
        addAdvDesc("masticated_armory", "Craft the Masticated Chestplate.");

        add("tooltip.cloggrum_sword", "High damage, low durability.");
        add("tooltip.froststeel_sword", "Slows targets.");
        add("tooltip.utheric_sword", "Deals 10 damage to Rotspawn.");
        add("tooltip.utheric_axe", "Bonus damage to passive animals.");
        add("tooltip.slingshot", "Uses Depthrock Pebbles as ammo.");
        add("tooltip.cloggrum_boots", "Scintling Goo doesn't slow you down when worn.");

        addSubtitle("item", "undergarden_portal_activate", "Undergarden Portal activates");
        addSubtitle("item", "blisterbomb", "Blisterbomb thrown");

        addSubtitle("entity", "dweller_living", "Dweller grumbles");
        addSubtitle("entity", "dweller_hurt", "Dweller hurts");
        addSubtitle("entity", "dweller_death", "Dweller dies");

        addSubtitle("entity", "rotwalker_living", "Rotwalker groans");
        addSubtitle("entity", "rotwalker_hurt", "Rotwalker hurts");
        addSubtitle("entity", "rotwalker_death", "Rotwalker dies");

        addSubtitle("entity", "rotbeast_living", "Rotbeast groans");
        addSubtitle("entity", "rotbeast_hurt", "Rotbeast hurts");
        addSubtitle("entity", "rotbeast_death", "Rotbeast dies");

        addSubtitle("entity", "brute_living", "Brute exhales");
        addSubtitle("entity", "brute_hurt", "Brute hurts");
        addSubtitle("entity", "brute_death", "Brute dies");
        addSubtitle("entity", "brute_angry", "Brute exhales angrily");

        addSubtitle("entity", "gloomper_living", "Gloomper croaks");
        addSubtitle("entity", "gloomper_hurt", "Gloomper hurts");
        addSubtitle("entity", "gloomper_death", "Gloomper dies");

        addSubtitle("entity", "stoneborn_step", "Stoneborn steps");
        addSubtitle("entity", "stoneborn_speaking", "Stoneborn speaks");
        addSubtitle("entity", "stoneborn_pleased", "Stoneborn pleased");
        addSubtitle("entity", "stoneborn_awe", "Stoneborn awed");
        addSubtitle("entity", "stoneborn_chuckle", "Stoneborn chuckles");
        addSubtitle("entity", "stoneborn_hurt", "Stoneborn hurts");
        addSubtitle("entity", "stoneborn_angry", "Stoneborn angered");
        addSubtitle("entity", "stoneborn_growl", "Stoneborn growls");
        addSubtitle("entity", "stoneborn_confused", "Stoneborn confused");
        addSubtitle("entity", "stoneborn_chant", "Stoneborn chanting");
        addSubtitle("entity", "stoneborn_death", "Stoneborn dies");

        addSubtitle("entity", "rotling_living", "Rotling groans");
        addSubtitle("entity", "rotling_hurt", "Rotling hurts");
        addSubtitle("entity", "rotling_death", "Rotling dies");

        addSubtitle("ambient", "undergarden_portal_ambient", "Undergarden Portal beckons");
    }
}