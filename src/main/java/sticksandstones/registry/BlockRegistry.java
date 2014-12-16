package sticksandstones.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import sticksandstones.block.AxleBlock;

public class BlockRegistry
{
    public static AxleBlock axleBlock;

    public static void init()
    {
        axleBlock = new AxleBlock().setFriction(2);
        GameRegistry.registerBlock(axleBlock, "woodAxle");
    }
}
