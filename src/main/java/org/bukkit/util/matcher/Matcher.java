package org.bukkit.util.matcher;

/**
 * A matcher checks whether an object matches the group(s), properties, etc. defined by this matcher.
 *
 * @param <T> the type of the object that can be matched against this Matcher
 */
public interface Matcher<T> {
    /**
     * Checks whether the given object matches thee group(s), properties, etc. defined by this matcher.
     *
     * @param object the object to check
     * @return true if it matches, false otherwise
     */
    public boolean matches(T object);
}
