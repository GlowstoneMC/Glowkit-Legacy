package org.bukkit.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a Rabbit.
 */
public interface Rabbit extends Animals {

    /**
     * Gets the type of rabbit.
     *
     * @return The type of rabbit
     */
    public RabbitType getRabbitType();

    /**
     * Sets the type of rabbit.
     *
     * @param type The type of rabbit
     */
    public void setRabbitType(RabbitType type);

    /*
    * Represents the various different Rabbit types.
    */
    public enum RabbitType {
        BROWN,
        WHITE,
        BLACK,
        BLACK_AND_WHITE,
        GOLD,
        SALT_PEPPER,
        KILLER
    }
}
