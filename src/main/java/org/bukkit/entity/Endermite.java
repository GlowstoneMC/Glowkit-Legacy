package org.bukkit.entity;

/**
 * Represents an Endermite.
 */
public interface Endermite extends Monster {

    /**
     * Represents the lifetime in ticks of the Endermite. Endermites have expirable lifetimes.
     *
     * @return the lifetime of the Endermite in ticks.
     */
    public int getLifetime();
}
