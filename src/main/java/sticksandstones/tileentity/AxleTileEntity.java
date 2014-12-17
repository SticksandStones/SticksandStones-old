package sticksandstones.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import sticksandstones.rotation.IAxle;

public class AxleTileEntity extends TileEntity implements IUpdatePlayerListBox
{
    private IAxle axle;
    private float speed;

    public AxleTileEntity(IAxle axle)
    {
        this.axle = axle;
        this.speed = 0;
    }

    @Override
    public void update()
    {
        if (speed > 0)
        {
            float friction = 1 - axle.getFriction() / 10;
            speed *= friction > 0 ? friction : 0;
        }

        if (speed < 1)
            speed = 0;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);
        nbtTagCompound.setFloat("Speed", this.speed);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);
        this.speed = nbtTagCompound.getFloat("Speed");
    }
}
