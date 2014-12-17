package sticksandstones.registry;

import net.minecraftforge.fml.common.registry.GameRegistry;
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
