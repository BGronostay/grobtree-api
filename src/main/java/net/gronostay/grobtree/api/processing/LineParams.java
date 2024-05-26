package net.gronostay.grobtree.api.processing;

/**
 * Information about the part covered by the regex to distinguish the lines.
 */
public interface LineParams {
    /**
     * The length of the part described by the regex.
     *
     * @return The length.
     */
    int getLength();
}
