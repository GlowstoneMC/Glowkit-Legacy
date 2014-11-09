package org.bukkit;

/**
 * An enum to specify a rotation based orientation, like that on a clock.
 * <p>
 * It represents how something is viewed, as opposed to cardinal directions.
 */
@Deprecated
public enum Rotation {

    /**
     * No rotation
     */
    NONE(0),
    /**
     * Rotated clockwise by 90 degrees
     */
    CLOCKWISE(90),
    /**
     * Flipped upside-down, a 180 degree rotation
     */
    FLIPPED(180),
    /**
     * Rotated counter-clockwise by 90 degrees
     */
    COUNTER_CLOCKWISE(270),
    ;

    private double rotation;

    private Rotation(double rotation) {
        this.rotation = rotation;
    }

    public double getRotation() {
        return rotation;
    }

    private static final Rotation [] rotations = values();

    /**
     * Rotate clockwise by 90 degrees.
     *
     * @return the relative rotation
     */
    public Rotation rotateClockwise() {
        return rotations[(this.ordinal() + 1) & 0x3];
    }

    /**
     * Rotate counter-clockwise by 90 degrees.
     *
     * @return the relative rotation
     */
    public Rotation rotateCounterClockwise() {
        return rotations[(this.ordinal() - 1) & 0x3];
    }
}
