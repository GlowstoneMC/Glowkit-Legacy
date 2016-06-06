package org.bukkit.entity;

/**
 * An iron Golem that protects Villages.
 */
public interface IronGolem extends Golem {

    /**
     * Gets whether this iron golem was built by a player.
     *
     * @return Whether this iron golem was built by a player
     */
    public boolean isPlayerCreated();

    /**
     * Sets whether this iron golem was built by a player or not.
     *
     * @param playerCreated true if you want to set the iron golem as being
     *     player created, false if you want it to be a natural village golem.
     */
    public void setPlayerCreated(boolean playerCreated);

    /**
     * Gets whether this iron golem holds flower.
     *
     * @return Whether this iron golem holds flower.
     */
    public boolean isHoldingFlower();

    /**
     * Sets whether this iron golem holds flower or not. The flower will
     * remain in the entity's hand for a limited time.
     *
     * @param holdingFlower true for holding a flower, false otherwise
     */
    public void setHoldingFlower(boolean holdingFlower);
}
