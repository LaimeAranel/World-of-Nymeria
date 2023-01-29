package nymeriacraft.nymeriacraft.item;

import nymeriacraft.nymeriacraft.nymeriacraft;
import nymeriacraft.nymeriacraft.armor.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        nymeriacraft.MODID);

        public static final RegistryObject<Item> TAMINGSTONE = ITEMS.register("tamingstone",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> BRONZECOIN = ITEMS.register("bronze_coin",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> GOLDCOIN = ITEMS.register("gold_coin",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> SILBERCOIN = ITEMS.register("silber_coin",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> REGIRAS_INGOT = ITEMS.register("regiras_ingot",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> FIBER = ITEMS.register("fiber",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> FARFEYDUST = ITEMS.register("farfey_dust",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> MAGICDUST = ITEMS.register("magicdust",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16)));
        public static final RegistryObject<Item> MAGICDUST_DUST = ITEMS.register("magic_dust_dust",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16)));
        public static final RegistryObject<Item> ZURITE = ITEMS.register("zurite",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
        public static final RegistryObject<Item> SNAIL = ITEMS.register("snail",
                        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16)));

        public static final RegistryObject<Item> AMETHYSTSWORD = ITEMS.register("amethysttools_sword",
                        () -> new SwordItem(Tiers.IRON, 2, 0,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> AMETHYSTPICKAXE = ITEMS.register("amethysttools_pickaxe",
                        () -> new PickaxeItem(Tiers.IRON, 0, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> AMETHYSTAXE = ITEMS.register("amethysttools_axe",
                        () -> new AxeItem(Tiers.IRON, 3, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> AMETHYSTHOE = ITEMS.register("amethysttools_hoe",
                        () -> new HoeItem(Tiers.IRON, 0, 0.0F,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> COBALTSWORD = ITEMS.register("cobalttools_sword",
                        () -> new SwordItem(Tiers.STONE, 2, 0,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> COBALTPICKAXE = ITEMS.register("cobalttools_pickaxe",
                        () -> new PickaxeItem(Tiers.STONE, 0, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> COBALTAXE = ITEMS.register("cobalttools_axe",
                        () -> new AxeItem(Tiers.STONE, 3, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> COBALTHOE = ITEMS.register("cobalttools_hoe",
                        () -> new HoeItem(Tiers.STONE, 0, 0.0F,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> FARFEYSWORD = ITEMS.register("farfey_sword",
                        () -> new SwordItem(Tiers.DIAMOND, 2, 0,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> FARFEYPICKAXE = ITEMS.register("farfey_pickaxe",
                        () -> new PickaxeItem(Tiers.DIAMOND, 0, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> FARFEYAXE = ITEMS.register("farfey_axe",
                        () -> new AxeItem(Tiers.DIAMOND, 3, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> FARFEYYHOE = ITEMS.register("farfey_hoe",
                        () -> new HoeItem(Tiers.DIAMOND, 0, 0.0F,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> ZURITESWORD = ITEMS.register("zurite_sword",
                        () -> new SwordItem(Tiers.DIAMOND, 2, 0,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> ZURITEPICKAXE = ITEMS.register("zurite_pickaxe",
                        () -> new PickaxeItem(Tiers.DIAMOND, 0, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> ZURITEAXE = ITEMS.register("zurite_axe",
                        () -> new AxeItem(Tiers.DIAMOND, 3, 0f,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        public static final RegistryObject<Item> ZURITEHOE = ITEMS.register("zurite_hoe",
                        () -> new HoeItem(Tiers.DIAMOND, 0, 0.0F,
                                        new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

        public static final RegistryObject<Item> TAMINGSTONE_GLOVE = ITEMS.register("tamingstone_glove",
                        () -> new ArmorItem(ModArmorMaterials.TAMINGSTONE, EquipmentSlot.CHEST,
                                        new Item.Properties().tab(ModCreativeTab.NYMERIACRAFT_TAP).stacksTo(1)));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
