package nymeriacraft.nymeriacraft.world.feature;

import nymeriacraft.nymeriacraft.nymeriacraft;
import nymeriacraft.nymeriacraft.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;
import com.google.common.base.Suppliers;

import java.util.List;

public class ModConfiguredFeatures {

        public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister
                        .create(Registry.CONFIGURED_FEATURE_REGISTRY, nymeriacraft.MODID);

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_COBALT_ORE = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                                        ModBlocks.COBALT_ORE.get().defaultBlockState()),
                                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                                        ModBlocks.COBALT_ORE.get().defaultBlockState())));
        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_FARFEY_ORE = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                                        ModBlocks.FARFEY_ORE.get().defaultBlockState()),
                                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                                        ModBlocks.FARFEY_ORE.get().defaultBlockState())));
        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LITHIUM_ORE = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                                        ModBlocks.LITHIUM_ORE.get().defaultBlockState()),
                                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                                        ModBlocks.LITHIUM_ORE.get().defaultBlockState())));
        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_AMETHYST_ORE = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                                        ModBlocks.AMETHYST_ORE.get().defaultBlockState()),
                                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                                        ModBlocks.AMETHYST_ORE.get().defaultBlockState())));
        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MAGIC_ORE = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                                        ModBlocks.MAGIC_DUST_ORE.get().defaultBlockState()),
                                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                                        ModBlocks.MAGIC_DUST_ORE.get().defaultBlockState())));

        public static final RegistryObject<ConfiguredFeature<?, ?>> ZIRCON_ORE = CONFIGURED_FEATURES.register(
                        "cobalt_ore",
                        () -> new ConfiguredFeature<>(Feature.ORE,
                                        new OreConfiguration(OVERWORLD_COBALT_ORE.get(), 7)));
        public static final RegistryObject<ConfiguredFeature<?, ?>> FARFEY_ORE = CONFIGURED_FEATURES.register(
                        "farfey_ore",
                        () -> new ConfiguredFeature<>(Feature.ORE,
                                        new OreConfiguration(OVERWORLD_COBALT_ORE.get(), 7)));
        public static final RegistryObject<ConfiguredFeature<?, ?>> LITHIUM_ORE = CONFIGURED_FEATURES.register(
                        "lithium_ore",
                        () -> new ConfiguredFeature<>(Feature.ORE,
                                        new OreConfiguration(OVERWORLD_COBALT_ORE.get(), 7)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> ASCENDRIA = CONFIGURED_FEATURES.register(
                        "ascendria",
                        () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                                        BlockStateProvider.simple(ModBlocks.ASCENDRIAWOOD_LOG.get()),
                                        new StraightTrunkPlacer(5, 6, 3),
                                        BlockStateProvider.simple(ModBlocks.ASCENDRIA_LEAVES.get()),
                                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                                        new TwoLayersFeatureSize(1, 0, 2)).build()));

        public static final RegistryObject<ConfiguredFeature<?, ?>> DAYTIME = CONFIGURED_FEATURES.register("daytime",
                        () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                                        BlockStateProvider.simple(ModBlocks.DAYTIMEWOOD_LOG.get()),
                                        new StraightTrunkPlacer(5, 6, 3),
                                        BlockStateProvider.simple(ModBlocks.DAYTIME_LEAVES.get()),
                                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                                        new TwoLayersFeatureSize(1, 0, 2)).build()));

        public static final RegistryObject<ConfiguredFeature<?, ?>> MIDNIGHT = CONFIGURED_FEATURES.register("midnight",
                        () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                                        BlockStateProvider.simple(ModBlocks.MIDNIGHTWOOD_LOG.get()),
                                        new StraightTrunkPlacer(5, 6, 3),
                                        BlockStateProvider.simple(ModBlocks.MIDNIGHTWOOD_LEAVES.get()),
                                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                                        new TwoLayersFeatureSize(1, 0, 2)).build()));

        public static final RegistryObject<ConfiguredFeature<?, ?>> ASCENDRIA_SPAWN = CONFIGURED_FEATURES
                        .register("ascendria_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                                                        ModPlacedFeatures.ASCENDRIA_CHECKED.getHolder().get(),
                                                        0.5F)),
                                                        ModPlacedFeatures.ASCENDRIA_CHECKED.getHolder().get())));

        public static final RegistryObject<ConfiguredFeature<?, ?>> MIDNIGHT_SPAWN = CONFIGURED_FEATURES
                        .register("midnight_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                                                        ModPlacedFeatures.MIDNIGHT_CHECKED.getHolder().get(),
                                                        0.5F)), ModPlacedFeatures.MIDNIGHT_CHECKED.getHolder().get())));

        public static final RegistryObject<ConfiguredFeature<?, ?>> DAYTIME_SPAWN = CONFIGURED_FEATURES
                        .register("daytime_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                                                        ModPlacedFeatures.DAYTIME_CHECKED.getHolder().get(),
                                                        0.5F)), ModPlacedFeatures.DAYTIME_CHECKED.getHolder().get())));

        public static void register(IEventBus eventBus) {
                CONFIGURED_FEATURES.register(eventBus);
        }
}