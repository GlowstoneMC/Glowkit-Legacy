package org.bukkit.entity;

/**
 * Represents an Endermite
 */
public interface Endermite extends Monster {
    /**
     * Represents the lifetime in ticks of the Endermite. Should disappear after 2400 ticks.
     * @return the lifetime of the Endermite in ticks.
     */
    public int getLifetime();
}
