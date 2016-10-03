package org.bukkit.entity;

/**
 * Represents a Guardian.
 */
public interface Guardian extends Monster, WaterMob {

    /**
     *
     *
     * @return true if this guardian is an Elder
     */
    public boolean isElder();

    /**
     * Sets the guardian to be an elder or not.
     *
     */
    public void setElder(boolean isElder);

}
