package org.bukkit.scoreboard;

/**
 * Criteria names which trigger an objective to be modified by actions in-game
 */
public enum Criteria {
    HEALTH("health"),
    PLAYER_KILLS("playerKillCount"),
    TOTAL_KILLS("totalKillCount"),
    DEATHS("deathCount"),
    TRIGGER("trigger");

    private final String value;

    private Criteria(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Criteria get(String value) {
        for (Criteria c: values()) {
            if (c.value == value) {
                return c;
            }
        }
        return null;
    }
}
