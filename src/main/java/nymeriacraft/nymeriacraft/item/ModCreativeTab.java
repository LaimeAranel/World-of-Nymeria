package nymeriacraft.nymeriacraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab extends CreativeModeTab {
    private ModCreativeTab(int index, String label) {
        super(index, label);
    }

  
    public static final CreativeModeTab NYMERIACRAFT_TAP = new CreativeModeTab("allgemein") {
        
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TAMINGSTONE_GLOVE.get());
        }
        
    };
    @Override
    public ItemStack makeIcon() {
        
        return null;
    }
}
