package sticksandstones.registry;

import net.minecraft.item.ItemStack;
import sticksandstones.block.AxleBlock;

public class BlockRegistry
{
    public static AxleBlock axleBlock;
    public static ItemStack axleBlockStack;

    public static void init()
    {
        axleBlock = new AxleBlock().setFriction(2);
        axleBlockStack = new ItemStack(axleBlock);
    }
}
