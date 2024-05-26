package net.gronostay.grobtree.api.resources;

import java.awt.*;

/**
 * A color-enhanced String for captions in the tree.
 */
public interface ExString {
    /**
     * Create a new ExString. Static convenience-method.
     *
     * @return the new ExString.
     */
    static ExString create() {
        return ExStringFactory.getInstance().create();
    }

    /**
     * Create a new ExString from an existing String. Static convenience-method.
     *
     * @param text The text to be used.
     * @return the new ExString.
     */
    static ExString of(String text) {
        return create().append(text);
    }

    /**
     * Create a new ExString from an existing String and color. Static convenience-method.
     *
     * @param text  The text to be used.
     * @param color The color to be used.
     * @return the new ExString.
     */
    static ExString of(String text, Color color) {
        return create().append(text, color);
    }

    /**
     * Append a new part.
     *
     * @param c A char to be added.
     * @return the new ExString.
     */
    ExString append(char c);

    /**
     * Appaned a new part.
     *
     * @param c     A char to be added.
     * @param color The color to be used.
     * @return the new ExString.
     */
    ExString append(char c, Color color);

    /**
     * Appaned a new part.
     *
     * @param text A String to be added.
     * @return the new ExString.
     */

    ExString append(String text);

    /**
     * Appaned a new part.
     *
     * @param text  A String to be added.
     * @param color The color to be used.
     * @return the new ExString.
     */
    ExString append(String text, Color color);

    /**
     * Appaned a new part.
     *
     * @param exString An ExString to be added.
     * @return the new ExString.
     */
    ExString append(ExString exString);

    /**
     * Returns true if the ExString is empty (has no appended parts).
     *
     * @return true/false
     */
    boolean isEmpty();

    /**
     * Returns true if the String representation equals to the given object.
     *
     * @param object The object to be compared.
     * @return true/false
     */
    boolean equals(Object object);

    /**
     * Returns a String representation.
     *
     * @return the String.
     */
    String toString();
}
