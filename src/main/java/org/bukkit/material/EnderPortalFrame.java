package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.Material;

/**
 * Represents an EnderPortalFrame
 */
public class EnderPortalFrame extends MaterialData implements Directional {
    public EnderPortalFrame() {
        super(Material.ENDER_PORTAL_FRAME);
    }

    /**
     * @deprecated magic value
     */
    public EnderPortalFrame(int type) {
        super(type);
    }

    public EnderPortalFrame(Material type) {
        super(type);
    }

    /**
     * @deprecated magic value
     */
    public EnderPortalFrame(int type, byte data) {
        super(type, data);
    }

    /**
     * @deprecated magic value
     */
    public EnderPortalFrame(Material type, byte data) {
        super(type, data);
    }

    /**
     * Gets whether an EYE_OF_ENDER was placed in this block
     * @return true if an EYE_OF_ENDER was placed in this block, false otherwise
     */
    public boolean hasEye() {
        return getData() > 3;
    }

    /**
     * Sets whether an EYE_OF_ENDER was placed in this block
     * @param hasEye whether an EYE_OF_ENDER was placed in this block
     */
    public void setEye(boolean hasEye) {
        byte data = getData();
        if (hasEye)
            data |= 0x4;
        else
            data &= 0x3;
        setData(data);
    }

    @Override
    public void setFacingDirection(BlockFace face) {
        byte data = (byte) (getData() & 0x4);

        switch (face) {
        case SOUTH:
            data |= 0x0;
            break;
        case WEST:
            data |= 0x1;
            break;
        case NORTH:
            data |= 0x2;
            break;
        case EAST:
        default:
            data |= 0x3;
            break;
        }

        setData(data);
    }

    @Override
    public BlockFace getFacing() {
        switch (getData() & 0x3) {
        case 0:
            return BlockFace.SOUTH;
        case 1:
            return BlockFace.WEST;
        case 2:
            return BlockFace.NORTH;
        case 3:
            return BlockFace.EAST;
        }

        return null;
    }

    @Override
    public EnderPortalFrame clone() {
        return (EnderPortalFrame) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + " with" + (hasEye() ? "" : "out") + " eye of ender facing " + getFacing();
    }
}
