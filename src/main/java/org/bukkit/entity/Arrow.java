package org.bukkit.entity;

/**
 * Represents an arrow.
 */
public interface Arrow extends Projectile {
    /**
     * Represents the different behaviors a player can encounter when trying
     * to pickup an arrow entity.
     */
    public enum PickupBehavior {
        /**
         * Arrow can always be picked up
         */
        ALLLOW,
        /**
         * Arrow can be picked up by a player only in creative mode
         */
        CREATIVE_MODE,
        /**
         * Arrow can never be picked up
         */
        DENY
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
     * Gets the behavior this arrow will exert when attempted to be picked
     * up by a player.
     *
     * @return the behavior exerted upon pickup
     */
    public PickupBehavior getPickup();

    /**
     * Sets the behavior this arrow will extert when picked up by a player.
     *
     * @param pickup the new pickup behavior
     */
    public void setPickup(PickupBehavior pickup);
}
