package nymeriacraft.nymeriacraft.world.feature;

import nymeriacraft.nymeriacraft.world.feature.ModConfiguredFeatures;
import nymeriacraft.nymeriacraft.nymeriacraft;
import nymeriacraft.nymeriacraft.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
        public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister
                        .create(Registry.PLACED_FEATURE_REGISTRY, nymeriacraft.MODID);

        public static final RegistryObject<PlacedFeature> ZIRCON_ORE_PLACED = PLACED_FEATURES.register(
                        "zircon_ore_placed",
                        () -> new PlacedFeature(ModConfiguredFeatures.ZIRCON_ORE.getHolder().get(),
                                        commonOrePlacement(7, // VeinsPerChunk
                                                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                                                        VerticalAnchor.aboveBottom(80)))));

        public static final RegistryObject<PlacedFeature> ASCENDRIA_CHECKED = PLACED_FEATURES.register(
                        "ascendria_checked",
                        () -> new PlacedFeature(ModConfiguredFeatures.ASCENDRIA.getHolder().get(),
                                        List.of(PlacementUtils
                                                        .filteredByBlockSurvival(ModBlocks.ASCENDRIA_SAPLING.get()))));

        public static final RegistryObject<PlacedFeature> ASCENDRIA_PLACED = PLACED_FEATURES.register(
                        "ascendria_placed",
                        () -> new PlacedFeature(ModConfiguredFeatures.ASCENDRIA_SPAWN.getHolder().get(),
                                        VegetationPlacements.treePlacement(
                                                        PlacementUtils.countExtra(3, 0.1f, 2))));

        public static final RegistryObject<PlacedFeature> DAYTIME_CHECKED = PLACED_FEATURES.register("daytime_checked",
                        () -> new PlacedFeature(ModConfiguredFeatures.DAYTIME.getHolder().get(),
                                        List.of(PlacementUtils
                                                        .filteredByBlockSurvival(ModBlocks.DAYTIME_SAPLING.get()))));

        public static final RegistryObject<PlacedFeature> DAYTIME_PLACED = PLACED_FEATURES.register("daytime_placed",
                        () -> new PlacedFeature(ModConfiguredFeatures.DAYTIME_SPAWN.getHolder().get(),
                                        VegetationPlacements.treePlacement(
                                                        PlacementUtils.countExtra(3, 0.1f, 2))));

        public static final RegistryObject<PlacedFeature> MIDNIGHT_CHECKED = PLACED_FEATURES.register(
                        "midnight_checked",
                        () -> new PlacedFeature(ModConfiguredFeatures.MIDNIGHT.getHolder().get(),
                                        List.of(PlacementUtils
                                                        .filteredByBlockSurvival(ModBlocks.MIDNIGHT_SAPLING.get()))));

        public static final RegistryObject<PlacedFeature> MIDNIGHT_PLACED = PLACED_FEATURES.register("midnight_placed",
                        () -> new PlacedFeature(ModConfiguredFeatures.MIDNIGHT_SPAWN.getHolder().get(),
                                        VegetationPlacements.treePlacement(
                                                        PlacementUtils.countExtra(3, 0.1f, 2))));

        public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
                return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
        }

        public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
                return orePlacement(CountPlacement.of(p_195344_), p_195345_);
        }

        public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
                return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
        }

        public static void register(IEventBus eventBus) {
                PLACED_FEATURES.register(eventBus);
        }
}
