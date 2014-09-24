package org.bukkit.scoreboard;

/**
 * Nametag visiblity for {@link Team}s
 *
 * @since 1.8
 */
public enum NametagVisibility {

    ALWAYS("always"),

    NEVER("never"),

    HIDE_FOR_OTHER_TEAMS("hideForOtherTeams"),

    HIDE_FOR_OWN_TEAM("hideForOwnTeam");


    private final String value;

    private NametagVisibility(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static NametagVisibility get(String value) {
        for (NametagVisibility n: values()) {
            if (n.value.equalsIgnoreCase(value)) {
                return n;
            }
        }
        return null;
    }
}
