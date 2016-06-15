package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.Material;

/**
 * Represents a hay block
 */
public class Hay extends MaterialData implements Directional {
    /**
     * @deprecated magic value
     */
    public Hay(int type) {
        super(type);
    }

    public Hay(Material type) {
        super(type);
    }

    /**
     * @deprecated magic value
     */
    public Hay(int type, byte data) {
        super(type, data);
    }

    /**
     * @deprecated magic value
     */
    public Hay(Material type, byte data) {
        super(type, data);
    }

    @Override
    public void setFacingDirection(BlockFace face) {
        switch (face) {
        case NORTH:
        case SOUTH:
            setData((byte) 8);
            break;
        case WEST:
        case EAST:
            setData((byte) 4);
            break;
        case UP:
        case DOWN:
            setData((byte) 0);
            break;
        }
    }

    @Override
    public BlockFace getFacing() {
        switch (getData()) {
        case 8:
            return BlockFace.NORTH;
        case 4:
            return BlockFace.EAST;
        case 0:
        default:
            return BlockFace.UP;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " facing " + getFacing();
    }

    @Override
    public Hay clone() {
        return (Hay) super.clone();
    }
}
