package org.bukkit.inventory.meta;

import org.bukkit.BannerPattern;
import org.bukkit.DyeColor;

/**
 * Represents a banner item.
 */
public interface BannerMeta extends ItemMeta {

    /**
     * Sets the base color of the banner.
     * @param color Base color
     * @throws IllegalArgumentException If color is null
     */
    public void setBase(DyeColor color) throws IllegalArgumentException;

    /**
     * Get the base color of the banner.
     * @return Base color
     */
    public DyeColor getBase();

    /**
     * Sets the pattern of the banner. The old pattern is removed completely.
     * @param pattern Pattern to change to
     * @throws IllegalArgumentException If pattern is null
     */
    public void setPattern(BannerPattern pattern) throws IllegalArgumentException;

    /**
     * Gets the banner's pattern.
     * @return Pattern currently on this banner
     */
    public BannerPattern getPattern();

}
