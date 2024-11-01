package net.gronostay.grobtree.api.processing;

import java.awt.*;

public interface LogEntry {
    /**
     * The length of the part described by the regex.
     *
     * @return The length
     */
    int getStartPos();

    /**
     * The full text of this log entry.
     *
     * @return The text
     */
    String getText();

    /**
     * Get the configured color for this entry (e.g. for Level ERROR) or null if not found/configured
     *
     * @return the color or null
     */
    Color getConfiguredColor();
}
