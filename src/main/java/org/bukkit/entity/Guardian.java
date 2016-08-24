package org.bukkit.entity;

/**
 * Represents a Guardian.
 */
public interface Guardian extends Monster, WaterMob {

    /**
     * Returns true if this guardian is an Elder. Elders have more health
     * and attack damage.
     *
     * @return true if this guardian is an Elder
     */
    public boolean isElder();

    /**
     * Sets the guardian to be an elder or not.
     *
     * @param isElder Whether the guardian is an elder or not
     */
    public void setElder(boolean isElder);

}
