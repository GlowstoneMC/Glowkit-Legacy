package org.bukkit.entity;

/**
 * Represents an arrow.
 */
public interface Arrow extends Projectile {
    /**
     * Represents different behaviours a player can encounter when trying 
     * to pick up an arrow entity.
     */
    public enum PickupBehavior {
        /**
         * Arrow can always be picked up
         */
        ALL,
        /**
         * Arrow can be picked up by a player in creative mode
         */
        CREATIVE,
        /**
         * Arrow can never be picked up
         */
        NONE
    }

    /**
     * Gets the knockback strength for an arrow, which is the
     * {@link org.bukkit.enchantments.Enchantment#KNOCKBACK KnockBack} level
     * of the bow that shot it.
     *
     * @return the knockback strength value
     */
    public int getKnockbackStrength();

    /**
     * Sets the knockback strength for an arrow.
     *
     * @param knockbackStrength the knockback strength value
     */
    public void setKnockbackStrength(int knockbackStrength);

    /**
     * Gets whether this arrow is critical.
     * <p>
     * Critical arrows have increased damage and cause particle effects.
     * <p>
     * Critical arrows generally occur when a player fully draws a bow before
     * firing.
     *
     * @return true if it is critical
     */
    public boolean isCritical();

    /**
     * Sets whether or not this arrow should be critical.
     *
     * @param critical whether or not it should be critical
     */
    public void setCritical(boolean critical);

    /**
     * Gets the behaviour this arrow will exert when attempted to be picked
     * up by a player.
     *
     * @return the behaviour exerted upon pickup
     */
    public PickupBehavior getPickup();

    /**
     * Sets the behaviour this arrow will exert when picked up by a player.
     *
     * @param pickup the new pickup behaviour
     */
    public void setPickup(PickupBehavior pickup);
}
