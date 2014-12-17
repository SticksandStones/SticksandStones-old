package sticksandstones.registry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeRegistry
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockRegistry.axleBlock, "sss", "ppp", "sss", 's', "stickWood", 'p', "plankWood"));
    }
}
