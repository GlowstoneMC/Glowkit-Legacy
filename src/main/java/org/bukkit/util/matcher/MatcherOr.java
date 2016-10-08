package org.bukkit.util.matcher;

/**
 * Simple matcher returning true when one of the given matcher returns true.
 *
 * @param <T> the type of the object that can be matched
 */
public class MatcherOr<T> implements Matcher<T> {
    private final Matcher<T>[] elements;

    public MatcherOr(Matcher<T>... elements) {
        this.elements = elements;
    }

    @Override
    public boolean matches(T object) {
        for (Matcher<T> element : elements)
            if (element.matches(object))
                return true;

        return false;
    }
}
