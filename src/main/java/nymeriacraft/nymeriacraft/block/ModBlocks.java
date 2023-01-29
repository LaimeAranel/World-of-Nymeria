package nymeriacraft.nymeriacraft.block;

import net.minecraft.world.level.block.Block;
import nymeriacraft.nymeriacraft.block.custom.ModFlammableRotatedPillarBlock;
import nymeriacraft.nymeriacraft.item.ModCreativeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import nymeriacraft.nymeriacraft.*;
import nymeriacraft.nymeriacraft.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import nymeriacraft.nymeriacraft.world.feature.tree.DaylightTreeGrower;
import nymeriacraft.nymeriacraft.world.feature.tree.AscendriaTreeGrower;
import nymeriacraft.nymeriacraft.world.feature.tree.MidnightTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        nymeriacraft.MODID);

        public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> ASCENDRIAWOOD_LOG = registerBlock("ascendriawood_log",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_WOOD = registerBlock("ascendriawood_wood",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_PLANKS = registerBlock("ascendriawood_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                                        .requiresCorrectToolForDrops()) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 5;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 20;
                                }
                        }, ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_BUTTON = registerBlock("ascendriawood_button",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_FENCE_GATE = registerBlock("ascendriawood_fence_gate",
                        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_FENCE = registerBlock("ascendriawood_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_PRESSUREPLATE = registerBlock(
                        "ascendriawood_pressure_plate",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_SLAB = registerBlock("ascendriawood_slab",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIAWOOD_STAIRS = registerBlock("ascendriawood_stairs",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> DAYTIMEBUTTON = registerBlock("daytimewood_button",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                                        .strength(6f),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> DAYTIMEWOOD_LOG = registerBlock("daytimewood_log",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_WOOD = registerBlock("daytimewood_wood",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_PLANKS = registerBlock("daytimewood_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                                        .requiresCorrectToolForDrops()) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 5;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 20;
                                }
                        }, ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_FENCE_GATE = registerBlock("daytimewood_fence_gate",
                        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_FENCE = registerBlock("daytimewood_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_PRESSUREPLATE = registerBlock(
                        "daytimewood_pressure_plate",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_SLAB = registerBlock("daytimewood_slab",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIMEWOOD_STAIRS = registerBlock("daytimewood_stairs",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIME_LEAVES = registerBlock("daytimewood_leaves",
                        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                                        .requiresCorrectToolForDrops()) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 30;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 60;
                                }
                        }, ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ASCENDRIA_LEAVES = registerBlock("ascendriawood_leaves",
                        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                                        .requiresCorrectToolForDrops()) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 30;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 60;
                                }
                        }, ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> LITHIUM_ORE = registerBlock("lithium_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> FARFEY_BLOCK = registerBlock("farfey_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> FARFEY_ORE = registerBlock("farfey_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MAGIC_DUST_BLOCK = registerBlock("magic_dust_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MAGIC_DUST_ORE = registerBlock("magic_dust_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> MIDNIGHTWOOD_LOG = registerBlock("midnightwood_log",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_WOOD = registerBlock("midnightwood_wood",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_PLANKS = registerBlock("midnightwood_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                                        .requiresCorrectToolForDrops()) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 5;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 20;
                                }
                        }, ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_BUTTON = registerBlock("midnightwood_button",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_FENCE_GATE = registerBlock("midnightwood_fence_gate",
                        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_FENCE = registerBlock("midnightwood_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_PRESSUREPLATE = registerBlock(
                        "midnightwood_pressure_plate",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_SLAB = registerBlock("midnightwood_slab",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_STAIRS = registerBlock("midnightwood_stairs",
                        () -> new PressurePlateBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                                        .requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHTWOOD_LEAVES = registerBlock("midnightwood_leaves",
                        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                                        .requiresCorrectToolForDrops()) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 30;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 60;
                                }
                        }, ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> REGIRAS_BLOCK = registerBlock("regiras_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> REGIRAS_ORE = registerBlock("regiras_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> ZURITE_BLOCK = registerBlock("zurite_block",
                        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops()),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> ZURITE_ORE = registerBlock("zurite_ore",
                        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                                        .strength(6f).requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        public static final RegistryObject<Block> ASCENDRIA_SAPLING = registerBlock("ascendriawood_sapling",
                        () -> new SaplingBlock(new AscendriaTreeGrower(),
                                        BlockBehaviour.Properties.copy(Blocks.JUNGLE_SAPLING)),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> DAYTIME_SAPLING = registerBlock("daytimewood_sapling",
                        () -> new SaplingBlock(new DaylightTreeGrower(),
                                        BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
                        ModCreativeTab.NYMERIACRAFT_TAP);
        public static final RegistryObject<Block> MIDNIGHT_SAPLING = registerBlock("midnightwood_sapling",
                        () -> new SaplingBlock(new MidnightTreeGrower(),
                                        BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
                        ModCreativeTab.NYMERIACRAFT_TAP);

        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                        CreativeModeTab tab) {
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn, tab);
                return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                        CreativeModeTab tab) {
                return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        }

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}
