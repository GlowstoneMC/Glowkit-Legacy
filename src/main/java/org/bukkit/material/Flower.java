package org.bukkit.material;

import org.bukkit.FlowerSpecies;
import org.bukkit.Material;

/**
 * Represents the different types of flowers.
 */
public class Flower extends MaterialData {

    public Flower() {
        this(Material.RED_ROSE);
    }

    public Flower(FlowerSpecies species) {
        this(species.getType());
        setData(species.getData());
    }

    /**
     * @deprecated Magic value
     */
    @Deprecated
    public Flower(final int type) {
        super(type);
    }

    public Flower(final Material type) {
        super(type);
    }

    /**
     * @deprecated Magic value
     */
    @Deprecated
    public Flower(final int type, final byte data) {
        super(type, data);
    }

    /**
     * @deprecated Magic value
     */
    @Deprecated
    public Flower(final Material type, final byte data) {
        super(type, data);
    }

    /**
     * Gets the current species of this flower.
     *
     * @return The FlowerSpecies of this flower
     */
    public FlowerSpecies getSpecies() {
        return FlowerSpecies.getByData(this);
    }

    /**
     * Sets the species of this flower.
     *
     * @param species The new species of this flower
     */
    public void setSpecies(FlowerSpecies species) {
        if (FlowerSpecies.getByData(this).getType() == species.getType()) {
            setData(species.getData());
        }
    }

    @Override
    public String toString() {
        return getSpecies() + " " + super.toString();
    }

    @Override
    public Flower clone() {
        return (Flower) super.clone();
    }
}
