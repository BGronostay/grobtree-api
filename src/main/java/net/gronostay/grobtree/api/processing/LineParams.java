package net.gronostay.grobtree.api.processing;

/**
 * Information about the part covered by the regex to distinguish the lines.
 */
public interface LineParams {
    /**
     * Get the position of the first char of interest. Often the first char after the recurring part (timestamp/level).
     *
     * @return The position.
     */
    int getStartPos();
}
