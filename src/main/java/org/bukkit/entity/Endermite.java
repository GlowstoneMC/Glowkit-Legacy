package org.bukkit.entity;

/**
 * Represents a Endermite.
 */
public interface Endermite extends Monster {

    /**
     * Represents the lifetime in ticks of the Endermite. Should disappear after 2400 ticks.
     * @return the lifetime of the Endermite in ticks.
     */
    public int getLifetime();
}
