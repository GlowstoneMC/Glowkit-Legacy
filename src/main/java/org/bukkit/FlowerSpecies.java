package org.bukkit;

import java.util.Map;

import org.bukkit.material.MaterialData;

import com.google.common.collect.Maps;

/**
 * Represents the ten different species of flowers.
 */
public enum FlowerSpecies {
    /**
     * Represents the dandelion flower.
     */
    DANDELION(Material.YELLOW_FLOWER, 0x0),
    /**
     * Represents the poppy flower.
     */
    POPPY(Material.RED_ROSE, 0x0),
    /**
     * Represents the blue orchid.
     */
    BLUE_ORCHID(Material.RED_ROSE, 0x1),
    /**
     * Represents the allium flower.
     */
    ALLIUM(Material.RED_ROSE, 0x2),
    /**
     * Represents the houstonia flower.
     */
    HOUSTONIA(Material.RED_ROSE, 0x3),
    /**
     * Represents the red tulip.
     */
    TULIP_RED(Material.RED_ROSE, 0x4),
    /**
     * Represents the orange tulip.
     */
    TULIP_ORANGE(Material.RED_ROSE, 0x5),
    /**
     * Represents the white tulip.
     */
    TULIP_WHITE(Material.RED_ROSE, 0x6),
    /**
     * Represents the pink tulip.
     */
    TULIP_PINK(Material.RED_ROSE, 0x7),
    /**
     * Represents the oxeye daisy flower.
     */
    OXEYE_DAISY(Material.RED_ROSE, 0x8);

    private final MaterialData data;
    private final static Map<MaterialData, FlowerSpecies> BY_DATA = Maps.newHashMap();

    private FlowerSpecies(final Material type, final int data) {
        this.data = new MaterialData(type);
        this.data.setData((byte) data);
    }

    /**
     * Gets the associated type representing this species.
     *
     * @return Material value of this flower species
     */
    public Material getType() {
        return data.getItemType();
    }

    /**
     * Gets the associated data value representing this species.
     *
     * @return A byte containing the data value of this flower species
     * @deprecated Magic value
     */
    @Deprecated
    public byte getData() {
        return data.getData();
    }

    /**
     * Gets the FlowerSpecies with the given data value.
     *
     * @param data The data value to fetch
     * @return The {@link FlowerSpecies} representing the given value, or null
     *     if it doesn't exist
     */
    public static FlowerSpecies getByData(final MaterialData data) {
        return BY_DATA.get(data);
    }

    static {
        for (FlowerSpecies flowerSpecies : values()) {
            BY_DATA.put(flowerSpecies.data, flowerSpecies);
        }
    }
}
