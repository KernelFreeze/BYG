package corgiaoc.byg.core.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import corgiaoc.byg.common.properties.blocks.BlueBerryBush;
import corgiaoc.byg.common.world.feature.config.*;
import corgiaoc.byg.core.BYGBlocks;
import corgiaoc.byg.core.world.util.WorldGenRegistrationHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.*;
import net.minecraft.world.gen.placement.*;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.GiantTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import java.util.OptionalInt;

public class BYGConfiguredFeatures {
    /***********************************************************Configured Features***********************************************************/

    public static ConfiguredFeature<?, ?> ALLIUM_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("allium_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ALLIUMBUSH_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_PINK_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("pink_allium_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINKALLIUMBUSH_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_TALL_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("tall_allium_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TALL_ALLIUM_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_TALL_PINK_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("tall_pink_allium_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TALL_PINK_ALLIUM_CONFIG));

    public static ConfiguredFeature<?, ?> AMARANTH = WorldGenRegistrationHelper.createConfiguredFeature("amaranth", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.AMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_MAGENTA = WorldGenRegistrationHelper.createConfiguredFeature("magenta_amaranth", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.MAGENTAAMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_ORANGE = WorldGenRegistrationHelper.createConfiguredFeature("orange_amaranth", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ORANGEAMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_PURPLE = WorldGenRegistrationHelper.createConfiguredFeature("purple_amaranth", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PURPLEAMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_CYAN = WorldGenRegistrationHelper.createConfiguredFeature("cyan_amaranth", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CYANAMARANTH_CONFIG));

    public static ConfiguredFeature<?, ?> FERN_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("fern_grass", Feature.RANDOM_PATCH.withConfiguration(Features.Configs.TAIGA_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> SHORT_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("short_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SHORT_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> TALL_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("tall_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TALL_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> SOUL_FIRE_ON_NYLIUM = WorldGenRegistrationHelper.createConfiguredFeature("soul_fire_on_nylium", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SOULFIREONNYLIUM));
    public static ConfiguredFeature<?, ?> BORIC_FIRE = WorldGenRegistrationHelper.createConfiguredFeature("boric_fire", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BORIC_FIRE));
    public static ConfiguredFeature<?, ?> MAGMA_FIRE = WorldGenRegistrationHelper.createConfiguredFeature("magma_fire", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.MAGMA_FIRE));
    public static ConfiguredFeature<?, ?> SUBZERO_ASH = WorldGenRegistrationHelper.createConfiguredFeature("subzero_ash", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SUBZERO_ASH));
    public static ConfiguredFeature<?, ?> SUBZERO_ASH_BLOCK = WorldGenRegistrationHelper.createConfiguredFeature("subzero_ash_block", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SUBZERO_ASH_BLOCK));
    public static ConfiguredFeature<?, ?> QUARTZ_CRYSTAL = WorldGenRegistrationHelper.createConfiguredFeature("quartz_crystal", BYGFeatures.QUARTZ_CRYSTAL.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    //Giant Flowers
    public static ConfiguredFeature<BYGGiantFlowerFeatureConfig, ?> GIANT_ANGELICA_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("giant_angelica", BYGFeatures.GIANT_ANGELICA_FLOWER.withConfiguration(new BYGGiantFlowerFeatureConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.WHITE_PETAL).setMaxHeight(18).setMinHeight(12).build()));
    public static ConfiguredFeature<BYGGiantFlowerFeatureConfig, ?> GIANT_DANDELION_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("giant_dandelion", BYGFeatures.GIANT_DANDELION_FLOWER.withConfiguration(new BYGGiantFlowerFeatureConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.RED_PETAL).setPetal2Block(BYGBlocks.YELLOW_PETAL).setMaxHeight(12).setMinHeight(6).build()));
    public static ConfiguredFeature<BYGGiantFlowerFeatureConfig, ?> GIANT_IRIS_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("giant_iris", BYGFeatures.GIANT_IRIS_FLOWER.withConfiguration(new BYGGiantFlowerFeatureConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.PURPLE_PETAL).setPetal2Block(BYGBlocks.YELLOW_PETAL).setMaxHeight(12).setMinHeight(6).build()));
    public static ConfiguredFeature<BYGGiantFlowerFeatureConfig, ?> GIANT_ROSE_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("giant_rose", BYGFeatures.GIANT_ROSE_FLOWER.withConfiguration(new BYGGiantFlowerFeatureConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.RED_PETAL).setMaxHeight(12).setMinHeight(6).build()));


    public static ConfiguredFeature<?, ?> MINI_CACTI = WorldGenRegistrationHelper.createConfiguredFeature("mini_cacti", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.MINI_CACTUS_CONFIG));
    public static ConfiguredFeature<?, ?> HORSE_WEED = WorldGenRegistrationHelper.createConfiguredFeature("horse_weed", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.HORSEWEED_CONFIG));
    public static ConfiguredFeature<?, ?> TINY_LILY_PAD = WorldGenRegistrationHelper.createConfiguredFeature("tiny_lily_pad", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TINY_LILYPAD_CONFIG));
    public static ConfiguredFeature<?, ?> WATER_SILK = WorldGenRegistrationHelper.createConfiguredFeature("water_silk", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WATER_SILK_CONFIG));
    public static ConfiguredFeature<?, ?> WINTER_SUCCULENT = WorldGenRegistrationHelper.createConfiguredFeature("winter_succulent", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINTER_SUCCULENT_CONFIG));
    public static ConfiguredFeature<?, ?> BEACH_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("beach_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BEACH_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> BEACH_SHORT_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("short_beach_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SHORT_BEACH_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> WILTED_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("wilted_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WILTED_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> LEAF_PILE = WorldGenRegistrationHelper.createConfiguredFeature("leaf_pile", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.LEAF_PILE_CONFIG));
    public static ConfiguredFeature<?, ?> CLOVER_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("clover_patch", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CLOVER_PATCH));
    public static ConfiguredFeature<?, ?> FLOWER_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("flower_patch", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FLOWER_PATCH));
    public static ConfiguredFeature<?, ?> WEED_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("weed_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WEED_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> WINTER_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("winter_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINTER_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> CALIFORNIA_POPPY = WorldGenRegistrationHelper.createConfiguredFeature("california_poppy", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CALIFORNIA_POPPY_CONFIG));
    public static ConfiguredFeature<?, ?> BLACK_PUFF = WorldGenRegistrationHelper.createConfiguredFeature("black_puff", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BLACK_PUFF_CONFIG));
    public static ConfiguredFeature<?, ?> WEEPING_MILKCAP = WorldGenRegistrationHelper.createConfiguredFeature("weeping_milkcap", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WEEPING_MILKCAP_CONFIG));
    public static ConfiguredFeature<?, ?> WOOD_BLEWIT = WorldGenRegistrationHelper.createConfiguredFeature("wood_blewit", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WOOD_BLEWIT_CONFIG));
    public static ConfiguredFeature<?, ?> GREEN_MUSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("green_mushroom", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.GREEN_MUSHROOM_CONFIG));
    public static ConfiguredFeature<?, ?> BEGONIA = WorldGenRegistrationHelper.createConfiguredFeature("begonia", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BEGONIA_CONFIG));
    public static ConfiguredFeature<?, ?> BISTORT = WorldGenRegistrationHelper.createConfiguredFeature("bistort", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BISTORT_CONFIG));
    public static ConfiguredFeature<?, ?> GUZMANIA = WorldGenRegistrationHelper.createConfiguredFeature("guzmania", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.GUZMANIA_CONFIG));
    public static ConfiguredFeature<?, ?> INCAN_LILY = WorldGenRegistrationHelper.createConfiguredFeature("incan_lily", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.INCAN_LILY_CONFIG));
    public static ConfiguredFeature<?, ?> LAZARUS_BELLFLOWER = WorldGenRegistrationHelper.createConfiguredFeature("lazarus_bellflower", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.LAZARUS_BELLFLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> TORCH_GINGER = WorldGenRegistrationHelper.createConfiguredFeature("torch_ginger", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TORCH_GINGER_CONFIG));
    public static ConfiguredFeature<?, ?> RICHEA = WorldGenRegistrationHelper.createConfiguredFeature("richea", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.RICHEA_CONFIG));
    public static ConfiguredFeature<?, ?> JAPANESE_ORCHID = WorldGenRegistrationHelper.createConfiguredFeature("japanese_orchid", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.JAPANESEORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> AZALEA = WorldGenRegistrationHelper.createConfiguredFeature("azalea", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.AZALEA_CONFIG));
    public static ConfiguredFeature<?, ?> PRAIRIE_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("prairie_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PRAIRIEGRASS_CONFIG));
    public static ConfiguredFeature<?, ?> PRAIRIE_TALL_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("tall_prairie_grass", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TALLPRAIRIEGRASS_CONFIG));
    public static ConfiguredFeature<?, ?> BLUE_GLOWSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("blue_glowshroom", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BLUE_GLOWSHROOM_CONFIG));
    public static ConfiguredFeature<?, ?> PURPLE_GLOWSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("purple_glowshroom", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PURPLE_GLOWSHROOM_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("rose_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ROSE_BUSH_CONFIG));


    public static ConfiguredFeature<?, ?> PRICKLY_PEAR_CACTI = WorldGenRegistrationHelper.createConfiguredFeature("prickly_pear_cacti", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PRICKLY_PEAR_CONFIG));
    public static ConfiguredFeature<?, ?> GOLDEN_SPINED_CACTI = WorldGenRegistrationHelper.createConfiguredFeature("golden_spined_cacti", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.GOLDEN_SPINED_CONFIG));

    public static ConfiguredFeature<?, ?> PINK_CHERRY_FOLIAGE = WorldGenRegistrationHelper.createConfiguredFeature("pink_cherry_foliage", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINK_CHERRY_FOLIAGE));
    public static ConfiguredFeature<?, ?> WHITE_CHERRY_FOLIAGE = WorldGenRegistrationHelper.createConfiguredFeature("white_cherry_foliage", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WHITE_CHERRY_FOLIAGE));

    public static ConfiguredFeature<?, ?> WARPED_CACTI = WorldGenRegistrationHelper.createConfiguredFeature("warped_cacti", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WARPED_CACTUS_CONFIG));
    public static ConfiguredFeature<?, ?> WARPED_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("warped_bush", BYGFeatures.WARPED_BUSH.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> WARPED_CORAL = WorldGenRegistrationHelper.createConfiguredFeature("warped_coral", BYGFeatures.WARPED_CORAL.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> WARPED_CORAL_FAN = WorldGenRegistrationHelper.createConfiguredFeature("warped_coral_fan", BYGFeatures.WARPED_CORAL_FAN.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> CHAINS = WorldGenRegistrationHelper.createConfiguredFeature("chains", BYGFeatures.CHAINS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> SOUL_SOIL_PILLARS = WorldGenRegistrationHelper.createConfiguredFeature("soul_soil_pillars", BYGFeatures.SOUL_SOIL_PILLARS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> SCORCHED_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("scorched_bush", BYGFeatures.SCORCHED_BUSH.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> SCORCHED_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("scorched_grass", BYGFeatures.SCORCHED_GRASS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> WAILING_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("wailing_grass", BYGFeatures.WAILING_GRASS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> WAILING_VINES = WorldGenRegistrationHelper.createConfiguredFeature("wailing_vines", BYGFeatures.WAILING_VINES.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> LAMENT_SPROUTS = WorldGenRegistrationHelper.createConfiguredFeature("lament_sprouts", BYGFeatures.LAMENT_SPROUTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));


    public static ConfiguredFeature<?, ?> BLUE_BERRY_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("blue_berry_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BLUEBERRY_BUSH_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE = WorldGenRegistrationHelper.createConfiguredFeature("rose", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> ANGELICA = WorldGenRegistrationHelper.createConfiguredFeature("angelica", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ANGELICA_CONFIG));
    public static ConfiguredFeature<?, ?> CROCUS = WorldGenRegistrationHelper.createConfiguredFeature("crocus", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CROCUS_CONFIG));
    public static ConfiguredFeature<?, ?> IRIS = WorldGenRegistrationHelper.createConfiguredFeature("iris", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.IRIS_CONFIG));
    public static ConfiguredFeature<?, ?> ANEMONE_WHITE = WorldGenRegistrationHelper.createConfiguredFeature("white_anemone", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WHITE_ANEMONE_CONFIG));
    public static ConfiguredFeature<?, ?> ANEMONE_PINK = WorldGenRegistrationHelper.createConfiguredFeature("pink_anemone", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINK_ANEMONE_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_WINTER = WorldGenRegistrationHelper.createConfiguredFeature("winter_rose", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINTER_ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> SNOWDROPS = WorldGenRegistrationHelper.createConfiguredFeature("snowdrops", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SNOWDROPS_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_PINK = WorldGenRegistrationHelper.createConfiguredFeature("pink_allium", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINK_ALLIUM_CONFIG));
    public static ConfiguredFeature<?, ?> DAISY_ORANGE = WorldGenRegistrationHelper.createConfiguredFeature("orange_daisy", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ORANGE_DAISY_CONFIG));
    public static ConfiguredFeature<?, ?> CORNFLOWER_RED = WorldGenRegistrationHelper.createConfiguredFeature("red_cornflower", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.RED_CORNFLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> SAGE_WHITE = WorldGenRegistrationHelper.createConfiguredFeature("white_sage", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WHITE_SAGE_CONFIG));
    public static ConfiguredFeature<?, ?> SAGE_PURPLE = WorldGenRegistrationHelper.createConfiguredFeature("purple_sage", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PURPLE_SAGE_CONFIG));
    public static ConfiguredFeature<?, ?> DELPHINIUM = WorldGenRegistrationHelper.createConfiguredFeature("delphinium", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.DELPHINIUM_CONFIG));
    public static ConfiguredFeature<?, ?> FOXGLOVE = WorldGenRegistrationHelper.createConfiguredFeature("foxglove", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FOXGLOVE_CONFIG));
    public static ConfiguredFeature<?, ?> DAFFODIL_YELLOW = WorldGenRegistrationHelper.createConfiguredFeature("yellow_daffodil", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.YELLOW_DAFFODIL_CONFIG));
    public static ConfiguredFeature<?, ?> PUMPKIN_CONFIG = WorldGenRegistrationHelper.createConfiguredFeature("pumpkin", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PUMPKIN_CONFIG));
    public static ConfiguredFeature<?, ?> ALPINE_BELLFLOWER = WorldGenRegistrationHelper.createConfiguredFeature("alpine_bellflower", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ALPINE_BELLFLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> WINTER_SCILLA = WorldGenRegistrationHelper.createConfiguredFeature("winter_scilla", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINTER_SCILLA_CONFIG));
    public static ConfiguredFeature<?, ?> KOVAN_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("kovan_flower", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.KOVAN_FLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> FIRECRACKER_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("firecracker_bush", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FIRECRACKER_CONFIG));

    public static ConfiguredFeature<?, ?> NETHER_BRISTLE = WorldGenRegistrationHelper.createConfiguredFeature("nether_bristle", BYGFeatures.NETHER_BRISTLE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> TULIP_GREEN = WorldGenRegistrationHelper.createConfiguredFeature("green_tulip", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.GREEN_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_CYAN = WorldGenRegistrationHelper.createConfiguredFeature("cyan_tulip", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CYAN_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_MAGENTA = WorldGenRegistrationHelper.createConfiguredFeature("magenta_tulip", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.MAGENTA_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_PURPLE = WorldGenRegistrationHelper.createConfiguredFeature("purple_tulip", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PURPLE_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_YELLOW = WorldGenRegistrationHelper.createConfiguredFeature("yellow_tulip", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.YELLOW_TULIP_CONFIG));

    public static ConfiguredFeature<?, ?> REEDS = WorldGenRegistrationHelper.createConfiguredFeature("reeds", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.REEDS_CONFIG));
    public static ConfiguredFeature<?, ?> CATTAIL = WorldGenRegistrationHelper.createConfiguredFeature("cattail", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CATTAIL_CONFIG));

    public static ConfiguredFeature<?, ?> GLOWCANE_BLUE = WorldGenRegistrationHelper.createConfiguredFeature("blue_glowcane", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BLUE_GLOWCANE_CONFIG));
    public static ConfiguredFeature<?, ?> GLOWCANE_PURPLE = WorldGenRegistrationHelper.createConfiguredFeature("purple_glowcane", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PURPLE_GLOWCANE_CONFIG));
    public static ConfiguredFeature<?, ?> GLOWCANE_RED = WorldGenRegistrationHelper.createConfiguredFeature("red_glowcane", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.RED_GLOWCANE_CONFIG));
    public static ConfiguredFeature<?, ?> GLOWCANE_PINK = WorldGenRegistrationHelper.createConfiguredFeature("pink_glowcane", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINK_GLOWCANE_CONFIG));

    public static ConfiguredFeature<?, ?> LOLI_POP = WorldGenRegistrationHelper.createConfiguredFeature("loli_pop", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.LOLLI_POP_CONFIG));
    public static ConfiguredFeature<?, ?> ORCHID_RED = WorldGenRegistrationHelper.createConfiguredFeature("red_orchid", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.RED_ORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> ORCHID_PINK = WorldGenRegistrationHelper.createConfiguredFeature("pink_orchid", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINK_ORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> ORCHID_PURPLE = WorldGenRegistrationHelper.createConfiguredFeature("purple_orchid", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PURPLE_ORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> LEATHER_FLOWER_PEACH = WorldGenRegistrationHelper.createConfiguredFeature("peach_leather_flower", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PEACH_LEATHER_FLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> LEATHER_FLOWER_VIOLET = WorldGenRegistrationHelper.createConfiguredFeature("violet_leather_flower", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.VIOLET_LEATHER_FLOWER_CONFIG));

    public static ConfiguredFeature<?, ?> DAFFODIL_PINK = WorldGenRegistrationHelper.createConfiguredFeature("pink_daffodil", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.PINK_DAFFODIL_CONFIG));
    public static ConfiguredFeature<?, ?> DAFFODIL = WorldGenRegistrationHelper.createConfiguredFeature("daffodil", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.DAFFODIL_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_BLACK = WorldGenRegistrationHelper.createConfiguredFeature("black_rose", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.BLACK_ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_CYAN = WorldGenRegistrationHelper.createConfiguredFeature("cyan_rose", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.CYAN_ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_OSIRIA = WorldGenRegistrationHelper.createConfiguredFeature("osiria_rose", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.OSIRIA_CONFIG));
    public static ConfiguredFeature<?, ?> FAIRY_SLIPPER = WorldGenRegistrationHelper.createConfiguredFeature("fairy_slipper", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FAIRYSLIPPER_CONFIG));

    public static ConfiguredFeature<?, ?> IVIS_ROOTS = WorldGenRegistrationHelper.createConfiguredFeature("ivis_roots", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.IVIS_ROOTS));
    public static ConfiguredFeature<?, ?> IVIS_SPROUT = WorldGenRegistrationHelper.createConfiguredFeature("ivis_sprout", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.IVIS_SPROUT));

    public static ConfiguredFeature<?, ?> WEEPING_VINE_BLACKSTONE = WorldGenRegistrationHelper.createConfiguredFeature("weeping_vines_blackstone", BYGFeatures.WEEPING_VINE_BLACKSTONE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> WEEPING_ROOTS = WorldGenRegistrationHelper.createConfiguredFeature("weeping_roots", BYGFeatures.WEEPING_ROOTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> WEEPING_ROOTS_PLANT = WorldGenRegistrationHelper.createConfiguredFeature("weeping_roots_plant", BYGFeatures.WEEPING_ROOTS_PLANT.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> EMBUR_ROOTS = WorldGenRegistrationHelper.createConfiguredFeature("embur_roots", BYGFeatures.EMBUR_ROOTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> EMBUR_ROOTS_TALL = WorldGenRegistrationHelper.createConfiguredFeature("tall_embur_roots", BYGFeatures.TALL_EMBUR_ROOTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> EMBUR_GEL_VINES = WorldGenRegistrationHelper.createConfiguredFeature("embur_gel_vines", BYGFeatures.EMBUR_GEL_VINES.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> EMBUR_WART = WorldGenRegistrationHelper.createConfiguredFeature("embur_wart", BYGFeatures.EMBUR_WART.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> EMBUR_SPROUTS = WorldGenRegistrationHelper.createConfiguredFeature("embur_sprouts", BYGFeatures.EMBUR_SPROUTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> CRIMSON_ROOTS_TALL = WorldGenRegistrationHelper.createConfiguredFeature("tall_crimson_roots", BYGFeatures.TALL_CRIMSON_ROOTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> CRIMSON_BERRY_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("crimson_berry_bush", BYGFeatures.CRIMSON_BERRY_BUSH.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));

    public static ConfiguredFeature<?, ?> SYTHIAN_ROOTS = WorldGenRegistrationHelper.createConfiguredFeature("sythian_root", BYGFeatures.SYTHIAN_ROOTS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> SYTHIAN_SPROUT = WorldGenRegistrationHelper.createConfiguredFeature("sythian_sprout", BYGFeatures.SYTHIAN_SPROUT.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> SYTHIAN_FUNGUS = WorldGenRegistrationHelper.createConfiguredFeature("sythian_fungus", BYGFeatures.SYTHIAN_FUNGUS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG));
    public static ConfiguredFeature<?, ?> SOUL_SHROOM = WorldGenRegistrationHelper.createConfiguredFeature("soul_shroom", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SOUL_SHROOM_CONFIG));
    public static ConfiguredFeature<?, ?> DEATH_CAP = WorldGenRegistrationHelper.createConfiguredFeature("death_cap", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.DEATH_CAP_CONFIG));

    public static ConfiguredFeature<?, ?> DEAD_SEA_SPIKE = WorldGenRegistrationHelper.createConfiguredFeature("dead_sea_spike", BYGFeatures.POINTY_ROCK.withConfiguration(new PointyRockFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.ROCKY_STONE.getDefaultState(), 5).addWeightedBlockstate(Blocks.STONE.getDefaultState(), 3).addWeightedBlockstate(Blocks.ANDESITE.getDefaultState(), 2)).setRockHeight(65).build()));
    public static ConfiguredFeature<?, ?> DEAD_SEA_SPIKE_TALL = WorldGenRegistrationHelper.createConfiguredFeature("dead_sea_tall_spike", BYGFeatures.POINTY_ROCK.withConfiguration(new PointyRockFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.ROCKY_STONE.getDefaultState(), 5).addWeightedBlockstate(Blocks.STONE.getDefaultState(), 3).addWeightedBlockstate(Blocks.ANDESITE.getDefaultState(), 2)).setRockHeight(85).build()));

    public static ConfiguredFeature<?, ?> VALLE_DE_LUNA_POINTY_ROCK = WorldGenRegistrationHelper.createConfiguredFeature("valle_de_luna_pointy_rock", BYGFeatures.POINTY_ROCK.withConfiguration(new PointyRockFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.WHITE_SAND.getDefaultState(), 5).addWeightedBlockstate(BYGBlocks.WHITE_CUT_SANDSTONE.getDefaultState(), 5)).setRockHeight(88).build()).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(28, 0.1F, 1))));
    public static ConfiguredFeature<?, ?> VALLE_DE_LUNA_POINTY_ROCK_LARGE = WorldGenRegistrationHelper.createConfiguredFeature("valle_de_luna_pointy_rock_large", BYGFeatures.POINTY_ROCK.withConfiguration(new PointyRockFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.WHITE_SAND.getDefaultState(), 5).addWeightedBlockstate(BYGBlocks.WHITE_SMOOTH_SANDSTONE.getDefaultState(), 5)).setRockHeight(100).build()).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));


    public static ConfiguredFeature<?, ?> ORE_PERVADED_NETHERRACK = WorldGenRegistrationHelper.createConfiguredFeature("ore_pervaded_netherrack", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241884_c, BYGBlocks.PERVADED_NETHERRACK.getDefaultState(), 14)).withPlacement(Features.Placements.NETHER_SPRING_ORE_PLACEMENT).func_242728_a().func_242731_b(16));
    public static ConfiguredFeature<?, ?> ORE_ANTHRACITE = WorldGenRegistrationHelper.createConfiguredFeature("ore_anthracite", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241884_c, BYGBlocks.ANTHRACITE_ORE.getDefaultState(), 14)).withPlacement(Features.Placements.NETHER_SPRING_ORE_PLACEMENT).func_242728_a().func_242731_b(16));

    public static ConfiguredFeature<?, ?> ORE_AMETRINE = WorldGenRegistrationHelper.createConfiguredFeature("ore_ametrine", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BYGBlocks.AMETRINE_ORE.getDefaultState(), 4)).func_242733_d(56).func_242728_a().func_242731_b(10));
    public static ConfiguredFeature<?, ?> ORE_PENDORITE = WorldGenRegistrationHelper.createConfiguredFeature("ore_pendorite", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BYGBlocks.PENDORITE_ORE.getDefaultState(), 4)).func_242733_d(56).func_242728_a().func_242731_b(10));

    public static ConfiguredFeature<?, ?> ORE_ROCKY_STONE = WorldGenRegistrationHelper.createConfiguredFeature("ore_rocky_stone", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BYGBlocks.ROCKY_STONE.getDefaultState(), 20)).func_242733_d(63).func_242728_a().func_242731_b(10));
    public static ConfiguredFeature<?, ?> ORE_SCORIA_STONE = WorldGenRegistrationHelper.createConfiguredFeature("ore_scoria_stone", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BYGBlocks.SCORIA_STONE.getDefaultState(), 20)).func_242733_d(63).func_242728_a().func_242731_b(10));
    public static ConfiguredFeature<?, ?> ORE_SOAP_STONE = WorldGenRegistrationHelper.createConfiguredFeature("ore_soap_stone", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BYGBlocks.SOAPSTONE.getDefaultState(), 20)).func_242733_d(63).func_242728_a().func_242731_b(10));

    public static ConfiguredFeature<?, ?> MOSSY_STONE_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("mossy_stone_boulder", Feature.FOREST_ROCK.withConfiguration(new BlockStateFeatureConfig(BYGBlocks.MOSSY_STONE.getDefaultState())));
    public static ConfiguredFeature<?, ?> ROCKY_STONE_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("rocky_stone_boulder", Feature.FOREST_ROCK.withConfiguration(new BlockStateFeatureConfig(BYGBlocks.ROCKY_STONE.getDefaultState())));
    public static ConfiguredFeature<?, ?> BLACKSTONE_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("blackstone_boulder", Feature.FOREST_ROCK.withConfiguration(new BlockStateFeatureConfig(Blocks.BLACKSTONE.getDefaultState())));
    public static ConfiguredFeature<?, ?> ORANGE_TERRACOTTA_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("orange_terracotta_boulder", Feature.FOREST_ROCK.withConfiguration(new BlockStateFeatureConfig(Blocks.ORANGE_TERRACOTTA.getDefaultState())));

    public static final ConfiguredFeature<BYGPumpkinFeatureConfig, ?> PUMPKIN1 = WorldGenRegistrationHelper.createConfiguredFeature("pumpkin1", BYGFeatures.LARGE_PUMPKIN1.withConfiguration(new BYGPumpkinFeatureConfig.Builder().setPumpkinBlock(Blocks.PUMPKIN).setStemBlock(Blocks.OAK_LOG).build()));
    public static final ConfiguredFeature<BYGPumpkinFeatureConfig, ?> PUMPKIN2 = WorldGenRegistrationHelper.createConfiguredFeature("pumpkin2", BYGFeatures.LARGE_PUMPKIN2.withConfiguration(new BYGPumpkinFeatureConfig.Builder().setPumpkinBlock(Blocks.PUMPKIN).setStemBlock(Blocks.OAK_LOG).build()));


    /***********************************************************Configured & Decorated Features***********************************************************/

    public static ConfiguredFeature<?, ?> FROST_MAGMA_LAKE = WorldGenRegistrationHelper.createConfiguredFeature("frost_magma_lake", BYGFeatures.FROSTED_LAKE.withConfiguration(new BlockStateFeatureConfig(BYGBlocks.FROST_MAGMA.getDefaultState())).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));
    public static ConfiguredFeature<?, ?> WARPED_CORAL_PLANT = WorldGenRegistrationHelper.createConfiguredFeature("warped_coral_plant", BYGFeatures.HUGE_WARPED_CORAL_PLANT.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.2F, 1))));
    public static ConfiguredFeature<?, ?> SYTHIAN_STALK = WorldGenRegistrationHelper.createConfiguredFeature("sythian_stalk", BYGFeatures.SYTHIAN_STALK.withConfiguration(new ProbabilityConfig(0.9F)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.5F, 8))));
    public static ConfiguredFeature<?, ?> EMBUR_LILY = WorldGenRegistrationHelper.createConfiguredFeature("embur_lily", BYGFeatures.EMBUR_LILY.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.5F, 2))));
    public static ConfiguredFeature<?, ?> CRAG_LAKE = WorldGenRegistrationHelper.createConfiguredFeature("crag_lake", BYGFeatures.LAKE_WIDE_SHALLOW.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(BYGDecorators.ANY_WATER_OR_SOLID_SURFACE.configure(new FeatureSpreadConfig(4))));
    public static ConfiguredFeature<?, ?> EMBUR_LAKE = WorldGenRegistrationHelper.createConfiguredFeature("embur_lake", BYGFeatures.EMBURLAKE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.field_242907_l.configure(new TopSolidRangeConfig(32, 0, 4)).func_242728_a()).func_242731_b(15));
    public static ConfiguredFeature<?, ?> OBBY_SPIKE = WorldGenRegistrationHelper.createConfiguredFeature("obsidian_spire", BYGFeatures.OBBYSPIKES.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(BYGDecorators.OBBY_SPIKE.configure(new AtSurfaceWithExtraConfig(2000, 0, 0))));
    public static ConfiguredFeature<?, ?> STACKED_BOULDERS = WorldGenRegistrationHelper.createConfiguredFeature("stacked_boulders", BYGFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(Blocks.STONE.getDefaultState(), 3).addWeightedBlockstate(Blocks.DIORITE.getDefaultState(), 2)).setMinStackHeight(10).setMaxHeight(15).setMinRadius(8).setMaxRadius(28).build()).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(0, 0.15F, 1))));
    public static ConfiguredFeature<?, ?> GRASSLAND_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("grassland_boulder", BYGFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.ROCKY_STONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.MOSSY_STONE.getDefaultState(), 2)).setMinStackHeight(1).setMaxHeight(1).setMinRadius(8).setMaxRadius(12).build()).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
    public static ConfiguredFeature<?, ?> GRANITE_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("granite_boulder", BYGFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(Blocks.GRANITE.getDefaultState(), 3).addWeightedBlockstate(Blocks.POLISHED_GRANITE.getDefaultState(), 2)).setMinStackHeight(1).setMaxHeight(1).setMinRadius(5).setMaxRadius(9).build()).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static ConfiguredFeature<?, ?> RED_ROCK_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("red_rock_boulder", BYGFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.RED_ROCK.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.RED_ROCK.getDefaultState(), 9).addWeightedBlockstate(Blocks.RED_CONCRETE.getDefaultState(), 1)).setMinStackHeight(7).setMaxHeight(12).setMinRadius(8).setMaxRadius(12).build()));
    public static ConfiguredFeature<?, ?> WHITE_SANDSTONE_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("white_sandstone_boulder", BYGFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.WHITE_SANDSTONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.WHITE_SMOOTH_SANDSTONE.getDefaultState(), 2).addWeightedBlockstate(BYGBlocks.WHITE_SMOOTH_SANDSTONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.WHITE_SAND.getDefaultState(), 5)).setMinStackHeight(3).setMaxHeight(12).setMinRadius(13).setMaxRadius(20).setRadiusDivisor(1.1).flattenTopBoulder().build()).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(0, 0.04F, 1))));
    //    public static ConfiguredFeature<?, ?> WHITE_SANDSTONE_BOULDER_W_FLAT_TOP = WorldGenRegistrationHelper.createConfiguredFeature("white_sandstone_boulder_w_flat_top", BYGDefaultBiomeFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.WHITE_SANDSTONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.WHITE_SANDSTONE.getDefaultState(), 2).addWeightedBlockstate(BYGBlocks.WHITE_SMOOTH_SANDSTONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.WHITE_SAND.getDefaultState(), 5)).setMinStackHeight(3).setMaxHeight(12).setMinRadius(13).setMaxRadius(20).setRadiusDivisor(1.1).flattenTopBoulder().build()).withPlacement(BYGDecorators.OCEANFLOOR.configure(new AtSurfaceWithExtraConfig(0, 0.01F, 1))));
