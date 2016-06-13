package org.bukkit.scoreboard;

/**
 * Possible nametag visibilities for {@link Team}s.
 */
public enum NametagVisibility {
    /**
     * Always show nametags for those on this team.
     */
    ALWAYS("always"),
    /**
     * Never show nametags for those on this team.
     */
    NEVER("never"),
    /**
     * Hide this team's nametags from other teams.
     */
    HIDE_FOR_OTHER_TEAMS("hideForOtherTeams"),
    /**
     * Hide this team's nametags from their own team.
     */
    HIDE_FOR_OWN_TEAM("hideForOwnTeam");

    private final String value;

    private NametagVisibility(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static NametagVisibility get(String value) {
        for (NametagVisibility n : values()) {
            if (n.value.equalsIgnoreCase(value)) {
                return n;
            }
        }
        return null;
    }
}
