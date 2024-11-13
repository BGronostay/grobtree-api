package net.gronostay.grobtree.api.storage;

import net.gronostay.grobtree.api.processing.LineParams;

import java.util.function.BiConsumer;

public interface Importer {
    /** Wether or not the LogProvider shall reverse the order of the generated messages.
     * @return True if the flag to be reversed is active.
     */
    boolean isReverse();

    /**
     * Can (additionally) be called to execute the transformations that were selected in the import dialog. The log in LogProviderListener::provide is already transformed (if selected).
     *
     * @param text The string to be transformed
     * @return the transformed string
     */
    String transform(String text);

    boolean fitsRegEx(String text);

    void splitWithRegEx(String text, BiConsumer<LineParams, String> foundLinesConsumer);
}