//    public static ConfiguredFeature<?, ?> WHITE_SANDSTONE_BOULDER_XL = WorldGenRegistrationHelper.createConfiguredFeature("white_sandstone_boulder_xl", BYGDefaultBiomeFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.WHITE_SANDSTONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.WHITE_SANDSTONE.getDefaultState(), 2).addWeightedBlockstate(BYGBlocks.WHITE_SMOOTH_SANDSTONE.getDefaultState(), 3).addWeightedBlockstate(BYGBlocks.WHITE_SAND.getDefaultState(), 5)).setMinStackHeight(4).setMaxHeight(8).setMinRadius(25).setMaxRadius(28).setRadiusDivisor(1.1).build()).withPlacement(BYGDecorators.OCEANFLOOR.configure(new AtSurfaceWithExtraConfig(0, 0.005F, 1))));
    public static ConfiguredFeature<?, ?> TERRACOTTA_BOULDER = WorldGenRegistrationHelper.createConfiguredFeature("terracotta_boulder", BYGFeatures.STACKABLE_BOULDERS.withConfiguration(new BYGBoulderFeatureConfig.Builder().setBlock(new WeightedBlockStateProvider().addWeightedBlockstate(Blocks.TERRACOTTA.getDefaultState(), 3).addWeightedBlockstate(Blocks.TERRACOTTA.getDefaultState(), 3).addWeightedBlockstate(Blocks.RED_TERRACOTTA.getDefaultState(), 7)).setMinStackHeight(7).setMaxHeight(12).setMinRadius(8).setMaxRadius(12).build()));


    public static ConfiguredFeature<?, ?> RIVER = WorldGenRegistrationHelper.createConfiguredFeature("river_aheehee", BYGFeatures.HUH.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(new NoPlacementConfig())));
    public static ConfiguredFeature<?, ?> VOLCANO = WorldGenRegistrationHelper.createConfiguredFeature("volcano", BYGFeatures.VOLCANO.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(new NoPlacementConfig())));
    public static final ConfiguredFeature<?, ?> BASALT_SPRING = WorldGenRegistrationHelper.createConfiguredFeature("blackhead_spring", Feature.SPRING_FEATURE.withConfiguration(new LiquidsConfig(Blocks.WATER.getDefaultState().getFluidState(), true, 4, 1, ImmutableSet.of(Blocks.BLACKSTONE))).withPlacement(Features.Placements.SPRING_PLACEMENT).func_242728_a().func_242731_b(16));
    public static final ConfiguredFeature<?, ?> BASALT_DELTA = WorldGenRegistrationHelper.createConfiguredFeature("delta", Feature.DELTA_FEATURE.withConfiguration(new BasaltDeltasFeature(Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), FeatureSpread.func_242253_a(3, 4), FeatureSpread.func_242253_a(0, 2))).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(2))));
    public static final ConfiguredFeature<?, ?> SMALL_BASALT_COLUMN = WorldGenRegistrationHelper.createConfiguredFeature("small_basalt_columns", Feature.BASALT_COLUMNS.withConfiguration(new ColumnConfig(FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(1, 1))).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> LARGE_BASALT_COLUMN = WorldGenRegistrationHelper.createConfiguredFeature("large_basalt_columns", Feature.BASALT_COLUMNS.withConfiguration(new ColumnConfig(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(1, 1))).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> BASALT_BLOBS = WorldGenRegistrationHelper.createConfiguredFeature("basalt_blobs", Feature.NETHERRACK_REPLACE_BLOBS.withConfiguration(new BlobReplacementConfig(BYGBlocks.BLACK_SAND.getDefaultState(), Blocks.BASALT.getDefaultState(), FeatureSpread.func_242253_a(1, 1))).func_242733_d(128).func_242728_a().func_242731_b(75));
    public static final ConfiguredFeature<?, ?> BASALT_BLOBS2 = WorldGenRegistrationHelper.createConfiguredFeature("blackstone_blobs2", Feature.NETHERRACK_REPLACE_BLOBS.withConfiguration(new BlobReplacementConfig(BYGBlocks.BLACK_SAND.getDefaultState(), Blocks.BASALT.getDefaultState(), FeatureSpread.func_242253_a(1, 1))).func_242733_d(128).func_242728_a().func_242731_b(25));


    /***********************************************************Configured Random Selector Features***********************************************************/

    public static final ConfiguredFeature<?, ?> RANDOM_ALLIUM_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_allium_flower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ALLIUM_TALL_BUSH.withChance(0.25F),
            ALLIUM_TALL_PINK_BUSH.withChance(0.25F),
            ALLIUM_BUSH.withChance(0.25F)),
            ALLIUM_PINK_BUSH)).withPlacement(Features.Placements.FIRE_PLACEMENT).func_242731_b(60));

    public static final ConfiguredFeature<?, ?> RANDOM_AMARANTH_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_amaranth_flower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            AMARANTH.withChance(0.2F),
            AMARANTH_CYAN.withChance(0.2F),
            AMARANTH_MAGENTA.withChance(0.2F),
            AMARANTH_ORANGE.withChance(0.2F)),
            AMARANTH_PURPLE)).withPlacement(Features.Placements.FIRE_PLACEMENT).func_242731_b(60));

    public static final ConfiguredFeature<?, ?> RANDOM_ROSE_FIELD_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_rose_field_flower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE_OSIRIA.withChance(0.25F),
            ROSE.withChance(0.25F),
            ROSE_BUSH.withChance(0.25F)),
            ROSE_BUSH)).withPlacement(Features.Placements.FIRE_PLACEMENT).func_242731_b(60));

    public static final ConfiguredFeature<?, ?> RANDOM_CALIFORNIA_POPPY = WorldGenRegistrationHelper.createConfiguredFeature("rs_california_poppy", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CALIFORNIA_POPPY.withChance(0.50F)),
            CALIFORNIA_POPPY)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_WINTER_SUCCULENT = WorldGenRegistrationHelper.createConfiguredFeature("rs_winter_succulent", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WINTER_SUCCULENT.withChance(0.50F)),
            WINTER_SUCCULENT)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_HORSEWEED = WorldGenRegistrationHelper.createConfiguredFeature("rs_horseweed", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            HORSE_WEED.withChance(0.50F)),
            HORSE_WEED)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_DESERT_PLANTS = WorldGenRegistrationHelper.createConfiguredFeature("rs_desert_plants", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MINI_CACTI.withChance(0.3F),
            PRICKLY_PEAR_CACTI.withChance(0.3F),
            GOLDEN_SPINED_CACTI.withChance(0.3F)),
            FIRECRACKER_BUSH)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));


    public static final ConfiguredFeature<?, ?> RANDOM_LUNA_BOULDERS = WorldGenRegistrationHelper.createConfiguredFeature("rs_luna_boulders", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            RED_ROCK_BOULDER.withChance(0.5F)),
            TERRACOTTA_BOULDER)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLACKSTONE_BOULDERS = WorldGenRegistrationHelper.createConfiguredFeature("rs_blackstone_boulders", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLACKSTONE_BOULDER.withChance(0.5F)),
            BLACKSTONE_BOULDER)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(0, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_BOULDERS = WorldGenRegistrationHelper.createConfiguredFeature("rs_boulders", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MOSSY_STONE_BOULDER.withChance(0.5F)),
            ROCKY_STONE_BOULDER)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242732_c(2));

    public static final ConfiguredFeature<?, ?> RANDOM_TERRACOTTA_BOULDERS = WorldGenRegistrationHelper.createConfiguredFeature("rs_terracotta_boulders", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ORANGE_TERRACOTTA_BOULDER.withChance(0.5F)),
            ORANGE_TERRACOTTA_BOULDER)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242732_c(2));

    public static final ConfiguredFeature<?, ?> RANDOM_FIRECRACKER = WorldGenRegistrationHelper.createConfiguredFeature("rs_firecracker", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            FIRECRACKER_BUSH.withChance(0.50F)),
            FIRECRACKER_BUSH)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_PRAIRIE_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_prairie", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PRAIRIE_GRASS.withChance(0.92F)),
            PRAIRIE_TALL_GRASS)).withPlacement(Features.Placements.FIRE_PLACEMENT).func_242731_b(60));

    public static final ConfiguredFeature<?, ?> RANDOM_PUMPKIN = WorldGenRegistrationHelper.createConfiguredFeature("rs_pumpkin", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PUMPKIN_CONFIG.withChance(0.50F)),
            PUMPKIN_CONFIG)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(8));

    public static final ConfiguredFeature<?, ?> RANDOM_BLUEBERRIES = WorldGenRegistrationHelper.createConfiguredFeature("rs_blueberries", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_BERRY_BUSH.withChance(0.50F)),
            BLUE_BERRY_BUSH)).withPlacement(Features.Placements.PATCH_PLACEMENT));

    public static final ConfiguredFeature<?, ?> RANDOM_LUSH_BLUEBERRIES = WorldGenRegistrationHelper.createConfiguredFeature("rs_lush_blueberries", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_BERRY_BUSH.withChance(0.50F)),
            BLUE_BERRY_BUSH)).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242729_a(12));

    public static final ConfiguredFeature<?, ?> RANDOM_BEACH_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_beach_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BEACH_GRASS.withChance(0.50F)),
            BEACH_SHORT_GRASS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWCANE = WorldGenRegistrationHelper.createConfiguredFeature("rs_glowcane", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            GLOWCANE_BLUE.withChance(0.25F),
            GLOWCANE_PINK.withChance(0.25F),
            GLOWCANE_PURPLE.withChance(0.25F)),
            GLOWCANE_RED)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(16));

    public static final ConfiguredFeature<?, ?> RANDOM_BYG_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_byg_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHORT_GRASS.withChance(0.50F)),
            Features.PATCH_GRASS_NORMAL)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(10));

    public static final ConfiguredFeature<?, ?> RANDOM_SHORT_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_short_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHORT_GRASS.withChance(0.50F)),
            SHORT_GRASS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(10));

    public static final ConfiguredFeature<?, ?> RANDOM_BYG_FERN_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_byg_fern_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHORT_GRASS.withChance(0.50F)),
            Features.PATCH_TAIGA_GRASS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(10));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("rs_glowshroom", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_GLOWSHROOM.withChance(0.50F)),
            PURPLE_GLOWSHROOM)).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242729_a(4));

    public static final ConfiguredFeature<?, ?> RANDOM_MUSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("rs_mushroom", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLACK_PUFF.withChance(0.50F),
            WOOD_BLEWIT.withChance(0.50F),
            WEEPING_MILKCAP.withChance(0.50F)),
            GREEN_MUSHROOM)).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242729_a(4));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWSTONE_GARDEN_VEGETATION = WorldGenRegistrationHelper.createConfiguredFeature("rs_gg_vegetation", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SOUL_SHROOM.withChance(0.2F),
            DEATH_CAP.withChance(0.2F)),
            NETHER_BRISTLE)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(4)).func_242731_b(1)));

    public static final ConfiguredFeature<?, ?> RANDOM_CRIMSON_GARDEN_VEGETATION = WorldGenRegistrationHelper.createConfiguredFeature("rs_cg_vegetation", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_ROOTS_TALL.withChance(0.45F),
            CRIMSON_ROOTS_TALL.withChance(0.8F)),
            CRIMSON_BERRY_BUSH)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(25))));

    public static final ConfiguredFeature<?, ?> RANDOM_EMBUR_BOG_PLANT = WorldGenRegistrationHelper.createConfiguredFeature("rs_embur_bog_plant", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_ROOTS_TALL.withChance(0.45F),
            EMBUR_ROOTS.withChance(0.5F)),
            EMBUR_WART)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_EMBUR_SPROUTS = WorldGenRegistrationHelper.createConfiguredFeature("rs_embur_sprouts", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_SPROUTS.withChance(0.5F)),
            EMBUR_SPROUTS)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(30))));

    public static final ConfiguredFeature<?, ?> RANDOM_SOUL_FIRE_PATCH_WARPED = WorldGenRegistrationHelper.createConfiguredFeature("patch_soul_fire_warped", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SOUL_FIRE_ON_NYLIUM.withChance(0.5F)),
            SOUL_FIRE_ON_NYLIUM)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(1))));

    public static final ConfiguredFeature<?, ?> RANDOM_BORIC_FIRE_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("patch_boric_fire", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BORIC_FIRE.withChance(0.5F)),
            BORIC_FIRE)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(1))));

    public static final ConfiguredFeature<?, ?> RANDOM_MAGMA_FIRE_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("patch_magma_fire", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MAGMA_FIRE.withChance(0.5F)),
            MAGMA_FIRE)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SUBZERO_ASH_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("patch_subzero_ash", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SUBZERO_ASH.withChance(0.6F)),
            SUBZERO_ASH_BLOCK)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(3))));

    public static final ConfiguredFeature<?, ?> RANDOM_QUARTZ_CRYSTAL_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("rs_quartz_crystal", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            QUARTZ_CRYSTAL.withChance(0.6F)),
            QUARTZ_CRYSTAL)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_WEEPING_VINE_BLACKSTONE = WorldGenRegistrationHelper.createConfiguredFeature("weeping_vines_blackstone", BYGFeatures.WEEPING_VINE_BLACKSTONE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(80));

    public static final ConfiguredFeature<?, ?> RANDOM_WEEPING_ROOTS_FEATURE = WorldGenRegistrationHelper.createConfiguredFeature("weeping_roots_feature", BYGFeatures.WEEPING_ROOTS_FEATURE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(80));
    public static final ConfiguredFeature<?, ?> RANDOM_SOUL_SOIL_PILLARS = WorldGenRegistrationHelper.createConfiguredFeature("soul_soil_pillars", BYGFeatures.SOUL_SOIL_PILLARS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(50));
    public static final ConfiguredFeature<?, ?> RANDOM_FROST_MAGMA_PILLARS = WorldGenRegistrationHelper.createConfiguredFeature("frost_magma_pillars", BYGFeatures.FROST_MAGMA_PILLARS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(50));
    public static final ConfiguredFeature<?, ?> RANDOM_MAGMA_PILLARS = WorldGenRegistrationHelper.createConfiguredFeature("magma_pillars", BYGFeatures.MAGMA_PILLARS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(65));
    public static final ConfiguredFeature<?, ?> RANDOM_BRIMSTONE_PILLARS = WorldGenRegistrationHelper.createConfiguredFeature("brimstone_pillars", BYGFeatures.BRIMSTONE_PILLARS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(80));
    public static final ConfiguredFeature<?, ?> QUARTZ_COLUMNS = WorldGenRegistrationHelper.createConfiguredFeature("quartz_columns", BYGFeatures.QUARTZ_COLUMNS.withConfiguration(new ColumnConfig(FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(1, 3))).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(4))));

    public static final ConfiguredFeature<?, ?> RANDOM_EMBUR_GEL_VINES = WorldGenRegistrationHelper.createConfiguredFeature("rs_embur_gel_vines", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_GEL_VINES.withChance(0.3F)),
            EMBUR_GEL_VINES)).func_242733_d(128).func_242728_a().func_242731_b(100));

    public static final ConfiguredFeature<?, ?> RANDOM_SYTHIAN_PLANT = WorldGenRegistrationHelper.createConfiguredFeature("rs_sythian_plant", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SYTHIAN_SPROUT.withChance(0.5F),
            SYTHIAN_ROOTS.withChance(0.46F)),
            SYTHIAN_FUNGUS)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> HANGING_SOUL_SHROOM_SPORES = WorldGenRegistrationHelper.createConfiguredFeature("hanging_soul_shroom_spores_feature", BYGFeatures.SOUL_SHROOM_SPORES_HANGING.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(45));
    public static final ConfiguredFeature<?, ?> HANGING_SYTHIAN_ROOTS = WorldGenRegistrationHelper.createConfiguredFeature("hanging_sythian_roots_feature", BYGFeatures.SYTHIAN_HANGING_ROOTS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(80));
    public static final ConfiguredFeature<?, ?> MOSSY_NETHERRACK_PILLARS_FEATURE = WorldGenRegistrationHelper.createConfiguredFeature("mossy_netherrack_pillars", BYGFeatures.MOSSY_NETHERRACK_PILLARS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(50));
    public static final ConfiguredFeature<?, ?> SYTHIAN_FUNGUS_PILLARS_FEATURE = WorldGenRegistrationHelper.createConfiguredFeature("sythian_fungus_pillars", BYGFeatures.SYTHIAN_FUNGUS_PILLARS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(50));
    public static final ConfiguredFeature<?, ?> HANGING_BONE_FEATURE = WorldGenRegistrationHelper.createConfiguredFeature("hanging_bone_feature", BYGFeatures.HANGING_BONE_FEATURE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(70));
    public static final ConfiguredFeature<?, ?> LAMENT_VINE_FEATURE = WorldGenRegistrationHelper.createConfiguredFeature("lament_vine_feature", BYGFeatures.LAMENT_VINE_FEATURE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(128).func_242728_a().func_242731_b(70));


    public static final ConfiguredFeature<?, ?> RANDOM_WEEPING_ROOTS = WorldGenRegistrationHelper.createConfiguredFeature("rs_weeping_roots", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WEEPING_ROOTS.withChance(0.3F)),
            WEEPING_ROOTS_PLANT)).func_242733_d(128).func_242728_a().func_242731_b(80));

    public static final ConfiguredFeature<?, ?> RANDOM_JUNGLE_FLOWERS = WorldGenRegistrationHelper.createConfiguredFeature("rs_jungle_flowers", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BISTORT.withChance(0.50F),
            GUZMANIA.withChance(0.50F),
            BEGONIA.withChance(0.50F),
            LAZARUS_BELLFLOWER.withChance(0.50F),
            RICHEA.withChance(0.50F),
            TORCH_GINGER.withChance(0.50F)),
            INCAN_LILY)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(5));

    public static final ConfiguredFeature<?, ?> RANDOM_SWAMP_PLANTS = WorldGenRegistrationHelper.createConfiguredFeature("rs_swamp_plants", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            TINY_LILY_PAD.withChance(0.50F)),
            WATER_SILK)).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(3));

    public static final ConfiguredFeature<?, ?> RANDOM_LILY_PADS = WorldGenRegistrationHelper.createConfiguredFeature("rs_lily_pads", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            TINY_LILY_PAD.withChance(0.50F)),
            Features.PATCH_WATERLILLY)).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(3));

    public static final ConfiguredFeature<?, ?> RANDOM_AZALEA = WorldGenRegistrationHelper.createConfiguredFeature("rs_azalea", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            AZALEA.withChance(0.5F)),
            AZALEA)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_SUNFLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_sunflower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.PATCH_SUNFLOWER.withChance(0.5F)),
            Features.PATCH_SUNFLOWER)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_JAPANESE_ORCHID = WorldGenRegistrationHelper.createConfiguredFeature("rs_japanese_orchid", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            JAPANESE_ORCHID.withChance(0.5F)),
            JAPANESE_ORCHID)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_DELPHINIUM = WorldGenRegistrationHelper.createConfiguredFeature("rs_delphinium", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DELPHINIUM.withChance(0.25F)),
            DELPHINIUM)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_WILTED_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_wilted_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WILTED_GRASS.withChance(0.25F)),
            WILTED_GRASS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_WEED_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_weed_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WEED_GRASS.withChance(0.25F)),
            WEED_GRASS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_WINTER_GRASS = WorldGenRegistrationHelper.createConfiguredFeature("rs_winter_grass", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WINTER_GRASS.withChance(0.25F)),
            WINTER_GRASS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_LEAF_PILE = WorldGenRegistrationHelper.createConfiguredFeature("rs_leaf_pile", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            LEAF_PILE.withChance(0.25F)),
            LEAF_PILE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_CLOVER_FLOWER_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("rs_clover_flower_patch", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CLOVER_PATCH.withChance(0.5F)),
            FLOWER_PATCH)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_CHERRY_FOLIAGE = WorldGenRegistrationHelper.createConfiguredFeature("rs_cherry_foliage", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WHITE_CHERRY_FOLIAGE.withChance(0.5F)),
            PINK_CHERRY_FOLIAGE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(20));

    public static final ConfiguredFeature<?, ?> RANDOM_WARPED_DESERT_VEGETATION = WorldGenRegistrationHelper.createConfiguredFeature("rs_warped_desert_plants", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WARPED_BUSH.withChance(0.25F),
            WARPED_CORAL.withChance(0.25F),
            WARPED_CORAL_FAN.withChance(0.25F)),
            WARPED_CACTI)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(16))));

    public static final ConfiguredFeature<?, ?> RANDOM_SCORCHED_PLANT = WorldGenRegistrationHelper.createConfiguredFeature("rs_scorched_plant", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SCORCHED_GRASS.withChance(0.6F)),
            SCORCHED_BUSH)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_LAMENT_VEGETATION = WorldGenRegistrationHelper.createConfiguredFeature("rs_lament_vegetation", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SCORCHED_BUSH.withChance(0.2F),
            SCORCHED_GRASS.withChance(0.2F)),
            LAMENT_SPROUTS)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_WAILING_VEGETATION = WorldGenRegistrationHelper.createConfiguredFeature("rs_wailing_plants", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SCORCHED_BUSH.withChance(0.2F),
            SCORCHED_GRASS.withChance(0.2F)),
            WAILING_GRASS)).withPlacement(Placement.field_242897_C.configure(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_WAILING_VINES = WorldGenRegistrationHelper.createConfiguredFeature("rs_wailing_vines", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WAILING_VINES.withChance(0.5F)),
            WAILING_VINES)).func_242733_d(128).func_242728_a().func_242731_b(100));

    public static final ConfiguredFeature<?, ?> RANDOM_CHAINS = WorldGenRegistrationHelper.createConfiguredFeature("rs_chains", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CHAINS.withChance(0.5F)),
            CHAINS)).func_242733_d(128).func_242728_a().func_242731_b(4));

    public static final ConfiguredFeature<?, ?> RANDOM_BLUEBERRY_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("rs_blueberry_bush", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_BERRY_BUSH.withChance(0.5F)),
            BLUE_BERRY_BUSH)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_ROSE = WorldGenRegistrationHelper.createConfiguredFeature("rs_rose", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE.withChance(0.5F)),
            ROSE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_ANGELICA = WorldGenRegistrationHelper.createConfiguredFeature("rs_angelica", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ANGELICA.withChance(0.5F)),
            ANGELICA)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_CROCUS = WorldGenRegistrationHelper.createConfiguredFeature("rs_crocus", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CROCUS.withChance(0.5F)),
            CROCUS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_IRIS = WorldGenRegistrationHelper.createConfiguredFeature("rs_iris", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            IRIS.withChance(0.5F)),
            IRIS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_ANEMONE = WorldGenRegistrationHelper.createConfiguredFeature("rs_anemone", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ANEMONE_PINK.withChance(0.5F)),
            ANEMONE_WHITE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_WINTER_ROSE = WorldGenRegistrationHelper.createConfiguredFeature("rs_winter_rose", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE_WINTER.withChance(0.5F)),
            ROSE_WINTER)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_SNOWDROPS = WorldGenRegistrationHelper.createConfiguredFeature("rs_snowdrops", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SNOWDROPS.withChance(0.5F)),
            SNOWDROPS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_PINK_ALLIUM = WorldGenRegistrationHelper.createConfiguredFeature("rs_pink_allium", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ALLIUM_PINK.withChance(0.5F)),
            ALLIUM_PINK)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_ORANGE_DAISY = WorldGenRegistrationHelper.createConfiguredFeature("rs_orange_daisy", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DAISY_ORANGE.withChance(0.5F)),
            DAISY_ORANGE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_RED_CORNFLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_red_cornflower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CORNFLOWER_RED.withChance(0.5F)),
            CORNFLOWER_RED)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_SAGE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sage", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SAGE_PURPLE.withChance(0.5F)),
            SAGE_WHITE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_FOXGLOVE = WorldGenRegistrationHelper.createConfiguredFeature("rs_foxglove", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            FOXGLOVE.withChance(0.5F)),
            FOXGLOVE)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_YELLOW_DAFFODIL = WorldGenRegistrationHelper.createConfiguredFeature("rs_yellow_daffodil", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DAFFODIL_YELLOW.withChance(0.5F)),
            DAFFODIL_YELLOW)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_BELLFLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_bellflower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ALPINE_BELLFLOWER.withChance(0.5F)),
            ALPINE_BELLFLOWER)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_SCILLA = WorldGenRegistrationHelper.createConfiguredFeature("rs_scilla", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WINTER_SCILLA.withChance(0.5F)),
            WINTER_SCILLA)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_KOVAN = WorldGenRegistrationHelper.createConfiguredFeature("rs_kovan", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            KOVAN_FLOWER.withChance(0.5F)),
            KOVAN_FLOWER)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_TULIP = WorldGenRegistrationHelper.createConfiguredFeature("rs_tulip", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            TULIP_MAGENTA.withChance(0.5F),
            TULIP_YELLOW.withChance(0.5F),
            TULIP_PURPLE.withChance(0.5F),
            TULIP_CYAN.withChance(0.5F)),
            TULIP_GREEN)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(5));

    public static final ConfiguredFeature<?, ?> RANDOM_REEDS = WorldGenRegistrationHelper.createConfiguredFeature("rs_reeds", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            REEDS.withChance(0.5F)),
            REEDS)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(8));

    public static final ConfiguredFeature<?, ?> RANDOM_CATTAILS = WorldGenRegistrationHelper.createConfiguredFeature("rs_cattails", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CATTAIL.withChance(0.5F)),
            CATTAIL)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(8));

    public static final ConfiguredFeature<?, ?> RANDOM_LOLIPOP = WorldGenRegistrationHelper.createConfiguredFeature("rs_lolipop", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            LOLI_POP.withChance(0.5F)),
            LOLI_POP)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_ORCHID = WorldGenRegistrationHelper.createConfiguredFeature("rs_orchid", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ORCHID_PINK.withChance(0.5F),
            ORCHID_PURPLE.withChance(0.5F)),
            ORCHID_RED)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_LEATHER_FLOWER = WorldGenRegistrationHelper.createConfiguredFeature("rs_leather_flower", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            LEATHER_FLOWER_PEACH.withChance(0.5F)),
            LEATHER_FLOWER_VIOLET)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_DAFFODILS = WorldGenRegistrationHelper.createConfiguredFeature("rs_daffodils", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DAFFODIL.withChance(0.5F)),
            DAFFODIL_PINK)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_BLACK_ROSE = WorldGenRegistrationHelper.createConfiguredFeature("rs_black_rose", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE_BLACK.withChance(0.5F)),
            ROSE_BLACK)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_CYAN_ROSE = WorldGenRegistrationHelper.createConfiguredFeature("rs_cyan_rose", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE_CYAN.withChance(0.5F)),
            ROSE_CYAN)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_OSIRIA_ROSE = WorldGenRegistrationHelper.createConfiguredFeature("rs_osiria_rose", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE_OSIRIA.withChance(0.5F)),
            ROSE_OSIRIA)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_FAIRYSLIPPER = WorldGenRegistrationHelper.createConfiguredFeature("rs_fairslipper", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            FAIRY_SLIPPER.withChance(0.5F)),
            FAIRY_SLIPPER)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.PATCH_PLACEMENT).func_242731_b(2));

    public static final ConfiguredFeature<?, ?> RANDOM_IVIS_PLANTS = WorldGenRegistrationHelper.createConfiguredFeature("rs_ivis_plants", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            IVIS_ROOTS.withChance(0.5F)),
            IVIS_SPROUT)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).func_242731_b(20));

    public static final ConfiguredFeature<?, ?> RANDOM_DEAD_SEA_SPIKE = WorldGenRegistrationHelper.createConfiguredFeature("rs_dead_sea_spike", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEAD_SEA_SPIKE.withChance(0.9F)),
            DEAD_SEA_SPIKE_TALL)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(new AtSurfaceWithExtraConfig(28, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_PUMPKIN_PATCH = WorldGenRegistrationHelper.createConfiguredFeature("rs_pumpkin_patch", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PUMPKIN1.withChance(0.45F),
            PUMPKIN2.withChance(0.45F)),
            PUMPKIN2)).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.3F, 1))));


    /***********************************************************Configured Tree Features********************************************************/

    public static final ConfiguredFeature<?, ?> DUMMY_TREE = WorldGenRegistrationHelper.createConfiguredFeature("dummy_tree", BYGFeatures.DUMMY_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(new AtSurfaceWithExtraConfig(16, 0.4F, 8))));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ARAUCARIA_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("araucaria_tree1", BYGFeatures.ARAUCARIA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.ARAUCARIA_LEAVES).setMaxHeight(30).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ARAUCARIA_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("araucaria_tree2", BYGFeatures.ARAUCARIA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.ARAUCARIA_LEAVES).setMaxHeight(28).setMinHeight(18).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ANCIENT_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("ancient_tree1", BYGFeatures.ANCIENT_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).setMaxHeight(25).setMinHeight(15).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ANCIENT_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("ancient_tree2", BYGFeatures.ANCIENT_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(25).setMinHeight(15).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ANCIENT_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("ancient_tree3", BYGFeatures.ANCIENT_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.SILVER_MAPLE_LEAVES).setMaxHeight(25).setMinHeight(15).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ASPEN_SHRUB1 = WorldGenRegistrationHelper.createConfiguredFeature("aspen_shrub1", BYGFeatures.SHRUB1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ASPEN_SHRUB2 = WorldGenRegistrationHelper.createConfiguredFeature("aspen_shrub2", BYGFeatures.SHRUB2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMinHeight(1).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ASPEN_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("aspen_tree1", BYGFeatures.ASPEN_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMaxHeight(10).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ASPEN_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("aspen_tree2", BYGFeatures.ASPEN_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMaxHeight(16).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ASPEN_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("aspen_tree3", BYGFeatures.ASPEN_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMaxHeight(16).setMinHeight(9).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BAOBAB_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("baobab_tree1", BYGFeatures.BAOBAB_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.BAOBAB_LOG).setLeavesBlock(BYGBlocks.BAOBAB_LEAVES).setMaxHeight(28).setMinHeight(20).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BIRCH_BROWN_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("brown_birch_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BIRCH_ORANGE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("orange_birch_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.ORANGE_BIRCH_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BIRCH_RED_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("red_birch_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.RED_BIRCH_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BIRCH_YELLOW_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("yellow_birch_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).setMaxHeight(11).setMinHeight(8).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BLUFF_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("bluff_tree1", BYGFeatures.BLUFF_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(21).setMinHeight(17).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BLUFF_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("bluff_tree2", BYGFeatures.BLUFF_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BLUFF_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("bluff_tree3", BYGFeatures.BLUFF_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(21).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BIRCH_BOREAL_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("birch_boreal_tree1", BYGFeatures.BOREAL_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BIRCH_YELLOW_BOREAL_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("birch_yellow_boreal_tree1", BYGFeatures.BOREAL_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(Blocks.BIRCH_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> BOREAL_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("boreal_tree2", BYGFeatures.BOREAL_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(15).setMinHeight(11).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CHERRY_PINK_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("pink_cherry_tree1", BYGFeatures.CHERRY_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.PINK_CHERRY_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CHERRY_PINK_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("pink_cherry_tree2", BYGFeatures.CHERRY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.PINK_CHERRY_LEAVES).setMaxHeight(13).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CHERRY_WHITE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("white_cherry_tree1", BYGFeatures.CHERRY_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.WHITE_CHERRY_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CHERRY_WHITE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("white_cherry_tree2", BYGFeatures.CHERRY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.WHITE_CHERRY_LEAVES).setMaxHeight(13).setMinHeight(8).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CIKA_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("cika_tree1", BYGFeatures.CIKA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CIKA_LOG).setLeavesBlock(BYGBlocks.CIKA_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CIKA_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("cika_tree2", BYGFeatures.CIKA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CIKA_LOG).setLeavesBlock(BYGBlocks.CIKA_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CIKA_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("cika_tree3", BYGFeatures.CIKA_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CIKA_LOG).setLeavesBlock(BYGBlocks.CIKA_LEAVES).setMaxHeight(21).setMinHeight(14).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree1", BYGFeatures.CONIFER_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(25).setMinHeight(19).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree2", BYGFeatures.CONIFER_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(30).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree3", BYGFeatures.CONIFER_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(35).setMinHeight(26).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree4", BYGFeatures.CONIFER_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(35).setMinHeight(25).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE5 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree5", BYGFeatures.CONIFER_TREE5.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE6 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree6", BYGFeatures.CONIFER_TREE6.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(17).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE7 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree7", BYGFeatures.CONIFER_TREE7.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(28).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CONIFER_TREE8 = WorldGenRegistrationHelper.createConfiguredFeature("conifer_tree8", BYGFeatures.CONIFER_TREE8.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(28).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CYPRESS_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("cypress_tree1", BYGFeatures.CYPRESS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CYPRESS_LOG).setLeavesBlock(BYGBlocks.CYPRESS_LEAVES).setMaxHeight(30).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CYPRESS_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("cypress_tree2", BYGFeatures.CYPRESS_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CYPRESS_LOG).setLeavesBlock(BYGBlocks.CYPRESS_LEAVES).setMaxHeight(30).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> CYPRESS_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("cypress_tree3", BYGFeatures.CYPRESS_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.CYPRESS_LOG).setLeavesBlock(BYGBlocks.CYPRESS_LEAVES).setMaxHeight(30).setMinHeight(20).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DEAD_HAZEL_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("dead_hazel_tree1", BYGFeatures.DEAD_HAZEL_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.WITCH_HAZEL_LEAVES.getDefaultState(), 4)).setMaxHeight(15).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DEAD_HAZEL_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("dead_hazel_tree2", BYGFeatures.DEAD_HAZEL_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.WITCH_HAZEL_LEAVES.getDefaultState(), 4)).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DEAD_HAZEL_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("dead_hazel_tree3", BYGFeatures.DEAD_HAZEL_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.WITCH_HAZEL_LEAVES.getDefaultState(), 4)).setMaxHeight(16).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DEAD_HAZEL_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("dead_hazel_tree4", BYGFeatures.DEAD_HAZEL_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.WITCH_HAZEL_LEAVES.getDefaultState(), 4)).setMaxHeight(7).setMinHeight(5).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_SEASONAL_SHRUB = WorldGenRegistrationHelper.createConfiguredFeature("seasonal_deciduous_shrub", BYGFeatures.SHRUB1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMinHeight(2).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_tree1", BYGFeatures.DECIDUOUS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(19).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_tree2", BYGFeatures.DECIDUOUS_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(22).setMinHeight(17).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_tree3", BYGFeatures.DECIDUOUS_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(21).setMinHeight(16).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_tree4", BYGFeatures.DECIDUOUS_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(21).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_RED_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_red_tree1", BYGFeatures.DECIDUOUS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE1.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_RED_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_red_tree2", BYGFeatures.DECIDUOUS_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE2.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_RED_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_red_tree3", BYGFeatures.DECIDUOUS_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE3.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_RED_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_red_tree4", BYGFeatures.DECIDUOUS_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE4.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_ORANGE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_orange_tree1", BYGFeatures.DECIDUOUS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE1.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_ORANGE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_orange_tree2", BYGFeatures.DECIDUOUS_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE2.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_ORANGE_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_orange_tree3", BYGFeatures.DECIDUOUS_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE3.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_ORANGE_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_orange_tree4", BYGFeatures.DECIDUOUS_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE4.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_BROWN_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_brown_tree1", BYGFeatures.DECIDUOUS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE1.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_BROWN_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_brown_tree2", BYGFeatures.DECIDUOUS_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE2.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_BROWN_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_brown_tree3", BYGFeatures.DECIDUOUS_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE3.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> DECIDUOUS_BROWN_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("deciduous_brown_tree4", BYGFeatures.DECIDUOUS_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(DECIDUOUS_TREE4.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> EBONY_BUSH1 = WorldGenRegistrationHelper.createConfiguredFeature("ebony_bush1", BYGFeatures.EBONY_BUSH1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(28).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> EBONY_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("ebony_tree1", BYGFeatures.EBONY_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(13).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> EBONY_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("ebony_tree2", BYGFeatures.EBONY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(17).setMinHeight(11).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_BLUE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("blue_enchanted_tree1", BYGFeatures.ENCHANTED_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_BLUE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("blue_enchanted_tree2", BYGFeatures.ENCHANTED_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(26).setMinHeight(19).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_BLUE_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("blue_enchanted_tree3", BYGFeatures.ENCHANTED_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_GREEN_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("green_enchanted_tree1", BYGFeatures.ENCHANTED_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(ENCHANTED_BLUE_TREE1.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_GREEN_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("green_enchanted_tree2", BYGFeatures.ENCHANTED_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(ENCHANTED_BLUE_TREE2.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_GREEN_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("green_enchanted_tree3", BYGFeatures.ENCHANTED_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(ENCHANTED_BLUE_TREE3.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_BLUE_GROVE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("blue_enchanted_grove_tree1", BYGFeatures.ENCHANTED_GROVE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ENCHANTED_GREEN_GROVE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("green_enchanted_grove_tree1", BYGFeatures.ENCHANTED_GROVE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(ENCHANTED_BLUE_TREE1.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> HOLLY_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("holly_tree1", BYGFeatures.HOLLY_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.HOLLY_BERRY_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.HOLLY_LEAVES.getDefaultState(), 10)).setMaxHeight(23).setMinHeight(17).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> HOLLY_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("holly_tree2", BYGFeatures.HOLLY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.HOLLY_BERRY_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.HOLLY_LEAVES.getDefaultState(), 10)).setMaxHeight(15).setMinHeight(10).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> HOLLY_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("holly_tree3", BYGFeatures.HOLLY_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.HOLLY_BERRY_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.HOLLY_LEAVES.getDefaultState(), 10)).setMaxHeight(25).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> HOLLY_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("holly_tree4", BYGFeatures.HOLLY_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.HOLLY_BERRY_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.HOLLY_LEAVES.getDefaultState(), 10)).setMaxHeight(14).setMinHeight(9).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> JACARANDA_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("jacaranda_tree1", BYGFeatures.JACARANDA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.JACARANDA_LOG).setLeavesBlock(BYGBlocks.JACARANDA_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> JACARANDA_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("jacaranda_tree2", BYGFeatures.JACARANDA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.JACARANDA_LOG).setLeavesBlock(BYGBlocks.JACARANDA_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> INDIGO_JACARANDA_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("indigo_jacaranda_tree1", BYGFeatures.JACARANDA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(JACARANDA_TREE1.config).setLeavesBlock(BYGBlocks.INDIGO_JACARANDA_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> INDIGO_JACARANDA_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("indigo_jacaranda_tree2", BYGFeatures.JACARANDA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(JACARANDA_TREE2.config).setLeavesBlock(BYGBlocks.INDIGO_JACARANDA_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> JOSHUA_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("joshua_tree1", BYGFeatures.JOSHUA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.RIPE_JOSHUA_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.JOSHUA_LEAVES.getDefaultState(), 10)).setMaxHeight(6).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> JOSHUA_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("joshua_tree2", BYGFeatures.JOSHUA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.RIPE_JOSHUA_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.JOSHUA_LEAVES.getDefaultState(), 10)).setMaxHeight(6).setMinHeight(3).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MANGROVE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("mangrove_tree1", BYGFeatures.MANGROVE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(15).setMinHeight(10).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MANGROVE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("mangrove_tree2", BYGFeatures.MANGROVE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(17).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MANGROVE_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("mangrove_tree3", BYGFeatures.MANGROVE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(16).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MANGROVE_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("mangrove_tree4", BYGFeatures.MANGROVE_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(15).setMinHeight(10).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MANGROVE_TREE5 = WorldGenRegistrationHelper.createConfiguredFeature("mangrove_tree5", BYGFeatures.MANGROVE_TREE5.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(17).setMinHeight(11).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAPLE_RED_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("red_maple_tree1", BYGFeatures.MAPLE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.RED_MAPLE_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAPLE_RED_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("red_maple_tree2", BYGFeatures.MAPLE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.RED_MAPLE_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAPLE_SILVER_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("silver_maple_tree1", BYGFeatures.MAPLE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(MAPLE_RED_TREE1.config).setLeavesBlock(BYGBlocks.SILVER_MAPLE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAPLE_SILVER_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("silver_maple_tree2", BYGFeatures.MAPLE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(MAPLE_RED_TREE2.config).setLeavesBlock(BYGBlocks.SILVER_MAPLE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAPLE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("maple_tree1", BYGFeatures.MAPLE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.MAPLE_LEAVES).setMaxHeight(10).setMinHeight(5).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MEADOW_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("meadow_tree1", BYGFeatures.MEADOW_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MEADOW_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("meadow_tree2", BYGFeatures.MEADOW_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MEADOW_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("meadow_tree3", BYGFeatures.MEADOW_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).setMaxHeight(9).setMinHeight(4).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ORCHARD_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("orchard_tree1", BYGFeatures.ORCHARD_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.ORCHARD_LEAVES.getDefaultState(), 10).addWeightedBlockstate(BYGBlocks.FLOWERING_ORCHARD_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.RIPE_ORCHARD_LEAVES.getDefaultState(), 1)).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ORCHARD_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("orchard_tree2", BYGFeatures.ORCHARD_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.ORCHARD_LEAVES.getDefaultState(), 10).addWeightedBlockstate(BYGBlocks.FLOWERING_ORCHARD_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.RIPE_ORCHARD_LEAVES.getDefaultState(), 1)).setMaxHeight(26).setMinHeight(21).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ORCHARD_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("orchard_tree3", BYGFeatures.ORCHARD_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.ORCHARD_LEAVES.getDefaultState(), 10).addWeightedBlockstate(BYGBlocks.FLOWERING_ORCHARD_LEAVES.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.RIPE_ORCHARD_LEAVES.getDefaultState(), 1)).setMaxHeight(9).setMinHeight(14).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PALM_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("palm_tree1", BYGFeatures.PALM_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PALM_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("palm_tree2", BYGFeatures.PALM_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PALM_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("palm_tree3", BYGFeatures.PALM_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PALM_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("palm_tree4", BYGFeatures.PALM_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PINE_LARGE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("large_pine_tree1", BYGFeatures.PINE_LARGE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(28).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PINE_LARGE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("large_pine_tree2", BYGFeatures.PINE_LARGE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(31).setMinHeight(26).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PINE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("pine_tree1", BYGFeatures.PINE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(20).setMinHeight(15).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PINE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("pine_tree2", BYGFeatures.PINE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(21).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PALO_VERDE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("palo_verde_tree1", BYGFeatures.PALO_VERDE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PALO_VERDE_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.PALO_VERDE_LEAVES.getDefaultState(), 6).addWeightedBlockstate(BYGBlocks.FLOWERING_PALO_VERDE_LEAVES.getDefaultState(), 1)).setMaxHeight(1).setMinHeight(1).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> PALO_VERDE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("palo_verde_tree2", BYGFeatures.PALO_VERDE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.PALO_VERDE_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.PALO_VERDE_LEAVES.getDefaultState(), 6).addWeightedBlockstate(BYGBlocks.FLOWERING_PALO_VERDE_LEAVES.getDefaultState(), 1)).setMaxHeight(2).setMinHeight(1).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> RAINBOW_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("rainbow_eucalyptus_tree1", BYGFeatures.RAINBOW_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LOG).setLeavesBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LEAVES).setMaxHeight(32).setMinHeight(27).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> RAINBOW_LARGE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("large_rainbow_eucalyptus_tree1", BYGFeatures.RAINBOW_LARGE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LOG).setLeavesBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LEAVES).setMaxHeight(19).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> REDWOOD_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("redwood_tree1", BYGFeatures.REDWOOD_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.REDWOOD_LOG).setLeavesBlock(BYGBlocks.REDWOOD_LEAVES).setMaxHeight(37).setMinHeight(36).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> REDWOOD_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("redwood_tree2", BYGFeatures.REDWOOD_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.REDWOOD_LOG).setLeavesBlock(BYGBlocks.REDWOOD_LEAVES).setMaxHeight(34).setMinHeight(31).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> REDWOOD_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("redwood_tree3", BYGFeatures.REDWOOD_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.REDWOOD_LOG).setLeavesBlock(BYGBlocks.REDWOOD_LEAVES).setMaxHeight(25).setMinHeight(18).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> OAK_BROWN_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("brown_oak_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> OAK_ORANGE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("orange_oak_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> OAK_RED_TREE = WorldGenRegistrationHelper.createConfiguredFeature("red_oak_tree1", BYGFeatures.BASIC_TREE.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(11).setMinHeight(8).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SHRUB = WorldGenRegistrationHelper.createConfiguredFeature("shrub", BYGFeatures.SHRUB1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SHRUB_MEADOW = WorldGenRegistrationHelper.createConfiguredFeature("meadow_shrub1", BYGFeatures.SHRUB1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SHRUB_MEADOW2 = WorldGenRegistrationHelper.createConfiguredFeature("meadow_shrub2", BYGFeatures.SHRUB2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SHRUB_PRAIRIE1 = WorldGenRegistrationHelper.createConfiguredFeature("prairie_shrub1", BYGFeatures.SHRUB1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SHRUB_PRAIRIE2 = WorldGenRegistrationHelper.createConfiguredFeature("prairie_shrub2", BYGFeatures.SHRUB2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(2).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SKYRIS_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("skyris_tree1", BYGFeatures.SKYRIS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES.getDefaultState(), 8)).setMaxHeight(9).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SKYRIS_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("skyris_tree2", BYGFeatures.SKYRIS_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES.getDefaultState(), 8)).setMaxHeight(6).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SKYRIS_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("skyris_tree3", BYGFeatures.SKYRIS_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES.getDefaultState(), 8)).setMaxHeight(8).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SKYRIS_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("skyris_tree4", BYGFeatures.SKYRIS_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES.getDefaultState(), 8)).setMaxHeight(8).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SKYRIS_TREE5 = WorldGenRegistrationHelper.createConfiguredFeature("skyris_tree5", BYGFeatures.SKYRIS_TREE5.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.getDefaultState(), 1).addWeightedBlockstate(BYGBlocks.SKYRIS_LEAVES.getDefaultState(), 8)).setMaxHeight(8).setMinHeight(6).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree1", BYGFeatures.SPRUCE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(17).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree2", BYGFeatures.SPRUCE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(17).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree3", BYGFeatures.SPRUCE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(16).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree4", BYGFeatures.SPRUCE_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(17).setMinHeight(12).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE_MEDIUM1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(24).setMinHeight(19).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE_MEDIUM2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(25).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE_MEDIUM3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(26).setMinHeight(21).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE_MEDIUM4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(25).setMinHeight(19).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_TREE_LARGE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(55).setMinHeight(40).build()));

    //Yellow Spruce
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree1", BYGFeatures.SPRUCE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree2", BYGFeatures.SPRUCE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree3", BYGFeatures.SPRUCE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree4", BYGFeatures.SPRUCE_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_YELLOW_TREE_LARGE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_yellow_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));

    //Orange Spruce
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree1", BYGFeatures.SPRUCE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree2", BYGFeatures.SPRUCE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree3", BYGFeatures.SPRUCE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree4", BYGFeatures.SPRUCE_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_ORANGE_TREE_LARGE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_orange_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));

    //Red Spruce
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree1", BYGFeatures.SPRUCE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree2", BYGFeatures.SPRUCE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree3", BYGFeatures.SPRUCE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree4", BYGFeatures.SPRUCE_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE_MEDIUM1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE_MEDIUM2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE_MEDIUM3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE_MEDIUM4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_RED_TREE_LARGE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_red_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));

    //Blue Spruce
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree1", BYGFeatures.SPRUCE_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree2", BYGFeatures.SPRUCE_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree3", BYGFeatures.SPRUCE_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree4", BYGFeatures.SPRUCE_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE_MEDIUM1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE_MEDIUM2 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE_MEDIUM3 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE_MEDIUM4 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> SPRUCE_BLUE_TREE_LARGE1 = WorldGenRegistrationHelper.createConfiguredFeature("spruce_blue_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.withConfiguration(new BYGTreeFeatureConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> TROPICAL_SHRUB1 = WorldGenRegistrationHelper.createConfiguredFeature("tropical_shrub1", BYGFeatures.SHRUB1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMinHeight(2).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAHOGANY_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("mahogany_tree1", BYGFeatures.MAHOGANY_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAHOGANY_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("mahogany_tree2", BYGFeatures.MAHOGANY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(14).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAHOGANY_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("mahogany_tree3", BYGFeatures.MAHOGANY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAHOGANY_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("mahogany_tree4", BYGFeatures.MAHOGANY_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(24).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> MAHOGANY_TREE5 = WorldGenRegistrationHelper.createConfiguredFeature("mahogany_tree5", BYGFeatures.MAHOGANY_TREE5.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(31).setMinHeight(25).build()));


    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WOODLANDS_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("woodlands_tree1", BYGFeatures.WOODLANDS_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(5).setMinHeight(25).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_DEAD_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("dead_willow_tree1", BYGFeatures.WILLOW_DEAD_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_M_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("mutated_willow_tree1", BYGFeatures.WILLOW_M_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(11).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_M_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("mutated_willow_tree2", BYGFeatures.WILLOW_M_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("willow_tree1", BYGFeatures.WILLOW_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(14).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("willow_tree2", BYGFeatures.WILLOW_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("willow_tree3", BYGFeatures.WILLOW_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WILLOW_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("willow_tree4", BYGFeatures.WILLOW_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(21).setMinHeight(13).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ZELKOVA_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("zelkova_tree1", BYGFeatures.ZELKOVA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.ZELKOVA_LEAVES).setMaxHeight(20).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ZELKOVA_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("zelkova_tree2", BYGFeatures.ZELKOVA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.ZELKOVA_LEAVES).setMaxHeight(28).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ZELKOVA_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("zelkova_tree3", BYGFeatures.ZELKOVA_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.ZELKOVA_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ZELKOVA_BROWN_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("zelkova_brown_tree1", BYGFeatures.ZELKOVA_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.BROWN_ZELKOVA_LEAVES).setMaxHeight(21).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ZELKOVA_BROWN_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("zelkova_brown_tree2", BYGFeatures.ZELKOVA_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.BROWN_ZELKOVA_LEAVES).setMaxHeight(20).setMinHeight(10).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> ZELKOVA_BROWN_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("zelkova_brown_tree3", BYGFeatures.ZELKOVA_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.BROWN_ZELKOVA_LEAVES).setMaxHeight(30).setMinHeight(22).build()));


    //Vanilla Tree Features
    public static final ConfiguredFeature<?, ?> MC_TROPICAL_GROUND_BUSH = WorldGenRegistrationHelper.createConfiguredFeature("mc_tropical_ground_bush", Feature.TREE.withConfiguration(FeatureConfigs.TROPGROUNDBUSH_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_MEGA_TROPICAL_GROUND_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_mega_tropical_jungle_tree", Feature.TREE.withConfiguration(FeatureConfigs.MEGATROPJUNGLETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BLUE_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_blue_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.BLUEPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BLUE_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_blue_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.BLUESPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_RED_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_red_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.REDPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_RED_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_red_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.REDSPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_YELLOW_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_yellow_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.YELLOWPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_YELLOW_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_yellow_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.YELLOWSPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_ORANGE_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_orange_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.ORANGEPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_ORANGE_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_orange_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.ORANGESPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BLUE_MEGA_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_blue_mega_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.BLUEMEGASPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BLUE_MEGA_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_blue_mega_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.BLUEMEGAPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_RED_MEGA_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_red_mega_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.REDMEGASPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_RED_MEGA_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_red_mega_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.REDMEGAPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_YELLOW_MEGA_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_yellow_mega_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.YELLOWMEGASPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_YELLOW_MEGA_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_yellow_mega_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.YELLOWMEGAPINETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_ORANGE_MEGA_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_orange_mega_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.ORANGEMEGASPRUCETREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_ORANGE_MEGA_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_orange_mega_pine_tree", Feature.TREE.withConfiguration(FeatureConfigs.ORANGEMEGAPINETREE_CONFIG));

    public static final ConfiguredFeature<?, ?> MC_BIRCH_RED_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_red_birch", Feature.TREE.withConfiguration(FeatureConfigs.REDBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_TALL_RED_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_tall_red_birch", Feature.TREE.withConfiguration(FeatureConfigs.TALLREDBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_BROWN_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_brown_birch", Feature.TREE.withConfiguration(FeatureConfigs.BROWNBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_TALL_BROWN_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_tall_brown_birch", Feature.TREE.withConfiguration(FeatureConfigs.TALLBROWNBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_ORANGE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_orange_birch", Feature.TREE.withConfiguration(FeatureConfigs.ORANGEBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_TALL_ORANGE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_tall_orange_birch", Feature.TREE.withConfiguration(FeatureConfigs.TALLORANGEBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_YELLOW_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_yellow_birch", Feature.TREE.withConfiguration(FeatureConfigs.YELLOWBIRCHTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_BIRCH_TALL_YELLOW_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_tall_yellow_birch", Feature.TREE.withConfiguration(FeatureConfigs.TALLYELLOWBIRCHTREE_CONFIG));

    public static final ConfiguredFeature<?, ?> MC_BROWN_OAK_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_brown_oak_tree", Feature.TREE.withConfiguration(FeatureConfigs.BROWNOAKTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_ORANGE_OAK_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_orange_oak_tree", Feature.TREE.withConfiguration(FeatureConfigs.ORANGEOAKTREE_CONFIG));
    public static final ConfiguredFeature<?, ?> MC_RED_OAK_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_red_oak_tree", Feature.TREE.withConfiguration(FeatureConfigs.REDOAKTREE_CONFIG));

    public static final ConfiguredFeature<?, ?> MC_DOVER_MEGA_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("mc_dover_mega_spruce_tree", Feature.TREE.withConfiguration(FeatureConfigs.DOVERMEGASPRUCETREE_CONFIG));

    public static final ConfiguredFeature<?, ?> MC_FANCY_RED_OAK_WITH_MORE_BEEHIVES = WorldGenRegistrationHelper.createConfiguredFeature("mc_fancy_red_oak_with_more_beehives_tree", Feature.TREE.withConfiguration(FeatureConfigs.FANCY_RED_OAK_WITH_MORE_BEEHIVES_CONFIG));

    //Mushrooms
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> GREEN_MUSHROOM_HUGE = WorldGenRegistrationHelper.createConfiguredFeature("huge_green_mushroom", BYGFeatures.GREEN_MUSHROOM_HUGE.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.WHITE_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.GREEN_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> WOOD_BLEWIT_HUGE = WorldGenRegistrationHelper.createConfiguredFeature("huge_wood_blewit", BYGFeatures.WOOD_BLEWIT_HUGE.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.BLEWIT_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> WEEPING_MILKCAP_HUGE = WorldGenRegistrationHelper.createConfiguredFeature("huge_weeping_milkcap", BYGFeatures.WEEPING_MILKCAP_HUGE.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.MILKCAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> BLACK_PUFF_HUGE = WorldGenRegistrationHelper.createConfiguredFeature("huge_black_puff", BYGFeatures.BLACK_PUFF_HUGE.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.PUFF_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> BLUE_GLOWSHROOM_HUGE = WorldGenRegistrationHelper.createConfiguredFeature("huge_blue_glowshroom", BYGFeatures.BLUE_GLOWSHROOM_HUGE.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.YELLOW_GLOWSHROOM_STEM).setMushroomBlock(BYGBlocks.BLUE_GLOWSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> PURPLE_GLOWSHROOM_HUGE = WorldGenRegistrationHelper.createConfiguredFeature("huge_purple_glowshroom", BYGFeatures.PURPLE_GLOWSHROOM_HUGE.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.RED_GLOWSHROOM_STEM).setMushroomBlock(BYGBlocks.PURPLE_GLOWSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    //Mini Mushrooms
    public static final ConfiguredFeature<?, ?> GREEN_MUSHROOM_MINI = WorldGenRegistrationHelper.createConfiguredFeature("mini_green_mushroom", BYGFeatures.MINI_GREEN_MUSHROOM.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.WHITE_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.GREEN_MUSHROOM_BLOCK).setMinHeight(3).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> WOOD_BLEWIT_MINI = WorldGenRegistrationHelper.createConfiguredFeature("mini_wood_blewit", BYGFeatures.MINI_WOOD_BLEWIT.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.BLEWIT_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> WEEPING_MILKCAP_MINI = WorldGenRegistrationHelper.createConfiguredFeature("mini_weeping_milkcap", BYGFeatures.MINI_WEEPING_MILKCAP.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.MILKCAP_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> BLACK_PUFF_MINI = WorldGenRegistrationHelper.createConfiguredFeature("mini_black_puff", BYGFeatures.MINI_BLACK_PUFF.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.PUFF_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> RED_MUSHROOM_MINI = WorldGenRegistrationHelper.createConfiguredFeature("mini_red_mushroom", BYGFeatures.MINI_RED_MUSHROOM.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(Blocks.RED_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> BROWN_MUSHROOM_MINI = WorldGenRegistrationHelper.createConfiguredFeature("mini_brown_mushroom", BYGFeatures.MINI_BROWN_MUSHROOM.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(Blocks.BROWN_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));


    //Nether Mushrooms
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> EMBUR_MUSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("embur_mushroom1", BYGFeatures.EMBUR_MUSHROOM.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.EMBUR_PEDU).setMushroomBlock(BYGBlocks.EMBUR_GEL_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> EMBUR_MUSHROOM2 = WorldGenRegistrationHelper.createConfiguredFeature("embur_mushroom2", BYGFeatures.EMBUR_MUSHROOM2.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.EMBUR_PEDU).setMushroomBlock(BYGBlocks.EMBUR_GEL_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> CRIMSON_FUNGUS1 = WorldGenRegistrationHelper.createConfiguredFeature("crimson_fungus1", BYGFeatures.CRIMSON_FUNGUS_TREE1.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.CRIMSON_STEM).setMushroomBlock(Blocks.NETHER_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> CRIMSON_FUNGUS2 = WorldGenRegistrationHelper.createConfiguredFeature("crimson_fungus2", BYGFeatures.CRIMSON_FUNGUS_TREE2.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.CRIMSON_STEM).setMushroomBlock(Blocks.NETHER_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> WARPED_FUNGUS1 = WorldGenRegistrationHelper.createConfiguredFeature("warped_fungus1", BYGFeatures.WARPED_FUNGUS_TREE1.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.WARPED_STEM).setMushroomBlock(Blocks.WARPED_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> WARPED_FUNGUS2 = WorldGenRegistrationHelper.createConfiguredFeature("warped_fungus2", BYGFeatures.WARPED_FUNGUS_TREE2.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.WARPED_STEM).setMushroomBlock(Blocks.WARPED_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SYTHIAN_FUNGUS_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("sythian_fungus_tree1", BYGFeatures.SYTHIAN_FUNGUS_TREE1.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SYTHIAN_FUNGUS_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("sythian_fungus_tree2", BYGFeatures.SYTHIAN_FUNGUS_TREE2.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SYTHIAN_FUNGUS_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("sythian_fungus_tree3", BYGFeatures.SYTHIAN_FUNGUS_TREE3.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SYTHIAN_FUNGUS_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("sythian_fungus_tree4", BYGFeatures.SYTHIAN_FUNGUS_TREE4.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SOUL_SHROOM_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("soul_shroom_tree1", BYGFeatures.SOUL_SHROOM_TREE1.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SOUL_SHROOM_STEM).setMushroomBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SOUL_SHROOM_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("soul_shroom_tree2", BYGFeatures.SOUL_SHROOM_TREE2.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SOUL_SHROOM_STEM).setMushroomBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> SOUL_SHROOM_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("soul_shroom_tree3", BYGFeatures.SOUL_SHROOM_TREE3.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(BYGBlocks.SOUL_SHROOM_STEM).setMushroomBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> DEATH_CAP_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("death_cap_tree1", BYGFeatures.DEATH_CAP_TREE1.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> DEATH_CAP_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("death_cap_tree2", BYGFeatures.DEATH_CAP_TREE2.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomFeatureConfig, ?> DEATH_CAP_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("death_cap_tree3", BYGFeatures.DEATH_CAP_TREE3.withConfiguration(new BYGMushroomFeatureConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    //Nether Trees
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> LAMENT_TWISTY_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("lament_twisty_tree1", BYGFeatures.LAMENT_TWISTY_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> LAMENT_TWISTY_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("lament_twisty_tree2", BYGFeatures.LAMENT_TWISTY_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> LAMENT_TWISTY_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("lament_twisty_tree3", BYGFeatures.LAMENT_TWISTY_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> LAMENT_WEEPING_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("lament_weeping_tree1", BYGFeatures.LAMENT_WEEPING_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> LAMENT_WEEPING_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("lament_weeping_tree2", BYGFeatures.LAMENT_WEEPING_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> LAMENT_WEEPING_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("lament_weeping_tree3", BYGFeatures.LAMENT_WEEPING_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WITHERING_OAK_TREE1 = WorldGenRegistrationHelper.createConfiguredFeature("withering_oak_tree1", BYGFeatures.WITHERING_OAK_TREE1.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WITHERING_OAK_TREE2 = WorldGenRegistrationHelper.createConfiguredFeature("withering_oak_tree2", BYGFeatures.WITHERING_OAK_TREE2.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WITHERING_OAK_TREE3 = WorldGenRegistrationHelper.createConfiguredFeature("withering_oak_tree3", BYGFeatures.WITHERING_OAK_TREE3.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeFeatureConfig, ?> WITHERING_OAK_TREE4 = WorldGenRegistrationHelper.createConfiguredFeature("withering_oak_tree4", BYGFeatures.WITHERING_OAK_TREE4.withConfiguration(new BYGTreeFeatureConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));


    /***********************************************************Random Selectors***********************************************************/

    public static final ConfiguredFeature<?, ?> RANDOM_ANCIENT_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_ancient_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.DARK_OAK.withChance(0.3F),
            ANCIENT_TREE1.withChance(0.20F),
            ANCIENT_TREE2.withChance(0.20F)),
            ANCIENT_TREE3)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(16, 0.4F, 8))));

    public static final ConfiguredFeature<?, ?> RANDOM_BAYOU_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_bayou_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WILLOW_DEAD_TREE1.withChance(0.1F),
            WILLOW_TREE1.withChance(0.25F),
            WILLOW_TREE2.withChance(0.25F),
            WILLOW_TREE3.withChance(0.25F)),
            WILLOW_TREE4)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(
            new AtSurfaceWithExtraConfig(8, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CORAL_MANGROVE = WorldGenRegistrationHelper.createConfiguredFeature("rs_mg_coral", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Feature.CORAL_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.25F),
            Feature.CORAL_MUSHROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.25F)),
            Feature.CORAL_CLAW.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(
            new AtSurfaceWithExtraConfig(25, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLUFF_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_bluff_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE1.withChance(0.05F),
            PINE_TREE2.withChance(0.05F),
            BLUFF_TREE1.withChance(0.3F),
            BLUFF_TREE2.withChance(0.3F),
            BLUFF_TREE3.withChance(0.25F)),
            CONIFER_TREE6)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(12, 0.3F, -4))));

    public static final ConfiguredFeature<?, ?> RANDOM_BOREAL_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_boreal", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_YELLOW_BOREAL_TREE1.withChance(0.3F),
            BIRCH_BOREAL_TREE1.withChance(0.3F)),
            BOREAL_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(20, 0.5F, -4))));

    public static final ConfiguredFeature<?, ?> RANDOM_BOREAL_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_boreal", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_YELLOW_BOREAL_TREE1.withChance(0.3F),
            BIRCH_BOREAL_TREE1.withChance(0.3F)),
            BOREAL_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLACK_FOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_black_forest", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_TREE3.withChance(0.05F),
            ASPEN_TREE2.withChance(0.05F),
            CONIFER_TREE6.withChance(0.05F),
            CONIFER_TREE7.withChance(0.05F),
            PINE_LARGE_TREE1.withChance(0.5F),
            PINE_LARGE_TREE2.withChance(0.5F),
            PINE_TREE1.withChance(0.5F)),
            PINE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(30, 0.4F, -5))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLACK_FOREST_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_black_forest", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_LARGE_TREE1.withChance(0.45F),
            PINE_LARGE_TREE2.withChance(0.45F),
            PINE_TREE1.withChance(0.4F)),
            PINE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CIKA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_cika_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CIKA_TREE2.withChance(0.2F),
            CIKA_TREE3.withChance(0.1F)),
            CIKA_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_CONIFER_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_conifer_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CONIFER_TREE1.withChance(0.06F),
            CONIFER_TREE2.withChance(0.5F),
            CONIFER_TREE3.withChance(0.04F),
            CONIFER_TREE4.withChance(0.2F),
            CONIFER_TREE5.withChance(0.2F),
            CONIFER_TREE6.withChance(0.2F),
            CONIFER_TREE7.withChance(0.1F)),
            CONIFER_TREE8)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(30, 0.4F, 10))));

    public static final ConfiguredFeature<?, ?> RANDOM_CONIFER_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_conifer_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CONIFER_TREE1.withChance(0.06F),
            CONIFER_TREE2.withChance(0.5F),
            CONIFER_TREE3.withChance(0.04F),
            CONIFER_TREE4.withChance(0.2F),
            CONIFER_TREE5.withChance(0.2F),
            CONIFER_TREE6.withChance(0.2F),
            CONIFER_TREE7.withChance(0.1F)),
            CONIFER_TREE8)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CRAG_GARDEN_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_crag_garden_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_TREE1.withChance(0.2F),
            RAINBOW_TREE1.withChance(0.2F),
            Features.BAMBOO.withChance(0.05F),
            RAINBOW_LARGE_TREE1.withChance(0.1F)),
            MAHOGANY_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(30, 0.4F, 8))));

    public static final ConfiguredFeature<?, ?> RANDOM_CYPRESS_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_cypress_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CYPRESS_TREE1.withChance(0.5F),
            CYPRESS_TREE2.withChance(0.4F)),
            CYPRESS_TREE3)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(
            new AtSurfaceWithExtraConfig(5, 0.4F, 1))));

    public static ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_deciduous_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_TREE1.withChance(0.25F),
            DECIDUOUS_TREE2.withChance(0.25F),
            DECIDUOUS_TREE3.withChance(0.25F)),
            DECIDUOUS_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 3))));

    public static ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_RED_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_deciduous_red_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_RED_TREE1.withChance(0.25F),
            DECIDUOUS_RED_TREE2.withChance(0.25F),
            DECIDUOUS_RED_TREE3.withChance(0.25F)),
            DECIDUOUS_RED_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_ORANGE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_deciduous_orange_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_ORANGE_TREE1.withChance(0.25F),
            DECIDUOUS_ORANGE_TREE2.withChance(0.25F),
            DECIDUOUS_ORANGE_TREE3.withChance(0.25F)),
            DECIDUOUS_ORANGE_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_BROWN_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_deciduous_brown_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_BROWN_TREE1.withChance(0.25F),
            DECIDUOUS_BROWN_TREE2.withChance(0.25F),
            DECIDUOUS_BROWN_TREE3.withChance(0.25F)),
            DECIDUOUS_BROWN_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_deciduous_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_TREE1.withChance(0.25F),
            DECIDUOUS_TREE2.withChance(0.25F),
            DECIDUOUS_TREE3.withChance(0.25F)),
            DECIDUOUS_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DOVER_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_dover_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_LARGE_TREE1.withChance(0.25F),
            PINE_LARGE_TREE2.withChance(0.25F)),
            SPRUCE_TREE_LARGE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_EUCALYPTUS_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_eucalyptus_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_TREE1.withChance(0.1F)),
            RAINBOW_LARGE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(8, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_JACARANDA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_jacaranda", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            JACARANDA_TREE2.withChance(0.3F),
            INDIGO_JACARANDA_TREE2.withChance(0.3F),
            INDIGO_JACARANDA_TREE1.withChance(0.3F)),
            JACARANDA_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(25, 0.1F, -5))));

    public static final ConfiguredFeature<?, ?> RANDOM_JACARANDA_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_jacaranda", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            INDIGO_JACARANDA_TREE1.withChance(0.3F)),
            JACARANDA_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MAPLE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_maple", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MAPLE_RED_TREE1.withChance(0.4F),
            MAPLE_RED_TREE2.withChance(0.03F),
            MAPLE_SILVER_TREE1.withChance(0.2F),
            MAPLE_SILVER_TREE2.withChance(0.1F)),
            MAPLE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(5, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MAPLE_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_maple", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MAPLE_TREE1.withChance(0.06F),
            MAPLE_RED_TREE1.withChance(0.5F),
            MAPLE_TREE1.withChance(0.04F),
            MAPLE_SILVER_TREE1.withChance(0.2F),
            MAPLE_SILVER_TREE2.withChance(0.1F)),
            MAPLE_RED_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_NORTHERN_FOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_northern_forest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE1.withChance(0.5F)),
            PINE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PRAIRIE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_prairie_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_PRAIRIE1.withChance(0.4F),
            SHRUB_PRAIRIE2.withChance(0.4F),
            Features.FANCY_OAK_BEES_002.withChance(0.1F)),
            Features.FANCY_OAK)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_REDWOOD_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_redwood_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            REDWOOD_TREE1.withChance(0.55F),
            REDWOOD_TREE2.withChance(0.1F)),
            REDWOOD_TREE3)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(5, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_REDWOOD_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_redwood_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            REDWOOD_TREE1.withChance(0.55F),
            REDWOOD_TREE2.withChance(0.1F)),
            REDWOOD_TREE3)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_SHRUB = WorldGenRegistrationHelper.createConfiguredFeature("rs_seasonal_shrub", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB.withChance(0.4F)),
            DECIDUOUS_SEASONAL_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(5, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_DECIDUOUS_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_seasonal_deciduous_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_RED_TREE1.withChance(0.2F),
            DECIDUOUS_ORANGE_TREE1.withChance(0.2F),
            DECIDUOUS_SEASONAL_SHRUB.withChance(0.2F),
            DECIDUOUS_BROWN_TREE1.withChance(0.2F)),
            DECIDUOUS_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_TAIGA_MISC_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_seasonal_taiga_misc_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE1.withChance(0.25F),
            PINE_TREE2.withChance(0.25F),
            ASPEN_TREE2.withChance(0.25F)),
            ASPEN_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_SEASONAL_TREE_GIANT = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_seasonal_tree_giant", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_RED_TREE_LARGE1.withChance(0.25F),
            SPRUCE_ORANGE_TREE_LARGE1.withChance(0.25F),
            SPRUCE_YELLOW_TREE_LARGE1.withChance(0.25F)),
            SPRUCE_TREE_LARGE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_TREE1.withChance(0.06F),
            SPRUCE_TREE2.withChance(0.5F),
            SPRUCE_TREE3.withChance(0.04F),
            SPRUCE_TREE4.withChance(0.2F),
            SPRUCE_TREE_MEDIUM1.withChance(0.2F),
            SPRUCE_TREE_MEDIUM2.withChance(0.2F),
            SPRUCE_TREE_MEDIUM3.withChance(0.2F),
            SPRUCE_TREE_MEDIUM4.withChance(0.1F)),
            SPRUCE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_YELLOW_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_yellow_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_YELLOW_TREE1.withChance(0.06F),
            SPRUCE_YELLOW_TREE2.withChance(0.5F),
            SPRUCE_YELLOW_TREE3.withChance(0.04F),
            SPRUCE_YELLOW_TREE4.withChance(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM1.withChance(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM2.withChance(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM3.withChance(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM4.withChance(0.1F)),
            SPRUCE_YELLOW_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_ORANGE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_orange_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_ORANGE_TREE1.withChance(0.06F),
            SPRUCE_ORANGE_TREE2.withChance(0.5F),
            SPRUCE_ORANGE_TREE3.withChance(0.04F),
            SPRUCE_ORANGE_TREE4.withChance(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM1.withChance(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM2.withChance(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM3.withChance(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM4.withChance(0.1F)),
            SPRUCE_ORANGE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_RED_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_red_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_RED_TREE1.withChance(0.06F),
            SPRUCE_RED_TREE2.withChance(0.5F),
            SPRUCE_RED_TREE3.withChance(0.04F),
            SPRUCE_RED_TREE4.withChance(0.2F),
            SPRUCE_RED_TREE_MEDIUM1.withChance(0.2F),
            SPRUCE_RED_TREE_MEDIUM2.withChance(0.2F),
            SPRUCE_RED_TREE_MEDIUM3.withChance(0.2F),
            SPRUCE_RED_TREE_MEDIUM4.withChance(0.1F)),
            SPRUCE_RED_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_BLUE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_blue_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_BLUE_TREE1.withChance(0.06F),
            SPRUCE_BLUE_TREE2.withChance(0.5F),
            SPRUCE_BLUE_TREE3.withChance(0.04F),
            SPRUCE_BLUE_TREE4.withChance(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM1.withChance(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM2.withChance(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM3.withChance(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM4.withChance(0.1F)),
            SPRUCE_BLUE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_BLUE_TREE_GIANT = WorldGenRegistrationHelper.createConfiguredFeature("rs_spruce_blue_tree_giant", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_BLUE_TREE_LARGE1.withChance(0.5F)),
            SPRUCE_TREE_LARGE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_RAINFOREST_FUNGAL_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_fungal_rainforest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_LARGE_TREE1.withChance(0.1F),
            RAINBOW_TREE1.withChance(0.1F),
            MAHOGANY_TREE5.withChance(0.1F),
            TROPICAL_SHRUB1.withChance(0.1F),
            MAHOGANY_TREE2.withChance(0.2F),
            MAHOGANY_TREE3.withChance(0.2F),
            MAHOGANY_TREE4.withChance(0.15F)),
            MAHOGANY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(35, 0.1F, 10))));

    public static final ConfiguredFeature<?, ?> RANDOM_RAINFOREST_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_rainforest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_LARGE_TREE1.withChance(0.1F),
            RAINBOW_TREE1.withChance(0.1F),
            MAHOGANY_TREE5.withChance(0.1F),
            TROPICAL_SHRUB1.withChance(0.1F),
            MAHOGANY_TREE2.withChance(0.2F),
            MAHOGANY_TREE3.withChance(0.2F),
            MAHOGANY_TREE4.withChance(0.15F)),
            MAHOGANY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_RAINFOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_rainforest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_LARGE_TREE1.withChance(0.1F),
            RAINBOW_TREE1.withChance(0.1F),
            MAHOGANY_TREE5.withChance(0.1F),
            TROPICAL_SHRUB1.withChance(0.1F),
            MAHOGANY_TREE2.withChance(0.2F),
            MAHOGANY_TREE3.withChance(0.2F),
            MAHOGANY_TREE4.withChance(0.15F)),
            MAHOGANY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(45, 0.1F, 10))));

    public static final ConfiguredFeature<?, ?> RANDOM_STONE_FOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_stone_forest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EBONY_TREE1.withChance(0.1F),
            EBONY_TREE2.withChance(0.1F),
            Features.JUNGLE_BUSH.withChance(0.1F),
            DECIDUOUS_TREE1.withChance(0.1F)),
            DECIDUOUS_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(30, 0.3F, 8))));

    public static final ConfiguredFeature<?, ?> RANDOM_SKYRIS_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_skyris_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SKYRIS_TREE1.withChance(0.15F),
            SKYRIS_TREE5.withChance(0.25F),
            SKYRIS_TREE2.withChance(0.15F),
            SKYRIS_TREE3.withChance(0.25F)),
            SKYRIS_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(8, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BAOBAB_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_baobab_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.ACACIA.withChance(0.1F)),
            BAOBAB_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.3F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_ARAUCARIA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_araucaria_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ARAUCARIA_TREE2.withChance(0.5F)),
            ARAUCARIA_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ARAUCARIA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_araucaria_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ARAUCARIA_TREE2.withChance(0.5F)),
            ARAUCARIA_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_BROWN_ZELKOVA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_brown_zelkova_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ZELKOVA_BROWN_TREE3.withChance(0.35F),
            ZELKOVA_BROWN_TREE2.withChance(0.35F)),
            ZELKOVA_BROWN_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MEADOW_SHRUB = WorldGenRegistrationHelper.createConfiguredFeature("rs_meadow_shrub", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_MEADOW.withChance(0.1F)),
            SHRUB_PRAIRIE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MEADOW_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_meadow_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MEADOW_TREE1.withChance(0.2F),
            MEADOW_TREE2.withChance(0.1F)),
            MEADOW_TREE3)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(3, 0.5F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_GROVE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_grove_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_YELLOW_BOREAL_TREE1.withChance(0.5F)),
            BIRCH_BOREAL_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ENCHANTED_GROVE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_enchanted_grove_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ENCHANTED_BLUE_GROVE_TREE1.withChance(0.5F)),
            ENCHANTED_GREEN_GROVE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_MARSH_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_marsh_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_PRAIRIE2.withChance(0.2F),
            SHRUB_PRAIRIE1.withChance(0.1F)),
            Features.SWAMP_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(3, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ENCHANTED_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_enchanted_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ENCHANTED_BLUE_TREE2.withChance(0.2F),
            ENCHANTED_BLUE_TREE3.withChance(0.2F),
            ENCHANTED_GREEN_TREE1.withChance(0.2F),
            ENCHANTED_GREEN_TREE2.withChance(0.2F),
            ENCHANTED_GREEN_TREE3.withChance(0.1F)),
            ENCHANTED_BLUE_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(20, 0.4F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWSHROOM_BAYOU_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_glowshroom_bayou_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WILLOW_DEAD_TREE1.withChance(0.2F),
            WILLOW_M_TREE1.withChance(0.2F),
            WILLOW_M_TREE2.withChance(0.2F),
            WILLOW_TREE3.withChance(0.2F),
            WILLOW_TREE4.withChance(0.2F),
            WILLOW_TREE2.withChance(0.1F)),
            WILLOW_TREE1)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(
            new AtSurfaceWithExtraConfig(8, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_ASPEN_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_aspen_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_TREE2.withChance(0.50F),
            ASPEN_TREE3.withChance(0.25F)),
            ASPEN_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(20, 0.5F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_ASPEN_SHRUB = WorldGenRegistrationHelper.createConfiguredFeature("rs_aspen_shrub", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_SHRUB1.withChance(0.1F)),
            ASPEN_SHRUB2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ASPEN_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_aspen_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_TREE2.withChance(0.2F),
            ASPEN_TREE3.withChance(0.1F)),
            ASPEN_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ZELKOVA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_zelkova_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ZELKOVA_TREE2.withChance(0.2F),
            ZELKOVA_TREE3.withChance(0.1F)),
            ZELKOVA_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(20, 0.4F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ZELKOVA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_zelkova_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ZELKOVA_TREE2.withChance(0.2F),
            ZELKOVA_TREE3.withChance(0.1F)),
            ZELKOVA_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PALO_VERDE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_palo_verde_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PALO_VERDE_TREE1.withChance(0.5F)),
            PALO_VERDE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.4F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_JOSHUA_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_joshua_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            JOSHUA_TREE1.withChance(0.5F)),
            JOSHUA_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SHRUB = WorldGenRegistrationHelper.createConfiguredFeature("rs_shrub", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_PRAIRIE1.withChance(0.1F)),
            SHRUB_PRAIRIE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SHRUBLAND = WorldGenRegistrationHelper.createConfiguredFeature("rs_shrubland", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB.withChance(0.1F)),
            SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PALM_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_palm_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PALM_TREE4.withChance(0.05F),
            PALM_TREE3.withChance(0.35F),
            PALM_TREE2.withChance(0.35F)),
            PALM_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CHERRY_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_cherry_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CHERRY_PINK_TREE1.withChance(0.2F),
            CHERRY_PINK_TREE2.withChance(0.2F),
            CHERRY_WHITE_TREE1.withChance(0.1F)),
            CHERRY_WHITE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(14, 0.4F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_CHERRY_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_cherry_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            CHERRY_PINK_TREE1.withChance(0.2F),
            CHERRY_PINK_TREE2.withChance(0.2F),
            CHERRY_WHITE_TREE1.withChance(0.1F)),
            CHERRY_WHITE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WITCH_HAZEL_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_witch_hazel_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEAD_HAZEL_TREE1.withChance(0.2F),
            DEAD_HAZEL_TREE2.withChance(0.2F),
            DEAD_HAZEL_TREE3.withChance(0.1F)),
            DEAD_HAZEL_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(14, 0.3F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_WITCH_HAZEL_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_witch_hazel_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEAD_HAZEL_TREE1.withChance(0.2F),
            DEAD_HAZEL_TREE2.withChance(0.2F),
            DEAD_HAZEL_TREE3.withChance(0.1F)),
            DEAD_HAZEL_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_EBONY_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_ebony_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EBONY_TREE1.withChance(0.2F),
            EBONY_TREE2.withChance(0.2F),
            EBONY_BUSH1.withChance(0.1F)),
            EBONY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(10, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_HOLLY_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_holly_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            HOLLY_TREE1.withChance(0.2F),
            HOLLY_TREE2.withChance(0.2F),
            HOLLY_TREE3.withChance(0.1F)),
            HOLLY_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(25, 0.4F, 5))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_HOLLY_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_holly_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            HOLLY_TREE1.withChance(0.2F),
            HOLLY_TREE2.withChance(0.2F),
            HOLLY_TREE3.withChance(0.1F)),
            HOLLY_TREE4)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MANGROVE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_mangrove_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MANGROVE_TREE1.withChance(0.2F),
            MANGROVE_TREE2.withChance(0.2F),
            MANGROVE_TREE3.withChance(0.2F),
            MANGROVE_TREE4.withChance(0.1F)),
            MANGROVE_TREE5)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(
            new AtSurfaceWithExtraConfig(15, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MANGROVE_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_mangrove_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            MANGROVE_TREE1.withChance(0.2F),
            MANGROVE_TREE2.withChance(0.2F),
            MANGROVE_TREE3.withChance(0.2F),
            MANGROVE_TREE4.withChance(0.1F)),
            MANGROVE_TREE5)).withPlacement(BYGDecorators.OCEAN_FLOOR.configure(
            new AtSurfaceWithExtraConfig(0, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PINE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_pine_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE2.withChance(0.2F),
            PINE_TREE1.withChance(0.2F),
            PINE_LARGE_TREE1.withChance(0.1F)),
            PINE_LARGE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(20, 0.4F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_ORCHARD_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_orchard_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            ORCHARD_TREE1.withChance(0.3F),
            ORCHARD_TREE2.withChance(0.3F)),
            ORCHARD_TREE3)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WOODLAND_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_woodland_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WOODLANDS_TREE1.withChance(0.1F)),
            WOODLANDS_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(1, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_RED_OAK_FOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_red_oak_forest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.OAK.withChance(0.1F),
            Features.OAK_BEES_002.withChance(0.1F),
            Features.FANCY_OAK_BEES_0002.withChance(0.1F),
            MC_FANCY_RED_OAK_WITH_MORE_BEEHIVES.withChance(0.2F)),
            MC_RED_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(8, 0.3F, 5))));


    public static final ConfiguredFeature<?, ?> RANDOM_RED_OAK_FOREST_SPARSE_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_red_oak_forest_sparse_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.OAK.withChance(0.06F),
            MC_RED_OAK_TREE.withChance(0.1F)),
            MC_FANCY_RED_OAK_WITH_MORE_BEEHIVES)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_BIRCH_FOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_seasonal_birch_forest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_BROWN_TREE1.withChance(0.06F),
            MC_BIRCH_BROWN_TREE.withChance(0.06F),
            MC_BIRCH_TALL_BROWN_TREE.withChance(0.06F),
            BIRCH_ORANGE_TREE1.withChance(0.06F),
            MC_BIRCH_ORANGE_TREE.withChance(0.06F),
            MC_BIRCH_TALL_ORANGE_TREE.withChance(0.06F),
            BIRCH_RED_TREE1.withChance(0.06F),
            MC_BIRCH_RED_TREE.withChance(0.06F),
            MC_BIRCH_TALL_RED_TREE.withChance(0.06F),
            BIRCH_YELLOW_TREE1.withChance(0.06F),
            MC_BIRCH_YELLOW_TREE.withChance(0.1F)),
            MC_BIRCH_TALL_YELLOW_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(15, 0.4F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_FOREST_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_seasonal_forest_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            OAK_BROWN_TREE1.withChance(0.06F),
            OAK_ORANGE_TREE.withChance(0.06F),
            OAK_RED_TREE.withChance(0.06F),
            MC_BROWN_OAK_TREE.withChance(0.06F),
            MC_FANCY_RED_OAK_WITH_MORE_BEEHIVES.withChance(0.06F),
            Features.FANCY_OAK.withChance(0.06F),
            Features.OAK.withChance(0.06F),
            MC_BIRCH_YELLOW_TREE.withChance(0.1F)),
            MC_ORANGE_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(15, 0.4F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_HUGE_GLOWSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("rs_huge_glowshroom", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_GLOWSHROOM_HUGE.withChance(0.1F)),
            PURPLE_GLOWSHROOM_HUGE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(25, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SOUL_SHROOM_TREES = WorldGenRegistrationHelper.createConfiguredFeature("rs_soul_shroom_trees", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SOUL_SHROOM_TREE3.withChance(0.35F),
            SOUL_SHROOM_TREE2.withChance(0.35F)),
            SOUL_SHROOM_TREE1)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(8, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DEATH_CAP_TREES = WorldGenRegistrationHelper.createConfiguredFeature("rs_death_cap_trees", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEATH_CAP_TREE3.withChance(0.35F),
            DEATH_CAP_TREE2.withChance(0.35F)),
            DEATH_CAP_TREE1)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(8, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MINI_MUSHROOMS = WorldGenRegistrationHelper.createConfiguredFeature("rs_mini_mushrooms", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            GREEN_MUSHROOM_MINI.withChance(0.16F),
            RED_MUSHROOM_MINI.withChance(0.16F),
            BROWN_MUSHROOM_MINI.withChance(0.16F),
            WOOD_BLEWIT_MINI.withChance(0.16F),
            WEEPING_MILKCAP_MINI.withChance(0.16F)),
            BLACK_PUFF_MINI)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(7, 0.5F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_HUGE_MUSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("rs_huge_mushroom", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            GREEN_MUSHROOM_HUGE.withChance(0.4F),
            WOOD_BLEWIT_HUGE.withChance(0.4F),
            WEEPING_MILKCAP_HUGE.withChance(0.4F)),
            BLACK_PUFF_HUGE)).withPlacement(Placement.field_242902_f.configure(
            new AtSurfaceWithExtraConfig(10, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_EMBUR_MUSHROOM = WorldGenRegistrationHelper.createConfiguredFeature("rs_embur_mushroom", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_MUSHROOM.withChance(0.5F)),
            EMBUR_MUSHROOM2)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(2, 0.5F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_FUNGUS = WorldGenRegistrationHelper.createConfiguredFeature("rs_fungus", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WARPED_FUNGUS1.withChance(0.15F),
            WARPED_FUNGUS2.withChance(0.15F),
            CRIMSON_FUNGUS1.withChance(0.4F)),
            CRIMSON_FUNGUS2)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(4, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SYTHIAN_FUNGUS = WorldGenRegistrationHelper.createConfiguredFeature("rs_sythian_fungus", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            SYTHIAN_FUNGUS_TREE1.withChance(0.25F),
            SYTHIAN_FUNGUS_TREE2.withChance(0.25F),
            SYTHIAN_FUNGUS_TREE3.withChance(0.25F)),
            SYTHIAN_FUNGUS_TREE4)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(12, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WITHERING_OAK_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_withering_oak_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WITHERING_OAK_TREE4.withChance(0.25F),
            WITHERING_OAK_TREE3.withChance(0.25F),
            WITHERING_OAK_TREE2.withChance(0.25F)),
            WITHERING_OAK_TREE1)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(12, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_WITHERING_OAK_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_sparse_withering_oak_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            WITHERING_OAK_TREE3.withChance(0.25F)),
            WITHERING_OAK_TREE1)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_TWISTY_LAMENT_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_twisty_lament_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            LAMENT_TWISTY_TREE3.withChance(0.35F),
            LAMENT_TWISTY_TREE2.withChance(0.35F)),
            LAMENT_TWISTY_TREE1)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(12, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WEEPING_LAMENT_TREE = WorldGenRegistrationHelper.createConfiguredFeature("rs_weeping_lament_tree", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            LAMENT_WEEPING_TREE3.withChance(0.35F),
            LAMENT_WEEPING_TREE2.withChance(0.35F)),
            LAMENT_WEEPING_TREE1)).withPlacement(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configure(
            new AtSurfaceWithExtraConfig(8, 0.5F, 2))));


    //TODO: Remove these fields and in line them instead.
    public static class FeatureConfigs {
        public static final BlockClusterFeatureConfig TALL_ALLIUM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_ALLIUM.getDefaultState()), new DoublePlantBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig TALL_PINK_ALLIUM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_PINK_ALLIUM.getDefaultState()), new DoublePlantBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();

        public static final BlockClusterFeatureConfig PINKALLIUMBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ALLIUMBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig AMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PURPLEAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ORANGEAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ORANGE_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig MAGENTAAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.MAGENTA_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig CYANAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CYAN_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig SHORT_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SHORT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(24).build();
        public static final BlockClusterFeatureConfig TALL_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.TALL_GRASS.getDefaultState()), new DoublePlantBlockPlacer())).tries(64).build();
        public static final BlockClusterFeatureConfig SOULFIREONNYLIUM = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SOUL_FIRE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.SOUL_SOIL, BYGBlocks.NYLIUM_SOUL_SOIL, BYGBlocks.BRIMSTONE, BYGBlocks.FROST_MAGMA)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig BORIC_FIRE = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BORIC_FIRE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.BRIMSTONE, BYGBlocks.BRIMSTONE, BYGBlocks.BRIMSTONE, BYGBlocks.FROST_MAGMA)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig MAGMA_FIRE = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.FIRE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MAGMATIC_STONE, Blocks.MAGMA_BLOCK, BYGBlocks.QUARTZITE_SAND)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig SUBZERO_ASH = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SUBZERO_ASH.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.SUBZERO_ASH_BLOCK, BYGBlocks.FROST_MAGMA)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig SUBZERO_ASH_BLOCK = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SUBZERO_ASH_BLOCK.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.SUBZERO_ASH_BLOCK, BYGBlocks.FROST_MAGMA)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig QUARTZ_CRYSTAL_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.QUARTZ_CRYSTAL.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).whitelist(ImmutableSet.of(BYGBlocks.QUARTZITE_SAND, BYGBlocks.RAW_QUARTZ_BLOCK)).func_227317_b_().build();

        public static final BlockClusterFeatureConfig MINI_CACTUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.MINI_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(4).build();
        public static final BlockClusterFeatureConfig HORSEWEED_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.HORSEWEED.getDefaultState()), new SimpleBlockPlacer())).tries(4).build();
        public static final BlockClusterFeatureConfig TINY_LILYPAD_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TINY_LILYPADS.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig WATER_SILK_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WATER_SILK.getDefaultState()), new SimpleBlockPlacer())).tries(128).build();
        public static final BlockClusterFeatureConfig WINTER_SUCCULENT_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_SUCCULENT.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig BEACH_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BEACH_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(20).build();
        public static final BlockClusterFeatureConfig SHORT_BEACH_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SHORT_BEACH_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(20).build();
        public static final BlockClusterFeatureConfig WILTED_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WILTED_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
        public static final BlockClusterFeatureConfig LEAF_PILE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.LEAF_PILE.getDefaultState()), new SimpleBlockPlacer())).tries(14).build();
        public static final BlockClusterFeatureConfig WEED_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WEED_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WINTER_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
        public static final BlockClusterFeatureConfig CALIFORNIA_POPPY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CALIFORNIA_POPPY.getDefaultState()), new SimpleBlockPlacer())).tries(10).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig BLACK_PUFF_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLACK_PUFF.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WEEPING_MILKCAP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WEEPING_MILKCAP.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WOOD_BLEWIT_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WOOD_BLEWIT.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).func_227317_b_().build();
        public static final BlockClusterFeatureConfig GREEN_MUSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GREEN_MUSHROOM.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).func_227317_b_().build();
        public static final BlockClusterFeatureConfig BEGONIA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BEGONIA.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig BISTORT_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BISTORT.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig GUZMANIA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GUZMANIA.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig INCAN_LILY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.INCAN_LILY.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig LAZARUS_BELLFLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.LAZARUS_BELLFLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig TORCH_GINGER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TORCH_GINGER.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig RICHEA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RICHEA.getDefaultState()), new SimpleBlockPlacer())).tries(10).build();
        public static final BlockClusterFeatureConfig JAPANESEORCHID_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.JAPANESE_ORCHID.getDefaultState()), new DoublePlantBlockPlacer())).tries(10).func_227317_b_().build();
        public static final BlockClusterFeatureConfig AZALEA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.AZALEA.getDefaultState()), new DoublePlantBlockPlacer())).tries(48).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PRAIRIEGRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PRAIRIE_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig TALLPRAIRIEGRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_PRAIRIE_GRASS.getDefaultState()), new DoublePlantBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig BLUE_GLOWSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLUE_GLOWSHROOM.getDefaultState()), new SimpleBlockPlacer())).tries(18).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PURPLE_GLOWSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_GLOWSHROOM.getDefaultState()), new SimpleBlockPlacer())).tries(18).func_227317_b_().build();
        public static final BlockClusterFeatureConfig SOUL_SHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SOUL_SHROOM.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).func_227317_b_().build();
        public static final BlockClusterFeatureConfig DEATH_CAP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.DEATH_CAP.getDefaultState()), SimpleBlockPlacer.PLACER)).tries(64).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ROSE_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.ROSE_BUSH.getDefaultState()), new DoublePlantBlockPlacer())).tries(48).func_227317_b_().build();

        public static final BlockClusterFeatureConfig PRICKLY_PEAR_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PRICKLY_PEAR_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(5).build();
        public static final BlockClusterFeatureConfig GOLDEN_SPINED_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GOLDEN_SPINED_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(5).build();


        public static final BlockClusterFeatureConfig PINK_CHERRY_FOLIAGE = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_CHERRY_FOLIAGE.getDefaultState()), new SimpleBlockPlacer())).tries(24).build();
        public static final BlockClusterFeatureConfig WHITE_CHERRY_FOLIAGE = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WHITE_CHERRY_FOLIAGE.getDefaultState()), new SimpleBlockPlacer())).tries(24).build();


        public static final BlockClusterFeatureConfig CLOVER_PATCH = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CLOVER_PATCH.getDefaultState()), new SimpleBlockPlacer())).tries(14).build();
        public static final BlockClusterFeatureConfig FLOWER_PATCH = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FLOWER_PATCH.getDefaultState()), new SimpleBlockPlacer())).tries(14).build();

        public static final BlockClusterFeatureConfig WARPED_CACTUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WARPED_CACTUS.getDefaultState()), new ColumnBlockPlacer(1, 2))).tries(10).func_227317_b_().build();

        //    TropJungle
        public static final BaseTreeFeatureConfig TROPGROUNDBUSH_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.EBONY_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.EBONY_LEAVES.getDefaultState()), new BushFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(1), 2), new StraightTrunkPlacer(1, 0, 0), new TwoLayerFeature(0, 0, 0))).func_236702_a_(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build();
        public static final BaseTreeFeatureConfig MEGATROPJUNGLETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()), new JungleFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 2), new MegaJungleTrunkPlacer(10, 2, 19), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(TrunkVineTreeDecorator.field_236879_b_, LeaveVineTreeDecorator.field_236871_b_)).build();
        //Taiga
        public static final BaseTreeFeatureConfig BLUEPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BLUE_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(3, 1)), new StraightTrunkPlacer(6, 4, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig BLUESPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BLUE_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(0, 2), FeatureSpread.func_242253_a(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig REDPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(3, 1)), new StraightTrunkPlacer(6, 4, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig REDSPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(0, 2), FeatureSpread.func_242253_a(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig YELLOWPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.YELLOW_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(3, 1)), new StraightTrunkPlacer(6, 4, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig YELLOWSPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.YELLOW_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(0, 2), FeatureSpread.func_242253_a(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig ORANGEPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(3, 1)), new StraightTrunkPlacer(6, 4, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig ORANGESPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(0, 2), FeatureSpread.func_242253_a(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig BLUEMEGASPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BLUE_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig BLUEMEGAPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BLUE_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(3, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig REDMEGASPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig REDMEGAPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(3, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig YELLOWMEGASPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.YELLOW_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig YELLOWMEGAPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.YELLOW_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(3, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig ORANGEMEGASPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();
        public static final BaseTreeFeatureConfig ORANGEMEGAPINETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(3, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).build();

        //SeasonalBirch
        public static final BaseTreeFeatureConfig REDBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig TALLREDBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 6), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig BROWNBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BROWN_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig TALLBROWNBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BROWN_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 6), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig ORANGEBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig TALLORANGEBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 6), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig YELLOWBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.YELLOW_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig TALLYELLOWBIRCHTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.YELLOW_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 6), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();

        //Seasonal Oak
        public static final BaseTreeFeatureConfig BROWNOAKTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.BROWN_OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig ORANGEOAKTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.ORANGE_OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        public static final BaseTreeFeatureConfig REDOAKTREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
        //Dover
        public static final BaseTreeFeatureConfig DOVERMEGASPRUCETREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).build();
        //Red Oak
        public static final BaseTreeFeatureConfig FANCY_RED_OAK_WITH_MORE_BEEHIVES_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlocks.RED_OAK_LEAVES.getDefaultState()), new FancyFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(4), 4), new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

        private static final Block GRASS_BLOCK = Blocks.GRASS_BLOCK;
        public static final BlockClusterFeatureConfig BLUEBERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLUEBERRY_BUSH.getDefaultState().with(BlueBerryBush.AGE, Integer.valueOf(3))), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ANGELICA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ANGELICA.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig CROCUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CROCUS.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig IRIS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IRIS.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WHITE_ANEMONE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WHITE_ANEMONE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PINK_ANEMONE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ANEMONE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WINTER_ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(48).whitelist(ImmutableSet.of(Blocks.SNOW_BLOCK, GRASS_BLOCK, Blocks.SNOW)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig SNOWDROPS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SNOWDROPS.getDefaultState()), new SimpleBlockPlacer())).tries(48).whitelist(ImmutableSet.of(Blocks.SNOW_BLOCK, GRASS_BLOCK, Blocks.SNOW)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PINK_ALLIUM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ALLIUM.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ORANGE_DAISY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ORANGE_DAISY.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig RED_CORNFLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RED_CORNFLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WHITE_SAGE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WHITE_SAGE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PURPLE_SAGE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_SAGE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig DELPHINIUM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.DELPHINIUM.getDefaultState()), new DoublePlantBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig FOXGLOVE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FOXGLOVE.getDefaultState()), new DoublePlantBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig YELLOW_DAFFODIL_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.YELLOW_DAFFODIL.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PUMPKIN_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.PUMPKIN.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig ALPINE_BELLFLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ALPINE_BELLFLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig WINTER_SCILLA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_SCILLA.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig KOVAN_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.KOVAN_FLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig FIRECRACKER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FIRECRACKER_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();


        public static final BlockClusterFeatureConfig GREEN_TULIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GREEN_TULIP.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig CYAN_TULIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CYAN_TULIP.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig MAGENTA_TULIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.MAGENTA_TULIP.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PURPLE_TULIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_TULIP.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig YELLOW_TULIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.YELLOW_TULIP.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, GRASS_BLOCK)).func_227317_b_().build();


        public static final BlockClusterFeatureConfig REEDS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.REEDS.getDefaultState()), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().requiresWater().build();
        public static final BlockClusterFeatureConfig CATTAIL_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CATTAIL.getDefaultState()), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().requiresWater().build();

        public static final BlockClusterFeatureConfig RED_GLOWCANE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RED_GLOWCANE.getDefaultState()), new ColumnBlockPlacer(2, 3))).tries(32).xSpread(4).ySpread(0).zSpread(4).func_227317_b_().build();
        public static final BlockClusterFeatureConfig BLUE_GLOWCANE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLUE_GLOWCANE.getDefaultState()), new ColumnBlockPlacer(2, 3))).tries(32).xSpread(4).ySpread(0).zSpread(4).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PURPLE_GLOWCANE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_GLOWCANE.getDefaultState()), new ColumnBlockPlacer(2, 3))).tries(32).xSpread(4).ySpread(0).zSpread(4).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PINK_GLOWCANE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_GLOWCANE.getDefaultState()), new ColumnBlockPlacer(2, 3))).tries(32).xSpread(4).ySpread(0).zSpread(4).func_227317_b_().build();

        public static final BlockClusterFeatureConfig LOLLI_POP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.LOLIPOP_FLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig RED_ORCHID_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RED_ORCHID.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PINK_ORCHID_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ORCHID.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PURPLE_ORCHID_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_ORCHID.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig PEACH_LEATHER_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PEACH_LEATHER_FLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig VIOLET_LEATHER_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.VIOLET_LEATHER_FLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();

        public static final BlockClusterFeatureConfig PINK_DAFFODIL_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_DAFFODIL.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig DAFFODIL_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.DAFFODIL.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig BLACK_ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLACK_ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig CYAN_ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CYAN_ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig OSIRIA_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ORSIRIA_ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();
        public static final BlockClusterFeatureConfig FAIRYSLIPPER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FAIRY_SLIPPER.getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, GRASS_BLOCK)).func_227317_b_().build();

        public static final BlockClusterFeatureConfig IVIS_ROOTS = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IVIS_ROOTS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
        public static final BlockClusterFeatureConfig IVIS_SPROUT = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IVIS_SPROUT.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    }

    public static class SpreadableBlockConfigs {
        public static final BlockStateProvidingFeatureConfig EMBUR_ROOTS = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(BYGBlocks.EMBUR_ROOTS.getDefaultState(), 50).addWeightedBlockstate(BYGBlocks.EMBUR_SPROUTS.getDefaultState(), 35).addWeightedBlockstate(BYGBlocks.EMBUR_WART.getDefaultState(), 11));
        public static final BlockStateProvidingFeatureConfig SYTHIAN_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(BYGBlocks.SYTHIAN_ROOTS.getDefaultState(), 50).addWeightedBlockstate(BYGBlocks.SYTHIAN_SPROUT.getDefaultState(), 50).addWeightedBlockstate(BYGBlocks.SYTHIAN_FUNGUS.getDefaultState(), 11));
        public static final BlockStateProvidingFeatureConfig IVIS_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(BYGBlocks.IVIS_ROOTS.getDefaultState(), 50).addWeightedBlockstate(BYGBlocks.IVIS_SPROUT.getDefaultState(), 50));
    }
}