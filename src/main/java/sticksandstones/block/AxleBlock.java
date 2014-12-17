package sticksandstones.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import sticksandstones.rotation.IAxle;
import sticksandstones.tileentity.AxleTileEntity;

public class AxleBlock extends Block implements IAxle, ITileEntityProvider
{
    public float friction; // zero and below will result in no friction, ten and up is no movement

    public AxleBlock()
    {
        super(Material.piston);
        this.setUnlocalizedName("woodAxle");
        this.friction = 1F;
    }

    public AxleBlock setFriction(float friction)
    {
        this.friction = friction > 0 ? friction : 0;
        return this;
    }

    @Override
    public float getFriction()
    {
        return this.friction;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new AxleTileEntity(this);
    }
}
